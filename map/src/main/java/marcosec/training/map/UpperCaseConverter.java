package marcosec.training.map;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class UpperCaseConverter
{
	public List<String> convert7(List<String> input)
	{
		List<String> result = new ArrayList<>();
		for (String s : input)
		{
			result.add(s.toUpperCase());
		}
		return result;
	}

	public List<String> convert(List<String> input)
	{
		return input.stream()
				.map(String::toUpperCase)
				.collect(toList());
	}
}
