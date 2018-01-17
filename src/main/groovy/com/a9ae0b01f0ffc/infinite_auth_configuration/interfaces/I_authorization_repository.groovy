package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Authorization
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Scope
import groovy.transform.CompileStatic
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@CompileStatic
@RepositoryRestResource
interface I_authorization_repository extends PagingAndSortingRepository<Authorization, Long> {

    Set<Authorization> findByScope(@Param("scope") Scope scope)

    Set<Authorization> findByAuthorizationName(@Param("authorizationName") String authorizationName)

}
