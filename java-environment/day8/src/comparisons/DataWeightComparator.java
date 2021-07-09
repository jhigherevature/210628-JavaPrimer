package comparisons;

import java.util.Comparator;

public class DataWeightComparator implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		if (o1.getWeight() > o2.getWeight()) {
			return 1;
		} else if (o1.getWeight() < o2.getWeight()) {
			return -1;
		} else {
			return 0;
		}
	}

}
