public class BMW implements Factory{

    @Override
    public Crossover createCrossover() {
        System.out.println("You have created audi");
        return new BMWCarCrrossover();
    }

    @Override
    public Sedan createSedan() {
        System.out.println("You have created audi");
        return new BMWCarSedan();
    }
}
