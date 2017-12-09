package com.a9ae0b01f0ffc.infinite_auth_configuration

import com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_5_context
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.*
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration
import springfox.documentation.swagger2.annotations.EnableSwagger2

import static com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_4_const.GC_ANY_ENDPOINT

@SpringBootApplication
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)
class T_spring_boot_application implements CommandLineRunner {

    static void main(String[] args) {
        SpringApplication.run(T_spring_boot_application.class, args)
    }

    @Autowired
    private I_accessor_repository p_accessor_repository
    @Autowired
    private I_authentication_repository p_authentication_repository
    @Autowired
    private I_authorization_repository p_authorization_repository
    @Autowired
    private I_data_field_repository p_data_field_repository
    @Autowired
    private I_endpoint_repository p_endpoint_repository
    @Autowired
    private I_identity_repository p_identity_repository
    @Autowired
    private I_method_repository p_method_repository
    @Autowired
    private I_resource_repository p_resource_repository
    @Autowired
    private I_scope_repository p_scope_repository
    @Autowired
    private I_version_repository p_version_repository
    @Autowired
    private I_grant_repository p_grant_repository
    @Autowired
    private I_grant_repository p_url_repository
    @Autowired
    private I_rule_repository p_rule_repository
    @Autowired
    private T_auth_base_5_context p_auth_base_5_context

    @Override
    void run(String... args) throws Exception {
        p_resource_repository.save(new Resource(resourceName: "AccountCreation"))//0
        p_resource_repository.save(new Resource(resourceName: "AddWalletToAccount"))//0
        p_resource_repository.save(new Resource(resourceName: "CardActivationSS"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "CardActivationValidationParameterSS"))//0
        p_resource_repository.save(new Resource(resourceName: "CardholderUnloadFunds"))//0
        p_resource_repository.save(new Resource(resourceName: "CardLockUnlockRequest"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "CardSearch"))//0
        p_resource_repository.save(new Resource(resourceName: "ChangePassword"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "DeliverOTP"))//0
        p_resource_repository.save(new Resource(resourceName: "ForgotPassword"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "ForgotPasswordValidationParameter"))//0
        p_resource_repository.save(new Resource(resourceName: "ForgotUserId"))//0
        p_resource_repository.save(new Resource(resourceName: "ForgotUserIdValidationParameter"))//0
        p_resource_repository.save(new Resource(resourceName: "FXRateSearch"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "GetCardDetail"))//0
        p_resource_repository.save(new Resource(resourceName: "GetCVC"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "GetProductParameters"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "GetSecretKey"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "GetTransactionDetail"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "GetTransactionHistory"))//0
        p_resource_repository.save(new Resource(resourceName: "ListStatementDate"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "MultiCurrencyLoad"))//0
        p_resource_repository.save(new Resource(resourceName: "MultiCurrencyUnload"))//0
        p_resource_repository.save(new Resource(resourceName: "ResetPassword"))//0
        p_resource_repository.save(new Resource(resourceName: "ResetSecondaryCardLimit"))//0
        p_resource_repository.save(new Resource(resourceName: "SearchWalletAccount"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "SecondaryCardCreation"))//0
        p_resource_repository.save(new Resource(resourceName: "SelfServiceLogin"))//0
        p_resource_repository.save(new Resource(resourceName: "StatementInformationMultiCurrency"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "StatementsInformation"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "UpdateCardStatus"))//0
        p_resource_repository.save(new Resource(resourceName: "UpdateCustomerDetails"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "UpdateWalletPriority"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "UserRegistration"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "UserRegistrationValidationParameters"))//0
        p_resource_repository.save(new Resource(resourceName: "VirtualCardCreate"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "VirtualCardUpdate"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "W2WTransferConfirm"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "W2WTransferInitiate"))//0
        p_resource_repository.save(new Resource(resourceName: "CardActivationValidationParameterSSEnhanced"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "CardSearchEnhanced"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "ForgotPasswordValidationParameterEnhanced"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "ForgotUserIdValidationParameterEnhanced"))//0
        p_resource_repository.save(new Resource(resourceName: "GetCardDetailEnhanced"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "GetTransactionHistory"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "ResetPasswordEnhanced"))//0
        p_resource_repository.save(new Resource(resourceName: "UserRegistrationValidationParametersEnhanced"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "W2WTransferInitiateEnhanced"))//0,1,2
        p_resource_repository.save(new Resource(resourceName: "Authenticate"))//0,1
        p_resource_repository.save(new Resource(resourceName: "RefreshToken"))//0,1
        p_resource_repository.save(new Resource(resourceName: "ForgotPIN"))//2
        p_resource_repository.save(new Resource(resourceName: "ForgotPINValidationParameters"))//2
        p_resource_repository.save(new Resource(resourceName: "GenerateOTP"))//2
        p_resource_repository.save(new Resource(resourceName: "SendOTPSMS"))//2
        p_resource_repository.save(new Resource(resourceName: "ValidateOTP"))//2
        p_resource_repository.save(new Resource(resourceName: "ValidateOTPSMS"))//2
        p_resource_repository.save(new Resource(resourceName: "ForgotUserId"))//2
        p_resource_repository.save(new Resource(resourceName: "ForgotUserIdValidationParametersEnhanced"))//2
        p_resource_repository.save(new Resource(resourceName: "UpdateProfileWithoutPhone"))//2
        p_resource_repository.save(new Resource(resourceName: "UpdateProfileWithPhone"))//2
        p_resource_repository.save(new Resource(resourceName: "SetAnswers"))//2
        p_resource_repository.save(new Resource(resourceName: "Document"))//2
        p_resource_repository.save(new Resource(resourceName: "Document_metadata"))//2
        p_resource_repository.save(new Resource(resourceName: "Transaction_attributes"))//2
        p_resource_repository.save(new Resource(resourceName: "GetProductParametersEnhanced"))//2
        Version l_version = new Version()
        p_version_repository.save(new Version(versionName: "0.0.x", resourceList: [
                p_resource_repository.findByResourceName("AccountCreation").first(),
                p_resource_repository.findByResourceName("AddWalletToAccount").first(),
                p_resource_repository.findByResourceName("CardActivationSS").first(),
                p_resource_repository.findByResourceName("CardActivationValidationParameterSS").first(),
                p_resource_repository.findByResourceName("CardholderUnloadFunds").first(),
                p_resource_repository.findByResourceName("CardLockUnlockRequest").first(),
                p_resource_repository.findByResourceName("CardSearch").first(),
                p_resource_repository.findByResourceName("ChangePassword").first(),
                p_resource_repository.findByResourceName("DeliverOTP").first(),
                p_resource_repository.findByResourceName("ForgotPassword").first(),
                p_resource_repository.findByResourceName("ForgotPasswordValidationParameter").first(),
                p_resource_repository.findByResourceName("ForgotUserId").first(),
                p_resource_repository.findByResourceName("ForgotUserIdValidationParameter").first(),
                p_resource_repository.findByResourceName("FXRateSearch").first(),
                p_resource_repository.findByResourceName("GetCardDetail").first(),
                p_resource_repository.findByResourceName("GetCVC").first(),
                p_resource_repository.findByResourceName("GetProductParameters").first(),
                p_resource_repository.findByResourceName("GetSecretKey").first(),
                p_resource_repository.findByResourceName("GetTransactionDetail").first(),
                p_resource_repository.findByResourceName("GetTransactionHistory").first(),
                p_resource_repository.findByResourceName("ListStatementDate").first(),
                p_resource_repository.findByResourceName("MultiCurrencyLoad").first(),
                p_resource_repository.findByResourceName("MultiCurrencyUnload").first(),
                p_resource_repository.findByResourceName("ResetPassword").first(),
                p_resource_repository.findByResourceName("ResetSecondaryCardLimit").first(),
                p_resource_repository.findByResourceName("SearchWalletAccount").first(),
                p_resource_repository.findByResourceName("SecondaryCardCreation").first(),
                p_resource_repository.findByResourceName("SelfServiceLogin").first(),
                p_resource_repository.findByResourceName("StatementInformationMultiCurrency").first(),
                p_resource_repository.findByResourceName("StatementsInformation").first(),
                p_resource_repository.findByResourceName("UpdateCardStatus").first(),
                p_resource_repository.findByResourceName("UpdateCustomerDetails").first(),
                p_resource_repository.findByResourceName("UpdateWalletPriority").first(),
                p_resource_repository.findByResourceName("UserRegistration").first(),
                p_resource_repository.findByResourceName("UserRegistrationValidationParameters").first(),
                p_resource_repository.findByResourceName("VirtualCardCreate").first(),
                p_resource_repository.findByResourceName("VirtualCardUpdate").first(),
                p_resource_repository.findByResourceName("W2WTransferConfirm").first(),
                p_resource_repository.findByResourceName("W2WTransferInitiate").first(),
                p_resource_repository.findByResourceName("CardActivationValidationParameterSSEnhanced").first(),
                p_resource_repository.findByResourceName("CardSearchEnhanced").first(),
                p_resource_repository.findByResourceName("ForgotPasswordValidationParameterEnhanced").first(),
                p_resource_repository.findByResourceName("ForgotUserIdValidationParameterEnhanced").first(),
                p_resource_repository.findByResourceName("GetCardDetailEnhanced").first(),
                p_resource_repository.findByResourceName("GetTransactionHistory").first(),
                p_resource_repository.findByResourceName("ResetPasswordEnhanced").first(),
                p_resource_repository.findByResourceName("UserRegistrationValidationParametersEnhanced").first(),
                p_resource_repository.findByResourceName("W2WTransferInitiateEnhanced").first(),
                p_resource_repository.findByResourceName("Authenticate").first(),
                p_resource_repository.findByResourceName("RefreshToken").first()
        ]))
        p_version_repository.save(new Version(versionName: "1.0.x", resourceList: [
                p_resource_repository.findByResourceName("CardActivationSS").first(),
                p_resource_repository.findByResourceName("CardLockUnlockRequest").first(),
                p_resource_repository.findByResourceName("ChangePassword").first(),
                p_resource_repository.findByResourceName("ForgotPassword").first(),
                p_resource_repository.findByResourceName("FXRateSearch").first(),
                p_resource_repository.findByResourceName("GetCVC").first(),
                p_resource_repository.findByResourceName("GetProductParameters").first(),
                p_resource_repository.findByResourceName("GetSecretKey").first(),
                p_resource_repository.findByResourceName("GetTransactionDetail").first(),
                p_resource_repository.findByResourceName("ListStatementDate").first(),
                p_resource_repository.findByResourceName("SearchWalletAccount").first(),
                p_resource_repository.findByResourceName("StatementInformationMultiCurrency").first(),
                p_resource_repository.findByResourceName("StatementsInformation").first(),
                p_resource_repository.findByResourceName("UpdateCustomerDetails").first(),
                p_resource_repository.findByResourceName("UpdateWalletPriority").first(),
                p_resource_repository.findByResourceName("UserRegistration").first(),
                p_resource_repository.findByResourceName("VirtualCardCreate").first(),
                p_resource_repository.findByResourceName("VirtualCardUpdate").first(),
                p_resource_repository.findByResourceName("W2WTransferConfirm").first(),
                p_resource_repository.findByResourceName("CardActivationValidationParameterSSEnhanced").first(),
                p_resource_repository.findByResourceName("CardSearchEnhanced").first(),
                p_resource_repository.findByResourceName("ForgotPasswordValidationParameterEnhanced").first(),
                p_resource_repository.findByResourceName("GetCardDetailEnhanced").first(),
                p_resource_repository.findByResourceName("GetTransactionHistory").first(),
                p_resource_repository.findByResourceName("UserRegistrationValidationParametersEnhanced").first(),
                p_resource_repository.findByResourceName("W2WTransferInitiateEnhanced").first(),
                p_resource_repository.findByResourceName("Authenticate").first(),
                p_resource_repository.findByResourceName("RefreshToken").first()
        ]))
        p_version_repository.save(new Version(versionName: "2.0.x", resourceList: [
                p_resource_repository.findByResourceName("CardActivationSS").first(),
                p_resource_repository.findByResourceName("CardLockUnlockRequest").first(),
                p_resource_repository.findByResourceName("ChangePassword").first(),
                p_resource_repository.findByResourceName("ForgotPassword").first(),
                p_resource_repository.findByResourceName("FXRateSearch").first(),
                p_resource_repository.findByResourceName("GetCVC").first(),
                p_resource_repository.findByResourceName("GetProductParameters").first(),
                p_resource_repository.findByResourceName("GetSecretKey").first(),
                p_resource_repository.findByResourceName("GetTransactionDetail").first(),
                p_resource_repository.findByResourceName("ListStatementDate").first(),
                p_resource_repository.findByResourceName("SearchWalletAccount").first(),
                p_resource_repository.findByResourceName("StatementInformationMultiCurrency").first(),
                p_resource_repository.findByResourceName("StatementsInformation").first(),
                p_resource_repository.findByResourceName("UpdateCustomerDetails").first(),
                p_resource_repository.findByResourceName("UpdateWalletPriority").first(),
                p_resource_repository.findByResourceName("UserRegistration").first(),
                p_resource_repository.findByResourceName("VirtualCardCreate").first(),
                p_resource_repository.findByResourceName("VirtualCardUpdate").first(),
                p_resource_repository.findByResourceName("W2WTransferConfirm").first(),
                p_resource_repository.findByResourceName("CardActivationValidationParameterSSEnhanced").first(),
                p_resource_repository.findByResourceName("CardSearchEnhanced").first(),
                p_resource_repository.findByResourceName("ForgotPasswordValidationParameterEnhanced").first(),
                p_resource_repository.findByResourceName("GetCardDetailEnhanced").first(),
                p_resource_repository.findByResourceName("GetTransactionHistory").first(),
                p_resource_repository.findByResourceName("UserRegistrationValidationParametersEnhanced").first(),
                p_resource_repository.findByResourceName("W2WTransferInitiateEnhanced").first(),
                p_resource_repository.findByResourceName("ForgotPIN").first(),
                p_resource_repository.findByResourceName("ForgotPINValidationParameters").first(),
                p_resource_repository.findByResourceName("GenerateOTP").first(),
                p_resource_repository.findByResourceName("SendOTPSMS").first(),
                p_resource_repository.findByResourceName("ValidateOTP").first(),
                p_resource_repository.findByResourceName("ValidateOTPSMS").first(),
                p_resource_repository.findByResourceName("ForgotUserId").first(),
                p_resource_repository.findByResourceName("ForgotUserIdValidationParametersEnhanced").first(),
                p_resource_repository.findByResourceName("UpdateProfileWithoutPhone").first(),
                p_resource_repository.findByResourceName("UpdateProfileWithPhone").first(),
                p_resource_repository.findByResourceName("SetAnswers").first(),
                p_resource_repository.findByResourceName("Document").first(),
                p_resource_repository.findByResourceName("Document_metadata").first(),
                p_resource_repository.findByResourceName("Transaction_attributes").first(),
                p_resource_repository.findByResourceName("GetProductParametersEnhanced").first()
        ]))
        p_endpoint_repository.save(new Endpoint(endpointName: "Development", apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "Staging", apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "Sandbox", apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "FT2 Development", apiVersion: p_version_repository.findByVersionName("2.0.x").first()))
        p_endpoint_repository.save(new Endpoint(endpointName: "Data Preparation", apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
//accessor should have API version as well, multicurrency flag, separate accessor name and app name, accessor hierarchy instead of priorities
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Single Currency", accessorName: "Any accessor Single Currency 0.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Multi Currency", accessorName: "Any accessor Multi Currency 0.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Single Currency", accessorName: "Any accessor Single Currency 1.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Multi Currency", accessorName: "Any accessor Multi Currency 1.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Single Currency", accessorName: "Any accessor Single Currency 2.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("2.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 0, platform: "Any", appVersion: "Any", user: "Any", FIID: "Any", product: "Any", productGroup: "Multi Currency", accessorName: "Any accessor Multi Currency 2.0.x", appName: "Any", endpoint: GC_ANY_ENDPOINT, apiVersion: p_version_repository.findByVersionName("2.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Whitelabeled Multi Currency (Staging)", appName: "Whitelabeled Multi Currency (Staging)", endpoint: p_endpoint_repository.findByEndpointName("Staging").first(), apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "GFS Single Currency (Staging)", appName: "GFS Single Currency (Staging)", endpoint: p_endpoint_repository.findByEndpointName("Staging").first(), apiVersion: p_version_repository.findByVersionName("1.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "LMN Multi Currency Native (FT2 Development)", appName: "LMN Multi Currency Native (FT2 Development)", endpoint: p_endpoint_repository.findByEndpointName("FT2 Development").first(), apiVersion: p_version_repository.findByVersionName("2.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "React", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "LMN Multi Currency React (FT2 Development)", appName: "LMN Multi Currency React (FT2 Development)", endpoint: p_endpoint_repository.findByEndpointName("FT2 Development").first(), apiVersion: p_version_repository.findByVersionName("2.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "", appName: "Whitelabeled Single Currency (Sandbox)", endpoint: p_endpoint_repository.findByEndpointName("Sandbox").first(), apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
        p_accessor_repository.save(new Accessor(lookupPriority: 1, platform: "Any", appVersion: "Any", user: "Any", FIID: "1100", product: "Any", accessorName: "Whitelabeled Multi Currency (Sandbox)", appName: "Whitelabeled Multi Currency (Sandbox)", endpoint: p_endpoint_repository.findByEndpointName("Sandbox").first(), apiVersion: p_version_repository.findByVersionName("0.0.x").first()))
        p_method_repository.save(new Method(methodName: "GET"))
        p_method_repository.save(new Method(methodName: "POST"))
        p_method_repository.save(new Method(methodName: "PUT"))
        p_method_repository.save(new Method(methodName: "DELETE"))
        p_method_repository.save(new Method(methodName: "OPTIONS"))
        p_method_repository.save(new Method(methodName: "HEAD"))
        p_data_field_repository.save(new DataField(fieldName: "CardNumber", fieldValue: "%CARDNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "ProxyNumber", fieldValue: "%PROXYNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "AccountNumber", fieldValue: "%ACCOUNTNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "ProductID", fieldValue: "%PRODUCTID%"))
        p_data_field_repository.save(new DataField(fieldName: "accessor_id", fieldValue: "%ACCESSORID%"))
        p_data_field_repository.save(new DataField(fieldName: "PhoneNumber", fieldValue: "%PHONENUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "phone_number", fieldValue: "%PHONENUMBER%"))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("UserRegistration").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("UserRegistrationValidationParametersEnhanced").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("CardActivationSS").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("CardActivationValidationParameterSSEnhanced").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("ForgotPassword").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("ForgotPasswordValidationParameterEnhanced").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("GetSecretKey").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("ForgotUserId").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("ForgotUserIdValidationParametersEnhanced").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Anonymous Services", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantList: [
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("UserRegistration").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("UserRegistrationValidationParametersEnhanced").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("CardActivationSS").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("CardActivationValidationParameterSSEnhanced").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ForgotPassword").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ForgotPasswordValidationParameterEnhanced").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("GetSecretKey").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ForgotUserId").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ForgotUserIdValidationParametersEnhanced").first()).first()
        ]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("GetCardDetailEnhanced").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("GetCVC").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("CardSearchEnhanced").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("W2WTransferInitiateEnhanced").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("GetTransactionHistory").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("CardLockUnlockRequest").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("FXRateSearch").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("ProductID", "%PRODUCTID%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("GetTransactionDetail").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("ListStatementDate").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("SearchWalletAccount").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("StatementInformationMultiCurrency").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("StatementsInformation").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("UpdateWalletPriority").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("VirtualCardCreate").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("VirtualCardUpdate").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("W2WTransferConfirm").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("ForgotPIN").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("ForgotPINValidationParameters").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("GenerateOTP").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("SendOTPSMS").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("ValidateOTP").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("ValidateOTPSMS").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        Url l_url_accessor_id = p_url_repository.save(new Url(url: "/%ACCESSORID%/*/*/*"))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("Document").first(), methodList: [p_method_repository.findByMethodName("GET").first()], url: l_url_accessor_id))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("Document_metadata").first(), methodList: [p_method_repository.findByMethodName("GET").first()], url: l_url_accessor_id))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("GetProductParametersEnhanced").first(), methodList: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("ProductID", "%PRODUCTID%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Main Screen", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantList: [
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("GetCardDetailEnhanced").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("GetCVC").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("CardActivationSS").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("CardActivationValidationParameterSSEnhanced").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("CardSearchEnhanced").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("UserRegistration").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("UserRegistrationValidationParametersEnhanced").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ForgotPassword").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ForgotPasswordValidationParameterEnhanced").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("W2WTransferInitiateEnhanced").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("GetTransactionHistory").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("CardLockUnlockRequest").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("FXRateSearch").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("GetSecretKey").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("GetTransactionDetail").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ListStatementDate").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("SearchWalletAccount").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("StatementInformationMultiCurrency").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("StatementsInformation").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("UpdateWalletPriority").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("VirtualCardCreate").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("VirtualCardUpdate").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("W2WTransferConfirm").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ForgotPIN").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ForgotPINValidationParameters").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("GenerateOTP").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("SendOTPSMS").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ValidateOTP").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ValidateOTPSMS").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ForgotUserId").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ForgotUserIdValidationParametersEnhanced").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("Document").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("Document_metadata").first()).first(),
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("GetProductParametersEnhanced").first()).first()
        ]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("UpdateProfileWithoutPhone").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Update Profile", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantList: [
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("UpdateProfileWithoutPhone").first()).first()
        ]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("UpdateProfileWithPhone").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("PhoneNumber", "%PHONENUMBER%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Update Phone", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantList: [
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("UpdateProfileWithPhone").first()).first()
        ]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("ChangePassword").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Change Password", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantList: [
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("ChangePassword").first()).first()
        ]))
        p_grant_repository.save(new Grant(resource: p_resource_repository.findByResourceName("SetAnswers").first(), methodList: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldList: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Change Security Answers", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantList: [
                p_grant_repository.findByResource(p_resource_repository.findByResourceName("SetAnswers").first()).first()
        ]))
        p_data_field_repository.save(new DataField(fieldName: "app_name", fieldValue: "%APPNAME%"))
        p_data_field_repository.save(new DataField(fieldName: "platform", fieldValue: "%PLATFORM%"))
        p_data_field_repository.save(new DataField(fieldName: "FIID", fieldValue: "%FIID%"))
        p_data_field_repository.save(new DataField(fieldName: "api_version", fieldValue: "%APIVERSION%"))
        p_data_field_repository.save(new DataField(fieldName: "app_version", fieldValue: "%APPVERSION%"))
        p_data_field_repository.save(new DataField(fieldName: "language", fieldValue: "%LANGUAGE%"))
        p_data_field_repository.save(new DataField(fieldName: "specific_data", fieldValue: "%SPECIFICDATA%"))
        p_data_field_repository.save(new DataField(fieldName: "username", fieldValue: "%USERNAME%"))
        p_data_field_repository.save(new DataField(fieldName: "password", fieldValue: "%PASSWORD%"))
        p_data_field_repository.save(new DataField(fieldName: "proxy_number", fieldValue: "%PROXYNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "account_number", fieldValue: "%ACCOUNTNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "old_access_token", fieldValue: "%OLDACCESSTOKEN%"))
        p_data_field_repository.save(new DataField(fieldName: "refresh_token", fieldValue: "%REFRESHTOKEN%"))
        p_data_field_repository.save(new DataField(fieldName: "otp_id", fieldValue: "%OTPID%"))
        p_data_field_repository.save(new DataField(fieldName: "OTP", fieldValue: "%OTP%"))
        p_data_field_repository.save(new DataField(fieldName: "otp", fieldValue: "%OTP%"))
        p_data_field_repository.save(new DataField(fieldName: "provisioned_data_unique_id", fieldValue: "%PROVISIONEDDATAUNIQUEID%"))
        p_data_field_repository.save(new DataField(fieldName: "provisioned_user_data_usage_authorization", fieldValue: "%PROVISIONEDUSERDATAUSAGEAUTHORIZATION%"))
        p_data_field_repository.save(new DataField(fieldName: "provisioned_data_singature", fieldValue: "%PROVISIONEDDATASINGATURE%"))
        p_data_field_repository.save(new DataField(fieldName: "provisioning_public_key", fieldValue: "%PROVISIONINGPUBLICKEY%"))
        p_data_field_repository.save(new DataField(fieldName: "DOB", fieldValue: "%DOB%"))
        p_data_field_repository.save(new DataField(fieldName: "card_type_id_enhanced", fieldValue: "%CARDTYPEIDENHANCED%"))
        p_data_field_repository.save(new DataField(fieldName: "login_flag", fieldValue: "%LOGINFLAG%"))
        p_data_field_repository.save(new DataField(fieldName: "error_number", fieldValue: "%ERRORNUMBER%"))
        p_data_field_repository.save(new DataField(fieldName: "product_id", fieldValue: "%PRODUCTID%"))
        p_data_field_repository.save(new DataField(fieldName: "username", fieldValue: "%USERNAME%"))
        p_authentication_repository.save(new Authentication(authenticationName: "Accessor_data", publicDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("accessor_id", "%ACCESSORID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("platform", "%PLATFORM%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("FIID", "%FIID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("api_version", "%APIVERSION%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("language", "%LANGUAGE%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("specific_data", "%SPECIFICDATA%").first()
        ], privateDataFieldList: [

        ], keyFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("accessor_id", "%ACCESSORID%").first()
        ], functionalFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("language", "%LANGUAGE%").first()
        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "User_data", publicDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("username", "%USERNAME%").first()
        ], privateDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("password", "%PASSWORD%").first()
        ], keyFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("card_type_id_enhanced", "%CARDTYPEIDENHANCED%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("login_flag", "%LOGINFLAG%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("error_number", "%ERRORNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ], functionalFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("product_id", "%PRODUCTID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("username", "%USERNAME%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "Refresh_data", publicDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("old_access_token", "%OLDACCESSTOKEN%").first()
        ], privateDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("refresh_token", "%REFRESHTOKEN%").first()
        ], keyFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("card_type_id_enhanced", "%CARDTYPEIDENHANCED%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("login_flag", "%LOGINFLAG%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("error_number", "%ERRORNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ], functionalFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("product_id", "%PRODUCTID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("username", "%USERNAME%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "OTP_data", publicDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("otp_id", "%OTPID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("phone_number", "%PHONENUMBER%").first()
        ], privateDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("otp", "%OTP%").first()
        ], keyFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("phone_number", "%PHONENUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldList: [

        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "Provisioned_user_data", publicDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("provisioned_data_unique_id", "%PROVISIONEDDATAUNIQUEID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("provisioned_user_data_usage_authorization", "%PROVISIONEDUSERDATAUSAGEAUTHORIZATION%").first()
        ], privateDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("provisioned_data_singature", "%PROVISIONEDDATASINGATURE%").first()
        ], keyFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldList: [

        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "Provisioning_data", publicDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("provisioning_public_key", "%PROVISIONINGPUBLICKEY%").first()
        ], privateDataFieldList: [

        ], keyFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("provisioning_public_key", "%PROVISIONINGPUBLICKEY%").first()
        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "DOB_data", publicDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], privateDataFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("DOB", "%DOB%").first()
        ], keyFieldList: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldList: [

        ]))
        p_identity_repository.save(new Identity(identityName: "Owner of Accessor Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationList: [p_authentication_repository.findByAuthenticationName("Accessor_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationList: [p_authentication_repository.findByAuthenticationName("User_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of Refresh Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationList: [p_authentication_repository.findByAuthenticationName("Refresh_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of OTP Data and User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationList: [p_authentication_repository.findByAuthenticationName("OTP_data").first(), p_authentication_repository.findByAuthenticationName("User_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of OTP Data and Provisioned User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationList: [p_authentication_repository.findByAuthenticationName("OTP_data").first(), p_authentication_repository.findByAuthenticationName("Provisioned_user_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of Provisioning Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationList: [p_authentication_repository.findByAuthenticationName("Provisioning_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of User Data and DOB Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationList: [p_authentication_repository.findByAuthenticationName("User_data").first(), p_authentication_repository.findByAuthenticationName("DOB_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of Provisioned User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationList: [p_authentication_repository.findByAuthenticationName("Provisioned_user_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of User Data and Provisioning Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationList: [p_authentication_repository.findByAuthenticationName("Provisioning_data").first()]))
        p_authorization_repository.save(new Authorization(authorizationName: "Anonymous", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), identityList: [p_identity_repository.findByIdentityName("Owner of Accessor Data").first()], scopeList: [p_scope_repository.findByScopeName("Anonymous Services").first()]))
        p_authorization_repository.save(new Authorization(authorizationName: "Read", prerequisiteAuthorization: p_authorization_repository.findByAuthorizationName("Anonymous").first(), accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), identityList: [p_identity_repository.findByIdentityName("Owner of User Data").first(), p_identity_repository.findByIdentityName("Owner of Refresh Data").first()], scopeList: [p_scope_repository.findByScopeName("Main Screen").first()]))
        p_authorization_repository.save(new Authorization(authorizationName: "Demographic Updates", prerequisiteAuthorization: p_authorization_repository.findByAuthorizationName("Read").first(), accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), identityList: [p_identity_repository.findByIdentityName("Owner of User Data").first(), p_identity_repository.findByIdentityName("Owner of Provisioned User Data").first()], scopeList: [p_scope_repository.findByScopeName("Update Profile").first()]))
        p_authorization_repository.save(new Authorization(authorizationName: "Secured Demographic Updates", prerequisiteAuthorization: p_authorization_repository.findByAuthorizationName("Read").first(), accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), identityList: [p_identity_repository.findByIdentityName("Owner of OTP Data and User Data").first(), p_identity_repository.findByIdentityName("Owner of OTP Data and Provisioned User Data").first()], scopeList: [p_scope_repository.findByScopeName("Update Phone").first()]))
        p_authorization_repository.save(new Authorization(authorizationName: "Security Updates", prerequisiteAuthorization: p_authorization_repository.findByAuthorizationName("Read").first(), accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), identityList: [p_identity_repository.findByIdentityName("Owner of User Data and DOB Data").first()], scopeList: [p_scope_repository.findByScopeName("Change Password").first(), p_scope_repository.findByScopeName("Change Security Answers").first()]))
        p_authorization_repository.save(new Authorization(authorizationName: "Provisioned User Data Usage", prerequisiteAuthorization: p_authorization_repository.findByAuthorizationName("Read").first(), accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), identityList: [p_identity_repository.findByIdentityName("Owner of User Data and Provisioning Data").first()], scopeList: []))
        p_rule_repository.save(new Rule(
                authorization: p_authorization_repository.findByAuthorizationName("Anonymous").first(),
                scope: p_scope_repository.findByScopeName("Anonymous Services").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAllowed: 0,
                refreshDurationSeconds: null,
                accessor: null,
                lookupPriority: 0
        ))
        p_rule_repository.save(new Rule(
                authorization: p_authorization_repository.findByAuthorizationName("Read").first(),
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAllowed: 1,
                refreshDurationSeconds: 2592000,
                accessor: null,
                lookupPriority: 0
        ))
        p_rule_repository.save(new Rule(
                authorization: p_authorization_repository.findByAuthorizationName("Read").first(),
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshAllowed: 1,
                refreshDurationSeconds: 1800,
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                lookupPriority: 1
        ))
        p_rule_repository.save(new Rule(
                authorization: p_authorization_repository.findByAuthorizationName("Demographic Updates").first(),
                scope: p_scope_repository.findByScopeName("Update Profile").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                refreshAllowed: 0,
                refreshDurationSeconds: null,
                accessor: null,
                lookupPriority: 0
        ))
        p_rule_repository.save(new Rule(
                authorization: p_authorization_repository.findByAuthorizationName("Provisioned User Data Usage").first(),
                durationSeconds: 2592000,
                maxUsageCount: 20,
                refreshAllowed: 0,
                refreshDurationSeconds: null,
                accessor: null,
                lookupPriority: 0
        ))
        p_rule_repository.save(new Rule(
                authorization: p_authorization_repository.findByAuthorizationName("Security Updates").first(),
                scope: p_scope_repository.findByScopeName("Change Password").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                refreshAllowed: 0,
                refreshDurationSeconds: null,
                accessor: null,
                lookupPriority: 0
        ))
        p_rule_repository.save(new Rule(
                authorization: p_authorization_repository.findByAuthorizationName("Security Updates").first(),
                scope: p_scope_repository.findByScopeName("Change Security Answers").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                refreshAllowed: 0,
                refreshDurationSeconds: null,
                accessor: null,
                lookupPriority: 0
        ))
        p_rule_repository.save(new Rule(
                authorization: p_authorization_repository.findByAuthorizationName("Secured Demographic Updates").first(),
                scope: p_scope_repository.findByScopeName("Update Phone").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                refreshAllowed: 0,
                refreshDurationSeconds: null,
                accessor: null,
                lookupPriority: 0
        ))
        p_auth_base_5_context.init_standalone()
        List<DataField> l_func = new ArrayList<DataField>()
        p_authentication_repository.findByAuthenticationName("User_data").first().validate([new DataField(fieldName: "Username", fieldValue: "666")], [], l_func, [])
        for (l_func_field in l_func) {
            System.out.println("Func field": l_func_field.fieldName)
        }
    }
}
