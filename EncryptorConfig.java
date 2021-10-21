package encryptor;

class EncryptorConfig {

    private String algorithm = "shift";
    private String mode = "enc";
    private String data = "";
    private String inputFile = "";
    private String outputFile = "";
    private int key = 0;

    public String getAlgorithm() { return algorithm; }
    public String getMode() { return mode; }
    public String getData() { return data; }
    public String getInputFile() { return inputFile; }
    public String getOutputFile() { return outputFile; }
    public int getKey() { return key; }

    public void setAlgorithm(String algorithm) throws IllegalArgumentException {
        if (algorithm == null || !algorithm.equals("shift") && !algorithm.equals("unicode")
            && !algorithm.equals("base64")) {
            throw new IllegalArgumentException();
        }
        this.algorithm = algorithm;
    }

    public void setMode(String mode) throws IllegalArgumentException {
        if (mode == null || !mode.equals("enc") && !mode.equals("dec")) {
            throw new IllegalArgumentException();
        }
        this.mode = mode;
    }

    public void setData(String data) throws IllegalArgumentException {
        if (data == null) {
            throw new IllegalArgumentException();
        }
        this.data = data;
    }

    public void setInputFile(String file) throws IllegalArgumentException {
        if (file == null) {
            throw new IllegalArgumentException();
        }
        this.inputFile = file;
    }

    public void setOutputFile(String file) throws IllegalArgumentException {
        if (file == null) {
            throw new IllegalArgumentException();
        }
        this.outputFile = file;
    }

    public void setKey(int key) {
        this.key = key;
    }
}