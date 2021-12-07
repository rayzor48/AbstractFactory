public class App {
    private Sedan sedan;
    private Crossover crossover;

    public App(Factory factory) {
        sedan = factory.createSedan();
        crossover = factory.createCrossover();
    }

    public void build() {
        sedan.build();
        crossover.build();
    }
}
