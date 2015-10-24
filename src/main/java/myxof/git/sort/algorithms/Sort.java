package myxof.git.sort.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Sort {
	protected List<Integer> arrayInt = new ArrayList<Integer>();
	protected List<Double> arrayDoubles = new ArrayList<Double>();
	
	protected abstract void sortInt();
	protected abstract void sortDouble();
	
	protected void generateIntData(int num,int range) {
		Random random = new Random(System.currentTimeMillis());
		arrayInt.clear();
		for(int i = 0; i < num;i++){
			arrayInt.add(Math.abs(random.nextInt() % range));
		}
	}
	
	protected void generateDoubleData(int num) {
		Random random = new Random(System.currentTimeMillis());
		arrayDoubles.clear();
		for(int i = 0;i < num;i++){
			arrayDoubles.add(Math.abs(random.nextDouble()));
		}
	}
	
	protected void clear() {
		if(arrayDoubles != null) arrayDoubles.clear();
		if(arrayInt != null) arrayInt.clear();
	}
	
	public void addIntData(int data){
		arrayInt.add(data);
	}
	
	public void addDoubleData(double data){
		arrayDoubles.add(data);
	}
	
	public int getArrayInt(int index){
		if(index > arrayInt.size() - 1) return -1;
		return arrayInt.get(index);
	}
	
	public double getArrayDouble(int index){
		if(index > arrayDoubles.size() - 1) return -1;
		return arrayDoubles.get(index);
	}
	
	public void displayIntArray(){
		if(arrayInt == null){
			System.out.println("Int array is null!");
			return;
		}
		System.out.println("--------Int array--------");
		int len = arrayInt.size();
		for(int i = 0;i < len;i++){
			System.out.print(arrayInt.get(i));
			if(i == len-1){
				System.out.println("\n");
			}
			else{
				System.out.print(",");
			}
		}
	}
	
	public void displayDoubleArray(){
		if(arrayDoubles == null){
			System.out.println("Double array is null!");
			return;
		}
		System.out.println("--------Double array--------");
		int len = arrayDoubles.size();
		for(int i = 0;i < len;i++){
			System.out.print(arrayDoubles.get(i));
			if(i == len-1){
				System.out.println("\n");
			}
			else{
				System.out.print(",");
			}
		}
	}

	
	protected void exchangeIntArray(int index1,int index2){
		int tmp = arrayInt.get(index1);
		arrayInt.set(index1, arrayInt.get(index2));
		arrayInt.set(index2, tmp);
	}
	
	protected void exchangeDoubleArray(int index1,int index2){
		double tmp = arrayDoubles.get(index1);
		arrayDoubles.set(index1, arrayDoubles.get(index2));
		arrayDoubles.set(index2, tmp);
	}
}
