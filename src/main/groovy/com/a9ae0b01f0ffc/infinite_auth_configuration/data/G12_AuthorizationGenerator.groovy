package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Authorization
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_accessor_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_authorization_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_identity_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_scope_repository
import org.springframework.stereotype.Component

@Component
class G12_AuthorizationGenerator {

    void generate_data(I_authorization_repository p_authorization_repository, I_scope_repository p_scope_repository, I_identity_repository p_identity_repository, I_accessor_repository p_accessor_repository) {
        Set<Authorization> l_entity_set = new HashSet<Authorization>()
        l_entity_set.add(new Authorization(
                authorizationName: "Access to Anonymous Services",//todo: scopes -> collection; first identify accessor/matching authorization->then 1 actual scope using this accessor. Same applies to Identity
                scopeSet: p_scope_repository.findByScopeName("Anonymous Services"),
                identitySet: p_identity_repository.findByIdentityName("Owner of Accessor Data"),
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: p_accessor_repository.findByAccessorName("Any accessor").first(),
                authorizationType: "Access"
        ))
        p_authorization_repository.save(l_entity_set)
        l_entity_set.clear()
        l_entity_set.add(new Authorization(
                authorizationName: "Refresh to Main Screen",
                scopeSet: p_scope_repository.findByScopeName("Main Screen"),
                durationSeconds: 2592000,
                maxUsageCount: null,
                accessor: p_accessor_repository.findByAccessorName("Any accessor").first(),
                authorizationType: "Refresh"
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Refresh to Main Screen",
                scopeSet: p_scope_repository.findByScopeName("Main Screen"),
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                authorizationType: "Refresh"
        ))
        p_authorization_repository.save(l_entity_set)
        l_entity_set.clear()
        l_entity_set.add(new Authorization(
                authorizationName: "Access to Main Screen",
                scopeSet: p_scope_repository.findByScopeName("Main Screen"),
                identitySet: [p_identity_repository.findByIdentityName("Owner of User Data").first(), p_identity_repository.findByIdentityName("Owner of Refresh Data").first()],
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAuthorization: p_authorization_repository.findByAuthorizationNameAndAccessor("Refresh to Main Screen", p_accessor_repository.findByAccessorName("Any accessor").first()).first(),
                accessor: p_accessor_repository.findByAccessorName("Any accessor").first(),
                authorizationType: "Access",
                prerequisiteAuthorizationSet: p_authorization_repository.findByAuthorizationName("Access to Anonymous Services")
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Access to Main Screen",
                scopeSet: p_scope_repository.findByScopeName("Main Screen"),
                identitySet: [p_identity_repository.findByIdentityName("Owner of User Data").first(), p_identity_repository.findByIdentityName("Owner of Refresh Data").first()],
                durationSeconds: 120,
                maxUsageCount: null,
                refreshAuthorization: p_authorization_repository.findByAuthorizationNameAndAccessor("Refresh to Main Screen", p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first()).first(),
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                authorizationType: "Access",
                prerequisiteAuthorizationSet: p_authorization_repository.findByAuthorizationName("Access to Anonymous Services")
        ))
        p_authorization_repository.save(l_entity_set)
        l_entity_set.clear()
        l_entity_set.add(new Authorization(
                authorizationName: "Access to Update Profile",
                scopeSet: p_scope_repository.findByScopeName("Update Profile"),
                identitySet: [p_identity_repository.findByIdentityName("Owner of User Data").first(), p_identity_repository.findByIdentityName("Owner of Provisioned User Data").first()],
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: p_accessor_repository.findByAccessorName("Any accessor").first(),
                authorizationType: "Access",
                prerequisiteAuthorizationSet: p_authorization_repository.findByAuthorizationName("Access to Main Screen")
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Bearer of User Data and Provisioning Data",
                identitySet: p_identity_repository.findByIdentityName("Owner of User Data and Provisioning Data"),
                durationSeconds: 2592000,
                maxUsageCount: 20,
                accessor: p_accessor_repository.findByAccessorName("Any accessor").first(),
                authorizationType: "Access",
                prerequisiteAuthorizationSet: p_authorization_repository.findByAuthorizationName("Access to Main Screen")
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Access to Change Password",
                scopeSet: [p_scope_repository.findByScopeName("Change Password").first(), p_scope_repository.findByScopeName("Change Security Answers").first()],
                identitySet: p_identity_repository.findByIdentityName("Owner of User Data and DOB Data"),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: p_accessor_repository.findByAccessorName("Any accessor").first(),
                authorizationType: "Access",
                prerequisiteAuthorizationSet: p_authorization_repository.findByAuthorizationName("Access to Main Screen")
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Access to Update Phone",
                scopeSet: p_scope_repository.findByScopeName("Update Phone"),
                identitySet: [p_identity_repository.findByIdentityName("Owner of OTP Data and User Data").first(), p_identity_repository.findByIdentityName("Owner of OTP Data and Provisioned User Data").first()],
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: p_accessor_repository.findByAccessorName("Any accessor").first(),
                authorizationType: "Access",
                prerequisiteAuthorizationSet: p_authorization_repository.findByAuthorizationName("Access to Main Screen")
        ))
        p_authorization_repository.save(l_entity_set)
    }

}
