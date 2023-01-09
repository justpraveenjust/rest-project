package net.pra.restproject.repository;

import net.pra.restproject.entity.FlightDetail;
import org.springframework.data.repository.CrudRepository;

public interface FlightDetailRepo extends CrudRepository<FlightDetail, Long> {
}
