package log.proxy;

import java.util.HashMap;
import java.util.Set;

public class Spy implements DiaryInterface {

    private Diary diary;

    private StringBuilder log = new StringBuilder();

    Spy(){
        this.diary = new Diary();
    }

    @Override
    public void addNote(String date, String note) {
        String recordLog = "ADD NOTE " + date + ": " + note;
        addLog(recordLog);
        diary.addNote(date, note);
    }

    @Override
    public HashMap getNotes() {
        HashMap notesLog = diary.getNotes();
        String recordLog ="SHOW NOTES " + notesLog.toString();
        addLog(recordLog);
        return notesLog;
    }

    @Override
    public Set<String> getDates() {
        Set<String> datesLog = diary.getDates();
        String recordLog ="SHOW DATES " + datesLog.toString();
        addLog(recordLog);
        return datesLog;
    }

    private void addLog(String record){
        log.append(record);
        System.out.println(record);
    }
}
