import io.kotest.matchers.shouldBe
import org.junit.Test

class AndroidTest {

    @Test
    fun `Platform name is correct`() {
        getPlatformName() shouldBe "Android"
    }
}
