package com.teste.santander.model

import com.teste.santander.utils.Constants.Companion.SERIALIZABLE_STATEMENT_LIST
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class StatementResponse(
        @SerializedName(SERIALIZABLE_STATEMENT_LIST) @Expose val statementList: ArrayList<Statement>)
