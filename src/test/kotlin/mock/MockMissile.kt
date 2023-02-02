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

    override fun disable() {
        disableWasCalled = true
    }

    fun verifyLaunch() {
            assertTrue(launchWasCalled)
            assertFalse(disableWasCalled)
    }
    fun verifyDisable() {
            assertFalse(launchWasCalled)
            assertTrue(disableWasCalled)
    }
}
