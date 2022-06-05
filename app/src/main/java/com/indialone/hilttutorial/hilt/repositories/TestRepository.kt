package com.indialone.hilttutorial.hilt.repositories

import com.indialone.hilttutorial.hilt.datalayer.DataLayer


class TestRepository {

    private val dataLayer = DataLayer()

    fun getAllStudentsNames(): List<String> {
        return dataLayer.getListOfStudentsNames()
    }
}