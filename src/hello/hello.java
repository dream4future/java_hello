package hello;

public class hello{
	
	public static void main(String args[]) {
//		My phone number is
		int[] arr= new int[] {9,5,2,3,0,1,6};
		int[] index= new int[] {4,5,4,3,0,2,1,3,3,6,3};
		
		String tel="";
		
		for (int i:index) {
			tel+=arr[i];
		}
		
		System.out.println(tel);;
	}
}
