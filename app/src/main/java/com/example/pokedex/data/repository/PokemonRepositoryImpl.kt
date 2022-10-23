package com.example.pokedex.data.repository

import com.example.pokedex.data.source.remote.api.PokeApi
import com.example.pokedex.data.source.remote.responces.Pokemon
import com.example.pokedex.data.source.remote.responces.PokemonList
import com.example.pokedex.domen.repository.PokemonRepository
import com.example.pokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

/**
 * Created by Saidmurod Turdiyev (S.M.T) on 11/10/2022.
 */

class PokemonRepositoryImpl @Inject constructor(private val api: PokeApi) : PokemonRepository {
    override suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }

    override suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemonInfo(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }
}