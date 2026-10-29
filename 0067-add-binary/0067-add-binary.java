class Solution {
    public String addBinary(String a, String b) {
        // StringBuilder sb = new StringBuilder();

        // correct it it is not working
        // int i =0, j=0;
        // while(i<a.length() && j<b.length()) {
        //     if(a.charAt(i) == 1 && b.charAt(i) == 1) {
        //         sb.append("1");
        //         sb.append("0");
        //     }
        //     else if(a.charAt(i) == 0 && b.charAt(i) == 1 || a.charAt(i) == 1 && b.charAt(i) == 0) {
        //         sb.append("1");
        //     }
        //     i++;
        //     j--;
        // }
        // sb.append("1");
        // sb.reverse();
        // return sb.toString();

        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1; // Start from the end of string a
        int j = b.length() - 1; // Start from the end of string b
        int carry = 0;

        // Loop as long as there are digits to add or a carry to process
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Convert char '0' or '1' to int 0 or 1
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Convert char '0' or '1' to int 0 or 1
                j--;
            }

            sb.append(sum % 2); // The binary digit to add (0 or 1)
            carry = sum / 2;    // The new carry (1 if sum >= 2, else 0)
        }
        return sb.reverse().toString();
    }
}