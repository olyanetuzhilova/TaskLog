package log.proxy;

import java.util.*;

public class Diary implements DiaryInterface {

    Map<String, String> notes = new HashMap<>();

    @Override
    public void addNote(String date, String note) {
        notes.put(date, note);
    }

    @Override
    public HashMap<String, String> getNotes() {
        return new HashMap<>(notes);
    }

    @Override
    public Set<String> getDates() {
        return new HashMap<>(notes).keySet();
    }
}
