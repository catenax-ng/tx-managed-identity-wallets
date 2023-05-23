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
 * WalletDto
 */
@Validated
@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-22T13:09:57.551136732Z[GMT]")


public class WalletDto   {
  @JsonProperty("bpn")
  private String bpn = null;

  @JsonProperty("createdAt")
  private LocalDateTime createdAt = null;

  @JsonProperty("did")
  private String did = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("vcs")
  @Valid
  private List<VerifiableCredentialDto> vcs = new ArrayList<VerifiableCredentialDto>();

  public WalletDto bpn(String bpn) {
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

  public WalletDto createdAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public WalletDto did(String did) {
    this.did = did;
    return this;
  }

  /**
   * Get did
   * @return did
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getDid() {
    return did;
  }

  public void setDid(String did) {
    this.did = did;
  }

  public WalletDto name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WalletDto vcs(List<VerifiableCredentialDto> vcs) {
    this.vcs = vcs;
    return this;
  }

  public WalletDto addVcsItem(VerifiableCredentialDto vcsItem) {
    this.vcs.add(vcsItem);
    return this;
  }

  /**
   * Get vcs
   * @return vcs
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<VerifiableCredentialDto> getVcs() {
    return vcs;
  }

  public void setVcs(List<VerifiableCredentialDto> vcs) {
    this.vcs = vcs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletDto walletDto = (WalletDto) o;
    return Objects.equals(this.bpn, walletDto.bpn) &&
        Objects.equals(this.createdAt, walletDto.createdAt) &&
        Objects.equals(this.did, walletDto.did) &&
        Objects.equals(this.name, walletDto.name) &&
        Objects.equals(this.vcs, walletDto.vcs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bpn, createdAt, did, name, vcs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletDto {\n");
    
    sb.append("    bpn: ").append(toIndentedString(bpn)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    vcs: ").append(toIndentedString(vcs)).append("\n");
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
