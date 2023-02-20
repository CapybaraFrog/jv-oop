package core.basesyntax;

public class MainApp {
    Machine truck = new Truck();
    Machine bulldozer = new Bulldozer();
    Machine excavator = new Excavator();

    Machine[] machines = {truck,bulldozer, excavator} ;

    {

        for (Machine machine : machines) {

            machine.doWork();
        }

        for (Machine machine : machines) {

            machine.stopWork();
        }
    }

}

