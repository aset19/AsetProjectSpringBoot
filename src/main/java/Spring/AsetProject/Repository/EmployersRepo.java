package Spring.AsetProject.Repository;


import Spring.AsetProject.Entities.Employers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface EmployersRepo extends JpaRepository<Employers, Long> {

}
