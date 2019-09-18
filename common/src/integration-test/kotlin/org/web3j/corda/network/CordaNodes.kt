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
package org.web3j.corda.network

import java.util.function.Consumer

class CordaNodes internal constructor(private val network: CordaNetwork) : Iterable<CordaNode> {

    private val nodes = mutableListOf<CordaNode>()

    override fun iterator() = nodes.iterator()

    @JvmName("node")
    fun nodeJava(nodeBlock: Consumer<CordaNode>) {
        CordaNode(network).also {
            nodeBlock.accept(it)
            it.validate()
            nodes.add(it)
            if (it.autoStart) {
                it.start()
            }
        }
    }
}
