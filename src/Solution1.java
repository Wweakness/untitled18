//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
public class Solution1 {
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else {
                int j=0;
                while (j!=nums.length)
                    if(nums[j]<target){
                        j++;
                    }else {
                        return j;
                    }
                }
            }
        return nums.length;
        }

    public static void main(String[] args) {
        int[] nums={0,1,2,2,4};
        int target=3;
        System.out.println(searchInsert(nums,target));
    }
}
