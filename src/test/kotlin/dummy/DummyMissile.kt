package dummy

import Missile
import java.lang.RuntimeException

class DummyMissile: Missile {
    override fun launch() {
        throw RuntimeException()
    }

    override fun disable() {
        TODO("Not yet implemented")
    }
}
