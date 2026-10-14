class Solution {
    public int addDigits(int num) {
        // while(num >9) {
        //     int sum = 0;
        //     while(num > 0) {
        //         int digit = num % 10;
        //         sum += digit;
        //         num/=10;
        //     }
        //     num = sum;
        // }
        // return num;
        // if(num ==0 ) return 0;
        // return num % 9 ==0 ? 9 :num% 9;
         int sum = 0;
        int k = num;
        while(k > 0) {
            int digit =  k % 10;
            sum += digit;
            k = k / 10;
        }
        if(num < 10) {
            return sum;
        }
        return addDigits(sum);
    }
}