package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditPricingAssessmentRetrieveInputModelCreditPricingAssessmentInstanceAnalysis;
import org.bian.dto.CRCreditPricingAssessmentRetrieveInputModelCreditPricingAssessmentInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentRetrieveInputModel
 */
public class CRCreditPricingAssessmentRetrieveInputModel   {
  private Object creditPricingAssessmentRetrieveActionTaskRecord = null;

  private String creditPricingAssessmentRetrieveActionRequest = null;

  private CRCreditPricingAssessmentRetrieveInputModelCreditPricingAssessmentInstanceReportRecord creditPricingAssessmentInstanceReportRecord = null;

  private CRCreditPricingAssessmentRetrieveInputModelCreditPricingAssessmentInstanceAnalysis creditPricingAssessmentInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return creditPricingAssessmentRetrieveActionRequest
  **/

  public String getCreditPricingAssessmentRetrieveActionRequest() {
    return creditPricingAssessmentRetrieveActionRequest;
  }

  public void setCreditPricingAssessmentRetrieveActionRequest(String creditPricingAssessmentRetrieveActionRequest) {
    this.creditPricingAssessmentRetrieveActionRequest = creditPricingAssessmentRetrieveActionRequest;
  }


  /**
   * Get creditPricingAssessmentInstanceReportRecord
   * @return creditPricingAssessmentInstanceReportRecord
  **/

  public CRCreditPricingAssessmentRetrieveInputModelCreditPricingAssessmentInstanceReportRecord getCreditPricingAssessmentInstanceReportRecord() {
    return creditPricingAssessmentInstanceReportRecord;
  }

  public void setCreditPricingAssessmentInstanceReportRecord(CRCreditPricingAssessmentRetrieveInputModelCreditPricingAssessmentInstanceReportRecord creditPricingAssessmentInstanceReportRecord) {
    this.creditPricingAssessmentInstanceReportRecord = creditPricingAssessmentInstanceReportRecord;
  }


  /**
   * Get creditPricingAssessmentInstanceAnalysis
   * @return creditPricingAssessmentInstanceAnalysis
  **/

  public CRCreditPricingAssessmentRetrieveInputModelCreditPricingAssessmentInstanceAnalysis getCreditPricingAssessmentInstanceAnalysis() {
    return creditPricingAssessmentInstanceAnalysis;
  }

  public void setCreditPricingAssessmentInstanceAnalysis(CRCreditPricingAssessmentRetrieveInputModelCreditPricingAssessmentInstanceAnalysis creditPricingAssessmentInstanceAnalysis) {
    this.creditPricingAssessmentInstanceAnalysis = creditPricingAssessmentInstanceAnalysis;
  }


}

