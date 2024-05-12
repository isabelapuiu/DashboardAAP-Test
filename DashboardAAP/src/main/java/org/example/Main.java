package org.example;

import aap.tests.TestLogin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting test run");
        TestLogin testLogin = new TestLogin();
        testLogin.runTest();
    }
}