package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Authentication
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_authentication_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_data_field_repository
import org.springframework.stereotype.Component

@Component
class G10_AuthenticationGenerator {

    void generate_data(I_authentication_repository p_authentication_repository, I_data_field_repository p_data_field_repository) {
        Set<Authentication> l_entity_set = new HashSet<Authentication>()
        l_entity_set.add(new Authentication(authenticationName: "Accessor_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldName("accessor_id").first(),
                p_data_field_repository.findByFieldName("platform").first(),
                p_data_field_repository.findByFieldName("fiid").first(),
                p_data_field_repository.findByFieldName("api_version").first(),
                p_data_field_repository.findByFieldName("language").first(),
                p_data_field_repository.findByFieldName("specific_data").first()
        ], privateDataFieldSet: [

        ], keyFieldSet: [
                p_data_field_repository.findByFieldName("accessor_id").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldName("language").first()
        ]))
        l_entity_set.add(new Authentication(authenticationName: "User_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldName("username").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldName("password").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldName("card_type_id_enhanced").first(),
                p_data_field_repository.findByFieldName("login_flag").first(),
                p_data_field_repository.findByFieldName("error_number").first(),
                p_data_field_repository.findByFieldName("proxy_number").first(),
                p_data_field_repository.findByFieldName("account_number").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldName("product_id").first(),
                p_data_field_repository.findByFieldName("username").first(),
                p_data_field_repository.findByFieldName("proxy_number").first(),
                p_data_field_repository.findByFieldName("account_number").first()
        ]))
        l_entity_set.add(new Authentication(authenticationName: "Refresh_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldName("proxy_number").first(),
                p_data_field_repository.findByFieldName("old_access_authorization").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldName("refresh_authorization").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldName("card_type_id_enhanced").first(),
                p_data_field_repository.findByFieldName("login_flag").first(),
                p_data_field_repository.findByFieldName("error_number").first(),
                p_data_field_repository.findByFieldName("proxy_number").first(),
                p_data_field_repository.findByFieldName("account_number").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldName("product_id").first(),
                p_data_field_repository.findByFieldName("username").first(),
                p_data_field_repository.findByFieldName("proxy_number").first(),
                p_data_field_repository.findByFieldName("account_number").first()
        ]))
        l_entity_set.add(new Authentication(authenticationName: "OTP_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldName("proxy_number").first(),
                p_data_field_repository.findByFieldName("otp_id").first(),
                p_data_field_repository.findByFieldName("phone_number").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldName("otp").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldName("phone_number").first(),
                p_data_field_repository.findByFieldName("proxy_number").first()
        ], functionalFieldSet: [

        ]))
        l_entity_set.add(new Authentication(authenticationName: "Provisioned_user_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldName("proxy_number").first(),
                p_data_field_repository.findByFieldName("provisioned_data_unique_id").first(),
                p_data_field_repository.findByFieldName("provisioned_user_data_usage_authorization").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldName("provisioned_data_singature").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldName("proxy_number").first()
        ], functionalFieldSet: [

        ]))
        l_entity_set.add(new Authentication(authenticationName: "Provisioning_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldName("proxy_number").first(),
                p_data_field_repository.findByFieldName("provisioning_public_key").first()
        ], privateDataFieldSet: [

        ], keyFieldSet: [
                p_data_field_repository.findByFieldName("proxy_number").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldName("provisioning_public_key").first()
        ]))
        l_entity_set.add(new Authentication(authenticationName: "DOB_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldName("proxy_number").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldName("DOB").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldName("proxy_number").first()
        ], functionalFieldSet: [

        ]))
        p_authentication_repository.save(l_entity_set)
    }

}
