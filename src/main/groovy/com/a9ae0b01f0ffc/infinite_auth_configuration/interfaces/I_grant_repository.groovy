package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.DataField
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Grant
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Resource
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
interface I_grant_repository extends PagingAndSortingRepository<Grant, Long> {

    @ApiOperation("Find by Resource")
    Set<Grant> findByResource(@Param("resource") @RequestParam @ApiParam(name = "resource", value="Resource") Resource resource)

}
