public class FreightWagon extends Wagon{

    public int maxAmountOfGoods;
    public String typeOfGoods;

    public FreightWagon(String name, int maxAmountOfGoods, String typeOfGoods) {
        super(name);
        this.maxAmountOfGoods = maxAmountOfGoods;
        this.typeOfGoods = typeOfGoods;
    }

    @Override
    public String getnfo() {
        return String.format("PassangerWagon: %s , goods: %d , typeOfGoods: %s",
                name,maxAmountOfGoods,typeOfGoods);
    }

    @Override
    public int getCap() {
        return maxAmountOfGoods;
    }
}
