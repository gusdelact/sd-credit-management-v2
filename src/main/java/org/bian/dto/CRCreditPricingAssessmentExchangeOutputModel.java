package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentExchangeOutputModel
 */
public class CRCreditPricingAssessmentExchangeOutputModel   {
  private String creditPricingAssessmentExchangeActionTaskReference = null;

  private Object creditPricingAssessmentExchangeActionTaskRecord = null;

  private String creditPricingAssessmentExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Pricing Assessment instance exchange service call 
   * @return creditPricingAssessmentExchangeActionTaskReference
  **/

  public String getCreditPricingAssessmentExchangeActionTaskReference() {
    return creditPricingAssessmentExchangeActionTaskReference;
  }

  public void setCreditPricingAssessmentExchangeActionTaskReference(String creditPricingAssessmentExchangeActionTaskReference) {
    this.creditPricingAssessmentExchangeActionTaskReference = creditPricingAssessmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return creditPricingAssessmentExchangeActionTaskRecord
  **/

  public Object getCreditPricingAssessmentExchangeActionTaskRecord() {
    return creditPricingAssessmentExchangeActionTaskRecord;
  }

  public void setCreditPricingAssessmentExchangeActionTaskRecord(Object creditPricingAssessmentExchangeActionTaskRecord) {
    this.creditPricingAssessmentExchangeActionTaskRecord = creditPricingAssessmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return creditPricingAssessmentExchangeActionResponse
  **/

  public String getCreditPricingAssessmentExchangeActionResponse() {
    return creditPricingAssessmentExchangeActionResponse;
  }

  public void setCreditPricingAssessmentExchangeActionResponse(String creditPricingAssessmentExchangeActionResponse) {
    this.creditPricingAssessmentExchangeActionResponse = creditPricingAssessmentExchangeActionResponse;
  }


}

