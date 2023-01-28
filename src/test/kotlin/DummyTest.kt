import org.junit.jupiter.api.Test
import kotlin.test.assertFails

class DummyTest {
    @Test
    fun `dummyMissile works`() {
        val dummyMissile = DummyMissile()
        val expiredLaunchCode = "expired launch code"
        val launchMissile = LaunchMissile(dummyMissile, expiredLaunchCode)
        assertFails {
            launchMissile.launchGoodDummy()
        }
    }

    @Test
    fun `dummyMissile don't works`() {
        val dummyMissile = DummyMissile()
        val expiredLaunchCode = "expired launch code"
        val launchMissile = LaunchMissile(dummyMissile, expiredLaunchCode)
        assertFails {
            launchMissile.launchBadDummy()
        }
    }
}
