import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BooleanSupplier;

public class Isogram {

	public boolean check(String input) {

		input = input.toLowerCase();
		input = input.replaceAll(" ","");
		input = input.replaceAll("-","");
		boolean k = true;
		List<String> s = new ArrayList<>();
		List<String> s2 = new ArrayList<>();
		
		int length = input.length();
		for (int i = 0; i < length ; i++) {
			s2.add(input.substring(i, i+1));
		}
		s = s2;
		int counter = 0;
		int size = s2.size();
		int size2 = s.size();
		String a;
		String b;
		for (int i = 0; i < size; i++) {
			counter =0;
			for (int j = 0; j < size2; j++) {
				a = s2.get(i);
				b = s.get(j);
				if(b.equals(a)) {
					counter++;
					if(counter > 1) {
						return false;
					}
				}
			}
			
		}
		return k;
	}

}







//input = input.toLowerCase();
//input = input.replaceAll(" ","");
//input = input.replaceAll("-","");
//int length = input.length();
//Set<Character> checker = new HashSet<>();
//for (int i = 0; i < length; i++) {
//	if(!checker.add(input.charAt(i))) {
//		return false;
//	}
//}
//
//return true;









