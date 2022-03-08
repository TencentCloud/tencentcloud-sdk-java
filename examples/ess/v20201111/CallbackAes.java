package ess.v20201111;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class CallbackAes {

    public static byte[] pkcs7Padding(byte[] ciphertext, int blockSize) {
        int padding = blockSize - ciphertext.length % blockSize;
        byte[] padtext = repeat((byte) padding, padding);
        ciphertext = append(ciphertext, padtext);
        return ciphertext;
    }

    public static byte[] repeat(byte val, int count) {
        byte[] result = new byte[count];
        for (int i = 0; i < count; i++) {
            result[i] = val;
        }
        return result;
    }

    public static byte[] append(byte[] a, byte[] b) {
        byte[] result = new byte[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

    public static byte[] pkcs7UnPadding(byte[] origData) {
        int length = origData.length;
        int unpadding = origData[length - 1];
        byte[] result = new byte[length - unpadding];
        System.arraycopy(origData, 0, result, 0, result.length);
        return result;
    }

    public static byte[] aesEncrypt(byte[] origData, byte[] key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        int blockSize = cipher.getBlockSize();
        origData = pkcs7Padding(origData, blockSize);
        SecretKeySpec keyspec = new SecretKeySpec(key, "AES");
        byte[] iv = new byte[blockSize];
        System.arraycopy(key, 0, iv, 0, iv.length);
        IvParameterSpec ivspec = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
        byte[] encrypted = cipher.doFinal(origData);
        return Base64.getEncoder().encode(encrypted);
    }

    public static byte[] aesDecrypt(byte[] crypted, byte[] key) throws Exception {
        byte[] decoded = Base64.getDecoder().decode(crypted);
        Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
        int blockSize = cipher.getBlockSize();
        SecretKeySpec keyspec = new SecretKeySpec(key, "AES");
        byte[] iv = new byte[blockSize];
        System.arraycopy(key, 0, iv, 0, iv.length);
        IvParameterSpec ivspec = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
        byte[] origData = cipher.doFinal(decoded);
        return pkcs7UnPadding(origData);
    }

    public static void main(String[] args) throws Exception {
        // 传入CallbackUrlKey
        byte[] key = "***************".getBytes();
        // 传入密文
        byte[] origData = aesDecrypt("****************".getBytes(StandardCharsets.UTF_8), key);
        // 打印解密后的内容，格式为json
        System.out.println(new String(origData, StandardCharsets.UTF_8));
    }
}
