package rubenshardt.ckl_challenge_kotlin.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by rubenshardtjunior on 21/12/16.
 */
@RealmClass
open class User : RealmObject() {

    @PrimaryKey
    @SerializedName("id")
    @Expose
    open var id: Int = 0

    @SerializedName("first_name")
    @Expose
    open var firstName: String? = null

    @SerializedName("last_name")
    @Expose
    open var lastName: String? = null

    @SerializedName("email")
    @Expose
    open var email: String? = null

    @SerializedName("key")
    @Expose
    open var key: String? = null
}