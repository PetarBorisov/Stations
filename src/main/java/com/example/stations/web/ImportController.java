package com.example.stations.web;

import com.example.stations.models.dto.StationAddDTO;
import com.example.stations.service.StationService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;


@Controller
public class ImportController {

    private final StationService stationService;

    public ImportController(StationService stationService) {
        this.stationService = stationService;
    }
    @GetMapping("/import")
    public ModelAndView showJson(@ModelAttribute("StationSeedDTO") StationAddDTO stationSeedDTO) {
        return new ModelAndView("import");

    }
    @PostMapping("/import")
    public ModelAndView addJson(@ModelAttribute("StationSeedDTO") @Valid StationAddDTO stationSeedDTO,
                                       BindingResult bindingResult) throws IOException {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("import");
        }

        stationService.importStations(stationSeedDTO);

        return new ModelAndView("successImport");

    }
    }
