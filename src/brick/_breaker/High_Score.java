package brick._breaker;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class High_Score {

	Dbms_Connector database;
    private Connection connection = null;
    private int score, temp;
    private String name;
 

    public High_Score() {
        initial();
    }

    public void initial() {
        score = 0;
        temp = 0;
    }

    public void draw(Graphics2D a) {
        a.setColor(Color.RED);
        a.setFont(new Font("Courier New", Font.BOLD, 20));
        a.drawString("Score : " + score, 20, 20);
    }

    public int getScore() {
        return score;
    }

    public void addScore(int s) {
        score += s;
    }

    public void updateDatabase(boolean des) {
        if (des == false) { // check is the game finished yet
            
            if (temp < score && Brick_Breaker.get_GuestMode() == true) { // check is the score is bigger than temp and  the player guest or not

            	database = Dbms_Connector.getDatabase();
                connection = database.databaseConnection();

                try {
                    Statement st = connection.createStatement();
                    ResultSet r = st.executeQuery("SELECT * FROM sign_in");

                    while (r.next()) {
                        name = r.getString("user_Name"); //read user_Name from database sign_in
                    }

                    st.executeUpdate("insert into high_score values('" + name + "' , '" + score + "')");
                    ResultSet queery1 = st.executeQuery("DELETE FROM high_score WHERE high_Score < (Select MAX (high_score) FROM high_score)");
                } catch (SQLException ex) {
                    // JOptionPane.showMessageDialog(null, ex.getMessage());
                } finally {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        }
    }
}
