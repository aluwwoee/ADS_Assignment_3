import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(101); // Larger M for better distribution
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(100000);
            String name = "Name" + rand.nextInt(100000);
            MyTestingClass key = new MyTestingClass(id, name);
            Student value = new Student("Student" + rand.nextInt(100000));
            table.put(key, value);
        }

        int[] sizes = table.getBucketSizes();
        for (int i = 0; i < sizes.length; i++) {
            System.out.println("Bucket " + i + ": " + sizes[i] + " elements");
        }
    }
}
