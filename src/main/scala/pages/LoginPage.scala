package org.dnyanyog
package pages

import org.dnyanyog.common.{BasePage, WebDriverFactory}
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.{FindBy, PageFactory}

class LoginPage extends BasePage{

  @FindBy(xpath = "//input[@name='username']")
  private var userName:WebElement = null

  @FindBy(xpath = "//input[@name='password']")
  private var password:WebElement = null

  @FindBy(xpath = "//button")
  private var loginButton:WebElement = null

  PageFactory.initElements(WebDriverFactory.getDriver,this) //primary constructor in scala
                                                                 // all instruction under class treated as primary constructor
                                                                 // instruction under class ran sequentially on object creation

  def login(strUserName: String, strPassword:String)={
    userName.sendKeys(strUserName)
    password.sendKeys(strPassword)
    loginButton.click()
    new HomePage
  }
}
