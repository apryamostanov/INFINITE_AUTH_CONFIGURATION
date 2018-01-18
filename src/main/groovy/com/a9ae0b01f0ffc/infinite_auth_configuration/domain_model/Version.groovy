package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Version
import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Version {


    String resourceName = this.getClass().getSimpleName()

    @Column(unique = true)
    String versionName = GC_EMPTY_STRING

    @OneToOne(fetch = FetchType.EAGER)
    Version parentVersion = GC_NULL_OBJ_REF as Version

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<RestResource> resourceSet

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
