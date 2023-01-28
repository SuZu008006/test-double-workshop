class LaunchMissile(private val missile: Missile, private val launchCode: String?) {
    fun launchDummy() {
        missile.launch()
    }

    fun launchSpy() {
        if (launchCode != "expired launch code" && launchCode != null) {
            missile.launch()
        }
    }
}
