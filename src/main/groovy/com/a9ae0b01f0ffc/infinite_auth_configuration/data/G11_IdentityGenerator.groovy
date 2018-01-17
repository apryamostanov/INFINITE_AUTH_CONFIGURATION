package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Identity
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_accessor_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_authentication_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_identity_repository
import org.springframework.stereotype.Component

@Component
class G11_IdentityGenerator {

    void generate_data(I_identity_repository p_identity_repository, I_accessor_repository p_accessor_repository, I_authentication_repository p_authentication_repository) {
        Set<Identity> l_entity_set = new HashSet<Identity>()
        l_entity_set.add(new Identity(identityName: "Owner of Accessor Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("Accessor_data").first()]))
        l_entity_set.add(new Identity(identityName: "Owner of User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first()]))
        l_entity_set.add(new Identity(identityName: "Owner of Refresh Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("Refresh_data").first()]))
        l_entity_set.add(new Identity(identityName: "Owner of OTP Data and User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("OTP_data").first(), p_authentication_repository.findByAuthenticationName("User_data").first()]))
        l_entity_set.add(new Identity(identityName: "Owner of OTP Data and Provisioned User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("OTP_data").first(), p_authentication_repository.findByAuthenticationName("Provisioned_user_data").first()]))
        l_entity_set.add(new Identity(identityName: "Owner of Provisioning Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("Provisioning_data").first()]))
        l_entity_set.add(new Identity(identityName: "Owner of User Data and DOB Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first(), p_authentication_repository.findByAuthenticationName("DOB_data").first()]))
        l_entity_set.add(new Identity(identityName: "Owner of Provisioned User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("Provisioned_user_data").first()]))
        l_entity_set.add(new Identity(identityName: "Owner of User Data and Provisioning Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("Provisioning_data").first()]))
        p_identity_repository.save(l_entity_set)
    }

}
