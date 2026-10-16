// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    //tests for lists containing 1, 2, 3, and 4 elements
    "Median is 12.0 when only input is [12.0]" {
        median(listOf(12f)) shouldBe 12.0
    }
    "Median is 34.88365173339844 when input is [32.64385,37.123456789]" {
        median(listOf(32.64385f,37.123456789f)) shouldBe 34.88365173339844
    }
    "Median is 0.0 when input is [0.0,0.0,0.0]" {
        median(listOf(0f,0f,0f)) shouldBe 0.0
    }
    "Median is 6436.0 when input is [-1.0,2.0,-12870.0,-12871.0,five]" {
        median(listOf(-1f,2f,-12870f,-12871f)) shouldBe -6435.5
    }
})
