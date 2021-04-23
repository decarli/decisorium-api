package business.aiconsult.decisorium.resource;

import business.aiconsult.decisorium.model.VendaEntity;
import business.aiconsult.decisorium.service.VendaService;
import io.smallrye.common.constraint.NotNull;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/venda")
public class VendaResource {

    @Inject
    private VendaService vendaService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response gravar(@NotNull @HeaderParam("apiKey") String apiKey, VendaEntity venda) {
//        vendaService.gravar(venda);

        return Response.ok("Ok").build();
    }

    @POST
    @Path("/lote")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response gravarLote(@NotNull @HeaderParam("apiKey") String apiKey, List<VendaEntity> venda) {
//        vendaService.gravar(venda);

        return Response.ok("Ok").build();
    }
}