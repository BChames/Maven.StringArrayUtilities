package com.zipcodewilmington;
import java.io.StringBufferInputStream;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[ array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[ array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for(int i = 0; i < array.length; i++){
            if( array[i] == value){
                return true;
            }
        }

      return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
    //Create a new string array with reversed indexes
        int count = 0;
        String[] newArr = new String[ array.length ];
        for( int i = array.length - 1 ; i >= 0 ; i-- ){
             newArr[count] = array[i];
             count++;

        }

        return newArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        //Loop through both arrays
        //create a new array
        //compare the two array values

        int count = 0;
        String[] newArray = new String[ array.length ];

        for( int i = array.length - 1 ; i >= 0 ; i-- ) {
            newArray[count] = array[i];
            count++;
        }

        if(Arrays.equals(newArray, array)){
            return true;
        }
        else{
            return false;
        }
    }



    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String stringArr = Arrays.toString(array).toLowerCase();

        stringArr = stringArr.replace(",", "");
        stringArr = stringArr.replace(" ", "");


        HashSet<String> inputSet = new HashSet<>(Arrays.asList(stringArr.split("")));

        return inputSet.size() == 28;
    }









                /**
                 * @param array array of String objects
                 * @param value value to check array for
                 * @return number of occurrences the specified `value` has occurred
                 */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

       //if value is reached add +1
        int count = 0;
        //if I == value count++

        for(int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }

        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        //if I reaches valuetoremove -1
        String[] b = new String[ array.length  - 1];
        int count = 0;


        for(int i = 0; i < array.length; i++){

            if ( array[i] != valueToRemove) {
                b[count] = array[i];
                count++;
            }
        }
        return b;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrList = new ArrayList<>();

           // int count = 0;
            for(int i =0; i < array.length; i++){
                String arrStr = array[i];
                arrList.add(arrStr);
                for(int j = i + 1; j < array.length; j++){
                    if(array[j].equals(arrStr) ){
                        i++;
                    } else {
                        break;
                    }

                }
            }
            String[] result = new String[arrList.size()];
            result = arrList.toArray(result);
            return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder builder = new StringBuilder();
        ArrayList<String> newArr = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            builder.append(array[i]);
            while (j < array.length && array[i].equals(array[j])) {
                builder.append(array[j]);
                j++;
            }
            newArr.add(builder.toString());
            builder = new StringBuilder();
            i = j - 1;
        }

        return newArr.toArray(new String[newArr.size()]);
    }



}
