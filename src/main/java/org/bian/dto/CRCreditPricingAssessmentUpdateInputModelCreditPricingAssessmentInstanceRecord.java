package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCreditPricingAssessmentEvaluateInputModelCreditPricingAssessmentInstanceRecordProposedTransactionRecord;

import javax.validation.Valid;
  
/**
 * CRCreditPricingAssessmentUpdateInputModelCreditPricingAssessmentInstanceRecord
 */
public class CRCreditPricingAssessmentUpdateInputModelCreditPricingAssessmentInstanceRecord   {
  private String businessUnitReference = null;

  private String customerReference = null;

  private String sectorReference = null;

  private String productType = null;

  private String proposedTransactionReference = null;

  private CRCreditPricingAssessmentEvaluateInputModelCreditPricingAssessmentInstanceRecordProposedTransactionRecord proposedTransactionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit submitting the proposed transaction for review 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer related to the proposed transaction 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The sector where the proposed transaction would be booked 
   * @return sectorReference
  **/

  public String getSectorReference() {
    return sectorReference;
  }

  public void setSectorReference(String sectorReference) {
    this.sectorReference = sectorReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The product type/category of the proposed transaction for the credit pricing assessment 
   * @return productType
  **/

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to proposed transaction submitted for assessment 
   * @return proposedTransactionReference
  **/

  public String getProposedTransactionReference() {
    return proposedTransactionReference;
  }

  public void setProposedTransactionReference(String proposedTransactionReference) {
    this.proposedTransactionReference = proposedTransactionReference;
  }


  /**
   * Get proposedTransactionRecord
   * @return proposedTransactionRecord
  **/

  public CRCreditPricingAssessmentEvaluateInputModelCreditPricingAssessmentInstanceRecordProposedTransactionRecord getProposedTransactionRecord() {
    return proposedTransactionRecord;
  }

  public void setProposedTransactionRecord(CRCreditPricingAssessmentEvaluateInputModelCreditPricingAssessmentInstanceRecordProposedTransactionRecord proposedTransactionRecord) {
    this.proposedTransactionRecord = proposedTransactionRecord;
  }


}

