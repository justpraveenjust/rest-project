package net.pra.restproject.serviceimpl;

import net.pra.restproject.entity.FlightDetail;
import net.pra.restproject.repository.FlightDetailRepo;
import net.pra.restproject.service.IFlightsDashboardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;


@Service
public class FlightsDashboardServiceImpl implements IFlightsDashboardService {

    Logger LOGGER = LoggerFactory.getLogger(FlightsDashboardServiceImpl.class);
    @Autowired
    private FlightDetailRepo flightDetailRepo;

    @Override
    public boolean saveFightDetail(FlightDetail flightDetail) {
        boolean saved = false;
        try {
            flightDetailRepo.save(flightDetail);
        } catch (Exception e) {
            LOGGER.trace("Exception thrown: "+e);
        }
        return saved;
    }

    @Override
    public List<FlightDetail> getFlightDashBoard() {
        return (List<FlightDetail>) flightDetailRepo.findAll();
    }

}
