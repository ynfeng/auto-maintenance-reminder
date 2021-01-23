package com.github.ynfeng.vehiclemaintenancereminder.domain;

import java.time.temporal.ChronoUnit;

public class MaintenanceCycle {
    private final int value;
    private final ChronoUnit unit;

    private MaintenanceCycle(int value, ChronoUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static MaintenanceCycle months(int value) {
        return new MaintenanceCycle(value, ChronoUnit.MONTHS);
    }
}
