package creational.factoryMethod;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if(specialty.equalsIgnoreCase("CPP")){
            return new CPPDeveloperFactory();
        }else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
