package ntnu.appdev.jdbcconnection.repository;

import ntnu.appdev.jdbcconnection.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {

}
