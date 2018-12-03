int[][] mat = new int[2][3];

public static void changeMatrix(int[][] mat){
for (int r = 0; r < mat.length; r++)
for (int c = 0; c < mat[r].length; c++)
if (r == c)
mat[r][c] = Math.abs(mat[r][c]);
}