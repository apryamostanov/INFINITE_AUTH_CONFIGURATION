package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING

@CompileStatic
@Entity
class Field {


    String resourceName = this.getClass().getSimpleName()

    @Column(unique = true)
    String fieldName = GC_EMPTY_STRING

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
