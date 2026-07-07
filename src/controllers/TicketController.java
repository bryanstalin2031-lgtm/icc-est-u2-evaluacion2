package controllers;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.TicketSoporte;

public class TicketController {
  public Set<TicketSoporte> filtrarYOrdenarTickets(List<TicketSoporte> tickets, int prioridadMinima){
    Set<TicketSoporte> ticketsFiltrados = new TreeSet<>((t1, t2) ->{
      int prioridadComparable = Integer.compare(t2.getPrioridad(), t1.getPrioridad());
      if(prioridadComparable != 0){
        return prioridadComparable;
      }else{
        return t1.getTecnico().compareToIgnoreCase(t2.getTecnico());
      }
    });
    for(TicketSoporte ticket : tickets){
      if(ticket.getPrioridad() >= prioridadMinima){
        ticketsFiltrados.add(ticket);
      }
      

    }
    return ticketsFiltrados;
  }

  public Map<Integer, Set<String>> agruparCodigosPorPrioridad(List<TicketSoporte> tickets){
    Map<Integer, Set<String>> agCodigo = new TreeMap<>();
    for(TicketSoporte ticket : tickets){
      int prioridad = ticket.getPrioridad();
      String codigo = ticket.getCodigo();
      if(agCodigo.containsKey(prioridad)){
        agCodigo.put(prioridad, new LinkedHashSet<>());
      }
      agCodigo.get(prioridad).add(codigo);
    }
    return agCodigo;
  }

  

  
}
