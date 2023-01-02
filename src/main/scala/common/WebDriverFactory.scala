package org.dnyanyog
package common

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object WebDriverFactory {
  private var driver : WebDriver=null
  def getDriver=driver
  def setDriver(driver: WebDriver)=WebDriverFactory.driver=driver
}
