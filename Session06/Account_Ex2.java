package Session06;

import java.util.Objects;

public class Account_Ex2 {
    private final String username;
    private String password;
    private final String email;

    public Account_Ex2(String nameAC, String pass, String email){
        this.username = nameAC;
        this.password = pass;
        this.email = email;
    }

    public void ChangePass(String OldPass, String NewPass){
        if(!Objects.equals(this.password, OldPass)) return;
        this.password = NewPass;
        System.out.println("change pass success!");

    }

    public void showInformation(){
        System.out.println("=========Information======");
        System.out.println("UserName: " + this.username);
        System.out.println("Email: " + this.email);
        System.out.println("Pass: ***********" );
        System.out.println("=========End======");
    }


}
