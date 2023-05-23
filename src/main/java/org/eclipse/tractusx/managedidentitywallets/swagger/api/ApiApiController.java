package org.eclipse.tractusx.managedidentitywallets.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.servlet.http.HttpServletRequest;
import org.eclipse.tractusx.managedidentitywallets.swagger.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.IOException;
import java.util.List;

@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-22T13:09:57.551136732Z[GMT]")
@RestController
public class ApiApiController implements ApiApi {

    private static final Logger log = LoggerFactory.getLogger(ApiApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApiApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<VerifiableCredentialDto>> apiCredentialsGet(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "holderIdentifier", required = false) String holderIdentifier,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "id", required = false) String id,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "issuerIdentifier", required = false) String issuerIdentifier,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) List<String> type) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<VerifiableCredentialDto>>(objectMapper.readValue("[ {\n  \"credentialSubject\" : {\n    \"key\" : { }\n  },\n  \"issuanceDate\" : \"issuanceDate\",\n  \"id\" : \"id\",\n  \"proof\" : {\n    \"proofValue\" : \"proofValue\",\n    \"created\" : \"created\",\n    \"proofPurpose\" : \"proofPurpose\",\n    \"type\" : \"type\",\n    \"verificationMethod\" : \"verificationMethod\"\n  },\n  \"type\" : [ \"type\", \"type\" ],\n  \"@context\" : [ \"@context\", \"@context\" ],\n  \"issuer\" : \"issuer\",\n  \"expirationDate\" : \"expirationDate\"\n}, {\n  \"credentialSubject\" : {\n    \"key\" : { }\n  },\n  \"issuanceDate\" : \"issuanceDate\",\n  \"id\" : \"id\",\n  \"proof\" : {\n    \"proofValue\" : \"proofValue\",\n    \"created\" : \"created\",\n    \"proofPurpose\" : \"proofPurpose\",\n    \"type\" : \"type\",\n    \"verificationMethod\" : \"verificationMethod\"\n  },\n  \"type\" : [ \"type\", \"type\" ],\n  \"@context\" : [ \"@context\", \"@context\" ],\n  \"issuer\" : \"issuer\",\n  \"expirationDate\" : \"expirationDate\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<VerifiableCredentialDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<VerifiableCredentialDto>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VerifiableCredentialDto> apiCredentialsIssuerDismantlerPost(@Parameter(in = ParameterIn.DEFAULT, description = "The bpn of the holders wallet", required=true, schema=@Schema()) @Valid @RequestBody CreateDismantlerVCDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VerifiableCredentialDto>(objectMapper.readValue("{\n  \"credentialSubject\" : {\n    \"key\" : { }\n  },\n  \"issuanceDate\" : \"issuanceDate\",\n  \"id\" : \"id\",\n  \"proof\" : {\n    \"proofValue\" : \"proofValue\",\n    \"created\" : \"created\",\n    \"proofPurpose\" : \"proofPurpose\",\n    \"type\" : \"type\",\n    \"verificationMethod\" : \"verificationMethod\"\n  },\n  \"type\" : [ \"type\", \"type\" ],\n  \"@context\" : [ \"@context\", \"@context\" ],\n  \"issuer\" : \"issuer\",\n  \"expirationDate\" : \"expirationDate\"\n}", VerifiableCredentialDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VerifiableCredentialDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VerifiableCredentialDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VerifiableCredentialDto> apiCredentialsIssuerFrameworkPost(@Parameter(in = ParameterIn.DEFAULT, description = "The bpn of the holders wallet", required=true, schema=@Schema()) @Valid @RequestBody CreateMembershipVCDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VerifiableCredentialDto>(objectMapper.readValue("{\n  \"credentialSubject\" : {\n    \"key\" : { }\n  },\n  \"issuanceDate\" : \"issuanceDate\",\n  \"id\" : \"id\",\n  \"proof\" : {\n    \"proofValue\" : \"proofValue\",\n    \"created\" : \"created\",\n    \"proofPurpose\" : \"proofPurpose\",\n    \"type\" : \"type\",\n    \"verificationMethod\" : \"verificationMethod\"\n  },\n  \"type\" : [ \"type\", \"type\" ],\n  \"@context\" : [ \"@context\", \"@context\" ],\n  \"issuer\" : \"issuer\",\n  \"expirationDate\" : \"expirationDate\"\n}", VerifiableCredentialDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VerifiableCredentialDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VerifiableCredentialDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VerifiableCredentialDto> apiCredentialsIssuerMembershipPost(@Parameter(in = ParameterIn.DEFAULT, description = "The bpn of the holders wallet", required=true, schema=@Schema()) @Valid @RequestBody CreateMembershipVCDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VerifiableCredentialDto>(objectMapper.readValue("{\n  \"credentialSubject\" : {\n    \"key\" : { }\n  },\n  \"issuanceDate\" : \"issuanceDate\",\n  \"id\" : \"id\",\n  \"proof\" : {\n    \"proofValue\" : \"proofValue\",\n    \"created\" : \"created\",\n    \"proofPurpose\" : \"proofPurpose\",\n    \"type\" : \"type\",\n    \"verificationMethod\" : \"verificationMethod\"\n  },\n  \"type\" : [ \"type\", \"type\" ],\n  \"@context\" : [ \"@context\", \"@context\" ],\n  \"issuer\" : \"issuer\",\n  \"expirationDate\" : \"expirationDate\"\n}", VerifiableCredentialDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VerifiableCredentialDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VerifiableCredentialDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VerifiableCredentialDto> apiCredentialsIssuerPost(@Parameter(in = ParameterIn.DEFAULT, description = "The verifiable credential input", required=true, schema=@Schema()) @Valid @RequestBody VerifiableCredentialRequestWithoutIssuerDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VerifiableCredentialDto>(objectMapper.readValue("{\n  \"credentialSubject\" : {\n    \"key\" : { }\n  },\n  \"issuanceDate\" : \"issuanceDate\",\n  \"id\" : \"id\",\n  \"proof\" : {\n    \"proofValue\" : \"proofValue\",\n    \"created\" : \"created\",\n    \"proofPurpose\" : \"proofPurpose\",\n    \"type\" : \"type\",\n    \"verificationMethod\" : \"verificationMethod\"\n  },\n  \"type\" : [ \"type\", \"type\" ],\n  \"@context\" : [ \"@context\", \"@context\" ],\n  \"issuer\" : \"issuer\",\n  \"expirationDate\" : \"expirationDate\"\n}", VerifiableCredentialDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VerifiableCredentialDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VerifiableCredentialDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VerifiableCredentialDto> apiCredentialsPost(@Parameter(in = ParameterIn.DEFAULT, description = "The verifiable credential input data", required=true, schema=@Schema()) @Valid @RequestBody VerifiableCredentialRequestDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VerifiableCredentialDto>(objectMapper.readValue("{\n  \"credentialSubject\" : {\n    \"key\" : { }\n  },\n  \"issuanceDate\" : \"issuanceDate\",\n  \"id\" : \"id\",\n  \"proof\" : {\n    \"proofValue\" : \"proofValue\",\n    \"created\" : \"created\",\n    \"proofPurpose\" : \"proofPurpose\",\n    \"type\" : \"type\",\n    \"verificationMethod\" : \"verificationMethod\"\n  },\n  \"type\" : [ \"type\", \"type\" ],\n  \"@context\" : [ \"@context\", \"@context\" ],\n  \"issuer\" : \"issuer\",\n  \"expirationDate\" : \"expirationDate\"\n}", VerifiableCredentialDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VerifiableCredentialDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VerifiableCredentialDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VerifyResponse> apiCredentialsValidationPost(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "withDateValidation", required = false, defaultValue="false") Boolean withDateValidation,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="true")) @Valid @RequestParam(value = "withRevocationValidation", required = false, defaultValue="true") Boolean withRevocationValidation,@Parameter(in = ParameterIn.DEFAULT, description = "The verifiable credential to validate", schema=@Schema()) @Valid @RequestBody VerifiableCredentialDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VerifyResponse>(objectMapper.readValue("{\n  \"valid\" : true,\n  \"vp\" : {\n    \"holder\" : \"holder\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"verifiableCredential\" : [ {\n      \"credentialSubject\" : {\n        \"key\" : { }\n      },\n      \"issuanceDate\" : \"issuanceDate\",\n      \"id\" : \"id\",\n      \"proof\" : {\n        \"proofValue\" : \"proofValue\",\n        \"created\" : \"created\",\n        \"proofPurpose\" : \"proofPurpose\",\n        \"type\" : \"type\",\n        \"verificationMethod\" : \"verificationMethod\"\n      },\n      \"type\" : [ \"type\", \"type\" ],\n      \"@context\" : [ \"@context\", \"@context\" ],\n      \"issuer\" : \"issuer\",\n      \"expirationDate\" : \"expirationDate\"\n    }, {\n      \"credentialSubject\" : {\n        \"key\" : { }\n      },\n      \"issuanceDate\" : \"issuanceDate\",\n      \"id\" : \"id\",\n      \"proof\" : {\n        \"proofValue\" : \"proofValue\",\n        \"created\" : \"created\",\n        \"proofPurpose\" : \"proofPurpose\",\n        \"type\" : \"type\",\n        \"verificationMethod\" : \"verificationMethod\"\n      },\n      \"type\" : [ \"type\", \"type\" ],\n      \"@context\" : [ \"@context\", \"@context\" ],\n      \"issuer\" : \"issuer\",\n      \"expirationDate\" : \"expirationDate\"\n    } ]\n  },\n  \"error\" : \"error\"\n}", VerifyResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VerifyResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VerifyResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DidDocumentDto> apiDidDocumentsIdentifierGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("identifier") String identifier) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<DidDocumentDto>(objectMapper.readValue("{\n  \"controller\" : { },\n  \"keyAgreementVerificationMethods\" : [ null, null ],\n  \"capabilityInvocationVerificationMethods\" : [ null, null ],\n  \"assertionMethodVerificationMethods\" : [ { }, { } ],\n  \"context\" : [ \"context\", \"context\" ],\n  \"id\" : \"id\",\n  \"services\" : [ \"\", \"\" ],\n  \"authenticationVerificationMethods\" : [ null, null ],\n  \"verificationMethods\" : [ {\n    \"publicKeyMultibase\" : \"publicKeyMultibase\",\n    \"publicKeyBase58\" : \"publicKeyBase58\",\n    \"controller\" : \"controller\",\n    \"publicKeyPem\" : \"publicKeyPem\",\n    \"publicKeyHex\" : \"publicKeyHex\",\n    \"publicKeyJwk\" : {\n      \"kty\" : \"kty\",\n      \"crv\" : \"crv\",\n      \"use\" : \"use\",\n      \"kid\" : \"kid\",\n      \"x\" : \"x\",\n      \"y\" : \"y\",\n      \"alg\" : \"alg\",\n      \"keyOps\" : [ \"keyOps\", \"keyOps\" ],\n      \"additionalAttributes\" : { }\n    },\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"publicKeyBase64\" : \"publicKeyBase64\"\n  }, {\n    \"publicKeyMultibase\" : \"publicKeyMultibase\",\n    \"publicKeyBase58\" : \"publicKeyBase58\",\n    \"controller\" : \"controller\",\n    \"publicKeyPem\" : \"publicKeyPem\",\n    \"publicKeyHex\" : \"publicKeyHex\",\n    \"publicKeyJwk\" : {\n      \"kty\" : \"kty\",\n      \"crv\" : \"crv\",\n      \"use\" : \"use\",\n      \"kid\" : \"kid\",\n      \"x\" : \"x\",\n      \"y\" : \"y\",\n      \"alg\" : \"alg\",\n      \"keyOps\" : [ \"keyOps\", \"keyOps\" ],\n      \"additionalAttributes\" : { }\n    },\n    \"id\" : \"id\",\n    \"type\" : \"type\",\n    \"publicKeyBase64\" : \"publicKeyBase64\"\n  } ],\n  \"alsoKnownAs\" : \"alsoKnownAs\",\n  \"capabilityDelegationVerificationMethods\" : [ null, null ]\n}", DidDocumentDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DidDocumentDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DidDocumentDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VerifiablePresentationDto> apiPresentationsPost(@Parameter(in = ParameterIn.DEFAULT, description = "The verifiable presentation input data", required=true, schema=@Schema()) @Valid @RequestBody VerifiablePresentationRequestDto body,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="true")) @Valid @RequestParam(value = "asJwt", required = false, defaultValue="true") Boolean asJwt,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="true")) @Valid @RequestParam(value = "withCredentialsDateValidation", required = false, defaultValue="true") Boolean withCredentialsDateValidation,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="true")) @Valid @RequestParam(value = "withCredentialsValidation", required = false, defaultValue="true") Boolean withCredentialsValidation,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="true")) @Valid @RequestParam(value = "withRevocationValidation", required = false, defaultValue="true") Boolean withRevocationValidation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VerifiablePresentationDto>(objectMapper.readValue("{\n  \"holder\" : \"holder\",\n  \"id\" : \"id\",\n  \"proof\" : {\n    \"proofValue\" : \"proofValue\",\n    \"created\" : \"created\",\n    \"proofPurpose\" : \"proofPurpose\",\n    \"type\" : \"type\",\n    \"verificationMethod\" : \"verificationMethod\"\n  },\n  \"type\" : [ \"type\", \"type\" ],\n  \"@context\" : [ \"@context\", \"@context\" ],\n  \"verifiableCredential\" : [ {\n    \"credentialSubject\" : {\n      \"key\" : { }\n    },\n    \"issuanceDate\" : \"issuanceDate\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"issuer\" : \"issuer\",\n    \"expirationDate\" : \"expirationDate\"\n  }, {\n    \"credentialSubject\" : {\n      \"key\" : { }\n    },\n    \"issuanceDate\" : \"issuanceDate\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"issuer\" : \"issuer\",\n    \"expirationDate\" : \"expirationDate\"\n  } ]\n}", VerifiablePresentationDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VerifiablePresentationDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VerifiablePresentationDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<VerifyResponse> apiPresentationsValidationPost(@Parameter(in = ParameterIn.DEFAULT, description = "The verifiable presentation to validate", required=true, schema=@Schema()) @Valid @RequestBody VerifiablePresentationDto body,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="false")) @Valid @RequestParam(value = "withDateValidation", required = false, defaultValue="false") Boolean withDateValidation,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema( defaultValue="true")) @Valid @RequestParam(value = "withRevocationValidation", required = false, defaultValue="true") Boolean withRevocationValidation) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<VerifyResponse>(objectMapper.readValue("{\n  \"valid\" : true,\n  \"vp\" : {\n    \"holder\" : \"holder\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"verifiableCredential\" : [ {\n      \"credentialSubject\" : {\n        \"key\" : { }\n      },\n      \"issuanceDate\" : \"issuanceDate\",\n      \"id\" : \"id\",\n      \"proof\" : {\n        \"proofValue\" : \"proofValue\",\n        \"created\" : \"created\",\n        \"proofPurpose\" : \"proofPurpose\",\n        \"type\" : \"type\",\n        \"verificationMethod\" : \"verificationMethod\"\n      },\n      \"type\" : [ \"type\", \"type\" ],\n      \"@context\" : [ \"@context\", \"@context\" ],\n      \"issuer\" : \"issuer\",\n      \"expirationDate\" : \"expirationDate\"\n    }, {\n      \"credentialSubject\" : {\n        \"key\" : { }\n      },\n      \"issuanceDate\" : \"issuanceDate\",\n      \"id\" : \"id\",\n      \"proof\" : {\n        \"proofValue\" : \"proofValue\",\n        \"created\" : \"created\",\n        \"proofPurpose\" : \"proofPurpose\",\n        \"type\" : \"type\",\n        \"verificationMethod\" : \"verificationMethod\"\n      },\n      \"type\" : [ \"type\", \"type\" ],\n      \"@context\" : [ \"@context\", \"@context\" ],\n      \"issuer\" : \"issuer\",\n      \"expirationDate\" : \"expirationDate\"\n    } ]\n  },\n  \"error\" : \"error\"\n}", VerifyResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<VerifyResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<VerifyResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SuccessResponse> apiWalletIdentifierCredentialsPost(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("identifier") String identifier,@Parameter(in = ParameterIn.DEFAULT, description = "The verifiable credential to be stored", required=true, schema=@Schema()) @Valid @RequestBody IssuedVerifiableCredentialRequestDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SuccessResponse>(objectMapper.readValue("{\n  \"message\" : \"message\"\n}", SuccessResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SuccessResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SuccessResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<WalletDto> apiWalletIdentifierGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("identifier") String identifier,@NotNull @Parameter(in = ParameterIn.QUERY, description = "" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "withCredentials", required = true) Boolean withCredentials) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WalletDto>(objectMapper.readValue("{\n  \"bpn\" : \"bpn\",\n  \"createdAt\" : {\n    \"date\" : {\n      \"month\" : { },\n      \"year\" : 0\n    },\n    \"time\" : {\n      \"nano\" : 6\n    }\n  },\n  \"vcs\" : [ {\n    \"credentialSubject\" : {\n      \"key\" : { }\n    },\n    \"issuanceDate\" : \"issuanceDate\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"issuer\" : \"issuer\",\n    \"expirationDate\" : \"expirationDate\"\n  }, {\n    \"credentialSubject\" : {\n      \"key\" : { }\n    },\n    \"issuanceDate\" : \"issuanceDate\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"issuer\" : \"issuer\",\n    \"expirationDate\" : \"expirationDate\"\n  } ],\n  \"name\" : \"name\",\n  \"did\" : \"did\"\n}", WalletDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WalletDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WalletDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<WalletDto> apiWalletPost(@Parameter(in = ParameterIn.DEFAULT, description = "wallet to create", required=true, schema=@Schema()) @Valid @RequestBody WalletCreateDto body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<WalletDto>(objectMapper.readValue("{\n  \"bpn\" : \"bpn\",\n  \"createdAt\" : {\n    \"date\" : {\n      \"month\" : { },\n      \"year\" : 0\n    },\n    \"time\" : {\n      \"nano\" : 6\n    }\n  },\n  \"vcs\" : [ {\n    \"credentialSubject\" : {\n      \"key\" : { }\n    },\n    \"issuanceDate\" : \"issuanceDate\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"issuer\" : \"issuer\",\n    \"expirationDate\" : \"expirationDate\"\n  }, {\n    \"credentialSubject\" : {\n      \"key\" : { }\n    },\n    \"issuanceDate\" : \"issuanceDate\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"issuer\" : \"issuer\",\n    \"expirationDate\" : \"expirationDate\"\n  } ],\n  \"name\" : \"name\",\n  \"did\" : \"did\"\n}", WalletDto.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<WalletDto>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<WalletDto>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<WalletDto>> apiWalletsGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<WalletDto>>(objectMapper.readValue("[ {\n  \"bpn\" : \"bpn\",\n  \"createdAt\" : {\n    \"date\" : {\n      \"month\" : { },\n      \"year\" : 0\n    },\n    \"time\" : {\n      \"nano\" : 6\n    }\n  },\n  \"vcs\" : [ {\n    \"credentialSubject\" : {\n      \"key\" : { }\n    },\n    \"issuanceDate\" : \"issuanceDate\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"issuer\" : \"issuer\",\n    \"expirationDate\" : \"expirationDate\"\n  }, {\n    \"credentialSubject\" : {\n      \"key\" : { }\n    },\n    \"issuanceDate\" : \"issuanceDate\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"issuer\" : \"issuer\",\n    \"expirationDate\" : \"expirationDate\"\n  } ],\n  \"name\" : \"name\",\n  \"did\" : \"did\"\n}, {\n  \"bpn\" : \"bpn\",\n  \"createdAt\" : {\n    \"date\" : {\n      \"month\" : { },\n      \"year\" : 0\n    },\n    \"time\" : {\n      \"nano\" : 6\n    }\n  },\n  \"vcs\" : [ {\n    \"credentialSubject\" : {\n      \"key\" : { }\n    },\n    \"issuanceDate\" : \"issuanceDate\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"issuer\" : \"issuer\",\n    \"expirationDate\" : \"expirationDate\"\n  }, {\n    \"credentialSubject\" : {\n      \"key\" : { }\n    },\n    \"issuanceDate\" : \"issuanceDate\",\n    \"id\" : \"id\",\n    \"proof\" : {\n      \"proofValue\" : \"proofValue\",\n      \"created\" : \"created\",\n      \"proofPurpose\" : \"proofPurpose\",\n      \"type\" : \"type\",\n      \"verificationMethod\" : \"verificationMethod\"\n    },\n    \"type\" : [ \"type\", \"type\" ],\n    \"@context\" : [ \"@context\", \"@context\" ],\n    \"issuer\" : \"issuer\",\n    \"expirationDate\" : \"expirationDate\"\n  } ],\n  \"name\" : \"name\",\n  \"did\" : \"did\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<WalletDto>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<WalletDto>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
