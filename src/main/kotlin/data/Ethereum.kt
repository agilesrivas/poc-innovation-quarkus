package data

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = false)
data class Ethereum(
    val fast: Int = 0,
    val fastest: Int = 0,
    val safeLow: Int = 0,
    val average: Int = 0,
    @field: JsonProperty("block_time")
    val blockTime: Double  = 0.0,
    val blockNum: Int = 0,
    val speed: Double  = 0.0,
    val safeLowWait: Int = 0,
    val avgWait: Int = 0,
    val fastWait: Double  = 0.0,
    val fastestWait: Double  = 0.0,
    val gasPriceRange: HashMap<String, Double>? = null
)
