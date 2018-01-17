package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.RestResource
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_resource_repository
import org.springframework.stereotype.Component

@Component
class G01_RestResourceGenerator {

    void generate_data(I_resource_repository p_resource_repository) {
        Set<RestResource> l_resource_set = new HashSet<RestResource>()
        l_resource_set.add(new RestResource(restResourceName: "AccountCreation"))//0
        l_resource_set.add(new RestResource(restResourceName: "AddWalletToAccount"))//0
        l_resource_set.add(new RestResource(restResourceName: "CardActivationSS"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "CardActivationValidationParameterSS"))//0
        l_resource_set.add(new RestResource(restResourceName: "CardholderUnloadFunds"))//0
        l_resource_set.add(new RestResource(restResourceName: "CardLockUnlockRequest"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "CardSearch"))//0
        l_resource_set.add(new RestResource(restResourceName: "ChangePassword"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "DeliverOTP"))//0
        l_resource_set.add(new RestResource(restResourceName: "ForgotPassword"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "ForgotPasswordValidationParameter"))//0
        l_resource_set.add(new RestResource(restResourceName: "ForgotUserId"))//0
        l_resource_set.add(new RestResource(restResourceName: "ForgotUserIdValidationParameter"))//0
        l_resource_set.add(new RestResource(restResourceName: "FXRateSearch"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "GetCardDetail"))//0
        l_resource_set.add(new RestResource(restResourceName: "GetCVC"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "GetProductParameters"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "GetSecretKey"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "GetTransactionDetail"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "GetTransactionHistory"))//0
        l_resource_set.add(new RestResource(restResourceName: "SetStatementDate"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "MultiCurrencyLoad"))//0
        l_resource_set.add(new RestResource(restResourceName: "MultiCurrencyUnload"))//0
        l_resource_set.add(new RestResource(restResourceName: "ResetPassword"))//0
        l_resource_set.add(new RestResource(restResourceName: "ResetSecondaryCardLimit"))//0
        l_resource_set.add(new RestResource(restResourceName: "SearchWalletAccount"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "SecondaryCardCreation"))//0
        l_resource_set.add(new RestResource(restResourceName: "SelfServiceLogin"))//0
        l_resource_set.add(new RestResource(restResourceName: "StatementInformationMultiCurrency"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "StatementsInformation"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "UpdateCardStatus"))//0
        l_resource_set.add(new RestResource(restResourceName: "UpdateCustomerDetails"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "UpdateWalletPriority"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "UserRegistration"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "UserRegistrationValidationParameters"))//0
        l_resource_set.add(new RestResource(restResourceName: "VirtualCardCreate"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "VirtualCardUpdate"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "W2WTransferConfirm"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "W2WTransferInitiate"))//0
        l_resource_set.add(new RestResource(restResourceName: "CardActivationValidationParameterSSEnhanced"))
//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "CardSearchEnhanced"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "ForgotPasswordValidationParameterEnhanced"))
//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "ForgotUserIdValidationParameterEnhanced"))//0
        l_resource_set.add(new RestResource(restResourceName: "GetCardDetailEnhanced"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "GetTransactionHistory"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "ResetPasswordEnhanced"))//0
        l_resource_set.add(new RestResource(restResourceName: "UserRegistrationValidationParametersEnhanced"))
//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "W2WTransferInitiateEnhanced"))//0,1,2
        l_resource_set.add(new RestResource(restResourceName: "Authenticate"))//0,1
        l_resource_set.add(new RestResource(restResourceName: "RefreshAuthorization"))//0,1
        l_resource_set.add(new RestResource(restResourceName: "ForgotPIN"))//2
        l_resource_set.add(new RestResource(restResourceName: "ForgotPINValidationParameters"))//2
        l_resource_set.add(new RestResource(restResourceName: "GenerateOTP"))//2
        l_resource_set.add(new RestResource(restResourceName: "SendOTPSMS"))//2
        l_resource_set.add(new RestResource(restResourceName: "ValidateOTP"))//2
        l_resource_set.add(new RestResource(restResourceName: "ValidateOTPSMS"))//2
        l_resource_set.add(new RestResource(restResourceName: "ForgotUserId"))//2
        l_resource_set.add(new RestResource(restResourceName: "ForgotUserIdValidationParametersEnhanced"))//2
        l_resource_set.add(new RestResource(restResourceName: "UpdateProfileWithoutPhone"))//2
        l_resource_set.add(new RestResource(restResourceName: "UpdateProfileWithPhone"))//2
        l_resource_set.add(new RestResource(restResourceName: "SetAnswers"))//2
        l_resource_set.add(new RestResource(restResourceName: "Document"))//2
        l_resource_set.add(new RestResource(restResourceName: "Document_metadata"))//2
        l_resource_set.add(new RestResource(restResourceName: "Transaction_attributes"))//2
        l_resource_set.add(new RestResource(restResourceName: "GetProductParametersEnhanced"))//2
        p_resource_repository.save(l_resource_set)
    }

}
