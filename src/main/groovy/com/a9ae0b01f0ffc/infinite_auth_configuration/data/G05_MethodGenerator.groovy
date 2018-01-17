package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Accessor
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Method
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_method_repository
import org.springframework.stereotype.Component

@Component
class G05_MethodGenerator {

    void generate_data(I_method_repository p_method_repository) {
        Set<Accessor> l_entity_set = new HashSet<Accessor>()
        l_entity_set.add(new Method(methodName: "GET"))
        l_entity_set.add(new Method(methodName: "POST"))
        l_entity_set.add(new Method(methodName: "PUT"))
        l_entity_set.add(new Method(methodName: "DELETE"))
        l_entity_set.add(new Method(methodName: "OPTIONS"))
        l_entity_set.add(new Method(methodName: "HEAD"))
        p_method_repository.save(l_entity_set)
    }

}
