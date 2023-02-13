public class clckrotateby2 {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        int len = arr.length-1; // index value = 4
        int lasval = arr[len];  //stores 5
        int sconlas = arr[len-1]; // store 4
    
        
        for(int i = len; i >= 2; i--)  // i = 4 ; 4>=2 
        {
            arr[i]=arr[i-2];
        }

        arr[0] = lasval;
        arr[1] = sconlas;

        for(int k =0; k <= len; k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
