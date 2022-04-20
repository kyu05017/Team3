package Controller.board;


import java.net.URL;
import java.util.ResourceBundle;

import control.login.Login;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class board implements Initializable{
	
	@FXML
    private TableView<?> table;

    @FXML
    private Label board_name;

    @FXML
    private Button bt_write;

    public static int board_check = 0;
    
    @FXML
    void act_write(MouseEvent event) {
    	if(Login.member == null) {
    		Alert alert2 = new Alert(AlertType.INFORMATION);
    		alert2.setTitle("�˸�â");
    		alert2.setHeaderText(" �α��� �� �̿� �����մϴ�. ");
    		alert2.setContentText("Ȯ��");
    		alert2.showAndWait();
    	}
    	else {
    		if(board_check == 1) {
    			Admin_board.admin_board.loadpage("/view/board/write");
    		}
    		else if(board_check == 2){
    			Main_board.main_board.loadpage("/view/board/write");
    		}
    		
    	}
    }

    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	bt_write.setVisible(false);
    	
    	if(board_check == 1) {
    		board_name.setText("��������");
    		if(Login.member != null) {
    			if(Login.member.getM_gr() == 3) {
        			bt_write.setVisible(true);
        		}
    		}
    	}
    	
    	
    	else if(board_check == 2){
    		board_name.setText("���� �Խ���");
    		bt_write.setVisible(true);
    	}
    	

    }
	
}