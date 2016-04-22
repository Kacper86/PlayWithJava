package performance;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static performance.CollectionUtil.removeItemFromCollectionByReturningNewList;
import static performance.CollectionUtil.removeItemFromCollectionByUsingIteratorRemoveMethod;
import static performance.ListGenerator.generateList;

public class CollectionUtilRemoveOneElementTest {

	public static final int NUMBER_OF_ELEMENTS = 100000;
	public static final String SPECIAL_STRING = "a";


	@Test
	public void shouldRemoveItemFromCollectionByUsingIteratorRemoveMethod() {
		// arrange
		List<String> list = generateList(NUMBER_OF_ELEMENTS, 1, SPECIAL_STRING);

		// act
		removeItemFromCollectionByUsingIteratorRemoveMethod(list, SPECIAL_STRING);

		// assert
		assertEquals(NUMBER_OF_ELEMENTS - 1, list.size());
	}

	@Test
	public void shouldRemoveItemFromCollectionByUsingNewList() throws Exception {
		// arrange
		List<String> list = generateList(NUMBER_OF_ELEMENTS, 1, SPECIAL_STRING);

		// act
		list = removeItemFromCollectionByReturningNewList(list, SPECIAL_STRING);

		// assert
		assertEquals(NUMBER_OF_ELEMENTS - 1, list.size());
	}
}