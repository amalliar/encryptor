package encryptor;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            printHelp();
            System.exit(0);
        }
        Encryptor encryptor = new Encryptor(Parser.generateConfig(args));
        System.exit(encryptor.execute());
    }

    private static void printHelp() {
        System.out.print(
                "Usage: encryptor [OPTION]... [FILE]\n" +
                "Encode or decode FILE, or standard input, to standard output or FILE.\n" +
                "\n" +
                "With no FILE read standard input.\n" +
                "\n" +
                "Mandatory arguments to long options are mandatory for short options too.\n" +
                "  -a, --algorithm [shift|unicode|base64]  chose the appropriate algorithm\n" +
                "  -m, --mode [enc|dec]    encode or decode\n" +
                "  -k, --key [NUMBER]      encryption key to use for shift and unicode\n" +
                "  -d, --data [STRING]     data to encrypt or decrypt\n" +
                "  -i, --input [FILE]      file to read from (overrides --data)\n" +
                "  -o, --output [FILE]     file to write to, with no FILE write to standard output\n"
        );
    }
}