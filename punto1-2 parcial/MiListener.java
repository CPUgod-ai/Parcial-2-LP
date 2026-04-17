import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MiListener extends CRUDBaseListener {

    @Override
    public void enterInsertar(CRUDParser.InsertarContext ctx) {
        System.out.println("=== INSERT ===");
        System.out.println("  Colección : " + ctx.ID().getText());
        System.out.println("  Datos     : " + ctx.lista().getText());
    }

    @Override
    public void enterBuscar(CRUDParser.BuscarContext ctx) {
        System.out.println("=== FIND ===");
        System.out.println("  Colección : " + ctx.ID().getText());
        if (ctx.condicion() != null)
            System.out.println("  Filtro    : " + ctx.condicion().getText());
        else
            System.out.println("  Filtro    : (todos los documentos)");
    }

    @Override
    public void enterActualizar(CRUDParser.ActualizarContext ctx) {
        System.out.println("=== UPDATE ===");
        System.out.println("  Colección : " + ctx.ID().getText());
        System.out.println("  Campo     : " + ctx.campo().getText());
        // ahora es valor() no expresion()
        System.out.println("  Nuevo val : " + ctx.valor().getText());
        if (ctx.condicion() != null)
            System.out.println("  Filtro    : " + ctx.condicion().getText());
    }

    @Override
    public void enterEliminar(CRUDParser.EliminarContext ctx) {
        System.out.println("=== DELETE ===");
        System.out.println("  Colección : " + ctx.ID().getText());
        System.out.println("  Filtro    : " + ctx.condicion().getText());
    }
}


