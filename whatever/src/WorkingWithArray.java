
public class WorkingWithArray {

    public static void main(String[] args) {
       int[] numbers = new int[5];
       numbers[0] = 9;
       numbers[1] = numbers[0];
       for (int i : numbers) {
        System.out.println(i);
    }
    } 

}
