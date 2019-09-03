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
package org.web3j.corda.model

// FIXME Why we need two amount classes?
data class Amount(
    /**
     * Total amount in minor units, eg. 100.
     */
    val quantity: Int,
    /**
     * Number of decimals, eg. 0.01
     * FIXME Should be Float
     */
    val displayTokenSize: Number,
    /**
     * ISO Code of the currency, eg. `GBP`.
     */
    val token: String,
    val _tokenType: String
)