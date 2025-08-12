// 1. Merge Sort
// TC: O(nlogn)  SC: O(n)

// public class DivNConquer {
//     public static void merge(int arr[], int si, int mid, int ei) {
//         int temp[] = new int[ei-si+1];
//         int i=si;
//         int j=mid+1;
//         int k = 0;

//         while(i<=mid && j<=ei) {
//             if(arr[i]<arr[j]) {
//                 temp[k] = arr[i];
//                 i++;
//             } else {
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         while(i<=mid) {
//             temp[k++] = arr[i++];
//         }

//         while(j<=ei) {
//             temp[k++] = arr[j++];
//         }

//         for(k=0, i=si; k<temp.length; k++, i++) {
//             arr[i] = temp[k];
//         }
//     }
//     public static void mergeSort(int arr[], int si, int ei) {
//         if(si>=ei) {
//             return;
//         }
//         int mid = si + (ei-si)/2;

//         mergeSort(arr, si, mid);
//         mergeSort(arr, mid+1, ei);
//         merge(arr, si, mid, ei);
//     }
//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {6,3,9,5,2,8};
//         mergeSort(arr, 0, arr.length-1);
//         printArr(arr);
//     }
// }


// 2. Quick Sort
// TC: O(n^2)

// public class DivNConquer {
//     public static void quickSort(int arr[], int si, int ei) {
//         if(si>=ei) {
//             return;
//         }

//         int pIdx = partition(arr, si, ei);
//         quickSort(arr, si, pIdx-1);
//         quickSort(arr, pIdx+1, ei);
//     }

//     public static int partition(int arr[], int si, int ei) {
//         int pivot = arr[ei];
//         int i = si-1;

//         for(int j=si; j<ei; j++) {
//             if(arr[j]<=pivot) {
//                 i++;
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = pivot;

//         return i;
//     }
//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {6,3,9,5,2,8};
//         quickSort(arr, 0, arr.length-1);
//         printArr(arr);
//     }
// }



// 3. Search in Sorted Rotated Array
// TC: O(logn)
// public class DivNConquer {
//     public static int search(int arr[], int target, int si, int ei) {
//         if(si>ei) {
//             return -1;
//         }

//         int mid = si + (ei-si)/2;
//         if(arr[mid] == target) {
//             return mid;
//         }

//         if(arr[si] <= arr[mid]) {
//             if(arr[si]<= target && target<=arr[mid]) {
//                 return search(arr, target, si, mid-1);
//             } else {
//                 return search(arr, target, mid+1, ei);
//             }
//         } else {
//             if(arr[mid]<=target && target<=arr[ei]) {
//                 return search(arr, target, mid+1, ei);
//             } else {
//                 return search(arr, target, si, mid-1);
//             }
//         }
//     }
    
//     public static void main(String[] args) {
//         int arr[] = {4,5,6,7,0,1,2};
//         int target = 0;
//         System.out.println(search(arr, target, 0, arr.length-1));
//     }
// }



public class DivNConquer {
    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k = 0;

        while(i<=mid && j<=ei) {
            if(arr[i].compareTo(arr[j])<0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid) {
            temp[k++] = arr[i++];
        }

        while(j<=ei) {
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void mergeSort(String arr[], int si, int ei) {
        if(si>=ei) {
            return;
        }
        int mid = si + (ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void printArr(String arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String arr[]= {"sun","earth","mars","mercury"};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}