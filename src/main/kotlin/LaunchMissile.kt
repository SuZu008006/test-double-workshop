class LaunchMissile(private val missile: Missile, private val launchCode: String?) {
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
        }
    }

    private fun checkLaunchCode(launchCode: String?): Boolean {
        return launchCode != "expired launch code" && launchCode != null
    }
}
