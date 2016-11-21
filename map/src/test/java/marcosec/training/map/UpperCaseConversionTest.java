package marcosec.training.map;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UpperCaseConversionTest
{
	@Test
	public void shouldConvertListToUpperCase_java7()
	{
		UpperCaseConverter converter = new UpperCaseConverter();

		List<String> input = Arrays.asList("a", "ab", "aBc");

		assertThat(converter.convert(input), hasItems("A", "AB", "ABC"));
		assertThat(converter.convert(input), not(hasItems("a", "ab", "aBc")));

	}
}
