package com.danyloandrieiev.pocketnote.authentication

import com.auth0.jwt.JWT
import com.auth0.jwt.JWTVerifier
import com.auth0.jwt.algorithms.Algorithm
import io.ktor.server.application.*

class JwtService(environment: ApplicationEnvironment) {
    private val issuer = environment.config.property("jwt.issuer").getString()
    private val secret = environment.config.property("jwt.secret").getString()
    private val algorithm = Algorithm.HMAC512(secret)

    private val verifier: JWTVerifier = JWT
        .require(algorithm)
        .withIssuer(issuer)
        .build()
}