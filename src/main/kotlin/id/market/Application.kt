package id.market

import io.ktor.server.application.*
import id.market.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureRouting()
    configureHTTP()
    configureMonitoring()
    configureSerialization()
}
