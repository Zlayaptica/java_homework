import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class hw2Task1 {
    public static String reader() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("hw2Task1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();

    }

    public static void split(String str) {
        String str2 = str.replace("{", "")
                .replace("}", "")
                .replace("\"", "");
        String[] newStr = str2.split(", ");

        Map<String, String> dictionary = new HashMap<>();
        for (String item : newStr) {
            String[] strnew = item.split(":");
            System.out.println(Arrays.toString(strnew));
            for (int i = 0; i < newStr.length; i++) {
                dictionary.put(strnew[0], strnew[1]);

            }
        }
        System.out.println(dictionary.entrySet());
        StringBuilder WHERE = new StringBuilder();
        Set<Map.Entry<String, String>> pair = dictionary.entrySet();
        List<Map.Entry<String, String>> list = new ArrayList<>(pair);
        for (Map.Entry<String, String> stringStringEntry : list) {
            if (!stringStringEntry.getValue().equals("null")) {
                WHERE.append(stringStringEntry.getKey()).append(" = ").append(stringStringEntry.getValue()).append(" and ");

            }
        }
        System.out.println(WHERE);

    }

    public static void main(String[] args) {

        split(reader());

    }
}
