package com.a9ae0b01f0ffc.infinite_auth_configuration.base

import groovy.sql.Sql

import javax.naming.InitialContext
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.persistence.Persistence
import javax.servlet.ServletContext
import javax.servlet.ServletContextEvent
import javax.servlet.ServletContextListener
import javax.transaction.UserTransaction

class T_auth_base_5_context extends T_auth_base_4_const implements ServletContextListener {

    private ServletContext p_servlet_context = GC_NULL_OBJ_REF as ServletContext
    private T_auth_conf p_app_config = GC_NULL_OBJ_REF as T_auth_conf
    private EntityManagerFactory p_entity_manager_factory = GC_NULL_OBJ_REF as EntityManagerFactory
    private EntityManager p_entity_manager = GC_NULL_OBJ_REF as EntityManager
    private UserTransaction p_user_transaction = GC_NULL_OBJ_REF as UserTransaction
    protected Sql p_sql = GC_NULL_OBJ_REF as Sql
    protected Long p_sql_last_init_time_millis = GC_NULL_OBJ_REF as Long

    void init_app_context(ServletContext i_servlet_context) {
        p_servlet_context = i_servlet_context
        p_servlet_context.setAttribute(GC_CONTEXT_VAR_NAME_CONFIG_FILE_NAME, new T_auth_base_5_context())
        p_app_config = new T_auth_conf(i_servlet_context.getInitParameter(GC_CONTEXT_VAR_NAME_CONFIG_FILE_NAME) as String)
        p_entity_manager_factory = Persistence.createEntityManagerFactory(GC_EMF_NAME)
        p_entity_manager = p_entity_manager_factory.createEntityManager()
        p_user_transaction = (UserTransaction) new InitialContext().lookup(GC_JNDI_PATH_USER_TRANSACTION)
        T_logging_base_5_context.init_custom(app_conf().GC_BLACK_BOX_CONFIG)
    }

    void init_sql() {
        T_logging_base_6_util.l().log_send_sql("Connecting")
        p_sql = Sql.newInstance(app_conf().GC_SQL_CONNECTION_STRING, app_conf().GC_MYSQL_USERNAME, app_conf().GC_MYSQL_PASSWORD, app_conf().GC_MYSQL_DRIVER)
        p_sql.getConnection().setAutoCommit(GC_FALSE)
        p_sql_last_init_time_millis = System.currentTimeMillis()
        T_logging_base_6_util.l().log_receive_sql("Connected")
    }

    EntityManager get_entity_manager() {
        return p_entity_manager
    }

    UserTransaction get_user_transaction() {
        return p_user_transaction
    }

    T_auth_conf app_conf() {
        return p_app_config
    }

    static T_auth_base_5_context get_app_context(ServletContext i_servlet_context) {
        return i_servlet_context.getAttribute(GC_AUTH_CONTEXT) as T_auth_base_5_context
    }

    @Override
    void contextInitialized(ServletContextEvent i_servlet_context_event) {
        init_app_context(i_servlet_context_event.getServletContext())
    }

    @Override
    void contextDestroyed(ServletContextEvent sce) {
        p_entity_manager_factory.close()
    }
}
