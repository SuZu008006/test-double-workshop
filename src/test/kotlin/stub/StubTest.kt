package stub

import LaunchMissile
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StubTest {
    @Test
    fun `If the entered launch code has valid, the missile launch is executed`() {
        val stubMissile = StubMissile()
        val validLaunchCode = "valid launch code"
        val launchMissile = LaunchMissile(stubMissile, validLaunchCode)
        val expectedLaunchCode = ValidLaunchCodeStub()


        val actualLaunchCode = launchMissile.launchStub()

        assertEquals(expectedLaunchCode.isUnsigned, actualLaunchCode.isUnsigned)
        assertEquals(expectedLaunchCode.isExpired, actualLaunchCode.isExpired)
    }

    @Test
    fun `If the entered launch code has expired, the missile launch is aborted`() {
        val stubMissile = StubMissile()
        val expiredLaunchCode = "expired launch code"
        val launchMissile = LaunchMissile(stubMissile, expiredLaunchCode)
        val expectedLaunchCode = ExpiredLaunchCodeStub()


        val actualLaunchCode = launchMissile.launchStub()


        assertEquals(expectedLaunchCode.isUnsigned, actualLaunchCode.isUnsigned)
        assertEquals(expectedLaunchCode.isExpired, actualLaunchCode.isExpired)
    }

    @Test
    fun `If the entered unsigned launch code, the missile launch is aborted`() {
        val stubMissile = StubMissile()
        val unsignedLaunchCode = null
        val launchMissile = LaunchMissile(stubMissile, unsignedLaunchCode)
        val expectedLaunchCode = UnsignedLaunchCodeStub()


        val actualLaunchCode = launchMissile.launchStub()


        assertEquals(expectedLaunchCode.isUnsigned, actualLaunchCode.isUnsigned)
        assertEquals(expectedLaunchCode.isExpired, actualLaunchCode.isExpired)
    }
}
