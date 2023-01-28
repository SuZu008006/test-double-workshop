package spy

import LaunchMissile
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SpyTest {
    @Test
    fun `If the entered launch code has valid, the missile launch is executed`() {
        val spyMissile = SpyMissile()
        val validLaunchCode = "valid launch code"
        val launchMissile = LaunchMissile(spyMissile, validLaunchCode)


        launchMissile.launchSpy()


        assertTrue(spyMissile.launchWasCalled)
    }

    @Test
    fun `If the entered launch code has expired, the missile launch is aborted`() {
        val spyMissile = SpyMissile()
        val expiredLaunchCode = "expired launch code"
        val launchMissile = LaunchMissile(spyMissile, expiredLaunchCode)


        launchMissile.launchSpy()


        assertFalse(spyMissile.launchWasCalled)
    }

    @Test
    fun `If the entered unsigned launch code, the missile launch is aborted`() {
        val spyMissile = SpyMissile()
        val unsignedLaunchCode = null
        val launchMissile = LaunchMissile(spyMissile, unsignedLaunchCode)


        launchMissile.launchSpy()


        assertFalse(spyMissile.launchWasCalled)
    }
}
