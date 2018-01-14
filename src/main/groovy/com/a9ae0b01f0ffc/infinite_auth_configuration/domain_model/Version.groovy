package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic
import io.swagger.annotations.ApiModelProperty

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_NULL_OBJ_REF

@CompileStatic
@Entity
class Version {

    @ApiModelProperty(example = "Accessor", value = "RestResource name (singular)")
    String resourceName = this.getClass().getSimpleName()

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
