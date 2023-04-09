public class Main {
    public static void main(String[] args) {
        String str = "IOX";
        int n = str.length();
        permutation(str, 0, n-1);
    }

    public static void permutation(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permutation(str, left+1, right);
                str = swap(str, left, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
