class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + getDetails();
        // write your code here
    }

    public String getType() {
        return getClass().getTypeName();
//        return "Publication";
    }

    public String getDetails() {
        return ": " + getTitle();
    }

    public String getTitle() {
        return title;
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    @Override
    public String getDetails() {
        return " (source - " + source + "): " + super.getTitle();
    }
    // write your code here

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return " (author - " + author + "): " + super.getTitle();
    }
    // write your code here

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getDetails() {
        return " (days to expire - " + daysToExpire + "): " + super.getTitle();
    }
    // write your code here

}