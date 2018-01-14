package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model


import groovy.transform.CompileStatic
import io.swagger.annotations.ApiModelProperty

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_FIRST_CHAR
import static base.T_common_base_1_const.GC_NULL_OBJ_REF
import static base.T_common_base_1_const.GC_POINT

@CompileStatic
@Entity
class Endpoint {

    @ApiModelProperty(example = "Accessor", value = "RestResource name (singular)")
    String resourceName = this.getClass().getSimpleName()

    String endpointName = GC_EMPTY_STRING

    @ManyToOne(fetch = FetchType.EAGER)
    Version apiVersion = GC_NULL_OBJ_REF as Version

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
