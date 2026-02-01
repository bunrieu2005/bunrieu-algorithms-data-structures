import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> soDaGap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int soHienTai = nums[i];
            int soCanTim = target - soHienTai;

            if (soDaGap.containsKey(soCanTim)) {
                int viTriCu = soDaGap.get(soCanTim);
                return new int[] { viTriCu, i };
            }
            soDaGap.put(soHienTai, i);
        }
        return new int[] {};
    }
}