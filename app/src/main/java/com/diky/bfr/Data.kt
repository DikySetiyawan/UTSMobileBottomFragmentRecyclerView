package com.diky.bfr

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.parcelize.Parceler

@Parcelize
data class Data(val name: String?, val imageId: Int, val deskripsi: String?) : Parcelable {

        constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt(),
            parcel.readString()
        )


    companion object : Parceler<Data> {
        override fun Data.write(parcel: Parcel, flags: Int) {
            parcel.writeInt(imageId)
            parcel.writeString(name)
            parcel.writeString(deskripsi)
        }

        override fun create(parcel: Parcel): Data {
            return Data(parcel)
        }

    }
}




