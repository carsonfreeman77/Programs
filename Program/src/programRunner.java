import java.util.ArrayList;

public class programRunner
	{
		public static void main(String[] args)
			{

				ArrayList<Program> TVShows = new ArrayList<Program>();
				TVShows.add(new Program("The New People", "Comedy", 4));
				TVShows.add(new Program("The Misadventures of Grant", "Adventure", 7));
				TVShows.add(new Program("New to Coding? Watch now!", "Educational", 2));
				TVShows.add(new Program("Coding Planet", "Educational", 3));
				TVShows.add(new Program("Who Even Uses the Numberpad on a Keyboard?", "Educational", 5));

				for (int i = 0; i < TVShows.size(); i++)
					{
						System.out.println("Title: " + TVShows.get(i).getTitle() + " Genre: " + TVShows.get(i).getGenre()
								+ " Number of seasons aired: " + TVShows.get(i).getNumberOfSeasonsAired());

					}
				System.out.println();
				
				System.out.println("The show with the longest name was taken down!");
				TVShows.remove(4);
				System.out.println();
				for (int i = 0; i < TVShows.size() ; i++)
					{
						System.out.println("Title: " + TVShows.get(i).getTitle() + " Genre: " + TVShows.get(i).getGenre()
								+ " Number of seasons aired: " + TVShows.get(i).getNumberOfSeasonsAired());

					}
				TVShows.get(4);
				for (int i = 0; i < TVShows.size(); i++)
					{
						System.out.println("Title: " + TVShows.get(i).getTitle() + "Genre: " + TVShows.get(i).getGenre()
								+ "Number of seasons aired: " + TVShows.get(i).getNumberOfSeasonsAired());

					}
			}

	}
