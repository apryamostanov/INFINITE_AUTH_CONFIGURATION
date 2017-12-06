package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.DataField
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Resource
import groovy.transform.CompileStatic
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param

@CompileStatic
interface I_data_field_repository extends PagingAndSortingRepository<DataField, Long> {

    List<DataField> findByFieldNameAndFieldValue(@Param("fieldName") String fieldName, @Param("fieldValue") String fieldValue)

}
