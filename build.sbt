name := "msgpack4s"

// Remove -SNAPSHOT from the version before publishing a release. Don't forget to change the version to
// $(NEXT_VERSION)-SNAPSHOT afterwards!
version := "0.4.3"

organization := "org.velvia"

crossScalaVersions := Seq("2.10.4", "2.11.5", "2.12.8", "2.13.1")

unmanagedSourceDirectories in Compile ++= Seq(baseDirectory.value / "src")

unmanagedSourceDirectories in Test ++= Seq(baseDirectory.value / "test")

// Testing deps
libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.8" % "test",
                            "org.mockito" % "mockito-all" % "1.9.0" % "test")

licenses += ("Apache-2.0", url("http://choosealicense.com/licenses/apache/"))
