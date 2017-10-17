package marcosec.training.collections;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CollectionsKataTrainingTest
{
	@Test
	public void shouldConvertListToUpperCase_java7()
	{
		CollectionsKataTraining training = new CollectionsKataTraining();

		List<String> input = Arrays.asList("a", "ab", "aBc");

		assertThat(training.convertToUpperCase(input), hasItems("A", "AB", "ABC"));
		assertThat(training.convertToUpperCase(input), not(hasItems("a", "ab", "aBc")));

	}
}
