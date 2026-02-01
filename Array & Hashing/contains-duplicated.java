//O(N2)
class Solution1 {
    public boolean hasDuplicate(int[] nums) {
        for ( int i = 0 ; i < nums.length ; i++){
            for( int j = i + 1 ; j < nums.length ; j++){
                if (nums[i] == nums[j]){
                return true;}
            }
        }
        return false;
    }
}

//O(1)
class Solution2{
    public boolean hasDuplicate(int[] nums) {
            Set<Integer> seen = new HashSet<>();
         for(int i = 0 ; i < nums.length;i++){
              if ( seen.contains(nums[i])){
                return true;
              }  
              seen.add(nums[i]);
         }
         return false;
    }

}