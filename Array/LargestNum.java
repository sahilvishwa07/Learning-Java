package Array;

public class LargestNum{
    public static int  getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                    largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest value is : " + smallest);
        return largest;

    }
    public static void main(String[] args) {
        int numbers[] = {16, 12, 3, 4, 5, 6};
        System.out.println("Largest value is : " + getLargest(numbers));
    }
}
