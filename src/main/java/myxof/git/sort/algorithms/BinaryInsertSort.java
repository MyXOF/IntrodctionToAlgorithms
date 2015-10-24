package myxof.git.sort.algorithms;

public class BinaryInsertSort extends Sort{

	@Override
	protected void sortInt() {
		int len = arrayInt.size();
		for(int i = 1; i < len;i++){
			int low = 0;
			int hight = i - 1;
			int tmp = arrayInt.get(i);
			int mid = bianrySearch(low, hight, tmp);
			int j = 0;
			if(mid == i) continue;
			for(j = i; j > mid;j--){
				arrayInt.set(j, arrayInt.get(j-1));
			}
			arrayInt.set(mid, tmp);
			
		}
	}

	@Override
	protected void sortDouble() {
		
	}

	private int bianrySearch(int low,int hight,int value){
		while(low <= hight){
			int mid = low + ((hight - low) >> 1);
			if(arrayInt.get(mid) < value && value <= arrayInt.get(mid+1)){
				return mid + 1;
			}
			else if(arrayInt.get(mid) < value){
				low = mid + 1;
			}
			else{
				hight = mid - 1;
			}
		}
		return low;
	}
}
