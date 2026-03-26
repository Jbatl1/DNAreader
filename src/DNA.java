import java.util.HashSet;

public class DNA {
    private String name;
    private String dna;
    private String rna;
    private String startSequence;
    private HashSet<String> endSequences;
    private int startIndex;
    private int endIndex = -1;
    private int numSpaces;



    public DNA (String name, String dna, String startSequence, HashSet<String> endSequences) {
        this.name = name;
        this.dna = dna;
        this. startSequence = startSequence;
        this.endSequences = endSequences;
        this.startIndex = this.dna.indexOf(this.startSequence);
        getNumSpaces();
        findEnd();
    }

    public void findEnd() {
        for (String s : this.endSequences) {
            if (this.dna.substring(startIndex).contains(s) && this.dna.substring(startIndex).indexOf(s) % 3 == 0) {
                this.endIndex = this.dna.substring(startIndex).indexOf(s);
            }
        }
    }
    public void getNumSpaces() {
        int numSpaces = 0;
        for (int i = 0; i < startIndex; i++) {
            if (dna.charAt(i) == ' ' || String.valueOf(dna.charAt(i)).matches("[0-9]") ) numSpaces++;
        }
        this.numSpaces = numSpaces;
    }


    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "dna: " + this.dna + "\n" +
                "Start Index: " + (this.startIndex-numSpaces+1) + "\n" +
                "End Index: " + this.endIndex + "\n";
    }
}
