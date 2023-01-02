package org.dnyanyog
package test

import common.{BaseTest, WebDriverFactory}

import org.dnyanyog.pages.LoginPage

class LoginTest extends BaseTest {

  "test" should "loging with successful" in{
    println("********* Test started")
    Thread.sleep(5000)
    new LoginPage().login("admin","admin123").verifyWelcomeText("Welcome Admin")
  }

  /*"test" should "loging with un successful" in{
    println("********* Test started")
    assert(false)
  }
*/
}
