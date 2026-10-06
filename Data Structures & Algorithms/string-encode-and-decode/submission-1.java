class Solution {

    public String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();

        for (String s : strs) {
            result.append(s.length());
            result.append("#");
            result.append(s);
        }

        return result.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Get length
            int length = Integer.parseInt(str.substring(i, j));

            // Move after '#'
            i = j + 1;

            // Read exactly 'length' characters
            result.add(str.substring(i, i + length));

            // Move to next encoded string
            i = i + length;
        }

        return result;
    }
}