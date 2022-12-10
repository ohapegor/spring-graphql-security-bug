package ru.ohapegor.springgraphqlsecuritybug

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringGraphqlSecurityBugApplication

fun main(args: Array<String>) {
    runApplication<SpringGraphqlSecurityBugApplication>(*args)
}
