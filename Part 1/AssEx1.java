// Jessica Lavin
// 2495543L

import java.io.BufferedReader;
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
    public static String[] readFromFile(String fileName) throws IOException {
        FileReader myFileReader = new FileReader(fileName);
        BufferedReader myBufferedReader = new BufferedReader(myFileReader);
        List<String> aList = new ArrayList<>();
        String c;
        while ((c = myBufferedReader.readLine()) != null) {
            aList.add(c);
        }
        myBufferedReader.close();
        return aList.toArray(new String[aList.size()]);
    }

    /**
     * Add all of the elements of an array of Strings
     * to a set of strings - note repeats will disappear
     * your set should be instantiated as a TreeSet (see lecture 1)
     */
    public static Set<String> arrayToSet(String[] myArray){
        Set<String> strSet = new TreeSet<String>();
        for (String a : myArray) {
            strSet.add(a);
        }
        return strSet;
    }

    /** randomly re-order an array
     *
     * @param origArray
     */
    public static void jumbleArray(String[] origArray){
        Random randNo = new Random();
        for (int i=0; i<origArray.length; i++) {
            int jumblePos = randNo.nextInt(origArray.length);
            String temp = origArray[i];
            origArray[i] = origArray[jumblePos];
            origArray[jumblePos] = temp;
        }
    }

    /** create a string consisting all of the elements in an array,
     * one element per row.
     * Use a for--each loop to return them in the order in which they
     * are stored
     */
    public static String arrayToString(String[] stringArray){
        String arrayStr = ("");
        for (int i=0; i<stringArray.length; i++) {
        arrayStr += stringArray [i] + "\n";
        }
        return arrayStr;
    }

    /** create a string consisting of all of the elements in a set,
     * one element per row.
     * Use a for--each loop to return them in the order in which they
     * are stored
     */
    public static String setToString(Set<String> stringSet) {
        Iterator<String> myIterator = stringSet.iterator();
        String setStr = ("");
        while(myIterator.hasNext()){
            setStr += myIterator.next() + "\n";
        }
        return setStr;
    }

    /**
     * main method - do not edit this
     * @param args
     */
    public static void main(String[] args) throws IOException {
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