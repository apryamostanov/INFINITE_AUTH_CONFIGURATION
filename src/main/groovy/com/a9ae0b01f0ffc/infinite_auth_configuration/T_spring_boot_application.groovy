package com.a9ae0b01f0ffc.infinite_auth_configuration

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.*
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class T_spring_boot_application implements CommandLineRunner  {

    static void main(String[] args) {
        SpringApplication.run(T_spring_boot_application.class, args)
    }

    @Autowired
    private I_accessor_repository p_accessor_repository
    @Autowired
    private I_authentication_repository p_authentication_repository
    @Autowired
    private I_authorization_repository p_authorization_repository
    @Autowired
    private I_data_field_repository p_data_field_repository
    @Autowired
    private I_endpoint_repository p_endpoint_repository
    @Autowired
    private I_identity_repository p_identity_repository
    @Autowired
    private I_major_version_repository p_major_version_repository
    @Autowired
    private I_method_repository p_method_repository
    @Autowired
    private I_resource_repository p_resource_repository
    @Autowired
    private I_scope_repository p_scope_repository
    @Autowired
    private I_version_repository p_version_repository

    @Override
    void run(String... args) throws Exception {
        p_major_version_repository.save(new MajorVersion(majorVersion: "0"))
        p_major_version_repository.save(new MajorVersion(majorVersion: "1"))
        p_major_version_repository.save(new MajorVersion(majorVersion: "2"))
        p_version_repository.save(new Version(minorVersion: "0", majorVersion: p_major_version_repository.findByMajorVersion("0").first()))
        p_version_repository.save(new Version(minorVersion: "0", majorVersion: p_major_version_repository.findByMajorVersion("1").first()))
        p_version_repository.save(new Version(minorVersion: "0", majorVersion: p_major_version_repository.findByMajorVersion("2").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "Unexposed 0.0.x", apiVersion: p_version_repository.findByMajorVersionAndMinorVersion(p_major_version_repository.findByMajorVersion("0").first(), "0").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "Unexposed 1.0.x", apiVersion: p_version_repository.findByMajorVersionAndMinorVersion(p_major_version_repository.findByMajorVersion("1").first(), "0").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "Unexposed 2.0.x", apiVersion: p_version_repository.findByMajorVersionAndMinorVersion(p_major_version_repository.findByMajorVersion("2").first(), "0").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "Development", apiVersion: p_version_repository.findByMajorVersionAndMinorVersion(p_major_version_repository.findByMajorVersion("1").first(), "0").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "Staging", apiVersion: p_version_repository.findByMajorVersionAndMinorVersion(p_major_version_repository.findByMajorVersion("1").first(), "0").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "Sandbox", apiVersion: p_version_repository.findByMajorVersionAndMinorVersion(p_major_version_repository.findByMajorVersion("0").first(), "0").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "FT2 Development", apiVersion: p_version_repository.findByMajorVersionAndMinorVersion(p_major_version_repository.findByMajorVersion("2").first(), "0").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "Data Preparation", apiVersion: p_version_repository.findByMajorVersionAndMinorVersion(p_major_version_repository.findByMajorVersion("0").first(), "0").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Default Single Currency 0.0.x", endpoint:  p_endpoint_repository.findByEndpointName("Unexposed 0.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Default Multi Currency 0.0.x", endpoint:  p_endpoint_repository.findByEndpointName("Unexposed 0.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Default Single Currency 1.0.x", endpoint:  p_endpoint_repository.findByEndpointName("Unexposed 1.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Default Multi Currency 1.0.x", endpoint:  p_endpoint_repository.findByEndpointName("Unexposed 1.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Default Single Currency 2.0.x", endpoint:  p_endpoint_repository.findByEndpointName("Unexposed 2.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Default Multi Currency 2.0.x", endpoint:  p_endpoint_repository.findByEndpointName("Unexposed 2.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Whitelabeled Multi Currency (Staging)", endpoint:  p_endpoint_repository.findByEndpointName("Staging").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "GFS Single Currency (Staging)", endpoint:  p_endpoint_repository.findByEndpointName("Staging").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "LMN Multi Currency Native (FT2 Development)", endpoint:  p_endpoint_repository.findByEndpointName("FT2 Development").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "React", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "LMN Multi Currency React (FT2 Development)", endpoint:  p_endpoint_repository.findByEndpointName("FT2 Development").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Whitelabeled Single Currency (Sandbox)", endpoint:  p_endpoint_repository.findByEndpointName("Sandbox").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Whitelabeled Multi Currency (Sandbox)", endpoint:  p_endpoint_repository.findByEndpointName("Sandbox").first()))
    }
}
