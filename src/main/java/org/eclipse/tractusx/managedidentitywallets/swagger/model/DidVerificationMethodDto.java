package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * DidVerificationMethodDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")


public class DidVerificationMethodDto   {
  @JsonProperty("controller")
  private String controller = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("publicKeyBase58")
  private String publicKeyBase58 = null;

  @JsonProperty("publicKeyBase64")
  private String publicKeyBase64 = null;

  @JsonProperty("publicKeyHex")
  private String publicKeyHex = null;

  @JsonProperty("publicKeyJwk")
  private PublicKeyJwkDto publicKeyJwk = null;

  @JsonProperty("publicKeyMultibase")
  private String publicKeyMultibase = null;

  @JsonProperty("publicKeyPem")
  private String publicKeyPem = null;

  @JsonProperty("type")
  private String type = null;

  public DidVerificationMethodDto controller(String controller) {
    this.controller = controller;
    return this;
  }

  /**
   * Get controller
   * @return controller
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
  @NotNull

  public String getController() {
    return controller;
  }

  public void setController(String controller) {
    this.controller = controller;
  }

  public DidVerificationMethodDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DidVerificationMethodDto publicKeyBase58(String publicKeyBase58) {
    this.publicKeyBase58 = publicKeyBase58;
    return this;
  }

  /**
   * Get publicKeyBase58
   * @return publicKeyBase58
   **/
  @Schema()
  
    public String getPublicKeyBase58() {
    return publicKeyBase58;
  }

  public void setPublicKeyBase58(String publicKeyBase58) {
    this.publicKeyBase58 = publicKeyBase58;
  }

  public DidVerificationMethodDto publicKeyBase64(String publicKeyBase64) {
    this.publicKeyBase64 = publicKeyBase64;
    return this;
  }

  /**
   * Get publicKeyBase64
   * @return publicKeyBase64
   **/
  @Schema()
  
    public String getPublicKeyBase64() {
    return publicKeyBase64;
  }

  public void setPublicKeyBase64(String publicKeyBase64) {
    this.publicKeyBase64 = publicKeyBase64;
  }

  public DidVerificationMethodDto publicKeyHex(String publicKeyHex) {
    this.publicKeyHex = publicKeyHex;
    return this;
  }

  /**
   * Get publicKeyHex
   * @return publicKeyHex
   **/
  @Schema()
  
    public String getPublicKeyHex() {
    return publicKeyHex;
  }

  public void setPublicKeyHex(String publicKeyHex) {
    this.publicKeyHex = publicKeyHex;
  }

  public DidVerificationMethodDto publicKeyJwk(PublicKeyJwkDto publicKeyJwk) {
    this.publicKeyJwk = publicKeyJwk;
    return this;
  }

  /**
   * Get publicKeyJwk
   * @return publicKeyJwk
   **/
  @Schema()
  
    @Valid
    public PublicKeyJwkDto getPublicKeyJwk() {
    return publicKeyJwk;
  }

  public void setPublicKeyJwk(PublicKeyJwkDto publicKeyJwk) {
    this.publicKeyJwk = publicKeyJwk;
  }

  public DidVerificationMethodDto publicKeyMultibase(String publicKeyMultibase) {
    this.publicKeyMultibase = publicKeyMultibase;
    return this;
  }

  /**
   * Get publicKeyMultibase
   * @return publicKeyMultibase
   **/
  @Schema()
  
    public String getPublicKeyMultibase() {
    return publicKeyMultibase;
  }

  public void setPublicKeyMultibase(String publicKeyMultibase) {
    this.publicKeyMultibase = publicKeyMultibase;
  }

  public DidVerificationMethodDto publicKeyPem(String publicKeyPem) {
    this.publicKeyPem = publicKeyPem;
    return this;
  }

  /**
   * Get publicKeyPem
   * @return publicKeyPem
   **/
  @Schema()
  
    public String getPublicKeyPem() {
    return publicKeyPem;
  }

  public void setPublicKeyPem(String publicKeyPem) {
    this.publicKeyPem = publicKeyPem;
  }

  public DidVerificationMethodDto type(String type) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DidVerificationMethodDto didVerificationMethodDto = (DidVerificationMethodDto) o;
    return Objects.equals(this.controller, didVerificationMethodDto.controller) &&
        Objects.equals(this.id, didVerificationMethodDto.id) &&
        Objects.equals(this.publicKeyBase58, didVerificationMethodDto.publicKeyBase58) &&
        Objects.equals(this.publicKeyBase64, didVerificationMethodDto.publicKeyBase64) &&
        Objects.equals(this.publicKeyHex, didVerificationMethodDto.publicKeyHex) &&
        Objects.equals(this.publicKeyJwk, didVerificationMethodDto.publicKeyJwk) &&
        Objects.equals(this.publicKeyMultibase, didVerificationMethodDto.publicKeyMultibase) &&
        Objects.equals(this.publicKeyPem, didVerificationMethodDto.publicKeyPem) &&
        Objects.equals(this.type, didVerificationMethodDto.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controller, id, publicKeyBase58, publicKeyBase64, publicKeyHex, publicKeyJwk, publicKeyMultibase, publicKeyPem, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DidVerificationMethodDto {\n");
    
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    publicKeyBase58: ").append(toIndentedString(publicKeyBase58)).append("\n");
    sb.append("    publicKeyBase64: ").append(toIndentedString(publicKeyBase64)).append("\n");
    sb.append("    publicKeyHex: ").append(toIndentedString(publicKeyHex)).append("\n");
    sb.append("    publicKeyJwk: ").append(toIndentedString(publicKeyJwk)).append("\n");
    sb.append("    publicKeyMultibase: ").append(toIndentedString(publicKeyMultibase)).append("\n");
    sb.append("    publicKeyPem: ").append(toIndentedString(publicKeyPem)).append("\n");
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
