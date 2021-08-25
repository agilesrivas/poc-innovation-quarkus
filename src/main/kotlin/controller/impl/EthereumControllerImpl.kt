package controller.impl

import controller.EthereumController
import org.eclipse.microprofile.openapi.annotations.tags.Tag
import service.impl.EthereumServiceImpl
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/ethereum")
@Tag(name = "Ethereum Gas")
class EthereumControllerImpl : EthereumController {

    @Inject
    lateinit var ethereumService: EthereumServiceImpl;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    override fun getEthereum(): Response {
        return Response.ok(ethereumService.getEthereum()).build();
    }
}