package com.puppycrawl.tools.checkstyle.checks.indentation.commentsindentation;

public class InputCommentsIndentationCheckWithEmoji {

    public void myMethod() {
        String breaks = "J"
        // warn 'Indentation should be the same level as line 8' ðð»
                + "ð¥³"
                // it is OK ð
                + "ð¥³VASdð¥³"
                + "A" + "ð¥³"
                // it is OK ð
                ;
    }

    public void test() {
        String a = "ð¥³";
            // warn 'Indentation should be the same level as line 17' ð
    }
        // warn 'Indentation should be the same level as line 22' ðð»

    String s = String.format(java.util.Locale.ENGLISH, " ð¥³ ð¥³ ð¥³asdda   ð¥³"
                    + "ð" + "ð  ðð       ",
            " ");
    // OK ð¥³

    public void test2() {
        String a = "ð¥³";
        switch (a) {
            // ð¥³ comment
            case "1":
                break;
                // ð comment ð
            case "2":
                    // comment  ðð»
                // ðð» comment
            default: a = "ð".
                        toString();
                // warn 'Indentation should be the same level as line 38' ð§
        }
    }

    private void test3() { // trailing ðð»
        if ("ð".equals("ð")) // trailing ðð» comment
        {
            // some comment  ð
        }
        if ("ð".equals("ðsad")) { // trailing comment ð¤

        }
        /** ð¤
         *           ð¤
         */
    }

    private void test4() {
        String a = "ð";
        a.toString()
                // comment ðð»
                .toLowerCase()
                // comment ðð»
                .charAt(0);
            // warn 'Indentation should be the same level as line 65' ðð»

        try {
            assert a.equals("ð") == true;
        // warn 'Indentation should be the same level as line 66' ðð»
        }
        catch (Exception ex) {

        } // ok ðð»
        finally {

        }
    }

    public void test5() {
            // comment
            // ... ð§
            // block
            // warn ð¤ 'Indentation should be the same level as line 83'
        // comment
        String someStr = "ððð";
    }

    private void test6() {
        if (true) {
            /* some ðð» */
            String k = "ððð";
                /* warn 'Indentation should be the same level as line 91' ðð»*/
            int b = Integer.parseInt("ððð");
                /* warn ð 'Indentation should be the same level as line 94'
                * */
            double d; /* trailing comment */
                /* warn 'Indentation should be the same level as line 108'
             *ð
                */

            /* my comment*/
            /*
             * ð¤ð»
             *
             *  some            ð§
             *  ð§ /
            /*
             * comment ð¤©
             */
            String x = "ðmkuhyg";
        }
    }
}

