package com.github.astarte25.model;

import java.util.HashMap;
import java.util.Map;

public class PassHolder {
    private static int allIds = 1;
    private Map<Integer, PasswordEntry> entries = new HashMap<>();


    public char[] getPassword(final String serviceName) {
        return entries.values().stream()
                .filter(pe -> pe.getServiceName().equals(serviceName))
                .findFirst()
                .orElseThrow(RuntimeException::new)
                .getPassword();
    }
}
