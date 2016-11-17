package helin.base;

import helin.entity.Movie;

import java.util.List;

public class MovieBase {

	/**
	 * Get movie's id by movie data
	 * 
	 * @param movieData
	 *            movie data
	 * @return movie id if exist or -1 if not exist
	 */
	public static int GetIdByMovieData(List<Movie> movieList, int movieData) {
		// initialize id is -1
		int id = -1;
		int size = movieList.size();

		// traverse by line
		for (int i = 0; i < size; i++) {
			if (movieList.get(i).movieData == movieData) {
				id = movieList.get(i).movieId;
				break;
			}
		}

		return id;
	}

}
