class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[] { -1, -1 };
        arr[0] = BS(nums, target, true);
        arr[1] = BS(nums, target, false);
        return arr;
    }

    private int BS(int[] nums, int tar, boolean found) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (tar < nums[mid]) {
                high = mid - 1;
            } else if (tar > nums[mid]) {
                low = mid + 1;
            } else {
                ans = mid;
                if (found) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return ans;
    }
}
