package com.example.pokedex.data.source.remote.responces

data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)