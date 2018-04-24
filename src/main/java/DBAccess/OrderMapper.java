package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Material;
import FunctionLayer.Order;
import FunctionLayer.Shed;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderMapper {
    
    
        public static Material getMaterial ( int type ) throws ClassNotFoundException, SQLException, LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * from materials where id = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, type);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            int id = rs.getInt("id");
            String mat = rs.getString("type");
            int price = rs.getInt("price");
            String description = rs.getString("description");
            
            Material material = new Material(id, mat, price, description);
            
            return material;
            }
            return null;
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }
        
        public static void createOrder( Order order ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (id, userID, price, materialID, height, length, width, roofID, shed) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, order.getId());
            ps.setInt( 2, order.getUserID());
            ps.setInt( 3, order.getPrice() );
            ps.setInt( 4, order.getMaterial());
            ps.setInt( 5, order.getHeight());
            ps.setInt( 6, order.getLength() );
            ps.setInt( 7, order.getWidth());
            ps.setInt( 8, order.getRoofID());
            ps.setInt( 9, order.getShed() );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
        
        public static void createShed( Shed shed ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (id, userID, price, materialID, height, length, width, roofID, shed) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, shed.getId());
            ps.setInt( 2, shed.getPrice());
            ps.setInt( 3, shed.getLength());
            ps.setInt( 4, shed.getWidth());
            ps.executeUpdate();
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }

}

