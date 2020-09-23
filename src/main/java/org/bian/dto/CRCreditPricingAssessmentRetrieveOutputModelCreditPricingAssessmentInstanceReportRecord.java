package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceReportRecord
 */
public class CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceReportRecord   {
  private String creditPricingAssessmentInstanceReportData = null;

  private String creditPricingAssessmentInstanceReportType = null;

  private Object creditPricingAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return creditPricingAssessmentInstanceReportData
  **/

  public String getCreditPricingAssessmentInstanceReportData() {
    return creditPricingAssessmentInstanceReportData;
  }

  public void setCreditPricingAssessmentInstanceReportData(String creditPricingAssessmentInstanceReportData) {
    this.creditPricingAssessmentInstanceReportData = creditPricingAssessmentInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return creditPricingAssessmentInstanceReportType
  **/

  public String getCreditPricingAssessmentInstanceReportType() {
    return creditPricingAssessmentInstanceReportType;
  }

  public void setCreditPricingAssessmentInstanceReportType(String creditPricingAssessmentInstanceReportType) {
    this.creditPricingAssessmentInstanceReportType = creditPricingAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return creditPricingAssessmentInstanceReport
  **/

  public Object getCreditPricingAssessmentInstanceReport() {
    return creditPricingAssessmentInstanceReport;
  }

  public void setCreditPricingAssessmentInstanceReport(Object creditPricingAssessmentInstanceReport) {
    this.creditPricingAssessmentInstanceReport = creditPricingAssessmentInstanceReport;
  }


}

