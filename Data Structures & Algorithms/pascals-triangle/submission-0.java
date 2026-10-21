class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (numRows == 0) {
            return result;
        }

        // Primeira linha é sempre [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        // Constrói as linhas seguintes a partir da anterior
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> nextRow = makeNewRow(prevRow);
            result.add(nextRow);
        }

        return result;
    }

    public List<Integer> makeNewRow(List<Integer> oldRow) {
        List<Integer> newRow = new ArrayList<>();
        
        // O primeiro elemento é sempre 1
        newRow.add(1);

        // Soma os dois elementos adjacentes da linha anterior
        for (int j = 1; j < oldRow.size(); j++) {
            int sum = oldRow.get(j - 1) + oldRow.get(j);
            newRow.add(sum);
        }

        // O último elemento é sempre 1
        newRow.add(1);

        return newRow;
    }
}