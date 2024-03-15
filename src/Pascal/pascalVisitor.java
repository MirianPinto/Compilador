// Generated from C:/Users/miria/IdeaProjects/Compilador/src/Grammar/pascal.g4 by ANTLR 4.13.1
package Pascal;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pascalParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(pascalParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(pascalParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(pascalParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(pascalParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBlock(pascalParser.VarBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(pascalParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(pascalParser.VarIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(pascalParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(pascalParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#arrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrDecl(pascalParser.ArrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#arr1D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr1D(pascalParser.Arr1DContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#arr2D}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr2D(pascalParser.Arr2DContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstBlock(pascalParser.ConstBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(pascalParser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constCharDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstCharDecl(pascalParser.ConstCharDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#constStrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStrDecl(pascalParser.ConstStrDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#functionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBlock(pascalParser.FunctionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(pascalParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(pascalParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(pascalParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varParamBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarParamBlock(pascalParser.VarParamBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varParamDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarParamDecl(pascalParser.VarParamDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#varParamID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarParamID(pascalParser.VarParamIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeParamDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamDef(pascalParser.TypeParamDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#typeParamName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamName(pascalParser.TypeParamNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#fuctionUsage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuctionUsage(pascalParser.FuctionUsageContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(pascalParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#whileDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileDecla(pascalParser.WhileDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(pascalParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(pascalParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#forDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDecla(pascalParser.ForDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#forcondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForcondition(pascalParser.ForconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#repeatBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatBlock(pascalParser.RepeatBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#repeatDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatDecla(pascalParser.RepeatDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#repeatcondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatcondition(pascalParser.RepeatconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(pascalParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#ifDecla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDecla(pascalParser.IfDeclaContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#ifcondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcondition(pascalParser.IfconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#read_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_function(pascalParser.Read_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idRead}
	 * labeled alternative in {@link pascalParser#readId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdRead(pascalParser.IdReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link pascalParser#write_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_function(pascalParser.Write_functionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idWrite}
	 * labeled alternative in {@link pascalParser#writeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdWrite(pascalParser.IdWriteContext ctx);
}