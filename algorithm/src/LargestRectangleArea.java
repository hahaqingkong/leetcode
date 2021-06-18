/**
 * 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 *
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 * 以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为[2,1,5,6,2,3]。
 *
 * 图中阴影部分为所能勾勒出的最大矩形面积，其面积为10个单位。
 * 示例:
 *
 * 输入: [2,1,5,6,2,3]
 * 输出: 10
 */
public class LargestRectangleArea {
    public static void main(String[] args) {
        int[] heights = new int[] {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
        int result = 0;

        int i = 0;
        while (i < heights.length) {
            if ( heights[i] * heights.length <= result ) {
                continue;// 如果当前元素的值×长度都小于当前maxarea则没有继续查找的必要
            }
            int height = heights[i];
            int w = 1;
            int left = i - 1;
            while (left >= 0 && left < heights.length && heights[left] >= height) {
                w++; // w + 1
                left--; // left move
            }
            int right = i + 1;
            while (right >= 0 && right < heights.length && heights[right] >= height) {
                w++;
                right++; // move right
            }
            result = Math.max(result, w * height);
            i++;
        }

        return result;
    }

    public static  int largestRectangleArea1(int[] heights) {
        int maxarea = 0;
        int len = heights.length;
        for (int i=0;i<len;i++){
            if ( heights[i] * len <= maxarea ) {
                continue;// 如果当前元素的值×长度都小于当前maxarea则没有继续查找的必要
            }
            int left = i;
            int right = i;

            while ( left - 1 >= 0 && heights[left-1] >= heights[i] ) {
                left--;
            }
            while ( right + 1 < len && heights[right+1] >= heights[i] ) {
                right++;
            }


            int area = ( right - left + 1 ) * heights[i];
            if ( area > maxarea ) {
                maxarea = area;
            }

        }

        return maxarea;
    }
}
