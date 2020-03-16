//add your name and matric number
//Jessica Lavin
//2495543L
//do NOT include a package statement in your final submission

//add any import statements you need here

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AssEx1 {

    /** read strings from file
     * and add them to an array. Assume that in the file there is one string
     * per line.
     * @param filename
     * return array
     */
    public static String[] readFromFile(String fileName) {
        FileReader myFileReader;
        try {
            myFileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        BufferedReader myBufferedReader = new BufferedReader(myFileReader);
        List<String> aList = new ArrayList<>();
        String c = null;
        while (true) {
            try {
                if ((c = myBufferedReader.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            aList.add(c);
        }
        return aList.toArray(new String[0]);
    }

    /**
     * Add all of the elements of an array of Strings
     * to a set of strings - note repeats will disappear
     * your set should be instantiated as a TreeSet (see lecture 1)
     */
    public static Set<String> arrayToSet(String[] myArray){
        return new TreeSet<>(Arrays.asList(myArray));
    }

    /** randomly re-order an array
     *
     * @param origArray
     */
    public static void jumbleArray(String[] origArray){
        Random randNo = new Random();
        for (int i=0; i<origArray.length; i++) {
            int jumblePos = randNo.nextInt(origArray.length);
            String s = origArray[i];
            origArray[i] = origArray[jumblePos];
            origArray[jumblePos] = s;
        }
    }

    /** create a string consisting all of the elements in an array,
     * one element per row.
     * Use a for--each loop to return them in the order in which they
     * are stored
     */
    public static String arrayToString(String[] stringArray){
        StringBuilder arrayStr = new StringBuilder();
        for (String s : stringArray) {
            arrayStr.append(s).append("\n");
        }
        return arrayStr.toString();
    }

    /** create a string consisting of all of the elements in a set,
     * one element per row.
     * Use a for--each loop to return them in the order in which they
     * are stored
     * @return
     */
    public static String setToString(Set<String> stringSet) {
        StringBuilder setStr = new StringBuilder();
        for (String s : stringSet) {
            setStr.append(s).append("\n");
        }
        return setStr.toString();
    }



    /**
     * main method - do not edit this
     * @param args
     */
    public static void main(String[] args){
        String fileName = args[0];
        String[] originalArray = readFromFile(fileName);
        System.out.println("the array has length " + originalArray.length + "\n");
        String[] newArray1 = originalArray.clone();
        String[] newArray2 = originalArray.clone();

        jumbleArray(newArray1);
        jumbleArray(newArray2);

        System.out.print("The original array is:\n");
        System.out.print(arrayToString(originalArray) + "\n");

        System.out.print("The frst jumbled array is:\n");
        System.out.print(arrayToString(newArray1) + "\n");
        System.out.print("The corresponding set is:\n");
        System.out.print(setToString(arrayToSet(newArray1))+"\n");

        System.out.print("The second jumbled array is:\n");
        System.out.print(arrayToString(newArray2) + "\n");
        System.out.print("The corresponding set is:\n");
        System.out.print(setToString(arrayToSet(newArray2)) + "\n");



    }

}