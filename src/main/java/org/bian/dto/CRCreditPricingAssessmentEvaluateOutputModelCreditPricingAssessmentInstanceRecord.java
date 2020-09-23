package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentEvaluateOutputModelCreditPricingAssessmentInstanceRecord
 */
public class CRCreditPricingAssessmentEvaluateOutputModelCreditPricingAssessmentInstanceRecord   {
  private String proposedTransactionCreditPricingAssessment = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the credit pricing assessment, permitting or adjusting terms as necessary 
   * @return proposedTransactionCreditPricingAssessment
  **/

  public String getProposedTransactionCreditPricingAssessment() {
    return proposedTransactionCreditPricingAssessment;
  }

  public void setProposedTransactionCreditPricingAssessment(String proposedTransactionCreditPricingAssessment) {
    this.proposedTransactionCreditPricingAssessment = proposedTransactionCreditPricingAssessment;
  }


}

