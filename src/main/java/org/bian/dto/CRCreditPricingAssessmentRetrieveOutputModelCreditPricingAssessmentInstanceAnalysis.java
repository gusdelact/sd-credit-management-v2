package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceAnalysis
 */
public class CRCreditPricingAssessmentRetrieveOutputModelCreditPricingAssessmentInstanceAnalysis   {
  private String creditPricingAssessmentInstanceAnalysisData = null;

  private String creditPricingAssessmentInstanceAnalysisReportType = null;

  private Object creditPricingAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return creditPricingAssessmentInstanceAnalysisData
  **/

  public String getCreditPricingAssessmentInstanceAnalysisData() {
    return creditPricingAssessmentInstanceAnalysisData;
  }

  public void setCreditPricingAssessmentInstanceAnalysisData(String creditPricingAssessmentInstanceAnalysisData) {
    this.creditPricingAssessmentInstanceAnalysisData = creditPricingAssessmentInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return creditPricingAssessmentInstanceAnalysisReportType
  **/

  public String getCreditPricingAssessmentInstanceAnalysisReportType() {
    return creditPricingAssessmentInstanceAnalysisReportType;
  }

  public void setCreditPricingAssessmentInstanceAnalysisReportType(String creditPricingAssessmentInstanceAnalysisReportType) {
    this.creditPricingAssessmentInstanceAnalysisReportType = creditPricingAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return creditPricingAssessmentInstanceAnalysisReport
  **/

  public Object getCreditPricingAssessmentInstanceAnalysisReport() {
    return creditPricingAssessmentInstanceAnalysisReport;
  }

  public void setCreditPricingAssessmentInstanceAnalysisReport(Object creditPricingAssessmentInstanceAnalysisReport) {
    this.creditPricingAssessmentInstanceAnalysisReport = creditPricingAssessmentInstanceAnalysisReport;
  }


}

