package net.pra.restproject.controller;

import org.slf4j.Logger;
import net.pra.restproject.entity.FlightDetail;
import net.pra.restproject.service.IFlightsDashboardService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class InternationalFlightsDashboardController {

    Logger logger = LoggerFactory.getLogger(InternationalFlightsDashboardController.class);

    @Autowired
    private IFlightsDashboardService flightsDashboardService;


    @GetMapping("/dashboard")
    public String getFlightsDashboard(Model model){
        System.out.println("but");
        logger.debug("@@@@@@@@@@@@@@get");
        List<FlightDetail> dash = flightsDashboardService.getFlightDashBoard();
        model.addAttribute("dash", dash);
        return "home";
    }

    @PostMapping("/dashboard")
    public String insertFlightsDetail(@ModelAttribute("dashinsert") FlightDetail flightDetail, Model model){
        logger.debug("#####post");
        flightsDashboardService.saveFightDetail(flightDetail);
        List<FlightDetail> dash = flightsDashboardService.getFlightDashBoard();
        model.addAttribute("dash", dash);
        return "home";
    }
}
