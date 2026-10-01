import java.util.*;
class ProductCategories
{
public static void main(String args[])
{
HashSet<String> categories=new HashSet<>();
categories.add("BOOKS");
categories.add("ELECTRONICS");
categories.add("VEHICLES");
categories.add("CLOTHING");
categories.add("SHOES");
System.out.println("HashSet Categories: ");
System.out.println(categories);
TreeSet<String> sortedCategories=new TreeSet<>(categories);
System.out.println("\nTreeSet Categories: ");
System.out.println(sortedCategories);
}
}