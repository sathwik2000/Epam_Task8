package mypackagetest;
import mypackage.*;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class StartsaTest {

	@Test
	public void test() {
		Assert.assertArrayEquals(new String[]{"abc","afg"}, Startsa.StartsaLen3(Arrays.asList("abc","afg","sathwik")).toArray());
		Assert.assertArrayEquals(new String[] {"abc", "acs"}, Startsa.StartsaLen3(Arrays.asList("abc","bcfd","abcd","acs","sathwik")).toArray());
		
	}

}
