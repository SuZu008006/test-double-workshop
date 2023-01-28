package mock

import Missile
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MockMissile : Missile {
    private var launchWasCalled = false
    private var disableWasCalled = false

    override fun launch() {
        launchWasCalled = true
    }

    fun verifyCodeRedAbort(path: PathEnum) {
        if (path== PathEnum.EXECUTE) {
            assertTrue(launchWasCalled)
            assertFalse(disableWasCalled)
        } else {
            assertFalse(launchWasCalled)
            assertFalse(disableWasCalled)
        }
    }
}
