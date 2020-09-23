package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentRetrieveInputModelCreditPricingAssessmentInstanceAnalysis
 */
public class CRCreditPricingAssessmentRetrieveInputModelCreditPricingAssessmentInstanceAnalysis   {
  private String creditPricingAssessmentInstanceAnalysisReference = null;

  private String creditPricingAssessmentInstanceAnalysisReportType = null;

  private String creditPricingAssessmentInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return creditPricingAssessmentInstanceAnalysisReference
  **/

  public String getCreditPricingAssessmentInstanceAnalysisReference() {
    return creditPricingAssessmentInstanceAnalysisReference;
  }

  public void setCreditPricingAssessmentInstanceAnalysisReference(String creditPricingAssessmentInstanceAnalysisReference) {
    this.creditPricingAssessmentInstanceAnalysisReference = creditPricingAssessmentInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return creditPricingAssessmentInstanceAnalysisParameters
  **/

  public String getCreditPricingAssessmentInstanceAnalysisParameters() {
    return creditPricingAssessmentInstanceAnalysisParameters;
  }

  public void setCreditPricingAssessmentInstanceAnalysisParameters(String creditPricingAssessmentInstanceAnalysisParameters) {
    this.creditPricingAssessmentInstanceAnalysisParameters = creditPricingAssessmentInstanceAnalysisParameters;
  }


}

