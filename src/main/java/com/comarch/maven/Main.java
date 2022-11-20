package com.comarch.maven;

import org.apache.commons.codec.digest.DigestUtils;

public class Main {
    public static void main(String[] args) {
        String s = "mateusz";
        String hash = DigestUtils.md5Hex(s);
        System.out.println(hash);
    }
}
