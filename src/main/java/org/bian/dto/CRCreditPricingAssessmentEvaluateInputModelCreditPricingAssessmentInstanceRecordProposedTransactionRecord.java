package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentEvaluateInputModelCreditPricingAssessmentInstanceRecordProposedTransactionRecord
 */
public class CRCreditPricingAssessmentEvaluateInputModelCreditPricingAssessmentInstanceRecordProposedTransactionRecord   {
  private String proposedTransactionType = null;

  private String proposedTransactionAmount = null;

  private String proposedTransactionRecordDate = null;

  private String proposedTransactionBookingEntity = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of credit instrument being considered 
   * @return proposedTransactionType
  **/

  public String getProposedTransactionType() {
    return proposedTransactionType;
  }

  public void setProposedTransactionType(String proposedTransactionType) {
    this.proposedTransactionType = proposedTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The financial structure of the proposed transaction 
   * @return proposedTransactionAmount
  **/

  public String getProposedTransactionAmount() {
    return proposedTransactionAmount;
  }

  public void setProposedTransactionAmount(String proposedTransactionAmount) {
    this.proposedTransactionAmount = proposedTransactionAmount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: One or more key dates associated with the transaction 
   * @return proposedTransactionRecordDate
  **/

  public String getProposedTransactionRecordDate() {
    return proposedTransactionRecordDate;
  }

  public void setProposedTransactionRecordDate(String proposedTransactionRecordDate) {
    this.proposedTransactionRecordDate = proposedTransactionRecordDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The booking entity within the bank that the proposed transaction would impact 
   * @return proposedTransactionBookingEntity
  **/

  public String getProposedTransactionBookingEntity() {
    return proposedTransactionBookingEntity;
  }

  public void setProposedTransactionBookingEntity(String proposedTransactionBookingEntity) {
    this.proposedTransactionBookingEntity = proposedTransactionBookingEntity;
  }


}

