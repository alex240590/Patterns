package creational.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    ProjectManager getProjectManager();
    Tester getTester();
}
