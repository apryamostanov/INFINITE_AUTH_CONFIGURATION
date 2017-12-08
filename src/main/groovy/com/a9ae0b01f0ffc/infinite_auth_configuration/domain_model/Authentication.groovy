package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_4_const
import com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_5_context
import com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_6_util
import com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_conf
import groovy.transform.CompileStatic

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

import static com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_4_const.*

@CompileStatic
@Entity
class Authentication {

    String authenticationName = GC_EMPTY_STRING

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<DataField> publicDataFieldList = new ArrayList<DataField>()

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<DataField> privateDataFieldList = new ArrayList<DataField>()

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<DataField> keyFieldList = new ArrayList<DataField>()

    @ManyToMany(fetch = FetchType.EAGER)
    @OrderColumn
    List<DataField> functionalFieldList = new ArrayList<DataField>()

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

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
