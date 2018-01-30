package com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Accessor
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Authorization
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Identity
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Scope
import groovy.transform.CompileStatic
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@CompileStatic
@RepositoryRestResource
interface I_authorization_repository extends PagingAndSortingRepository<Authorization, Long> {

    Set<Authorization> findByScope(@Param("scope") Scope scope)

    Set<Authorization> findByAuthorizationName(@Param("authorizationName") String authorizationName)

    Set<Authorization> findByAuthorizationNameAndAccessor(@Param("authorizationName") String authorizationName, @Param("accessor") Accessor accessor)

    Set<Authorization> findByScopeAndAuthorizationType(@Param("scope") Scope scope, @Param("authorizationType") String authorizationType)

    @Query("""select a from Authorization a where
        a.scope = :scope
        and a.authorizationType = nvl(:authorizationType, 'Access')
        and a.accessor = :accessor""")
    Set<Authorization> findByScopeAndAuthorizationTypeAndAccessor(@Param("scope") Scope scope, @Param("authorizationType") String authorizationType, @Param("accessor") Accessor accessor)

    @Query("""select a from Authorization a where
        a.scope = :scope
        and a.authorizationType = nvl(:authorizationType, 'Access')
        and a.identity = :identity
        and a.accessor = :accessor""")
    Set<Authorization> findByScopeAndAuthorizationTypeAndAccessorAndIdentity(@Param("scope") Scope scope, @Param("authorizationType") String authorizationType, @Param("accessor") Accessor accessor, @Param("identity") Identity identity)

    @Query("""select a from Authorization a where
        a.scope = :scope
        and a.authorizationType = nvl(:authorizationType, 'Access')
        and a.accessor is null""")
    Set<Authorization> findByScopeAndAuthorizationTypeAndDefaultAccessor(@Param("scope") Scope scope, @Param("authorizationType") String authorizationType)

    @Query("""select a from Authorization a where
        a.scope = :scope
        and a.authorizationType = nvl(:authorizationType, 'Access')
        and a.identity = :identity
        and a.accessor is null""")
    Set<Authorization> findByScopeAndAuthorizationTypeAndDefaultAccessorAndIdentity(@Param("scope") Scope scope, @Param("authorizationType") String authorizationType, @Param("identity") Identity identity)

}
