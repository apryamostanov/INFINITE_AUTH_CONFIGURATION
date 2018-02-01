package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Authentication
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_authentication_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_data_field_repository
import org.springframework.stereotype.Component

@Component
class G10_AuthenticationGenerator {

    void generate_data(I_authentication_repository p_authentication_repository, I_data_field_repository p_data_field_repository) {
        Set<Authentication> l_entity_set = new HashSet<Authentication>()
        l_entity_set.add(new Authentication(authenticationName: "Accessor_data"))
        l_entity_set.add(new Authentication(authenticationName: "User_data"))
        l_entity_set.add(new Authentication(authenticationName: "Refresh_data"))
        l_entity_set.add(new Authentication(authenticationName: "OTP_data"))
        l_entity_set.add(new Authentication(authenticationName: "Provisioned_user_data"))
        l_entity_set.add(new Authentication(authenticationName: "Provisioning_data"))
        l_entity_set.add(new Authentication(authenticationName: "DOB_data"))
        p_authentication_repository.save(l_entity_set)
    }

}
