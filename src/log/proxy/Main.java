package log.proxy;

public class Main {

    public static void main(String[] args) {

        Spy diary = new Spy();

        diary.addNote("21.09.19", "some note");

        diary.getNotes();

        diary.getDates();

    }
}
