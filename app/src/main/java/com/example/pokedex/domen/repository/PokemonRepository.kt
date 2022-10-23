package com.example.pokedex.domen.repository

import com.example.pokedex.data.source.remote.responces.Pokemon
import com.example.pokedex.data.source.remote.responces.PokemonList
import com.example.pokedex.util.Resource

/**
 * Created by Saidmurod Turdiyev (S.M.T) on 11/10/2022.
 */
interface PokemonRepository {
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList>
    suspend fun getPokemonInfo(pokemonName:String): Resource<Pokemon>
}