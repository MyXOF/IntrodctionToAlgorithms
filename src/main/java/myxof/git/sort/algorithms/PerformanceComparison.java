package myxof.git.sort.algorithms;

import java.util.Random;

public class PerformanceComparison {

	public static void main(String[] args) {
		final int num = 1000000;
		
		BinaryInsertSort binaryInsertSort = new BinaryInsertSort();
		BubbleSort bubbleSort = new BubbleSort();
		DefaultSort defaultSort = new DefaultSort();
		HeapSort heapSort = new HeapSort();
		InsertSort insertSort = new InsertSort();
		MergeSort mergeSort = new MergeSort();
		QuickSort quickSort = new QuickSort();
		ShellSort shellSort = new ShellSort();
		
		for(int i = 0;i < num;i++){
			int n = gengerateRandomNumber(1000000);
//			binaryInsertSort.addIntData(n);
//			bubbleSort.addIntData(n);
			defaultSort.addIntData(n);
			heapSort.addIntData(n);
//			insertSort.addIntData(n);
			mergeSort.addIntData(n);
			quickSort.addIntData(n);
			shellSort.addIntData(n);
		}
		long startTime,endTime;
		
//		startTime = System.currentTimeMillis();
//		binaryInsertSort.sortInt();
//		endTime = System.currentTimeMillis();
//		displayTime(startTime, endTime, "BinarySort");
//		binaryInsertSort.clear();
		
//		startTime = System.currentTimeMillis();
//		bubbleSort.sortInt();
//		endTime = System.currentTimeMillis();
//		displayTime(startTime, endTime, "bubbleSort");
//		bubbleSort.clear();
//
		startTime = System.currentTimeMillis();
		defaultSort.sortInt();
		endTime = System.currentTimeMillis();
		displayTime(startTime, endTime, "defaultSort");
		defaultSort.clear();
//		
		startTime = System.currentTimeMillis();
		heapSort.sortInt();
		endTime = System.currentTimeMillis();
		displayTime(startTime, endTime, "heapSort");
		heapSort.clear();
		
//		startTime = System.currentTimeMillis();
//		insertSort.sortInt();
//		endTime = System.currentTimeMillis();
//		displayTime(startTime, endTime, "insertSort");
//		insertSort.clear();
//		
		startTime = System.currentTimeMillis();
		mergeSort.sortInt();
		endTime = System.currentTimeMillis();
		displayTime(startTime, endTime, "mergeSort");
		mergeSort.clear();
		
		startTime = System.currentTimeMillis();
		quickSort.sortInt();
		endTime = System.currentTimeMillis();
		displayTime(startTime, endTime, "quickSort");
		quickSort.clear();
		
		startTime = System.currentTimeMillis();
		shellSort.sortInt();
		endTime = System.currentTimeMillis();
		displayTime(startTime, endTime, "shellSort");
		shellSort.clear();

	}
	
	private static int gengerateRandomNumber(int range){
		Random random = new Random(System.nanoTime());
		return Math.abs(random.nextInt() % range);
	}

	private static void displayTime(long startTime,long endTime,String name){
		System.out.println(name + ": use "+ (endTime - startTime) + " ms");
	}
}
