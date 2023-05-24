/*
 * *******************************************************************************
 *  Copyright (c) 2021,2023 Contributors to the Eclipse Foundation
 *
 *  See the NOTICE file(s) distributed with this work for additional
 *  information regarding copyright ownership.
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0.
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 *
 *  SPDX-License-Identifier: Apache-2.0
 * ******************************************************************************
 */

package org.eclipse.tractusx.managedidentitywallets;

import org.eclipse.tractusx.managedidentitywallets.config.PostgresSQLContextInitializer;
import org.eclipse.tractusx.managedidentitywallets.constant.RestURI;
import org.eclipse.tractusx.managedidentitywallets.dao.entity.Wallet;
import org.eclipse.tractusx.managedidentitywallets.dao.repository.WalletRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import java.util.UUID;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = {ManagedIdentityWalletsApplication.class})
@ActiveProfiles("test")
@ContextConfiguration(initializers = {PostgresSQLContextInitializer.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DidDocumentsTest {
    private final String bpn = "123456789";
    @Autowired
    private WalletRepository walletRepository;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @Order(1)
    void getDidDocumentInvalidBpn404() {
        ResponseEntity<String> response = restTemplate.getForEntity(RestURI.DID_DOCUMENTS, String.class, UUID.randomUUID().toString());
        Assertions.assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatusCode().value());
    }

    @Test
    @Order(2)
    void getDidDocument200() {
        Wallet wallet = Wallet.builder()
                .bpn(bpn)
                .did("did:web:localhost" + bpn)
                .didDocument("{\"@context\":[\"https://w3id.org/did/v1\"],\"id\":\"did:web:localhost%3A8080\",\"verificationMethod\":[{\"id\":\"did:web:localhost%3A8080#key-1\",\"type\":\"Ed25519VerificationKey2020\",\"controller\":\"did:web:localhost%3A8080\",\"publicKeyMultibase\":\"zc37wdjQ4VsLEmX2AoKMHjQNxTtQBdouKbhhwEXLhB1fNJqwFDDaWkqRQ2GTWEhvubaNp8v2ox5dK6B4Efk8n2xMR4so6Ybsgck1BVs3i8WfXNsPNj4Gyz2YSS9rqLpdDv8sfMYdemQa4eq3EmrrkSLNukQrdXvGEtr9cV49CM6cYC6MSXc3S8hxuKh32AbKGURrGDnT9b5j4gj59a7Z4d66EWR1FoLHTZqh8YC96qNboYJyPSCEA6ZgXzRqeKKVwpeSxKXWSD4sa3xEHNeSpLrL4ojXNP3LyNbaHZ2nYqNaQ5pxdnUJCUqKYmiSbyRxbCrZCHSY36xab9XRjpQqQPuDtzrUCJQhpspjg5rd14EABDYzX1x54ZDtiYS9y9j2Pkora3phAyW6EBVBK2u2jo2krLeUgYSWzDTfgsWUJgtT9Pwx6aXvAf68tPQTWJtNoCSsSTBUzAZagosQnGLLTqya3Kgqg9VH1H2KuRfRQVTH29LnfuEa3e9Q2vn8sa6tS74oX2b7tKacndbnbw2CSVmbcuc9qZG8GZEc8ikK1Vvw3ukxTr\"}]}")
                .algorithm("ED25519")
                .name(bpn)
                .build();
        walletRepository.save(wallet);
        ResponseEntity<String> response = restTemplate.getForEntity(RestURI.DID_DOCUMENTS, String.class, bpn);
        Assertions.assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        Assertions.assertNotNull(response.getBody());
        System.out.print(response.getBody());
    }
}
