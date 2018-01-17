package com.a9ae0b01f0ffc.infinite_auth_configuration

import com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_5_context
import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.*
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

import static com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_4_const.GC_ANY_ENDPOINT

@SpringBootApplication
class T_spring_boot_application implements CommandLineRunner {

    static void main(String[] args) {
        SpringApplication.run(T_spring_boot_application.class, args)
    }

    @Autowired
    private I_accessor_repository p_accessor_repository
    @Autowired
    private I_authentication_repository p_authentication_repository
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
    private I_token_repository p_token_repository
    @Autowired
    private T_auth_base_5_context p_auth_base_5_context

    @Override
    void run(String... args) throws Exception {
        p_resource_repository.save(new RestResource(restResourceName: "AccountCreation"))//0
        p_resource_repository.save(new RestResource(restResourceName: "AddWalletToAccount"))//0
        p_resource_repository.save(new RestResource(restResourceName: "CardActivationSS"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "CardActivationValidationParameterSS"))//0
        p_resource_repository.save(new RestResource(restResourceName: "CardholderUnloadFunds"))//0
        p_resource_repository.save(new RestResource(restResourceName: "CardLockUnlockRequest"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "CardSearch"))//0
        p_resource_repository.save(new RestResource(restResourceName: "ChangePassword"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "DeliverOTP"))//0
        p_resource_repository.save(new RestResource(restResourceName: "ForgotPassword"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "ForgotPasswordValidationParameter"))//0
        p_resource_repository.save(new RestResource(restResourceName: "ForgotUserId"))//0
        p_resource_repository.save(new RestResource(restResourceName: "ForgotUserIdValidationParameter"))//0
        p_resource_repository.save(new RestResource(restResourceName: "FXRateSearch"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "GetCardDetail"))//0
        p_resource_repository.save(new RestResource(restResourceName: "GetCVC"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "GetProductParameters"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "GetSecretKey"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "GetTransactionDetail"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "GetTransactionHistory"))//0
        p_resource_repository.save(new RestResource(restResourceName: "SetStatementDate"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "MultiCurrencyLoad"))//0
        p_resource_repository.save(new RestResource(restResourceName: "MultiCurrencyUnload"))//0
        p_resource_repository.save(new RestResource(restResourceName: "ResetPassword"))//0
        p_resource_repository.save(new RestResource(restResourceName: "ResetSecondaryCardLimit"))//0
        p_resource_repository.save(new RestResource(restResourceName: "SearchWalletAccount"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "SecondaryCardCreation"))//0
        p_resource_repository.save(new RestResource(restResourceName: "SelfServiceLogin"))//0
        p_resource_repository.save(new RestResource(restResourceName: "StatementInformationMultiCurrency"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "StatementsInformation"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "UpdateCardStatus"))//0
        p_resource_repository.save(new RestResource(restResourceName: "UpdateCustomerDetails"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "UpdateWalletPriority"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "UserRegistration"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "UserRegistrationValidationParameters"))//0
        p_resource_repository.save(new RestResource(restResourceName: "VirtualCardCreate"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "VirtualCardUpdate"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "W2WTransferConfirm"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "W2WTransferInitiate"))//0
        p_resource_repository.save(new RestResource(restResourceName: "CardActivationValidationParameterSSEnhanced"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "CardSearchEnhanced"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "ForgotPasswordValidationParameterEnhanced"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "ForgotUserIdValidationParameterEnhanced"))//0
        p_resource_repository.save(new RestResource(restResourceName: "GetCardDetailEnhanced"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "GetTransactionHistory"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "ResetPasswordEnhanced"))//0
        p_resource_repository.save(new RestResource(restResourceName: "UserRegistrationValidationParametersEnhanced"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "W2WTransferInitiateEnhanced"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "Authenticate"))//0,1
        p_resource_repository.save(new RestResource(restResourceName: "RefreshToken"))//0,1
        p_resource_repository.save(new RestResource(restResourceName: "ForgotPIN"))//2
        p_resource_repository.save(new RestResource(restResourceName: "ForgotPINValidationParameters"))//2
        p_resource_repository.save(new RestResource(restResourceName: "GenerateOTP"))//2
        p_resource_repository.save(new RestResource(restResourceName: "SendOTPSMS"))//2
        p_resource_repository.save(new RestResource(restResourceName: "ValidateOTP"))//2
        p_resource_repository.save(new RestResource(restResourceName: "ValidateOTPSMS"))//2
        p_resource_repository.save(new RestResource(restResourceName: "ForgotUserId"))//2
        p_resource_repository.save(new RestResource(restResourceName: "ForgotUserIdValidationParametersEnhanced"))//2
        p_resource_repository.save(new RestResource(restResourceName: "UpdateProfileWithoutPhone"))//2
        p_resource_repository.save(new RestResource(restResourceName: "UpdateProfileWithPhone"))//2
        p_resource_repository.save(new RestResource(restResourceName: "SetAnswers"))//2
        p_resource_repository.save(new RestResource(restResourceName: "Document"))//2
        p_resource_repository.save(new RestResource(restResourceName: "Document_metadata"))//2
        p_resource_repository.save(new RestResource(restResourceName: "Transaction_attributes"))//2
        p_resource_repository.save(new RestResource(restResourceName: "GetProductParametersEnhanced"))//2
        Version l_version = new Version()
        p_version_repository.save(new Version(versionName: "0.0.x", resourceSet: [
                p_resource_repository.findByRestResourceName("AccountCreation").first(),
                p_resource_repository.findByRestResourceName("AddWalletToAccount").first(),
                p_resource_repository.findByRestResourceName("CardActivationSS").first(),
                p_resource_repository.findByRestResourceName("CardActivationValidationParameterSS").first(),
                p_resource_repository.findByRestResourceName("CardholderUnloadFunds").first(),
                p_resource_repository.findByRestResourceName("CardLockUnlockRequest").first(),
                p_resource_repository.findByRestResourceName("CardSearch").first(),
                p_resource_repository.findByRestResourceName("ChangePassword").first(),
                p_resource_repository.findByRestResourceName("DeliverOTP").first(),
                p_resource_repository.findByRestResourceName("ForgotPassword").first(),
                p_resource_repository.findByRestResourceName("ForgotPasswordValidationParameter").first(),
                p_resource_repository.findByRestResourceName("ForgotUserId").first(),
                p_resource_repository.findByRestResourceName("ForgotUserIdValidationParameter").first(),
                p_resource_repository.findByRestResourceName("FXRateSearch").first(),
                p_resource_repository.findByRestResourceName("GetCardDetail").first(),
                p_resource_repository.findByRestResourceName("GetCVC").first(),
                p_resource_repository.findByRestResourceName("GetProductParameters").first(),
                p_resource_repository.findByRestResourceName("GetSecretKey").first(),
                p_resource_repository.findByRestResourceName("GetTransactionDetail").first(),
                p_resource_repository.findByRestResourceName("GetTransactionHistory").first(),
                p_resource_repository.findByRestResourceName("SetStatementDate").first(),
                p_resource_repository.findByRestResourceName("MultiCurrencyLoad").first(),
                p_resource_repository.findByRestResourceName("MultiCurrencyUnload").first(),
                p_resource_repository.findByRestResourceName("ResetPassword").first(),
                p_resource_repository.findByRestResourceName("ResetSecondaryCardLimit").first(),
                p_resource_repository.findByRestResourceName("SearchWalletAccount").first(),
                p_resource_repository.findByRestResourceName("SecondaryCardCreation").first(),
                p_resource_repository.findByRestResourceName("SelfServiceLogin").first(),
                p_resource_repository.findByRestResourceName("StatementInformationMultiCurrency").first(),
                p_resource_repository.findByRestResourceName("StatementsInformation").first(),
                p_resource_repository.findByRestResourceName("UpdateCardStatus").first(),
                p_resource_repository.findByRestResourceName("UpdateCustomerDetails").first(),
                p_resource_repository.findByRestResourceName("UpdateWalletPriority").first(),
                p_resource_repository.findByRestResourceName("UserRegistration").first(),
                p_resource_repository.findByRestResourceName("UserRegistrationValidationParameters").first(),
                p_resource_repository.findByRestResourceName("VirtualCardCreate").first(),
                p_resource_repository.findByRestResourceName("VirtualCardUpdate").first(),
                p_resource_repository.findByRestResourceName("W2WTransferConfirm").first(),
                p_resource_repository.findByRestResourceName("W2WTransferInitiate").first(),
                p_resource_repository.findByRestResourceName("CardActivationValidationParameterSSEnhanced").first(),
                p_resource_repository.findByRestResourceName("CardSearchEnhanced").first(),
                p_resource_repository.findByRestResourceName("ForgotPasswordValidationParameterEnhanced").first(),
                p_resource_repository.findByRestResourceName("ForgotUserIdValidationParameterEnhanced").first(),
                p_resource_repository.findByRestResourceName("GetCardDetailEnhanced").first(),
                p_resource_repository.findByRestResourceName("ResetPasswordEnhanced").first(),
                p_resource_repository.findByRestResourceName("UserRegistrationValidationParametersEnhanced").first(),
                p_resource_repository.findByRestResourceName("W2WTransferInitiateEnhanced").first(),
                p_resource_repository.findByRestResourceName("Authenticate").first(),
                p_resource_repository.findByRestResourceName("RefreshToken").first()
        ]))
        p_version_repository.save(new Version(versionName: "1.0.x", resourceSet: [
                p_resource_repository.findByRestResourceName("CardActivationSS").first(),
                p_resource_repository.findByRestResourceName("CardLockUnlockRequest").first(),
                p_resource_repository.findByRestResourceName("ChangePassword").first(),
                p_resource_repository.findByRestResourceName("ForgotPassword").first(),
                p_resource_repository.findByRestResourceName("FXRateSearch").first(),
                p_resource_repository.findByRestResourceName("GetCVC").first(),
                p_resource_repository.findByRestResourceName("GetProductParameters").first(),
                p_resource_repository.findByRestResourceName("GetSecretKey").first(),
                p_resource_repository.findByRestResourceName("GetTransactionDetail").first(),
                p_resource_repository.findByRestResourceName("SetStatementDate").first(),
                p_resource_repository.findByRestResourceName("SearchWalletAccount").first(),
                p_resource_repository.findByRestResourceName("StatementInformationMultiCurrency").first(),
                p_resource_repository.findByRestResourceName("StatementsInformation").first(),
                p_resource_repository.findByRestResourceName("UpdateCustomerDetails").first(),
                p_resource_repository.findByRestResourceName("UpdateWalletPriority").first(),
                p_resource_repository.findByRestResourceName("UserRegistration").first(),
                p_resource_repository.findByRestResourceName("VirtualCardCreate").first(),
                p_resource_repository.findByRestResourceName("VirtualCardUpdate").first(),
                p_resource_repository.findByRestResourceName("W2WTransferConfirm").first(),
                p_resource_repository.findByRestResourceName("CardActivationValidationParameterSSEnhanced").first(),
                p_resource_repository.findByRestResourceName("CardSearchEnhanced").first(),
                p_resource_repository.findByRestResourceName("ForgotPasswordValidationParameterEnhanced").first(),
                p_resource_repository.findByRestResourceName("GetCardDetailEnhanced").first(),
                p_resource_repository.findByRestResourceName("GetTransactionHistory").first(),
                p_resource_repository.findByRestResourceName("UserRegistrationValidationParametersEnhanced").first(),
                p_resource_repository.findByRestResourceName("W2WTransferInitiateEnhanced").first(),
                p_resource_repository.findByRestResourceName("Authenticate").first(),
                p_resource_repository.findByRestResourceName("RefreshToken").first()
        ]))
        p_version_repository.save(new Version(versionName: "2.0.x", resourceSet: [
                p_resource_repository.findByRestResourceName("CardActivationSS").first(),
                p_resource_repository.findByRestResourceName("CardLockUnlockRequest").first(),
                p_resource_repository.findByRestResourceName("ChangePassword").first(),
                p_resource_repository.findByRestResourceName("ForgotPassword").first(),
                p_resource_repository.findByRestResourceName("FXRateSearch").first(),
                p_resource_repository.findByRestResourceName("GetCVC").first(),
                p_resource_repository.findByRestResourceName("GetProductParameters").first(),
                p_resource_repository.findByRestResourceName("GetSecretKey").first(),
                p_resource_repository.findByRestResourceName("GetTransactionDetail").first(),
                p_resource_repository.findByRestResourceName("SetStatementDate").first(),
                p_resource_repository.findByRestResourceName("SearchWalletAccount").first(),
                p_resource_repository.findByRestResourceName("StatementInformationMultiCurrency").first(),
                p_resource_repository.findByRestResourceName("StatementsInformation").first(),
                p_resource_repository.findByRestResourceName("UpdateCustomerDetails").first(),
                p_resource_repository.findByRestResourceName("UpdateWalletPriority").first(),
                p_resource_repository.findByRestResourceName("UserRegistration").first(),
                p_resource_repository.findByRestResourceName("VirtualCardCreate").first(),
                p_resource_repository.findByRestResourceName("VirtualCardUpdate").first(),
                p_resource_repository.findByRestResourceName("W2WTransferConfirm").first(),
                p_resource_repository.findByRestResourceName("CardActivationValidationParameterSSEnhanced").first(),
                p_resource_repository.findByRestResourceName("CardSearchEnhanced").first(),
                p_resource_repository.findByRestResourceName("ForgotPasswordValidationParameterEnhanced").first(),
                p_resource_repository.findByRestResourceName("GetCardDetailEnhanced").first(),
                p_resource_repository.findByRestResourceName("GetTransactionHistory").first(),
                p_resource_repository.findByRestResourceName("UserRegistrationValidationParametersEnhanced").first(),
                p_resource_repository.findByRestResourceName("W2WTransferInitiateEnhanced").first(),
                p_resource_repository.findByRestResourceName("ForgotPIN").first(),
                p_resource_repository.findByRestResourceName("ForgotPINValidationParameters").first(),
                p_resource_repository.findByRestResourceName("GenerateOTP").first(),
                p_resource_repository.findByRestResourceName("SendOTPSMS").first(),
                p_resource_repository.findByRestResourceName("ValidateOTP").first(),
                p_resource_repository.findByRestResourceName("ValidateOTPSMS").first(),
                p_resource_repository.findByRestResourceName("ForgotUserId").first(),
                p_resource_repository.findByRestResourceName("ForgotUserIdValidationParametersEnhanced").first(),
                p_resource_repository.findByRestResourceName("UpdateProfileWithoutPhone").first(),
                p_resource_repository.findByRestResourceName("UpdateProfileWithPhone").first(),
                p_resource_repository.findByRestResourceName("SetAnswers").first(),
                p_resource_repository.findByRestResourceName("Document").first(),
                p_resource_repository.findByRestResourceName("Document_metadata").first(),
                p_resource_repository.findByRestResourceName("Transaction_attributes").first(),
                p_resource_repository.findByRestResourceName("GetProductParametersEnhanced").first()
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
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("UserRegistration").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("UserRegistrationValidationParametersEnhanced").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("CardActivationSS").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("CardActivationValidationParameterSSEnhanced").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("ForgotPassword").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("ForgotPasswordValidationParameterEnhanced").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("GetSecretKey").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("ForgotUserId").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("ForgotUserIdValidationParametersEnhanced").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Anonymous Services", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("UserRegistration").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("UserRegistrationValidationParametersEnhanced").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("CardActivationSS").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("CardActivationValidationParameterSSEnhanced").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ForgotPassword").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ForgotPasswordValidationParameterEnhanced").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("GetSecretKey").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ForgotUserId").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ForgotUserIdValidationParametersEnhanced").first()).first()
        ]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("GetCardDetailEnhanced").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("GetCVC").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("CardSearchEnhanced").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("W2WTransferInitiateEnhanced").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("GetTransactionHistory").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("CardLockUnlockRequest").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("FXRateSearch").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("ProductID", "%PRODUCTID%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("GetTransactionDetail").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("SetStatementDate").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("SearchWalletAccount").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("StatementInformationMultiCurrency").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("StatementsInformation").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("UpdateWalletPriority").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("VirtualCardCreate").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("VirtualCardUpdate").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("W2WTransferConfirm").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("ForgotPIN").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("ForgotPINValidationParameters").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("GenerateOTP").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("SendOTPSMS").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("AccountNumber", "%ACCOUNTNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("ValidateOTP").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("ValidateOTPSMS").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        Url l_url_accessor_id = p_url_repository.save(new Url(urlName: "/%ACCESSORID%/*/*/*"))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("Document").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], url: l_url_accessor_id))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("Document_metadata").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], url: l_url_accessor_id))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("GetProductParametersEnhanced").first(), methodSet: [p_method_repository.findByMethodName("GET").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("ProductID", "%PRODUCTID%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Main Screen", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("GetCardDetailEnhanced").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("GetCVC").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("CardActivationSS").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("CardActivationValidationParameterSSEnhanced").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("CardSearchEnhanced").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("UserRegistration").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("UserRegistrationValidationParametersEnhanced").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ForgotPassword").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ForgotPasswordValidationParameterEnhanced").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("W2WTransferInitiateEnhanced").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("GetTransactionHistory").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("CardLockUnlockRequest").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("FXRateSearch").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("GetSecretKey").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("GetTransactionDetail").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("SetStatementDate").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("SearchWalletAccount").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("StatementInformationMultiCurrency").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("StatementsInformation").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("UpdateWalletPriority").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("VirtualCardCreate").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("VirtualCardUpdate").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("W2WTransferConfirm").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ForgotPIN").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ForgotPINValidationParameters").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("GenerateOTP").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("SendOTPSMS").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ValidateOTP").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ValidateOTPSMS").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ForgotUserId").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ForgotUserIdValidationParametersEnhanced").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("Document").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("Document_metadata").first()).first(),
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("GetProductParametersEnhanced").first()).first()
        ]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("UpdateProfileWithoutPhone").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Update Profile", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("UpdateProfileWithoutPhone").first()).first()
        ]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("UpdateProfileWithPhone").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("PhoneNumber", "%PHONENUMBER%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Update Phone", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("UpdateProfileWithPhone").first()).first()
        ]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("ChangePassword").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Change Password", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ChangePassword").first()).first()
        ]))
        p_grant_repository.save(new Grant(restResource: p_resource_repository.findByRestResourceName("SetAnswers").first(), methodSet: [p_method_repository.findByMethodName("POST").first()], payloadKeyFieldSet: [p_data_field_repository.findByFieldNameAndFieldValue("CardNumber", "%CARDNUMBER%").first(), p_data_field_repository.findByFieldNameAndFieldValue("ProxyNumber", "%PROXYNUMBER%").first()]))
        p_scope_repository.save(new Scope(scopeName: "Change Security Answers", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("SetAnswers").first()).first()
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
        p_authentication_repository.save(new Authentication(authenticationName: "Accessor_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("accessor_id", "%ACCESSORID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("platform", "%PLATFORM%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("FIID", "%FIID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("api_version", "%APIVERSION%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("language", "%LANGUAGE%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("specific_data", "%SPECIFICDATA%").first()
        ], privateDataFieldSet: [

        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("accessor_id", "%ACCESSORID%").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("language", "%LANGUAGE%").first()
        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "User_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("username", "%USERNAME%").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("password", "%PASSWORD%").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("card_type_id_enhanced", "%CARDTYPEIDENHANCED%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("login_flag", "%LOGINFLAG%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("error_number", "%ERRORNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("product_id", "%PRODUCTID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("username", "%USERNAME%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "Refresh_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("old_access_token", "%OLDACCESSTOKEN%").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("refresh_token", "%REFRESHTOKEN%").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("card_type_id_enhanced", "%CARDTYPEIDENHANCED%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("login_flag", "%LOGINFLAG%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("error_number", "%ERRORNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("product_id", "%PRODUCTID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("username", "%USERNAME%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("account_number", "%ACCOUNTNUMBER%").first()
        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "OTP_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("otp_id", "%OTPID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("phone_number", "%PHONENUMBER%").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("otp", "%OTP%").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("phone_number", "%PHONENUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldSet: [

        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "Provisioned_user_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("provisioned_data_unique_id", "%PROVISIONEDDATAUNIQUEID%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("provisioned_user_data_usage_authorization", "%PROVISIONEDUSERDATAUSAGEAUTHORIZATION%").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("provisioned_data_singature", "%PROVISIONEDDATASINGATURE%").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldSet: [

        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "Provisioning_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first(),
                p_data_field_repository.findByFieldNameAndFieldValue("provisioning_public_key", "%PROVISIONINGPUBLICKEY%").first()
        ], privateDataFieldSet: [

        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("provisioning_public_key", "%PROVISIONINGPUBLICKEY%").first()
        ]))
        p_authentication_repository.save(new Authentication(authenticationName: "DOB_data", publicDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], privateDataFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("DOB", "%DOB%").first()
        ], keyFieldSet: [
                p_data_field_repository.findByFieldNameAndFieldValue("proxy_number", "%PROXYNUMBER%").first()
        ], functionalFieldSet: [

        ]))
        p_identity_repository.save(new Identity(identityName: "Owner of Accessor Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("Accessor_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of Refresh Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("Refresh_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of OTP Data and User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("OTP_data").first(), p_authentication_repository.findByAuthenticationName("User_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of OTP Data and Provisioned User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("OTP_data").first(), p_authentication_repository.findByAuthenticationName("Provisioned_user_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of Provisioning Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("Provisioning_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of User Data and DOB Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("User_data").first(), p_authentication_repository.findByAuthenticationName("DOB_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of Provisioned User Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("Provisioned_user_data").first()]))
        p_identity_repository.save(new Identity(identityName: "Owner of User Data and Provisioning Data", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), authenticationSet: [p_authentication_repository.findByAuthenticationName("Provisioning_data").first()]))
        p_token_repository.save(new Token(
                tokenName: "Anonymous access to Anonymous Services as Owner of Accessor Data",
                scope: p_scope_repository.findByScopeName("Anonymous Services").first(),
                identity: p_identity_repository.findByIdentityName("Owner of Accessor Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: null,
                lookupPriority: 0,
                tokenType: "Access"
        ))
        p_token_repository.save(new Token(
                tokenName: "Read refresh to Main Screen as Owner of User Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 2592000,
                maxUsageCount: null,
                accessor: null,
                lookupPriority: 0,
                tokenType: "Refresh",
                prerequisiteTokenSet: [p_token_repository.findByTokenName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_token_repository.save(new Token(
                tokenName: "Read refresh to Main Screen as Owner of User Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                lookupPriority: 0,
                tokenType: "Refresh",
                prerequisiteTokenSet: [p_token_repository.findByTokenName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_token_repository.save(new Token(
                tokenName: "Read refresh to Main Screen as Owner of Refresh Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 2592000,
                maxUsageCount: null,
                accessor: null,
                lookupPriority: 0,
                tokenType: "Refresh",
                prerequisiteTokenSet: [p_token_repository.findByTokenName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_token_repository.save(new Token(
                tokenName: "Read refresh to Main Screen as Owner of Refresh Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                lookupPriority: 0,
                tokenType: "Refresh",
                prerequisiteTokenSet: [p_token_repository.findByTokenName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_token_repository.save(new Token(
                tokenName: "Read access to Main Screen as Owner of User Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshToken: p_token_repository.findByTokenName("Read refresh to Main Screen as Owner of User Data").first(),
                accessor: null,
                lookupPriority: 0,
                tokenType: "Access",
                prerequisiteTokenSet: [p_token_repository.findByTokenName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_token_repository.save(new Token(
                tokenName: "Read access to Main Screen as Owner of User Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshToken: p_token_repository.findByTokenName("Read refresh to Main Screen as Owner of User Data (React)").first(),
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                lookupPriority: 1,
                tokenType: "Access",
                prerequisiteTokenSet: [p_token_repository.findByTokenName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_token_repository.save(new Token(
                tokenName: "Read access to Main Screen as Owner of Refresh Data",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of Refresh Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshToken: p_token_repository.findByTokenName("Read refresh to Main Screen as Owner of Refresh Data").first(),
                accessor: null,
                lookupPriority: 0,
                tokenType: "Access",
                prerequisiteTokenSet: [p_token_repository.findByTokenName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_token_repository.save(new Token(
                tokenName: "Read access to Main Screen as Owner of Refresh Data (React)",
                scope: p_scope_repository.findByScopeName("Main Screen").first(),
                identity: p_identity_repository.findByIdentityName("Owner of Refresh Data").first(),
                durationSeconds: 1800,
                maxUsageCount: null,
                refreshToken: p_token_repository.findByTokenName("Read refresh to Main Screen as Owner of Refresh Data (React)").first(),
                accessor: p_accessor_repository.findByAccessorName("LMN Multi Currency React (FT2 Development)").first(),
                lookupPriority: 1,
                tokenType: "Access",
                prerequisiteTokenSet: [p_token_repository.findByTokenName("Anonymous access to Anonymous Services as Owner of Accessor Data").first()]
        ))
        p_token_repository.save(new Token(
                tokenName: "Demographic Updates access to Update Profile as Owner of User Data",
                scope: p_scope_repository.findByScopeName("Update Profile").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                tokenType: "Access",
                prerequisiteTokenSet: [
                        p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_token_repository.save(new Token(
                tokenName: "Demographic Updates access to Update Profile as Owner of Provisioned User Data",
                scope: p_scope_repository.findByScopeName("Update Profile").first(),
                identity: p_identity_repository.findByIdentityName("Owner of Provisioned User Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                tokenType: "Access",
                prerequisiteTokenSet: [
                        p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_token_repository.save(new Token(
                tokenName: "Provisioned User Data Usage access as Owner of User Data and Provisioning Data",
                identity: p_identity_repository.findByIdentityName("Owner of User Data and Provisioning Data").first(),
                durationSeconds: 2592000,
                maxUsageCount: 20,
                accessor: null,
                lookupPriority: 0,
                tokenType: "Access",
                prerequisiteTokenSet: [
                        p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_token_repository.save(new Token(
                tokenName: "Security Updates access to Change Password as Owner of User Data and DOB Data",
                scope: p_scope_repository.findByScopeName("Change Password").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data and DOB Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                tokenType: "Access",
                prerequisiteTokenSet: [
                        p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_token_repository.save(new Token(
                tokenName: "Security Updates access to Change Security Answers as Owner of User Data and DOB Data",
                scope: p_scope_repository.findByScopeName("Change Security Answers").first(),
                identity: p_identity_repository.findByIdentityName("Owner of User Data and DOB Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                tokenType: "Access",
                prerequisiteTokenSet: [
                        p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_token_repository.save(new Token(
                tokenName: "Secured Demographic Updates access to Update Phone as Owner of OTP Data and User Data",
                scope: p_scope_repository.findByScopeName("Update Phone").first(),
                identity: p_identity_repository.findByIdentityName("Owner of OTP Data and User Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                tokenType: "Access",
                prerequisiteTokenSet: [
                        p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_token_repository.save(new Token(
                tokenName: "Secured Demographic Updates access to Update Phone as Owner of OTP Data and Provisioned User Data",
                scope: p_scope_repository.findByScopeName("Update Phone").first(),
                identity: p_identity_repository.findByIdentityName("Owner of OTP Data and Provisioned User Data").first(),
                durationSeconds: 30,
                maxUsageCount: 1,
                accessor: null,
                lookupPriority: 0,
                tokenType: "Access",
                prerequisiteTokenSet: [
                        p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of User Data (React)").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data").first()
                        , p_token_repository.findByTokenName("Read access to Main Screen as Owner of Refresh Data (React)").first()
                ]
        ))
        p_auth_base_5_context.init_standalone()
        Set<DataField> l_func = new HashSet<DataField>()
        //p_authentication_repository.findByAuthenticationName("User_data").first().validate([new DataField(fieldName: "Username", fieldValue: "666")], [], l_func, [])
        for (l_func_field in l_func) {
            System.out.println("Func field": l_func_field.fieldName)
        }
    }
}
