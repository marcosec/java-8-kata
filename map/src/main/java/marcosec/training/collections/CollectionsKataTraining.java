package marcosec.training.collections;

import static java.util.stream.Collectors.toList;

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
}
