package com.example.stations.web;

import com.example.stations.service.StationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatisticsController {

    private final StationService stationService;

    public StatisticsController(StationService stationService) {
        this.stationService = stationService;
    }


    @GetMapping("/statistics")
    public String showStatistics(Model model) {
        model.addAttribute("minDieselPrice", stationService.getMinDieselPrice());
        model.addAttribute("maxDieselPrice", stationService.getMaxDieselPrice());
        model.addAttribute("avgDieselPrice", stationService.getAverageDieselPrice());
        model.addAttribute("minE5Price", stationService.getMinE5Price());
        model.addAttribute("maxE5Price", stationService.getMaxE5Price());
        model.addAttribute("avgE5Price", stationService.getAverageE5Price());
        model.addAttribute("minE10Price", stationService.getMinE10Price());
        model.addAttribute("maxE10Price", stationService.getMaxE10Price());
        model.addAttribute("avgE10Price", stationService.getAverageE10Price());

        return "statistics";
    }
}
