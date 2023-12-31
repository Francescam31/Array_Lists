import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");

//        1. Add "Coll" to the end of the list
//        scottishIslands.add("coll");

//        OVERLOADED diff num arguments

//        2. Add "Tiree" to the start of the list
//        scottishIslands.add(0, "tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
//        scottishIslands.add(scottishIslands.indexOf("jura")+1, "islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
//        System.out.println(scottishIslands.indexOf("Arran"));
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        //Destructive method -- changed the array rather than creating new variable

//        9. Print out all the islands using a for loop
        for (String island: scottishIslands) {
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        List<Integer> evennums = new ArrayList<>();
        for(int num : numbers){
            if(num%2 == 0){
                evennums.add(num);
            }
        }System.out.println(evennums);

//        2. Print the difference between the largest and smallest value
        int difference = Collections.max(numbers) - Collections.min(numbers);
        System.out.println(difference);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (Integer i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 1 && numbers.get(i)==numbers.get(i+1)){
                System.out.println(true);
            }
        }
//        4. Print the sum of the numbers,
        int sum = 0; //accumulator
        for(Integer num : numbers) {
            sum += num;
        }
        System.out.println(sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
        int sum2 = 0;
        for(Integer num : numbers) {
            if(num ==13){
                continue;
            }
            sum2 += num;
        }
        System.out.println(sum2);
//           ...and numbers that come immediately after a 13 also do not count.
        int sum3 = 0;
        for(Integer num : numbers) {
            if(num ==13){
                break;
            }
            sum3 += num;
        }
        System.out.println(sum3);
//          So [2, 7, 13, 2] would have sum of 9.

    }

}
