# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Fixed
- Security issues regarding container images executed as root user are now executed as non-root user 

## [3.3.2] - 2023-02-24
### Fixed
- Configurable log level settings with default to INFO
- Configurable timeouts for HTTP client calls with lower default value

## [3.3.1] - 2023-02-23
### Fixed
- Fix blocking issue upon status list creation

## [3.3.0] - 2023-02-14
- Remove unused UI
- Fix credential status description in OpenApi

## [3.2.0] - 2023-02-13
- Add an allowlist for requested connections based on the DID of the requester

## [3.1.1] - 2023-01-27
- Add Kotlin docs to the interfaces

## [3.1.0] - 2023-01-26
- Fix regex bug in utility method
- Rename enviroment variables and secrets
- Set verkey as optional in the verify credentials and presentation method
- Re-enable BPDM scheduler
- Make the values in OpenAPI configurable

## [3.0.0] - 2023-01-09
- Use separate AcaPy instances for Base Endorser wallet and multi-tenant company wallets
- Support endorsement by Base wallet for setting did-communication service endpoints for company wallet
- Support acceptance and reception of connection requests and credential issuance from external issuers by company wallets

## [2.2.0] - 2022-12-20

### Changed
- update the supported AcaPy version to 0.7.5
- update the Business Partner data integration from external BPDM service
- other improvements and additional tests

## [2.1.0] - 2022-10-06

### Added
- Wallet handling via CRUD
- Verifiable Credentials and Verifiable Presentation handling via CRUD
- Revocation of Verifiable Credentials
- DID document and Service Endpoint handling via CRUD
- Business Partner data integration from external BPDM service and Verifiable Credentials
- Copyright, dependency and notice files according to Eclipse project requirements
