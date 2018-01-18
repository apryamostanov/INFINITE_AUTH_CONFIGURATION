package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Authorization {

    String resourceName = this.getClass().getSimpleName()

    @Column(unique = true)
    String authorizationName

    @ManyToOne(fetch = FetchType.EAGER)
    @OrderColumn
    Accessor accessor = GC_NULL_OBJ_REF as Accessor


    @ManyToOne(fetch = FetchType.EAGER)
    Identity identity = GC_NULL_OBJ_REF as Identity

    @ManyToOne(fetch = FetchType.EAGER)
    Scope scope = GC_NULL_OBJ_REF as Scope

    Integer durationSeconds

    Integer maxUsageCount

    @ManyToOne(fetch = FetchType.EAGER)
    Authorization refreshAuthorization

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<Authorization> prerequisiteAuthorizationSet

    String authorizationType

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
