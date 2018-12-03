import java.util.*;
public class Test {
public static void main(String[] args) {
	
	int arr1[] = {1,2,5,5,8,9,7,10,12,14};
	int arr2[] = {1,0,6,15,6,4,7,0,12,15};
	
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
			System.out.println(arr1[i]+ " ");
			}
		}
			
	}
	
	
}
}