package com.hsh.spellchecker.service.impl;

import com.hsh.spellchecker.service.SpellChecker;

public class SpellCheckerServiceImpl implements SpellChecker {
    static String host = "https://api.cognitive.microsoft.com";
    static String path = "/bing/v7.0/spellcheck";

    static String key = "<ENTER-KEY-HERE>";

    static String mkt = "en-US";
    static String mode = "proof";
//    static String text = "Hollo, wrld!";
    @Override
    public String spellChecker(String text) {
        return null;
    }
    public static void check () throws Exception {
        String params = "?mkt=" + mkt + "&mode=" + mode;
        // add the rest of the code snippets here (except prettify() and main())...
    }
}
