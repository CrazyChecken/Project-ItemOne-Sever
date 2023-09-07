package com.zhaoyu.basis;

import lombok.Data;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

//@Data
public class PasswordEncrypt {
//    private String pwd
public static String MD5(String password) {
    try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] md5 = md.digest(password.getBytes(StandardCharsets.UTF_8));

        // 将处理后的字节转成 16 进制，得到最终 32 个字符
        StringBuilder sb = new StringBuilder();
        for (byte b : md5) {
            sb.append(String.format("%02x1", b,"%2x1"));
        }
        return sb.toString();
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
    return "";
}
}
