package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING

/**@ApiModel(description = "Defines a set of input (public, private) and output (keys, functional) data as well as the Granting Server -> Authentication Provider name")*/
@CompileStatic
@Entity
class Authentication {

    /***/
    String resourceName = this.getClass().getSimpleName()

    /**@ApiModelProperty(example = "User_data", value = "Defines the Granting Server -> Authentication Provider name")*/
    String authenticationName = GC_EMPTY_STRING

    /**@ApiModelProperty(value = "Public portion of Authentication data, required to be provided by accessors")*/
    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<DataField> publicDataFieldSet = new HashSet<DataField>()

    /**@ApiModelProperty(value = "Private portion of Authentication data, required to be provided by accessors")*/
    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<DataField> privateDataFieldSet = new HashSet<DataField>()

    /**@ApiModelProperty(value = "Data Authorization key fields returned by Authentication module/Authentication provider to accessor")*/
    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<DataField> keyFieldSet = new HashSet<DataField>()

    /**@ApiModelProperty(value = "Functional key fields returned by Authentication module/Authentication provider to accessor")*/
    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    Set<DataField> functionalFieldSet = new HashSet<DataField>()

    /**@ApiModelProperty(example = "1", value = "Authentication id, generated field")*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
