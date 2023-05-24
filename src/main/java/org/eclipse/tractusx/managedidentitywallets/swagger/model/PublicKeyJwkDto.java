package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * PublicKeyJwkDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")


public class PublicKeyJwkDto   {
  @JsonProperty("additionalAttributes")
  @Valid
  private Map<String, Any> additionalAttributes = null;

  @JsonProperty("alg")
  private String alg = null;

  @JsonProperty("crv")
  private String crv = null;

  @JsonProperty("keyOps")
  @Valid
  private List<String> keyOps = null;

  @JsonProperty("kid")
  private String kid = null;

  @JsonProperty("kty")
  private String kty = null;

  @JsonProperty("use")
  private String use = null;

  @JsonProperty("x")
  private String x = null;

  @JsonProperty("y")
  private String y = null;

  public PublicKeyJwkDto additionalAttributes(Map<String, Any> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
    return this;
  }

  public PublicKeyJwkDto putAdditionalAttributesItem(String key, Any additionalAttributesItem) {
    if (this.additionalAttributes == null) {
      this.additionalAttributes = new HashMap<String, Any>();
    }
    this.additionalAttributes.put(key, additionalAttributesItem);
    return this;
  }

  /**
   * Get additionalAttributes
   * @return additionalAttributes
   **/
  @Schema()
      @Valid
    public Map<String, Any> getAdditionalAttributes() {
    return additionalAttributes;
  }

  public void setAdditionalAttributes(Map<String, Any> additionalAttributes) {
    this.additionalAttributes = additionalAttributes;
  }

  public PublicKeyJwkDto alg(String alg) {
    this.alg = alg;
    return this;
  }

  /**
   * Get alg
   * @return alg
   **/
  @Schema()
  
    public String getAlg() {
    return alg;
  }

  public void setAlg(String alg) {
    this.alg = alg;
  }

  public PublicKeyJwkDto crv(String crv) {
    this.crv = crv;
    return this;
  }

  /**
   * Get crv
   * @return crv
   **/
  @Schema()
  
    public String getCrv() {
    return crv;
  }

  public void setCrv(String crv) {
    this.crv = crv;
  }

  public PublicKeyJwkDto keyOps(List<String> keyOps) {
    this.keyOps = keyOps;
    return this;
  }

  public PublicKeyJwkDto addKeyOpsItem(String keyOpsItem) {
    if (this.keyOps == null) {
      this.keyOps = new ArrayList<String>();
    }
    this.keyOps.add(keyOpsItem);
    return this;
  }

  /**
   * Get keyOps
   * @return keyOps
   **/
  @Schema()
  
    public List<String> getKeyOps() {
    return keyOps;
  }

  public void setKeyOps(List<String> keyOps) {
    this.keyOps = keyOps;
  }

  public PublicKeyJwkDto kid(String kid) {
    this.kid = kid;
    return this;
  }

  /**
   * Get kid
   * @return kid
   **/
  @Schema()
  
    public String getKid() {
    return kid;
  }

  public void setKid(String kid) {
    this.kid = kid;
  }

  public PublicKeyJwkDto kty(String kty) {
    this.kty = kty;
    return this;
  }

  /**
   * Get kty
   * @return kty
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getKty() {
    return kty;
  }

  public void setKty(String kty) {
    this.kty = kty;
  }

  public PublicKeyJwkDto use(String use) {
    this.use = use;
    return this;
  }

  /**
   * Get use
   * @return use
   **/
  @Schema()
  
    public String getUse() {
    return use;
  }

  public void setUse(String use) {
    this.use = use;
  }

  public PublicKeyJwkDto x(String x) {
    this.x = x;
    return this;
  }

  /**
   * Get x
   * @return x
   **/
  @Schema()
  
    public String getX() {
    return x;
  }

  public void setX(String x) {
    this.x = x;
  }

  public PublicKeyJwkDto y(String y) {
    this.y = y;
    return this;
  }

  /**
   * Get y
   * @return y
   **/
  @Schema()
  
    public String getY() {
    return y;
  }

  public void setY(String y) {
    this.y = y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicKeyJwkDto publicKeyJwkDto = (PublicKeyJwkDto) o;
    return Objects.equals(this.additionalAttributes, publicKeyJwkDto.additionalAttributes) &&
        Objects.equals(this.alg, publicKeyJwkDto.alg) &&
        Objects.equals(this.crv, publicKeyJwkDto.crv) &&
        Objects.equals(this.keyOps, publicKeyJwkDto.keyOps) &&
        Objects.equals(this.kid, publicKeyJwkDto.kid) &&
        Objects.equals(this.kty, publicKeyJwkDto.kty) &&
        Objects.equals(this.use, publicKeyJwkDto.use) &&
        Objects.equals(this.x, publicKeyJwkDto.x) &&
        Objects.equals(this.y, publicKeyJwkDto.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalAttributes, alg, crv, keyOps, kid, kty, use, x, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicKeyJwkDto {\n");
    
    sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
    sb.append("    alg: ").append(toIndentedString(alg)).append("\n");
    sb.append("    crv: ").append(toIndentedString(crv)).append("\n");
    sb.append("    keyOps: ").append(toIndentedString(keyOps)).append("\n");
    sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
    sb.append("    kty: ").append(toIndentedString(kty)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
