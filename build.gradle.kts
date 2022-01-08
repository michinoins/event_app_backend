import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
	id("org.springframework.boot") version "2.6.2"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
  kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"
  id ("org.seasar.doma.compile") version "1.1.0"

}

configurations {
  compileOnly {
    extendsFrom(configurations.annotationProcessor.get())
  }
}


group = "com.event_app_backend"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

  /* doma */
  annotationProcessor ("org.seasar.doma:doma-processor:2.50.0")
  implementation ("org.seasar.doma.boot:doma-spring-boot-starter:1.5.0")
  implementation("org.seasar.doma:doma-kotlin:2.50.0")

}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

