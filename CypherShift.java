package encryptor;

class CypherShift implements Cypher {

    @Override
    public String run(String mode, int key, String data) {
        char[] codes = data.toCharArray();
        key = key % 26;
        if (mode.equals("dec")) {
            key = -key;
        }
        for (int i = 0; i < codes.length; ++i) {
            if (codes[i] >= 'a' && codes[i] <= 'z') {
                codes[i] += key;
                if (codes[i] > 'z') {
                    codes[i] -= 26;
                } else if (codes[i] < 'a') {
                    codes[i] += 26;
                }
            } else if (codes[i] >= 'A' && codes[i] <= 'Z') {
                codes[i] += key;
                if (codes[i] > 'Z') {
                    codes[i] -= 26;
                } else if (codes[i] < 'A') {
                    codes[i] += 26;
                }
            }
        }
        return new String(codes);
    }
}
