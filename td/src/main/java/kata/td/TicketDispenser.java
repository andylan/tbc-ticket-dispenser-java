package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TicketDispenser {

    private TurnNumberSequence turnNumberSequence;

    public TicketDispenser() {
        this(new TurnNumberSequence());
    }

    public TicketDispenser(TurnNumberSequence turnNumberSequence) {
        this.turnNumberSequence = turnNumberSequence;
    }

    public TurnTicket getTurnTicket()
    {
        // TODO-working-on: Depending on a static method violates the Dependency Inversion Principle and Open-Closed Principle.
        int newTurnNumber = this.turnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
