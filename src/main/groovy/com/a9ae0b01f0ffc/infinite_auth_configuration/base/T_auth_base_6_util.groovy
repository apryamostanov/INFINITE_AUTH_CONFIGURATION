package com.a9ae0b01f0ffc.infinite_auth_configuration.base

import base.T_logging_base_5_context

class T_auth_base_6_util extends T_logging_base_5_context {

    static void persist(Object l_object) {
        get_user_transaction().setTransactionTimeout(300)
        get_user_transaction().begin()
        get_entity_manager().persist(l_object)
        get_entity_manager().flush()
        get_entity_manager().joinTransaction()
        get_user_transaction().commit()
    }

}
