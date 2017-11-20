/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petro.Controller;

/**
 *
 * @author Abi
 */
import petro.Model.LoginModel;
import petro.View.Login;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public abstract class LoginController implements java.awt.event.ActionListener {
    
    public class LoginContoller extends Login
    {
        
    }
    private LoginModel loginModel;
    private Login login;
    
    public LoginController(LoginModel loginModel,Login login)
    {
        super();
        this.loginModel = loginModel;
        this.login = login;
    }
    
    
    
   
    public void ActionPerfomred(ActionEvent e)
    {
        
    }
}
