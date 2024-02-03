public class PermutationofArray {
    
    public static void main(String args[]){

        int nums[]={0,2,1,5,3,4};
        

        buildarray(nums);
        
        // for(int i=0;i<ans.length;i++){
        //        System.out.print(ans[i] +" ");
        //      }
    
        for(int i=0;i<nums.length;i++){

            System.out.println(nums[i]);
        }

    }

    public static int[] buildarray(int[] nums){
        int n=nums.length;
        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
        }

        return ans;
    }
}
