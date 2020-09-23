/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CreditManagementApiServiceImpl implements CreditManagementApiService {

	public SDCreditManagementActivateOutputModel activate(SDCreditManagementActivateInputModel request){
		return JsonReader.read("activate-SDCreditManagementActivateOutputModel.json",new TypeReference<SDCreditManagementActivateOutputModel>(){});
	}
	
	public SDCreditManagementConfigureOutputModel configure(String sdReferenceId, SDCreditManagementConfigureInputModel request){
		return JsonReader.read("configure-SDCreditManagementConfigureOutputModel.json",new TypeReference<SDCreditManagementConfigureOutputModel>(){});
	}
	
	public CRCreditPricingAssessmentEvaluateOutputModel evaluate(String sdReferenceId, CRCreditPricingAssessmentEvaluateInputModel request){
		return JsonReader.read("evaluate-CRCreditPricingAssessmentEvaluateOutputModel.json",new TypeReference<CRCreditPricingAssessmentEvaluateOutputModel>(){});
	}
	
	public CRCreditPricingAssessmentExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCreditPricingAssessmentExchangeInputModel request){
		return JsonReader.read("exchange-CRCreditPricingAssessmentExchangeOutputModel.json",new TypeReference<CRCreditPricingAssessmentExchangeOutputModel>(){});
	}
	
	public SDCreditManagementFeedbackOutputModel feedback(String sdReferenceId, SDCreditManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCreditManagementFeedbackOutputModel.json",new TypeReference<SDCreditManagementFeedbackOutputModel>(){});
	}
	
	public CRCreditPricingAssessmentGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCreditPricingAssessmentGrantInputModel request){
		return JsonReader.read("grant-CRCreditPricingAssessmentGrantOutputModel.json",new TypeReference<CRCreditPricingAssessmentGrantOutputModel>(){});
	}
	
	public CRCreditPricingAssessmentRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCreditPricingAssessmentRetrieveOutputModel.json",new TypeReference<CRCreditPricingAssessmentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCreditManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCreditManagementRetrieveOutputModel.json",new TypeReference<SDCreditManagementRetrieveOutputModel>(){});
	}
	
	public CRCreditPricingAssessmentUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCreditPricingAssessmentUpdateInputModel request){
		return JsonReader.read("update-CRCreditPricingAssessmentUpdateOutputModel.json",new TypeReference<CRCreditPricingAssessmentUpdateOutputModel>(){});
	}
	
}
