package com.github.ynfeng.vehiclemaintenancereminder.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class MaintenanceItemTest {
    @Test
    public void should_create_consumable_item() {
        MaintenanceItem engineOil
            = MaintenanceItem.consumableItem("Engine oil", MaintenanceCycle.months(3));
        MaintenanceItem anOtherEngineOil
            = MaintenanceItem.consumableItem("Engine oil", MaintenanceCycle.months(5));

        assertThat(engineOil, is(anOtherEngineOil));
    }

}
