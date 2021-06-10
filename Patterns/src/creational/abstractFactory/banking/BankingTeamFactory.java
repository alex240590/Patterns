package creational.abstractFactory.banking;

import creational.abstractFactory.Developer;
import creational.abstractFactory.ProjectManager;
import creational.abstractFactory.ProjectTeamFactory;
import creational.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }
}
