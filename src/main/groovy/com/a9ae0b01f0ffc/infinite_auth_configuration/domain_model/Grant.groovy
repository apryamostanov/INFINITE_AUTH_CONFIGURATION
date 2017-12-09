package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Grant {

    @ManyToOne(fetch = FetchType.EAGER)
    Resource resource = GC_NULL_OBJ_REF as Resource

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<Method> methodList = new ArrayList<Method>()

    /*Priority 3*/
    /*Ownership by another resource with existing grant/access*/
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
    List<Url> searchUrlList = new ArrayList<Url>()

    /*Priority 4*/
    @ManyToMany(fetch = FetchType.EAGER)
    List<DataField> payloadKeyFieldList = new ArrayList<DataField>()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
