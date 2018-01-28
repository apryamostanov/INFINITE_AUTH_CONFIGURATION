package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Grant
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_data_field_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_grant_repository
import org.springframework.stereotype.Component

@Component
class G08_GrantGenerator {

    void generate_data(I_grant_repository p_grant_repository, I_data_field_repository p_data_field_repository) {
        Set<Grant> l_entity_set = new HashSet<Grant>()
        l_entity_set.add(new Grant(restResourceName: "UserRegistration", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "UserRegistrationValidationParametersEnhanced", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "CardActivationSS", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "CardActivationValidationParameterSSEnhanced", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "ForgotPassword", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "ForgotPasswordValidationParameterEnhanced", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "GetSecretKey", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "ForgotUserId", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "ForgotUserIdValidationParametersEnhanced", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))

        l_entity_set.add(new Grant(restResourceName: "GetCardDetailEnhanced", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("AccountNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "GetCVC", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "CardSearchEnhanced", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "W2WTransferInitiateEnhanced", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "GetTransactionHistory", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("AccountNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "CardLockUnlockRequest", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "FXRateSearch", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("ProductID").first()]))
        l_entity_set.add(new Grant(restResourceName: "GetTransactionDetail", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "SetStatementDate", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "SearchWalletAccount", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("AccountNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "StatementInformationMultiCurrency", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("AccountNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "StatementsInformation", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "UpdateWalletPriority", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "VirtualCardCreate", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "VirtualCardUpdate", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("AccountNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "W2WTransferConfirm", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("AccountNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "ForgotPIN", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("AccountNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "ForgotPINValidationParameters", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("AccountNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "GenerateOTP", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("AccountNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "SendOTPSMS", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("AccountNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "ValidateOTP", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "ValidateOTPSMS", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        l_entity_set.add(new Grant(restResourceName: "Document", method: "GET",urlMask:"/%ACCESSORID%/*/*/*"))
        l_entity_set.add(new Grant(restResourceName: "Document_metadata", method: "GET",urlMask: "/%ACCESSORID%/*/*/*"))
        l_entity_set.add(new Grant(restResourceName: "GetProductParametersEnhanced", method: "GET",keyFieldSet: [p_data_field_repository.findByFieldName("ProductID").first()]))

        l_entity_set.add(new Grant(restResourceName: "UpdateProfileWithoutPhone", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))

        l_entity_set.add(new Grant(restResourceName: "UpdateProfileWithPhone", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first(), p_data_field_repository.findByFieldName("PhoneNumber").first()]))

        l_entity_set.add(new Grant(restResourceName: "ChangePassword", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))

        l_entity_set.add(new Grant(restResourceName: "SetAnswers", method: "POST",keyFieldSet: [p_data_field_repository.findByFieldName("CardNumber").first(), p_data_field_repository.findByFieldName("ProxyNumber").first()]))
        p_grant_repository.save(l_entity_set)
    }


}
