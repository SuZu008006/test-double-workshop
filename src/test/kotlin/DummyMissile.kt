import java.lang.RuntimeException

class DummyMissile: Missile {
    override fun launch() {
        throw RuntimeException()
    }

}