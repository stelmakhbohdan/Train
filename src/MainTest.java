import org.w3c.dom.Attr;

import java.lang.annotation.Target;
import java.util.Scanner;

public class MainTest {

    private static Scanner scanner = new Scanner(System.in);
    private static Train train =new Train();

    public static void main(String[] args) {


        boolean quit = false;
        printActions();
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    createPassangerWagon(scanner,train);
                    break;
                case 2:
                    createFreightWagon(scanner,train);
                    break;
                case 3:
                    createSpecialWagon(scanner,train);
                    break;
                case 4:
                    deleteWagon(scanner,train);
                    break;
                case 5:
                    showWagons(train);
                    break;
            }
        }
    }
    private static void printActions() {
        System.out.println("\nAvailable actions:\npress:");
        System.out.println("0  - to quit\n" +
                "1  - to create a passenger wagon\n" +
                "2  - to create a freight wagon\n" +
                "3  - to create a special wagon\n" +
                "4  - to delete a  wagon\n" +
                "5  - to show train");
        System.out.println("Choose your action: ");
    }
    private static void createPassangerWagon(Scanner scanner,Train train){
        System.out.println("Give a name for the wagon: ");
        String name = scanner.next();
        System.out.println("Give a maxNumOfPeople: ");
        int maxNumOfPeople = scanner.nextInt();
        System.out.println("Give a maxNumOfGoods: ");
        int maxNumOfGoods = scanner.nextInt();
        try {
        train.createPassangerWagon(name,maxNumOfPeople,maxNumOfGoods);
        }
        catch (WagonNameAlreadyExistsException e){
            System.err.println("Wagon name already exists");
        }
    }
    private static void createFreightWagon(Scanner scanner,Train train){
        System.out.println("Give a name for the wagon: ");
        String name = scanner.next();
        System.out.println("Give a maxAmountOfGoods: ");
        int maxAmountOfGoods =scanner.nextInt();
        System.out.println("Give a typeOfGoods: ");
        String typeOfGoods = scanner.next();
        try {
            train.createFreightWagon(name,maxAmountOfGoods,typeOfGoods);
        }
        catch (WagonNameAlreadyExistsException e){
            System.err.println(e.getMessage());
        }
    }
    private static void createSpecialWagon(Scanner scanner,Train train){
        System.out.println("Give a name for the wagon: ");
        String name = scanner.next();
        System.out.println("Give a descriptiveField: ");
        String descriptiveField = scanner.next();
        try {
        train.createSpecialWagon(name,descriptiveField);
        }catch (WagonNameAlreadyExistsException e){

        }
    }
    private static void deleteWagon(Scanner scanner,Train train){
        train.showTrain(System.out);
        System.out.println("Enter existing wagon n0: ");
        int wagonNumber = scanner.nextInt();
        try {
            train.deleteWagon(wagonNumber);
        }catch (WagonNotFoundException e){

        }
    }
    private static void showWagons(Train train){
        train.showTrain(System.out);
    }


}
