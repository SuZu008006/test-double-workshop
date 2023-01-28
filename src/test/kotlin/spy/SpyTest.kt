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


        launchMissile.launchGoodSpy()


        assertTrue(spyMissile.launchWasCalled)
    }

    @Test
    fun `If the entered launch code has expired, the missile launch is aborted`() {
        val spyMissile = SpyMissile()
        val expiredLaunchCode = "expired launch code"
        val launchMissile = LaunchMissile(spyMissile, expiredLaunchCode)


        launchMissile.launchGoodSpy()


        assertFalse(spyMissile.launchWasCalled)
    }

    @Test
    fun `If the entered empty launch code, the missile launch is aborted`() {
        val spyMissile = SpyMissile()
        val expiredLaunchCode = null
        val launchMissile = LaunchMissile(spyMissile, expiredLaunchCode)


        launchMissile.launchGoodSpy()


        assertFalse(spyMissile.launchWasCalled)
    }
}
