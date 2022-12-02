public class ticket {
    private int journies;
    public ticket(int initial_journies)
    {
        journies = initial_journies;
    }
    public int get_journies()
    {
        return journies;
    }
    public boolean can_ride()
    {
        boolean more_than_one = journies >=1;
        return more_than_one;
    }
    public void ride()
    {
        if(can_ride())
        {
            journies = journies -1;
        }
        else
        {
            System.out.println("not enough tickets");
        }
    }
}
