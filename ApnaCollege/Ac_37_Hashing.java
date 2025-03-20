import java.util.HashMap;
import java.util.HashSet;

public class Ac_37_Hashing {
//    majorityElement function...
    public static void majorityElement(int [] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])){ //true...
                map.put(nums[i], map.get(nums[i]) + 1);
            }else { //false...
                map.put(nums[i],1);
            }
        }
        for (int key: map.keySet()){
            if (map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }

//    union function...
    public static int union(int [] arr1, int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int j: arr2){
            set.add(j);
        }
        return set.size();
    }

//    intersection function...
    public static int intersection(int [] arr1, int [] arr2){
        HashSet<Integer> newSet = new HashSet<>();
        int count = 0;
        for (int i : arr1) {
            newSet.add(i);
        }

        for (int j : arr2) {
            if (newSet.contains(j)) {
                count++;
                newSet.remove(j);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("--------majorityElement--------");
        int [] nums = {1,3,2,5,1,3,1,5,1};
        majorityElement(nums);

        System.out.println("--------union--------");
        int [] arr1 = {7,3,9};
        int [] arr2 = {6,3,9,2,9,4};
        System.out.println(union(arr1, arr2));

        System.out.println("--------intersection--------");
        System.out.println(intersection(arr1, arr2));
    }
}
