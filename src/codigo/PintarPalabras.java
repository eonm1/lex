/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.TabSet;
import javax.swing.text.TabStop;

/**
 *
 * @author Erick
 */
public class PintarPalabras {
    
    public JTextPane Pintado;
    private StyleContext sc;
    private DefaultStyledDocument doc;
    private AttributeSet aset;

    
    public PintarPalabras(){
        this.Pintado = new JTextPane();
        this.sc = new StyleContext();
        tabuladores();
    }

    public void tabuladores()
    {
        TabStop[] tabs = new TabStop[9];
        tabs[0] = new TabStop( 40 , TabStop.ALIGN_LEFT , TabStop.LEAD_NONE );
        tabs[1] = new TabStop( 80 , TabStop.ALIGN_LEFT , TabStop.LEAD_NONE );
        tabs[2] = new TabStop( 120 , TabStop.ALIGN_LEFT , TabStop.LEAD_NONE );
        tabs[3] = new TabStop( 160 , TabStop.ALIGN_LEFT , TabStop.LEAD_NONE );
        tabs[4] = new TabStop( 200 , TabStop.ALIGN_LEFT , TabStop.LEAD_NONE );
        tabs[5] = new TabStop( 240 , TabStop.ALIGN_LEFT , TabStop.LEAD_NONE );
        tabs[6] = new TabStop( 280 , TabStop.ALIGN_LEFT , TabStop.LEAD_NONE );
        tabs[7] = new TabStop( 320 , TabStop.ALIGN_LEFT , TabStop.LEAD_NONE );
        tabs[8] = new TabStop( 360 , TabStop.ALIGN_LEFT , TabStop.LEAD_NONE );
        TabSet tabset = new TabSet( tabs );
        sc = StyleContext.getDefaultStyleContext();
        doc = new DefaultStyledDocument( sc );
        aset = sc.addAttribute( SimpleAttributeSet.EMPTY ,
                StyleConstants.TabSet , tabset );
        doc.setParagraphAttributes( 0 , 0 , aset , false );

    }

    
    public void darEstilo( String textoApintar )
    {
   
        Pintado.setDocument( doc );
        try {
            doc.insertString( 0 , textoApintar , null );

        }catch (Exception ex) {
            System.out.println("ERROR: no se pudo establecer estilo de documento");
        }
   
   }
    
   public void pintaRojo(int posini,int posfin){
        Style rojo = sc.addStyle("ConstantWidth", null);
        StyleConstants.setForeground(rojo, Color.red);
        doc.setCharacterAttributes(posini,posfin, rojo, false);

   }
   
     public void pintaVerde(int posini,int posfin){
            Style verde = sc.addStyle("ConstantWidth", null);
            StyleConstants.setForeground(verde, Color.decode("#088A29"));
            doc.setCharacterAttributes(posini,posfin, verde, false);
     }
     
     public void pintaVerCla(int posini,int posfin){
            Style verde = sc.addStyle("ConstantWidth", null);
            StyleConstants.setForeground(verde, Color.decode("#86B404"));
            doc.setCharacterAttributes(posini,posfin, verde, false);
     }
   
       public void pintaAzul(int posini,int posfin){
            Style azul = sc.addStyle("ConstantWidth", null);
            StyleConstants.setForeground(azul, Color.blue);
            doc.setCharacterAttributes(posini,posfin, azul, false);
       
       } 
   
        public void pintaCeles(int posini,int posfin){
            Style azulo = sc.addStyle("ConstantWidth", null);
            StyleConstants.setForeground(azulo, Color.decode("#2ECCFA"));
            doc.setCharacterAttributes(posini,posfin, azulo, false);
       
       } 
        
         public void pintaCafe(int posini,int posfin){
            Style cafe = sc.addStyle("ConstantWidth", null);
            StyleConstants.setForeground(cafe, Color.getHSBColor(0, 75, 65));
            doc.setCharacterAttributes(posini,posfin, cafe, false);
         }
         
         public void pintaMora(int posini,int posfin){
            Style mora = sc.addStyle("ConstantWidth", null);
            StyleConstants.setForeground(mora, Color.decode("#9400D3"));
            doc.setCharacterAttributes(posini,posfin,mora, false);
         }
         
         public void pintaNara(int posini,int posfin){
            Style nara = sc.addStyle("ConstantWidth", null);
            StyleConstants.setForeground(nara, Color.decode("#FF8000"));
            doc.setCharacterAttributes(posini,posfin,nara, false);
    }

    public void pintaDef( int posini , int posfin )
    {
        Style def = sc.addStyle( "ConstantWidth" , null );
        StyleConstants.setForeground( def , Color.BLACK );
        doc.setCharacterAttributes( posini , posfin , def , false );
    }
}
