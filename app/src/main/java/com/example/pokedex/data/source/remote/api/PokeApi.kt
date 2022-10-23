package com.example.pokedex.data.source.remote.api

import com.example.pokedex.data.source.remote.responces.Pokemon
import com.example.pokedex.data.source.remote.responces.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by Saidmurod Turdiyev (S.M.T) on 11/10/2022.
 */
interface PokeApi {
    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(@Path("name") name: String): Pokemon
}