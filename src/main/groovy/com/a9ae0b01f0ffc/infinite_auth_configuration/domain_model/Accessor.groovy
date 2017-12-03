package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import static com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_4_const.*
import groovy.transform.CompileStatic

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne


@CompileStatic
@Entity
class Accessor {

    Integer lookupPriority = GC_NULL_OBJ_REF as Integer
    String accessorName = GC_EMPTY_STRING
    String platform = GC_EMPTY_STRING
    String appVersion = GC_EMPTY_STRING
    String language = GC_EMPTY_STRING
    String deviceData = GC_EMPTY_STRING
    String user = GC_EMPTY_STRING
    String FIID = GC_NULL_OBJ_REF as Integer
    String product = GC_NULL_OBJ_REF as Integer
    Integer is_forbidden = GC_NULL_OBJ_REF as Integer

    @ManyToOne(fetch = FetchType.EAGER)
    Endpoint endpoint = GC_NULL_OBJ_REF as Endpoint

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
