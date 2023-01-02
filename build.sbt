    name := "selenium-scala"
    version := "0.1"
    scalaVersion := "2.13.10"
    idePackagePrefix := Some("org.dnyanyog")

    libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "4.7.2"
    libraryDependencies += "org.apache.poi" % "poi" % "5.2.3"
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.14"
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14"
    libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.14"
