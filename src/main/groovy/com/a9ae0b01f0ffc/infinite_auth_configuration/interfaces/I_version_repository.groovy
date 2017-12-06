package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.*
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.*
import groovy.transform.CompileStatic
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param

@CompileStatic
interface I_version_repository extends PagingAndSortingRepository<Version, Long> {

    List<Version> findByVersionName(@Param("versionName") String versionName)

}
