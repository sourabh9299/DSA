public class AddTwoNumber {
    public static void main(String[] args) {

        int []arr={1,3,4,5};
        int size=arr.length;
        int target=10;
        int left=0;
        int right = size-1;

        while(arr[left]>arr[right]){
            if(arr[left]+arr[right]==target){
                left=left+1;
                right=right+1;
                break;

            } else if(arr[left]+arr[right]>target){
            right=right-1;
            }


        }


    }
}
