package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model


import groovy.transform.CompileStatic

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany

import static com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_4_const.*

@CompileStatic
@Entity
class Authentication {

    String authenticationName = GC_EMPTY_STRING

    @ManyToMany(cascade = CascadeType.ALL)
    List<DataField> publicDataFieldList = new ArrayList<DataField>()

    @ManyToMany(cascade = CascadeType.ALL)
    List<DataField> privateDataFieldList = new ArrayList<DataField>()

    @ManyToMany(cascade = CascadeType.ALL)
    List<DataField> keyFieldList = new ArrayList<DataField>()

    @ManyToMany(cascade = CascadeType.ALL)
    List<DataField> functionalFieldList = new ArrayList<DataField>()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
