import Entités.Musee;
import Services.MuseeService;

import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws SQLException {
        MuseeService museeService = new MuseeService();

        Musee musee1 = new Musee("Museum A", "Description A", "City A", "2024-03-13", "2024-03-20", "09:00", "17:00", 1);
        Musee musee2 = new Musee("Museum B", "Description B", "City B", "2024-03-14", "2024-03-21", "09:30", "18:00", 2);

        museeService.addMusee(musee1);
        museeService.addMusee(musee2);

        // Read all Musee objects from the database
        List<Musee> allMusees = museeService.getAllMusees();
        System.out.println("All Musees:");
        for (Musee musee : allMusees) {
            System.out.println(musee);
        }

        // Update Musee object
        musee1.setDescription("Updated Description A");
        museeService.updateMusee(musee1);

        // Read updated Musee objects from the database
        allMusees = museeService.getAllMusees();
        System.out.println("\nAll Musees after update:");
        for (Musee musee : allMusees) {
            System.out.println(musee);
        }

        // Delete Musee object
        museeService.deleteMusee(musee2.getId());

        // Read all Musee objects from the database after deletion
        allMusees = museeService.getAllMusees();
        System.out.println("\nAll Musees after deletion:");
        for (Musee musee : allMusees) {
            System.out.println(musee);
        }
    }
}
