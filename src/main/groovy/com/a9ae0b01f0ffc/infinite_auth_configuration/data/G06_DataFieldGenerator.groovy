package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Field
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_data_field_repository
import org.springframework.stereotype.Component

@Component
class G06_DataFieldGenerator {

    void generate_data(I_data_field_repository p_data_field_repository) {
        Set<Field> l_entity_set = new HashSet<Field>()
        l_entity_set.add(new Field(fieldName: "CardNumber"))
        l_entity_set.add(new Field(fieldName: "ProxyNumber"))
        l_entity_set.add(new Field(fieldName: "AccountNumber"))
        l_entity_set.add(new Field(fieldName: "ProductID"))
        l_entity_set.add(new Field(fieldName: "accessor_id"))
        l_entity_set.add(new Field(fieldName: "PhoneNumber"))
        l_entity_set.add(new Field(fieldName: "phone_number"))
        l_entity_set.add(new Field(fieldName: "app_name"))
        l_entity_set.add(new Field(fieldName: "platform"))
        l_entity_set.add(new Field(fieldName: "fiid"))
        l_entity_set.add(new Field(fieldName: "api_version"))
        l_entity_set.add(new Field(fieldName: "app_version"))
        l_entity_set.add(new Field(fieldName: "language"))
        l_entity_set.add(new Field(fieldName: "specific_data"))
        l_entity_set.add(new Field(fieldName: "username"))
        l_entity_set.add(new Field(fieldName: "password"))
        l_entity_set.add(new Field(fieldName: "proxy_number"))
        l_entity_set.add(new Field(fieldName: "account_number"))
        l_entity_set.add(new Field(fieldName: "old_access_authorization"))
        l_entity_set.add(new Field(fieldName: "refresh_authorization"))
        l_entity_set.add(new Field(fieldName: "otp_id"))
        l_entity_set.add(new Field(fieldName: "OTP"))
        l_entity_set.add(new Field(fieldName: "otp"))
        l_entity_set.add(new Field(fieldName: "provisioned_data_unique_id"))
        l_entity_set.add(new Field(fieldName: "provisioned_user_data_usage_authorization"))
        l_entity_set.add(new Field(fieldName: "provisioned_data_singature"))
        l_entity_set.add(new Field(fieldName: "provisioning_public_key"))
        l_entity_set.add(new Field(fieldName: "DOB"))
        l_entity_set.add(new Field(fieldName: "card_type_id_enhanced"))
        l_entity_set.add(new Field(fieldName: "login_flag"))
        l_entity_set.add(new Field(fieldName: "error_number"))
        l_entity_set.add(new Field(fieldName: "product_id"))
        p_data_field_repository.save(l_entity_set)
    }

}
