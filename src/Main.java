import com.basic.DNA;
import com.basic.DNACounter;

public class Main {
    public static void main(String[] args) {
        DNA dna = new DNA("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC");
        DNACounter DNACounter = new DNACounter(dna);
        System.out.println(DNACounter.count());
    }
}
