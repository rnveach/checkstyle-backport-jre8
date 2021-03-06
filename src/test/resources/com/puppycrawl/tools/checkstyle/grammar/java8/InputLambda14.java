/*
com.puppycrawl.tools.checkstyle.checks.naming.MemberNameCheck
format = (default)^[a-z][a-zA-Z0-9]*$
applyToPublic = (default)true
applyToProtected = (default)true
applyToPackage = (default)true
applyToPrivate = (default)true


*/

package com.puppycrawl.tools.checkstyle.grammar.java8;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;



public class InputLambda14 {

    private static final Logger LOG = Logger.getLogger(InputLambda14.class.getName());

    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.forEach(first -> {
            LOG.info("first");
            LOG.info("second");
            LOG.info("third");
        });
    }
}
