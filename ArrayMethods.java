import java.util.Arrays;

/**
 * This program takes myArray and returns count, sum, average, max value, and index of
 * max value. It then finds the right most key value, number of key values, and what
 * indices they are at. It then copies myArray and compares the copy to myArray. It
 * finally reverses the order of myArray and compares myArray and the reversed copy.
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

    /**
     * Method to right most index of key. If not found return -1
     * @param key value to be assessed
     * @return right most index of key passed in
     */
    public int findLast(int key){
        int index = -1;
        for (int i = myArray.length-1;i>=0;i--){
            if(myArray[i]==key){
                index = i;
                return index;
            }
        }
        return index;
    }

    /**
     * Method finds all key values in myArray and returns number of key
     * values found
     * @param key the value searched for in myArray
     * @return a new array of all key values
     */
    public int[ ] findAll(int key){
        int instances = 0; //number of times key is found
        for (int i=0;i<myArray.length;i++){
            if (myArray[i]==key){
                instances++;
            }
        }
        int[] indices = new int[instances];
        int element = 0;
        for (int i=0;i<myArray.length;i++){
            if (myArray[i]==key){
                indices[element]=i;
                element++;
            }
        }
        return indices;
    }

    /**
     * Method returns a copy of myArray
     * @return int copy of myArray
     */
    public int[] copyArray(){
        return Arrays.copyOf(myArray,myArray.length);
    }

    /**
     * Method returns myArray
     * @return in of myArray
     */
    public int[] getArray(){
        return myArray;
    }

    /**
     * Method uses a temp variable to reverse the order of myArray
     * @param inArray the array to be reversed
     * @return new array with order reversed
     */
    public int[] reverseArray(int[] inArray){
        for (int left=0,right=inArray.length-1;left<right;left++,right--){
            int temp=inArray[left];
            inArray[left]=inArray[right];
            inArray[right]=temp;
        }
        return inArray;
    }
    
    /**
     * Method prints an int array, nicely formatted
     * @param inArray int array to print
     */
    public void print(int[] inArray)
    {
        System.out.print("{");
        int i;
        // print elements before the last, separated by commas
        for (i = 0; i < inArray.length - 1; i++)
            System.out.print(inArray[i] + ", ");
        // print last element. Careful here to handle length 0
        if (inArray.length > 0)
            System.out.print(inArray[i]);
        System.out.println("}");
    }
}//end ArrayMethods












