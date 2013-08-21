//
// Author:  Bahman Movaqar (Bahman@BahmanM.com)
//
import sbt._
import Defaults._

libraryDependencies += sbtPluginExtra(
    m = "com.eed3si9n" % "sbt-assembly" % "0.9.1",
    sbtV = "0.12",
    scalaV = "2.9.2"
)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")
