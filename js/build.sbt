enablePlugins(ScalaJSPlugin, ScalaJSWeb)

libraryDependencies += "com.thoughtworks.binding" %%% "dom" % "10.0.0-M9"

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

persistLauncher in Compile := true
