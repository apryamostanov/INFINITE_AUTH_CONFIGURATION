package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.*
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.*
import groovy.transform.CompileStatic
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.web.bind.annotation.RequestParam

@CompileStatic
@Api
@RepositoryRestResource
interface I_resource_repository extends PagingAndSortingRepository<Resource, Long> {

    @ApiOperation("Find by Name")
    Set<Resource> findByResourceName(@Param("resourceName") @RequestParam @ApiParam(name = "resourceName", value="Name") String resourceName)

}
