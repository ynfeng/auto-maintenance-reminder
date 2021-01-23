package com.github.ynfeng.vehiclemaintenancereminder.domain;

import java.time.LocalDate;

public class MaintenanceItem {
    private MaintenanceItemId id;
    private MaintenanceCycle cycle;
    private LocalDate lastMaintenanceDate;

    private MaintenanceItem(MaintenanceItemId id, MaintenanceCycle cycle) {
        this.id = id;
        this.cycle = cycle;
        lastMaintenanceDate = null;
    }

    public static MaintenanceItem consumableItem(String name, MaintenanceCycle cycle) {
        return new MaintenanceItem(MaintenanceItemId.of(name, MaintenanceMethod.REPLACE), cycle);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceItem)) {
            return false;
        }

        MaintenanceItem that = (MaintenanceItem) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
