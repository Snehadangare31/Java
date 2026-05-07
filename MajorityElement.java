class MajorityElement {

    public int majorityElement(int[] nums) {

        int count = 0;
        int candidate = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
                count = 1;
            } else {

                if (candidate == num) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        MajorityElement s = new MajorityElement();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int ans = s.majorityElement(nums);

        System.out.println("Majority Element: " + ans);
    }
}