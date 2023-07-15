package cn.bugstack.xfg.dev.tech.test;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class ApiTest {

    private static final String KEY = "1234567890123456";
    private static final String IV = "1234567890123456";

    public static void main(String[] args) throws Exception {
        System.out.println("哈喽，小卡拉米，欢迎加入小傅哥的学习阵营。https://bugstack.cn/md/road-map/road-map.html");

        String encrypt = encrypt("124");
        String decrypt = decrypt(encrypt);
        System.out.println("加密：" + encrypt);
        System.out.println("解密：" + decrypt);
    }

    /**
     * AES加密
     *
     * @param content 明文
     * @return 密文
     * @throws Exception 异常
     */
    public static String encrypt(String content) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] raw = KEY.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
        byte[] encrypted = cipher.doFinal(content.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    /**
     * AES解密
     *
     * @param content 密文
     * @return 明文
     * @throws Exception 异常
     */
    public static String decrypt(String content) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] raw = KEY.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(raw, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(IV.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
        byte[] encrypted = Base64.getDecoder().decode(content);
        byte[] original = cipher.doFinal(encrypted);
        return new String(original);
    }

}
