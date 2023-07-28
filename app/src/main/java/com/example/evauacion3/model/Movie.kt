package com.example.evauacion3.model

data class Movie(
    val id: Int,
    val original_title: String,
    val backdrop_path: String = "",
)
fun getData(): List<Movie> = listOf(
    Movie(298618,"The Flash","https://image.tmdb.org/t/p/original///yF1eOkaYvwiORauRCPWznV9xVvi.jpg"),
    Movie(346698,"Barbie Land","https://image.tmdb.org/t/p/original//iuFNMS8U5cb6xfzi51Dbkovj7vM.jpg"),
    Movie(1076487,"Fast X" ,"https://image.tmdb.org/t/p/original///4XM8DUTQb3lhLemJC51Jx4a2EuA.jpg"),
    Movie(872585,"Oppenheimer","https://image.tmdb.org/t/p/original//8Gxv8gSFCU0XGDykEGv7zR1n2ua.jpg"),
)
