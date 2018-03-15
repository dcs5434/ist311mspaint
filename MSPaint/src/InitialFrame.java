/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John
 */
import javax.swing.*;

public class InitialFrame extends JFrame
{
    public InitialFrame ()
    {
        super ("Paint");
        InitialPanel inp = new InitialPanel();
        add(inp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (1500, 1000);
        setVisible(true);
    }
}
