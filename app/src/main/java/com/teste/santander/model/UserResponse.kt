package com.teste.santander.model

import com.teste.santander.utils.Constants.Companion.SERIALIZABLE_USER_ACCOUNT
import com.google.gson.annotations.SerializedName

class UserResponse(
        @SerializedName(SERIALIZABLE_USER_ACCOUNT) val userAccount: User)