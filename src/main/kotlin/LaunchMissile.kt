import java.lang.Exception

class LaunchMissile(private val missile: Missile, private val expiredLaunchCode: String) {
    fun launchGoodDummy() {
        missile.launch()
    }

    fun launchBadDummy() {
        try {
            missile.launch()
        } catch (_: Exception) {
        }
    }
}
