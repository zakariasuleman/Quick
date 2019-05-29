import java.util.Scanner;
/**
 A program that implements an array of 1000 elements. Fill the array with randomly generated integer values between 0 and 1000. Prompt
 user to enter an integer value (target value) between 0 and 1000 (non-inclusive). Then print the number of times (occurrences)
 the target value occurs in the array, otherwise print ("Value *target value* does not exist in the array")


 @author: Zakaria Suleman
 @version: 1.0
 @since: 05/28/2019
 */
public class ThousandArray {

    public static void main(String[] args) {
        ThousandArray ta = new ThousandArray();
        ta.generateRandomArray();
    }
    /**
     * Generates and fills an array of 1000 elements also prompts user to enter an integer value between 0-1000 and checks if it occurs
     * in the 1000 elements randomly generated array
     */
    public void generateRandomArray(){

        int[] array = new int[1000];
        for(int i = 0; i < array.length; i++){
            array[i]= (int)(Math.random()*1000);
        }
            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter an integer value between 0 and 999");
            int target = input.nextInt();
            int occurs = 0;
            for(int i = 0; i<array.length; i++){
                if(target==array[i]){
                    occurs++;
                }
            }
            if(occurs>0&&occurs!=1){
                System.out.println("Value: "+target+" "+"appears "+occurs+" "+"times!");
            }
            else if(occurs==1){
                System.out.println("Value: "+target+" "+"appears "+occurs+" "+"time!");
            }
            else{
                System.out.println("Value: "+target+" "+"does not appear!");
                generateRandomArray();
            }
    }
}
