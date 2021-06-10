package structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        DaraBase dataBase = new AdapterJavaToDatabase();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
