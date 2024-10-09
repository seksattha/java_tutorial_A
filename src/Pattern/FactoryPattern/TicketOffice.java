package Pattern.FactoryPattern;

public class TicketOffice {
        private static final TicketMachine ticketMachine = new TicketMachine();
    public static void main(String[] args) {

        buyABusTicket();
        buyATrainTicket();


    }

    public static void buyABusTicket() {
        Ticket ticket = ticketMachine.createTicket("Bus");
        System.out.println("One bus ticket purchased" + "Price => " + ticket.getPrice());
    }

    public static void buyATrainTicket() {
        Ticket ticket = ticketMachine.createTicket("Train");
        System.out.println("One bus ticket purchased" + "Price => " + ticket.getPrice());
    }
}
