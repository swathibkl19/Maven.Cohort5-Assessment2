package rocks.zipcode.assessment2.arrays;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {


        return Arrays.copyOfRange(arrayToBeSpliced,startingIndex,endingIndex);


    }



    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        String[] subArray = new String[arrayToBeSpliced.length-startingIndex]; // {null,null,...,null}

        //if(arrayToBeSpliced.length >= startingIndex) {
            List<String> subList = Arrays.asList(arrayToBeSpliced).subList(startingIndex, arrayToBeSpliced.length);

            return subList.toArray(subArray);
//        }
//        return {};
    }
}
