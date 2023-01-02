package org.dnyanyog
package pages

import org.dnyanyog.common.{BasePage, WebDriverFactory}
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.{ExpectedCondition, ExpectedConditions, WebDriverWait}
import org.openqa.selenium.support.{FindBy, PageFactory}

import java.time.Duration

class HomePage extends BasePage {

  @FindBy(xpath="//img[@alt='profile picture']")
  private var welcomeLink:WebElement=null

  PageFactory.initElements(WebDriverFactory.getDriver,this)

  def verifyWelcomeText(text:String)={
    println("Verifying text as "+text)
    webDriverWait.until(ExpectedConditions.visibilityOf(welcomeLink))
    assert(welcomeLink.isDisplayed)
    this
  }
}
