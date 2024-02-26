package com.mycompany.mavenproject2;

import com.mycompany.mavenproject2.js.PlatformServices;

public class BrowserMain {
    private BrowserMain() {
    }

    public static void main(String... args) throws Exception {
        Main.onPageLoad(new HTML5Services());
    }

    private static final class HTML5Services extends PlatformServices {
        // default behavior is enough for now
    }
}
