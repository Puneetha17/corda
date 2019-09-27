/*
 * Copyright 2019 Web3 Labs LTD.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.web3j.corda.model.confidential

import javax.annotation.Generated

/**
 *
 * @param x500Name CordaX500Name encoded Party
 * @param publicKey Base 58 Encoded Public Key
 */
@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-09-25T12:12:09.606Z"
)
data class CertificateOwnershipAssertion(
    /* CordaX500Name encoded Party */
    val x500Name: kotlin.String,
    /* Base 58 Encoded Public Key */
    val publicKey: kotlin.String
)
