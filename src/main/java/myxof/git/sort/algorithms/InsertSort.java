package myxof.git.sort.algorithms;

public class InsertSort extends Sort{

	@Override
	protected void sortInt() {
		int len = arrayInt.size();
		for(int i = 1; i < len;i++){
			int j = i;
			while(j > 0 && arrayInt.get(j) < arrayInt.get(j-1)){
				exchangeIntArray(j-1, j);
				j--;
			}
		}
	}

	@Override
	protected void sortDouble() {
		int len = arrayDoubles.size();
		for(int i = 1; i < len;i++){
			int j = i;
			while(j > 0 && arrayDoubles.get(j) < arrayDoubles.get(j-1)){
				exchangeDoubleArray(j-1, j);
				j--;
			}
		}
	}

	
}
