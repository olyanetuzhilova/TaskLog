package log.proxy;

import java.util.HashMap;
import java.util.Set;

public interface DiaryInterface {

    void addNote(String date, String note);
    HashMap getNotes();
    Set<String> getDates();
}
