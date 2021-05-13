import java.util.ArrayList;
import java.util.List;

/**
 * N皇后
 * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 *
 * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
 *
 * 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 * 输入：n = 4
 * 输出：[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * 解释：如上图所示，4 皇后问题存在两个不同的解法。
 * 示例 2：
 *
 * 输入：n = 1
 * 输出：[["Q"]]
 */
public class Nqueue {
    public static void main(String[] args) {
        solveNQueens(5);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        String[][] strArray = new String[n][n];
        for (int i = 0; i < n;i++) {
            for (int j = 0;j < n;j++) {
                strArray[i][j] = "Q";
            }
        }

        System.out.println(strArray);
        return result;
    }
}
