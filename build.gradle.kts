plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.compileJava {
    options.compilerArgs.addAll(listOf("--enable-preview"))
}

tasks.compileTestJava {
    options.compilerArgs.addAll(listOf("--enable-preview"))
}

tasks.test {
    useJUnitPlatform()
    jvmArgs("--enable-preview")
}