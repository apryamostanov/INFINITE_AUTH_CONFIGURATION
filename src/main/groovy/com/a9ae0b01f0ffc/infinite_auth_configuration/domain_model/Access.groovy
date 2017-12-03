package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Access {

    @ManyToOne(fetch = FetchType.EAGER)
    Resource resource = GC_NULL_OBJ_REF as Resource

    @OneToMany(fetch = FetchType.EAGER)
    List<Link> linkList = new ArrayList<Link>()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
