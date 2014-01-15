import sbt._
import Keys._

object SmackBuild extends Build {

    lazy val root = Project(id = "root", base = file(".")) aggregate(smack)

    lazy val smack = Project(id = "smack", base = file("smack"), 
    	settings = Project.defaultSettings ++ bintray.Plugin.bintraySettings)
}