
public class RemoveD {

    public int removeDuplicates(int[] nums) {
        int writeIndex = 0;

        for (int currentNum : nums) {
            if (writeIndex < 2 || currentNum != nums[writeIndex - 2]) {
                nums[writeIndex] = currentNum;
                writeIndex++;
            }
        }

        return writeIndex;
    }

    public static void main(String[] args) {
        RemoveD obj = new RemoveD();

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = obj.removeDuplicates(nums);

        System.out.println("New length: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}