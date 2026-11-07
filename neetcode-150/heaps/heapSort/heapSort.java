class Solution {

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void heapify(int[] arr, int n, int key){
        int largest = key;
        int l = (2*key)+1;
        int r = (2*key) +2;
        if(l<n && arr[l]>arr[largest])
            largest = l;
        if(r<n && arr[r]>arr[largest])
            largest =r;
        if(largest!=key){
            swap(arr,key,largest);
            heapify(arr,n,largest);
        }
    }

    public int[] sortArray(int[] arr) {
        int n = arr.length;
        for(int i = n/2-1 ;i>=0 ;i--)
            heapify(arr,n,i);
        for(int i=n-1;i>0;i--){
            swap(arr,i,0);
            heapify(arr,i,0);
        }
        return arr;
    }
}