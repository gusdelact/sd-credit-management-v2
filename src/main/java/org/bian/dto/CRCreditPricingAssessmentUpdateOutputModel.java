package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditPricingAssessmentUpdateInputModelCreditPricingAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentUpdateOutputModel
 */
public class CRCreditPricingAssessmentUpdateOutputModel   {
  private CRCreditPricingAssessmentUpdateInputModelCreditPricingAssessmentInstanceRecord creditPricingAssessmentInstanceRecord = null;

  private String creditPricingAssessmentUpdateActionTaskReference = null;

  private Object creditPricingAssessmentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return creditPricingAssessmentUpdateActionTaskReference
  **/

  public String getCreditPricingAssessmentUpdateActionTaskReference() {
    return creditPricingAssessmentUpdateActionTaskReference;
  }

  public void setCreditPricingAssessmentUpdateActionTaskReference(String creditPricingAssessmentUpdateActionTaskReference) {
    this.creditPricingAssessmentUpdateActionTaskReference = creditPricingAssessmentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

