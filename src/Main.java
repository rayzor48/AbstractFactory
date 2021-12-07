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
        }

        return app ;
    }

    public static void main(String[] args) {


            app.build();
    }
}
