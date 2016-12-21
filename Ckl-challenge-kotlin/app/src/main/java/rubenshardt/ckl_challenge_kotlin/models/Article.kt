package rubenshardt.ckl_challenge_kotlin.models

/**
 * Created by rubenshardtjunior on 21/12/16.
 */

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class Article : RealmObject() {

    @PrimaryKey
    @SerializedName("id")
    @Expose
    open var id: Int = 0

    @SerializedName("title")
    @Expose
    open var title: String? = null

    @SerializedName("website")
    @Expose
    open var website: String? = null

    @SerializedName("authors")
    @Expose
    open var authors: String? = null

    @SerializedName("date")
    @Expose
    open var date: String? = null

    @SerializedName("content")
    @Expose
    open var content: String? = null

    @SerializedName("tags")
    @Expose
    open var tags: RealmList<Tag>? = null

    @SerializedName("image")
    @Expose
    open var image: Image? = null

    open var read: Boolean = false
}