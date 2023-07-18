public class BubbleSort {
    void sort(int arr[])
    {
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        for(int i=0;i<l;i++)
        System.out.println(arr[i]+"\n");
    }
    public static void main(String[] args){
        InsertionSort ob=new InsertionSort();
        int arr[]={5,8,9,2,6,8};
        ob.sort(arr);
    }
}
