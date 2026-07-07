import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import controllers.TicketController;
import models.TicketSoporte;

public class App {
    public static void main(String[] args) throws Exception {
        List<TicketSoporte> tickets = new ArrayList<>();

        tickets.add(new TicketSoporte("TK-104", "Ana Torres", 5));
        tickets.add(new TicketSoporte("TK-101", "Luis Mora", 2));
        tickets.add(new TicketSoporte("TK-108", "Carlos Vega", 4));
        tickets.add(new TicketSoporte("TK-104", "Ana Torres", 5));
        tickets.add(new TicketSoporte("TK-103", "Luis Andrade", 3));
        tickets.add(new TicketSoporte("TK-107", "Mateo Rojas", 1));
        tickets.add(new TicketSoporte("TK-102", "Sofia Cordero", 4));
        tickets.add(new TicketSoporte("TK-106", "Carlos Mendez", 5));
        tickets.add(new TicketSoporte("TK-105", "Ana Molina", 2));

        runTicketController();
    }

    private static void runTicketController() {
        TicketController ticketController = new TicketController();
        Set<TicketSoporte> ticketsFiltrados =  ticketController.filtrarYOrdenarTickets(null, 5);
        for(TicketSoporte t : ticketsFiltrados){
            System.out.println(t.getCodigo()+ t.getTecnico() + t.getPrioridad());
        }

        //Map<Integer, Set<String>> agCodigo = ticketController.agruparCodigosPorPrioridad(null);
        //for(TicketSoporte t : agCodigo){
        
            
        
        
    }
}
