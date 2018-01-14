package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.DataField
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
interface I_data_field_repository extends PagingAndSortingRepository<DataField, Long> {

    @ApiOperation("Find by Name and Value")
    Set<DataField> findByFieldNameAndFieldValue(@Param("fieldName") @RequestParam @ApiParam(name = "fieldName", value="Name") String fieldName, @Param("fieldValue") @RequestParam @ApiParam(name = "fieldValue", value="Value") String fieldValue)

}
