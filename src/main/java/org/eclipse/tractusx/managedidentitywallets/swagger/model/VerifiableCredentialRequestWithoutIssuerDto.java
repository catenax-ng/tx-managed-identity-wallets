package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * VerifiableCredentialRequestWithoutIssuerDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")


public class VerifiableCredentialRequestWithoutIssuerDto   {
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

  @JsonProperty("type")
  @Valid
  private List<String> type = new ArrayList<String>();

  public VerifiableCredentialRequestWithoutIssuerDto _atContext(List<String> _atContext) {
    this._atContext = _atContext;
    return this;
  }

  public VerifiableCredentialRequestWithoutIssuerDto addAtContextItem(String _atContextItem) {
    this._atContext.add(_atContextItem);
    return this;
  }

  /**
   * Get _atContext
   * @return _atContext
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public List<String> getAtContext() {
    return _atContext;
  }

  public void setAtContext(List<String> _atContext) {
    this._atContext = _atContext;
  }

  public VerifiableCredentialRequestWithoutIssuerDto credentialSubject(Map<String, Any> credentialSubject) {
    this.credentialSubject = credentialSubject;
    return this;
  }

  public VerifiableCredentialRequestWithoutIssuerDto putCredentialSubjectItem(String key, Any credentialSubjectItem) {
    this.credentialSubject.put(key, credentialSubjectItem);
    return this;
  }

  /**
   * Get credentialSubject
   * @return credentialSubject
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull
    @Valid
    public Map<String, Any> getCredentialSubject() {
    return credentialSubject;
  }

  public void setCredentialSubject(Map<String, Any> credentialSubject) {
    this.credentialSubject = credentialSubject;
  }

  public VerifiableCredentialRequestWithoutIssuerDto expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   **/
  @Schema()
  
    public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public VerifiableCredentialRequestWithoutIssuerDto holderIdentifier(String holderIdentifier) {
    this.holderIdentifier = holderIdentifier;
    return this;
  }

  /**
   * Get holderIdentifier
   * @return holderIdentifier
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getHolderIdentifier() {
    return holderIdentifier;
  }

  public void setHolderIdentifier(String holderIdentifier) {
    this.holderIdentifier = holderIdentifier;
  }

  public VerifiableCredentialRequestWithoutIssuerDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema()
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VerifiableCredentialRequestWithoutIssuerDto isRevocable(Boolean isRevocable) {
    this.isRevocable = isRevocable;
    return this;
  }

  /**
   * Get isRevocable
   * @return isRevocable
   **/
  @Schema()
  
    public Boolean isIsRevocable() {
    return isRevocable;
  }

  public void setIsRevocable(Boolean isRevocable) {
    this.isRevocable = isRevocable;
  }

  public VerifiableCredentialRequestWithoutIssuerDto issuanceDate(String issuanceDate) {
    this.issuanceDate = issuanceDate;
    return this;
  }

  /**
   * Get issuanceDate
   * @return issuanceDate
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getIssuanceDate() {
    return issuanceDate;
  }

  public void setIssuanceDate(String issuanceDate) {
    this.issuanceDate = issuanceDate;
  }

  public VerifiableCredentialRequestWithoutIssuerDto type(List<String> type) {
    this.type = type;
    return this;
  }

  public VerifiableCredentialRequestWithoutIssuerDto addTypeItem(String typeItem) {
    this.type.add(typeItem);
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
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
    VerifiableCredentialRequestWithoutIssuerDto verifiableCredentialRequestWithoutIssuerDto = (VerifiableCredentialRequestWithoutIssuerDto) o;
    return Objects.equals(this._atContext, verifiableCredentialRequestWithoutIssuerDto._atContext) &&
        Objects.equals(this.credentialSubject, verifiableCredentialRequestWithoutIssuerDto.credentialSubject) &&
        Objects.equals(this.expirationDate, verifiableCredentialRequestWithoutIssuerDto.expirationDate) &&
        Objects.equals(this.holderIdentifier, verifiableCredentialRequestWithoutIssuerDto.holderIdentifier) &&
        Objects.equals(this.id, verifiableCredentialRequestWithoutIssuerDto.id) &&
        Objects.equals(this.isRevocable, verifiableCredentialRequestWithoutIssuerDto.isRevocable) &&
        Objects.equals(this.issuanceDate, verifiableCredentialRequestWithoutIssuerDto.issuanceDate) &&
        Objects.equals(this.type, verifiableCredentialRequestWithoutIssuerDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, credentialSubject, expirationDate, holderIdentifier, id, isRevocable, issuanceDate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiableCredentialRequestWithoutIssuerDto {\n");
    
    sb.append("    _atContext: ").append(toIndentedString(_atContext)).append("\n");
    sb.append("    credentialSubject: ").append(toIndentedString(credentialSubject)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    holderIdentifier: ").append(toIndentedString(holderIdentifier)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRevocable: ").append(toIndentedString(isRevocable)).append("\n");
    sb.append("    issuanceDate: ").append(toIndentedString(issuanceDate)).append("\n");
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
