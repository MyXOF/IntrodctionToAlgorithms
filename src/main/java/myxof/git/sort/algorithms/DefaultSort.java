package myxof.git.sort.algorithms;

import java.util.Collections;

public class DefaultSort extends Sort{
	@Override
	protected void sortInt() {
		// TODO Auto-generated method stub
		Collections.sort(arrayInt);
	}

	@Override
	protected void sortDouble() {
		// TODO Auto-generated method stub
		Collections.sort(arrayDoubles);
	}


}
