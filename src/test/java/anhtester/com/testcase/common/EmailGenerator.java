package anhtester.com.testcase.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmailGenerator {
    // Hàm tạo ngẫu nhiên địa chỉ email
    public static String generateEmail() {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 8; // Độ dài của tên tài khoản

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            sb.append(alphabet.charAt(index));
        }

        sb.append("@example.com"); // Địa chỉ email sẽ có định dạng @example.com

        return sb.toString();
    }

    public static void main(String[] args) {
        int numberOfEmails = 10; // Số lượng địa chỉ email cần tạo
        List<String> emails = new ArrayList<>();

        // Tạo danh sách địa chỉ email
        for (int i = 0; i < numberOfEmails; i++) {
            String email = generateEmail();
            emails.add(email);
        }
    }
}

