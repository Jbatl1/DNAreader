import java.util.HashSet;

public class DNA {
    private String name;
    private String dna;
    private String rna;
    private String startSequence;
    private HashSet<String> endSequences;
    private int startIndex;
    private int endIndex = -1;



    public DNA (String name, String dna, String startSequence, HashSet<String> endSequences) {
        this.name = name;
        this.dna = dna;
        this. startSequence = startSequence;
        this.endSequences = endSequences;
        this.startIndex = this.dna.indexOf(this.startSequence);
        findEnd();
    }




    public void findEnd() {
        for (String s : this.endSequences) {
            if (this.dna.substring(startIndex).contains(s) && this.dna.substring(startIndex).indexOf(s) % 3 == 0) {
                this.endIndex = this.dna.substring(startIndex).indexOf(s);
            }
        }
    }
}
