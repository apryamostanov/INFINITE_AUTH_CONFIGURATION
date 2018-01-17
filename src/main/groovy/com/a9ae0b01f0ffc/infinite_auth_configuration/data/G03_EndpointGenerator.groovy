package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Endpoint
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_endpoint_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_version_repository
import org.springframework.stereotype.Component

@Component
class G03_EndpointGenerator {

    void generate_data(I_endpoint_repository p_endpoint_repository, I_version_repository p_version_repository) {
        Set<Endpoint> l_entity_set = new HashSet<Endpoint>()
        l_entity_set.add(new Endpoint(endpointName: "Development", apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        l_entity_set.add(new Endpoint(endpointName: "Staging", apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        l_entity_set.add(new Endpoint(endpointName: "Sandbox", apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
        l_entity_set.add(new Endpoint(endpointName: "FT2 Development", apiVersion: p_version_repository.findByVersionName("2.0.x").first()))
        l_entity_set.add(new Endpoint(endpointName: "Data Preparation", apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
        p_endpoint_repository.save(l_entity_set)

    }

}
