```
Usage: encryptor [OPTION]... [FILE]  
Encode or decode FILE, or standard input, to standard output or FILE.  
  
With no FILE read standard input.  
  
Mandatory arguments to long options are mandatory for short options too.  
  -a, --algorithm [shift|unicode|base64]  chose the appropriate algorithm  
  -m, --mode [enc|dec]    encode or decode  
  -k, --key [NUMBER]      encryption key to use for shift and unicode  
  -d, --data [STRING]     data to encrypt or decrypt  
  -i, --input [FILE]      file to read from (overrides --data)  
  -o, --output [FILE]     file to write to, with no FILE write to standard output  
  ```
