import com.basic.DNA;
import com.basic.DNAToRNAConvertor;
import com.basic.RNA;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DNAToRNAConvertorTest {
    @Test
    public void ShouldConvertDNAToRNA() throws Exception {
        DNA dna = new DNA("GATGGAACTTGACTACGTAAATT");
        DNAToRNAConvertor dnaToRNAConvertor = new DNAToRNAConvertor(dna);

        RNA rna = new RNA("GAUGGAACUUGACUACGUAAAUU");

        assertTrue(dnaToRNAConvertor.getRNA().getRNAString().equals(rna.getRNAString()));

    }
}
