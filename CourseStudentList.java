import java.util.*;
public class CourseStudentList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        
        students.add("Akash");
        students.add("Rahul");
        students.add("Priya");
        students.add("Anil");
        students.add("Sneha");

        System.out.println("Student List:");
        System.out.println(students);


                System.out.println("\nStudents using Iterator:");

        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


                iterator = students.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.equals("Rahul")) {
                iterator.remove();
            }
        }

        System.out.println("\nAfter removing Rahul:");
        System.out.println(students);


                ListIterator<String> listIterator =
                students.listIterator();

        System.out.println("\nForward Direction:");

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }


               System.out.println("\nReverse Direction:");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }


                listIterator = students.listIterator();

        while (listIterator.hasNext()) {
            String name = listIterator.next();

            if (name.equals("Priya")) {
                listIterator.set("Priyanka");
            }
        }

        System.out.println("\nAfter updating Priya:");
        System.out.println(students);
    }
}