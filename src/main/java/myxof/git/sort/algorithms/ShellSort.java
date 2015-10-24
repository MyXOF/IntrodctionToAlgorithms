package myxof.git.sort.algorithms;

public class ShellSort extends Sort{

	@Override
	protected void sortInt() {
		int len = arrayInt.size();
		int gap = 1;
		while(gap < len / 3){
			// < O(n^()3/2) by Kunth 1973; 1,4,13,40...
			gap = gap * 3 + 1;
		}
		for(; gap > 0; gap  /= 3){
			for(int i = gap; i < len;i++){
				int tmp = arrayInt.get(i);
				int j;
				for(j = i - gap; j >= 0 && arrayInt.get(j) > tmp;j -= gap){
					arrayInt.set(j+gap, arrayInt.get(j));
				}
				arrayInt.set(j+gap, tmp);
			}
		}
	}

	@Override
	protected void sortDouble() {		
	}

}
