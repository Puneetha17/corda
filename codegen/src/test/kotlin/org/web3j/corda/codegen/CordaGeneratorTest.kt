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
package org.web3j.corda.codegen

import assertk.assertThat
import assertk.assertions.exists
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail
import org.junit.jupiter.api.io.TempDir
import java.io.File
import java.io.InputStreamReader

/**
 * TODO Implement more tests and add assertions.
 */
class CordaGeneratorTest {

    @TempDir
    lateinit var outputDir: File

    @Test
    fun `generate from Corda API definition`() {

        val definition = javaClass.classLoader.getResource("corda-api.json")?.run {
            openStream().use { InputStreamReader(it).readText() }
        } ?: fail { "corda-api.json" }

        CordaGenerator("org.web3j.corda", definition, outputDir).generate()

        File(outputDir, OUTPUT_PATH.format("main", "core", "CordaCore", "")).also {
            assertThat(it).exists()
        }

        File(outputDir, OUTPUT_PATH.format("test", "core", "CordaCore", "Test")).also {
            assertThat(it).exists()
        }

        File(outputDir, OUTPUT_PATH.format("main", "finance/workflows", "CordaFinanceWorkflows", "")).also {
            assertThat(it).exists()
        }

        File(outputDir, OUTPUT_PATH.format("test", "finance/workflows", "CordaFinanceWorkflows", "Test")).also {
            assertThat(it).exists()
        }
    }

    companion object {
        const val OUTPUT_PATH = "src/%s/kotlin/org/web3j/corda/%s/api/%s%s.kt"
    }
}
