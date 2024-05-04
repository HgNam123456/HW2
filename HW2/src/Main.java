import java.util.HashSet;

public class Main {
    public static String blowup(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Kiểm tra nếu ký tự hiện tại là số
                int repeatCount = Character.getNumericValue(currentChar);

                if (i + 1 < str.length() && Character.isLetter(str.charAt(i + 1))) {
                    // Kiểm tra xem ký tự kế tiếp có phải là chữ cái không
                    for (int j = 0; j < repeatCount; j++) {
                        result.append(str.charAt(i + 1)); // Thêm ký tự kế tiếp vào kết quả
                    }
                }
            } else {
                // Nếu ký tự không phải là số, thêm vào kết quả
                result.append(currentChar);
            }
        }

        return result.toString();
    }
    public static int maxRun(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int maxRunLength = 1;
        int currentRunLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentRunLength++;
                maxRunLength = Math.max(maxRunLength, currentRunLength);
            } else {
                currentRunLength = 1;
            }
        }

        return maxRunLength;
    }
    public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> set = new HashSet<>();

        // Tạo tất cả các xâu con của a có độ dài len và thêm vào HashSet
        for (int i = 0; i <= a.length() - len; i++) {
            set.add(a.substring(i, i + len));
        }

        // Kiểm tra xem có xâu con của b có trong HashSet không
        for (int i = 0; i <= b.length() - len; i++) {
            if (set.contains(b.substring(i, i + len))) {
                return true;
            }
        }
        return false;
    }
}
