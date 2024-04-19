import com.ripadbaisor.menu.Menu;
import com.ripadbaisor.restaurant.Restaurante;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        Menu menu = new Menu(restaurantes);
        menu.mostrarMenu();
    }
}
