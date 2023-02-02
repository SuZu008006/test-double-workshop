class LaunchMissile(
    private val missile: Missile,
    private val launchCode: String?,
) {
    fun launchDummy() {
        missile.launch()
    }

    fun launchSpy() {
        if (checkLaunchCode(launchCode)) {
            missile.launch()
        }
    }

    fun launchMock() {
        if (checkLaunchCode(launchCode)) {
            missile.launch()
        } else {
            missile.disable()
        }
    }

    private fun checkLaunchCode(launchCode: String?): Boolean {
        return launchCode != "expired launch code" && launchCode != null
    }

    fun launchStub(): LaunchCode {
        val launch = Launch()
        if (launchCode == "expired launch code") {
            launch.isExpired = true
        } else if (launchCode == null) {
            launch.isUnsigned = true
        }
        return launch
    }
}

class Launch() : LaunchCode {
    override var isUnsigned: Boolean = false
    override var isExpired: Boolean = false
}
