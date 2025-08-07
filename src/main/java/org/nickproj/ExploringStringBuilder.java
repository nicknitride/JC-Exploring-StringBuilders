package org.nickproj;
public class ExploringStringBuilder {
    public static void main(String[] args) {
//        Exercise 1: Appending
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Cadets!").append(" Welcome to").append(" 2025").append(".");
        System.out.println(sb);
        // Prediction: concatenates to the end of the string.
        // Outcome: as predicted

//        Exercise 2: insert(<index>, string)
        sb = new StringBuilder("Java is Great!");
        sb.insert(8,"really ");
        System.out.println(sb);
        //Prediction: uses 8 as the insertion point, it will actually insert at index 8 by moving the rest of the string to the right, which is where the space is
        // other words: it is equivalent to being endpoint exclusive, so (index)
        //Outcome: As predicted

//        Exercise 3: delete(index1, index2);
        sb = new StringBuilder("This is a test sentence.");
        sb.delete(8,16);
        System.out.println(sb);

        //Prediction: Like string.substring(index, index1), it is also right endpoint exclusive so [start, end)
        // Outcome: as predicted

        sb.deleteCharAt(4);
        //Prediction: will actually delete the specified index
        // Outcome: as predicted
        System.out.println(sb);

        //Exercise 4: Replacing a Section
        sb = new StringBuilder("I like programming in Python.");
        sb.replace(22, 30, "Java");
        System.out.println(sb);
        //Prediction: acts like delete and then insert, delete is [start, end) inclusive, while insert will use the start
        // index as an offset
        //Outcome: as predicted
        //Note: modified the index

        // Exercise 5: Method Chaining
        sb = new StringBuilder("Start");
        sb.append("...").insert(0, "Ready, Set, ").delete(14, 17);
        System.out.println(sb);

        //Prediction: appends ... to end, inserts "Ready, Set, " at beginning, and then deletes specified characters
        // Outcome: as predicted
        //Note: changed indices to match expected output

        // Exercise 6: substring(), indexOf(), and Non-Existing Words
        // Substring returns a String
        sb = new StringBuilder("The quick brown fox jumps over the lazy dog.");
        String sub = sb.substring(16, 19);
        System.out.println("Substring: " + sub);
        // indexOf identical to string operation
        int indexOfFox = sb.indexOf("fox");
        System.out.println("Index of 'fox': " + indexOfFox);
        int indexOfCat = sb.indexOf("cat");
        System.out.println("Index of 'cat': " + indexOfCat);
        //Prediction, since it returns strings, it is exactly identical to the String class methods for indexOf and substring
        // Outcome: as predicted

//        Exercise 7: Converting back to a string
        sb = new StringBuilder("Status: ");
        sb.append("Pending");

        // Get the string output of the StringBuilder class
        String finalStatus = sb.toString();

        // Let's try to change the StringBuilder again
        sb.append(" - Approved");

        System.out.println("StringBuilder: " + sb);
        System.out.println("Final String: " + finalStatus);

        // Prediction: it is apparent that the stringbuilder will reflect the last change but the string wouldn't
        //Outcome: as predicted

    }
}