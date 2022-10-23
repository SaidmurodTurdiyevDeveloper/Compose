package com.example.pokedex.data.source.remote.responces

data class PokemonList(
    val count: Int,
    val next: String,
    val previous: Any,
    val results: List<Result>
)