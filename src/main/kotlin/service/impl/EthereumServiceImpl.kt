package service.impl

import data.Ethereum
import org.eclipse.microprofile.rest.client.inject.RestClient
import service.EthereumAPIService
import service.EthereumService
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
class EthereumServiceImpl : EthereumService {

    @Inject
    @field: RestClient
    lateinit var ethereumService: EthereumAPIService

    override fun getEthereum(): Ethereum {
       val ethereum:Ethereum = ethereumService.getEthereum();
        // TODO: Ethereum debe ser enviado por producer.
        return ethereum;
    }
}