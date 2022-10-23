package com.example.pokedex.util

/**
 * Created by Saidmurod Turdiyev (S.M.T) on 11/10/2022.
 */
sealed class Resource<T>(val date: T? = null, val message: String? = null) {
    class Success<T>(date: T) : Resource<T>(date)
    class Error<T>(message: String, date: T? = null) : Resource<T>(date, message)
}