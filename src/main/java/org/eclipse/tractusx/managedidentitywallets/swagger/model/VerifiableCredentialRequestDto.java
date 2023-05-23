package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * VerifiableCredentialRequestDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-22T13:09:57.551136732Z[GMT]")


public class VerifiableCredentialRequestDto   {
  @JsonProperty("@context")
  @Valid
  private List<String> _atContext = new ArrayList<String>();

  @JsonProperty("credentialSubject")
  @Valid
  private Map<String, Any> credentialSubject = new HashMap<String, Any>();

  @JsonProperty("expirationDate")
  private String expirationDate = null;

  @JsonProperty("holderIdentifier")
  private String holderIdentifier = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isRevocable")
  private Boolean isRevocable = null;

  @JsonProperty("issuanceDate")
  private String issuanceDate = null;

  @JsonProperty("issuerIdentifier")
  private String issuerIdentifier = null;

  @JsonProperty("type")
  @Valid
  private List<String> type = new ArrayList<String>();

  public VerifiableCredentialRequestDto _atContext(List<String> _atContext) {
    this._atContext = _atContext;
    return this;
  }

  public VerifiableCredentialRequestDto addAtContextItem(String _atContextItem) {
    this._atContext.add(_atContextItem);
    return this;
  }

  /**
   * Get _atContext
   * @return _atContext
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getAtContext() {
    return _atContext;
  }

  public void setAtContext(List<String> _atContext) {
    this._atContext = _atContext;
  }

  public VerifiableCredentialRequestDto credentialSubject(Map<String, Any> credentialSubject) {
    this.credentialSubject = credentialSubject;
    return this;
  }

  public VerifiableCredentialRequestDto putCredentialSubjectItem(String key, Any credentialSubjectItem) {
    this.credentialSubject.put(key, credentialSubjectItem);
    return this;
  }

  /**
   * Get credentialSubject
   * @return credentialSubject
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public Map<String, Any> getCredentialSubject() {
    return credentialSubject;
  }

  public void setCredentialSubject(Map<String, Any> credentialSubject) {
    this.credentialSubject = credentialSubject;
  }

  public VerifiableCredentialRequestDto expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   **/
  @Schema(description = "")
  
    public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public VerifiableCredentialRequestDto holderIdentifier(String holderIdentifier) {
    this.holderIdentifier = holderIdentifier;
    return this;
  }

  /**
   * Get holderIdentifier
   * @return holderIdentifier
   **/
  @Schema(description = "")
  
    public String getHolderIdentifier() {
    return holderIdentifier;
  }

  public void setHolderIdentifier(String holderIdentifier) {
    this.holderIdentifier = holderIdentifier;
  }

  public VerifiableCredentialRequestDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VerifiableCredentialRequestDto isRevocable(Boolean isRevocable) {
    this.isRevocable = isRevocable;
    return this;
  }

  /**
   * Get isRevocable
   * @return isRevocable
   **/
  @Schema(description = "")
  
    public Boolean isIsRevocable() {
    return isRevocable;
  }

  public void setIsRevocable(Boolean isRevocable) {
    this.isRevocable = isRevocable;
  }

  public VerifiableCredentialRequestDto issuanceDate(String issuanceDate) {
    this.issuanceDate = issuanceDate;
    return this;
  }

  /**
   * Get issuanceDate
   * @return issuanceDate
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getIssuanceDate() {
    return issuanceDate;
  }

  public void setIssuanceDate(String issuanceDate) {
    this.issuanceDate = issuanceDate;
  }

  public VerifiableCredentialRequestDto issuerIdentifier(String issuerIdentifier) {
    this.issuerIdentifier = issuerIdentifier;
    return this;
  }

  /**
   * Get issuerIdentifier
   * @return issuerIdentifier
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getIssuerIdentifier() {
    return issuerIdentifier;
  }

  public void setIssuerIdentifier(String issuerIdentifier) {
    this.issuerIdentifier = issuerIdentifier;
  }

  public VerifiableCredentialRequestDto type(List<String> type) {
    this.type = type;
    return this;
  }

  public VerifiableCredentialRequestDto addTypeItem(String typeItem) {
    this.type.add(typeItem);
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(required = true, description = "")
      @NotNull

    public List<String> getType() {
    return type;
  }

  public void setType(List<String> type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiableCredentialRequestDto verifiableCredentialRequestDto = (VerifiableCredentialRequestDto) o;
    return Objects.equals(this._atContext, verifiableCredentialRequestDto._atContext) &&
        Objects.equals(this.credentialSubject, verifiableCredentialRequestDto.credentialSubject) &&
        Objects.equals(this.expirationDate, verifiableCredentialRequestDto.expirationDate) &&
        Objects.equals(this.holderIdentifier, verifiableCredentialRequestDto.holderIdentifier) &&
        Objects.equals(this.id, verifiableCredentialRequestDto.id) &&
        Objects.equals(this.isRevocable, verifiableCredentialRequestDto.isRevocable) &&
        Objects.equals(this.issuanceDate, verifiableCredentialRequestDto.issuanceDate) &&
        Objects.equals(this.issuerIdentifier, verifiableCredentialRequestDto.issuerIdentifier) &&
        Objects.equals(this.type, verifiableCredentialRequestDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, credentialSubject, expirationDate, holderIdentifier, id, isRevocable, issuanceDate, issuerIdentifier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiableCredentialRequestDto {\n");
    
    sb.append("    _atContext: ").append(toIndentedString(_atContext)).append("\n");
    sb.append("    credentialSubject: ").append(toIndentedString(credentialSubject)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    holderIdentifier: ").append(toIndentedString(holderIdentifier)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRevocable: ").append(toIndentedString(isRevocable)).append("\n");
    sb.append("    issuanceDate: ").append(toIndentedString(issuanceDate)).append("\n");
    sb.append("    issuerIdentifier: ").append(toIndentedString(issuerIdentifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
