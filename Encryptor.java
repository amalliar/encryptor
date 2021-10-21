package encryptor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class Encryptor {

    private final EncryptorConfig config;

    public Encryptor(EncryptorConfig config) {
        this.config = config;
        if (config.getData().isEmpty() && !config.getInputFile().isEmpty()) {
            try {
                config.setData(new String(Files.readAllBytes(Paths.get(config.getInputFile()))));
            } catch (IOException ex) {
                System.err.printf("error: %s\n", ex.getMessage());
            }
        }
    }

    public int execute() {
        Cypher cypher = CypherFactory.generate(config.getAlgorithm());
        String result = cypher.run(config.getMode(), config.getKey(), config.getData());
        this.writeData(result);
        return 0;
    }

    private void writeData(String data) {
        if (!config.getOutputFile().isEmpty()) {
            File file = new File(config.getOutputFile());
            try {
                FileWriter writer = new FileWriter(file);
                writer.write(data + "\n");
                writer.close();
            } catch (IOException ex) {
                System.err.printf("error: %s\n", ex.getMessage());
            }
        } else {
            System.out.println(data);
        }
    }
}
