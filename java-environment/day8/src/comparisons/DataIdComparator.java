package comparisons;

import java.util.Comparator;

public class DataIdComparator implements Comparator<Data> {
	@Override
	public int compare(Data o1, Data o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}
