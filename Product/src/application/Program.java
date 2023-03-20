package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.nio.file.attribute.UserPrincipal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        for( int i=1; i <= n; i++){
            System.out.println("Product #"+i+" data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            if(ch == 'c'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                Product prod = new Product(name, price);
                list.add(prod);
            }
            else if (ch == 'u') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(sc.next());
                UsedProduct usedProd = new UsedProduct(name, price, date);
                list.add(usedProd);
            }
            else if (ch == 'i') {
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                ImportedProduct importProd = new ImportedProduct(name, price, customsFee);
                list.add(importProd);
            }
        }
        System.out.println("PRICE TAGS:");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }
}
