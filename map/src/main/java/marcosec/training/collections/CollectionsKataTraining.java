package marcosec.training.collections;

import marcosec.training.data.Person;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

public class CollectionsKataTraining
{

	public List<String> convertToUpperCase(List<String> input)
	{
		return input.stream()
				.map(String::toUpperCase)
				.collect(toList());
	}

	public List<String> filterItemsLength(List<String> input)
	{
		return input.stream()
				.filter(item -> item.length() > 4)
				.collect(toList());
	}

	public List<String> flat(List<List<String>> input)
	{
		return input.stream()
				.flatMap(list -> list.stream())
				.collect(toList());
	}

	public Person oldestPerson(List<Person> input)
	{
		return input.stream()
				.max(Comparator.comparing(Person::getAge))
				.get();
	}

	public Integer sum(List<Integer> input)
	{
		return input.stream()
				.reduce(0, Integer::sum);
	}
}
