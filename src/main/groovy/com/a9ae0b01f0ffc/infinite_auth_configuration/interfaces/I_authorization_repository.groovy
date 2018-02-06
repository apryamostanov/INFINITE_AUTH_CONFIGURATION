package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Accessor
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Authorization
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Scope
import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@CompileStatic
@RepositoryRestResource
interface I_authorization_repository extends PagingAndSortingRepository<Authorization, Long> {


    Set<Authorization> findByAuthorizationName(@Param("authorizationName") String authorizationName)

    Set<Authorization> findByAuthorizationNameAndAccessor(@Param("authorizationName") String authorizationName, @Param("accessor") Accessor accessor)


    @Query("""select a from Authorization a
        join a.identitySet identitySet
        join a.scopeSet scopeSet
        where scopeSet = :scope
        and a.accessor = :accessor
        and (identitySet.identityName = :identityName or :identityName is null)
        and a.authorizationType = nvl(:authorizationType, 'Access')""")
    Set<Authorization> matchAuthorizations(@Param("scope") Scope scope, @Param("accessor") Accessor accessor, @Param("identityName") String identityName, @Param("authorizationType") String authorizationType)

}
