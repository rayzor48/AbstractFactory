public class BMW implements Factory{

    @Override
    public Crossover createCrossover() {
        System.out.println("You have created bmw automobil");
        return new BMWCarCrrossover();
    }

    @Override
    public Sedan createSedan() {
        System.out.println("You have created bmw automobil");
        return new BMWCarSedan();
    }
}
