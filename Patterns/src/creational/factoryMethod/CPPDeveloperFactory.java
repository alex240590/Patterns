package creational.factoryMethod;

public class CPPDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CPPDeveloper();
    }
}
