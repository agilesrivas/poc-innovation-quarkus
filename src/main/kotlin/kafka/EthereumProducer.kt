package kafka

import data.Ethereum
import io.reactivex.Flowable
import org.eclipse.microprofile.reactive.messaging.Outgoing
import service.impl.EthereumServiceImpl
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject

@ApplicationScoped
class EthereumProducer {

    @Inject
    lateinit var ethereumService: EthereumServiceImpl;

    fun producer(eth : Ethereum) : Ethereum {
        return eth;
    }

    @Outgoing("ethereum-key")
    fun producerEthereumInfo() : Flowable<Ethereum>? { return  null;}
}