
/**
 * Write a description of class ArrayMethods here.
 *
 * @author Jon Cesena
 * @version v1.0
 * @since 4/26/2026
 */
public class ArrayMethods
{
    // instance variables - replace the example below with your own
    private int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * Method using for each with counter that returns number of elements
     * @return number of elements in the array
     */

    public int count (){
        int count = 0;
        for(int value:myArray){
            count++;
        }
        return count;
    }

    /**
     * Method using for each to sum elements in myArray
     * @return sum of element values in myArray
     */

    public int sum (){
        int accumulator = 0;
        for(int value: myArray){
            accumulator += value;
        }
        return accumulator;
    }

    /**
     * Method using sum divided by count to find the average
     * @return average of element values in myArray
     */

    public double average (){
        return (double) sum()/count();
    }

    /**
     * Method compares values in myArray to find maximum
     * @return maximum value of elements in myArray
     */
    public int findMax(){
        int max;
        max = myArray[0];
        for(int value: myArray){
            if(value > max)
                max = value;
        }
        return max;
    }

    /**
     * Method compares values in myArray to find index of maximum
     * @return index of maximum value in myArray
     */
    public int findIndexOfMax(){
        int max;
        int index = 0; 
        max = myArray[0];
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] > max){
                max = myArray[i];
                index = i;
            }
        }
        return index;
    }
}//end ArrayMethods











