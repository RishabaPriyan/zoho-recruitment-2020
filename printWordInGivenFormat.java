import java.util.Scanner;

public class printWordInGivenFormat {

	public static void main(String[] args) {
		String enteredString = "";
		String resultString = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a text");
		enteredString = in.nextLine();
		
		char [] cArr = enteredString.toCharArray();
		int arrayLen = cArr.length;
		int middle = cArr.length / 2;
		int counter = 0;
		
		for(int i = middle ; i < arrayLen; i++) {
			resultString += cArr[i];
		}
		for(int j = 0 ; j < middle; j++) {
			resultString += cArr[j];
		}
		System.out.println("Output :"+resultString);
		
		while(counter < arrayLen) {
			for(int i = 0 ,gap = arrayLen-2; i < arrayLen;  gap-- ) {
				if(counter < gap) {
					System.out.print(" ");
				}else {
					System.out.print(resultString.charAt(i));
					i++;
				}
			}
			counter++;
			System.out.println();
		}
	}

}
