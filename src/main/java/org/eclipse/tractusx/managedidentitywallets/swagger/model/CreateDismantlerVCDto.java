package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Objects;

/**
 * CreateDismantlerVCDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")


public class CreateDismantlerVCDto   {
  @JsonProperty("bpn")
  private String bpn = null;

  @JsonProperty("allowedVehicleBrands")
  private List allowedVehicleBrands = null;

  public CreateDismantlerVCDto bpn(String bpn) {
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

  public CreateDismantlerVCDto allowedVehicleBrands(List allowedVehicleBrands) {
    this.allowedVehicleBrands = allowedVehicleBrands;
    return this;
  }

  /**
   * Get allowedVehicleBrands
   * @return allowedVehicleBrands
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    @Valid
    public List getAllowedVehicleBrands() {
    return allowedVehicleBrands;
  }

  public void setAllowedVehicleBrands(List allowedVehicleBrands) {
    this.allowedVehicleBrands = allowedVehicleBrands;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDismantlerVCDto createDismantlerVCDto = (CreateDismantlerVCDto) o;
    return Objects.equals(this.bpn, createDismantlerVCDto.bpn) &&
        Objects.equals(this.allowedVehicleBrands, createDismantlerVCDto.allowedVehicleBrands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bpn, allowedVehicleBrands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDismantlerVCDto {\n");
    
    sb.append("    bpn: ").append(toIndentedString(bpn)).append("\n");
    sb.append("    allowedVehicleBrands: ").append(toIndentedString(allowedVehicleBrands)).append("\n");
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
