package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditPricingAssessmentEvaluateOutputModelCreditPricingAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentEvaluateOutputModel
 */
public class CRCreditPricingAssessmentEvaluateOutputModel   {
  private String creditPricingAssessmentInstanceReference = null;

  private String creditPricingAssessmentEvaluateActionReference = null;

  private Object creditPricingAssessmentEvaluateActionRecord = null;

  private String creditPricingAssessmentInstanceStatus = null;

  private CRCreditPricingAssessmentEvaluateOutputModelCreditPricingAssessmentInstanceRecord creditPricingAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Credit Pricing Assessment instance 
   * @return creditPricingAssessmentInstanceReference
  **/

  public String getCreditPricingAssessmentInstanceReference() {
    return creditPricingAssessmentInstanceReference;
  }

  public void setCreditPricingAssessmentInstanceReference(String creditPricingAssessmentInstanceReference) {
    this.creditPricingAssessmentInstanceReference = creditPricingAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Evaluate service call 
   * @return creditPricingAssessmentEvaluateActionReference
  **/

  public String getCreditPricingAssessmentEvaluateActionReference() {
    return creditPricingAssessmentEvaluateActionReference;
  }

  public void setCreditPricingAssessmentEvaluateActionReference(String creditPricingAssessmentEvaluateActionReference) {
    this.creditPricingAssessmentEvaluateActionReference = creditPricingAssessmentEvaluateActionReference;
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

  public CRCreditPricingAssessmentEvaluateOutputModelCreditPricingAssessmentInstanceRecord getCreditPricingAssessmentInstanceRecord() {
    return creditPricingAssessmentInstanceRecord;
  }

  public void setCreditPricingAssessmentInstanceRecord(CRCreditPricingAssessmentEvaluateOutputModelCreditPricingAssessmentInstanceRecord creditPricingAssessmentInstanceRecord) {
    this.creditPricingAssessmentInstanceRecord = creditPricingAssessmentInstanceRecord;
  }


}

