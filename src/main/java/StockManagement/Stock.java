package StockManagement;

public class Stock
{
    private String stockname;
    private int noofshare;
    private int shareprice;
    private int totalshareprice;
    private int totalstock;

    Stock(String stockname,int noofshare,int shareprice)
    {
        this.stockname=stockname;
        this.noofshare=noofshare;
        this.shareprice=shareprice;
    }

    public String getStockname()
    {
        return stockname;
    }

    public int getNoofshare()
    {
        return noofshare;
    }

    public int getShareprice()
    {
        return shareprice;
    }


    public int getTotalshareprice()
    {
        return totalshareprice;
    }

    public int getTotalstock()
    {
        return totalstock;
    }

    public void setStockname(String stockname)
    {
        this.stockname=stockname;
    }

    public void setNoofshare(int noofshare)
    {
        this.noofshare=noofshare;
    }

    public void setShareprice(int shareprice)
    {
        this.shareprice=shareprice;
    }

    public void setTotalshareprice(int totalshareprice)
    {
        this.totalshareprice=totalshareprice;
    }

    public void setTotalstock(int totalstock)
    {
        this.totalstock=totalstock;
    }

}
