package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * LdProofDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")


public class LdProofDto   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("created")
  private String created = null;

  @JsonProperty("verificationMethod")
  private String verificationMethod = null;

  @JsonProperty("proofPurpose")
  private String proofPurpose = null;

  @JsonProperty("proofValue")
  private String proofValue = null;

  public LdProofDto type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LdProofDto created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public LdProofDto verificationMethod(String verificationMethod) {
    this.verificationMethod = verificationMethod;
    return this;
  }

  /**
   * Get verificationMethod
   * @return verificationMethod
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getVerificationMethod() {
    return verificationMethod;
  }

  public void setVerificationMethod(String verificationMethod) {
    this.verificationMethod = verificationMethod;
  }

  public LdProofDto proofPurpose(String proofPurpose) {
    this.proofPurpose = proofPurpose;
    return this;
  }

  /**
   * Get proofPurpose
   * @return proofPurpose
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getProofPurpose() {
    return proofPurpose;
  }

  public void setProofPurpose(String proofPurpose) {
    this.proofPurpose = proofPurpose;
  }

  public LdProofDto proofValue(String proofValue) {
    this.proofValue = proofValue;
    return this;
  }

  /**
   * Get proofValue
   * @return proofValue
   **/
  @Schema()
  
    public String getProofValue() {
    return proofValue;
  }

  public void setProofValue(String proofValue) {
    this.proofValue = proofValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdProofDto ldProofDto = (LdProofDto) o;
    return Objects.equals(this.type, ldProofDto.type) &&
        Objects.equals(this.created, ldProofDto.created) &&
        Objects.equals(this.verificationMethod, ldProofDto.verificationMethod) &&
        Objects.equals(this.proofPurpose, ldProofDto.proofPurpose) &&
        Objects.equals(this.proofValue, ldProofDto.proofValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, created, verificationMethod, proofPurpose, proofValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdProofDto {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    verificationMethod: ").append(toIndentedString(verificationMethod)).append("\n");
    sb.append("    proofPurpose: ").append(toIndentedString(proofPurpose)).append("\n");
    sb.append("    proofValue: ").append(toIndentedString(proofValue)).append("\n");
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
