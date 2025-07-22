import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookingDAO {
    public void insert(Booking b) throws Exception {
        Connection conn = DBConnection.initializeDatabase();
        String query = "INSERT INTO bookings (name, phone, pickup, drop_location, goods_type, weight, packaging_required, vehicle_type, date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, b.name);
        ps.setString(2, b.phone);
        ps.setString(3, b.pickup);
        ps.setString(4, b.drop);
        ps.setString(5, b.goods);
        ps.setDouble(6, b.weight);
        ps.setBoolean(7, b.packagingRequired);
        ps.setString(8, b.vehicle);
        ps.setString(9, b.date);
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}