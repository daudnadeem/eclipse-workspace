package com.qa.TestDriven;

import org.junit.Test;
import static org.junit.Assert.*;

//import org.hamcrest.Matcher;

public class ArrayUtilsTest {

	int[] array = { 1, 2, 3, 4, 5 };

	@Test
	public void findHighestInArrayOfOne() {
		
		assertEquals(5, ArrayUtils.findHighest(array));
		
//		assertThat(ArrayUtils.findHighest(array), is(10));

	}

}
