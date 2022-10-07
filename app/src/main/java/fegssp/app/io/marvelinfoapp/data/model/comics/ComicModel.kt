package fegssp.app.io.marvelinfoapp.data.model.comics

import com.google.gson.annotations.SerializedName
import fegssp.app.io.marvelinfoapp.data.model.ThumbnailModel

data class ComicModel(

    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("thumbnail")
    val thumbnailModel: ThumbnailModel
) : java.io.Serializable
