package smittetryk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smittetryk.model.Region;

public interface RegionRepository extends JpaRepository<Region, String> {
}
