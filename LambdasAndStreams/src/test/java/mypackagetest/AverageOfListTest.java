package mypackagetest;
import mypackage.AverageOfList;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AverageOfListTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Assert.assertEquals(20,AverageOfList.Average(Arrays.asList(10,20,30)),0);
		Assert.assertEquals(40,AverageOfList.Average(Arrays.asList(30,50,40)),0);

	}

}
