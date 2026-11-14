class Solution {
    public int totalFruit(int[] fruits) {
        int i =0, j=0;
        int maxi = 0;
        Map<Integer,Integer> map = new HashMap();
        while(j<fruits.length) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0)+1);

            if(map.size() <= 2) {
                maxi = Math.max(maxi, j-i+1);
            }

            if(map.size() > 2) {
                while(map.size() > 2) {
                    map.put(fruits[i], map.getOrDefault(fruits[i], 0)-1);
                    if(map.get(fruits[i]) == 0) {
                        map.remove(fruits[i]);
                    }
                    i++;
                }
            }
            j++;
        }
        return maxi;
    }
}



// brute approach
// class Solution {
//     public int totalFruit(int[] fruits) {

//         int n = fruits.length;
//         int maxi = 0;

//         for (int i = 0; i < n; i++) {

//             Map<Integer, Integer> map = new HashMap<>();

//             for (int j = i; j < n; j++) {

//                 int fruit = fruits[j];

//                 map.put(
//                     fruit,
//                     map.getOrDefault(fruit, 0) + 1
//                 );

//                 if (map.size() <= 2) {
//                     maxi = Math.max(maxi, j - i + 1);
//                 } else {
//                     break;
//                 }
//             }
//         }

//         return maxi;
//     }
// }
