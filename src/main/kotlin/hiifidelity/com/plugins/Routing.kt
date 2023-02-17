package hiifidelity.com.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.autohead.*
import io.ktor.server.application.*

fun Application.configureRouting() {

	install(AutoHeadResponse)
	routing {
		get("/") {
			call.respondText("Hello World!")
		}
		singlePageApplication {
			useResources = true
			filesPath = "web/hiifidelity/static"
			defaultPage = "main.html"
			ignoreFiles { it.endsWith(".txt") }
		}
	}
}
