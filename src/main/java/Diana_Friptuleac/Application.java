package Diana_Friptuleac;

import Diana_Friptuleac.classes.Customer;
import Diana_Friptuleac.classes.Order;
import Diana_Friptuleac.classes.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        System.out.println("--------------------Lista Prodotti--------------------");

        // Lista dei prodotti esistenti
        List<Product> products = new ArrayList<>();
        products.add(new Product(1254444464, "Samsung Galaxy A15", "Elettronica", 199.99));
        products.add(new Product(1254452111, "The Message", "Books", 111.60));
        products.add(new Product(1258488611, "How to Catch an Elf", "Baby", 6.99));
        products.add(new Product(1256894464, "IPhone 15", "Elettronica", 1180.00));
        products.add(new Product(1254446564, "TV", "Elettronica", 850.00));
        products.add(new Product(1254444464, "", "Elettronica", 199.99));
        products.add(new Product(1589994464, "Be Ready When the Luck Happens", "Books", 155.99));
        products.add(new Product(1254444464, "Culla", "Baby", 355.99));
        products.add(new Product(1254444464, "Latte in polvere", "Baby", 44.99));
        products.add(new Product(1254444464, "Harry Potter", "Books", 29.95));
        products.add(new Product(1254458445, "Toy Bear", "Boys", 55.00));
        products.add(new Product(855223445, "Puzzle", "Boys", 85.50));

        // ****************************************Stampo la lista dei prodotti******************************
        products.forEach(System.out::println);


        //********************************** Creo i customers *******************************
        Customer mario = new Customer(25122, "Mario", 2);
        Customer anna = new Customer(25256122, "Anna", 2);
        Customer carlo = new Customer(222, "Carlo", 3);
        Customer luca = new Customer(252512, "Luca", 1);
        Customer giulia = new Customer(565122, "Giulia", 3);
        Customer roberto = new Customer(785122, "Roberto", 2);
        Customer chiara = new Customer(999122, "Chiara", 1);
        Customer sara = new Customer(123344, "Sara", 2);
        Customer stefano = new Customer(876567, "Stefano", 1);
        Customer marco = new Customer(563214, "Marco", 3);


        //*****************************************Ordini***************************************

        // Creo gli ordini
        List<Order> myOrders = new ArrayList<>();

        // Ordine 1: con "Harry Potter" e "IPhone 15" per Mario
        List<Product> firstOrderProducts = new ArrayList<>();  //creo la lista prodotti chiamata firstOrderProducts
        firstOrderProducts.add(products.get(9)); // Harry Potter
        firstOrderProducts.add(products.get(3)); // IPhone 15
        Order firstOrder = new Order(1254414, "Elaborazione", LocalDate.of(2024, 3, 15), LocalDate.now().plusDays(5), firstOrderProducts, mario);
        myOrders.add(firstOrder);

        // Ordine 2: con "How to Catch an Elf" e "Latte in polvere" per Anna
        List<Product> secondOrderProducts = new ArrayList<>();
        secondOrderProducts.add(products.get(2)); // How to Catch an Elf
        secondOrderProducts.add(products.get(8)); // Latte in polvere
        Order secondOrder = new Order(1254415, "Spedito", LocalDate.of(2024, 7, 10), LocalDate.now().plusDays(2), secondOrderProducts, anna);
        myOrders.add(secondOrder);

        // Ordine 3: con "Culla" per Carlo
        List<Product> thirdOrderProducts = new ArrayList<>();
        thirdOrderProducts.add(products.get(7)); // Culla
        Order thirdOrder = new Order(1254416, "Preso in carico", LocalDate.of(2024, 7, 10), LocalDate.now().plusDays(6), thirdOrderProducts, carlo);
        myOrders.add(thirdOrder);

        // Ordine 4: con "Puzzle" e "Toy Bear" per Luca
        List<Product> fourthOrderProducts = new ArrayList<>();
        fourthOrderProducts.add(products.get(10)); // Puzzle
        fourthOrderProducts.add(products.get(11)); // Toy Bear
        Order fourthOrder = new Order(1254417, "Elaborazione", LocalDate.of(2024, 9, 1), LocalDate.now().plusDays(3), fourthOrderProducts, luca);
        myOrders.add(fourthOrder);

        // Ordine 5: con "The Message" per Giulia
        List<Product> fifthOrderProducts = new ArrayList<>();
        fifthOrderProducts.add(products.get(1)); // The Message /Book
        Order fifthOrder = new Order(1254418, "Spedito", LocalDate.of(2024, 9, 3), LocalDate.now().plusDays(1), fifthOrderProducts, giulia);
        myOrders.add(fifthOrder);

        // Ordine 6: con "TV" per Roberto
        List<Product> sixthOrderProducts = new ArrayList<>();
        sixthOrderProducts.add(products.get(4)); // TV
        Order sixthOrder = new Order(1254419, "Confermato", LocalDate.of(2024, 9, 5), LocalDate.now().plusDays(2), sixthOrderProducts, roberto);
        myOrders.add(sixthOrder);

        // Ordine 7: con "Latte in polvere" e "Culla" per Chiara
        List<Product> seventhOrderProducts = new ArrayList<>();
        seventhOrderProducts.add(products.get(8)); // Latte in polvere
        seventhOrderProducts.add(products.get(7)); // Culla
        Order seventhOrder = new Order(1254420, "Spedito", LocalDate.of(2024, 9, 6), LocalDate.now().plusDays(5), seventhOrderProducts, chiara);
        myOrders.add(seventhOrder);

        // Ordine 8: con "Samsung Galaxy A15" per Sara
        List<Product> eighthOrderProducts = new ArrayList<>();
        eighthOrderProducts.add(products.get(0)); // Samsung Galaxy A15
        Order eighthOrder = new Order(1254421, "Elaborazione", LocalDate.of(2024, 9, 7), LocalDate.now().plusDays(4), eighthOrderProducts, sara);
        myOrders.add(eighthOrder);

        // Ordine 9: con "Be Ready When the Luck Happens" per Stefano
        List<Product> ninthOrderProducts = new ArrayList<>();
        ninthOrderProducts.add(products.get(6)); // Be Ready When the Luck Happens
        Order ninthOrder = new Order(1254422, "Confermato", LocalDate.of(2024, 9, 8), LocalDate.now().plusDays(2), ninthOrderProducts, stefano);
        myOrders.add(ninthOrder);

        // Ordine 10: con "Harry Potter" e "IPhone 15" per Marco
        List<Product> tenthOrderProducts = new ArrayList<>();
        tenthOrderProducts.add(products.get(9)); // Harry Potter
        tenthOrderProducts.add(products.get(3)); // IPhone 15
        Order tenthOrder = new Order(1254423, "Elaborazione", LocalDate.of(2024, 9, 9), LocalDate.now().plusDays(3), tenthOrderProducts, marco);
        myOrders.add(tenthOrder);

        // Ordine 11: "Be Ready When the Luck Happens" secondo ordine per Marco
        List<Product> eleventhOrderProducts = new ArrayList<>();
        ninthOrderProducts.add(products.get(6)); // Be Ready When the Luck Happens
        Order eleventhOrder = new Order(1254455, "Spedito", LocalDate.of(2024, 9, 15), LocalDate.now().plusDays(5), eleventhOrderProducts, marco);
        myOrders.add(tenthOrder);


        System.out.println();
        System.out.println("******************************Ex1**********************************");
        //Raggruppare gli ordini per cliente utilizzando Stream e Lambda Expressions.

        Map<Customer, List<Order>> ordinePerCliente = myOrders.stream().collect(Collectors.groupingBy(order -> order.getCustomer()));
        // (order.getCustomer() la key- cliente / value- lista di ordini.

        //Stampo il cliente
        ordinePerCliente.forEach((customer, orders) -> {
            System.out.println("Cliente: " + customer.getName());

            //Stampo ordini
            System.out.println("Ordini effettuati:");
            orders.forEach(order -> {
                System.out.println("  Ordine ID: " + order.getIdOrder() +
                        ", Stato: " + order.getStatus() +
                        ", Data Ordine: " + order.getOrderDate() +
                        ", Data Consegna: " + order.getDeliveryDate());

                //stampo prodotti
                System.out.println("  Prodotti ordinati:");
                order.getProducts().forEach(product -> {
                    System.out.println("    - " + product.getName() + " (" + product.getCategory() + "), Prezzo: €" + product.getPrice());
                });
                System.out.println();
            });
            System.out.println("--------------------------------------");
        });

        System.out.println("******************************Ex2**********************************");
        // Calcola il totale delle vendite per ogni cliente utilizzando Stream e Lambda Expressions

        Map<Customer, Double> sommaVenditeCliente = myOrders.stream()
                .collect(Collectors.groupingBy(order -> order.getCustomer(), // Raggruppo per ottenere il cliente
                        Collectors.summingDouble(order -> order.getProducts().stream() // Per ogni ordine ottiengo i prodotti e sommo
                                .mapToDouble(product -> product.getPrice()) // Ottiengo il prezzo di ogni prodotto e trasformo ogni elemento dello stream in un double
                                .sum()))); // Sommo i prezzi di tutti i prodotti

        //Stampo il totale per ogni cliente
        sommaVenditeCliente.forEach((customer, sum) -> {
            System.out.println("Cliente: " + customer.getName() + " " + customer.getId());
            System.out.println("Somma acquisti: " + sum);
            System.out.println("--------------------------------------");
        });
    }
}
