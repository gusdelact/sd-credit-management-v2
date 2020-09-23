package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditPricingAssessmentGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentGrantInputModel
 */
public class CRCreditPricingAssessmentGrantInputModel   {
  private String creditManagementServicingSessionReference = null;

  private String creditPricingAssessmentInstanceReference = null;

  private Object creditPricingAssessmentGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRCreditPricingAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRCreditPricingAssessmentGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRCreditPricingAssessmentGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

