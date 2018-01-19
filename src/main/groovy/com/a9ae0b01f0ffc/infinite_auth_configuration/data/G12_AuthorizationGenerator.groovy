package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Authorization
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_accessor_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_authentication_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_authorization_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_scope_repository
import org.springframework.stereotype.Component

@Component
class G12_AuthorizationGenerator {

    void generate_data(I_authorization_repository p_authorization_repository, I_scope_repository p_scope_repository, I_authentication_repository p_authentication_repository, I_accessor_repository p_accessor_repository) {
        Set<Authorization> l_entity_set = new HashSet<Authorization>()
        l_entity_set.add(new Authorization(
                authorizationName: "Anonymous access to Anonymous Services as Owner of Accessor Data",
                scope: p_scope_repository.findByScopeName("Anonymous Services").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("Accessor_data").first()],
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: null,
                authorizationType: "Access"
        ))
        p_authorization_repository.save(l_entity_set)
        l_entity_set.clear()
        l_entity_set.add(new Authorization(
                authorizationName: "Read refresh to Main Screen as Owner of User Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first()],
                durationSeconds: 2592000,
                maxUsageCount: null,
                accessor: null,
                authorizationType: "Refresh",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Read refresh to Main Screen as Owner of User Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first()],
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                authorizationType: "Refresh",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Read refresh to Main Screen as Owner of Refresh Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("Refresh_data").first()],
                durationSeconds: 2592000,
                maxUsageCount: null,
                accessor: null,
                authorizationType: "Refresh",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Read refresh to Main Screen as Owner of Refresh Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("Refresh_data").first()],
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                authorizationType: "Refresh",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_authorization_repository.save(l_entity_set)
        l_entity_set.clear()
        l_entity_set.add(new Authorization(
                authorizationName: "Read access to Main Screen as Owner of User Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first()],
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAuthorization: p_authorization_repository.findByAuthorizationName("Read refresh to Main Screen as Owner of User Data").first(),
                accessor: null,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Read access to Main Screen as Owner of User Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first()],
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAuthorization: p_authorization_repository.findByAuthorizationName("Read refresh to Main Screen as Owner of User Data (React)").first(),
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Read access to Main Screen as Owner of Refresh Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("Refresh_data").first()],
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAuthorization: p_authorization_repository.findByAuthorizationName("Read refresh to Main Screen as Owner of Refresh Data").first(),
                accessor: null,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Read access to Main Screen as Owner of Refresh Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("Refresh_data").first()],
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAuthorization: p_authorization_repository.findByAuthorizationName("Read refresh to Main Screen as Owner of Refresh Data (React)").first(),
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_authorization_repository.save(l_entity_set)
        l_entity_set.clear()
        l_entity_set.add(new Authorization(
                authorizationName: "Demographic Updates access to Update Profile as Owner of User Data",
                scope: p_scope_repository.findByScopeName("Update Profile").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first()],
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Demographic Updates access to Update Profile as Owner of Provisioned User Data",
                scope: p_scope_repository.findByScopeName("Update Profile").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("Provisioned_user_data").first()],
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Provisioned User Data Usage access as Owner of User Data and Provisioning Data",
                authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first(), p_authentication_repository.findByAuthenticationName("Provisioning_data").first()],
                durationSeconds: 2592000,
                maxUsageCount: 20,
                accessor: null,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Security Updates access to Change Password as Owner of User Data and DOB Data",
                scope: p_scope_repository.findByScopeName("Change Password").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first(), p_authentication_repository.findByAuthenticationName("DOB_data").first()],
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Security Updates access to Change Security Answers as Owner of User Data and DOB Data",
                scope: p_scope_repository.findByScopeName("Change Security Answers").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first(), p_authentication_repository.findByAuthenticationName("DOB_data").first()],
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Secured Demographic Updates access to Update Phone as Owner of OTP Data and User Data",
                scope: p_scope_repository.findByScopeName("Update Phone").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("OTP_data").first(), p_authentication_repository.findByAuthenticationName("User_data").first()],
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        l_entity_set.add(new Authorization(
                authorizationName: "Secured Demographic Updates access to Update Phone as Owner of OTP Data and Provisioned User Data",
                scope: p_scope_repository.findByScopeName("Update Phone").first(),
                authenticationSet: [p_authentication_repository.findByAuthenticationName("OTP_data").first(), p_authentication_repository.findByAuthenticationName("Provisioned_user_data").first()],
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_authorization_repository.save(l_entity_set)
    }

}
