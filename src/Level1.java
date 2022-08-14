public class Level1 {
    public static boolean TankRush(int h1, int w1, String s1, int h2, int w2, String s2) {
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");

        int difStr = h1 - h2 + 1;
        int difCol = w1 - w2 + 1;

        int x = 0;
        int y = 0;

        while (x != difStr) {
            boolean flag = true;

            for (int i = 0; i < h2; i++) {
                for (int j = 0; j < w2; j++) {
                    if (str2[i].charAt(j) != str1[i + x].charAt(j + y)) {
                        y++;

                        flag = false;
                        break;
                    }
                }
                if (!flag) break;
            }

            if (flag) return true;

            if (y == difCol) {
                y = 0;
                x++;
            }
        }

        return false;
    }

}
