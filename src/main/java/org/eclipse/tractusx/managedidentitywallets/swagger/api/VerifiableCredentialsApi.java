package org.eclipse.tractusx.managedidentitywallets.swagger.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.eclipse.tractusx.managedidentitywallets.swagger.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.processing.Generated(value = "io.swagger.responseCodegen.v3.generators.java.SpringresponseCodegen", date = "2023-05-24T08:44:38.406697803Z[GMT]")
@Validated
@Tag(name = "VerifiableCredentials", description = "the VerifiableCredentials API")
public interface VerifiableCredentialsApi {

    @Operation(summary = "Query Verifiable Credentials", description = "Permission: **view_wallets** OR **view_wallet** (The BPN of holderIdentifier must equal BPN of caller)  Search verifiable credentials with filter criteria")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The list of verifiable credentials matching the query, empty if no match found", content = @Content(array = @ArraySchema(schema = @Schema(implementation = VerifiableCredentialDto.class)))),
        @ApiResponse(responseCode = "401", description = "The request could not be completed due to a failed authorization.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "403", description = "The request could not be completed due to a forbidden access.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class)))  })
    @RequestMapping(value = "/api/credentials",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<List<VerifiableCredentialDto>> apiCredentialsGet(@Parameter() @Valid @RequestParam(value = "holderIdentifier", required = false) String holderIdentifier, @Parameter() @Valid @RequestParam(value = "id", required = false) String id, @Parameter() @Valid @RequestParam(value = "issuerIdentifier", required = false) String issuerIdentifier, @Parameter() @Valid @RequestParam(value = "type", required = false) List<String> type);


    @Operation(summary = "Issue a Use Case Verifiable Credential with base wallet issuer", description = "Permission: **update_wallets** OR **update_wallet** (The BPN of base wallet must equal BPN of caller)  Issue a verifiable credential by base wallet")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The created Verifiable Credential", content = @Content(schema = @Schema(implementation = VerifiableCredentialDto.class))),
        @ApiResponse(responseCode = "400", description = "The input does not comply to the syntax requirements", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "401", description = "The request could not be completed due to a failed authorization.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "403", description = "The request could not be completed due to a forbidden access.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "422", description = "The input can not be processed due to semantic mismatches", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))) })
    @RequestMapping(value = "/api/credentials/issuer/dismantler",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<VerifiableCredentialDto> apiCredentialsIssuerDismantlerPost(@Parameter(description = "The bpn of the holders wallet", required=true ) @Valid @RequestBody CreateDismantlerVCDto body);


    @Operation(summary = "Issue a Use Case Verifiable Credential with base wallet issuer", description = "Permission: **update_wallets** OR **update_wallet** (The BPN of base wallet must equal BPN of caller)  Issue a verifiable credential by base wallet")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The created Verifiable Credential", content = @Content(schema = @Schema(implementation = VerifiableCredentialDto.class))),
        @ApiResponse(responseCode = "400", description = "The input does not comply to the syntax requirements", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "401", description = "The request could not be completed due to a failed authorization.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "403", description = "The request could not be completed due to a forbidden access.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "422", description = "The input can not be processed due to semantic mismatches", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))) })
    @RequestMapping(value = "/api/credentials/issuer/framework",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<VerifiableCredentialDto> apiCredentialsIssuerFrameworkPost(@Parameter(description = "The bpn of the holders wallet", required=true ) @Valid @RequestBody CreateMembershipVCDto body);


    @Operation(summary = "Issue a Membership Verifiable Credential with base wallet issuer", description = "Permission: **update_wallets** OR **update_wallet** (The BPN of base wallet must equal BPN of caller)  Issue a verifiable credential by base wallet", tags={ "VerifiableCredentials", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The created Verifiable Credential", content = @Content(schema = @Schema(implementation = VerifiableCredentialDto.class))),
        @ApiResponse(responseCode = "400", description = "The input does not comply to the syntax requirements", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "401", description = "The request could not be completed due to a failed authorization.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "403", description = "The request could not be completed due to a forbidden access.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "422", description = "The input can not be processed due to semantic mismatches", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))) })
    @RequestMapping(value = "/api/credentials/issuer/membership",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<VerifiableCredentialDto> apiCredentialsIssuerMembershipPost(@Parameter(description = "The bpn of the holders wallet", required=true ) @Valid @RequestBody CreateMembershipVCDto body);


    @Operation(summary = "Issue a Verifiable Credential with base wallet issuer", description = "Permission: **update_wallets** OR **update_wallet** (The BPN of base wallet must equal BPN of caller)  Issue a verifiable credential by base wallet")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The created Verifiable Credential", content = @Content(schema = @Schema(implementation = VerifiableCredentialDto.class))),
        @ApiResponse(responseCode = "400", description = "The input does not comply to the syntax requirements", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "401", description = "The request could not be completed due to a failed authorization.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "403", description = "The request could not be completed due to a forbidden access.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "422", description = "The input can not be processed due to semantic mismatches", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))) })
    @RequestMapping(value = "/api/credentials/issuer",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<VerifiableCredentialDto> apiCredentialsIssuerPost(@Parameter(description = "The verifiable credential input", required=true ) @Valid @RequestBody VerifiableCredentialRequestWithoutIssuerDto body);


    @Operation(summary = "Issue Verifiable Credential", description = "Permission: **update_wallets** OR **update_wallet** (The BPN of the issuer of the Verifiable Credential must equal BPN of caller)  Issue a verifiable credential with a given issuer DID")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "The created Verifiable Credential", content = @Content(schema = @Schema(implementation = VerifiableCredentialDto.class))),
        @ApiResponse(responseCode = "400", description = "The input does not comply to the syntax requirements", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "401", description = "The request could not be completed due to a failed authorization.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "403", description = "The request could not be completed due to a forbidden access.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "422", description = "The input can not be processed due to semantic mismatches", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))) })
    @RequestMapping(value = "/api/credentials",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<VerifiableCredentialDto> apiCredentialsPost(@Parameter(description = "The verifiable credential input data", required=true ) @Valid @RequestBody VerifiableCredentialRequestDto body);


    @Operation(summary = "Validate Verifiable Credential", description = "Permission: **view_wallets** OR **view_wallet**  Validate Verifiable Credentials")
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "The verification value", content = @Content(schema = @Schema(implementation = VerifyResponse.class))),
        @ApiResponse(responseCode = "400", description = "The input does not comply to the syntax requirements", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "401", description = "The request could not be completed due to a failed authorization.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "403", description = "The request could not be completed due to a forbidden access.", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))),
        @ApiResponse(responseCode = "422", description = "The input can not be processed due to semantic mismatches", content = @Content(schema = @Schema(implementation = ExceptionResponse.class))) })
    @RequestMapping(value = "/api/credentials/validation",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<VerifyResponse> apiCredentialsValidationPost(@Parameter(schema = @Schema(defaultValue = "false")) @Valid @RequestParam(value = "withDateValidation", required = false, defaultValue="false") Boolean withDateValidation, @Parameter(schema = @Schema(defaultValue = "true")) @Valid @RequestParam(value = "withRevocationValidation", required = false, defaultValue="true") Boolean withRevocationValidation, @Parameter(description = "The verifiable credential to validate" ) @Valid @RequestBody VerifiableCredentialDto body);

}

