package Session15.Ex6;

public class Ticket {
    int ticketNumber;
    String issuedTime;


    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getIssuedTime() {
        return issuedTime;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setIssuedTime(String issuedTime) {
        this.issuedTime = issuedTime;
    }
}
