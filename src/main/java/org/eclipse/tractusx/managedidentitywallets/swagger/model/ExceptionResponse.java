package org.eclipse.tractusx.managedidentitywallets.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ExceptionResponse
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")


public class ExceptionResponse   {
  @JsonProperty("error")
  private Boolean error = null;

  @JsonProperty("message")
  private String message = null;

  public ExceptionResponse error(Boolean error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
  @Schema()
  
    public Boolean isError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public ExceptionResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExceptionResponse exceptionResponse = (ExceptionResponse) o;
    return Objects.equals(this.error, exceptionResponse.error) &&
        Objects.equals(this.message, exceptionResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExceptionResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
