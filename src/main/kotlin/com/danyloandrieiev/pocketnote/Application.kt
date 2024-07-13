package com.danyloandrieiev.pocketnote

import com.danyloandrieiev.pocketnote.plugins.configureLogging
import com.danyloandrieiev.pocketnote.plugins.configureRouting
import com.danyloandrieiev.pocketnote.plugins.configureSecurity
import com.danyloandrieiev.pocketnote.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureLogging()
    configureSecurity()
    configureSerialization()
    //configureDatabases()
    configureRouting()
}
