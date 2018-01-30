package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

@CompileStatic
@Entity
class Identity {

    String resourceName = this.getClass().getSimpleName()

    @Column(unique = true)
    String identityName

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<Authentication> authenticationSet = new HashSet<Authentication>()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
