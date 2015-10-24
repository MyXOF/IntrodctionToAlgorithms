package myxof.git.sort.algorithms;

import java.util.Random;

public class QuickSort extends Sort{

	@Override
	protected void sortInt() {
		randomIntQuickSort(0, arrayInt.size()-1);
	}

	@Override
	protected void sortDouble() {
		randomDoubleQucikSort(0,arrayDoubles.size()-1);
	}
	
	private void randomIntQuickSort(int start,int end){
		if(start < end){
			int mid = randomIntParition(start, end);
			randomIntParition(start, mid-1);
			randomIntParition(mid+1, end);
		}
	}
	
	private int randomIntParition(int start, int end) {
		Random random = new Random(System.currentTimeMillis());
		int mid = Math.abs(random.nextInt()) % (end - start+1) + start;
		exchangeIntArray(mid, end);
		return intPartition(start,mid);
	}
	
	private int intPartition(int start, int end){
		int pivot = arrayInt.get(end);
		int i = start-1;
		for(int j = start; j < end;j++){
			if(arrayInt.get(j) <= pivot){
				i++;
				exchangeIntArray(i, j);
			}
		}
		exchangeIntArray(i+1, end);
		return i+1;
	}

	private void randomDoubleQucikSort(int start,int end){
		if(start < end){
			int mid = randomDoubleParition(start, end);
			randomDoubleQucikSort(start, mid-1);
			randomDoubleQucikSort(mid+1, end);
		}
	}

	private int randomDoubleParition(int start, int end){
		Random random = new Random(System.currentTimeMillis());
		int mid = Math.abs(random.nextInt()) % (end - start+1) + start;
		exchangeDoubleArray(mid, end);
		return doublePartition(start,mid);
	}
	
	private int doublePartition(int start, int end){
		double pivot = arrayDoubles.get(end);
		int i = start-1;
		for(int j = start; j < end;j++){
			if(arrayDoubles.get(j) <= pivot){
				i++;
				exchangeDoubleArray(i, j);
			}
		}
		exchangeDoubleArray(i+1, end);
		return i+1;
	}

}
