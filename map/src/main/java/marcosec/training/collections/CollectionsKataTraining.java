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
}
