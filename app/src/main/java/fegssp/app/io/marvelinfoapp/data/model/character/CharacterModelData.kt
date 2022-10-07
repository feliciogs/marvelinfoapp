package fegssp.app.io.marvelinfoapp.data.model.character

import com.google.gson.annotations.SerializedName

data class CharacterModelData(
    @SerializedName("results")
    val results: List<CharacterModel>
): java.io.Serializable
