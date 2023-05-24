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
 * VerifiablePresentationDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")


public class VerifiablePresentationDto   {
  @JsonProperty("@context")
  @Valid
  private List<String> _atContext = new ArrayList<String>();

  @JsonProperty("holder")
  private String holder = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("proof")
  private LdProofDto proof = null;

  @JsonProperty("type")
  @Valid
  private List<String> type = new ArrayList<String>();

  @JsonProperty("verifiableCredential")
  @Valid
  private List<VerifiableCredentialDto> verifiableCredential = null;

  public VerifiablePresentationDto _atContext(List<String> _atContext) {
    this._atContext = _atContext;
    return this;
  }

  public VerifiablePresentationDto addAtContextItem(String _atContextItem) {
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

  public VerifiablePresentationDto holder(String holder) {
    this.holder = holder;
    return this;
  }

  /**
   * Get holder
   * @return holder
   **/
  @Schema()
  
    public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public VerifiablePresentationDto id(String id) {
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

  public VerifiablePresentationDto proof(LdProofDto proof) {
    this.proof = proof;
    return this;
  }

  /**
   * Get proof
   * @return proof
   **/
  @Schema()
  
    @Valid
    public LdProofDto getProof() {
    return proof;
  }

  public void setProof(LdProofDto proof) {
    this.proof = proof;
  }

  public VerifiablePresentationDto type(List<String> type) {
    this.type = type;
    return this;
  }

  public VerifiablePresentationDto addTypeItem(String typeItem) {
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

  public VerifiablePresentationDto verifiableCredential(List<VerifiableCredentialDto> verifiableCredential) {
    this.verifiableCredential = verifiableCredential;
    return this;
  }

  public VerifiablePresentationDto addVerifiableCredentialItem(VerifiableCredentialDto verifiableCredentialItem) {
    if (this.verifiableCredential == null) {
      this.verifiableCredential = new ArrayList<VerifiableCredentialDto>();
    }
    this.verifiableCredential.add(verifiableCredentialItem);
    return this;
  }

  /**
   * Get verifiableCredential
   * @return verifiableCredential
   **/
  @Schema()
      @Valid
    public List<VerifiableCredentialDto> getVerifiableCredential() {
    return verifiableCredential;
  }

  public void setVerifiableCredential(List<VerifiableCredentialDto> verifiableCredential) {
    this.verifiableCredential = verifiableCredential;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiablePresentationDto verifiablePresentationDto = (VerifiablePresentationDto) o;
    return Objects.equals(this._atContext, verifiablePresentationDto._atContext) &&
        Objects.equals(this.holder, verifiablePresentationDto.holder) &&
        Objects.equals(this.id, verifiablePresentationDto.id) &&
        Objects.equals(this.proof, verifiablePresentationDto.proof) &&
        Objects.equals(this.type, verifiablePresentationDto.type) &&
        Objects.equals(this.verifiableCredential, verifiablePresentationDto.verifiableCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_atContext, holder, id, proof, type, verifiableCredential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiablePresentationDto {\n");
    
    sb.append("    _atContext: ").append(toIndentedString(_atContext)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    proof: ").append(toIndentedString(proof)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    verifiableCredential: ").append(toIndentedString(verifiableCredential)).append("\n");
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
