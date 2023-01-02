package org.dnyanyog
package common

import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.WebDriverWait

import java.time.Duration

trait BasePage {
  protected val webDriverWait:WebDriverWait = new WebDriverWait(WebDriverFactory.getDriver,Duration.ofSeconds(20))
}
