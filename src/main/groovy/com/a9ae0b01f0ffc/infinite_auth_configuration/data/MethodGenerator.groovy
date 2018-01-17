package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Method
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_method_repository
import org.springframework.stereotype.Component

@Component
class MethodGenerator {

    void generate_data(I_method_repository p_method_repository) {
        p_method_repository.save(new Method(methodName: "GET"))
        p_method_repository.save(new Method(methodName: "POST"))
        p_method_repository.save(new Method(methodName: "PUT"))
        p_method_repository.save(new Method(methodName: "DELETE"))
        p_method_repository.save(new Method(methodName: "OPTIONS"))
        p_method_repository.save(new Method(methodName: "HEAD"))
    }

}
