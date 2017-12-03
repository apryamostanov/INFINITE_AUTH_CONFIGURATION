package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model


import groovy.transform.CompileStatic

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.ManyToOne
import javax.persistence.OrderColumn

import static com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_4_const.*

@CompileStatic
@Entity
class Authorization {

    @ManyToOne(fetch = FetchType.EAGER)
    @OrderColumn
    Accessor accessor = GC_NULL_OBJ_REF as Accessor

    @ManyToOne(fetch = FetchType.EAGER)
    Authorization prerequisiteAuthorization = GC_NULL_OBJ_REF as Authorization

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<Identity> identityList = new ArrayList<Identity>()
    
    String authorizationName = GC_EMPTY_STRING

    @ManyToMany(cascade = CascadeType.ALL)
    @OrderColumn
    List<DataField> functionalFieldList = new ArrayList<DataField>()

    @ManyToMany(cascade = CascadeType.ALL)
    @OrderColumn
    List<DataField> keyFieldList = new ArrayList<DataField>()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
