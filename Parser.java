package encryptor;

abstract class Parser {

    public static EncryptorConfig generateConfig(String[] args) {
        EncryptorConfig config = new EncryptorConfig();
        for (int i = 0; i < args.length; i += 2) {
            try {
                switch (args[i]) {
                    case "--algorithm":
                    case "-a":
                        config.setAlgorithm(args[i + 1]);
                        break;
                    case "--mode":
                    case "-m":
                        config.setMode(args[i + 1]);
                        break;
                    case "--key":
                    case "-k":
                        config.setKey(Integer.parseInt(args[i + 1]));
                        break;
                    case "--data":
                    case "-d":
                        config.setData(args[i + 1]);
                        break;
                    case "--input":
                    case "-i":
                        config.setInputFile(args[i + 1]);
                        break;
                    case "--output":
                    case "-o":
                        config.setOutputFile(args[i + 1]);
                        break;
                }
            } catch (IndexOutOfBoundsException | IllegalArgumentException ex) {
                System.err.printf("error: %s\n", ex.getMessage());
            }
        }
        return config;
    }
}
