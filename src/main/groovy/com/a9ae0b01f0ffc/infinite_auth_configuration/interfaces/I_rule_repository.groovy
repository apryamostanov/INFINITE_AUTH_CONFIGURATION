package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Authorization
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Rule
import groovy.transform.CompileStatic
import io.swagger.annotations.Api
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@CompileStatic
@Api
@RepositoryRestResource
interface I_rule_repository extends PagingAndSortingRepository<Rule, Long> {



}
