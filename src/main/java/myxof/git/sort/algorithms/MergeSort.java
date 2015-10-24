package myxof.git.sort.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSort extends Sort{
	private List<Integer> listTmp;
	
	@Override
	protected void sortInt() {
		int len = arrayInt.size();
		listTmp = new ArrayList<Integer>();
		for(int i = 0;i < len;i++){
			listTmp.add(0);
		}
		topDownSplitMerge(0, len);
	}

	@Override
	protected void sortDouble() {
		
	}
	
	private void topDownSplitMerge(int start,int end){
		if(end - start < 2){
			return;
		}
		int mid = start + (end - start) / 2;
		topDownSplitMerge(start, mid);
		topDownSplitMerge(mid, end);
		topDownMerge(start, mid, end);
		copyArray(start, end);
	}

	private void topDownMerge(int start,int mid,int end){
		int index1 = start;
		int index2 = mid;
		for(int i = start;i < end;i++){
			if(index1 < mid && (index2 >= end || arrayInt.get(index1) <= arrayInt.get(index2))){
				listTmp.set(i, arrayInt.get(index1));
				index1++;
			}
			else{
				listTmp.set(i, arrayInt.get(index2));
				index2++;
			}
		}
	}
	
	private void copyArray(int start,int end){
		for(int i = start;i < end;i++){
			arrayInt.set(i, listTmp.get(i));
		}
	}
}
