/**
 * @Author: lcj
 * @Date:Create：in 2019-11-30 16:46
 */
public class github2 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7};
        int k=3;
        int[] newArr=rovate(arr,k);
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
    //思路：每次旋转1，旋转k次
    // 旋转k次，数组长度减一
    // 最后一位跟第一位换
    // 再每个顺次排下去
    public static int[] rovate(int[] nums,int k){
        int temp,pre;
        for (int i = 0; i < k; i++) {
            //取最后一位
            pre=nums[nums.length-1];

            for (int j = 0; j < nums.length; j++) {
                temp=nums[j];
                nums[j]=pre;
                pre=temp;
            }
        }
        return nums;
    }
}
