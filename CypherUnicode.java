package encryptor;

class CypherUnicode implements Cypher {

    @Override
    public String run(String mode, int key, String data) {
        char[] codes = data.toCharArray();
        if (mode.equals("dec")) {
            key = -key;
        }
        for (int i = 0; i < codes.length; ++i) {
            codes[i] += key;
        }
        return new String(codes);
    }
}
