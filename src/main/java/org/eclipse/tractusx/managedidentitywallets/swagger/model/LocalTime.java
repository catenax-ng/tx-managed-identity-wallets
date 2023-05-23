package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * LocalTime
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-22T13:09:57.551136732Z[GMT]")


public class LocalTime   {
  @JsonProperty("hour")
  private ModelShort hour = null;

  @JsonProperty("minute")
  private ModelShort minute = null;

  @JsonProperty("second")
  private ModelShort second = null;

  @JsonProperty("nano")
  private Integer nano = null;

  public LocalTime hour(ModelShort hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Get hour
   * @return hour
   **/
  @Schema(description = "")
  
    @Valid
    public ModelShort getHour() {
    return hour;
  }

  public void setHour(ModelShort hour) {
    this.hour = hour;
  }

  public LocalTime minute(ModelShort minute) {
    this.minute = minute;
    return this;
  }

  /**
   * Get minute
   * @return minute
   **/
  @Schema(description = "")
  
    @Valid
    public ModelShort getMinute() {
    return minute;
  }

  public void setMinute(ModelShort minute) {
    this.minute = minute;
  }

  public LocalTime second(ModelShort second) {
    this.second = second;
    return this;
  }

  /**
   * Get second
   * @return second
   **/
  @Schema(description = "")
  
    @Valid
    public ModelShort getSecond() {
    return second;
  }

  public void setSecond(ModelShort second) {
    this.second = second;
  }

  public LocalTime nano(Integer nano) {
    this.nano = nano;
    return this;
  }

  /**
   * Get nano
   * @return nano
   **/
  @Schema(description = "")
  
    public Integer getNano() {
    return nano;
  }

  public void setNano(Integer nano) {
    this.nano = nano;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalTime localTime = (LocalTime) o;
    return Objects.equals(this.hour, localTime.hour) &&
        Objects.equals(this.minute, localTime.minute) &&
        Objects.equals(this.second, localTime.second) &&
        Objects.equals(this.nano, localTime.nano);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, minute, second, nano);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalTime {\n");
    
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    nano: ").append(toIndentedString(nano)).append("\n");
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
