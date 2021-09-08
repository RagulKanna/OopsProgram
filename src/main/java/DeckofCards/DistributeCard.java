package DeckofCards;

public class DistributeCard extends Cards{
    public static void main(String[] args) {

        distribute();
        printcard();
    }
    public static void distribute()
    {
        for(int i=0;i<PLAYERS;i++)
        {
            for (int j=0;j<CARDS;j++)
            {
                String s1=getRandom(suit);
                String s2=getRandom(rank);
                Playercard[i][j]=s1.concat(s2);

            }
        }

    }

    public static void printcard()
    {
        for(int i=0;i<PLAYERS;i++)
        {
            int c=i+1;
            System.out.println("\n\n Player "+c+" cards:");
            for (int j=0;j<CARDS;j++)
            {
                System.out.print(Playercard[i][j]+" ");

            }
        }
    }
}
