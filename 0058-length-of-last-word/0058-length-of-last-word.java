class Solution {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int index = s1.length()-1;
        int index1 = s1.lastIndexOf(" ");
        return index - index1;
    }
}


// Dry run
// Let's look at the underlying index positions of our trimmed string:

// Character	H	e	l	l	o		W	o	r	l	d
// Index	    0	1	2	3	4	5	6	7	8	9	10

// • Total s.length() = 11
// • Absolute last index (s.length() - 1) = 10 (where 'd' lives)

// Find the Last Space

// java
// int spaceIndex = s.lastIndexOf(' ');
// Use code with caution.
// • The method scans the string backwards starting from index 10.
// • The first space it encounters is at index 5.
// • So, s.lastIndexOf(' ') evaluates to 5.

// Calculate the Length

// java
// return s.length() - 1 - s.lastIndexOf(' ');
// Use code with caution.
// • Substitute our numbers into the formula:
// \(\text{Result}=11-1-5\)
// \(\text{Result}=10-5\)
// \(\text{Result}=5\)
// The code returns 5, which is the exact length of the word "World".