package com.qualitrix.common.utils;

import org.testng.Assert;

import java.util.List;

public class AssertUtils {

    public void assertListEquals(List actualList, List expectedList, String listName) {
        assertListContains(actualList, expectedList, listName);
        Assert.assertEquals(actualList.size(), expectedList.size(),
            "Value count in list" + listName
                + "  didn't match. \nExpected list values:  "
                + expectedList + ", \nActual List values:  " + actualList);
    }

    public void assertListEqualsWithOrder(List actualList, List expectedList, String listName) {
        assertListEquals(actualList, expectedList, listName);
        Assert.assertEquals(actualList, expectedList,
            "List order didn't match, \nExpected: " + expectedList + "\nActual: " + actualList);
    }

    public void assertListContains(List actualList, List expectedList, String listName) {
        for (Object expectedValue : expectedList) {
            Assert.assertTrue(actualList.contains(expectedValue),
                "Value (" + expectedValue + ") is not present in List '"
                    + listName + "'. \nActual list values: "
                    + actualList + "\nExpected list values: " + expectedList);
        }
    }

    public void assertListNotContains(List actualList, List expectedList, String listName) {
        for (Object expectedValue : expectedList) {
            Assert.assertTrue(!actualList.contains(expectedValue),
                "Value (" + expectedValue + ") is present in List '"
                + listName + "'. \nActual list values: "
                + actualList + "\nExpected list values: " + expectedList);
        }
    }
}
