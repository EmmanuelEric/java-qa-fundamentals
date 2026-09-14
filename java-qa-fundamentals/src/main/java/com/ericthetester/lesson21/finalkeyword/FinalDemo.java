package com.ericthetester.lesson21.finalkeyword;

public class FinalDemo {

    public static void main(String[] args) {

        System.out.println("Max retries allowed: " + Config.MAX_RETRIES);

        Config config = new Config("staging");

        System.out.println("Environment: " + config.getEnvironment());

        BaseTest test = new SmokeTest("Checkout Smoke Test");

        test.setup();
        test.run();

        SecurityPolicy policy = new SecurityPolicy(true);

        System.out.println("Requires auth: " + policy.isRequireAuth());
    }
}

// test is declared as BaseTest but holds a SmokeTest - the same
// dynamic dispatch from lesson16 applies to run(), which SmokeTest
// overrode. setup() is different: because BaseTest marked it final,
// every subclass runs the exact same setup() body, so there's nothing
// to dispatch - final removes the polymorphism, on purpose, for the
// one method that should never vary.
