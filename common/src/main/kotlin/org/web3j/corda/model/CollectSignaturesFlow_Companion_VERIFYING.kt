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

/**
 *
 * @param label
 * @param changes
 * @param extraAuditData
 */
data class CollectSignaturesFlow_Companion_VERIFYING(
    val label: kotlin.String,
    val extraAuditData: kotlin.collections.Map<kotlin.String, kotlin.String>,
    val changes: kotlin.Any? = null
)
