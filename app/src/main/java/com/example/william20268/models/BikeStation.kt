package com.example.william20268.models


class Position(val address: String, var lat: Double, var lng: Double)

class BikeStation(val number: Int, val address: String, var position: Position)

data class AddrPosit(val address: String, val position: Position)

class Stations(val stations: List<BikeStation>)