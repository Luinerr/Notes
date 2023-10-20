package app.notes;

public class Note {
    private String head;
    private String body;
    private String date;

    public Note(String head, String body, String date) {
        this.head = head;
        this.body = body;
        this.date = date;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
