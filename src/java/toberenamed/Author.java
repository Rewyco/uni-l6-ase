package toberenamed;

public class Author {

    //----------------------------------------------------------------------
    // Private Fields:
    //----------------------------------------------------------------------
    
    private final int id;
    private final Employee author;

    //----------------------------------------------------------------------
    // Constructor:
    //----------------------------------------------------------------------
    
    public Author(Employee theAuthor) {
        id = Unique.getUniqueId();
        author = theAuthor;
    }

    //----------------------------------------------------------------------
    // Public Methods:
    //----------------------------------------------------------------------
    
    public String getAuthorName() {
        return author.getName();
    }

    @Override
    public String toString() {
        return author.getInitials();
    }

}