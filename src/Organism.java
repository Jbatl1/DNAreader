import java.util.ArrayList;
public class Organism {
    private String name;
    private String DNA;
    private ArrayList<DNA> DNAs = new ArrayList<>();

    Organism(String name) {
        this.name = name;
    }

    public ArrayList<DNA> getDNAs() {
        return DNAs;
    }

    public void setDNAs(ArrayList<DNA> DNAs) {
        this.DNAs = DNAs;
    }
}
