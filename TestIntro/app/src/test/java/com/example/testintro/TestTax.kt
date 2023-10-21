package com.example.testintro

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class TestTax {
    companion object {
        @BeforeClass
        @JvmStatic
        fun generalSetup() {
            println("WE'RE STARTING HERE!")
        }

        @AfterClass
        @JvmStatic
        fun generalClosement() {
            println("OK! WE FINISHED EVERYTHING WE HAD TO DO HERE!")
        }
    }

    private lateinit var tax : Tax

    @Before
    fun setup() {
        println("WE'RE GONNA START THIS ONE!")
        tax = Tax()
    }

    @After
    fun teardown() {
        println("WE'RE DONE THIS SINGLE TEST!")
    }

    @Test
    fun calculateTaxTest() {
        val netTax = tax.calculateTax(100.0, 0.1)
        assertThat(netTax).isEqualTo(10)
    }

    @Test
    fun calculateIncomeTest() {
        val netIncome = tax.calculateIncome(200.0, 0.2)
        assertThat(netIncome).isEqualTo(160)
    }
}