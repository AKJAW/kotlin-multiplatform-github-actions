import XCTest
import shared

final class iosTest: XCTestCase {

    func testPlatformNameIsCorrect() throws {
        XCTAssertEqual(Main_iosKt.getPlatformName(), "iOS")
    }
}
