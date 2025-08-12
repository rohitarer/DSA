// linear search
// public class Arrays {
//     public static int linearSearch(int arr[], int key) {
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,4,6,8,10,12,14,16};
//         int key = 26;
        
//         int index = linearSearch(arr, key);
//         if(index == -1) {
//             System.out.println("key is not available");
//         } else {
//             System.out.println("Key is available at index " + index);
//         }
//     }
// }


// largest in array
// public class Arrays {
//     public static int largest(int arr[]) {
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++) {
//             if(largest<arr[i]) {
//                 largest = arr[i];
//             }
//         }
//         return largest;
//     }
//     public static void main(String[] args) {
//         int arr[] = {2,6,4,55,9,7};
//         System.out.println(largest(arr));
//     }
// }


// binary search

// public class Arrays {
//     public static int binary(int num[], int key) {
//         int start=0, end = num.length-1;
//         while(start<=end) {
//             int mid = (start+end)/2;
//             if(num[mid] == key) {
//                 return mid;
//             } else if (num[mid]>key) {
//                 end = mid-1;
//             } else {
//                 start = mid + 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int num[] = {2,4,6,8,10,12};
//         int key = 10;

//         System.out.println(binary(num, key));
//     }
// }


// reverse an array
// public class Arrays {
//     public static int reverse(int num[]) {
//         int first=0, last = num.length-1;

//         while(first < last) {
//             int temp = num[first];
//             num[first] = num[last];
//             num[last] = temp;

//             first++;
//             last--;
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int num[] = {2,4,6,8,10,12};
        
//         reverse(num);
//         for(int i=0; i<num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//         System.out.println();
//     }
// }


// Pairs in array

// public class Arrays {
//     static int tp=0;
//     public static void pairs(int num[]) {
//         for(int i=0; i<num.length; i++) {
//             int curr = num[i];
//             for(int j=i+1; j<num.length; j++) {
//                 System.out.print("("+num[i]+","+num[j]+")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println(tp);
//     }
//     public static void main(String[] args) {
//         int num[] = {2,4,6,8,10};

//         System.out.println(pairs(num));
//         

//     }
// }


// sub arrays
// public class Arrays {
//     public static void subarrays(int num[]) {
//         int ts=0;
//         for(int i=0; i<num.length; i++) {
//             int start=i;
//             for(int j=i; j<num.length; j++) {
//                 int end = j;
//                 for(int k=start; k<=end; k++) {
//                     System.out.print(num[k]+ " ");
                    
//                 }
//                 System.out.println();
//                 ts++;
//             }
//             System.out.println();
//         }
//         System.out.println(ts);
//     }
//     public static void main(String[] args) {
//         int num[] = {2,4,6,8,10};

//         subarrays(num);
//     }
// }


// Max Subarray sum
// public class Arrays {
//     public static int subarraysSum(int num[]) {
//         int currSum=0;
//         int maxSum = Integer.MIN_VALUE;
//         for(int i=0; i<num.length; i++) {
//             int start=i;
//             for(int j=i; j<num.length; j++) {
//                 int end = j;
//                 currSum = 0;
//                 for(int k=start; k<=end; k++) {
//                     currSum += num[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum<currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         return maxSum;
//     }
//     public static void main(String[] args) {
//         int num[] = {1,-2,6,-1,3};

//         System.out.println("Max sum is " + subarraysSum(num));
//     }
// }


// Max Subarray sum - Prefix 

// public class Arrays {
//     public static void maxSubarraySum(int num[]) {
//         int currSum=0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[num.length];

//         prefix[0] = num[0];
//         for(int i=1; i<prefix.length; i++) {
//             prefix[i] = prefix[i-1] + num[i];
//         }

//         for(int i=0; i<num.length; i++) {
//             int start= i;
//             for(int j=i; j<num.length; j++) {
//                 int end = j;
//                 currSum = start==0? prefix[end] : prefix[end] - prefix[start-1];

//                 if(maxSum<currSum){
//                     maxSum=currSum;
//                 }
//             }
//         }
//         System.out.println(maxSum);
//     }
//     public static void main(String[] args) {
//         int num[] = {1,-2,6,-1,3};
//         maxSubarraySum(num);
//     }
// }

// Max Subarray Sum - Kadane's
// public class Arrays {
//     public static void maxSubarraySum(int num[]) {
//         int currSum=0;
//         int maxSum = Integer.MIN_VALUE;
        
//         for(int i=0; i<num.length; i++) {
//             currSum +=num[i];
//             if (currSum<0) {
//                 currSum=0;
//             }
//             maxSum = Math.max(currSum, maxSum);
//         }
//         System.out.println(maxSum);
//     }
//     public static void main(String[] args) {
//         int num[] = {1,-2,6,-1,3};
//         maxSubarraySum(num);
//     }
// }


// Rain water trapping

// public class Arrays {
//     public static void rainwaterTrapping(int height[]) {
//         int n = height.length;
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++) {
//             leftMax[i] = Math.max(leftMax[i-1], height[i]);
//         }

//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--) {
//             rightMax[i] = Math.max(rightMax[i+1], height[i]);
//         }

//         int trappedWater =0;
//         for(int i=0; i<n; i++) {
//             int waterlevel = Math.min(leftMax[i], rightMax[i]);

//             trappedWater = trappedWater + waterlevel-height[i];
//         }
//         System.out.println(trappedWater);
//     }

//     public static void main(String[] args) {
//         int height[] = {4,2,0,6,3,2,5};
//         rainwaterTrapping(height);
//     }
// }


// buy and sell stock

// public class Arrays {
//     public static void buySellStocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxPrice = 0;

//         for(int i=0; i<prices.length; i++) {
//             if(buyPrice<prices[i]) {
//                 int profit = prices[i]-buyPrice;
//                 maxPrice = Math.max(maxPrice, profit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         }
//         System.out.println(maxPrice);
//     }

//     public static void main(String[] args) {
//         int prices[] = {7,1,5,3,6,4};
//         buySellStocks(prices);
//     }
// }


// Questions
//1
// public class Arrays {
//     public static boolean containsDuplicate(int nums[]) {
//         for(int i=0; i<nums.length; i++) {
//             for(int j=i+1; j<nums.length; j++) {
//                 if(nums[i]==nums[j]) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }



//     public static void main(String[] args) {
//         int nums[] = {1,2,3,1};
//         if(containsDuplicate(nums)) {
//             System.out.println("True");
//         } else {
//             System.out.println("False");
//         }
//     }
// }

//2

// import java.util.Comparator;

// public class Arrays {
//     public static int rotatedSearch(int nums[], int target) {
//         int st=0;
//         int end = nums.length-1;

//         while(st<=end) {
//             int mid = st+(end-st)/2;

//             if(nums[mid]==target) {
//                 return mid;
//             }

//             if(nums[st] <= nums[mid]) { // left
//                 if(nums[st]<= target && target<=nums[mid]) {
//                     end = mid -1;
//                 } else {
//                     st = mid +1;
//                 }
//             } else { // right
//                 if(nums[mid] <= target && target <=nums[end]) {
//                     st = mid +1;
//                 } else {
//                     end = mid -1;
//                 }
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int nums[] = {4,  5, 6, 7, 8, 9, 0, 1, 2};
//         int target = 2;

//         System.out.println(rotatedSearch(nums, target));
//     }
// }


//3
// public class Arrays {
//     public static int maxProfit(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int mp = 0;

//         for(int i=0; i<prices.length; i++) {
//             if(buyPrice<prices[i]){
//                 int profit = prices[i]-buyPrice;
//                 mp = Math.max(mp, profit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         }
//         return mp;
//     }

//     public static void main(String[] args) {
//         int prices[] = {7, 1, 5, 3, 6,  4};
//         System.out.println(maxProfit(prices));
//     }
// }


//4
// public class Arrays {
//     public static int rainwaterTrapping(int height[]) {
//         int n = height.length;
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++) {
//             leftMax[i] = Math.max(leftMax[i-1], height[i]);
//         }

//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--) {
//             rightMax[i] = Math.max(rightMax[i+1], height[i]);
//         }

//         int trappedWater=0;
//         for(int i=0; i<height.length; i++) {
//             int waterlevel = Math.min(leftMax[i], rightMax[i]);
//             trappedWater += waterlevel-height[i];
//         }
//         return trappedWater;
//     }
//     public static void main(String[] args) {
//         int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
//         System.out.println(rainwaterTrapping(height));
//     }
// }


// 5. 
// Brute force and no duplicates are removed

// public class Arrays {
//     public static void triplets(int nums[]) {
//         for(int i=0; i<nums.length; i++) {
//             for(int j=i+1; j<nums.length; j++) {
//                 for(int k=j+1; k<nums.length; k++) {
//                     if(nums[i]+nums[j]+nums[k]==0) {
//                         System.out.println(nums[i] +", "+ nums[j] +", "+ nums[k]);
//                     }
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int nums[] = {-1, 0,  1, 2, -1, -4};
//         triplets(nums);
//     }
// }