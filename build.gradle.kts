plugins {
    groovy
    id("com.gradle.build-scan") version "2.2.1"
    id("org.gradle.guides.getting-started") version "0.15.5"
    id("org.gradle.guides.test-jvm-code") version "0.15.5"
}

repositories {
    maven {
        url = uri("https://repo.gradle.org/gradle/libs")
    }
}

dependencies {
    constraints {
        testImplementation("org.codehaus.groovy:groovy-all:2.5.3")
    }
}

guide {
    repoPath = "gradle-guides/building-java-applications"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
    if (!System.getenv("CI").isNullOrEmpty()) {
        publishAlways()
        tag("CI")
    }
}