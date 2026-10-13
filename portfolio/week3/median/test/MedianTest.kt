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
    "Median is 12.0 when only input is 12.0" {
        median(listOf(12f)) shouldBe 12.0
    }
    "Median is 34.5 when input is [32.0,37.0]" {
        median(listOf(32f,37f)) shouldBe 34.5
    }
    "Median is 111.0 when input is [13.0,111.0,196]" {
        median(listOf(13f,111f,196f)) shouldBe 111.0
    }
    "Median is 6436.0 when input is [1.0,2.0,12870.0,12871.0]" {
        median(listOf(1f,2f,12870f,12871f)) shouldBe 6436.0
    }
})
