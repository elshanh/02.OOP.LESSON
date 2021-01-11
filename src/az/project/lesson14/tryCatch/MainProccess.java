package az.project.lesson14.tryCatch;

public class MainProccess {
	
	public static void main(String[] args) {
		
		int [] numbers = new int[5];
		
		for (int i = 0; i < numbers.length; i ++) {
			numbers[i] = 10 * (i+1);
		}
		
		for (int i = 0; i < numbers.length+1; i ++) {
			try {
				System.out.println("Number " + numbers[i]);
			} catch (Exception e) {
				System.out.println("Number not found");
			}
		}		
	}

}
