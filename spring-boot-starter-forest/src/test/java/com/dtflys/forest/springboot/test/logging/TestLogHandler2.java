package com.dtflys.forest.springboot.test.logging;

public class TestLogHandler2 extends TestLogHandler {

    @Override
    public void logContent(String content) {
        getLogger().info("[Test2] " + content);
    }
}
