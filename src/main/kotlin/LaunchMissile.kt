import java.lang.Exception

class LaunchMissile(private val missile: Missile, private val launchCode: String?) {
    fun launchGoodDummy() {
        missile.launch()
    }

    fun launchBadDummy() {
        try {
            missile.launch()
        } catch (_: Exception) {
        }
    }

    fun launchGoodSpy() {
        if (launchCode != "expired launch code" && launchCode != null) {
            missile.launch()
        }
    }
}
