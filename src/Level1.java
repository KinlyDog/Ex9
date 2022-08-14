public class Level1 {
    public static boolean TankRush(int h1, int w1, String s1, int h2, int w2, String s2) {
        if (h2 > h1 || w2 > w1) {
            return false;
        }

        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        String[] str = new String[str2.length];

        int x = 0;
        int y = 0;
        int tmp = -1;

        while (x < str1.length) {
            if (str1[x].contains(str2[y]) && y < str2.length) {
                str[y] = str1[x];
                y++;
                x++;

            } else {
                x = x - y + 1;
                y = 0;
            }

            if (y == str2.length) {
                tmp = x - y;
                break;
            }
        }

        if (tmp < 0) return false;

        String[] strRev = new String[str[0].length()];
        String[] str2Rev = new String[str2[0].length()];

        for (int i = 0; i < strRev.length; i++) {
            strRev[i] = "";
        }
        for (int i = 0; i < str2Rev.length; i++) {
            str2Rev[i] = "";
        }

        for (int i = 0; i < strRev.length; i++) {
            int j = 0;
            while (j < str.length) {
                strRev[i] += str[j].charAt(i);
                j++;
            }
        }

        for (int i = 0; i < str2Rev.length; i++) {
            int j = 0;
            while (j < str2.length) {
                str2Rev[i] += str2[j].charAt(i);
                j++;
            }
        }

        x = 0;
        y = 0;
        tmp = -1;

        while (x < strRev.length) {
            if (strRev[x].contains(str2Rev[y]) && y < str2Rev.length) {
                y++;
                x++;

            } else {
                x = x - y + 1;
                y = 0;
            }

            if (y == str2Rev.length) {
                tmp = x - y;
                break;
            }
        }

        if (tmp > 0) return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(TankRush(3,3, "321 694 798", 2, 2, "69 98"));
    }
}
