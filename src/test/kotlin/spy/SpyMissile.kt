package spy

import Missile

class SpyMissile : Missile {
    var launchWasCalled = false

    override fun launch() {
        launchWasCalled = true
    }
}
