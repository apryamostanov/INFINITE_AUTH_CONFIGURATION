package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Accessor
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Scope
import groovy.transform.CompileStatic
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@CompileStatic
@RepositoryRestResource
interface I_scope_repository extends PagingAndSortingRepository<Scope, Long> {

    Set<Scope> findByScopeName(@Param("scopeName") String scopeName)

    /*@Query("""select s from Scope s where
        s.scopeName = :scopeName and ((:accessor is not null and s.accessor = :accessor) or (:accessor is null and s.accessor is null))""")*/
    Set<Scope> findByScopeNameAndAccessor(@Param("scopeName") String scopeName, @Param("accessor") Accessor accessor)

}
