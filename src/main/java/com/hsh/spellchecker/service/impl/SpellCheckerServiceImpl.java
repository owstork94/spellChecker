package com.hsh.spellchecker.service.impl;

import com.hsh.spellchecker.service.SpellChecker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class SpellCheckerServiceImpl implements SpellChecker {

    @Override
    public String spellChecker(String text) throws IOException {
        StringBuilder sb = new StringBuilder();
        String result = "";
        try {
            String param;
            param = encodeURiComponent(text);
            String line;
            URL url = new URL(
                    "https://m.search.naver.com/p/csearch/dcontent/spellchecker.nhn?_callback=window.__jindo2_callback._spellingCheck_0&q="+param);
            BufferedReader bin = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
            while ((line = bin.readLine()) !=null){
                sb.append(bin);
            }
            bin.close();
            result = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String encodeURiComponent(String text) {
    }

    public static void check (String test) throws IOException {

        // add the rest of the code snippets here (except prettify() and main())...
    }
}
