package com.example.stations.service.Impl;

import com.example.stations.models.dto.StationAddDTO;
import com.example.stations.models.entity.Station;
import com.example.stations.repository.StationRepository;
import com.example.stations.service.StationService;
import com.example.stations.util.ValidationUtil;
import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StationServiceImpl implements StationService {

    private static String STATION_FILE_PATH = "src/main/resources/files/json/gas-stations-data.json";

    private final StationRepository stationRepository;
    private final ModelMapper modelMapper;
    private final Gson gson;
    private final ValidationUtil validationUtil;

@Autowired
    public StationServiceImpl(StationRepository stationRepository, ModelMapper modelMapper, Gson gson, ValidationUtil validationUtil) {
        this.stationRepository = stationRepository;
    this.modelMapper = modelMapper;
    this.gson = gson;
        this.validationUtil = validationUtil;
    }

    @Override
    public boolean areImported() {
        return this.stationRepository.count() > 0;
    }

    @Override
    public String readStationsFromFile() throws IOException {
        return Files.readString(Path.of(STATION_FILE_PATH));
    }

        @Override
        public void importStations(StationAddDTO stationSeedDTO) throws IOException {

            final List<StationAddDTO>  stations =
                    Arrays.stream(gson.fromJson(readStationsFromFile(), StationAddDTO[].class))
                            .collect(Collectors.toList());

            for (StationAddDTO station : stations) {

                if (this.stationRepository.findByName(station.getName()).isPresent() || !station.getOpen() ||
                        !this.validationUtil.isValid(station)) {

                    continue;
                }

                this.stationRepository.save(this.modelMapper.map(station, Station.class));
            }
        }

@Override
    public BigDecimal getMinDieselPrice() {
        return stationRepository.findMinDieselPrice();
    }
@Override
    public BigDecimal getMaxDieselPrice() {
        return stationRepository.findMaxDieselPrice();
    }
@Override
    public BigDecimal getAverageDieselPrice() {
        return stationRepository.findAverageDieselPrice();
    }
@Override
    public BigDecimal getMinE5Price() {
        return stationRepository.findMinE5Price();
    }
@Override
    public BigDecimal getMaxE5Price() {
        return stationRepository.findMaxE5Price();
    }
@Override
    public BigDecimal getAverageE5Price() {
        return stationRepository.findAverageE5Price();
    }
@Override
    public BigDecimal getMinE10Price() {
        return stationRepository.findMinE10Price();
    }
@Override
    public BigDecimal getMaxE10Price() {
        return stationRepository.findMaxE10Price();
    }
@Override
    public BigDecimal getAverageE10Price() {
        return stationRepository.findAverageE10Price();
    }
}

