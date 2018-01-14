package com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Version
import groovy.transform.CompileStatic

import javax.persistence.*

import static base.T_common_base_1_const.GC_EMPTY_STRING
import static base.T_common_base_1_const.GC_NULL_OBJ_REF

/**@ApiModel(description = "Consumed by Accessor Authentication Provider (e.g. Accessor_data module). Groups authorization rules (Authorization, Identity, Scope definitions). Defines Set of client software allowed (or restricted) for accessing the API - and their corresponding identification mappings.")*/
@CompileStatic
@Entity
class Accessor {

    /***/
    String resourceName = this.getClass().getSimpleName()

    /**@ApiModelProperty(example = "0", value = "Internal field. Priority for Accessor identity provider matching. All accessor definitions are sorted with this field - and those with higher priority - matched first within Accessor authentication provider")*/
    Integer lookupPriority = GC_NULL_OBJ_REF as Integer

    /**@ApiModelProperty(example = "Whitelabel-S.x", value = "Matching field. Client software name, hardcoded on the client side. E.g. name of the app. Supported wildcard value \"Any\".")*/
    String appName = GC_EMPTY_STRING

    /**@ApiModelProperty(example = "Any accessor Multi Currency 1.0.x", value = "Output field. Internal name of the accessor record.")*/
    String accessorName = GC_EMPTY_STRING

    /**@ApiModelProperty(example = "React", value = "Matching field. Client software platform name (iOS, Android, React), hardcoded on the client side. E.g. name of the app. Supported wildcard value \"Any\".")*/
    String platform = GC_EMPTY_STRING

    /**@ApiModelProperty(example = "0.6.1", value = "Matching field. Client software platform name (iOS, Android, React), hardcoded on the client side. E.g. name of the app. Supported wildcard value \"Any\".")*/
    String appVersion = GC_EMPTY_STRING

    /**@ApiModelProperty(example = "john.doe", value = "Matching field. Application user. Allows overriding authorization rules level of specific user. Supported wildcard value \"Any\".")*/
    String user = GC_EMPTY_STRING

    /**@ApiModelProperty(example = "1101", value = "Matching field. Program manager/business associate ID (in case there are multiple app names for same FIID) - hardcoded at app. Allows overriding authorization rules level of specific FIID. Supported wildcard value \"Any\".")*/
    String FIID = GC_EMPTY_STRING

    /**@ApiModelProperty(example = "2209", value = "Matching field. Application product. Allows overriding authorization rules level of specific product. Supported wildcard value \"Any\".")*/
    String product = GC_EMPTY_STRING

    /**@ApiModelProperty(example = "Multicurrency", value = "Matching field. Application product group. Allows overriding authorization rules level of specific product group. Supported wildcard value \"Any\".")*/
    String productGroup = GC_EMPTY_STRING

    /**@ApiModelProperty(example = "0", value = "Optional output field. Indicates that this specific accessor is banned - for Accessor authentication provider. E.g. to restrict clients with outdated unsupported API versions")*/
    Integer isForbidden = GC_NULL_OBJ_REF as Integer

    /**@ApiModelProperty(value = "Matching field. Endpoint ID/object as configured on web app instance (granting server). Allows overriding authorization rules level of specific endpoint. Supported wildcard value \"null\". Same value should be in Authorization Validation web app endpoint configuration.")*/
    @ManyToOne(fetch = FetchType.EAGER)
    Endpoint endpoint = GC_NULL_OBJ_REF as Endpoint

    /**@ApiModelProperty(value = "Optional output field. Indicates the accessor record containing configuration groups (Authorizations, Identities, Scopes) - which are not defined at this child accessor level")*/
    @ManyToOne(fetch = FetchType.EAGER)
    Accessor parentAccessor = GC_NULL_OBJ_REF as Accessor

    /**@ApiModelProperty(value = "Matching field. API version (combination of minor and major versions). Allows overriding authorization rules level of specific API version. Supported wildcard value \"null\". Same value should be in Authorization Validation web app endpoint configuration.")*/
    @ManyToOne(fetch = FetchType.EAGER)
    Version apiVersion = GC_NULL_OBJ_REF as Version

    /**@ApiModelProperty(example = "1", value = "Accessor id, generated field")*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Long id

}
