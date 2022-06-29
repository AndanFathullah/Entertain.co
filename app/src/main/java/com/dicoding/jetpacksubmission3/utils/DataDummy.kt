package com.dicoding.jetpacksubmission3.utils

import com.dicoding.jetpacksubmission3.data.source.local.entity.*
import com.dicoding.jetpacksubmission3.data.source.remote.response.MoviesResponse
import com.dicoding.jetpacksubmission3.data.source.remote.response.MoviesTrendResponse
import com.dicoding.jetpacksubmission3.data.source.remote.response.TvPopularResponse
import com.dicoding.jetpacksubmission3.data.source.remote.response.TvShowResponse

object DataDummy {


    fun generateRemoteMovies(): List<MoviesResponse>{
        val movies = ArrayList<MoviesResponse>()
        movies.add(MoviesResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5
        ))
        movies.add(MoviesResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5
        ))
        movies.add(MoviesResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5
        ))
        movies.add(MoviesResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5
        ))
        movies.add(MoviesResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5
        ))
        return movies
    }
    fun generateRemoteMoviesTrend(): List<MoviesTrendResponse>{
        val moviesTrend = ArrayList<MoviesTrendResponse>()
        moviesTrend.add(MoviesTrendResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5
        ))
        moviesTrend.add(MoviesTrendResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5
        ))
        moviesTrend.add(MoviesTrendResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5
        ))
        moviesTrend.add(MoviesTrendResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5
        ))
        moviesTrend.add(MoviesTrendResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5
        ))
        return moviesTrend
    }
    fun generateRemoteDummyMovies(): MoviesResponse{
        return MoviesResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5)
    }
    fun generateRemoteDummyMoviesTrend(): MoviesResponse{
        return MoviesResponse("R.drawable.banner_a_star",
            listOf(),1, "A Star is Born","Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            10.0,"R.drawable.poster_a_start_is_born","2018",200,"A Star is Born","https://www.youtube.com/watch?v=nSbzyEJ8X9E",
            7.5)
    }
    fun generateRemoteTvShow(): List<TvShowResponse>{
        val tvShow = ArrayList<TvShowResponse>()
        tvShow.add(
            TvShowResponse("R.drawable.banner_arrow",  listOf(44),"2012",
                listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
            ))
        tvShow.add(
            TvShowResponse("R.drawable.banner_arrow",  listOf(44),"2012",
                listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
            ))
        tvShow.add(
            TvShowResponse("R.drawable.banner_arrow",  listOf(44),"2012",
                listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
            ))
        tvShow.add(
            TvShowResponse("R.drawable.banner_arrow",  listOf(44),"2012",
                listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
            ))
        tvShow.add(
            TvShowResponse("R.drawable.banner_arrow",  listOf(44),"2012",
                listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
            ))
        return tvShow
    }
    fun generateRemoteTvShowTrend(): List<TvPopularResponse> {
        val tvTrend = ArrayList<TvPopularResponse>()
        tvTrend.add(
            TvPopularResponse("R.drawable.banner_arrow",  listOf(44),"2012",
                listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
            ))
        tvTrend.add(
            TvPopularResponse("R.drawable.banner_arrow",  listOf(44),"2012",
                listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
            ))
        tvTrend.add(
            TvPopularResponse("R.drawable.banner_arrow",  listOf(44),"2012",
                listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
            ))
        tvTrend.add(
            TvPopularResponse("R.drawable.banner_arrow",  listOf(44),"2012",
                listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
            ))
        tvTrend.add(
            TvPopularResponse("R.drawable.banner_arrow",  listOf(44),"2012",
                listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
            ))
        return tvTrend
    }
    fun generateRemoteDummyTvShow(): TvShowResponse{
        return TvShowResponse("R.drawable.banner_arrow",  listOf(44),"2012",
            listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            "R.drawable.poster_arrow",7.2,  "https://www.youtube.com/watch?v=2yrviapP5uY"
        )
    }
    fun generateRemoteDummyTvShowTrend(): TvShowResponse {
        return TvShowResponse("R.drawable.banner_arrow",  listOf(44),"2012",
            listOf(),1,"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
            "R.drawable.poster_arrow",7.2, "https://www.youtube.com/watch?v=2yrviapP5uY"
        )
    }


    fun generateMovies(): List<MoviesEntity>{
        val movies = ArrayList<MoviesEntity>()
        movies.add(
            MoviesEntity(1, "A Star is Born","2018",
                "Action, Science Fiction, Adventure","2h 16min",7.2,
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "R.drawable.poster_a_start_is_born", "R.drawable.banner_a_star", "https://www.youtube.com/watch?v=nSbzyEJ8X9E"
            )
        )
        movies.add(
            MoviesEntity(2, "Alita","2019",
                "Action, Science Fiction, Adventure","2h 2min",7.2,
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "R.drawable.poster_alita", "R.drawable.banner_alita", "https://www.youtube.com/watch?v=w7pYhpJaJW8"
            )
        )
        movies.add(
            MoviesEntity(3, "Aquaman","2018",
                "Action, Science Fiction, Adventure","2h 23min",7.2,
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "R.drawable.poster_aquaman", "R.drawable.banner_aquaman", "https://www.youtube.com/watch?v=WDkg3h8PCVU"
            )
        )
        movies.add(
            MoviesEntity(4, "Bohemian Rapsody","2018",
                "Action, Science Fiction, Adventure","2h 15min",7.2,
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "R.drawable.poster_bohemian", "R.drawable.banner_bohemian", "https://www.youtube.com/watch?v=mP0VHJYFOAU"
            )
        )
        movies.add(
            MoviesEntity(5, "Cold Pursiut","2019",
                "Action, Science Fiction, Adventure","1h 59min",7.2,
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "R.drawable.poster_cold_persuit", "R.drawable.banner_cold_pursuit", "https://www.youtube.com/watch?v=7C2Nad0aMPg"
            )
        )
        movies.add(
            MoviesEntity(6, "Creed II","2018",
                "Action, Science Fiction, Adventure","2h 10min",7.2,
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "R.drawable.poster_creed", "R.drawable.banner_creed", "https://www.youtube.com/watch?v=u22BXhMu4tI"
            )
        )
        movies.add(
            MoviesEntity(7, "Fantastic Beast: The Crimes of Grindelwald","2018",
                "Action, Science Fiction, Adventure","2h 14min",7.2,
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "R.drawable.poster_crimes", "R.drawable.banner_crimes", "https://www.youtube.com/watch?v=vvFybpmyB9E"
            )
        )
        movies.add(
            MoviesEntity(8, "Glass","2019",
                "Action, Science Fiction, Adventure","2h 9min",7.2,
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "R.drawable.poster_glass", "R.drawable.banner_glass", "https://www.youtube.com/watch?v=95ghQs5AmNk"
            )
        )
        movies.add(
            MoviesEntity(9, "How To Train Your Dragon: The Hidden World","2019",
                "Action, Science Fiction, Adventure","1h 44min",7.2,
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "R.drawable.poster_how_to_train", "R.drawable.banner_how_to", "https://www.youtube.com/watch?v=CQ7XUCQ6pbE"
            )
        )
        movies.add(
            MoviesEntity(10, "Avenger: Infinity War","2018",
                "Action, Science Fiction, Adventure","2h 29min",7.2,
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "R.drawable.poster_infinity_war", "R.drawable.banner_infinity", "https://www.youtube.com/watch?v=6ZfuNTqbHE8"
            )
        )
        movies.add(
            MoviesEntity(11, "Robin Hood","2018",
                "Action, Science Fiction, Adventure","1h 56min",7.2,
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "R.drawable.poster_robin_hood", "R.drawable.banner_robin_hood", "https://www.youtube.com/watch?v=zwPn9ZnbCo0"
            )
        )
        movies.add(
            MoviesEntity(12, "Serenity","2019",
                "Action, Science Fiction, Adventure","1h 42min",7.2,
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                "R.drawable.poster_serenity", "R.drawable.banner_serenity", "https://www.youtube.com/watch?v=k3zMlsEK8xA"
            )
        )
        movies.add(
            MoviesEntity(13, "Spiderman: Into The Spider Verse","2018",
                "Action, Science Fiction, Adventure","1h 57min",7.2,
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                ".drawable.poster_spiderman", "R.drawable.banner_spiderman", "https://www.youtube.com/watch?v=g4Hbz2jLxvQ"
            )
        )
        movies.add(
            MoviesEntity(14, "T34","2018",
                "Action, Science Fiction, Adventure","2h 19min",7.2,
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                "R.drawable.poster_t34", "R.drawable.banner_t34", "https://www.youtube.com/watch?v=a5A7QboG8Nk"
            )
        )
        return movies
    }
    fun generateMoviesTrend(): List<MovieTrendEntity>{
        val moviesTrend = ArrayList<MovieTrendEntity>()
        moviesTrend.add(
            MovieTrendEntity(15, "Mary Queen of Scots","2018",
                "Action, Science Fiction, Adventure","2h 4min",7.2,
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                "R.drawable.poster_marry_queen", "R.drawable.banner_queen", "https://www.youtube.com/watch?v=T5l8cvuo7IA"
            )
        )
        moviesTrend.add(
            MovieTrendEntity(16, "Master Z: Ip Man Legacy","2018",
                "Action, Science Fiction, Adventure","1h 47min",7.2,
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                "R.drawable.poster_master_z", "R.drawable.banner_masterz","https://www.youtube.com/watch?v=B5HI4VsXvIQ"
            )
        )
        moviesTrend.add(
            MovieTrendEntity(17, "Mortal Engine","2018",
                "Action, Science Fiction, Adventure","2h 9min",7.2,
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to ",
                "R.drawable.poster_mortal_engines", "R.drawable.banner_mortal_engines","https://www.youtube.com/watch?v=IRsFc2gguEg"
            )
        )
        moviesTrend.add(
            MovieTrendEntity(18, "Overlord","2018",
                "Action, Science Fiction, Adventure","1h 50min",7.2,
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "R.drawable.poster_overlord", "R.drawable.banner_overlord","https://www.youtube.com/watch?v=USPd0vX2sdc"
            )
        )
        moviesTrend.add(
            MovieTrendEntity(19, "Ralph Breaks The Internet","2018",
                "Action, Science Fiction, Adventure","1h 52min",7.2,
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                "R.drawable.poster_ralph", "R.drawable.banner_ralph","https://www.youtube.com/watch?v=_BcYBFC6zfY"
            )
        )
        return moviesTrend
    }

    fun generateDummyMovies(): List<MoviesDetailEntity>{
        val movies = ArrayList<MoviesDetailEntity>()
        movies.add(
            MoviesDetailEntity(1, "A Star is Born","2018",
                listOf("Action", "Science Fiction", "Adventure"),"2h 16min",7.2,
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                "R.drawable.poster_a_start_is_born", "R.drawable.banner_a_star", "https://www.youtube.com/watch?v=nSbzyEJ8X9E"
            )
        )
        movies.add(
            MoviesDetailEntity(2, "Alita","2019",
                listOf("Action", "Science Fiction", "Adventure"),"2h 2min",7.2,
                "When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.",
                "R.drawable.poster_alita", "R.drawable.banner_alita", "https://www.youtube.com/watch?v=w7pYhpJaJW8"
            )
        )
        movies.add(
            MoviesDetailEntity(3, "Aquaman","2018",
                listOf("Action", "Science Fiction", "Adventure"),"2h 23min",7.2,
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "R.drawable.poster_aquaman", "R.drawable.banner_aquaman", "https://www.youtube.com/watch?v=WDkg3h8PCVU"
            )
        )
        movies.add(
            MoviesDetailEntity(4, "Bohemian Rapsody","2018",
                listOf("Action", "Science Fiction", "Adventure"),"2h 15min",7.2,
                "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess.",
                "R.drawable.poster_bohemian", "R.drawable.banner_bohemian", "https://www.youtube.com/watch?v=mP0VHJYFOAU"
            )
        )
        movies.add(
            MoviesDetailEntity(5, "Cold Pursiut","2019",
                listOf("Action", "Science Fiction", "Adventure"),"1h 59min",7.2,
                "The quiet family life of Nels Coxman, a snowplow driver, is upended after his son's murder. Nels begins a vengeful hunt for Viking, the drug lord he holds responsible for the killing, eliminating Viking's associates one by one. As Nels draws closer to Viking, his actions bring even more unexpected and violent consequences, as he proves that revenge is all in the execution.",
                "R.drawable.poster_cold_persuit", "R.drawable.banner_cold_pursuit", "https://www.youtube.com/watch?v=7C2Nad0aMPg"
            )
        )
        movies.add(
            MoviesDetailEntity(6, "Creed II","2018",
                listOf("Action", "Science Fiction", "Adventure"),"2h 10min",7.2,
                "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
                "R.drawable.poster_creed", "R.drawable.banner_creed", "https://www.youtube.com/watch?v=u22BXhMu4tI"
            )
        )
        movies.add(
            MoviesDetailEntity(7, "Fantastic Beast: The Crimes of Grindelwald","2018",
                listOf("Action", "Science Fiction", "Adventure"),"2h 14min",7.2,
                "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
                "R.drawable.poster_crimes", "R.drawable.banner_crimes", "https://www.youtube.com/watch?v=vvFybpmyB9E"
            )
        )
        movies.add(
            MoviesDetailEntity(8, "Glass","2019",
                listOf("Action", "Science Fiction", "Adventure"),"2h 9min",7.2,
                "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
                "R.drawable.poster_glass", "R.drawable.banner_glass", "https://www.youtube.com/watch?v=95ghQs5AmNk"
            )
        )
        movies.add(
            MoviesDetailEntity(9, "How To Train Your Dragon: The Hidden World","2019",
                listOf("Action", "Science Fiction", "Adventure"),"1h 44min",7.2,
                "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                "R.drawable.poster_how_to_train", "R.drawable.banner_how_to", "https://www.youtube.com/watch?v=CQ7XUCQ6pbE"
            )
        )
        movies.add(
            MoviesDetailEntity(10, "Avenger: Infinity War","2018",
                listOf("Action", "Science Fiction", "Adventure"),"2h 29min",7.2,
                "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                "R.drawable.poster_infinity_war", "R.drawable.banner_infinity", "https://www.youtube.com/watch?v=6ZfuNTqbHE8"
            )
        )
        movies.add(
            MoviesDetailEntity(11, "Robin Hood","2018",
                listOf("Action", "Science Fiction", "Adventure"),"1h 56min",7.2,
                "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
                "R.drawable.poster_robin_hood", "R.drawable.banner_robin_hood", "https://www.youtube.com/watch?v=zwPn9ZnbCo0"
            )
        )
        movies.add(
            MoviesDetailEntity(12, "Serenity","2019",
                listOf("Action", "Science Fiction", "Adventure"),"1h 42min",7.2,
                "The quiet life of Baker Dill, a fishing boat captain who lives on the isolated Plymouth Island, where he spends his days obsessed with capturing an elusive tuna while fighting his personal demons, is interrupted when someone from his past comes to him searching for help.",
                "R.drawable.poster_serenity", "R.drawable.banner_serenity", "https://www.youtube.com/watch?v=k3zMlsEK8xA"
            )
        )
        movies.add(
            MoviesDetailEntity(13, "Spiderman: Into The Spider Verse","2018",
                listOf("Action", "Science Fiction", "Adventure"),"1h 57min",7.2,
                "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
                ".drawable.poster_spiderman", "R.drawable.banner_spiderman", "https://www.youtube.com/watch?v=g4Hbz2jLxvQ"
            )
        )
        movies.add(
            MoviesDetailEntity(14, "T34","2018",
                listOf("Action", "Science Fiction", "Adventure"),"2h 19min",7.2,
                "In 1944, a courageous group of Russian soldiers managed to escape from German captivity in a half-destroyed legendary T-34 tank. Those were the times of unforgettable bravery, fierce fighting, unbreakable love, and legendary miracles.",
                "R.drawable.poster_t34", "R.drawable.banner_t34", "https://www.youtube.com/watch?v=a5A7QboG8Nk"
            )
        )
        return movies
    }
    fun generateDummyMoviesTrend(): List<MoviesDetailTrendEntity>{
        val moviesTrend = ArrayList<MoviesDetailTrendEntity>()
        moviesTrend.add(
            MoviesDetailTrendEntity(15, "Mary Queen of Scots","2018",
                listOf("Action", "Science Fiction", "Adventure"),"2h 4min",7.2,
                "In 1561, Mary Stuart, widow of the King of France, returns to Scotland, reclaims her rightful throne and menaces the future of Queen Elizabeth I as ruler of England, because she has a legitimate claim to the English throne. Betrayals, rebellions, conspiracies and their own life choices imperil both Queens. They experience the bitter cost of power, until their tragic fate is finally fulfilled.",
                "R.drawable.poster_marry_queen", "R.drawable.banner_queen", "https://www.youtube.com/watch?v=T5l8cvuo7IA"
            )
        )
        moviesTrend.add(
            MoviesDetailTrendEntity(16, "Master Z: Ip Man Legacy","2018",
                listOf("Action", "Science Fiction", "Adventure"),"1h 47min",7.2,
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to expats. But it's not long before the mix of foreigners, money, and triad leaders draw him once again to the fight.",
                "R.drawable.poster_master_z", "R.drawable.banner_masterz","https://www.youtube.com/watch?v=B5HI4VsXvIQ"
            )
        )
        moviesTrend.add(
            MoviesDetailTrendEntity(17, "Mortal Engine","2018",
                listOf("Action", "Science Fiction", "Adventure"),"2h 9min",7.2,
                "Following his defeat by Master Ip, Cheung Tin Chi tries to make a life with his young son in Hong Kong, waiting tables at a bar that caters to ",
                "R.drawable.poster_mortal_engines", "R.drawable.banner_mortal_engines","https://www.youtube.com/watch?v=IRsFc2gguEg"
            )
        )
        moviesTrend.add(
            MoviesDetailTrendEntity(18, "Overlord","2018",
                listOf("Action", "Science Fiction", "Adventure"),"1h 50min",7.2,
                "France, June 1944. On the eve of D-Day, some American paratroopers fall behind enemy lines after their aircraft crashes while on a mission to destroy a radio tower in a small village near the beaches of Normandy. After reaching their target, the surviving paratroopers realise that, in addition to fighting the Nazi troops that patrol the village, they also must fight against something else.",
                "R.drawable.poster_overlord", "R.drawable.banner_overlord","https://www.youtube.com/watch?v=USPd0vX2sdc"
            )
        )
        moviesTrend.add(
            MoviesDetailTrendEntity(19, "Ralph Breaks The Internet","2018",
                listOf("Action", "Science Fiction", "Adventure"),"1h 52min",7.2,
                "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, Sugar Rush. In way over their heads, Ralph and Vanellope rely on the citizens of the internet — the netizens — to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
                "R.drawable.poster_ralph", "R.drawable.banner_ralph","https://www.youtube.com/watch?v=_BcYBFC6zfY"
            )
        )
        return moviesTrend
    }

    fun generateTvShow(): List<TvShowEntity>{
        val tvShow = ArrayList<TvShowEntity>()
        tvShow.add(
            TvShowEntity(1,"Arrow","2012",
                "Action, Science Fiction, Adventure","42min",7.2,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                 "R.drawable.poster_arrow", "R.drawable.banner_arrow", "https://www.youtube.com/watch?v=2yrviapP5uY"
            )
        )
        tvShow.add(
            TvShowEntity(2,"Dragon Ball","1986",
                "Action, Science Fiction, Adventure","25min",7.2,
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                "R.drawable.poster_dragon_ball", "R.drawable.banner_dagoball", "https://www.youtube.com/watch?v=DIjku6BtYW4"
            )
        )
        tvShow.add(
            TvShowEntity(3,"Fairy Tail","2009",
                "Action, Science Fiction, Adventure","25min",7.2,
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                 "R.drawable.poster_fairytail", "R.drawable.banner_fairy_tail", "https://www.youtube.com/watch?v=BaIWwk-sAlw"
            )
        )
        tvShow.add(
            TvShowEntity(4,"Family Guy","1999",
                "Action, Science Fiction, Adventure","22min",7.2,
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                 "R.drawable.poster_family_guy", "R.drawable.banner_family_guy", "https://www.youtube.com/watch?v=Le1x2To-e6g"
            )
        )
        tvShow.add(
            TvShowEntity(5,"Flash","2014",
                "Action, Science Fiction, Adventure","44min",7.2,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                 "R.drawable.poster_flash", "R.drawable.banner_flash", "https://www.youtube.com/watch?v=N-QSZKxkBjo"
            )
        )
        tvShow.add(
            TvShowEntity(6,"Game Of Thrones","2011",
                "Action, Science Fiction, Adventure","1h",7.2,
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                 "R.drawable.poster_god", "R.drawable.banner_got", "https://www.youtube.com/watch?v=rlR4PJn8b8I"
            )
        )
        tvShow.add(
            TvShowEntity(7,"Gotham","2014",
                "Action, Science Fiction, Adventure","43min",7.2,
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                 "R.drawable.poster_gotham", "R.drawable.banner_gotham", "https://www.youtube.com/watch?v=VwOPA2upeCA"
            )
        )
        tvShow.add(
            TvShowEntity(8,"Marvel's Iron Fist","2017",
                "Action, Science Fiction, Adventure","55min",7.2,
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                 "R.drawable.poster_iron_fist", "R.drawable.banner_iron_fist", "https://www.youtube.com/watch?v=f9OKL5no-S0"
            )
        )
        tvShow.add(
            TvShowEntity(9,"Naruto Shipuden","2007",
                "Action, Science Fiction, Adventure","25min",7.2,
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                 "R.drawable.poster_naruto_shipudden", "R.drawable.banner_naruto", "https://www.youtube.com/watch?v=tA3yE4_t6SY"
            )
        )
        tvShow.add(
            TvShowEntity(10,"N.C.I.S.","2003",
                "Action, Science Fiction, Adventure","45min",7.2,
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                 "R.drawable.poster_ncis", "R.drawable.banner_ncis", "https://www.youtube.com/watch?v=fRfpzhmQGFY"
            )
        )

        return tvShow
    }
    fun generateTvShowTrend(): List<TvPopularEntity> {
        val tvTrend = ArrayList<TvPopularEntity>()
        tvTrend.add(
            TvPopularEntity(11,"Riverdale","2017",
                "Action, Science Fiction, Adventure","45min",7.2,
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                 "R.drawable.poster_riverdale", "R.drawable.banner_riverdale", "https://www.youtube.com/watch?v=HxtLlByaYTc"
            )
        )
        tvTrend.add(
            TvPopularEntity(12,"Supernatural","2005",
                "Action, Science Fiction, Adventure","45min",7.2,
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                 "R.drawable.poster_supernatural", "R.drawable.banner_supernatural", "https://www.youtube.com/watch?v=_hlkNQL5Ecg"
            )
        )
        tvTrend.add(
            TvPopularEntity(13,"The Simpsons","1989",
                "Action, Science Fiction, Adventure","22min",7.2,
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                 "R.drawable.poster_the_simpson", "R.drawable.banner_simpsons", "https://www.youtube.com/watch?v=HRV6tMR-SSs"
            )
        )
        tvTrend.add(
            TvPopularEntity(14,"The Umbrella Academy","2019",
                "Action, Science Fiction, Adventure","55min",7.2,
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                 "R.drawable.poster_the_umbrella", "R.drawable.banner_umbrella", "https://www.youtube.com/watch?v=0DAmWHxeoKw"
            )
        )
        tvTrend.add(
            TvPopularEntity(15,"The Walking Dead","2010",
                "Action, Science Fiction, Adventure","42min",7.2,
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                 "R.drawable.poster_the_walking_dead", "R.drawable.banner_walking_dead", "https://www.youtube.com/watch?v=R1v0uFms68U"
            )
        )

        return tvTrend
    }

    fun generateDummyTvShow(): List<TvDetailShowEntity>{
        val tvShow = ArrayList<TvDetailShowEntity>()
        tvShow.add(
            TvDetailShowEntity(1,"Arrow","2012",
                listOf("Action", "Science Fiction", "Adventure"),"42min",7.2,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                listOf("Greg Berlanti"), "R.drawable.poster_arrow", "R.drawable.banner_arrow", "https://www.youtube.com/watch?v=2yrviapP5uY"
            )
        )
        tvShow.add(
            TvDetailShowEntity(2,"Dragon Ball","1986",
                listOf("Action", "Science Fiction", "Adventure"),"25min",7.2,
                "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. Together, they set off to find all seven and to grant her wish.",
                listOf("Akira Toriyama"), "R.drawable.poster_dragon_ball", "R.drawable.banner_dagoball", "https://www.youtube.com/watch?v=DIjku6BtYW4"
            )
        )
        tvShow.add(
            TvDetailShowEntity(3,"Fairy Tail","2009",
                listOf("Action", "Science Fiction", "Adventure"),"25min",7.2,
                "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                listOf("Hiro Mashima"), "R.drawable.poster_fairytail", "R.drawable.banner_fairy_tail", "https://www.youtube.com/watch?v=BaIWwk-sAlw"
            )
        )
        tvShow.add(
            TvDetailShowEntity(4,"Family Guy","1999",
                listOf("Action", "Science Fiction", "Adventure"),"22min",7.2,
                "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                listOf("Seth MacFarlane"), "R.drawable.poster_family_guy", "R.drawable.banner_family_guy", "https://www.youtube.com/watch?v=Le1x2To-e6g"
            )
        )
        tvShow.add(
            TvDetailShowEntity(5,"Flash","2014",
                listOf("Action", "Science Fiction", "Adventure"),"44min",7.2,
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                listOf("Greg Berlanti"), "R.drawable.poster_flash", "R.drawable.banner_flash", "https://www.youtube.com/watch?v=N-QSZKxkBjo"
            )
        )
        tvShow.add(
            TvDetailShowEntity(6,"Game Of Thrones","2011",
                listOf("Action", "Science Fiction", "Adventure"),"1h",7.2,
                "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                listOf("David Benioff"), "R.drawable.poster_god", "R.drawable.banner_got", "https://www.youtube.com/watch?v=rlR4PJn8b8I"
            )
        )
        tvShow.add(
            TvDetailShowEntity(7,"Gotham","2014",
                listOf("Action", "Science Fiction", "Adventure"),"43min",7.2,
                "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                listOf("Bruno Heller"), "R.drawable.poster_gotham", "R.drawable.banner_gotham", "https://www.youtube.com/watch?v=VwOPA2upeCA"
            )
        )
        tvShow.add(
            TvDetailShowEntity(8,"Marvel's Iron Fist","2017",
                listOf("Action", "Science Fiction", "Adventure"),"55min",7.2,
                "Danny Rand resurfaces 15 years after being presumed dead. Now, with the power of the Iron Fist, he seeks to reclaim his past and fulfill his destiny.",
                listOf("Scott Buck"), "R.drawable.poster_iron_fist", "R.drawable.banner_iron_fist", "https://www.youtube.com/watch?v=f9OKL5no-S0"
            )
        )
        tvShow.add(
            TvDetailShowEntity(9,"Naruto Shipuden","2007",
                listOf("Action", "Science Fiction", "Adventure"),"25min",7.2,
                "Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.",
                listOf("Mashashi Kishimoto"), "R.drawable.poster_naruto_shipudden", "R.drawable.banner_naruto", "https://www.youtube.com/watch?v=tA3yE4_t6SY"
            )
        )
        tvShow.add(
            TvDetailShowEntity(10,"N.C.I.S.","2003",
                listOf("Action", "Science Fiction", "Adventure"),"45min",7.2,
                "From murder and espionage to terrorism and stolen submarines, a team of special agents investigates any crime that has a shred of evidence connected to Navy and Marine Corps personnel, regardless of rank or position.",
                listOf("Donald P. Bellisario"), "R.drawable.poster_ncis", "R.drawable.banner_ncis", "https://www.youtube.com/watch?v=fRfpzhmQGFY"
            )
        )

        return tvShow
    }

    fun generateDummyTvShowTrend(): List<TvDetailPopularEntity> {
        val tvTrend = ArrayList<TvDetailPopularEntity>()
        tvTrend.add(
            TvDetailPopularEntity(11,"Riverdale","2017",
                listOf("Action", "Science Fiction", "Adventure"),"45min",7.2,
                "Set in the present, the series offers a bold, subversive take on Archie, Betty, Veronica and their friends, exploring the surreality of small-town life, the darkness and weirdness bubbling beneath Riverdale’s wholesome facade.",
                listOf("Roberto Aguirre-Sacasa"), "R.drawable.poster_riverdale", "R.drawable.banner_riverdale", "https://www.youtube.com/watch?v=HxtLlByaYTc"
            )
        )
        tvTrend.add(
            TvDetailPopularEntity(12,"Supernatural","2005",
                listOf("Action", "Science Fiction", "Adventure"),"45min",7.2,
                "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
                listOf("Eric Kripke"), "R.drawable.poster_supernatural", "R.drawable.banner_supernatural", "https://www.youtube.com/watch?v=_hlkNQL5Ecg"
            )
        )
        tvTrend.add(
            TvDetailPopularEntity(13,"The Simpsons","1989",
                listOf("Action", "Science Fiction", "Adventure"),"22min",7.2,
                "Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",
                listOf("Matt Groening"), "R.drawable.poster_the_simpson", "R.drawable.banner_simpsons", "https://www.youtube.com/watch?v=HRV6tMR-SSs"
            )
        )
        tvTrend.add(
            TvDetailPopularEntity(14,"The Umbrella Academy","2019",
                listOf("Action", "Science Fiction", "Adventure"),"55min",7.2,
                "A dysfunctional family of superheroes comes together to solve the mystery of their father's death, the threat of the apocalypse and more.",
                listOf("Steve Blackman"), "R.drawable.poster_the_umbrella", "R.drawable.banner_umbrella", "https://www.youtube.com/watch?v=0DAmWHxeoKw"
            )
        )
        tvTrend.add(
            TvDetailPopularEntity(15,"The Walking Dead","2010",
                listOf("Action", "Science Fiction", "Adventure"),"42min",7.2,
                "Sheriff's deputy Rick Grimes awakens from a coma to find a post-apocalyptic world dominated by flesh-eating zombies. He sets out to find his family and encounters many other survivors along the way.",
                listOf("Frank Darabont"), "R.drawable.poster_the_walking_dead", "R.drawable.banner_walking_dead", "https://www.youtube.com/watch?v=R1v0uFms68U"
            )
        )

        return tvTrend
    }
}