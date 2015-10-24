package myxof.git.sort.algorithms;

public class BubbleSort extends Sort{

	@Override
	protected void sortInt() {
		int len = arrayInt.size();
		for(int i = 0;i < len;i++){
			boolean isSwap = false;
			for(int j = len - 1;j > i;j--){
				if(arrayInt.get(j) < arrayInt.get(j-1)){
					exchangeIntArray(j, j-1);
					isSwap = true;
				}
			}
			if(!isSwap){
				break;
			}
		}
	}

	@Override
	protected void sortDouble() {
		
	}

}
