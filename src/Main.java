enum Type { BMW, AUDI }

public class Main {
    public static App configuration(Type fanat){
        App app;
        Factory factory;

        switch (fanat) {
            case BMW :
                factory = new BMW();
                app = new App(factory);
                return app;
            case AUDI:
                factory = new Audi();
                app = new App(factory);
                return app;
            default:
                factory = new BMW();
                app = new App(factory);
                return app;
        }
    }

    public static void main(String[] args) {

            App app = configuration(Type.BMW);
            app.build();
    }
}
