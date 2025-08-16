// Given an array of integers, where all elements but one occur twice, find the unique element.

// Example

// The unique element is .

// Function Description

// Complete the lonelyinteger function in the editor below.

// lonelyinteger has the following parameter(s):

// int a[n]: an array of integers
// Returns

// int: the element that occurs only once




public static int lonelyinteger(List<Integer> a) {
    // Write your code here
        int arr[]=a.stream().mapToInt(i->i).toArray();
        int res=0;
        for(int ele: arr){
            res^=ele;
        }
        return res;
        
    }
