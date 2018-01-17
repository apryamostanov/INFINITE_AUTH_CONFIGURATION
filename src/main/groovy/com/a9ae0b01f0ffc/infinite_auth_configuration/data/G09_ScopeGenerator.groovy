package com.a9ae0b01f0ffc.infinite_auth_configuration.data

import com.a9ae0b01f0ffc.infinite_auth_configuration.domain_model.Scope
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_accessor_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_grant_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_resource_repository
import com.a9ae0b01f0ffc.infinite_auth_configuration.interfaces.I_scope_repository
import org.springframework.stereotype.Component

@Component
class G09_ScopeGenerator {

    void generate_data(I_scope_repository p_scope_repository, I_grant_repository p_grant_repository, I_accessor_repository p_accessor_repository, I_resource_repository p_resource_repository) {
        Set<Scope> l_entity_set = new HashSet<Scope>()
        l_entity_set.add(new Scope(scopeName: "Anonymous Services", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
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

        l_entity_set.add(new Scope(scopeName: "Main Screen", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
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

        l_entity_set.add(new Scope(scopeName: "Update Profile", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("UpdateProfileWithoutPhone").first()).first()
        ]))

        l_entity_set.add(new Scope(scopeName: "Update Phone", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("UpdateProfileWithPhone").first()).first()
        ]))

        l_entity_set.add(new Scope(scopeName: "Change Password", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("ChangePassword").first()).first()
        ]))

        l_entity_set.add(new Scope(scopeName: "Change Security Answers", accessor: p_accessor_repository.findByAccessorName("Any accessor Multi Currency 2.0.x").first(), grantSet: [
                p_grant_repository.findByRestResource(p_resource_repository.findByRestResourceName("SetAnswers").first()).first()
        ]))
        p_scope_repository.save(l_entity_set)
    }

}
