package creational.abstractFactory.website;

import creational.abstractFactory.ProjectManager;
import creational.abstractFactory.ProjectTeamFactory;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebsitePM manages website project...");
    }
}
