package com.github.ynfeng.vehiclemaintenancereminder.controller;

import com.github.ynfeng.vehiclemaintenancereminder.dto.MaintenanceItemDto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        List<MaintenanceItemDto> items = maintenanceItemDtos();
        model.addAttribute("maintenanceItems", items);
        return "index";
    }

    private List<MaintenanceItemDto> maintenanceItemDtos() {
        List<MaintenanceItemDto> items = new ArrayList<>();
        MaintenanceItemDto engineOil = MaintenanceItemDto.builder()
            .name("Engine oil")
            .method("REPLACE")
            .cycle(3)
            .cycleUnit("MONTHS")
            .lastMaintenanceDate(LocalDate.of(2020, 1, 20))
            .build();
        items.add(engineOil);
        MaintenanceItemDto item = MaintenanceItemDto.builder()
            .name("Lighting system")
            .method("MAINTAIN")
            .cycle(1)
            .cycleUnit("YEARS")
            .lastMaintenanceDate(LocalDate.of(2021, 1, 5))
            .build();
        items.add(item);
        return items;
    }
}
