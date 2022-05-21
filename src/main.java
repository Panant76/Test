import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String str = "Мама мыла раму";
        String[] strArr = str.split(" ");
        char[] chrArr = new char[]{'а', 'я', 'у', 'о', 'е', 'ё', 'э', 'и', 'ы'};
        char[] strArrChr = str.toCharArray();
        for (int i = 0; i < strArrChr.length; i++) {
            for (int j = 0; j < chrArr.length; j++) {
                if (chrArr[j] == strArrChr[i]) strArrChr[i] = 'Ю';
            }
        }
        String newStr = new String(strArrChr);
        System.out.println(newStr);
        for (String rama : strArr) {
            System.out.println(rama);
        }
    }
}