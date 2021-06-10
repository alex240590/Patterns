package creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "Sourcecode sourceCode = new SourceCode();");

        System.out.println(master);

        Project masterClone1 = (Project) master.copy();

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone2 = factory.cloneProject();

        System.out.println("\n================\n");
        System.out.println(masterClone1);
        System.out.println(masterClone2);
    }
}
