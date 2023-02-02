interface Missile {
    fun launch()
    fun disable()
}

class MissileImplement(
    private val usedLaunchCodesRepository: UsedLaunchCodesRepository
) : Missile {
    override fun launch() {
        // TODO:
    }
    override fun disable() {
        TODO("Not yet implemented")
    }
}
