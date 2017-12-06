package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.OrderColumn

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Identity {

    String identityName = GC_EMPTY_STRING

    @ManyToOne(fetch = FetchType.EAGER)
    Authorization prerequisiteAuthorization = GC_NULL_OBJ_REF as Authorization

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<Authentication> authenticationList = new ArrayList<Authentication>()

    @ManyToOne(fetch = FetchType.EAGER)
    @OrderColumn
    Accessor accessor = GC_NULL_OBJ_REF as Accessor

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
