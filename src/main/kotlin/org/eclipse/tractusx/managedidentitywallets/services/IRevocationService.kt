/********************************************************************************
 * Copyright (c) 2021,2023 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 ********************************************************************************/

package org.eclipse.tractusx.managedidentitywallets.services

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.logging.*
import io.ktor.client.features.observer.*
import org.eclipse.tractusx.managedidentitywallets.models.InternalServerErrorException
import org.eclipse.tractusx.managedidentitywallets.models.NotFoundException
import org.eclipse.tractusx.managedidentitywallets.models.ServicesHttpClientConfig
import org.eclipse.tractusx.managedidentitywallets.models.ssi.CredentialStatus
import org.eclipse.tractusx.managedidentitywallets.models.ssi.VerifiableCredentialDto
import org.slf4j.LoggerFactory
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

/**
 * The IRevocationService interface describes the functionalities for managing
 * and issuing revocation lists and status credentials.
 */
interface IRevocationService {

    /**
     * Registers a new revocation list with the given profile name.
     * @param profileName the name of the profile for the revocation list
     * @param issueCredential a flag indicating whether to issue a verifiable credential directly for the list
     * @return the created list name a string
     */
    suspend fun registerList(profileName: String, issueCredential: Boolean): String

    /**
     * Adds a new status entry to an existing revocation list.
     * @param profileName the name of the profile for the revocation list
     * @return [CredentialStatus] the status of the added entry
     * @throws NotFoundException if the list does not exist
     * @throws InternalServerErrorException if adding the status entry failed in the revocation service
     */
    suspend fun addStatusEntry(profileName: String): CredentialStatus

    /**
     * Retrieves the status list credential for a given managed wallet using its listName.
     * @param listName the name of the revocation list
     * @return [VerifiableCredentialDto] the status list verifiable credential
     * @throws NotFoundException if the credential with given listName does not exist
     * @throws InternalServerErrorException if the credential could not be retrieved from the revocation service
     */
    suspend fun getStatusListCredentialOfManagedWallet(listName: String): VerifiableCredentialDto

    /**
     * Retrieves the status list credential from a given url.
     * @param statusListUrl the url for the status list credential
     * @return [VerifiableCredentialDto] the status list verifiable credential
     * @throws NotFoundException if the credential with given statusListUrl does not exist
     * @throws InternalServerErrorException if the credential could not be retrieved from the revocation service
     */
    suspend fun getStatusListCredentialOfUrl(statusListUrl: String): VerifiableCredentialDto

    /**
     * Revokes an issued credential from an existing revocation list.
     * @param profileName the name of the profile for the revocation list
     * @param indexOfCredential the index of the credential
     */
    suspend fun revoke(profileName: String, indexOfCredential: Long)

    /**
     * Issues status list credentials for a given profile or all profiles.
     * @param profileName the profile to issue credentials for. If null, credentials will be issued for all profiles
     * @param force a flag indicating whether to force the issuance of credentials ignoring the cache in revocation service
     */
    suspend fun issueStatusListCredentials(profileName: String? = null, force: Boolean? = false)

    companion object {
        private val log = LoggerFactory.getLogger(this::class.java)

        /**
         * Creates the revocation Service which implements the IRevocationService.
         * The used HTTP client to communicate with the revocation service is configured in this method.
         */
        fun createRevocationService(
            revocationUrl: String,
            httpClientConfig: ServicesHttpClientConfig
        ){ //: IRevocationService {
            return
            /*return RevocationServiceImpl(
                revocationUrl,
                HttpClient {
                    expectSuccess = true
                    install(HttpTimeout) {
                        requestTimeoutMillis = httpClientConfig.requestTimeoutMillis
                        connectTimeoutMillis = httpClientConfig.connectTimeoutMillis
                        socketTimeoutMillis = httpClientConfig.socketTimeoutMillis
                    }
                    install(ResponseObserver) {
                        onResponse { response ->
                            log.debug("HTTP status: ${response.status.value}")
                            log.debug("HTTP description: ${response.status.description}")
                        }
                    }
                    install(Logging) {
                        logger = Logger.DEFAULT
                        level = LogLevel.valueOf(httpClientConfig.logLevel)
                    }
                    install(JsonFeature) {
                        serializer = JacksonSerializer {
                            enable(SerializationFeature.INDENT_OUTPUT)
                            serializationConfig.defaultPrettyPrinter
                            setSerializationInclusion(JsonInclude.Include.NON_NULL)
                        }
                    }
                })*/
        }
    }
}
