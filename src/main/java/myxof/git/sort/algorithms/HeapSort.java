package myxof.git.sort.algorithms;

public class HeapSort extends Sort{

	@Override
	protected void sortInt() {
		buildMinHeap();
		sortHeap();
	}

	@Override
	protected void sortDouble() {
		
	}
	
	private void buildMinHeap(){
		int len = arrayInt.size();
		for(int i = (len / 2); i >= 0;i--){
			maxHeapify(len, i);
		}
		
	}
	
	private void sortHeap(){
		for(int i = arrayInt.size() - 1; i > 0;i--){
			exchangeIntArray(0, i);
			maxHeapify(i, 0);		
		}
	}
	
	private void maxHeapify(int heapSize,int index){
		int leftChild = getLeftChild(index);
		int rightChild = getRightChild(index);
		
		int smallest = index;
		if(leftChild < heapSize && arrayInt.get(index) < arrayInt.get(leftChild)){
			smallest = leftChild;
		}
		if(rightChild < heapSize && arrayInt.get(smallest) < arrayInt.get(rightChild)){
			smallest = rightChild;
		}
		if(smallest != index){
			exchangeIntArray(smallest, index);
			maxHeapify(heapSize, smallest);
		}
	}

	private static int getLeftChild(int index){
		return (index << 1) + 1;
	}
	
	private  static int getRightChild(int index){
		return (index << 1) + 2;
	}
//	
//	private static int getParentIndex(int index){
//		return (index - 1) >> 1;
//	}
	
}
