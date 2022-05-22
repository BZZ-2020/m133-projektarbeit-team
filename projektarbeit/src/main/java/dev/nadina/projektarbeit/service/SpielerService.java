package dev.nadina.projektarbeit.service;

import dev.nadina.projektarbeit.data.DataHandler;
import dev.nadina.projektarbeit.model.Spieler;
import dev.nadina.projektarbeit.model.Sportarten;
import dev.nadina.projektarbeit.model.Team;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("teamprojekt")
public class SpielerService {
    @Path("spieler")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listSpieler(){
        List<Spieler> SpielerList = DataHandler.getInstance().readAllSpielers();
        return Response
                .status(200)
                .entity(SpielerList)
                .build();
    }


}
