package com.beok.kotest_tutorial

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class BehaviorSpecTest : BehaviorSpec(
    {
        given("100점 만점") {
            `when`("점수") {
                and("90점 이상이면") {
                    val current = 95
                    then("A등급") {
                        grade(current) shouldBe "A"
                    }
                }
                and("80점 이상이면") {
                    val current = 81
                    then("B등급") {
                        grade(current) shouldBe "B"
                    }
                }
                and("70점 이상이면") {
                    val current = 79
                    then("C등급") {
                        grade(current) shouldBe "C"
                    }
                }
                and("그 외에는") {
                    val current = 42
                    then("F등급") {
                        grade(current) shouldBe "F"
                    }
                }
            }
        }
    }
) {

    companion object {
        fun grade(current: Int): String = when (current) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            else -> "F"
        }
    }
}

