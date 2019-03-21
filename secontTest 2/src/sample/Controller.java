package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
//import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Pane home_pane,gal_pane, obs_pane, rec_pane, up_pane;

    @FXML
    private JFXButton home_btn, gal_btn, rec_btn,obs_btn, up_btn;
    //buttons that cange pages

    @FXML
    private JFXButton add_gal_btn, eql_gal_btn, eql_obs_chk_btn, add_obs_btn, up_gal_btn,up_obs_btn,del_gal_btn,del_obs_btn;
    //buttons that add, update, retrieve and delete info.

    @FXML
    private JFXButton rec_view_gal_btn,rec_view_obs_btn, rec_ave_color_btn, rec_col_btn, rec_view_spec_gal_btn;
    //buttons for the record part

    @FXML
    private Pane rec_view_gal_pane, rec_view_obs_pane, rec_avg_color_pane, rec_view_spec_gal_pane,rec_col_pane, rec_Apane;
    //the various pages

    @FXML
    private JFXTextField  add_gal_name_txt, add_gal_obs_name_txt1,eql_gal1_txt, eql_gal2_txt, add_obs_name_text, add_obs_cntry_txt,add_obs_size_txt,eql_obs1_txt, eql_obs2_txt,
            up_gal_name_txt, up_gal_obs_name_txt1,up_obs_name_txt, up_obs_cnty_txt,up_obs_size_txt;
    //all the text fields in the ui

    @FXML
    private JFXDatePicker add_gal_date, add_obs_date, up_gal_date_btn,up_obs_date_btn;
    //for the dates in the ui

    @FXML
    private MenuButton add_gal_color_tbtn,up_gal_color_tbtn;
    //for the menu buttons for the color

    @FXML
    private CheckBox add_obs_chk_btn, up_obs_chk_btn;
    //for the checkboxes int the ui



    @FXML
    private void pageButtonActionHandler(ActionEvent action){
        if(action.getSource()==home_btn){
            home_pane.toFront();

        }else if(action.getSource()==gal_btn){
            gal_pane.toFront();

        }else if(action.getSource()==obs_btn){
            obs_pane.toFront();

        }else if(action.getSource()==rec_btn){
            rec_pane.toFront();

        }else if(action.getSource()==up_btn){
            up_pane.toFront();

        }
    }

    @FXML
    private void buttonActionHandler(ActionEvent action){
        if(action.getSource()==add_gal_btn){
            //home_pane.toFront();
            //System.out.println(add_gal_name_txt.getText()+add_gal_obs_name_txt1.getText(),+,  add_gal_color_tbtn.getItems(), add_gal_date.getValue());
            System.out.println("added event");

        }else if(action.getSource()==eql_gal_btn){
            //gal_pane.toFront();
            System.out.println(eql_gal1_txt.getText()+ eql_gal2_txt.getText());
            System.out.println("checked event");

        }else if(action.getSource()==add_obs_btn){
            //obs_pane.toFront();
            System.out.println(add_obs_name_text.getText()+add_obs_cntry_txt.getText()+add_obs_date.getValue()+add_obs_size_txt.getText()+add_obs_chk_btn.isSelected());
            System.out.println("added obs");

        }else if(action.getSource()==eql_obs_chk_btn){
            //rec_pane.toFront();
            System.out.println(eql_obs1_txt.getText()+eql_obs2_txt.getText());
            System.out.println("checked obs");

        }else if(action.getSource()==up_gal_btn) {
            //System.out.println(up_gal_name_txt.getText()+up_gal_obs_name_txt1.getText(),+, up_gal_color_tbtn.getItems(), up_gal_date_btn.getValue());
            //up_pane.toFront();
            System.out.println("up event");

        }else if(action.getSource()==del_gal_btn){
            //rec_pane.toFront();
            System.out.println("del event");

        }else if(action.getSource()==up_obs_btn) {
            System.out.println(up_obs_name_txt.getText()+up_obs_cnty_txt.getText()+up_obs_date_btn.getValue()+up_obs_size_txt.getText()+up_obs_chk_btn.isSelected());
            //up_pane.toFront();
            System.out.println("up obs");

        }else if(action.getSource()==del_obs_btn) {
            //up_pane.toFront();
            System.out.println("del obs");

        }
    }

    @FXML
    private void recButtonActionHandler(ActionEvent action){
        if(action.getSource()==rec_ave_color_btn){
            rec_avg_color_pane.toFront();

        }else if(action.getSource()==rec_view_gal_btn){
            rec_view_gal_pane.toFront();

        }else if(action.getSource()==rec_view_obs_btn){
            rec_view_obs_pane.toFront();

        }else if(action.getSource()==rec_view_spec_gal_btn){
            rec_view_spec_gal_pane.toFront();

        }else if(action.getSource()==rec_col_pane){
            rec_col_pane.toFront();

     /*   }else if(action.getSource()==rec_btn){
            rec_Apane.toFront();

        }*/
    }}

    @Override
    public void initialize(URL url, ResourceBundle rb){

    }
}
