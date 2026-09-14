package com.ericthetester.lesson21.finalkeyword;

public final class SecurityPolicy {

    private final boolean requireAuth;

    public SecurityPolicy(boolean requireAuth) {

        this.requireAuth = requireAuth;

    }

    public boolean isRequireAuth() {

        return requireAuth;

    }
}

// The class itself is final, so nothing can extend SecurityPolicy -
// "class StrictSecurityPolicy extends SecurityPolicy" would not
// compile anywhere in this project. That guarantee matters for a class
// like this one: a subclass could otherwise override behavior and
// quietly weaken a security rule the rest of the codebase assumes is
// fixed.
