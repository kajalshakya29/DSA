public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Example input
        int target = 9; // Example target
        int[] result = twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("No two sum solution found.");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the indices immediately
                }
            }
        }
        return new int[0]; // Return an empty array if no solution is found
    }
}