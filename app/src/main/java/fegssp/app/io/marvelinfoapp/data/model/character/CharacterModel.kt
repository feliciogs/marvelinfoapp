package fegssp.app.io.marvelinfoapp.data.model.character

import com.google.gson.annotations.SerializedName
import fegssp.app.io.marvelinfoapp.data.model.ThumbnailModel

data class CharacterModel(

    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name:String,
    @SerializedName("description")
    val description:String,
    @SerializedName("thumbnail")
    val thumbnail: ThumbnailModel
): java.io.Serializable