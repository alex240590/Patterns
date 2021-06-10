package behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("Creating new project v1.0");
        project.setVersionAndDate("v1.0");

        System.out.println(project);

        System.out.println("Saving current project to github");
        gitHubRepo.setSave(project.save());

        System.out.println("Updating project to version 1.1");
        System.out.println("Writing poor code..");

        project.setVersionAndDate("V1.1");
        System.out.println(project);

        System.out.println("Something went wrong");
        System.out.println("Roll back to v.1.0");
        project.load(gitHubRepo.getSave());

        System.out.println("Project after rollback:");
        System.out.println(project);
    }
}
