package sit.int204.classicmodelsservicetry.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.int204.classicmodelsservicetry.entities.Office;

import java.util.List;

public interface OfficeRepository extends JpaRepository<Office, String> {

    public List<Office> findByCityContains(String city);
}
