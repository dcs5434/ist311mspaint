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

public class ToolbarPanel extends JPanel
{
    // TopPanel's buttons to control all aspects of painting
    private JButton Pencil;
    private JButton PaintBrush;
    private JButton SprayCan;
    private JSlider BrushSize;
    private JColorChooser ColorSelector;
    
    public ToolbarPanel()
    {
        super();
        
        // Sets up the buttons in the frame
        Pencil = new JButton("Pencil");
        add(Pencil);
        PaintBrush = new JButton("Paint Brush");
        add(PaintBrush);
        SprayCan = new JButton("Spray Can");
        add(SprayCan);
        
        // Sets up the slider object in the frame
        BrushSize = new JSlider(1,10,1);
        BrushSize.setMajorTickSpacing(1);
        BrushSize.setMinorTickSpacing(1);
        BrushSize.setPaintTicks(true);
        BrushSize.setPaintLabels(true);
        add(BrushSize);
        
        // Sets up the Color Chooser in the frame
        ColorSelector = new JColorChooser();
        ColorSelector.setPreviewPanel(new JPanel());
        add(ColorSelector);
        
        
    }

    /**
     * @return the Pencil
     */
    public JButton getPencil() {
        return Pencil;
    }

    /**
     * @param Pencil the Pencil to set
     */
    public void setPencil(JButton Pencil) {
        this.Pencil = Pencil;
    }

    /**
     * @return the PaintBrush
     */
    public JButton getPaintBrush() {
        return PaintBrush;
    }

    /**
     * @param PaintBrush the PaintBrush to set
     */
    public void setPaintBrush(JButton PaintBrush) {
        this.PaintBrush = PaintBrush;
    }

    /**
     * @return the BrushSize
     */
    public JSlider getBrushSize() {
        return BrushSize;
    }

    /**
     * @param BrushSize the BrushSize to set
     */
    public void setBrushSize(JSlider BrushSize) {
        this.BrushSize = BrushSize;
    }
}