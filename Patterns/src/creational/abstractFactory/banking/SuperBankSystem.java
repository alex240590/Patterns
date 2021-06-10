package creational.abstractFactory.banking;

import creational.abstractFactory.Developer;
import creational.abstractFactory.ProjectManager;
import creational.abstractFactory.ProjectTeamFactory;
import creational.abstractFactory.Tester;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();

        System.out.println("creating banking project");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
