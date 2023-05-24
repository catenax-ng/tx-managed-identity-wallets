package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * VerifyResponse
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")


public class VerifyResponse   {
  @JsonProperty("error")
  private String error = null;

  @JsonProperty("valid")
  private Boolean valid = null;

  @JsonProperty("vp")
  private VerifiablePresentationDto vp = null;

  public VerifyResponse error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
  @Schema()
  
    public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public VerifyResponse valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  /**
   * Get valid
   * @return valid
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public VerifyResponse vp(VerifiablePresentationDto vp) {
    this.vp = vp;
    return this;
  }

  /**
   * Get vp
   * @return vp
   **/
  @Schema()
  
    @Valid
    public VerifiablePresentationDto getVp() {
    return vp;
  }

  public void setVp(VerifiablePresentationDto vp) {
    this.vp = vp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifyResponse verifyResponse = (VerifyResponse) o;
    return Objects.equals(this.error, verifyResponse.error) &&
        Objects.equals(this.valid, verifyResponse.valid) &&
        Objects.equals(this.vp, verifyResponse.vp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, valid, vp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifyResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    vp: ").append(toIndentedString(vp)).append("\n");
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
