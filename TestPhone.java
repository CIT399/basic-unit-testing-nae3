import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestPhone {
	public String tooShort = "123456";
	public String wrongFormat = "(570)1234567";
	public String correctFormat = "(570)123-4567";
	public String unformatted = "0123456789";
	
	@Test
	public void testFormat() {
		assertFalse(Telephone.isFormatted(wrongFormat), "wrongFormat is not formatted correctly");
	}
	
	@Test
	public void formatResults() {
		assertEquals("(012)345-6789",Telephone.format(unformatted) , "Result should be (012)345-6789");
	}
	
	@Test
	public void unformatResults() {
		assertEquals("5701234567", Telephone.unformat(correctFormat), "Result should be 5701234567");
	}
	
}
