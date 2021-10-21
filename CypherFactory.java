package encryptor;

abstract class CypherFactory {

    public static Cypher generate(String type) throws IllegalArgumentException {
        switch (type) {
            case "shift":
                return new CypherShift();
            case "unicode":
                return new CypherUnicode();
            case "base64":
                return new CypherBase64();
            default:
                throw new IllegalArgumentException();
        }
    }
}
