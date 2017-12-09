package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Rule {

    @ManyToOne(fetch = FetchType.EAGER)
    @OrderColumn
    Accessor accessor = GC_NULL_OBJ_REF as Accessor

    @ManyToOne(fetch = FetchType.EAGER)
    Authorization authorization = GC_NULL_OBJ_REF as Authorization

    @ManyToOne(fetch = FetchType.EAGER)
    Identity identity = GC_NULL_OBJ_REF as Identity

    @ManyToOne(fetch = FetchType.EAGER)
    Scope scope = GC_NULL_OBJ_REF as Scope

    Integer lookupPriority = GC_NULL_OBJ_REF as Integer
    
    Integer durationSeconds

    Integer maxUsageCount

    Integer refreshAllowed

    Integer refreshDurationSeconds

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
