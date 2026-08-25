class Solution {
    public String longestCommonPrefix(String[] strs) {

        String result = "";

        // Percorrer cada posição dos caracteres
        for (int j = 0; j < strs[0].length(); j++) {
            char current = strs[0].charAt(j);

            // Verificar essa posição em todas as outras strings
            for (int i = 1; i < strs.length; i++) {
                // Se a string for demasiado curta
                // ou o carácter for diferente, terminamos
                if (j >= strs[i].length() || strs[i].charAt(j) != current) {
                    return result;
                }
            }
            // Se todas as strings tinham o mesmo carácter
            result += current;
        }

        return result;
    }

}