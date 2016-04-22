package performance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static performance.CollectionUtil.removeItemFromCollectionByReturningNewList;
import static performance.CollectionUtil.removeItemFromCollectionByUsingIteratorRemoveMethod;

public class CollectionUtilTest {

	public static final int NUMBER_OF_ELEMENTS = 100000;

	private List<String> names = new ArrayList<>();


	@Test
	public void testRemoveItemFromCollectionByUsingIteratorRemoveMethod() {
		// arrange
		names = generateNames(NUMBER_OF_ELEMENTS);

		// act
		removeItemFromCollectionByUsingIteratorRemoveMethod(names, "a");

		// assert
		System.out.print(names.size());
		assertTrue(names.size() == NUMBER_OF_ELEMENTS / 2);
	}

	@Test
	public void removeItemFromCollectionByUsingNewList() throws Exception {
		// arrange
		names = generateNames(NUMBER_OF_ELEMENTS);

		// act
		Collection<String> filteredCollection = removeItemFromCollectionByReturningNewList(names, "a");

		// assert
		System.out.print(filteredCollection.size());
		assertTrue(filteredCollection.size() == NUMBER_OF_ELEMENTS / 2);
	}

	private List<String> generateNames(int n) {
		List<String> names = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				names.add("a");
			} else {
				names.add("b");
			}
		}
		return names;
	}
}