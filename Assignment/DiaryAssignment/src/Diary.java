import MyExceptions.InaccessibleDiaryException;
import MyExceptions.InvalidIdException;
import MyExceptions.InvalidPasswordException;

import java.util.ArrayList;


public class Diary {
    private boolean isLocked = false;
    private String password;
    private String username;
    private ArrayList<Entry> entries = new ArrayList<>();
    private int index;

    public Diary(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public void lockDiary() {
        isLocked = true;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockDiary(String password) {
        validatePassword(password);
        isLocked = false;
    }

    public String getUsername() {
        return username;
    }

    public void createEntry(String title, String body) {
        validateAccess();
        Entry entry = new Entry(generateID(), title, body);
        entries.add(entry);
    }

    private int generateID() {
        return index++;
    }

    public Entry findEntryById(int iD) {
        validateAccess();
        if (iD < 0)
            throw new InvalidIdException("ID is invalid");
        int result = getIndex(iD);
        return entries.get(result);

    }

    private int getIndex(int iD) {
        for(int count = 0; count < entries.size(); count++) {
            if (entries.get(count).getId() == iD)
                return count;
        }
        throw new InvalidIdException("ID is invalid");
    }

    private void validatePassword(String password){
        if(!password.equals(this.password)){
            throw new InvalidPasswordException("Wrong password");
        }
    }

    public void updateEntry(int iD, String updatedTitle, String updatedBody) {
        validateAccess();
        Entry entry = findEntryById(iD);
        entry.setTitle(updatedTitle);
        entry.setBody(updatedBody);
    }

    public void deleteEntry(int iD) {
        entries.remove(findEntryById(iD));
    }

    private void validateAccess(){
        if(isLocked){
            throw new InaccessibleDiaryException("Diary is locked");
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Diary diary = (Diary) other;
        return username.equals(diary.username) && password.equals(diary.password);
    }

//    public void setPassword(String oldPassword, String newPassword) {
//        validatePassword(oldPassword);
//        this.password = newPassword;
//    }
//
//    public void setUsername(String password, String username) {
//        validatePassword(password);
//        this.username = username;
//    }
}
