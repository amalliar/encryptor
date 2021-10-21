package encryptor;
import java.util.Base64;

class CypherBase64 implements Cypher {

    @Override
    public String run(String mode, int key, String data) throws IllegalArgumentException {
        if (mode.equals("enc")) {
            return Base64.getEncoder().encodeToString(data.getBytes());
        } else if (mode.equals("dec")) {
            return new String(Base64.getDecoder().decode(data));
        }
        throw new IllegalArgumentException();
    }
}
