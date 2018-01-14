package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Authorization {


    String resourceName = this.getClass().getSimpleName()

    @ManyToOne(fetch = FetchType.EAGER)
    @OrderColumn
    Accessor accessor = GC_NULL_OBJ_REF as Accessor

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<Identity> identitySet = new HashSet<Identity>()

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<Scope> scopeSet = new HashSet<Scope>()
    
    String authorizationName = GC_EMPTY_STRING

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
