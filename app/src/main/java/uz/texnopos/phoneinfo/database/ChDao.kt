package uz.texnopos.phoneinfo.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ChDao {

    @Query("Select * FROM characterisics Where phoneId=:id")
    fun getCharachteristics(id: Int): List<Characteristics>
}