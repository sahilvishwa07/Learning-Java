package Array;

public class Argument {
    public static void update( int marks[], int NonChangable){
        NonChangable = 19;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] +1;
            }
    }
    public static void main(String[] args) {
        int marks[] = {97, 98 ,65};
        int NonChangable = 51;
        update(marks, NonChangable);
        System.out.println(NonChangable);

        for(int i=0; i<marks.length; i++){
            System.out.println( marks[i] + " ");
        }
        System.out.println();
    }
}
