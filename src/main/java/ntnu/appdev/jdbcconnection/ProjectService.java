package ntnu.appdev.jdbcconnection;

import ntnu.appdev.jdbcconnection.entity.Project;
import ntnu.appdev.jdbcconnection.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProject() {
        List<Project> projects = new ArrayList<>();
        projectRepository.findAll().forEach(projects::add);
        return projects;
    }

    public void addProject(Project project) {
        projectRepository.save(project);
    }

    public void updateProjectDeadline(String id, String deadline) {
        projectRepository.save()
    }

}
