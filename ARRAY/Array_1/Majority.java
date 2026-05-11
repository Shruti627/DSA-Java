public class Majority{
       public static int removeElement(int []nums) {
              int candidate=0;
              int count=0;

              for(int num:nums){
                     if(count==0){
                            candidate=num;

                     }

                     if(candidate==num){
                            count++;
                     }
                     else{
                            count--;
                     }
              }
              return candidate;
           
       }
       public static void main(String[] args) {

              int [] nums={2,2,1,1,1,2,2};
              int n=removeElement(nums);
              System.out.println("majority:"+n);
           
       }
}