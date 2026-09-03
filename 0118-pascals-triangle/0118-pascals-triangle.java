class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            // Create one row
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // First and last element are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } 
                else {
                    // Add the two elements from previous row
                    row.add(pascal.get(i - 1).get(j)
                            + pascal.get(i - 1).get(j - 1));
                }
            }

            // Add completed row to Pascal Triangle
            pascal.add(row);
        }

        return pascal;
    }
}
