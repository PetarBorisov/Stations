package com.example.stations.service;

import com.example.stations.models.dto.StationAddDTO;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public interface StationService {

    boolean areImported();

    String readStationsFromFile() throws IOException;

    void importStations(StationAddDTO stationSeedDTO) throws IOException;

    BigDecimal getMinDieselPrice();

    BigDecimal getMaxDieselPrice();

    BigDecimal getAverageDieselPrice();

    BigDecimal getMinE5Price();

    BigDecimal getMaxE5Price();

    BigDecimal getAverageE5Price();

    BigDecimal getMinE10Price();

    BigDecimal getMaxE10Price();

    BigDecimal getAverageE10Price();
}





