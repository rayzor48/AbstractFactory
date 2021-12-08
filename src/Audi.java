public class Audi implements Factory{

    @Override
    public Crossover createCrossover() {
        System.out.println("You have created audi automobil");
        return new AudiCarCrossover();
    }

    @Override
    public Sedan createSedan() {
        System.out.println("You have created audi automobil");
        return new AudiCarSedan();
    }
}
