package mock

import LaunchMissile
import org.junit.jupiter.api.Test

class MockTest {
    @Test
    fun `If the entered launch code has valid, the missile launch is executed`() {
        val mockMissile = MockMissile()
        val validLaunchCode = "valid launch code"
        val launchMissile = LaunchMissile(mockMissile, validLaunchCode)


        launchMissile.launchMock()


        mockMissile.verifyCodeRedAbort(PathEnum.EXECUTE)
    }

    @Test
    fun `If the entered launch code has expired, the missile launch is aborted`() {
        val mockMissile = MockMissile()
        val expiredLaunchCode = "expired launch code"
        val launchMissile = LaunchMissile(mockMissile, expiredLaunchCode)


        launchMissile.launchMock()


        mockMissile.verifyCodeRedAbort(PathEnum.ABORT)
    }

    @Test
    fun `If the entered unsigned launch code, the missile launch is aborted`() {
        val mockMissile = MockMissile()
        val unsignedLaunchCode = null
        val launchMissile = LaunchMissile(mockMissile, unsignedLaunchCode)


        launchMissile.launchMock()


        mockMissile.verifyCodeRedAbort(PathEnum.ABORT)
    }
}
