package Array;

public class Linearsearch {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i; //returning the index of the key
            }
        }
        return -1; //if key is not found, return -1
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 11;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOt found");
        }else{
            System.out.println("Key is found at index: " + index);
        }
    }
}
