package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditPricingAssessmentExchangeInputModelCreditPricingAssessmentExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentExchangeInputModel
 */
public class CRCreditPricingAssessmentExchangeInputModel   {
  private String creditManagementServicingSessionReference = null;

  private String creditPricingAssessmentInstanceReference = null;

  private Object creditPricingAssessmentExchangeActionTaskRecord = null;

  private CRCreditPricingAssessmentExchangeInputModelCreditPricingAssessmentExchangeActionRequest creditPricingAssessmentExchangeActionRequest = null;


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
   * Get creditPricingAssessmentExchangeActionRequest
   * @return creditPricingAssessmentExchangeActionRequest
  **/

  public CRCreditPricingAssessmentExchangeInputModelCreditPricingAssessmentExchangeActionRequest getCreditPricingAssessmentExchangeActionRequest() {
    return creditPricingAssessmentExchangeActionRequest;
  }

  public void setCreditPricingAssessmentExchangeActionRequest(CRCreditPricingAssessmentExchangeInputModelCreditPricingAssessmentExchangeActionRequest creditPricingAssessmentExchangeActionRequest) {
    this.creditPricingAssessmentExchangeActionRequest = creditPricingAssessmentExchangeActionRequest;
  }


}

