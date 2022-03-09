import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.util.Timer;
import java.util.TimerTask;

public class SampleController {

    String operation = "";
    int result = 0;
    int firstHalf = 0;
    int secondHalf = 0;
    @FXML
    private Button clear;

    @FXML
    private TextArea display;

    @FXML
    private Button divide;

    @FXML
    private Button eight;

    @FXML
    private Button equal;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

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
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    @FXML
    void buttonClicked(ActionEvent event) {
        if(event.getSource() == zero){
            display.setText(display.getText()+"0");
        }
        else if(event.getSource() == one){
            display.setText(display.getText()+"1");
        }
        else if(event.getSource() == two){
            display.setText(display.getText()+"2");
        }
        else if(event.getSource() == three){
            display.setText(display.getText()+"3");
        }
        else if(event.getSource() == four){
            display.setText(display.getText()+"4");
        }
        else if(event.getSource() == five){
            display.setText(display.getText()+"5");
        }
        else if(event.getSource() == six){
            display.setText(display.getText()+"6");
        }
        else if(event.getSource() == seven){
            display.setText(display.getText()+"7");
        }
        else if(event.getSource() == eight){
            display.setText(display.getText()+"8");
        }
        else if(event.getSource() == nine){
            display.setText(display.getText()+"9");
        }
        else if(event.getSource() == plus){

            if(!display.getText().trim().isEmpty()){
                firstHalf = Integer.parseInt(display.getText());
                operation = "plus";
                display.setText("");    
            }
            else{
                firstHalf = 0;
                operation = "plus";
            }
            
        }
        else if(event.getSource() == minus){
            if(!display.getText().trim().isEmpty()){
                firstHalf = Integer.parseInt(display.getText());
                operation = "minus";
                display.setText("");    
            }
            else{
                firstHalf = 0;
                operation = "minus";
            }
        }
        else if(event.getSource() == multiply){
            if(!display.getText().trim().isEmpty()){
                firstHalf = Integer.parseInt(display.getText());
                operation = "multiply";
                display.setText("");    
            }
            else{
                firstHalf = 0;
                operation = "multiply";
            }
        }
        else if(event.getSource() == divide){
            if(!display.getText().trim().isEmpty()){
                firstHalf = Integer.parseInt(display.getText());
                operation = "divide";
                display.setText("");    
            }
            else{
                firstHalf = 0;
                operation = "divide";
            }
        }
        else if(event.getSource() == equal){
            Boolean flag  = false;
            if(!display.getText().trim().isEmpty()){
                secondHalf = Integer.parseInt(display.getText());
            }
            else{
                secondHalf = 0;
            }

            if(operation == "plus"){
                result = firstHalf + secondHalf;
            }
            else if(operation == "minus"){
                result = firstHalf - secondHalf;
            }
            else if(operation == "multiply"){
                result = firstHalf * secondHalf;
            }
            else if(operation == "divide"){
                
                if(secondHalf == 0){
                    flag = true;
                }
                else{
                    result = firstHalf / secondHalf;
                }
                
            }
            if(flag == true){
                display.setText("INFINITY");

                Timer timer = new Timer();
                TimerTask task = new TimerTask()
                {
                        public void run()
                        {
                            one.setDisable(true);
                            two.setDisable(true);
                            three.setDisable(true);
                            four.setDisable(true);
                            five.setDisable(true);
                            six.setDisable(true);
                            seven.setDisable(true);
                            eight.setDisable(true);
                            nine.setDisable(true);
                            zero.setDisable(true);
                            equal.setDisable(true);
                            plus.setDisable(true);
                            minus.setDisable(true);
                            multiply.setDisable(true);
                            divide.setDisable(true);
                            
                        }
                
                };
                timer.schedule(task,0);

            }else{
                display.setText(String.valueOf(result));
            }
            
        }
        else{
            if(equal.isDisabled() == true){
                one.setDisable(false);
                two.setDisable(false);
                three.setDisable(false);
                four.setDisable(false);
                five.setDisable(false);
                six.setDisable(false);
                seven.setDisable(false);
                eight.setDisable(false);
                nine.setDisable(false);
                zero.setDisable(false);
                equal.setDisable(false);
                plus.setDisable(false);
                minus.setDisable(false);
                multiply.setDisable(false);
                divide.setDisable(false);
            }
            display.setText("");
            firstHalf = 0;
            secondHalf = 0;
            result = 0;
        }
    }

}
