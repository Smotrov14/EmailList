import java.util.*;

public class EmailList {
   private List<String> emailList = new ArrayList<>();

    public void add(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+\\.)+[A-Za-z]+$";
        if(email != null && email.matches(regex)) {
            email = email.toLowerCase();
            if (!emailList.contains(email)) {
                emailList.add(email);
            }
        }
        else{
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        List<String> sortList = new ArrayList<>(emailList);
        sortList.sort(null);
        return sortList;
    }

}
