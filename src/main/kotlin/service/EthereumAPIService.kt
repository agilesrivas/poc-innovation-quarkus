package service

import data.Ethereum
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/api")
@RegisterRestClient(configKey = "ethereum_api")
interface EthereumAPIService : EthereumService {

    @GET
    @Path("/ethgasAPI.json")
    @Produces(MediaType.APPLICATION_JSON)
    override fun getEthereum(): Ethereum

}