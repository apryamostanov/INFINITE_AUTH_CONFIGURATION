package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Version {

    String minorVersion = GC_EMPTY_STRING

    @ManyToOne(fetch = FetchType.EAGER)
    MajorVersion majorVersion = GC_NULL_OBJ_REF as MajorVersion

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
