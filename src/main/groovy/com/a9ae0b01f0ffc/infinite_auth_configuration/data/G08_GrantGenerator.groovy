package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Grant
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_grant_repository
import org.springframework.stereotype.Component

@Component
class G08_GrantGenerator {

    void generate_data(I_grant_repository p_grant_repository) {
        Set<Grant> l_entity_set = new HashSet<Grant>()
        l_entity_set.add(new Grant(restResourceName: "UserRegistration", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "UserRegistrationValidationParametersEnhanced", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "CardActivationSS", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "CardActivationValidationParameterSSEnhanced", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "ForgotPassword", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "ForgotPasswordValidationParameterEnhanced", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "GetSecretKey", method: "GET", keyFieldSet: ["ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "ForgotUserId", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "ForgotUserIdValidationParametersEnhanced", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber"]))

        l_entity_set.add(new Grant(restResourceName: "GetCardDetailEnhanced", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber", "AccountNumber"]))
        l_entity_set.add(new Grant(restResourceName: "GetCVC", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "CardSearchEnhanced", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "W2WTransferInitiateEnhanced", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "GetTransactionHistory", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber", "AccountNumber"]))
        l_entity_set.add(new Grant(restResourceName: "CardLockUnlockRequest", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "FXRateSearch", method: "GET", keyFieldSet: ["ProductID"]))
        l_entity_set.add(new Grant(restResourceName: "GetTransactionDetail", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "SetStatementDate", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "SearchWalletAccount", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber", "AccountNumber"]))
        l_entity_set.add(new Grant(restResourceName: "StatementInformationMultiCurrency", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber", "AccountNumber"]))
        l_entity_set.add(new Grant(restResourceName: "StatementsInformation", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "UpdateWalletPriority", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "VirtualCardCreate", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "VirtualCardUpdate", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber", "AccountNumber"]))
        l_entity_set.add(new Grant(restResourceName: "W2WTransferConfirm", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber", "AccountNumber"]))
        l_entity_set.add(new Grant(restResourceName: "ForgotPIN", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber", "AccountNumber"]))
        l_entity_set.add(new Grant(restResourceName: "ForgotPINValidationParameters", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber", "AccountNumber"]))
        l_entity_set.add(new Grant(restResourceName: "GenerateOTP", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber", "AccountNumber"]))
        l_entity_set.add(new Grant(restResourceName: "SendOTPSMS", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber", "AccountNumber"]))
        l_entity_set.add(new Grant(restResourceName: "ValidateOTP", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "ValidateOTPSMS", method: "GET", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        l_entity_set.add(new Grant(restResourceName: "Document", method: "GET", urlMask: "/%ACCESSORID%/*/*/*"))
        l_entity_set.add(new Grant(restResourceName: "Document_metadata", method: "GET", urlMask: "/%ACCESSORID%/*/*/*"))
        l_entity_set.add(new Grant(restResourceName: "GetProductParametersEnhanced", method: "GET", keyFieldSet: ["ProductID"]))

        l_entity_set.add(new Grant(restResourceName: "UpdateProfileWithoutPhone", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))

        l_entity_set.add(new Grant(restResourceName: "UpdateProfileWithPhone", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber", "PhoneNumber"]))

        l_entity_set.add(new Grant(restResourceName: "ChangePassword", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))

        l_entity_set.add(new Grant(restResourceName: "SetAnswers", method: "POST", keyFieldSet: ["CardNumber", "ProxyNumber"]))
        p_grant_repository.save(l_entity_set)
    }


}
