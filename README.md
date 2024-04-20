# PROG-UD5-RankingRestaurantes
Este proyecto va de una aplicación de gestión de restaurantes desarrollado en Java.

## Estructura de carpetas
Iniciamos nuestro proyecto con la estructura de los paquetes en este caso src > com > ripadbaisor > menu / restaurant,
como se muestra en la siguiente imagen:

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/c37b62b9-2eb5-43d5-bb0c-2b363c6dc9bb)

## Funcionalidades

### Java swing JOptionPane
Para este proyecto importamos la libreria swing de Java mas específicamente la clase JOptionPane de la misma el cual nos sirve para 
crear componentes graficos para crear interfaces para el usuario.

### ArrayList
También utlizamos arraylist el cual nos sirve para almacenar y manipular elementos ordenados de una manera más eficiente.
a diferencia de los estáticos, los ArrayList pueden cambiar de tamaño dinámicamente y no es necesario declarar su tamaño inicialmente.

### Collections
util.Collections se utilizó en este proyecto para operar y manipular colecciones a la hora de mostrar los restaurantes ordenadamente.

### Comparator
Define un ordenamiento personalizados para los objetos el cual los compara entre sí y determina un orden, también se utiliza comúnmente en conjunción con las clases de util.collections.
En este caso se utilizó para comparar y ordenar los restaurantes por ranking de mayor a menor.

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/da1a52cd-9fd9-410a-8786-6270d600d9b1)

## Ejecución del programa

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/75e0ad65-31fa-44ef-b0da-aba71d1f2715)

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/41deca50-154e-4b6c-ad73-88fa36f7348a)

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/9977178e-9c5c-4ec8-b021-7fab21b3b6fa)

![Captura de pantalla 2024-04-20 135420](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/c0e191ca-af3c-4698-9791-a72614ecd30f)

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/f88437e7-620d-46b5-9461-04c797fd014c)

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/db1d3e31-549a-4586-b7ad-1216eb83dc21)

### Ahora mostramos los datos ordenadamente del restaurante introducido:

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/5f865703-5653-4044-9271-2cf51c79bb76)

con la opción 2 tambien podemos editar un restaurante que hayamos introducido como se muestra a continuación

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/2dfa7792-6155-46f1-af8e-2bafe7c8ba1e)

con la opción 3 mostramos los restaurantes 

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/cbcd1549-dcc5-449a-87d5-d88e7cba3ec7)

con la opción 4 podemos eliminar un restaurante

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/255d7a7d-1773-4696-9457-75d648b716de)

y por ultimo con la letra q salimos del programa

![image](https://github.com/FranciscoABruno/PROG-UD5-RankingRestaurantes/assets/159430483/facec8f8-04f2-4e78-8a2d-8c67949ec457)

## Try Catch

Y por ultimo pero no menos importante los try catch que son para detectar excepciones en nuestro código.
Se utilizó en el codigo para evitar excepciones o errores por ejemplo al momento de añadir un restaurante

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
