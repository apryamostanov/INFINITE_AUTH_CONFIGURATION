package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Scope
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Token
import groovy.transform.CompileStatic
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@CompileStatic
@RepositoryRestResource
interface I_token_repository extends PagingAndSortingRepository<Token, Long> {

    Set<Token> findByScope(Scope scope)


}
