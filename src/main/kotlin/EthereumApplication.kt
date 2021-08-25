import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition
import org.eclipse.microprofile.openapi.annotations.info.Contact
import org.eclipse.microprofile.openapi.annotations.info.Info
import org.eclipse.microprofile.openapi.annotations.info.License
import javax.ws.rs.core.Application

@OpenAPIDefinition(
        info = Info(
                title = "Innovation Ethereum Gas API",
                version = "1.0.0-SNAPSHOT",
                contact = Contact(
                        name = "Quarkus API Support",
                        url = "https://quarkus.io/get-started/",
                        email = "a.giles.rivas"
                ),
                license = License(
                        name = "Quarkus",
                        url = "https://creativecommons.org/licenses/by/3.0/"
                )
        )
)
class EthereumApplication : Application() {}