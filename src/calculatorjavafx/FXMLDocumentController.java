/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author mrunal
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField tf ;
    
    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button six;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button equals;

    @FXML
    private Button zero;

    @FXML
    private Button clear;

    @FXML
    private Button plus;

    @FXML
    private Button mult;

    @FXML
    private Button minus;

    @FXML
    private Button one;
    
    @FXML
    private Button division;
    
    private int operator ;
    double a,b,result ;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       //tf.setText("Hello");
      if(event.getSource()==one){
          tf.setText(tf.getText()+"1");
      }else if(event.getSource()==two){
          tf.setText(tf.getText()+"2");
      }else if(event.getSource()==three){
          tf.setText(tf.getText()+"3");
      }else if(event.getSource()==four){
          tf.setText(tf.getText()+"4");
      }else if(event.getSource()==five){
          tf.setText(tf.getText()+"5");
      }else if(event.getSource()==six){
          tf.setText(tf.getText()+"6");
      }else if(event.getSource()==seven){
          tf.setText(tf.getText()+"7");
      }else if(event.getSource()==eight){
          tf.setText(tf.getText()+"8");
      }else if(event.getSource()==nine){
          tf.setText(tf.getText()+"9");
      }else if(event.getSource()==zero){
          tf.setText(tf.getText()+"0");
      }else if(event.getSource()==clear){
          tf.setText("");
      }else if(event.getSource()==plus){
          a = Double.parseDouble(tf.getText());
          operator = 1 ;
          tf.setText("");
      }else if(event.getSource()==minus){
          a = Double.parseDouble(tf.getText());
          operator = 2;
          tf.setText("");
      }else if(event.getSource()==mult){
          a = Double.parseDouble(tf.getText());
          operator = 3 ;
          tf.setText("");
      }else if(event.getSource()==division){
          a = Double.parseDouble(tf.getText());
          operator = 4 ;
          tf.setText("");
      }else if(event.getSource()==equals){
          b = Double.parseDouble(tf.getText());
          switch(operator){
              case 1 : result = a + b ; break;
              case 2 : result = a - b ; break;
              case 3 : result = a * b ; break;
              case 4 : try{
                        result = a/b ;
                      }catch(Exception e){
                          tf.setText("Error");
                      }
          }
          tf.setText(""+result);
      }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
