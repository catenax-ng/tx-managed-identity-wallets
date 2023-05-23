package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * VerifiablePresentationRequestDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-22T13:09:57.551136732Z[GMT]")


public class VerifiablePresentationRequestDto   {
  @JsonProperty("holderIdentifier")
  private String holderIdentifier = null;

  @JsonProperty("verifiableCredentials")
  @Valid
  private List<VerifiableCredentialDto> verifiableCredentials = new ArrayList<VerifiableCredentialDto>();

  public VerifiablePresentationRequestDto holderIdentifier(String holderIdentifier) {
    this.holderIdentifier = holderIdentifier;
    return this;
  }

  /**
   * Get holderIdentifier
   * @return holderIdentifier
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getHolderIdentifier() {
    return holderIdentifier;
  }

  public void setHolderIdentifier(String holderIdentifier) {
    this.holderIdentifier = holderIdentifier;
  }

  public VerifiablePresentationRequestDto verifiableCredentials(List<VerifiableCredentialDto> verifiableCredentials) {
    this.verifiableCredentials = verifiableCredentials;
    return this;
  }

  public VerifiablePresentationRequestDto addVerifiableCredentialsItem(VerifiableCredentialDto verifiableCredentialsItem) {
    this.verifiableCredentials.add(verifiableCredentialsItem);
    return this;
  }

  /**
   * Get verifiableCredentials
   * @return verifiableCredentials
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<VerifiableCredentialDto> getVerifiableCredentials() {
    return verifiableCredentials;
  }

  public void setVerifiableCredentials(List<VerifiableCredentialDto> verifiableCredentials) {
    this.verifiableCredentials = verifiableCredentials;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiablePresentationRequestDto verifiablePresentationRequestDto = (VerifiablePresentationRequestDto) o;
    return Objects.equals(this.holderIdentifier, verifiablePresentationRequestDto.holderIdentifier) &&
        Objects.equals(this.verifiableCredentials, verifiablePresentationRequestDto.verifiableCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holderIdentifier, verifiableCredentials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiablePresentationRequestDto {\n");
    
    sb.append("    holderIdentifier: ").append(toIndentedString(holderIdentifier)).append("\n");
    sb.append("    verifiableCredentials: ").append(toIndentedString(verifiableCredentials)).append("\n");
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
