/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author aniket fating
 */
public class RegValidation 
{ 
    private Pattern name,email,phoneNo,password;
    private Matcher matcher;
    
    String name_pattern="^[a-zA-Z]\\w{3,30}$";
    String email_pattern= "^(.+)@(.+)$" ;
    String phoneNo_pattern="^\\d{10}$";
    String pass_pattern="^[a-zA-Z0-9]{5,20}";
    
    
    public RegValidation()
    {
       name= Pattern.compile(name_pattern);
       email=Pattern.compile(email_pattern);
       phoneNo=Pattern.compile(phoneNo_pattern);
       password=Pattern.compile(pass_pattern);
    }
     public boolean nameValidation(String user_name)
     {  matcher= name.matcher(user_name);
         return matcher.matches();
     }
      public boolean emailValidation(String user_email)
     {  matcher=email.matcher(user_email);
         return matcher.matches();
     }
       public boolean phoneNO_Validation(String user_phoneNo)
     {  matcher= phoneNo.matcher(user_phoneNo);
         return matcher.matches();
     }
        public boolean passrodValidation(String user_password)
     {  matcher= password.matcher(user_password);
         return matcher.matches();
     }
}
