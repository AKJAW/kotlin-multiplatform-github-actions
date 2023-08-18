import io.kotest.matchers.shouldBe
import org.junit.Test

class DesktopTest {

    @Test
    fun `Platform name is correct`() {
        getPlatformName() shouldBe "Desktop"
    }
}
