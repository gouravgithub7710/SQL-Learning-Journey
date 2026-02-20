class Solution {
    public int[] twoSum(int[] arr, int target) {
     int ans[]=new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

     for(int i=0;i<arr.length;i++){
        // for(int j=i+1;j<nums.length;j++){
        //     if(nums[i]+nums[j]==target){
        //         ans[0]=i;
        //         ans[1]=j;
        //     }
        // }
        int req = target - arr[i];

        if(map.containsKey(req)){
            
            ans[0]=map.get(req);
            ans[1]=i;
        }
         map.put(arr[i],i); 
     }   
     return ans;
    }
}