package dummy

import LaunchMissile
import org.junit.jupiter.api.Test
import kotlin.test.assertFails

class DummyTest {
    @Test
    fun `if the entered launch code has expired, the missile launch throws an error`() {
        val dummyMissile = DummyMissile()
        val expiredLaunchCode = "expired launch code"


        val launchMissile = LaunchMissile(dummyMissile, expiredLaunchCode)


        assertFails {
            launchMissile.launchDummy()
        }
    }
}
