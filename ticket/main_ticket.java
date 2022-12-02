public class main_ticket {
    public static void main(String[] args){
    ticket myTicket = new ticket(10);
    myTicket.ride();
    myTicket.ride();
    System.out.println("Journeys remaining: " +   myTicket.get_journies());
    }
}
