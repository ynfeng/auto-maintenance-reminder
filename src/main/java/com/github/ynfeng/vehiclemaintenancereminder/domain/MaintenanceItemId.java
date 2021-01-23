package com.github.ynfeng.vehiclemaintenancereminder.domain;

public class MaintenanceItemId {
    private String name;
    private MaintenanceMethod method;

    private MaintenanceItemId(String name, MaintenanceMethod method) {
        this.name = name;
        this.method = method;
    }

    public static MaintenanceItemId of(String name, MaintenanceMethod method) {
        return new MaintenanceItemId(name, method);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceItemId)) {
            return false;
        }

        MaintenanceItemId that = (MaintenanceItemId) o;

        if (!name.equals(that.name)) {
            return false;
        }
        return method == that.method;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + method.hashCode();
        return result;
    }
}
