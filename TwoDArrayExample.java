public class TwoDArrayExample {
    public static void main(String[] args) {
        // Define a 6x4 two-dimensional array with the given names
        String[][] names = {
            {"Tabujara", "Clariño", "Villaruz", "Guevarra"},
            {"Garcia", "Serrano", "Espeso", "Palustre"},
            {"Camarillo", "Sarmiento", "Abraham", "Sevilla"},
            {"Arquiza", "Pengson", "Bautista", "Cortez"},
            {"Diesta", "Villanueva", "Grecia", "Motita"},
            {"Zafico", "Gallano", "Almajo", "Tagapan"}
        };

        // Display the entire array
        System.out.println("Entire Array:");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }

        // Display only the first row
        System.out.println("\nFirst Row:");
        for (int i = 0; i < names[0].length; i++) {
            System.out.print(names[0][i] + " ");
        }
        System.out.println();

        // Display only the last row
        System.out.println("\nLast Row:");
        for (int i = 0; i < names[names.length - 1].length; i++) {
            System.out.print(names[names.length - 1][i] + " ");
        }
        System.out.println();

        // Display only the second column
        System.out.println("\nSecond Column:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i][1]);
        }

        // Display only the third column
        System.out.println("\nThird Column:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i][2]);
        }
    }
}
