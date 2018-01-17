package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Authorization
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_accessor_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_authorization_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_identity_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_scope_repository
import org.springframework.stereotype.Component

@Component
class AuthorizationGenerator {

    void generate_data(I_authorization_repository p_authorization_repository, I_scope_repository p_scope_repository, I_identity_repository p_identity_repository, I_accessor_repository p_accessor_repository) {
        p_authorization_repository.save(new Authorization(
                authorizationName: "Anonymous access to Anonymous Services as Owner of Accessor Data",
                scope: p_scope_repository.findByScopeName("Anonymous Services").first(),
                identity: p_identity_repository.findByIdentityName("Owner of Accessor Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Access"
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Read refresh to Main Screen as Owner of User Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 2592000,
                maxUsageCount: null,
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Refresh",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Read refresh to Main Screen as Owner of User Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                lookupPriority: 0,
                authorizationType: "Refresh",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Read refresh to Main Screen as Owner of Refresh Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 2592000,
                maxUsageCount: null,
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Refresh",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Read refresh to Main Screen as Owner of Refresh Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                lookupPriority: 0,
                authorizationType: "Refresh",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Read access to Main Screen as Owner of User Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAuthorization: p_authorization_repository.findByAuthorizationName("Read refresh to Main Screen as Owner of User Data").first(),
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Read access to Main Screen as Owner of User Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAuthorization: p_authorization_repository.findByAuthorizationName("Read refresh to Main Screen as Owner of User Data (React)").first(),
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                lookupPriority: 1,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Read access to Main Screen as Owner of Refresh Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of Refresh Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAuthorization: p_authorization_repository.findByAuthorizationName("Read refresh to Main Screen as Owner of Refresh Data").first(),
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Read access to Main Screen as Owner of Refresh Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of Refresh Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAuthorization: p_authorization_repository.findByAuthorizationName("Read refresh to Main Screen as Owner of Refresh Data (React)").first(),
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                lookupPriority: 1,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [p_authorization_repository.findByAuthorizationName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Demographic Updates access to Update Profile as Owner of User Data",
                scope: p_scope_repository.findByScopeName("Update Profile").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Demographic Updates access to Update Profile as Owner of Provisioned User Data",
                scope: p_scope_repository.findByScopeName("Update Profile").first(),
                identity: p_identity_repository.findByIdentityName("Owner of Provisioned User Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Provisioned User Data Usage access as Owner of User Data and Provisioning Data",
                identity: p_identity_repository.findByIdentityName("Owner of User Data and Provisioning Data").first(),
                durationSeconds: 2592000,
                maxUsageCount: 20,
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Security Updates access to Change Password as Owner of User Data and DOB Data",
                scope: p_scope_repository.findByScopeName("Change Password").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data and DOB Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Security Updates access to Change Security Answers as Owner of User Data and DOB Data",
                scope: p_scope_repository.findByScopeName("Change Security Answers").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data and DOB Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Secured Demographic Updates access to Update Phone as Owner of OTP Data and User Data",
                scope: p_scope_repository.findByScopeName("Update Phone").first(),
                identity: p_identity_repository.findByIdentityName("Owner of OTP Data and User Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_authorization_repository.save(new Authorization(
                authorizationName: "Secured Demographic Updates access to Update Phone as Owner of OTP Data and Provisioned User Data",
                scope: p_scope_repository.findByScopeName("Update Phone").first(),
                identity: p_identity_repository.findByIdentityName("Owner of OTP Data and Provisioned User Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                authorizationType: "Access",
                prerequisiteAuthorizationSet: [
                        p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_authorization_repository.findByAuthorizationName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
    }

}
