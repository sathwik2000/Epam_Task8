package mypackage;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
public class Startsa {
	public static List<String> StartsaLen3(List<String> s){
		return Startsa.collectingFunction(s,(String s1) -> s1.charAt(0)=='a', (String s1) ->s1.length()==3);
	}
	
	public static List<String> collectingFunction(List<String> s,Predicate<String> predicate1, Predicate<String> predicate2){
		List<String >finalStrings = new ArrayList<>();
		s.stream().forEach(x -> {if(predicate2.test(x))
			if(predicate1.test(x))
			finalStrings.add(x);});
		return finalStrings;
	}
}
