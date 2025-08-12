// public class BasicSorting {
//     public static void bubble(int arr[]) {
//         int swaps = 0;
//         for(int i=0; i<arr.length-1; i++) {
//             for(int j=0; j<arr.length-1-i; j++) {
//                 if(arr[j] > arr[j+1]) {
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swaps++;
//                 }
//             }
//             System.out.println(swaps);
//             if(swaps<=0) {
//                 System.out.println("Array is already sorted");
//                 return;
//             }
//         }
//     }

//     public static void selection(int arr[]) {
//         for(int i=0; i<arr.length-1; i++) {
//             int minPos = i;
//             for(int j=i+1; j<arr.length; j++) {
//                 if(arr[minPos]>arr[j]) {
//                     minPos=j;
//                 }
//             }
//             //swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void insertion(int arr[]) {
//         for(int i=1; i<arr.length; i++) {
//             int curr = arr[i];
//             int prev = i-1;
//             while(prev>=0 && arr[prev]>curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             arr[prev+1] = curr;
//         }
//     }

//     public static void count(int arr[]) {
//         int largest = Integer.MIN_VALUE;

//         for(int i=0; i<arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//         }

//         int count[] = new int[largest+1];
//         for(int i=0; i<arr.length; i++) {
//             count[arr[i]]++;
//         }

//         int j=0;
//         for(int i=0; i<count.length; i++) {
//             while(count[i]>0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {5,4,1, 1,3, 3,5,2};
//         // int arr[] = {1,2,3,4,5};
//         // bubble(arr);
//         // selection(arr);
//         // insertion(arr);
//         count(arr);
//         printArr(arr);
//     }
// }



public class BasicSorting {
    public static void bubble(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    public static void selection(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void count(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>=0; i--) {
            while(count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        // bubble(arr);
        // selection(arr);
        // insertion(arr);
        count(arr);
        printArr(arr);
    }
}