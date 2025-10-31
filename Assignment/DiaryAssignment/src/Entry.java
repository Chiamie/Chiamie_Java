import java.time.LocalDate;

public class Entry {
    private int id;
    private String title;
    private String body;
    private String date;

    public Entry(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.date = LocalDate.now().toString();
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody(int id, String title) {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Entry)) {
            return false;
        }
        Entry myObject = (Entry) other;
        return this.id == myObject.id &&
                this.title.equals(myObject.title) && this.body.equals(myObject.body);
    }

    @Override
    public String toString() {
        return "Entry{" + "id=" + id + ", title=" + title + ", body=" + body + "Date=" + date + '}';
    }






}
