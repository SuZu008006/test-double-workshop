package stub

import LaunchMissile
import MissileImplement
import UsedLaunchCodesRepositoryImplement
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StubTest {
    @Test
    fun `If the entered launch code has valid, the missile launch is executed`() {
        val missile = MissileImplement(UsedLaunchCodesRepositoryImplement())
        val validLaunchCode = "valid launch code"
        val launchMissile = LaunchMissile(missile, validLaunchCode)
        val expectedLaunchCode = ValidLaunchCodeStub()


        val actualLaunchCode = launchMissile.launchStub()

        assertEquals(expectedLaunchCode.isUnsigned, actualLaunchCode.isUnsigned)
        assertEquals(expectedLaunchCode.isExpired, actualLaunchCode.isExpired)
    }

    @Test
    fun `If the entered launch code has expired, the missile launch is aborted`() {
        val missile = MissileImplement(UsedLaunchCodesRepositoryImplement())
        val expiredLaunchCode = "expired launch code"
        val launchMissile = LaunchMissile(missile, expiredLaunchCode)
        val expectedLaunchCode = ExpiredLaunchCodeStub()


        val actualLaunchCode = launchMissile.launchStub()


        assertEquals(expectedLaunchCode.isUnsigned, actualLaunchCode.isUnsigned)
        assertEquals(expectedLaunchCode.isExpired, actualLaunchCode.isExpired)
    }

    @Test
    fun `If the entered unsigned launch code, the missile launch is aborted`() {
        val missile = MissileImplement(UsedLaunchCodesRepositoryImplement())
        val unsignedLaunchCode = null
        val launchMissile = LaunchMissile(missile, unsignedLaunchCode)
        val expectedLaunchCode = UnsignedLaunchCodeStub()


        val actualLaunchCode = launchMissile.launchStub()


        assertEquals(expectedLaunchCode.isUnsigned, actualLaunchCode.isUnsigned)
        assertEquals(expectedLaunchCode.isExpired, actualLaunchCode.isExpired)
    }
}
