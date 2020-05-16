plugins {
    java
    id("com.github.johnrengelman.shadow") version "5.1.0"
    id("io.freefair.lombok") version "5.0.1"

}


dependencies {
    compileOnly("software.amazon.kinesis:amazon-kinesis-client:2.2.3")
    compileOnly("software.amazon.awssdk:dynamodb:2.9.16")
    compileOnly("software.amazon.awssdk:sqs:2.9.16")
    compileOnly("software.amazon.awssdk:s3:2.9.16")
    compile("org.slf4j:slf4j-api:1.7.28")
    compile("org.junit.jupiter:junit-jupiter-api:5.5.2")
    compile("org.jetbrains:annotations:17.0.0")
    testCompile(project(":reactor-aws-test"))
    testCompile("org.junit.jupiter:junit-jupiter-engine:5.5.2")
    testCompile("org.mockito:mockito-junit-jupiter:3.0.0")
    testCompile("io.projectreactor:reactor-test:3.3.0.RELEASE")
    //testCompile("org.testcontainers:testcontainers:1.12.2")
    testCompile("org.assertj:assertj-core:3.13.2")


    testCompileOnly("software.amazon.kinesis:amazon-kinesis-client:2.2.3")
    testCompileOnly("software.amazon.awssdk:dynamodb:2.9.16")
    testCompileOnly("software.amazon.awssdk:sqs:2.9.16")
    testCompileOnly("software.amazon.awssdk:s3:2.9.16")

    testRuntimeOnly("software.amazon.kinesis:amazon-kinesis-client:2.2.3")
    testRuntimeOnly("software.amazon.awssdk:dynamodb:2.9.16")
    testRuntimeOnly("software.amazon.awssdk:sqs:2.9.16")
    testRuntimeOnly("software.amazon.awssdk:s3:2.9.16")

    compileOnly("io.projectreactor:reactor-core:3.3.0.RELEASE")
    compileOnly("io.projectreactor.addons:reactor-extra:3.3.0.RELEASE")
    compileOnly("ch.qos.logback:logback-classic:1.2.3")

}
