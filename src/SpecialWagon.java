import java.util.ArrayList;
import java.util.List;

public class SpecialWagon extends Wagon{

    public String descriptiveField;

    public SpecialWagon(String name, String descriptiveField) {
        super(name);
        this.descriptiveField = descriptiveField;
    }

    @Override
    public String getnfo() {
        return String.format("PassangerWagon: %s, field: %s",name,descriptiveField);
    }

}
