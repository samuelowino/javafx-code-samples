package org.owino;

public class SystemInfo {

    public static String appName() {
        return "Johnson and Hopkins Bank";
    }

    public static String javaVersion() {
        return System.getProperty("java.version");
    }

    public static String javafxVersion() {
        return System.getProperty("javafx.version");
    }

}