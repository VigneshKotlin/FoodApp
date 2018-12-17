package com.foodapp.app.home.model

import com.google.gson.annotations.SerializedName

data class FoodListModel(@SerializedName("Currency")
                         val currency: String = "",
                         @SerializedName("FoodList")
                         val foodList: List<FoodListItem>?,
                         @SerializedName("status")
                         val status: Status)