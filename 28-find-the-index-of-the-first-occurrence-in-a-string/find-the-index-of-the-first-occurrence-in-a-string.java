class Solution {
    public int strStr(String haystack, String needle) {
        String temp = "";
        int hLen = haystack.length();
        int nLen = needle.length();
        int index = -1;
        int counter = 0;
        if(nLen==0) return 0;
        for (int i = 0; i < hLen; i++) {
            if(temp.equals(needle)) {
                return index;
            }
            for (int j = counter; j < nLen; j++) {
                if(haystack.charAt(i) == needle.charAt(j)) {
                    if(temp.length()==0) {
                        index = i;
                    }
                    temp += needle.charAt(j);
                    counter = j + 1;
                } else {
                    temp = "";
                    index = -1;
                    counter = 0;
                    i = i - j;
                }
                break;
            }
        }
        if(temp.equals(needle)) {
            return index;
        }
        return -1;
    }
}
