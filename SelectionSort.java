public class SelectionSort {
    void sort(int arr[])
    {
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            int min_ind=i;
            for(int j=i+1;j<l;j++)
            {
                if(arr[j]<arr[min_ind])
                min_ind=j;
            }
            int tem=arr[i];
            arr[i]=arr[min_ind];
            arr[min_ind]=tem;
        }
        for(int i=0;i<l;i++)
        System.out.println(arr[i]+"\n");
    }
    public static void main(String[] args) {
        SelectionSort ob=new SelectionSort();
        int arr[]={5,8,9,2,6,8};
        ob.sort(arr);
    }
}
