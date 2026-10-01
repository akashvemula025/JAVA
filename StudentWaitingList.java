import java.util.*;
public class StudentWaitingList {
    public static void main(String[] args) {

        
        ArrayList<String> students = new ArrayList<>();

        students.add("Akash");
        students.add("Rahul");
        students.add("Priya");

        System.out.println("ArrayList Students:");
        System.out.println(students);

 
        students.remove("Priya");

        System.out.println("After removing Priya:");
        System.out.println(students);


       
        LinkedList<String> waitingList = new LinkedList<>();

        waitingList.add("Anil");
        waitingList.add("Sneha");
        waitingList.add("Kiran");

        System.out.println("\nLinkedList Waiting List:");
        System.out.println(waitingList);

        
        waitingList.addFirst("Ravi");

        
        waitingList.remove("Sneha");

        System.out.println("After adding Ravi and removing Sneha:");
        System.out.println(waitingList);
    }
}