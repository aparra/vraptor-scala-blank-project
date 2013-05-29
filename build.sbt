name := "VRaptor Scala Blank Project"

version := "0.1"

organization := "six2six"

scalaVersion := "2.10.1"

publishArtifact in packageWar := true

libraryDependencies ++= Seq(
  "br.com.caelum"           %  "vraptor"               % "3.5.1",
  "Caelum"					%% "vraptor-scala-plugin"  % "1.1"
)

libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.22" % "test->default"

resolvers += "Jetty Repo" at "http://repo1.maven.org/maven2/org/mortbay/jetty"

