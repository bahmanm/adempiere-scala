//
// Author:  Bahman Movaqar (Bahman@BahmanM.com)
//
import AssemblyKeys._

assemblySettings

name := "ADempiere Customisations"

version := "0.1"

scalaVersion := "2.10.2"

scalaHome := Some(file("C:/Bin/Scala/2.10.2/"))

javaHome := Some(file("C:/Bin/Java/jdk1.6.0_45"))

javacOptions ++= Seq("-source", "1.6", "-target", "1.6", "-encoding", "utf8")

jarName in assembly := "customization.jar"

excludedJars in assembly <<= (fullClasspath in assembly) map { cp => 
  cp filter { i => i.data.getName == "Adempiere.jar" || 
				   i.data.getName == "AdempiereCLib.jar" ||
				   i.data.getName == "AdempiereSLib.jar" }
}

