import java.io.PrintStream;
import java.util.ArrayList;

public class Train {

    private ArrayList<Wagon> wagons = new ArrayList<>();

    public void createPassangerWagon(String name, int maxNumOfPeople, int maxNumOfGoods) throws WagonNameAlreadyExistsException{
        checkName(name);
        Wagon wagon = new PassengerCar(name, maxNumOfPeople, maxNumOfGoods);
        wagons.add(wagon);
    }

    public void createFreightWagon(String name, int maxAmountOfGoods, String typeOfGoods) throws WagonNameAlreadyExistsException{
        checkName(name);
        Wagon wagon = new FreightWagon(name, maxAmountOfGoods, typeOfGoods);
        wagons.add(wagon);
    }

    public void createSpecialWagon(String name, String descriptiveField) throws WagonNameAlreadyExistsException{
        checkName(name);
        Wagon wagon = new SpecialWagon(name, descriptiveField);
        wagons.add(wagon);
    }

    public void deleteWagon(int wagonNumber) throws WagonNotFoundException {
        if (wagons.isEmpty() || wagons.size() < wagonNumber) {
            throw new WagonNotFoundException();
        }
        wagons.remove(wagonNumber - 1);
    }

    public void showTrain(PrintStream out) {
        if (wagons.isEmpty()) {
            out.println("Train has no wagons");
        } else {
            int maxAmountOfGoods = 0;
            for (int i = 0; i < wagons.size(); i++) {
                Wagon wagon = wagons.get(i);
                maxAmountOfGoods += wagon.getCap();

                out.println(String.format("%d - %s", i + 1, wagon.getnfo()));

            }
            out.println(String.format("Total capacity: %d",maxAmountOfGoods));
        }
    }
    private void checkName(String name)throws WagonNameAlreadyExistsException{
        boolean nameExists = wagons.stream().anyMatch(wagon -> wagon.hasName(name));
        if (nameExists) throw new WagonNameAlreadyExistsException();
    }
}


