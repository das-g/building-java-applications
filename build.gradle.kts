plugins {
    id("com.gradle.build-scan") version "1.11"
    id("org.gradle.guides.getting-started") version "0.10.3"
    id("org.gradle.guides.test-jvm-code") version "0.10.3"
}

configure<org.gradle.guides.GuidesExtension> {
    repoPath = "gradle-guides/creating-java-applications"
    mainAuthor = "Ken Kousen"
}

buildScan {
    setLicenseAgreementUrl("https://gradle.com/terms-of-service")
    setLicenseAgree("yes")
    if (!System.getenv("CI").isNullOrEmpty()) {
        publishAlways()
        tag("CI")
    }
}
