package com.crm.Orgtest;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test(groups="SmokeTest")
	public void creatOrgTest(){
		
		System.out.println("Execute createOrganization");
		
	}

	@Test
	public void editOrgTest(){
		
		System.out.println("Execute editOrganization");
		
	}

}
