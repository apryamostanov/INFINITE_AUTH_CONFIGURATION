package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Grant {


    String resourceName = this.getClass().getSimpleName()

    @ManyToOne(fetch = FetchType.EAGER)
    RestResource restResource = GC_NULL_OBJ_REF as RestResource

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<Method> methodSet = new HashSet<Method>()

    /*Priority 3*/
    /*Ownership by another restResource with existing grant/access*/
    @ManyToOne(fetch = FetchType.EAGER)
    Grant parentGrant = GC_NULL_OBJ_REF as Grant

    /*Priority 2*/
    /*/{$username}*/
    @ManyToOne(fetch = FetchType.EAGER)
    Url url = GC_NULL_OBJ_REF as Url

    /*Priority 1*/
    /*/search/findByIdAndUsername?id=*&username=$username}*/
    /*/search/findByUsername?username=$username}*/
    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<Url> searchUrlSet = new HashSet<Url>()

    /*Priority 4*/
    @ManyToMany(fetch = FetchType.EAGER)
    Set<DataField> payloadKeyFieldSet = new HashSet<DataField>()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
