package com.beok.kotest_tutorial

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FunSpecTest : FunSpec(
    {
        test("1 더하기 1은 2입니다") {
            1+1 shouldBe 2
        }
        test("2 더하기 2는 4입니다") {
            2+2 shouldBe 4
        }
    }
)