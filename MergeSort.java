public class MergeSort {
    void merge(int arr[],int l,int m,int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    void sort(int arr[],int l,int h)
    {
        if(l<h)
        {
            int  mid=(l+h)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }
    public static void main(String[] args) {
        MergeSort ob=new MergeSort();
        int arr[]={5,8,9,2,6,8};
        ob.sort(arr,0,5);
    }
}
