package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Version
import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Endpoint {


    String resourceName = this.getClass().getSimpleName()

    @Column(unique = true)
    String endpointName = GC_EMPTY_STRING

    @ManyToOne(fetch = FetchType.EAGER)
    Version apiVersion = GC_NULL_OBJ_REF as Version

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
