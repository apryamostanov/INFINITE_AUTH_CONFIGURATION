package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.DataField
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_data_field_repository
import org.springframework.stereotype.Component

@Component
class DataFieldGenerator {

    void generate_data(I_data_field_repository p_data_field_repository) {
        p_data_field_repository.save(new DataField(fieldName: "CardNumber", fieldValue: "%CARDNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "ProxyNumber", fieldValue: "%PROXYNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "AccountNumber", fieldValue: "%ACCOUNTNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "ProductID", fieldValue: "%PRODUCTID%"))
        p_data_field_repository.save(new DataField(fieldName: "accessor_id", fieldValue: "%ACCESSORID%"))
        p_data_field_repository.save(new DataField(fieldName: "PhoneNumber", fieldValue: "%PHONENUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "phone_number", fieldValue: "%PHONENUMBER%"))


        p_data_field_repository.save(new DataField(fieldName: "app_name", fieldValue: "%APPNAME%"))
        p_data_field_repository.save(new DataField(fieldName: "platform", fieldValue: "%PLATFORM%"))
        p_data_field_repository.save(new DataField(fieldName: "FIID", fieldValue: "%FIID%"))
        p_data_field_repository.save(new DataField(fieldName: "api_version", fieldValue: "%APIVERSION%"))
        p_data_field_repository.save(new DataField(fieldName: "app_version", fieldValue: "%APPVERSION%"))
        p_data_field_repository.save(new DataField(fieldName: "language", fieldValue: "%LANGUAGE%"))
        p_data_field_repository.save(new DataField(fieldName: "specific_data", fieldValue: "%SPECIFICDATA%"))
        p_data_field_repository.save(new DataField(fieldName: "username", fieldValue: "%USERNAME%"))
        p_data_field_repository.save(new DataField(fieldName: "password", fieldValue: "%PASSWORD%"))
        p_data_field_repository.save(new DataField(fieldName: "proxy_number", fieldValue: "%PROXYNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "account_number", fieldValue: "%ACCOUNTNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "old_access_authorization", fieldValue: "%OLDACCESSAUTHORIZATION%"))
        p_data_field_repository.save(new DataField(fieldName: "refresh_authorization", fieldValue: "%REFRESHAUTHORIZATION%"))
        p_data_field_repository.save(new DataField(fieldName: "otp_id", fieldValue: "%OTPID%"))
        p_data_field_repository.save(new DataField(fieldName: "OTP", fieldValue: "%OTP%"))
        p_data_field_repository.save(new DataField(fieldName: "otp", fieldValue: "%OTP%"))
        p_data_field_repository.save(new DataField(fieldName: "provisioned_data_unique_id", fieldValue: "%PROVISIONEDDATAUNIQUEID%"))
        p_data_field_repository.save(new DataField(fieldName: "provisioned_user_data_usage_authorization", fieldValue: "%PROVISIONEDUSERDATAUSAGEAUTHORIZATION%"))
        p_data_field_repository.save(new DataField(fieldName: "provisioned_data_singature", fieldValue: "%PROVISIONEDDATASINGATURE%"))
        p_data_field_repository.save(new DataField(fieldName: "provisioning_public_key", fieldValue: "%PROVISIONINGPUBLICKEY%"))
        p_data_field_repository.save(new DataField(fieldName: "DOB", fieldValue: "%DOB%"))
        p_data_field_repository.save(new DataField(fieldName: "card_type_id_enhanced", fieldValue: "%CARDTYPEIDENHANCED%"))
        p_data_field_repository.save(new DataField(fieldName: "login_flag", fieldValue: "%LOGINFLAG%"))
        p_data_field_repository.save(new DataField(fieldName: "error_number", fieldValue: "%ERRORNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "product_id", fieldValue: "%PRODUCTID%"))
        p_data_field_repository.save(new DataField(fieldName: "username", fieldValue: "%USERNAME%"))
    }

}
