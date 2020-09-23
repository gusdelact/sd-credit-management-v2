package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditPricingAssessmentUpdateInputModelCreditPricingAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentUpdateInputModel
 */
public class CRCreditPricingAssessmentUpdateInputModel   {
  private String creditManagementServicingSessionReference = null;

  private String creditPricingAssessmentInstanceReference = null;

  private CRCreditPricingAssessmentUpdateInputModelCreditPricingAssessmentInstanceRecord creditPricingAssessmentInstanceRecord = null;

  private Object creditPricingAssessmentUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get creditPricingAssessmentInstanceRecord
   * @return creditPricingAssessmentInstanceRecord
  **/

  public CRCreditPricingAssessmentUpdateInputModelCreditPricingAssessmentInstanceRecord getCreditPricingAssessmentInstanceRecord() {
    return creditPricingAssessmentInstanceRecord;
  }

  public void setCreditPricingAssessmentInstanceRecord(CRCreditPricingAssessmentUpdateInputModelCreditPricingAssessmentInstanceRecord creditPricingAssessmentInstanceRecord) {
    this.creditPricingAssessmentInstanceRecord = creditPricingAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return creditPricingAssessmentUpdateActionTaskRecord
  **/

  public Object getCreditPricingAssessmentUpdateActionTaskRecord() {
    return creditPricingAssessmentUpdateActionTaskRecord;
  }

  public void setCreditPricingAssessmentUpdateActionTaskRecord(Object creditPricingAssessmentUpdateActionTaskRecord) {
    this.creditPricingAssessmentUpdateActionTaskRecord = creditPricingAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

