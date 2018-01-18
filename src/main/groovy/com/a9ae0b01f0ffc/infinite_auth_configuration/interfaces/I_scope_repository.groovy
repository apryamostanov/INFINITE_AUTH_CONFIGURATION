package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Accessor
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Scope
import groovy.transform.CompileStatic
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@CompileStatic
@RepositoryRestResource
interface I_scope_repository extends PagingAndSortingRepository<Scope, Long> {

    Set<Scope> findByScopeName(@Param("scopeName") String scopeName)

    Set<Scope> findByScopeNameAndAccessor(@Param("scopeName") String scopeName, @Param("accessor") Accessor accessor)

}
