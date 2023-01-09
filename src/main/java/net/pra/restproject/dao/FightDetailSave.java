package net.pra.restproject.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

public class FightDetailSave {

    private String flightNo;
    private LocalDate departure;
    private LocalDate arrival;
    private String fromLocation;
    private String toLocation;
    private double cost;


    public FightDetailSave(String flightNo, LocalDate departure, LocalDate arrival, String fromLocation, String toLocation, double cost) {
        this.flightNo = flightNo;
        this.departure = departure;
        this.arrival = arrival;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.cost = cost;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "FightDetailSave{" +
                "flightNo='" + flightNo + '\'' +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", fromLocation='" + fromLocation + '\'' +
                ", toLocation='" + toLocation + '\'' +
                ", cost=" + cost +
                '}';
    }
}
