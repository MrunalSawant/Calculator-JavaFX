package calculatorjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import java.lang.Math;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Button clear;

    @FXML
    private Button division;

    @FXML
    private Button eight;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button fraction;

    @FXML
    private Button minus;

    @FXML
    private Button mult;

    @FXML
    private Button negative;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button square;

    @FXML
    private Button squareRoot;

    @FXML
    private TextField tf;

    @FXML
    private TextField tf2;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    private int operator ;
    double a,b,result ;
    String prevStr="";

    @FXML
    private void handleButtonAction(ActionEvent event) {
        String str = ((Labeled)event.getSource()).getText();
        tf.setText(tf.getText()+str);
        tf2.setText(prevStr+str);
        prevStr = tf2.getText();
    }

    @FXML
    private void add(){
        try{
            a = Double.parseDouble(tf.getText());
            operator = 1 ;
            tf2.setText(prevStr+"+");
            prevStr = tf2.getText();
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            tf.setText("");
        }
    }

    @FXML
    private void substract(){
        try{
            a = Double.parseDouble(tf.getText());
            operator = 2 ;
            tf2.setText(prevStr+"-");
            prevStr = tf2.getText();
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            tf.setText("");
        }
    }

    @FXML
    private void multiply(){
        try{
            a = Double.parseDouble(tf.getText());
            operator = 3 ;
            tf2.setText(prevStr+"*");
            prevStr = tf2.getText();
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            tf.setText("");
        }
    }
    @FXML
    private void clearText(){
        tf.setText("");
        tf2.setText("");
        prevStr="";
    }

    @FXML
    private void divide(){
        try{
            a = Double.parseDouble(tf.getText());
            operator = 4 ;
            tf2.setText(prevStr+"/");
            prevStr = tf2.getText();
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            tf.setText("");
        }
    }

    @FXML
    private void equals(){
        try{
            b = Double.parseDouble(tf.getText());

            switch(operator){
                case 1 : result = a + b ; tf.setText(""+result);  break;
                case 2 : result = a - b ; tf.setText(""+result);  break;
                case 3 : result = a * b ; tf.setText(""+result);  break;
                case 4 : try{
                    result = a/b ;
                    tf.setText(""+result);

                }catch(Exception e){
                    tf.setText("Error");
                }
            }
            tf2.setText(prevStr+"="+result);

        }catch(NumberFormatException e){
            System.out.println("Select values First");
        }
    }

    @FXML
    void fractor(ActionEvent event) {
        try{
            a = Double.parseDouble(tf.getText());
            tf2.setText("");
            tf2.setText("1/" + a);
            prevStr = tf2.getText();
            try{
                result = 1 / a;
            }
            catch (Exception e){
                tf.setText("Error");
            }
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            tf.setText(""+result);
        }
    }

    @FXML
    void negate(ActionEvent event) {
        try{
            a = Double.parseDouble(tf.getText());
            tf2.setText("");
            tf2.setText("-" + a);
            prevStr = tf2.getText();
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            tf.setText(""+prevStr);
        }
    }

    @FXML
    void root(ActionEvent event) {
        try{
            a = Double.parseDouble(tf.getText());
            tf2.setText("√" + a);
            prevStr = tf2.getText();
            try {
                result = Math.sqrt(a) ;
            }
            catch(Exception e){
                tf.setText("Error");
            }
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            tf.setText(""+result);
        }
    }

    @FXML
    void squared(ActionEvent event) {
        try{
            a = Double.parseDouble(tf.getText());
            tf2.setText(prevStr+"^2");
            prevStr = tf2.getText();
        }catch(NumberFormatException e){
            System.out.println("Enter value First");
        }finally{
            tf.setText(""+ (a * a));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
