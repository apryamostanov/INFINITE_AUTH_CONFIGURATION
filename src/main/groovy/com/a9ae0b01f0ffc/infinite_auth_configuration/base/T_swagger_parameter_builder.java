package com.a9ae0b01f0ffc.infinite_auth_configuration.base;

import groovy.transform.CompileStatic;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.ParameterBuilderPlugin;
import springfox.documentation.spi.service.contexts.ParameterContext;
import springfox.documentation.swagger.common.SwaggerPluginSupport;

@Component
@CompileStatic
@Order(SwaggerPluginSupport.SWAGGER_PLUGIN_ORDER + 1000)
public class T_swagger_parameter_builder implements ParameterBuilderPlugin {
    @Override
    public boolean supports(DocumentationType delimiter) {
        return true;
    }

    public void apply(ParameterContext parameterContext) {
        if (parameterContext.getOperationContext().httpMethod().matches("POST")) {
            if (parameterContext.resolvedMethodParameter().defaultName().isPresent() &&
                    parameterContext.resolvedMethodParameter().defaultName().toString().equalsIgnoreCase("Optional.of(id)")) {

                parameterContext.parameterBuilder().hidden(true);

            }

        }
    }

}
