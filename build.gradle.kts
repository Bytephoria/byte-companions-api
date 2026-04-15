plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = rootProject.group.toString()
            artifactId = "${rootProject.name}-api"
            version = project.version.toString()

            from(components["java"])
        }
    }
}
