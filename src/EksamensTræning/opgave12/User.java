package EksamensTræning.opgave12;

public class User {
    String fullName, userID;


    public User(String fullName){
        this.fullName=fullName;
        userID=null;
    }

    public Boolean validUserID(){
        if (userID == null || userID.length() > 8){
            return false;
        }

        for(int i=0; i<4; i++){
            if(!Character.isLowerCase(userID.charAt(i))){
                return false;
            }
        }
        for (int i=0; i<8; i++){
            if (!Character.isDigit(userID.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public void createUserID(){
        String[] parts = fullName.split(" ");

        String firstName = parts[0].toLowerCase();
        String lastName = parts[1].toLowerCase();

        String letters = firstName.substring(0, 2) + lastName.substring(0, 2);

        int randomNumber = (int)(Math.random() * 9000) +1000;
    }
}
