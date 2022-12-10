package ru.ohapegor.springgraphqlsecuritybug.controller

import org.slf4j.LoggerFactory
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Controller

@Controller
class TestGraphqlController {

    val log = LoggerFactory.getLogger(this::class.java)

    @QueryMapping("hello")
    @PreAuthorize("hasRole('USER')")
    fun hello(auth: Authentication): String {
        log.info("hello: {}", auth)
        return "hello"
    }
}