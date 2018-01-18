package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.DataField
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_data_field_repository
import org.springframework.stereotype.Component

@Component
class G06_DataFieldGenerator {

    void generate_data(I_data_field_repository p_data_field_repository) {
        Set<DataField> l_entity_set = new HashSet<DataField>()
        l_entity_set.add(new DataField(fieldName: "CardNumber", fieldValue: "%CARDNUMBER%"))
        l_entity_set.add(new DataField(fieldName: "ProxyNumber", fieldValue: "%PROXYNUMBER%"))
        l_entity_set.add(new DataField(fieldName: "AccountNumber", fieldValue: "%ACCOUNTNUMBER%"))
        l_entity_set.add(new DataField(fieldName: "ProductID", fieldValue: "%PRODUCTID%"))
        l_entity_set.add(new DataField(fieldName: "accessor_id", fieldValue: "%ACCESSORID%"))
        l_entity_set.add(new DataField(fieldName: "PhoneNumber", fieldValue: "%PHONENUMBER%"))
        l_entity_set.add(new DataField(fieldName: "phone_number", fieldValue: "%PHONENUMBER%"))


        l_entity_set.add(new DataField(fieldName: "app_name", fieldValue: "%APPNAME%"))
        l_entity_set.add(new DataField(fieldName: "platform", fieldValue: "%PLATFORM%"))
        l_entity_set.add(new DataField(fieldName: "FIID", fieldValue: "%FIID%"))
        l_entity_set.add(new DataField(fieldName: "api_version", fieldValue: "%APIVERSION%"))
        l_entity_set.add(new DataField(fieldName: "app_version", fieldValue: "%APPVERSION%"))
        l_entity_set.add(new DataField(fieldName: "language", fieldValue: "%LANGUAGE%"))
        l_entity_set.add(new DataField(fieldName: "specific_data", fieldValue: "%SPECIFICDATA%"))
        l_entity_set.add(new DataField(fieldName: "username", fieldValue: "%USERNAME%"))
        l_entity_set.add(new DataField(fieldName: "password", fieldValue: "%PASSWORD%"))
        l_entity_set.add(new DataField(fieldName: "proxy_number", fieldValue: "%PROXYNUMBER%"))
        l_entity_set.add(new DataField(fieldName: "account_number", fieldValue: "%ACCOUNTNUMBER%"))
        l_entity_set.add(new DataField(fieldName: "old_access_authorization", fieldValue: "%OLDACCESSAUTHORIZATION%"))
        l_entity_set.add(new DataField(fieldName: "refresh_authorization", fieldValue: "%REFRESHAUTHORIZATION%"))
        l_entity_set.add(new DataField(fieldName: "otp_id", fieldValue: "%OTPID%"))
        l_entity_set.add(new DataField(fieldName: "OTP", fieldValue: "%OTP%"))
        l_entity_set.add(new DataField(fieldName: "otp", fieldValue: "%OTP%"))
        l_entity_set.add(new DataField(fieldName: "provisioned_data_unique_id", fieldValue: "%PROVISIONEDDATAUNIQUEID%"))
        l_entity_set.add(new DataField(fieldName: "provisioned_user_data_usage_authorization", fieldValue: "%PROVISIONEDUSERDATAUSAGEAUTHORIZATION%"))
        l_entity_set.add(new DataField(fieldName: "provisioned_data_singature", fieldValue: "%PROVISIONEDDATASINGATURE%"))
        l_entity_set.add(new DataField(fieldName: "provisioning_public_key", fieldValue: "%PROVISIONINGPUBLICKEY%"))
        l_entity_set.add(new DataField(fieldName: "DOB", fieldValue: "%DOB%"))
        l_entity_set.add(new DataField(fieldName: "card_type_id_enhanced", fieldValue: "%CARDTYPEIDENHANCED%"))
        l_entity_set.add(new DataField(fieldName: "login_flag", fieldValue: "%LOGINFLAG%"))
        l_entity_set.add(new DataField(fieldName: "error_number", fieldValue: "%ERRORNUMBER%"))
        l_entity_set.add(new DataField(fieldName: "product_id", fieldValue: "%PRODUCTID%"))
        //l_entity_set.add(new DataField(fieldName: "username", fieldValue: "%USERNAME%"))
        p_data_field_repository.save(l_entity_set)
    }

}
