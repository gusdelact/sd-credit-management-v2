/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CreditManagementApiService {

	SDCreditManagementActivateOutputModel activate(SDCreditManagementActivateInputModel request);
	
	SDCreditManagementConfigureOutputModel configure(String sdReferenceId, SDCreditManagementConfigureInputModel request);
	
	CRCreditPricingAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRCreditPricingAssessmentEvaluateInputModel request);
	
	CRCreditPricingAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCreditPricingAssessmentExchangeInputModel request);
	
	SDCreditManagementFeedbackOutputModel feedback(String sdReferenceId, SDCreditManagementFeedbackInputModel request);
	
	CRCreditPricingAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCreditPricingAssessmentGrantInputModel request);
	
	CRCreditPricingAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCreditManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCreditPricingAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditPricingAssessmentUpdateInputModel request);
	
}
