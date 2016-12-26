package rubenshardt.ckl_challenge_kotlin.models

import io.realm.RealmObject
import io.realm.annotations.RealmClass

/**
 * Created by rubenshardtjunior on 21/12/16.
 */
@RealmClass
open class Image : RealmObject() {

    open var id: Int = 0

    open var url: String? = null
}