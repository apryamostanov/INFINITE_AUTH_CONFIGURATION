package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Url
import groovy.transform.CompileStatic
import io.swagger.annotations.Api
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@CompileStatic
@Api
@RepositoryRestResource
interface I_url_repository extends PagingAndSortingRepository<Url, Long> {

}
