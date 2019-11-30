/**
 * @Author: lcj
 * @Date:Create：in 2019-11-29 11:50
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 示例 1:
 *
 * 给定数组 nums = [1,1,2],
 *
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * 示例 2:
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 * 说明:
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class github1 {
    public static void main(String[] args) {
        int[] nums=new int[]{0,0,1,1,1,2,2,3,3,4};
        if (nums.length<=1){
            System.out.println(0);
        }
        int i=0,j=1;
        //双指针，第一个 第二个 比较
        while (j<nums.length){
            //第一第二相等的话 第二个跳下一个 继续比较 返回下标+1
            if (nums[i]==nums[j]){
                j++;
            }else{
                //不等的话  一起跳下一个比较   i++  nums[i]=nums[j]  j++
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        System.out.println(i+1);
    }
}
