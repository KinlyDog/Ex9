public class Level1 {
    public static boolean contSearch(String[] str1, String[] str2) {
        int x = 0;
        int y = 0;

        while (x < str1.length) {
            if (str1[x].contains(str2[y])) {
                y++;
                x++;

            } else {
                x = x - y + 1;
                y = 0;
            }

            if (y == str2.length) {
                return true;
            }
        }

        return false;
    }

    public static String[] revers(String[] str) {
        String[] rev = new String[str[0].length()];

        for (int i = 0; i < rev.length; i++) {
            rev[i] = "";
        }

        for (int i = 0; i < rev.length; i++) {
            for (int j = 0; j < str.length; j++) {
                rev[i] += str[j].charAt(i);
            }
        }

        return rev;
    }
    public static boolean TankRush(int h1, int w1, String s1, int h2, int w2, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        String[] strRev1 = revers(str1);
        String[] strRev2 = revers(str2);

        boolean t1 = contSearch(str1, str2);
        boolean t2 = contSearch(strRev1, strRev2);

        if (t1 && t2) {
            return true;
        }

        return false;
    }
}
