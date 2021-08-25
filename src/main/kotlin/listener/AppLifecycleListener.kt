package listener

import io.quarkus.runtime.ShutdownEvent
import io.quarkus.runtime.StartupEvent
import org.jboss.logging.Logger
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.event.Observes

@ApplicationScoped
class AppLifecycleListener {

    var logger: Logger = Logger.getLogger("Lifecycle")

    fun onStart(@Observes startupEvent: StartupEvent?) {
        logger.info("onStart executed")
    }

    fun onStop(@Observes shutdownEvent: ShutdownEvent?) {
        logger.info("onStop executed")
    }
}