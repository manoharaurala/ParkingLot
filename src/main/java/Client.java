import controllers.TicketController;
import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import enums.ResponseStatus;
import enums.VehicleType;
import repositories.GateRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import services.TicketService;

public class Client {
    public static void main(String[] args) {
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        GateRepository gateRepository = new GateRepository();
        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                ticketRepository
        );
        TicketController ticketController = new TicketController(ticketService);
        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setGateId(1);
        issueTicketRequestDTO.setOwnerName("Alice");
        issueTicketRequestDTO.setVehicleNumber("KA-19-MN-5614");
        issueTicketRequestDTO.setVehicleType(VehicleType.CAR);
        IssueTicketResponseDTO response=ticketController.issueTicket(issueTicketRequestDTO);
        if(response.getResponseStatus()== ResponseStatus.SUCCESS){
            System.out.println("Ticket issued successfully ticketId: "+response.getTicketId()+" slotNumber: "+response.getSlotNumber());
        }
        else{
            System.out.println("Ticket issue failed: "+response.getFailureMessage());
        }
    }
}
