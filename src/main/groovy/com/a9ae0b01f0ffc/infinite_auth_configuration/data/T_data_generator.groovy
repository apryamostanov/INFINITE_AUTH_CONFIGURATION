package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class T_data_generator {

    @Autowired
    private I_resource_repository p_resource_repository
    @Autowired
    private I_accessor_repository p_accessor_repository
    @Autowired
    private I_authentication_repository p_authentication_repository
    @Autowired
    private I_data_field_repository p_data_field_repository
    @Autowired
    private I_endpoint_repository p_endpoint_repository
    @Autowired
    private I_method_repository p_method_repository
    @Autowired
    private I_scope_repository p_scope_repository
    @Autowired
    private I_version_repository p_version_repository
    @Autowired
    private I_grant_repository p_grant_repository
    @Autowired
    private I_url_repository p_url_repository
    @Autowired
    private I_authorization_repository p_authorization_repository

    @Autowired
    G01_RestResourceGenerator p_RestResourceGenerator
    @Autowired
    G02_VersionGenerator p_VersionGenerator
    @Autowired
    G03_EndpointGenerator p_EndpointGenerator
    @Autowired
    G04_AccessorGenerator p_AccessorGenerator
    @Autowired
    G05_MethodGenerator p_MethodGenerator
    @Autowired
    G06_DataFieldGenerator p_DataFieldGenerator
    @Autowired
    G07_UrlGenerator p_UrlGenerator
    @Autowired
    G08_GrantGenerator p_GrantGenerator
    @Autowired
    G09_ScopeGenerator p_ScopeGenerator
    @Autowired
    G10_AuthenticationGenerator p_AuthenticationGenerator
    @Autowired
    G12_AuthorizationGenerator p_AuthorizationGenerator

    void generate_data() {
        p_RestResourceGenerator.generate_data(p_resource_repository)
        p_VersionGenerator.generate_data(p_version_repository, p_resource_repository)
        p_EndpointGenerator.generate_data(p_endpoint_repository, p_version_repository)
        p_AccessorGenerator.generate_data(p_accessor_repository, p_endpoint_repository, p_version_repository)
        p_MethodGenerator.generate_data(p_method_repository)
        p_DataFieldGenerator.generate_data(p_data_field_repository)
        p_UrlGenerator.generate_data(p_url_repository)
        p_GrantGenerator.generate_data(p_grant_repository, p_resource_repository, p_method_repository, p_data_field_repository, p_url_repository)
        p_ScopeGenerator.generate_data(p_scope_repository, p_grant_repository, p_accessor_repository, p_resource_repository)
        p_AuthenticationGenerator.generate_data(p_authentication_repository, p_data_field_repository)
        p_AuthorizationGenerator.generate_data(p_authorization_repository, p_scope_repository, p_authentication_repository, p_accessor_repository)
    }

}
