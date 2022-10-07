package fegssp.app.io.marvelinfoapp.data.model.comics

import com.google.gson.annotations.SerializedName

data class ComicModelResponse(
    @SerializedName("data")
    val data: ComicModelData
): java.io.Serializable
