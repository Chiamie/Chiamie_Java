import MyExceptions.DiaryNotFoundException;

import java.util.ArrayList;

public class Diaries {
    private int numberOfDiaries;
    private ArrayList<Diary> diaries = new ArrayList<>();

    public int getNumberOfDiaries() {
        return numberOfDiaries;
    }

    public void add(String password, String username) {
        Diary diary = new Diary(password, username);
        diaries.add(diary);
        numberOfDiaries++;
    }

    public void delete(String password, String username) {
        Diary diary = getDiaryBy(username);
        diary.unlockDiary(password);
        diaries.remove(diary);
        numberOfDiaries--;
    }

    public Diary getDiaryBy(String username) {
        for (Diary diary : diaries) {
            if(diary.getUsername().equals(username)) return diary;
        }
        throw new DiaryNotFoundException("No such username found");
    }


    public Diary findByUsername(String username) {
        return getDiaryBy(username);
    }


}
