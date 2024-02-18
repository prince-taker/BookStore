/**
 * Represents individual novels within the bookstore.
 * @author Prince Lesapo.
 * @version 1.0
 */
class Novel
{
    private final String novelTitle;
    private final String authorName;
    private final int    yearPublished;

    /**
     * Constructor to create a Novel object.
     * @param novelTitle The title of the novel.
     * @param authorName The name of the author.
     * @param yearPublished The year the novel was published.
     */
    Novel(final String  novelTitle,
          final String  authorName,
          final int     yearPublished)
    {
        this.novelTitle    = novelTitle;
        this.authorName    = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * @return The title of the novel.
     */
    public String getNovelTitle()
    {
        return novelTitle;
    }

    /**
     * @return The name of the author.
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * @return The year the novel was published.
     */
    public int getYearPublished()
    {
        return yearPublished;
    }
}
