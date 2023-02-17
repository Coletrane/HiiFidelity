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
		// Static plugin. Try to access `/static/index.html`
		static("/static") {
			resources("static")
		}
	}
}
