package mypackagetest;
import mypackage.*;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeStringsTest {

	@Test
	public void test() {
		Assert.assertArrayEquals(new String[]{"aba","aca"}, PalindromeStrings.palindrome(Arrays.asList("aba","aca","abab")).toArray());
		Assert.assertArrayEquals(new String[]{"abcdcba","sathwikkiwhtas"}, PalindromeStrings.palindrome(Arrays.asList("abcdcba","afga","sathwikkiwhtas")).toArray());
	}

}
