public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";

        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        System.out.println(new String(chars));
    }
}

//another way
public class ReverseString {
    public static void main(String[] args) {
        String str = "Java";

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println(sb.toString());
    }
}

