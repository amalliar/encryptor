package encryptor;

interface Cypher {

    String run(String mode, int key, String data);
}
