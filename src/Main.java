import com.ripadbaisor.menu.Menu;
import com.ripadbaisor.restaurant.Restaurante;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // menú asociado a la clase Menu.java
        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        Menu menu = new Menu(restaurantes);
        menu.mostrarMenu();
    }
}
