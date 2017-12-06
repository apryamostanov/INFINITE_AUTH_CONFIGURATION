package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Url
import groovy.transform.CompileStatic
import org.springframework.data.repository.PagingAndSortingRepository

@CompileStatic
interface I_url_repository extends PagingAndSortingRepository<Url, Long> {

}
