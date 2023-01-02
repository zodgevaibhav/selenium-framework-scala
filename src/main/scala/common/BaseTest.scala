package org.dnyanyog
package common

import org.openqa.selenium.chrome.ChromeDriver
import org.scalactic.source.Position
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.{BeforeAndAfter, BeforeAndAfterAll, BeforeAndAfterEach, Suite}

class BaseTest
  extends AnyFlatSpec
    with BeforeAndAfterAll
    with BeforeAndAfterEach {


  override protected def beforeEach(): Unit = {
    System.setProperty("webdriver.chrome.driver", "/Users/vzodge/Documents/Selenium/chromedriver")
    WebDriverFactory.setDriver(new ChromeDriver())
    WebDriverFactory.getDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
  }

  override protected def afterEach(): Unit = {
    WebDriverFactory.getDriver.quit()
  }


  override protected def beforeAll(): Unit = {
    println("*********** Before suite")
  }

  override protected def afterAll(): Unit = {
    println("*********** After suite")
  }

}
