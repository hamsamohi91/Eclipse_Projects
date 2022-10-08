package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeSuite
	private void ancestor() {
System.out.println("Ancestor");}
	@BeforeTest
	private void grandpa_A() {
System.out.println("Grandpa A");}
	@BeforeClass
	private void grandma_A() {
System.out.println("Grandma A");}
@BeforeMethod
private void father() {
	System.out.println("Father");}
	@Test
	private void child_A() {
System.out.println("Child A");}
	@Test
	private void child_B() {
		System.out.println("Child B");	}
	@AfterMethod
	private void mother() {
		System.out.println("Mother");}
@AfterClass
private void grandma_B() {
	System.out.println("Grandma B");}
@AfterTest
private void grandpa_B() {
System.out.println("Grandpa B");}
@AfterSuite
private void decendant() {
System.out.println("Descendant");}





}
