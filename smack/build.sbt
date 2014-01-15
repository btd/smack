import bintray.Keys._

seq(bintrayPublishSettings:_*)

name := "smack"

version := "3.3.1"

resolvers += ("btd maven" at "http://dl.bintray.com/content/btd/maven")

libraryDependencies += "xpp3" % "xpp3" % "1.1.4c"

libraryDependencies += "org.dnsjava" % "dnsjava" % "2.1.6"

description := "Easy to use Java XMPP client library"

homepage := Some(url("http://www.igniterealtime.org/projects/smack/index.jsp"))

licenses += ("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

publishArtifact in Test := false

crossPaths := false