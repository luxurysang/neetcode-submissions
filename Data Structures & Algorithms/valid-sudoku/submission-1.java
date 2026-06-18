class Solution {
    public static boolean isValidSudoku(char[][] board) {
        // 1. Check tung hang
        for (int i = 0; i < 9; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (!addIfValid(seen, board[i][j])) {
                    return false;
                }
            }
        }

        // 2. Check tung cot
        for (int j = 0; j < 9; j++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                if (!addIfValid(seen, board[i][j])) {
                    return false;
                }
            }
        }

        // 3. Check tung o 3x3
        for (int box = 0; box < 9; box++) {
            Set<Character> seen = new HashSet<>();
            int startRow = (box / 3) * 3;
            int startCol = (box % 3) * 3;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (!addIfValid(seen, board[startRow + i][startCol + j])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    // Bo qua '.', neu so da co trong set thi invalid
    private static boolean addIfValid(Set<Character> seen, char cell) {
        if (cell == '.') {
            return true;
        }
        if (seen.contains(cell)) {
            return false;
        }
        seen.add(cell);
        return true;
    }
}
