package creational.abstractFactory.website;

import creational.abstractFactory.Developer;
import creational.abstractFactory.ProjectManager;
import creational.abstractFactory.ProjectTeamFactory;
import creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}
