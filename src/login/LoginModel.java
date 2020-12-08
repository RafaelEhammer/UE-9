package login;

public class LoginModel
{
    String username;
    String password;

    public LoginModel()
    {
        this.username = "Cisco";
        this.password = "Cisco";
    }

    public boolean CorrectLogin (String n, String p)
    {
        if (n.equals(username) && p.equals(password))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
