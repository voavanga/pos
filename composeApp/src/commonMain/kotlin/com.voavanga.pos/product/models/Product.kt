package com.voavanga.pos.models

import io.realm.kotlin.ext.realmListOf
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

class Product : RealmObject {
    @PrimaryKey
    var id: String = ""
    var name: String = ""
    var price: Double = 0.0
    var tags = realmListOf<String>()
}
