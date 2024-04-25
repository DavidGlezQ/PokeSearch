package data.network.response

import kotlinx.serialization.SerialName

/**
 * Created by davidgonzalez on 24/04/24
 */

data class SearchPokemonResponse(
    @SerialName("name") val name: String,
    @SerialName("types") val types: List<Type>,
)

data class Type(
    @SerialName("type") val type: TypeInfo
)

data class TypeInfo(
    @SerialName("name") val name: String
)
