package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WalletCreateDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")


public class WalletCreateDto   {
  @JsonProperty("bpn")
  private String bpn = null;

  @JsonProperty("name")
  private String name = null;

  public WalletCreateDto bpn(String bpn) {
    this.bpn = bpn;
    return this;
  }

  /**
   * Get bpn
   * @return bpn
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getBpn() {
    return bpn;
  }

  public void setBpn(String bpn) {
    this.bpn = bpn;
  }

  public WalletCreateDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCreateDto walletCreateDto = (WalletCreateDto) o;
    return Objects.equals(this.bpn, walletCreateDto.bpn) &&
        Objects.equals(this.name, walletCreateDto.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bpn, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCreateDto {\n");
    
    sb.append("    bpn: ").append(toIndentedString(bpn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
