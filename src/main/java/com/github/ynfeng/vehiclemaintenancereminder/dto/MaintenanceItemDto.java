package com.github.ynfeng.vehiclemaintenancereminder.dto;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MaintenanceItemDto {
    private String name;
    private String method;
    private int cycle;
    private String cycleUnit;
    private LocalDate lastMaintenanceDate;
}
