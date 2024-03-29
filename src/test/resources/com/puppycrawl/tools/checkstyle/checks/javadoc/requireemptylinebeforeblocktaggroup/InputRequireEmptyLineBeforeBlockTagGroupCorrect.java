/*
RequireEmptyLineBeforeBlockTagGroup
violateExecutionOnNonTightHtml = (default)false


*/

package com.puppycrawl.tools.checkstyle.checks.javadoc.requireemptylinebeforeblocktaggroup;

/**
 * Some Javadoc.
 *
 * @since 8.36
 */
class InputRequireEmptyLineBeforeBlockTagGroupCorrect {

    /**
     * This javadoc does not have a tag. There should be no violations.
     */
    public static final byte NO_TAG = 0;

    /**
     * This Javadoc has one tag, with an empty line. There should be no violations.
     *
     * @since 8.36
     */
    public static final byte ONE_TAG = 0;

    /**
     * This Javadoc has one tag, with two empty lines before it. There should be no violations.
     * Another independent check will verify if there is too much whitespace.
     *
     *
     * @since 8.36
     */
    public static final byte TWO_BLANK_LINES = 0;

    /**
     * This Javadoc has multiple tags, with an empty line before them. There should be no
     * violations.
     *
     * @param input this is the first tag.
     * @return this is the second tag.
     */
    public static boolean test(boolean input) {
        return false;
    }

    /**
     * This javadoc has an empty line with no asterisks. There should be no violation because
     * a separate check ensures the asterisks are well-formed.

     * @param input this is the first tag.
     * @return this is the second tag.
     */
    public static boolean noAsterisks(boolean input) {
        return false;
    }

    /**
     * @return this only has a tag.
     */
    public static boolean test() {
        return false;
    }

    /**
     *@return this tag has no whitespace before it.
     */
    public static boolean noWhiteSpace() {
        return false;
    }
}
