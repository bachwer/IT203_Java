package Session15.Ex6;

import java.time.LocalDateTime;
import java.util.*;

public class TicketSystem {
    int currentNumber;
    Queue<Ticket> ticketQueue;

    public TicketSystem() {
        this.currentNumber = 0;
        this.ticketQueue = new LinkedList<>();
    }

    public Ticket issueTicket(){
        currentNumber++;
        Ticket ticket = new Ticket(currentNumber, (LocalDateTime.now()).toString());
        ticketQueue.offer(ticket);
        return ticket;
    }

    public Ticket callNext() {
        return ticketQueue.poll();
    }

}
