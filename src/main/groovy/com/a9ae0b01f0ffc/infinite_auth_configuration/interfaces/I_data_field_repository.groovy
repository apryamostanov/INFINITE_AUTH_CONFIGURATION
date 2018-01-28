package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Field
import groovy.transform.CompileStatic
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@CompileStatic
@RepositoryRestResource
interface I_data_field_repository extends PagingAndSortingRepository<Field, Long> {

    Set<Field> findByFieldName(@Param("fieldName") String fieldName)

}
