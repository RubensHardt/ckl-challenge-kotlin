package rubenshardt.ckl_challenge_kotlin

/**
 * Created by rubenshardtjunior on 21/12/16.
 */

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class Application : Application() {

    override fun onCreate() {
        super.onCreate()
        val realmConfig = RealmConfiguration.Builder(
                this).deleteRealmIfMigrationNeeded().build()
        Realm.setDefaultConfiguration(realmConfig)
        }
}
