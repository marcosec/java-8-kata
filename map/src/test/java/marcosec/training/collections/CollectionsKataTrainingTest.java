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
	public void shouldConvertListToUpperCase()
	{
		CollectionsKataTraining training = new CollectionsKataTraining();

		List<String> input = Arrays.asList("a", "ab", "aBc");

		assertThat(training.convertToUpperCase(input), hasItems("A", "AB", "ABC"));
		assertThat(training.convertToUpperCase(input), not(hasItems("a", "ab", "aBc")));

	}

	@Test
	public void shouldFilterItemsLongerThan4Characters()
	{
		CollectionsKataTraining training = new CollectionsKataTraining();

		List<String> input = Arrays.asList("verylong", "foo", "fair");

		assertThat(training.filterItemsLength(input), hasItems("verylong"));
		assertThat(training.filterItemsLength(input), not(hasItems("foo", "fair")));

	}

	@Test
	public void shouldFlattenACollection()
	{
		CollectionsKataTraining training = new CollectionsKataTraining();

		List<List<String>> input = Arrays.asList(Arrays.asList("verylong"), Arrays.asList("foo", "fair"));

		assertThat(training.flat(input), hasItems("verylong","foo","fair"));
	}
}
