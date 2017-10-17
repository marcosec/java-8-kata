package marcosec.training.collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import marcosec.training.data.Person;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

public class CollectionsKataTrainingTest
{

	private CollectionsKataTraining training;

	@Before
	public void setup()
	{

		training = new CollectionsKataTraining();
	}

	@Test
	public void shouldConvertListToUpperCase()
	{

		List<String> input = Arrays.asList("a", "ab", "aBc");

		assertThat(training.convertToUpperCase(input), hasItems("A", "AB", "ABC"));
		assertThat(training.convertToUpperCase(input), not(hasItems("a", "ab", "aBc")));

	}

	@Test
	public void shouldFilterItemsLongerThan4Characters()
	{

		List<String> input = Arrays.asList("verylong", "foo", "fair");

		assertThat(training.filterItemsLength(input), hasItems("verylong"));
		assertThat(training.filterItemsLength(input), not(hasItems("foo", "fair")));

	}

	@Test
	public void shouldFlattenACollection()
	{

		List<List<String>> input = Arrays.asList(Arrays.asList("verylong"), Arrays.asList("foo", "fair"));

		assertThat(training.flat(input), hasItems("verylong","foo","fair"));
	}

	@Test
	public void shouldGetOldestPerson()
	{
		Person oldest = new Person("Alice",40);
		Person mid = new Person("Bob",10);
		Person youngest = new Person("Charlie",2);


		List<Person> input = Arrays.asList(oldest,mid,youngest);

		assertThat(training.oldestPerson(input), equalTo(oldest));
	}

	@Test
	public void shouldSumItemsOfAList()
	{

		List<Integer> input = Arrays.asList(10,20,30);

		assertThat(training.sum(input), equalTo(60));
	}

	@Test
	public void shouldGetNamesOfPersonUnderAge18()
	{
		Person oldest = new Person("Alice",40);
		Person mid = new Person("Bob",10);
		Person youngest = new Person("Charlie",2);


		List<Person> input = Arrays.asList(oldest,mid,youngest);

		assertThat(training.getLegalPersonsName(input), hasItems("Bob","Charlie"));

	}

	@Test
	public void shouldGetPersonsAverageAge()
	{
		Person oldest = new Person("Alice",40);
		Person mid = new Person("Bob",10);
		Person youngest = new Person("Charlie",2);


		List<Person> input = Arrays.asList(oldest,mid,youngest);

		assertThat(training.averageAge(input), equalTo(17.3));

	}
}
