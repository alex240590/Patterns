package structural.bridge;

public class StockExchange extends Program{

    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development is in progress...");
        developer.writeCode();
    }
}
