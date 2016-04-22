package performance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionUtil {

	public static void removeItemFromCollectionByUsingIteratorRemoveMethod(Collection<String> collection, String elementToBeRemoved) {

		Iterator iterator = collection.iterator();

		while (iterator.hasNext()) {
			String element = (String) iterator.next();

			if (element.equals(elementToBeRemoved)) {
				iterator.remove();
			}
		}
	}

	public static Collection<String> removeItemFromCollectionByReturningNewList(Collection<String> collection, String elementToBeRemoved) {

		Iterator iterator = collection.iterator();

		List<String> filteredCollection = new ArrayList<>();

		while (iterator.hasNext()) {
			String element = (String) iterator.next();

			if (!element.equals(elementToBeRemoved)) {
				filteredCollection.add(element);
			}
		}

		return filteredCollection;
	}

}
