package net.pra.restproject.service;

import net.pra.restproject.dao.FightDetailSave;
import net.pra.restproject.entity.FlightDetail;

import java.util.List;

public interface IFlightsDashboardService {

    public boolean saveFightDetail(FlightDetail flightDetail);

    List<FlightDetail> getFlightDashBoard();
}
