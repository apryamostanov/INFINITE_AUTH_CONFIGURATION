package com.a9ae0b01f0ffc.infinite_auth_configuration.base

import other.T_common_conf

import static base.T_common_base_3_utils.nvl_empty_map

class T_auth_conf extends T_common_conf {

    String GC_SQL_CONNECTION_STRING
    String GC_MYSQL_USERNAME
    String GC_MYSQL_PASSWORD
    String GC_MYSQL_DRIVER
    String GC_BLACK_BOX_CONFIG

    T_auth_conf(String i_conf_file_name) {
        super(i_conf_file_name)
    }

    @Override
    void refresh_config() {
        GC_SQL_CONNECTION_STRING = nvl_empty_map(get_conf().mysql_connection_string, GC_SQL_CONNECTION_STRING)
        GC_MYSQL_USERNAME = nvl_empty_map(get_conf().mysql_username, GC_MYSQL_USERNAME)
        GC_MYSQL_PASSWORD = nvl_empty_map(get_conf().mysql_password, GC_MYSQL_PASSWORD)
        GC_MYSQL_DRIVER = nvl_empty_map(get_conf().mysql_driver, GC_MYSQL_DRIVER)
        GC_BLACK_BOX_CONFIG = nvl_empty_map(get_conf().black_box_config, GC_BLACK_BOX_CONFIG)
    }
}
