import com.basic.DNACounter;
import com.basic.DNA;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DNANucleotidesTest {
    @org.junit.Test
    public void shouldGiveNumberOfCharactersInACGTOrcder() throws Exception {
        DNA dna = new DNA("ATGCTTCAGAAAGGTCTTACG");
        DNACounter DNACounter = new DNACounter(dna);
        assertThat(DNACounter.count(), is("6 4 5 6"));
    }

    @Test
    public void shoulGiveRightOutputForSampleData() throws Exception {
        DNA dna = new DNA("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC");
        DNACounter DNACounter = new DNACounter(dna);
        assertThat(DNACounter.count(), is("20 12 17 21"));
    }
}
