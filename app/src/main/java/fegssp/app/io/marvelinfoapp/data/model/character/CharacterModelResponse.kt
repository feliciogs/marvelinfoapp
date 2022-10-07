package fegssp.app.io.marvelinfoapp.data.model.character

import com.google.gson.annotations.SerializedName

data class CharacterModelResponse(
    @SerializedName("data")
    val data: CharacterModelData
): java.io.Serializable
