package cinema;

import java.util.ArrayList;

public class ViewerStatistics {
	public static double averageAge(ArrayList<Viewer> viewers) {
		int ageSum = 0;
		int count = 0;
		double result = 0;
		
		if(viewers != null)
			for(Viewer viewer : viewers)
				if(viewer != null) {
					ageSum += viewer.getAge();
					count++;
				}
		if(count != 0) result = ageSum / count;
		
		return result;
	}
}
