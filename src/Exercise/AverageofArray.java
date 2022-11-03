package Exercise;

public class AverageofArray {
    public static void main(String[] args) {
        int[] marks = {77, 74, 87, 90, 92};

        int total = 0;

        for (int mark : marks) {
            total=total+mark;
        }
        int size =marks.length;
        double average=total/size;

        System.out.println("Average of marks is :" + average);
    }
}
