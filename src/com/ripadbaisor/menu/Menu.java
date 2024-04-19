package com.ripadbaisor.menu;

import javax.swing.JOptionPane;

import com.ripadbaisor.restaurant.Restaurante;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Menu {

    private static ArrayList<Restaurante> restaurantes;

    public Menu(ArrayList<Restaurante> restaurantes) {
        Menu.restaurantes = restaurantes;
    }

    public void mostrarMenu() {
        boolean running = true;
        while (running) {
            try {
                String choice = JOptionPane.showInputDialog(
                    "Menú:\n" +
                    "1. Añadir restaurante\n" +
                    "2. Editar restaurante\n" +
                    "3. Mostrar restaurantes\n" +
                    "4. Eliminar restaurante\n" +
                    "Q. Salir del programa\n" +
                    "Ingrese la opción:"
                );

                if (choice == null || choice.equalsIgnoreCase("q")) {
                    running = false;
                } else {
                    switch (choice) {
                        case "1":
                            aniadirRestaurante();
                            break;
                        case "2":
                            editarRestaurante();
                            break;
                        case "3":
                            mostrarRestaurantes();
                            break;
                        case "4":
                            eliminarRestaurante();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida");
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una opción válida (número).");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }

    private void aniadirRestaurante() {
        try {
            String nombre = JOptionPane.showInputDialog("Nombre del restaurante:");
            String localizacion = JOptionPane.showInputDialog("Localización:");
            String horario = JOptionPane.showInputDialog("Horario:");
            int puntuacion = Integer.parseInt(JOptionPane.showInputDialog("Puntuación:"));

            Restaurante restaurante = new Restaurante(nombre, localizacion, horario, puntuacion);
            restaurantes.add(restaurante);
            JOptionPane.showMessageDialog(null, "Restaurante añadido correctamente.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese una puntuación válida (número entero).");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    private void editarRestaurante() {
        if (restaurantes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay restaurantes para editar.");
            return;
        }

        // Mostrar lista de restaurantes para seleccionar uno a editar
        StringBuilder restaurantesList = new StringBuilder("Seleccione el restaurante a editar:\n");
        for (int i = 0; i < restaurantes.size(); i++) {
            Restaurante restaurante = restaurantes.get(i);
            restaurantesList.append(i + 1).append(". ").append(restaurante.getNombre()).append("\n");
        }

        int opcion;
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(restaurantesList.toString())) - 1;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
            return;
        }

        if (opcion < 0 || opcion >= restaurantes.size()) {
            JOptionPane.showMessageDialog(null, "Opción no válida.");
            return;
        }
    }

    private static void mostrarRestaurantes() {
        Collections.sort(restaurantes, Comparator.comparingInt(Restaurante::getPuntuacion).reversed());

        StringBuilder sb = new StringBuilder("Restaurantes:\n \n Nombre del restaurante: \n");
        for (Restaurante restaurante : restaurantes) {
            sb.append(restaurante.getNombre())
                    .append(", \n Localización: \n")
                    .append(restaurante.getLocalizacion())
                    .append(", \n Horario: \n")
                    .append(restaurante.getHorario())
                    .append(", \n Puntuación: \n")
                    .append(restaurante.getPuntuacion())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    private static void eliminarRestaurante() {
        if (restaurantes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay restaurantes para eliminar.");
            return;
        }
    }
}
