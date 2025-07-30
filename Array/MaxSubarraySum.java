package Array;


public class MaxSubarraySum {

    //BRUTE FORCE


    // public static void MaxsumSubarray(int numbers[]){
    //     int currsum = 0;
    //     int maxsum = Integer.MIN_VALUE;

    //     for(int i=0; i<numbers.length; i++){
    //         int start = i;
    //         for( int j=i; j<numbers.length; j++){
    //             int end = j;
    //             currsum = 0;
    //             for(int k=start; k<=end; k++){
    //                 currsum += numbers[k];
    //             }
    //             System.out.println(currsum);
    //             if(maxsum < currsum) {
    //                 maxsum = currsum;
    //             }
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Max Sum = " + maxsum);
    // }


    //PREFIX SUM

    // public static void PrefixSum(int numbers[]){
    //     int currsum = 0;
    //     int Maxsum = Integer.MIN_VALUE;
    //     int prefix[] = new int [numbers.length];

    //     prefix[0] = numbers[0];
    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + numbers[i];
    //     }

    //     for(int i=0; i< numbers.length; i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;

    //             currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

    //             if(Maxsum < currsum){
    //                 Maxsum = currsum;
    //             }
    //         }
    //     }
    //     System.out.println("Max sum = " + Maxsum);
    // }

    public static void Kadane(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our Max Sub Array Sum is : " + ms);

    }
    public static void main(String[] args) {
        int numbers[] = {-2, -3 ,4 ,-1 ,-2 ,1 ,5 ,-3};  //{2, 4, 6, 8, 10};
        Kadane(numbers);
    }
    
}
