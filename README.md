## About this plugins

### Setup

Requires a Java JDK 1.7+, Gradle 1.8+, and Ant 1.9+ to be installed, once in place the process is fully automated to resolved dependencies and package the plugin.

### Configuration

Controlling the version to be generated and metadata about the plugin is done in `gradle.propeties` and will be injected via token replacement into the generated plugin.

For updates, increment the `pluginVersion` value to the next integer, the release-notes section in `src/main/resources/info.xml`, and the upgrade migration process if applicable in `src/main/resources/upgrade.xml`.

### Build Process

When you are ready to build, go the root of your cloned repo and run:

    gradle distPlugin

Upon a successful build, the new plugin will be located in `build/distributions/${pluginName}-${pluginVersion}.zip` you can change this in the `build.gradle` file if desired.
