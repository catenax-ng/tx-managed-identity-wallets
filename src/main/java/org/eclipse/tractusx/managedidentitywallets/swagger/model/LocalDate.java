package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * LocalDate
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-22T13:09:57.551136732Z[GMT]")


public class LocalDate   {
  @JsonProperty("year")
  private Integer year = null;

  @JsonProperty("month")
  private ModelShort month = null;

  @JsonProperty("day")
  private ModelShort day = null;

  public LocalDate year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   **/
  @Schema(description = "")
  
    public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public LocalDate month(ModelShort month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
   **/
  @Schema(description = "")
  
    @Valid
    public ModelShort getMonth() {
    return month;
  }

  public void setMonth(ModelShort month) {
    this.month = month;
  }

  public LocalDate day(ModelShort day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
   **/
  @Schema(description = "")
  
    @Valid
    public ModelShort getDay() {
    return day;
  }

  public void setDay(ModelShort day) {
    this.day = day;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalDate localDate = (LocalDate) o;
    return Objects.equals(this.year, localDate.year) &&
        Objects.equals(this.month, localDate.month) &&
        Objects.equals(this.day, localDate.day);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, day);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalDate {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
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
