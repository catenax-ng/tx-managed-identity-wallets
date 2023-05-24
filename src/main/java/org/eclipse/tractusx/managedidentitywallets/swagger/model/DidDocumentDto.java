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
 * DidDocumentDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")


public class DidDocumentDto   {
  @JsonProperty("alsoKnownAs")
  private String alsoKnownAs = null;

  @JsonProperty("assertionMethodVerificationMethods")
  @Valid
  private List<Any> assertionMethodVerificationMethods = null;

  @JsonProperty("authenticationVerificationMethods")
  @Valid
  private List<Any> authenticationVerificationMethods = null;

  @JsonProperty("capabilityDelegationVerificationMethods")
  @Valid
  private List<Any> capabilityDelegationVerificationMethods = null;

  @JsonProperty("capabilityInvocationVerificationMethods")
  @Valid
  private List<Any> capabilityInvocationVerificationMethods = null;

  @JsonProperty("context")
  @Valid
  private List<String> context = new ArrayList<String>();

  @JsonProperty("controller")
  private ModelShort controller = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("keyAgreementVerificationMethods")
  @Valid
  private List<Any> keyAgreementVerificationMethods = null;

  @JsonProperty("services")
  @Valid
  private List<Object> services = null;

  @JsonProperty("verificationMethods")
  @Valid
  private List<DidVerificationMethodDto> verificationMethods = null;

  public DidDocumentDto alsoKnownAs(String alsoKnownAs) {
    this.alsoKnownAs = alsoKnownAs;
    return this;
  }

  /**
   * Get alsoKnownAs
   * @return alsoKnownAs
   **/
  @Schema()
  
    public String getAlsoKnownAs() {
    return alsoKnownAs;
  }

  public void setAlsoKnownAs(String alsoKnownAs) {
    this.alsoKnownAs = alsoKnownAs;
  }

  public DidDocumentDto assertionMethodVerificationMethods(List<Any> assertionMethodVerificationMethods) {
    this.assertionMethodVerificationMethods = assertionMethodVerificationMethods;
    return this;
  }

  public DidDocumentDto addAssertionMethodVerificationMethodsItem(Any assertionMethodVerificationMethodsItem) {
    if (this.assertionMethodVerificationMethods == null) {
      this.assertionMethodVerificationMethods = new ArrayList<Any>();
    }
    this.assertionMethodVerificationMethods.add(assertionMethodVerificationMethodsItem);
    return this;
  }

  /**
   * Get assertionMethodVerificationMethods
   * @return assertionMethodVerificationMethods
   **/
  @Schema()
      @Valid
    public List<Any> getAssertionMethodVerificationMethods() {
    return assertionMethodVerificationMethods;
  }

  public void setAssertionMethodVerificationMethods(List<Any> assertionMethodVerificationMethods) {
    this.assertionMethodVerificationMethods = assertionMethodVerificationMethods;
  }

  public DidDocumentDto authenticationVerificationMethods(List<Any> authenticationVerificationMethods) {
    this.authenticationVerificationMethods = authenticationVerificationMethods;
    return this;
  }

  public DidDocumentDto addAuthenticationVerificationMethodsItem(Any authenticationVerificationMethodsItem) {
    if (this.authenticationVerificationMethods == null) {
      this.authenticationVerificationMethods = new ArrayList<Any>();
    }
    this.authenticationVerificationMethods.add(authenticationVerificationMethodsItem);
    return this;
  }

  /**
   * Get authenticationVerificationMethods
   * @return authenticationVerificationMethods
   **/
  @Schema()
      @Valid
    public List<Any> getAuthenticationVerificationMethods() {
    return authenticationVerificationMethods;
  }

  public void setAuthenticationVerificationMethods(List<Any> authenticationVerificationMethods) {
    this.authenticationVerificationMethods = authenticationVerificationMethods;
  }

  public DidDocumentDto capabilityDelegationVerificationMethods(List<Any> capabilityDelegationVerificationMethods) {
    this.capabilityDelegationVerificationMethods = capabilityDelegationVerificationMethods;
    return this;
  }

  public DidDocumentDto addCapabilityDelegationVerificationMethodsItem(Any capabilityDelegationVerificationMethodsItem) {
    if (this.capabilityDelegationVerificationMethods == null) {
      this.capabilityDelegationVerificationMethods = new ArrayList<Any>();
    }
    this.capabilityDelegationVerificationMethods.add(capabilityDelegationVerificationMethodsItem);
    return this;
  }

  /**
   * Get capabilityDelegationVerificationMethods
   * @return capabilityDelegationVerificationMethods
   **/
  @Schema()
      @Valid
    public List<Any> getCapabilityDelegationVerificationMethods() {
    return capabilityDelegationVerificationMethods;
  }

  public void setCapabilityDelegationVerificationMethods(List<Any> capabilityDelegationVerificationMethods) {
    this.capabilityDelegationVerificationMethods = capabilityDelegationVerificationMethods;
  }

  public DidDocumentDto capabilityInvocationVerificationMethods(List<Any> capabilityInvocationVerificationMethods) {
    this.capabilityInvocationVerificationMethods = capabilityInvocationVerificationMethods;
    return this;
  }

  public DidDocumentDto addCapabilityInvocationVerificationMethodsItem(Any capabilityInvocationVerificationMethodsItem) {
    if (this.capabilityInvocationVerificationMethods == null) {
      this.capabilityInvocationVerificationMethods = new ArrayList<Any>();
    }
    this.capabilityInvocationVerificationMethods.add(capabilityInvocationVerificationMethodsItem);
    return this;
  }

  /**
   * Get capabilityInvocationVerificationMethods
   * @return capabilityInvocationVerificationMethods
   **/
  @Schema()
      @Valid
    public List<Any> getCapabilityInvocationVerificationMethods() {
    return capabilityInvocationVerificationMethods;
  }

  public void setCapabilityInvocationVerificationMethods(List<Any> capabilityInvocationVerificationMethods) {
    this.capabilityInvocationVerificationMethods = capabilityInvocationVerificationMethods;
  }

  public DidDocumentDto context(List<String> context) {
    this.context = context;
    return this;
  }

  public DidDocumentDto addContextItem(String contextItem) {
    this.context.add(contextItem);
    return this;
  }

  /**
   * Get context
   * @return context
   **/
  @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
      @NotNull

    public List<String> getContext() {
    return context;
  }

  public void setContext(List<String> context) {
    this.context = context;
  }

  public DidDocumentDto controller(ModelShort controller) {
    this.controller = controller;
    return this;
  }

  /**
   * Get controller
   * @return controller
   **/
  @Schema()
  
    @Valid
    public ModelShort getController() {
    return controller;
  }

  public void setController(ModelShort controller) {
    this.controller = controller;
  }

  public DidDocumentDto id(String id) {
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

  public DidDocumentDto keyAgreementVerificationMethods(List<Any> keyAgreementVerificationMethods) {
    this.keyAgreementVerificationMethods = keyAgreementVerificationMethods;
    return this;
  }

  public DidDocumentDto addKeyAgreementVerificationMethodsItem(Any keyAgreementVerificationMethodsItem) {
    if (this.keyAgreementVerificationMethods == null) {
      this.keyAgreementVerificationMethods = new ArrayList<Any>();
    }
    this.keyAgreementVerificationMethods.add(keyAgreementVerificationMethodsItem);
    return this;
  }

  /**
   * Get keyAgreementVerificationMethods
   * @return keyAgreementVerificationMethods
   **/
  @Schema()
      @Valid
    public List<Any> getKeyAgreementVerificationMethods() {
    return keyAgreementVerificationMethods;
  }

  public void setKeyAgreementVerificationMethods(List<Any> keyAgreementVerificationMethods) {
    this.keyAgreementVerificationMethods = keyAgreementVerificationMethods;
  }

  public DidDocumentDto services(List<Object> services) {
    this.services = services;
    return this;
  }

  public DidDocumentDto addServicesItem(Object servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<Object>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Get services
   * @return services
   **/
  @Schema()
  
    public List<Object> getServices() {
    return services;
  }

  public void setServices(List<Object> services) {
    this.services = services;
  }

  public DidDocumentDto verificationMethods(List<DidVerificationMethodDto> verificationMethods) {
    this.verificationMethods = verificationMethods;
    return this;
  }

  public DidDocumentDto addVerificationMethodsItem(DidVerificationMethodDto verificationMethodsItem) {
    if (this.verificationMethods == null) {
      this.verificationMethods = new ArrayList<DidVerificationMethodDto>();
    }
    this.verificationMethods.add(verificationMethodsItem);
    return this;
  }

  /**
   * Get verificationMethods
   * @return verificationMethods
   **/
  @Schema()
      @Valid
    public List<DidVerificationMethodDto> getVerificationMethods() {
    return verificationMethods;
  }

  public void setVerificationMethods(List<DidVerificationMethodDto> verificationMethods) {
    this.verificationMethods = verificationMethods;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DidDocumentDto didDocumentDto = (DidDocumentDto) o;
    return Objects.equals(this.alsoKnownAs, didDocumentDto.alsoKnownAs) &&
        Objects.equals(this.assertionMethodVerificationMethods, didDocumentDto.assertionMethodVerificationMethods) &&
        Objects.equals(this.authenticationVerificationMethods, didDocumentDto.authenticationVerificationMethods) &&
        Objects.equals(this.capabilityDelegationVerificationMethods, didDocumentDto.capabilityDelegationVerificationMethods) &&
        Objects.equals(this.capabilityInvocationVerificationMethods, didDocumentDto.capabilityInvocationVerificationMethods) &&
        Objects.equals(this.context, didDocumentDto.context) &&
        Objects.equals(this.controller, didDocumentDto.controller) &&
        Objects.equals(this.id, didDocumentDto.id) &&
        Objects.equals(this.keyAgreementVerificationMethods, didDocumentDto.keyAgreementVerificationMethods) &&
        Objects.equals(this.services, didDocumentDto.services) &&
        Objects.equals(this.verificationMethods, didDocumentDto.verificationMethods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alsoKnownAs, assertionMethodVerificationMethods, authenticationVerificationMethods, capabilityDelegationVerificationMethods, capabilityInvocationVerificationMethods, context, controller, id, keyAgreementVerificationMethods, services, verificationMethods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DidDocumentDto {\n");
    
    sb.append("    alsoKnownAs: ").append(toIndentedString(alsoKnownAs)).append("\n");
    sb.append("    assertionMethodVerificationMethods: ").append(toIndentedString(assertionMethodVerificationMethods)).append("\n");
    sb.append("    authenticationVerificationMethods: ").append(toIndentedString(authenticationVerificationMethods)).append("\n");
    sb.append("    capabilityDelegationVerificationMethods: ").append(toIndentedString(capabilityDelegationVerificationMethods)).append("\n");
    sb.append("    capabilityInvocationVerificationMethods: ").append(toIndentedString(capabilityInvocationVerificationMethods)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    controller: ").append(toIndentedString(controller)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyAgreementVerificationMethods: ").append(toIndentedString(keyAgreementVerificationMethods)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    verificationMethods: ").append(toIndentedString(verificationMethods)).append("\n");
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
