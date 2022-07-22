package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ReadExcel;
import generic.WebGeneric;
import pom.HomePage;
import pom.LoginPage;

public class ValidLogin extends BaseTest{
  @Test
  public void validLoginTest() throws EncryptedDocumentException, IOException, InterruptedException {
	  String actualTitle="actiTIME - Enter Time-Track";
	  LoginPage lp=new LoginPage(driver);
	  ReadExcel re=new ReadExcel();
	  String username=re.getDataFromExcel("Sheet1",0,0);
	  String password=re.getDataFromExcel("Sheet1",0,1);
	  lp.setUsername().sendKeys(username);
	  lp.setPassword().sendKeys(password);
	  lp.clickLogin().click();
	  WebGeneric wg=new WebGeneric();
	  wg.verifyTitle(driver, actualTitle);
	  HomePage hp=new HomePage(driver);
	  hp.clickLogout().click();
  }
}