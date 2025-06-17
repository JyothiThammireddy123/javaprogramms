class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
           int left = i+1;
           int right = nums.length-1;
           while(right>left){
            List<Integer> lis = new ArrayList<>();
            if((nums[i]+nums[left]+nums[right])==0){
                lis.add(nums[i]);
                lis.add(nums[left]);
                lis.add(nums[right]);
                list.add(lis);               
                 
                left++;
                right--;
            }else if((nums[i]+nums[left]+nums[right])>0){
                right--;
            }else{left++;}
           }
               
        } 
        
        return new ArrayList<>(list);
    }
}