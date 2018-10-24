package com.singtel.animal.domain.model;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BirdTest {
	@Test
	public void testFly() {
		Bird b = new Bird();
		
		assertThat(b.fly()).isEqualToIgnoringCase("I am flying");
	}
	
	@Test
	public void testSing() {
		Bird b = new Bird();
		
		assertThat(b.sing()).isEqualToIgnoringCase("I am singing");
	}


}
