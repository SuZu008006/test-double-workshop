package stub

import LaunchCode


class ValidLaunchCodeStub : LaunchCode {
    override val isUnsigned: Boolean = false
    override val isExpired: Boolean = false
}

class ExpiredLaunchCodeStub : LaunchCode {
    override val isUnsigned: Boolean = false
    override val isExpired: Boolean = true
}

class UnsignedLaunchCodeStub : LaunchCode {
    override val isUnsigned: Boolean = true
    override val isExpired: Boolean = false
}
