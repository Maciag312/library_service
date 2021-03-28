package pwr.awt.library;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameRepo extends CrudRepository<Name, Long> {
        String findByName(String name);
}
