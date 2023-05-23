package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * CreateMembershipVCDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-22T13:09:57.551136732Z[GMT]")


public class CreateMembershipVCDto   {
  @JsonProperty("bpn")
  private String bpn = null;

  public CreateMembershipVCDto bpn(String bpn) {
    this.bpn = bpn;
    return this;
  }

  /**
   * Get bpn
   * @return bpn
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getBpn() {
    return bpn;
  }

  public void setBpn(String bpn) {
    this.bpn = bpn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMembershipVCDto createMembershipVCDto = (CreateMembershipVCDto) o;
    return Objects.equals(this.bpn, createMembershipVCDto.bpn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bpn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMembershipVCDto {\n");
    
    sb.append("    bpn: ").append(toIndentedString(bpn)).append("\n");
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
