plugins {
    groovy
    id("com.gradle.build-scan") version "2.3"
    id("org.gradle.guides.getting-started") version "0.15.5"
    id("org.gradle.guides.test-jvm-code") version "0.15.5"
    id("org.gradle.guides.ci.travis") version "0.15.5"
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
}

configure<org.gradle.guides.ci.TravisExtension> {
    encryptedVariables.add("inyvb2QHJhWRtBUZdjOHDs8ZMSkLYVYDE+1rcxVmy9rPQPBWdE/4eKxCTWVnz4mWzSpx8XvWUNUEQFkpcZTktp8Detb0uqZJenujt3uCRUsM3VcjFujEbBq05PDA4hB9zflWAhZLV50cysQIFpFGjfXqudkrGvHpCuf2yGNsRfkf/24n9WnyNfbq+M3fJ6e3IQZHXun+OB88LwfUH5/Pc7NNsnRhG6HopOzIPEsPVXMcJLe0rQUrrlk5D9UZpgmF6Srn8Bn+FBQMUAtpRIBnkr16WyyXJfAIibOKjQ9sk+j/HAK+ybFRKOuy2dOL2HVb2GpKKm5+hlkWMxZ/kPQRMGspvod9XYc/WKqXZLrb4wVpyuxdy0hGR1NbDVMWROlVHfQFmwacMmbKNp0nNTOCwJXe2ILsQ8PCAZCHrAyikgfwtWa5sfUwA9CwO/YFLJXA3/cyR2QgMQlEXfqrus9GWqVcd9A+9PaGpZjRCPrHioFJlIA0u/hzCKdZCSuakmWxc68Gte3F7lje0kJnIuGaqkonpiq3LcsPM461gdTHjNevDML0OdiBvtGeE+vILYlMMq0reYkyv011BTxcX8mws3VfusHvJ5ak9xgvNsfD8kHvpfIMeHgLnU9m5SuGLVvcLxSEpxyrkNXCO5XVUgNlPmx+L7ZUVBaY1AvFMX4eaP8=")
}