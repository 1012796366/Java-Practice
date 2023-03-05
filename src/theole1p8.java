/*
 * 8．统计每个字母出现的次数
 * （1）随机生成100个小写字母并将其放入一个字符数组中，输出该数组中的全部元素。
 * （2）对上述数组中每个字母出现的次数进行计数。为实现该功能，可以创建一个具有26个元素的整型数组，每个元素存放每个字母的出现次数。输出每个字符及其出现的次数。
 *  提示：(char)('a' + Math.random() * ('z' - 'a' + 1))  可以随机生成一个小写字母
 */
public class theole1p8 {
    public static void main(String[] args) {
        char[] charArr = new char[100];     // 存储字符
        short[] totalCount = new short[26];     // 存储每个字符出现次数

        for (int i = 0; i < 100; ++i) {
            charArr[i] = (char)('a' + Math.random() * ('z' - 'a' + 1));     // 生成字符
            System.out.printf("%c", charArr[i]);                            // 输出字符
            ++totalCount[(short)(charArr[i] - 'a')];                        // 字符次数统计
        }
        for (int i = 0; i < 26; ++i) {
            System.out.printf("字母 %c 出现次数: %d\n", (char)('a' + i), totalCount[i]);
        }
    }
}
