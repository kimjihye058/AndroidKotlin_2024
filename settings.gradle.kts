pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AndPrj2"
include(":app")
include(":andlayouttest2")
include(":linlaytest4")
include(":tabletest")
include(":and_cal_table")
include(":and_grid")
include(":andbmi")
include(":andtimetest1")
