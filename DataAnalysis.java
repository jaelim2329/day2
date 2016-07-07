import java.util.Scanner;
import java.util.Arrays;

public class DataAnalysis {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		boolean validNumber = true;
		int value = 0;
		do{
			System.out.println("How many data items?");
			try{
				value = Integer.parseInt(sc.nextLine());
				validNumber = true;
			} catch(Exception e){
				System.out.println("Invalid entry, must be an eligible int.");
				validNumber = false;
			}
		} while(!validNumber);

		int[] items = new int[value];
		int itemCount = 0;
		do{
			System.out.println("Please enter valid data items for index: " + itemCount);
			try{
				value = Integer.parseInt(sc.nextLine());
				items[itemCount] = value;
				itemCount ++;
			} catch(Exception e){
				System.out.println("Invalid input, try again.");
			}
		} while(itemCount < items.length);

		Arrays.sort(items); //For easier way to get minimum and maximum

		int sum = 0;
		for(int values : items)
			sum += values;

		System.out.printf("The mean of the data is: %f\n", 1.0 * sum/items.length);

		System.out.printf("The minimum is: %d, the maximum is %d\n", items[0], items[items.length-1]);
	}
}