package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model


import groovy.transform.CompileStatic
import io.swagger.annotations.ApiModelProperty

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_FIRST_CHAR
import static base.T_common_base_1_const.GC_POINT

@CompileStatic
@Entity
class DataField {

    @ApiModelProperty(example = "Accessor", value = "RestResource name (singular)")
    String resourceName = this.getClass().getSimpleName()

    String fieldName = GC_EMPTY_STRING
    String fieldValue = GC_EMPTY_STRING

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
