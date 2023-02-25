
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        //Initializing variable to the first element length
        int len = arr[0].length();
        // Variable to set i to while looping
        int index = 0;
        //Looping throughout the arr 
        for(int i = 0; i < arr.length  ; i++){
            // if any element's length in the array is greater than the first element's 
           if(arr[i].length() > len){
            //Setting index to equal whatever number i is
                index = i;
                //Updating the variable len to equal i's > first element length
                len = arr[i].length();
           }
        }
        //Returning the content of a[i] element
            return arr[index];
        
       
    }
}
