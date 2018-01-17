package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.RestResource
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_resource_repository
import org.springframework.stereotype.Component

@Component
class RestResourceGenerator {

    void generate_data(I_resource_repository p_resource_repository) {
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
        p_resource_repository.save(new RestResource(restResourceName: "CardActivationValidationParameterSSEnhanced"))
//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "CardSearchEnhanced"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "ForgotPasswordValidationParameterEnhanced"))
//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "ForgotUserIdValidationParameterEnhanced"))//0
        p_resource_repository.save(new RestResource(restResourceName: "GetCardDetailEnhanced"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "GetTransactionHistory"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "ResetPasswordEnhanced"))//0
        p_resource_repository.save(new RestResource(restResourceName: "UserRegistrationValidationParametersEnhanced"))
//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "W2WTransferInitiateEnhanced"))//0,1,2
        p_resource_repository.save(new RestResource(restResourceName: "Authenticate"))//0,1
        p_resource_repository.save(new RestResource(restResourceName: "RefreshAuthorization"))//0,1
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
    }

}
