/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John
 */
import java.awt.*;
import javax.swing.*;

public class InitialPanel extends JPanel
{
    public InitialPanel()
    {
        // Add and orient the separate panels within the frame
        super();
        setBackground(Color.gray);
        setLayout(new BorderLayout());
        ToolbarPanel top = new ToolbarPanel();
        add(top,BorderLayout.NORTH);
        CanvasPanel canvas = new CanvasPanel(top);
        add(canvas,BorderLayout.CENTER);
    }
}