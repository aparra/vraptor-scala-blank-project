name := "VRaptor Scala Blank Project"

version := "0.1"

organization := "six2six"

scalaVersion := "2.10.1"

crossScalaVersions := Seq("2.9.2", "2.10.1")

seq(webSettings :_*)

libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.22" % "container"

libraryDependencies ++= Seq(
  "br.com.caelum"           %  "vraptor"               % "3.5.1",
  "Caelum"					%% "vraptor-scala-plugin"  % "1.4"
)

libraryDependencies += "org.fusesource.scalate" %% "scalate-core" % "1.6.1"

resolvers ++= Seq(
  "Local Maven Repository" at "file:///"+ Path.userHome +"/.m2/repository"
)

EclipseKeys.withSource := true
