package performance;

import java.util.ArrayList;
import java.util.List;

class ListGenerator {

	public static List<String> generateList(int size, int specialCharacterCount, String character) {
		List<String> names = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			if (i < specialCharacterCount) {
				names.add(character);
			} else {
				names.add("b");
			}
		}
		return names;
	}

	public static List<String> generateList2(int n) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (i == 0) {
				list.add("a");
			} else {
				list.add("b");
			}
		}
		return list;
	}

}
