package control.board;

import java.net.URL;
import java.util.ResourceBundle;

import control.Home;
import control.login.Mypage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class Admin_board implements Initializable{
	
	public static Admin_board admin_board;

	public Admin_board(){admin_board = this;}
	
	@FXML
    private BorderPane info_board;

    @FXML
    private Label notice;

    @FXML
    private Label QnA;

    @FXML
    private Label car_qna;

    @FXML
    private Label myQna;
    
    
    @FXML
    void act_QnA(MouseEvent event) {
    	
    }

    @FXML
    void act_car_qna(MouseEvent event) {
    	
    }

    @FXML
    void act_myQna(MouseEvent event) {
    	
    }	

    @FXML
    void act_notice(MouseEvent event) {
    	board.board_check = 1;
    	loadpage("/view/board/board_view");
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {// TODO Auto-generated method stub
    	board.board_check = 1;
    	loadpage("/view/board/board_view");
    }
    public void loadpage( String page ) {
		try {
			Parent parent = FXMLLoader.load( getClass().getResource(page+".fxml"));
			info_board.setCenter(parent);
		}
		catch( Exception e ) {
			System.out.println("Main 컨트롤 페이지 열기 실패"+ e); 
		}
	}
}
