import java.util.ArrayList;
import java.util.List;

/**
 * 文本左右对齐
 * 暴力破解方法
 * 代码即思路
 *
 * @author gouzi
 * @since 2021-04-21
 */
public class FullJustify {
    public static void main(String[] arg) {
        String[] words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        fullJustify(words, maxWidth);
    }

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> resultList = new ArrayList<>();

        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        String wordStr  = sb.substring(0, sb.length() - 1);

        sb = new StringBuffer();
        for (String word : words) {
            if (sb.length() + word.length() > maxWidth) {
                resultList.add(sb.substring(0, sb.length() - 1)); // substring the last space
                sb = new StringBuffer(word + " "); // clear the sb
                continue;
            }
            sb.append(word).append(" ");
        }
        resultList.add(sb.substring(0, sb.length() - 1));
        List<String> results = new ArrayList<>();
        for (int i = 0; i < resultList.size() - 1; i++) {
            results.add(convertArraysToFormat(resultList.get(i), maxWidth));
        }
        results.add(convertLastOfTheArraysToFormat(resultList.get(resultList.size() - 1), maxWidth));
        return results;
    }

    public static String convertArraysToFormat(String word, int maxWidth) {
        String[] words = word.split(" ");
        int length = word.length();
        int eleCount = word.split(" ").length; // words count
        int spaceCount = maxWidth - length + (eleCount - 1); // space count

        int avg = (eleCount == 1) ? spaceCount : spaceCount / (eleCount - 1); // avg is avg
        int min = (eleCount == 1) ? 0 : spaceCount % (eleCount - 1); // min will be add to the ahead of avg
        List<String> spaces = new ArrayList<>();
        for (int index = 0; index < eleCount; index++) {
            StringBuffer spaceSb = new StringBuffer();
            for (int i = 0 ; i < avg; i++) {
                spaceSb.append(" ");
            }
            spaces.add(spaceSb.toString());
        }

        for (int i = 0; i < min ; i++) {
            spaces.set(i, spaces.get(i).concat(" ")); // the ahead of avg's will add a " "
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < eleCount; i++) {
            sb.append(words[i]).append(spaces.get(i));
        }
        return sb.substring(0, maxWidth);
    }

    public static String convertLastOfTheArraysToFormat(String word, int maxWidth) {
        int length = word.length();
        int spaceCount = maxWidth - length; // space count
        StringBuffer spaceSb = new StringBuffer();
        for (int i = 0 ; i < spaceCount; i++) {
            spaceSb.append(" ");
        }

        return word.concat(spaceSb.toString());
    }
}
