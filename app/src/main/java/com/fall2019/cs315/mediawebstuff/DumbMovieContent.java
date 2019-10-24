package com.fall2019.cs315.mediawebstuff;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DumbMovieContent {

    /**
     * A map of the Movie items, by ID (title).
     */
    public static final Map<String, MovieModel> ITEM_MAP = new HashMap<String, MovieModel>();

    /**
     * A List of the Movie items.
     */
    public static final List<MovieModel> MOVIES = new ArrayList<MovieModel>();


    /**
     * Create all those movie Strings we will be needing for teh models
     */

    // CS315: DO THIS
    // TODO: Create five NEW movie objects here. Complete with images and URLs. DELETE the two existing movies, they are only here as an example

    private static final String game1Title = "STAR WARS Battlefront II";
    private static final String game1Description = "Revisit classic Star Wars scenes and battles with your favorite characters and vehicles in this action shooter.";
    private static final String game1Year = "2017";
    private static final String game1Image = "starwarsbf2";
    private static final String game1Weblink = "https://www.starwars.com/games-apps/star-wars-battlefront-ii";

    private static final String game2Title = "Madden NFL 20";
    private static final String game2Description = "Experience what it is like to play in NFL games as your favorite players as well as being able to build and customize teams however you may choose in Madden NFL 20.";
    private static final String game2Year = "2019";
    private static final String game2Image = "madden20";
    private static final String game2Weblink = "https://www.origin.com/usa/en-us/store/madden/madden-20";

    private static final String game3Title = "NBA 2K20";
    private static final String game3Description = "Dive into the immersive and realistic world of NBA 2K20 where you can find yourself on the court with NBA superstars and legends in the MYCARRER, MYLEAGUE, and MYTEAM game modes.";
    private static final String game3Year = "2019";
    private static final String game3Image = "nba2k20";
    private static final String game3Weblink = "https://www.gamespot.com/nba-2k20/reviews/";

    private static final String game4Title = "Far Cry 5";
    private static final String game4Description = "Try to survive in Hope County, Montana where there are crazed cultists trying to stop you at every turn. Your goal is to venture out and find supplies and friends to help on your journey to rescue your friends, defeat the leader of the cult, and ave the rest of Hope County";
    private static final String game4Year = "2018";
    private static final String game4Image = "farcry";
    private static final String game4Weblink = "https://far-cry.ubisoft.com/farcry5/en-us/game-info/story-and-characters.aspx";

    private static final String game5Title = "Tom Clancy's Rainbow Six Siege";
    private static final String game5Description = "Team up with four others in this realistic shooter modelled after real counter-terrorist units in their war on terror, use tactics and the weapons used by counter-terrorists to defeat your enemies";
    private static final String game5Year ="2015";
    private static final String game5Image = "rainbowsiege";
    private static final String game5Weblink = "http://sea.ign.com/rainbow-six-siege/128518/review/rainbow-six-siege-review";






    /**
     * Create and return an array of Movie items.  Duh!
     */
    public List<MovieModel> createMovieMagic ()
    {
        ITEM_MAP.clear();
        MOVIES.clear();
        // make those movie objects
        MovieModel starW = new MovieModel(game1Title, game1Description, game1Year, game1Image, game1Weblink);
        MovieModel madden = new MovieModel(game2Title, game2Description, game2Year, game2Image, game2Weblink);
        MovieModel nba = new MovieModel(game3Title, game3Description, game3Year, game3Image, game3Weblink);
        MovieModel farCry = new MovieModel(game4Title, game4Description, game4Year, game4Image, game4Weblink);
        MovieModel rainbow6S = new MovieModel(game5Title, game5Description, game5Year, game5Image, game5Weblink);

        // add EACH movie object to our lists and maps

        addMovieToList(starW);
        addMovieToList(madden);
        addMovieToList(nba);
        addMovieToList(farCry);
        addMovieToList(rainbow6S);

        // no more movies to add?  Okay... return our list
        return MOVIES;
    }

    // Internal helper so we don't forget any steps in the complex two-step system.  Seriously.  It happens.
    private void addMovieToList (MovieModel datMovie) {
        MOVIES.add(datMovie);
        ITEM_MAP.put(datMovie.getMovieTitle(), datMovie);
    }
}
