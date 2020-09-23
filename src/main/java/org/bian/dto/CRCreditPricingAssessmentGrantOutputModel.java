package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditPricingAssessmentGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentGrantOutputModel
 */
public class CRCreditPricingAssessmentGrantOutputModel   {
  private String creditPricingAssessmentGrantActionTaskReference = null;

  private Object creditPricingAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRCreditPricingAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Pricing Assessment instance grant service call 
   * @return creditPricingAssessmentGrantActionTaskReference
  **/

  public String getCreditPricingAssessmentGrantActionTaskReference() {
    return creditPricingAssessmentGrantActionTaskReference;
  }

  public void setCreditPricingAssessmentGrantActionTaskReference(String creditPricingAssessmentGrantActionTaskReference) {
    this.creditPricingAssessmentGrantActionTaskReference = creditPricingAssessmentGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return creditPricingAssessmentGrantActionTaskRecord
  **/

  public Object getCreditPricingAssessmentGrantActionTaskRecord() {
    return creditPricingAssessmentGrantActionTaskRecord;
  }

  public void setCreditPricingAssessmentGrantActionTaskRecord(Object creditPricingAssessmentGrantActionTaskRecord) {
    this.creditPricingAssessmentGrantActionTaskRecord = creditPricingAssessmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRCreditPricingAssessmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRCreditPricingAssessmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

