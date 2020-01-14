//给出一个数组删除数组中等于val的元素。然后返回删除后数组长度
//例如给：[0,1,2,2,3,4,2] val=2   结果返回4
class Solution {
    public static int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        for(;j<nums.length;j++){
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }

    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        int val=2;
        System.out.println(removeElement(nums,val));
    }
}