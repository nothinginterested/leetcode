import java.io.SyncFailedException;

class test1 {
     public int findRepeatNumbers(int[] nums) {
         int i;
         for( i=0;i<nums.length;i++){
             if(nums[i]<0||nums[i]>=nums.length) throw new IllegalArgumentException("lalal");


         }
         for(i=0;i<nums.length;i++){
             while(nums[i]!=i){
                 if(nums[i]==nums[nums[i]])
                 {
                     return nums[i];

                 }
                 int temp=nums[i];
                 
                 nums[i]=nums[nums[i]];
                 nums[temp]=temp;

             }
         }return -1;
     }
   public static void main(String[] args) {
       int[] arr={2,3,1,0,2,5,3};
         test1 t=new test1();
        int dupValus=t.findRepeatNumbers(arr);
        //System.out.println(dupValus);
     } 
     
 }