import io.kotest.matchers.shouldBe
import kotlin.test.Test

class CalculationTest {

    @Test
    fun `The calculation result should be 2`() {
        calculate() shouldBe 2
    }
}
