public class PassengerCar extends Wagon {

    public int maxNumOfPeople;
    public int maxNumOfGoods;


    public PassengerCar(String train, int maxNumOfPeople, int maxNumOfGoods) {
        super(train);
        this.maxNumOfPeople = maxNumOfPeople;
        this.maxNumOfGoods = maxNumOfGoods;
    }


    @Override
    public String getnfo() {
        return String.format("PassangerWagon: %s, passangers: %d , goods: %d",name,maxNumOfPeople,maxNumOfGoods
                );
    }

    @Override
    public int getCap() {
        return maxNumOfGoods;
    }
}
