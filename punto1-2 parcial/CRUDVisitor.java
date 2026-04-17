// Generated from CRUD.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CRUDParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CRUDVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CRUDParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CRUDParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRUDParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(CRUDParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRUDParser#insertar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertar(CRUDParser.InsertarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRUDParser#buscar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuscar(CRUDParser.BuscarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRUDParser#actualizar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualizar(CRUDParser.ActualizarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRUDParser#eliminar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEliminar(CRUDParser.EliminarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRUDParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(CRUDParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRUDParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(CRUDParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRUDParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(CRUDParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRUDParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(CRUDParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CRUDParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(CRUDParser.CampoContext ctx);
}