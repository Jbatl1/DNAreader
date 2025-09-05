import java.util.HashSet;

public class DNA {
    private String name;
    private String dna;
    private String rna;
    private String startSequence;
    private HashSet<String> endSequences;
    private int startIndex = -1;
    private int endIndex = -1;



    public DNA (String name, String dna, String startSequence, HashSet<String> endSequences) {
        this.name = name;
        this.dna = dna;
        this. startSequence = startSequence;
        this.endSequences = endSequences;
    }




    public void findEnd() {
        for (int i = 3; i < this.dna.length()-3; i+=3) {
            if (this.endSequences.contains(this.dna.substring(i, i+3).toUpperCase())) {
                this.endIndex = i+3;
            }
        }
    }


    public void findStart() {
        int startIndex = -1;
        for (int i = 0; i < this.dna.length()-3; i++) {
            if (this.dna.substring(i, i+3).equals(this.startSequence)) {
                this.startIndex = i;
            }
        }
    }

}
