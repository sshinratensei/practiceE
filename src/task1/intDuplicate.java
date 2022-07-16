package task1;

import java.util.ArrayList;

public class intDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> duplicate = new ArrayList<>();
        int integ = 0;
        int counter = 0;
        duplicate.add(99);
        duplicate.add(99);
        for (int c = 1; c <= 98; c++){
            duplicate.add(c);
        }
        for(int i = 0; i< duplicate.size() - 1; i++) {
            for(int j= i + 1; j < duplicate.size(); j++) {
                if (duplicate.get(i).equals(duplicate.get(j))) {
                    counter++;
                    integ = duplicate.get(j);
                }
            }

        }
        System.out.println(duplicate);
        System.out.println("Repetitions: " + counter);
        System.out.println("Int that repeats: " + integ);
    }
}
