import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;


public class DemoLD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		for (Integer integer : numbers) {
			out.println(integer);
		}
		
		numbers.forEach(System.out::println);
		numbers.stream().map(i -> i*2).forEach(System.out::println);
		numbers.forEach(System.out::println);
	}

}
