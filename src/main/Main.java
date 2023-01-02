/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import bean.Config;
import util.MenuUtil;

/**
 *
 * @author Umman Hasan
 */
public class Main
{

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Config.initialize();
        MenuUtil.showMenu();
    }

}
