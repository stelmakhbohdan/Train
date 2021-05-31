public abstract class Wagon {

    protected String name;

    public Wagon(String name) {
        this.name = name;
    }
    public abstract String getnfo();
    public int getCap(){
        return 0;
    }
    public boolean hasName(String name){
        return this.name.equalsIgnoreCase(name);
    }

}
