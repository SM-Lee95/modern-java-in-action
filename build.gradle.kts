plugins {
	java
	id("org.springframework.boot") version "3.1.3"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	// https://mvnrepository.com/artifact/org.openjdk.jmh/jmh-core
	testImplementation("org.openjdk.jmh:jmh-core:1.21")
	// https://mvnrepository.com/artifact/org.openjdk.jmh/jmh-generator-annprocess
	testImplementation("org.openjdk.jmh:jmh-generator-annprocess:1.21")
	// Dependency on local binaries
	implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
}

tasks.withType<Test> {
	useJUnitPlatform()
}
