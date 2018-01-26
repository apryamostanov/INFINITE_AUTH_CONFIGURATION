package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.DataField
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_data_field_repository
import org.springframework.stereotype.Component

@Component
class G06_DataFieldGenerator {

    void generate_data(I_data_field_repository p_data_field_repository) {
        Set<DataField> l_entity_set = new HashSet<DataField>()
        l_entity_set.add(new DataField(fieldName: "CardNumber"))
        l_entity_set.add(new DataField(fieldName: "ProxyNumber"))
        l_entity_set.add(new DataField(fieldName: "AccountNumber"))
        l_entity_set.add(new DataField(fieldName: "ProductID"))
        l_entity_set.add(new DataField(fieldName: "accessor_id"))
        l_entity_set.add(new DataField(fieldName: "PhoneNumber"))
        l_entity_set.add(new DataField(fieldName: "phone_number"))
        l_entity_set.add(new DataField(fieldName: "app_name"))
        l_entity_set.add(new DataField(fieldName: "platform"))
        l_entity_set.add(new DataField(fieldName: "fiid"))
        l_entity_set.add(new DataField(fieldName: "api_version"))
        l_entity_set.add(new DataField(fieldName: "app_version"))
        l_entity_set.add(new DataField(fieldName: "language"))
        l_entity_set.add(new DataField(fieldName: "specific_data"))
        l_entity_set.add(new DataField(fieldName: "username"))
        l_entity_set.add(new DataField(fieldName: "password"))
        l_entity_set.add(new DataField(fieldName: "proxy_number"))
        l_entity_set.add(new DataField(fieldName: "account_number"))
        l_entity_set.add(new DataField(fieldName: "old_access_authorization"))
        l_entity_set.add(new DataField(fieldName: "refresh_authorization"))
        l_entity_set.add(new DataField(fieldName: "otp_id"))
        l_entity_set.add(new DataField(fieldName: "OTP"))
        l_entity_set.add(new DataField(fieldName: "otp"))
        l_entity_set.add(new DataField(fieldName: "provisioned_data_unique_id"))
        l_entity_set.add(new DataField(fieldName: "provisioned_user_data_usage_authorization"))
        l_entity_set.add(new DataField(fieldName: "provisioned_data_singature"))
        l_entity_set.add(new DataField(fieldName: "provisioning_public_key"))
        l_entity_set.add(new DataField(fieldName: "DOB"))
        l_entity_set.add(new DataField(fieldName: "card_type_id_enhanced"))
        l_entity_set.add(new DataField(fieldName: "login_flag"))
        l_entity_set.add(new DataField(fieldName: "error_number"))
        l_entity_set.add(new DataField(fieldName: "product_id"))
        p_data_field_repository.save(l_entity_set)
    }

}
