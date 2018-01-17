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
                p_data_field_repository.findByFieldNameAndFieldValue("accessor_id", "%ACCESSORID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("platform", "%PLATFORM%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("FIID", "%FIID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("api_version", "%APIVERSION%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("language", "%LANGUAGE%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("specific_data", "%SPECIFICDATA%").first()
        ], privateDataFieldSet: [

        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("accessor_id", "%ACCESSORID%").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("language", "%LANGUAGE%").first()
        ]))
        l_entity_set.add(new Authentication(authenticationName: "User_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("username", "%USERNAME%").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("password", "%PASSWORD%").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("card_type_id_enhanced", "%CARDTYPEIDENHANCED%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("login_flag", "%LOGINFLAG%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("error_number", "%ERRORNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("product_id", "%PRODUCTID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("username", "%USERNAME%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ]))
        l_entity_set.add(new Authentication(authenticationName: "Refresh_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("old_access_authorization", "%OLDACCESSAUTHORIZATION%").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("refresh_authorization", "%REFRESHAUTHORIZATION%").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("card_type_id_enhanced", "%CARDTYPEIDENHANCED%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("login_flag", "%LOGINFLAG%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("error_number", "%ERRORNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("product_id", "%PRODUCTID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("username", "%USERNAME%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ]))
        l_entity_set.add(new Authentication(authenticationName: "OTP_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("otp_id", "%OTPID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("phone_number", "%PHONENUMBER%").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("otp", "%OTP%").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("phone_number", "%PHONENUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldSet: [

        ]))
        l_entity_set.add(new Authentication(authenticationName: "Provisioned_user_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("provisioned_data_unique_id", "%PROVISIONEDDATAUNIQUEID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("provisioned_user_data_usage_authorization", "%PROVISIONEDUSERDATAUSAGEAUTHORIZATION%").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("provisioned_data_singature", "%PROVISIONEDDATASINGATURE%").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldSet: [

        ]))
        l_entity_set.add(new Authentication(authenticationName: "Provisioning_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("provisioning_public_key", "%PROVISIONINGPUBLICKEY%").first()
        ], privateDataFieldSet: [

        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("provisioning_public_key", "%PROVISIONINGPUBLICKEY%").first()
        ]))
        l_entity_set.add(new Authentication(authenticationName: "DOB_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("DOB", "%DOB%").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldSet: [

        ]))
        p_authentication_repository.save(l_entity_set)
    }

}
