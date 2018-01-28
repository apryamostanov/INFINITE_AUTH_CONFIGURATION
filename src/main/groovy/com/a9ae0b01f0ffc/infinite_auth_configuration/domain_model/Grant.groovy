package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING

@CompileStatic
@Entity
class Grant {


    String resourceName = this.getClass().getSimpleName()

    String restResourceName = GC_EMPTY_STRING

    String method = GC_EMPTY_STRING

    /*Priority 2*/
    /*/{$username}*/
    String urlMask = GC_EMPTY_STRING

    /*Priority 3*/
    @ManyToMany(fetch = FetchType.EAGER)
    Set<Field> keyFieldSet = new HashSet<Field>()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
