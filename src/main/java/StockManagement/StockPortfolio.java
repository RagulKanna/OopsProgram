package StockManagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StockPortfolio
{
    ArrayList<Stock> stock = new ArrayList<Stock>();
    public static Scanner sc = new Scanner(System.in);
    public static int totalshareprice,noofshare=0, shareprice = 0,item=0,totalstock=0;
    public static String sharename=null;


    public static void main(String[] args) {

        StockPortfolio stocks = new StockPortfolio();
        System.out.println("\n\n Stock Management  ");
        System.out.print("\nHow many no of stock to be added:");
        int stock = sc.nextInt();

        for (int i = 0; i < stock; i++) {
            stocks.addstock(sharename, noofshare, shareprice);

            stocks.calculatestock();
        }

        stocks.display();


    }

    public void addstock(String sharename,int noofshare,int shareprice) {


        System.out.print("\n Enter the stock name:");
        sharename = sc.next();
        System.out.print("\n Enter no of share:");
        noofshare = sc.nextInt();
        System.out.print("\n Enter the shareprice:");
        shareprice = sc.nextInt();
        Stock details = new Stock(sharename, noofshare, shareprice);
        stock.add(details);
        totalshareprice = noofshare * shareprice;
        totalstock=totalstock+noofshare;



    }

    public static int calculatestock(Stock details)
    {

        return totalstock;

    }

    public static int calculateshareprice(Stock details)
    {

        return totalshareprice;

    }


    public void calculatestock()
    {

        totalshareprice=StockPortfolio.calculateshareprice(stock.get(item));
        this.stock.get(item).setTotalshareprice(totalshareprice);
        totalstock=StockPortfolio.calculatestock(stock.get(item));
        this.stock.get(item).setTotalstock(totalstock);
        item++;

    }

    public void display()
    {
        Iterator itr = stock.iterator();
        while (itr.hasNext()) {
            Stock details = (Stock) itr.next();
            System.out.println("\n\nName of the stock: " + details.getStockname());
            System.out.println("\nNo of Share: " + details.getNoofshare());
            System.out.println("\nShare price: " + details.getShareprice());
            System.out.println("\nTotal shareprice: " + details.getTotalshareprice());
            System.out.println("\nOverall stock: " + details.getTotalstock());
        }
    }
}
