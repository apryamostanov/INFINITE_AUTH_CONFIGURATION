package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Accessor
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_accessor_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_endpoint_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_version_repository
import org.springframework.stereotype.Component

import static com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_4_const.GC_ANY_ENDPOINT

@Component
class AccessorGenerator {

    void generate_data(I_accessor_repository p_accessor_repository, I_endpoint_repository p_endpoint_repository, I_version_repository p_version_repository) {
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Single Currency", accessorName: "Any accessor Single Currency 0.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Multi Currency", accessorName: "Any accessor Multi Currency 0.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Single Currency", accessorName: "Any accessor Single Currency 1.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Multi Currency", accessorName: "Any accessor Multi Currency 1.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Single Currency", accessorName: "Any accessor Single Currency 2.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("2.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Multi Currency", accessorName: "Any accessor Multi Currency 2.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("2.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Whitelabeled Multi Currency (Staging)", appName: "Whitelabeled Multi Currency (Staging)", endpoint: p_endpoint_repository.findByEndpointName("Staging").first(), apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "GFS Single Currency (Staging)", appName: "GFS Single Currency (Staging)", endpoint: p_endpoint_repository.findByEndpointName("Staging").first(), apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "LMN Multi Currency Native (FT2 Development)", appName: "LMN Multi Currency Native (FT2 Development)", endpoint: p_endpoint_repository.findByEndpointName("FT2 Development").first(), apiVersion: p_version_repository.findByVersionName("2.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "React", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "LMN Multi Currency React (FT2 Development)", appName: "LMN Multi Currency React (FT2 Development)", endpoint: p_endpoint_repository.findByEndpointName("FT2 Development").first(), apiVersion: p_version_repository.findByVersionName("2.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "", appName: "Whitelabeled Single Currency (Sandbox)", endpoint: p_endpoint_repository.findByEndpointName("Sandbox").first(), apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Whitelabeled Multi Currency (Sandbox)", appName: "Whitelabeled Multi Currency (Sandbox)", endpoint: p_endpoint_repository.findByEndpointName("Sandbox").first(), apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
    }

}
