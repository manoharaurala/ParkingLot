package repositories;

import models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Integer,Ticket>ticketMap=new TreeMap<>();
    private static int previous_id=0;

    public TicketRepository() {
    }

    public Ticket save(Ticket ticket) {
        previous_id++;
        ticket.setId(previous_id);
        ticketMap. put(ticket.getId(),ticket);
        return ticket;
    }
}
