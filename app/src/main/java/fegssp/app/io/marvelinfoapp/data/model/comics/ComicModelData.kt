package fegssp.app.io.marvelinfoapp.data.model.comics

import com.google.gson.annotations.SerializedName

data class ComicModelData(
    @SerializedName("results")
    val results: List<ComicModel>
) : java.io.Serializable
