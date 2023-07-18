public class InsertionSort {
    void sort(int arr[])
    {
        int l=arr.length;
        int j=0,num=0;
        for(int i=1;i<l;i++)
        {
            num=arr[i];
            j=i-1;
            int c=0;
            while(j>=0 && num<arr[j])
            {
                arr[j+1]=arr[j];
                j=j-1;
                c++;
            }
            arr[i-c]=num;
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
