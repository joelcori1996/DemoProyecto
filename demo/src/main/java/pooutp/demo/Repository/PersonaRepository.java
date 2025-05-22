package pooutp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pooutp.demo.Entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
