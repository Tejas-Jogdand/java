public class clckrotate {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        int len = arr.length-1; //4
        int lasval = arr[len];  //stores 5
        
        for(int i = len;i>0;i--)  // i = 4 ; 4>0 
        {
            arr[i]=arr[i-1];
        }
        arr[0] = lasval;
        for(int k =0 ;k<=len;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
