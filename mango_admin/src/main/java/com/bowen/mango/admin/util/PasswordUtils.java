package com.bowen.mango.admin.util;

import java.util.UUID;

/**
 * 密码工具类
 *
 * @author bowen
 * @date Sep 1, 2018
 */
public class PasswordUtils {

    /**
     * 匹配密码
     *
     * @param salt    盐
     * @param rawPass 明文
     * @param encPass 密文
     * @return
     */
    public static boolean matches(String salt, String rawPass, String encPass) {
        return new PasswordEncoder(salt).matches(encPass, rawPass);
    }

    /**
     * 明文密码加密
     *
     * @param rawPass 明文
     * @param salt
     * @return
     */
    public static String encode(String rawPass, String salt) {
        return new PasswordEncoder(salt).encode(rawPass);
    }

    /**
     * 获取加密盐
     *
     * @return
     */
    public static String getSalt() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 20);
    }


    public static void main(String[] args) {
        String yzcmCZNvbXocrsz9dm8e = encode("123", "YzcmCZNvbXocrsz9dm8e");
        System.out.println(yzcmCZNvbXocrsz9dm8e);

        boolean matches = matches("YzcmCZNvbXocrsz9dm8e", "123", "fd80ebd493a655608dc893a9f897d845");
        System.out.println(matches);
    }
}
