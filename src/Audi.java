public class Audi implements Factory{

    @Override
    public Crossover createCrossover() {
        System.out.println("You have created audi");
        return new AudiCarCrossover();
    }

    @Override
    public Sedan createSedan() {
        System.out.println("You have created audi");
        return new AudiCarSedan();
    }
}
