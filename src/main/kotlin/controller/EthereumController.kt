package controller

import javax.ws.rs.core.Response

interface EthereumController {
    fun getEthereum(): Response;
}