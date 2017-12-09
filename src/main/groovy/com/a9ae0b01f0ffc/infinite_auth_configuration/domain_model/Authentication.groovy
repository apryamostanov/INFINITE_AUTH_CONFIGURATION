package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_4_const
import com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_5_context
import groovy.transform.CompileStatic
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import org.springframework.validation.annotation.Validated

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany
import javax.persistence.OrderColumn
import javax.persistence.Transient
import javax.validation.Valid

import static com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_4_const.*

/**
 * Defines a set of input (public, private) and output (keys, functional) data as well as the Granting Server validation module name
 */
@ApiModel(description = "Defines a set of input (public, private) and output (keys, functional) data as well as the Granting Server -> Authentication Provider name")
@CompileStatic
@Entity
class Authentication {

    /**
     * Defines the Granting Server -> Authentication Provider name
     */
    @ApiModelProperty(example = "User_data", value = "Defines the Granting Server -> Authentication Provider name")
    String authenticationName = GC_EMPTY_STRING

    /**
     * Public portion of Authentication data, required to be provided by accessors
     */
    @ApiModelProperty(value = "Public portion of Authentication data, required to be provided by accessors")
    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<DataField> publicDataFieldList = new ArrayList<DataField>()

    /**
     * Private portion of Authentication data, required to be provided by accessors
     */
    @ApiModelProperty(value = "Private portion of Authentication data, required to be provided by accessors")
    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<DataField> privateDataFieldList = new ArrayList<DataField>()

    /**
     * Data Authorization key fields returned by Authentication module/Authentication provider to accessor
     */
    @ApiModelProperty(value = "Data Authorization key fields returned by Authentication module/Authentication provider to accessor")
    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<DataField> keyFieldList = new ArrayList<DataField>()

    /**
     * Functional key fields returned by Authentication module/Authentication provider to accessor
     */
    @ApiModelProperty(value = "Functional key fields returned by Authentication module/Authentication provider to accessor")
    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<DataField> functionalFieldList = new ArrayList<DataField>()

    /**
     * Authentication id
     */
    @ApiModelProperty(example = "1", value = "Authentication id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

    /**
     * Obsolete to be moved to granting server
     * @param publicDataFieldList
     * @param privateDataFieldList
     * @param functionalDataFieldList
     * @param keyDataFieldList
     * @return
     */
    Boolean validate(List<DataField> publicDataFieldList, List<DataField> privateDataFieldList, List<DataField> functionalDataFieldList, List<DataField> keyDataFieldList) {
        Binding l_binding = new Binding()
        l_binding.setVariable("i_public_data_field_list", publicDataFieldList)
        l_binding.setVariable("i_private_data_field_list", privateDataFieldList)
        l_binding.setVariable("o_functional_data_field_list", functionalDataFieldList)
        l_binding.setVariable("o_key_data_field_list", keyDataFieldList)
        System.out.println(T_auth_base_5_context.get_app_context().app_conf().authenticationModulesPath + "Z")
        return T_auth_base_5_context.get_app_context().get_authentication_runner().run(authenticationName, l_binding)
    }

}
