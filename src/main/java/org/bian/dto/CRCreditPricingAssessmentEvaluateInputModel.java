package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditPricingAssessmentEvaluateInputModelCreditPricingAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentEvaluateInputModel
 */
public class CRCreditPricingAssessmentEvaluateInputModel   {
  private String creditManagementServicingSessionReference = null;

  private Object creditPricingAssessmentEvaluateActionRecord = null;

  private String creditPricingAssessmentInstanceStatus = null;

  private CRCreditPricingAssessmentEvaluateInputModelCreditPricingAssessmentInstanceRecord creditPricingAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return creditManagementServicingSessionReference
  **/

  public String getCreditManagementServicingSessionReference() {
    return creditManagementServicingSessionReference;
  }

  public void setCreditManagementServicingSessionReference(String creditManagementServicingSessionReference) {
    this.creditManagementServicingSessionReference = creditManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Evaluate service call input and output record 
   * @return creditPricingAssessmentEvaluateActionRecord
  **/

  public Object getCreditPricingAssessmentEvaluateActionRecord() {
    return creditPricingAssessmentEvaluateActionRecord;
  }

  public void setCreditPricingAssessmentEvaluateActionRecord(Object creditPricingAssessmentEvaluateActionRecord) {
    this.creditPricingAssessmentEvaluateActionRecord = creditPricingAssessmentEvaluateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Credit Pricing Assessment instance (e.g. initialised, pending, active) 
   * @return creditPricingAssessmentInstanceStatus
  **/

  public String getCreditPricingAssessmentInstanceStatus() {
    return creditPricingAssessmentInstanceStatus;
  }

  public void setCreditPricingAssessmentInstanceStatus(String creditPricingAssessmentInstanceStatus) {
    this.creditPricingAssessmentInstanceStatus = creditPricingAssessmentInstanceStatus;
  }


  /**
   * Get creditPricingAssessmentInstanceRecord
   * @return creditPricingAssessmentInstanceRecord
  **/

  public CRCreditPricingAssessmentEvaluateInputModelCreditPricingAssessmentInstanceRecord getCreditPricingAssessmentInstanceRecord() {
    return creditPricingAssessmentInstanceRecord;
  }

  public void setCreditPricingAssessmentInstanceRecord(CRCreditPricingAssessmentEvaluateInputModelCreditPricingAssessmentInstanceRecord creditPricingAssessmentInstanceRecord) {
    this.creditPricingAssessmentInstanceRecord = creditPricingAssessmentInstanceRecord;
  }


}

