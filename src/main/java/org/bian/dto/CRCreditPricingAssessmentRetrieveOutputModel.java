package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceAnalysis;
import org.bian.dto.CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceRecord;
import org.bian.dto.CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentRetrieveOutputModel
 */
public class CRCreditPricingAssessmentRetrieveOutputModel   {
  private CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceRecord creditPricingAssessmentInstanceRecord = null;

  private String creditPricingAssessmentRetrieveActionTaskReference = null;

  private Object creditPricingAssessmentRetrieveActionTaskRecord = null;

  private String creditPricingAssessmentRetrieveActionResponse = null;

  private CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceReportRecord creditPricingAssessmentInstanceReportRecord = null;

  private CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceAnalysis creditPricingAssessmentInstanceAnalysis = null;


  /**
   * Get creditPricingAssessmentInstanceRecord
   * @return creditPricingAssessmentInstanceRecord
  **/

  public CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceRecord getCreditPricingAssessmentInstanceRecord() {
    return creditPricingAssessmentInstanceRecord;
  }

  public void setCreditPricingAssessmentInstanceRecord(CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceRecord creditPricingAssessmentInstanceRecord) {
    this.creditPricingAssessmentInstanceRecord = creditPricingAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Credit Pricing Assessment instance retrieve service call 
   * @return creditPricingAssessmentRetrieveActionTaskReference
  **/

  public String getCreditPricingAssessmentRetrieveActionTaskReference() {
    return creditPricingAssessmentRetrieveActionTaskReference;
  }

  public void setCreditPricingAssessmentRetrieveActionTaskReference(String creditPricingAssessmentRetrieveActionTaskReference) {
    this.creditPricingAssessmentRetrieveActionTaskReference = creditPricingAssessmentRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return creditPricingAssessmentRetrieveActionTaskRecord
  **/

  public Object getCreditPricingAssessmentRetrieveActionTaskRecord() {
    return creditPricingAssessmentRetrieveActionTaskRecord;
  }

  public void setCreditPricingAssessmentRetrieveActionTaskRecord(Object creditPricingAssessmentRetrieveActionTaskRecord) {
    this.creditPricingAssessmentRetrieveActionTaskRecord = creditPricingAssessmentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return creditPricingAssessmentRetrieveActionResponse
  **/

  public String getCreditPricingAssessmentRetrieveActionResponse() {
    return creditPricingAssessmentRetrieveActionResponse;
  }

  public void setCreditPricingAssessmentRetrieveActionResponse(String creditPricingAssessmentRetrieveActionResponse) {
    this.creditPricingAssessmentRetrieveActionResponse = creditPricingAssessmentRetrieveActionResponse;
  }


  /**
   * Get creditPricingAssessmentInstanceReportRecord
   * @return creditPricingAssessmentInstanceReportRecord
  **/

  public CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceReportRecord getCreditPricingAssessmentInstanceReportRecord() {
    return creditPricingAssessmentInstanceReportRecord;
  }

  public void setCreditPricingAssessmentInstanceReportRecord(CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceReportRecord creditPricingAssessmentInstanceReportRecord) {
    this.creditPricingAssessmentInstanceReportRecord = creditPricingAssessmentInstanceReportRecord;
  }


  /**
   * Get creditPricingAssessmentInstanceAnalysis
   * @return creditPricingAssessmentInstanceAnalysis
  **/

  public CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceAnalysis getCreditPricingAssessmentInstanceAnalysis() {
    return creditPricingAssessmentInstanceAnalysis;
  }

  public void setCreditPricingAssessmentInstanceAnalysis(CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceAnalysis creditPricingAssessmentInstanceAnalysis) {
    this.creditPricingAssessmentInstanceAnalysis = creditPricingAssessmentInstanceAnalysis;
  }


}

