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
package org.web3j.corda.model.node.services.vault

import javax.annotation.Generated

/**
 *
 * @param owner
 * @param quantity
 * @param issuer
 * @param issuerRef
 * @param stateRef
 */
@Generated(
    value = ["org.web3j.corda.codegen.CorDappClientGenerator"],
    date = "2019-09-25T12:12:09.611Z"
)
data class VaultSchemaV1_VaultFungibleStates(
    val quantity: kotlin.Long,
    val owner: org.web3j.corda.model.core.identity.AbstractParty? = null,
    val issuer: org.web3j.corda.model.core.identity.AbstractParty? = null,
    val issuerRef: kotlin.collections.List<kotlin.ByteArray>? = null,
    val stateRef: org.web3j.corda.model.core.schemas.PersistentStateRef? = null
)