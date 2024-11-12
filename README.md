# Caesar Cipher Encryption & Decryption

This project is a simple **Caesar Cipher** tool in Java, allowing users to encrypt and decrypt text by shifting characters by a specified number of positions.

## 🔍 Project Overview
The **Caesar Cipher** is one of the simplest and oldest encryption techniques. Each letter in the plaintext is shifted a certain number of positions based on a provided key, making it ideal for quick text obfuscation.

## ✨ Features
- **Encryption**: Transforms a plaintext message by shifting characters based on the given key.
- **Decryption**: Reverts an encrypted message back to its original text using the same shift key.
- **Custom Shift Key**: Users can specify their shift value to control the encryption.

## 🛠️ Code Snippet

Here's a look at the core encryption method:

```java
private String encrypt(String plainText) {
    String cipherText = "";
    for (char c : plainText.toLowerCase().toCharArray()) {
        if (c == ' ') {
            cipherText += " ";
        } else {
            int pos = (mapping.indexOf(c) + key) % 26;
            cipherText += String.valueOf(mapping.get(pos));
        }
    }
    return cipherText;
}
```

## 👨‍💻 Usage
1. Run the program.
2. Enter the shift key.
3. Enter the text you want to encrypt or decrypt.

## 📂 Project Structure
- `CaesarCipher.java:` Main file containing encryption and decryption logic.
- `README.md:` Documentation file.
