package Semantic;

import java.util.ArrayList;
import java.util.List;
import Pascal.pascalLexer;
import Pascal.pascalParser;
import Pascal.pascalBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SemanticAnalyzer extends pascalBaseVisitor<Void> {
    private SymbolTable symbolTable = new SymbolTable();
    private int currentScope = 0;
    private int countermsg = 0;
    private int counterexpre;
    private int counteload = 0;

    private int ftmci = 0;
    private String codigo_LLVM;
    private String exprecionVar;
    private String coddigoexpresion;
    private String codigo_LLVMmain;

    private String codigo_LLVMfunciones;
    private List<String> errors = new ArrayList<>(); // Lista para almacenar errores

    @Override
    public Void visitVarDecl(pascalParser.VarDeclContext ctx) {
        String varName = ctx.varID().getText();
        String varType = ctx.typeDef().getText();
        boolean funcion = true;
        String nameFunction = ctx.getParent().getParent().getText();
        String functionName = "";
        Symbol symbol;

        if(ctx.getParent().getParent().getText().toLowerCase().contains("program"))
        {
            funcion = false;
        }else
        {
            int start = nameFunction.indexOf("function") + 9; // Saltar la palabra "function"
            int end = nameFunction.indexOf("(", start); // Buscar el paréntesis de apertura
            functionName = nameFunction.substring(start, end).trim();
            System.out.println("nombre de funcion " + functionName);
        }


        if(varName.contains(","))
        {
            String[] varArray = varName.split(",");
            for (String varNames : varArray) {

                symbolTable.addSymbol(varNames, varType, currentScope);
                symbol = symbolTable.lookup(varNames);
                if (funcion)
                {
                    symbol.setPertfunction(functionName);
                }
                System.out.println("Declaración: " + varNames + " de tipo " + varType);
            }
        }else
        {
            symbolTable.addSymbol(varName, varType, currentScope);
            symbol = symbolTable.lookup(varName);
            if (funcion)
            {
                symbol.setPertfunction(functionName);
                System.out.println("dentro de funcion");
            }
            System.out.println("aaDeclaración: " + varName + " de tipo " + varType);
        }



        //codigo llvm

        if(varType.toLowerCase().equals("integer")) {
            //ejemplo :: %x = alloca i32                ; Reserva espacio en la pila para la variable x
            System.out.println("varibale tipo integer");

            if(varName.contains(","))
            {
                String[] varArray = varName.split(",");
                for (String varNames : varArray) {
                    if(funcion)
                    {
                        codigo_LLVMfunciones += "\n\t%"+varNames + " = alloca i32";
                    }else {
                        codigo_LLVMmain += "\n\t%" + varNames + " = alloca i32";
                    }
                }
            }else
            {
                if(funcion) {
                    codigo_LLVMfunciones += "\n\t%" + varName + " = alloca i32";
                }else {
                    codigo_LLVMmain += "\n\t%" + varName + " = alloca i32";
                }
            }

        }else if(varType.toLowerCase().equals("boolean"))
        {
            //%bool_var = alloca i1                ; Reserva espacio para una variable de tipo bool (1 bit)
            System.out.println("bool");

            if(varName.contains(","))
            {
                String[] varArray = varName.split(",");
                for (String varNames : varArray) {
                    if(funcion) {
                        codigo_LLVMfunciones += "\n\t%" + varNames + " = alloca i1";
                    }else {
                        codigo_LLVMmain += "\n\t%" + varNames + " = alloca i1";
                    }
                }
            }else
            {
                if(funcion) {
                    codigo_LLVMfunciones += "\n\t%" + varName + " = alloca i1";
                }else {
                    codigo_LLVMmain += "\n\t%" + varName + " = alloca i1";
                }
            }
        } else if(varType.toLowerCase().equals("char"))
        {
            //%char_var = alloca i8                 ; Reserva espacio para una variable de tipo char (1 byte)
            System.out.println("char");
            if(varName.contains(","))
            {
                String[] varArray = varName.split(",");
                for (String varNames : varArray) {
                    if(funcion) {
                        codigo_LLVMfunciones += "\n\t%" + varNames + " = alloca i8";
                    }else {
                        codigo_LLVMmain += "\n\t%" + varNames + " = alloca i8";
                    }
                }
            }else
            {
                if(funcion) {
                    codigo_LLVMfunciones += "\n\t%" + varName + " = alloca i8";
                }else {
                    codigo_LLVMmain += "\n\t%" + varName + " = alloca i8";
                }
            }
        } else if(varType.toLowerCase().equals("string"))
        {
            System.out.println("string");
        } else
        {

            System.out.println("arreglo");

            if(varType.toLowerCase().contains(","))
            {
                 //bidi
                //conseguir los cuatro numeros
                //@arr_bidi = global [10 x [5 x i32]] zeroinitializer  ; Arreglo bidimensional de 10x5 enteros
                String range2= ctx.typeDef().typeName().arrDecl().arr2D().range(1).getText();
                String range4= ctx.typeDef().typeName().arrDecl().arr2D().range(3).getText();
                String Type=ctx.typeDef().typeName().arrDecl().arr2D().typearray().getText();
                String ChangType = Type;
                if(Type.toLowerCase().equals("integer"))
                {
                    Type = "i32";
                } else if (Type.toLowerCase().equals("char")) {
                    Type = "i8";
                }else {
                    Type = "i1";
                }

                if(varName.contains(","))
                {
                    String[] varArray = varName.split(",");
                    for (String varNames : varArray) {
                        Symbol sybol = symbolTable.lookup(varNames);
                        sybol.setType(ChangType);
                        System.out.println("Declaración: " + varNames + " de tipo " + sybol.getType());
                        codigo_LLVM += "\n@"+varNames + " = global ["+range2+" x ["+range4+" x "+Type+"]] zeroinitializer";
                    }
                }else
                {
                    Symbol sybol = symbolTable.lookup(varName);
                    sybol.setType(ChangType);
                    System.out.println("Declaración: " + varName + " de tipo " + sybol.getType());
                    codigo_LLVM += "\n@"+varName + " = global ["+range2+" x ["+range4+" x "+Type+"]] zeroinitializer";
                }

            }else
            {
                //normal
                //@arr = global [50 x i32] zeroinitializer   ; Arreglo unidimensional de 50 enteros
                String range1 = ctx.typeDef().typeName().arrDecl().arr1D().range(0).getText();
                String range2= ctx.typeDef().typeName().arrDecl().arr1D().range(1).getText();
                String Type=ctx.typeDef().typeName().arrDecl().arr1D().typearray().getText();
                String ChangType= Type;
                if(Type.toLowerCase().equals("integer"))
                {
                    Type = "i32";
                } else if (Type.toLowerCase().equals("char")) {
                    Type = "i8";
                }else {
                    Type = "i1";
                }
                if(varName.contains(","))
                {
                    String[] varArray = varName.split(",");
                    for (String varNames : varArray) {
                        Symbol sybol = symbolTable.lookup(varNames);
                        sybol.setType(ChangType);
                        System.out.println("Declaración: " + varNames + " de tipo " + sybol.getType());

                        codigo_LLVM += "\n@"+varNames + " = global ["+range2+" x "+Type+"] zeroinitializer";
                    }
                }else
                {
                    Symbol sybol = symbolTable.lookup(varName);
                    sybol.setType(ChangType);
                    System.out.println("Declaración: " + varName + " de tipo " + sybol.getType());
                    codigo_LLVM += "\n@"+varName + " = global ["+range2+" x "+Type+"] zeroinitializer";
                }

            }
        }


        return null;
    }

    @Override
    public Void visitConstDecl(pascalParser.ConstDeclContext ctx)
    {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }

    public Void visitConstCharDecl(pascalParser.ConstCharDeclContext ctx)
    {
        //CONST_CHAR COLON ID EQUAL TEXT SEMI_COLON
        //@constchar = constant i8 97                ; Constante de carácter (ASCII de 'a')
        char c = ctx.TEXTCHAR().getText().charAt(0);  // Extraer el primer (y único) carácter de la cadena
        int asciiValue = (int) c;  // Obtener el valor ASCII del carácter
        codigo_LLVM += "\n@"+ctx.ID().getText()+" = constant i8 " +asciiValue;
        return null;
    }

    public Void visitConstStrDecl(pascalParser.ConstStrDeclContext ctx)
    {
        //CONST_STRING COLON ID EQUAL TEXT SEMI_COLON;
        ////@conststr = constant [5 x i8] c"HOLA\00"   ; Constante de cadena con terminador nulo
        String texto = ctx.TEXT().getText();
        texto = texto.replace("'", "");
        int size = texto.length() + 1;
        codigo_LLVM += "\n@"+ctx.ID().getText()+" = constant ["+size+" x i8] c\""+texto+"\\00\"";
        return null;
    }

    public Void visitFunctionBlock(pascalParser.FunctionBlockContext ctx){
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }
    @Override
    public Void visitFunctionDecl(pascalParser.FunctionDeclContext ctx)
    {
        String varName = String.valueOf(ctx.ID());
        String varType = ctx.returnType().getText();
        for (TerminalNode idNode : ctx.ID()) {
            varName = idNode.getText(); // Esto debería darte el texto del token
        }
        Symbol symbol = symbolTable.lookup(varName);
        if(symbol != null)
        {
            if(symbol.getFunction())
            {
                errors.add("Error: Funcion existente con nombre "+ varName + " en la linea" + ctx.start.getLine());
            }else
            {
                errors.add("Error: Variable existente con nombre "+ varName + " en la linea" + ctx.start.getLine());
            }

            return null;
        }
        symbolTable.addSymbol(varName, varType, currentScope);
        symbol = symbolTable.lookup(varName);
        symbol.setFunction(true);

        System.out.println("Declaraciónss: " + varName + " de tipo " + varType);
        if(varType.toLowerCase().equals("integer"))
        {
            //integer
            varType = "i32";
        }else if (varType.toLowerCase().equals("boolean"))
        {
            //boolean
            varType = "i1";

        }else if(varType.toLowerCase().equals("char"))
        {
            //char
            varType = "i8";
        }else
        {
            //string
        }

        if(ctx.getChild(2).getText().contains("var"))
        {
            codigo_LLVMfunciones += "\ndefine "+varType+" @"+varName+"(";
            currentScope++;
            visitChildren(ctx);
            symbolTable.removeSymbolsInScope(currentScope);
            currentScope--;
        }else
        {
            codigo_LLVMfunciones += "\ndefine "+varType+" @"+varName+"() {\n" +
                    "entry:\n";
            currentScope++;
            visitChildren(ctx);
            symbolTable.removeSymbolsInScope(currentScope);
            currentScope--;
        }

        codigo_LLVMfunciones += "\n}";

        return null;
    }

    public Void visitVarParamBlock(pascalParser.VarParamBlockContext ctx)
    {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        codigo_LLVMfunciones += ") {\n" +
                "entry:\n";
        return null;
    }
    public Void visitVarParamDecl(pascalParser.VarParamDeclContext ctx)
    {
        //define i32 @f(i32 %x) {
        String varname = ctx.varParamID().getText();
        String vartype = ctx.typeParamDef().getText();
        if(vartype.toLowerCase().equals("integer"))
        {
            vartype = "i32";
        } else if (vartype.toLowerCase().equals("boolean")) {
            vartype = "i1";

        }else if(vartype.toLowerCase().equals("char"))
        {
            vartype = "i8";
        }else
        {

        }

        if(varname.contains(","))
        {
            String[] varArray = varname.split(",");
            for (String varNames : varArray) {
                codigo_LLVMfunciones += vartype+ " %"+ varNames +", ";
            }
            codigo_LLVMfunciones = codigo_LLVMfunciones.substring(0, codigo_LLVMfunciones.length() - 2);
        }else
        {
            codigo_LLVMfunciones += vartype+ " %"+ varname;
        }
        return null;
    }

    @Override
    public Void visitStatements(pascalParser.StatementsContext ctx)
    {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }
    @Override
    public Void visitTypesstatemes(pascalParser.TypesstatemesContext ctx)
    {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }

    @Override
    public Void visitSentence(pascalParser.SentenceContext ctx) {
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        return null;
    }
    @Override
    public Void visitAssign(pascalParser.AssignContext ctx) {
        //semantica
        //revisar el tipo de ctx.expression() y asi revisar que tipo es
        String varName = ctx.assingId().getText();
        Symbol symbol = symbolTable.lookup(varName);
        String typevar = symbol.getType();
        String typevaras = "";
        if (symbol == null) {
            errors.add("Error: Variable '" + varName + "' no declarada en la línea " + ctx.start.getLine());
            return null;
        }
        symbolTable.setValue(varName, ctx.expression().getText());

        System.out.println("aaaaaaaaaaaa"+counterexpre);
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        System.out.println("aaaaaaaaaaaa"+counterexpre);


        if(ctx.expression() instanceof pascalParser.ValuesExpressionContext)
        {
            exprecionVar = ctx.expression().getText();
            Symbol symbol2 = symbolTable.lookup(exprecionVar);

            if(symbol2 != null)
            {
                typevaras = symbol2.getType();
                if (typevaras.toLowerCase() != typevar.toLowerCase() )
                {
                    errors.add("Error: No puedes asignarle un valor "+ typevaras + " a una variable de tipo "+ typevar);
                    return null;
                }
            }


        }



        //codigo llvm
        if (symbol.getType().toLowerCase().equals("integer")) {
            // store i32 1, i32* %x           ; Asigna el valor 1 a la variable x
            if(exprecionVar.toLowerCase().equals("true") || exprecionVar.toLowerCase().equals("false"))
            {
                errors.add("Error: No puedes asignarle un valor booleano a una variable de tipo "+ typevar);
                return null;
            }else if(exprecionVar.toLowerCase().contains("'"))
            {
                errors.add("Error: No puedes asignarle un valor string a una variable de tipo "+ typevar);
                return null;
            }
            System.out.println("asignacion integer");
            if (symbol.getFunction()) {
                codigo_LLVMfunciones += coddigoexpresion;
                codigo_LLVMfunciones += "\n\tret i32 " + exprecionVar;
            }else if(symbol.getPertfunction() != null){
                codigo_LLVMfunciones += coddigoexpresion;
                codigo_LLVMfunciones += "\n\tstore i32 " + exprecionVar + ", i32* %" + varName;
            }else {
                codigo_LLVMmain += coddigoexpresion;
                codigo_LLVMmain += "\n\tstore i32 " + exprecionVar + ", i32* %" + varName;
            }
        }else if(symbol.getType().toLowerCase().equals("boolean"))
        {
            if(exprecionVar.toLowerCase().contains("1") || exprecionVar.toLowerCase().contains("2")|| exprecionVar.toLowerCase().contains("3")|| exprecionVar.toLowerCase().contains("4") || exprecionVar.toLowerCase().contains("5")
                    || exprecionVar.toLowerCase().contains("6")|| exprecionVar.toLowerCase().contains("7") || exprecionVar.toLowerCase().contains("8")|| exprecionVar.toLowerCase().contains("9")|| exprecionVar.toLowerCase().contains("0"))
            {
                errors.add("Error: No puedes asignarle un valor Entero a una variable de tipo "+ typevar);
                return null;
            }else if(exprecionVar.toLowerCase().contains("'"))
            {
                errors.add("Error: No puedes asignarle un valor string a una variable de tipo "+ typevar);
                return null;
            }
            //store i1 0, i1* %bool_var   ; Asigna el valor false (0) a bool_var
            System.out.println("asignacion bool");
            int vool = 0;
            if(ctx.expression().getText().equals("true"))
            {
                vool = 1;
            }
            if (symbol.getFunction()) {
                codigo_LLVMfunciones += "\n\tret i1 " + vool;
            }else if(symbol.getPertfunction() != null){
                codigo_LLVMfunciones += "\n\tstore i1 " + vool + ", i1* %" + varName;
            }else {
                codigo_LLVMmain += "\n\tstore i1 " + vool + ", i1* %" + varName;
            }
        } else if(symbol.getType().toLowerCase().equals("char"))
        {
            //store i8 65, i8* %char_var  ; Asigna el valor 65 ('A') a char_var
            System.out.println("asignacion char");
            char c = ctx.expression().getText().charAt(0);  // Extraer el primer (y único) carácter de la cadena
            int asciiValue = (int) c;  // Obtener el valor ASCII del carácter
            if (symbol.getFunction()) {
                codigo_LLVMfunciones += "\n\tret i8 " + asciiValue;
            }else if(symbol.getPertfunction() != null){
                codigo_LLVMfunciones += "\n\tstore i8 " + asciiValue + ", i8* %" + varName;
            }else {
                codigo_LLVMmain += "\n\tstore i8 " + asciiValue + ", i8* %" + varName;
            }

        } else if(symbol.getType().toLowerCase().equals("string"))
        {
            System.out.println("asignacion string");
        } else
        {
            System.out.println("asignacion arreglo");
        }
            coddigoexpresion = "";

            return null;

        }

    @Override
    public Void visitAddExpression(pascalParser.AddExpressionContext ctx) {
        //BRACKET_LEFT expression BRACKET_RIGHT
        //%sum = add i32 1, 2
        String valor1 = "";
        String valor2 = "";
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        if(ctx.expression(0) instanceof pascalParser.ValuesExpressionContext)
        {
            System.out.println("\nadd  1 "+ctx.expression(0).getText());
            valor1 = ctx.expression(0).getText();
        }else
        {
            valor1 = exprecionVar;
        }

        if(ctx.expression(1) instanceof pascalParser.ValuesExpressionContext)
        {
            System.out.println("\nexpresion 2 " + ctx.expression(1).getText());
            System.out.println("\nadd 2 "+ctx.expression(1).getText());
            valor2 = ctx.expression(1).getText();
        }else
        {
            valor2 = exprecionVar;
        }
        System.out.println("\n conter "+ counterexpre);
        coddigoexpresion += "\n\t%sum"+ counterexpre +" = add i32 "+valor1+", "+valor2;
        exprecionVar = "%sum"+ counterexpre ;
        counterexpre = counterexpre+1;
        return null;
    }
    @Override
    public Void visitMultExpression(pascalParser.MultExpressionContext ctx) {
        //expression PLUS expression
        //%mul = mul i32 4, 3
        String valor1 = "";
        String valor2 = "";
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        if(ctx.expression(0) instanceof pascalParser.ValuesExpressionContext)
        {
            System.out.println("\n\tmul 1 "+ctx.expression(0).getText());
            valor1 = ctx.expression(0).getText();
        }else
        {
            valor1 = exprecionVar;
        }

        if(ctx.expression(1) instanceof pascalParser.ValuesExpressionContext)
        {
            System.out.println("\n\tmul 2 "+ctx.expression(1).getText());
            valor2 = ctx.expression(1).getText();
        }else
        {
            valor2 = exprecionVar;
        }
        System.out.println("\n conter "+ counterexpre);
        coddigoexpresion += "\n\t%mul"+ counterexpre  +" = mul i32 "+valor1+", "+valor2;
        exprecionVar = "%mul"+ counterexpre;
        counterexpre = counterexpre+1;
        return null;
    }
    @Override
    public Void visitDivExpression(pascalParser.DivExpressionContext ctx) {
        //expression MULT expression
        //%div = sdiv i32 10, 2
        String valor1 = "";
        String valor2 = "";
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        if(ctx.expression(0) instanceof pascalParser.ValuesExpressionContext)
        {
            System.out.println("\ndiv 1 "+ctx.expression(0).getText());
            valor1 = ctx.expression(0).getText();
        }else
        {
            valor1 = exprecionVar;
        }

        if(ctx.expression(1) instanceof pascalParser.ValuesExpressionContext)
        {
            System.out.println("\nexpresion 2 " + ctx.expression(1).getText());
            System.out.println("\ndiv 2 "+ctx.expression(1).getText());
            valor2 = ctx.expression(1).getText();
        }else
        {
            valor2 = exprecionVar;
        }
        System.out.println("\n conter "+ counterexpre);
        coddigoexpresion += "\n\t%div"+ counterexpre +" = sdiv i32 "+valor1+", "+valor2;
        exprecionVar = "%div"+ counterexpre;
        counterexpre = counterexpre+1;
        return null;
    }
    @Override
    public Void visitSubExpression(pascalParser.SubExpressionContext ctx) {
        //expression DIV expression
        //%sub = sub i32 5, 3
        String valor1 = "";
        String valor2 = "";
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        if(ctx.expression(0) instanceof pascalParser.ValuesExpressionContext)
        {
            System.out.println("\nsub 1 "+ctx.expression(0).getText());
            valor1 = ctx.expression(0).getText();
        }else
        {
            valor1 = exprecionVar;
        }

        if(ctx.expression(1) instanceof pascalParser.ValuesExpressionContext)
        {
            System.out.println("\nexpresion 2 " + ctx.expression(1).getText());
            System.out.println("\nsub 2 "+ctx.expression(1).getText());
            valor2 = ctx.expression(1).getText();
        }else
        {
            valor2 = exprecionVar;
        }
        System.out.println("\n conter "+ counterexpre);
        coddigoexpresion += "\n\t%sub"+ counterexpre +" = sub i32 "+valor1+", "+valor2;
        exprecionVar = "%sub"+ counterexpre;
        counterexpre = counterexpre+1;
        return null;
    }
    @Override
    public Void visitModExpression(pascalParser.ModExpressionContext ctx) {
        //expression MINUS expression
        //%mod = srem i32 10, 3
        String valor1 = "";
        String valor2 = "";
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        if(ctx.expression(0) instanceof pascalParser.ValuesExpressionContext)
        {
            System.out.println("\nmod 1 "+ctx.expression(0).getText());
            valor1 = ctx.expression(0).getText();
        }else
        {
            valor1 = exprecionVar;
        }

        if(ctx.expression(1) instanceof pascalParser.ValuesExpressionContext)
        {
            System.out.println("\nexpresion 2 " + ctx.expression(1).getText());
            System.out.println("\nmod 2 "+ctx.expression(1).getText());
            valor2 = ctx.expression(1).getText();
        }else
        {
            valor2 = exprecionVar;
        }
        System.out.println("\n conter "+ counterexpre);
        coddigoexpresion += "\n\t%mod"+ counterexpre +" = srem i32 "+valor1+", "+valor2;
        exprecionVar = "%mod"+ counterexpre;
        counterexpre = counterexpre+1;
        return null;
    }

    @Override
    public Void visitWrite_function(pascalParser.Write_functionContext ctx)
    {
        //WRITE BRACKET_LEFT writeId BRACKET_RIGHT SEMI_COLON;
        //primero para solo texto
        String texto;
        int size;
        if (ctx.writeId() instanceof pascalParser.IdTextContext) {
            System.out.println("Es texto");
            texto = ctx.writeId().getText();
            texto = texto.replace("'", "");
            size = texto.length() + 2;
            codigo_LLVM += "\n@mensaje"+countermsg+" = constant [" + size +" x i8] c\""+ texto +"\\0A\\00\"";
            codigo_LLVMmain += "\n\t%msg_ptr"+countermsg+" = getelementptr ["+ size +" x i8], ["+ size +" x i8]* @mensaje"+countermsg+", i32 0, i32 0\n" +
                    "    call i32 (i8*, ...) @printf(i8* %msg_ptr"+countermsg+")\n";
            countermsg++;
        }else if (ctx.writeId() instanceof pascalParser.IdWriteContext)
        {
            texto = ctx.writeId().getText();
            System.out.println("Es variable");
            Symbol symbol = symbolTable.lookup(texto);
            if (symbol == null) {
                errors.add("Error: Variable '" + texto + "' no declarada en la línea " + ctx.start.getLine());
                return null;
            }

            // %x_val = load i32, i32* %x     ; Carga el valor de x desde la memoria
            //
            //  ; Preparar el formato de printf para imprimir el valor de x
            //  %fmt = bitcast [3 x i8] to i8* ; Formato "%d\n" para imprimir un número entero
            //  call i32 (i8*, ...) @printf(i8* %fmt, i32 %x_val)

            if (symbol.getType().toLowerCase().equals("integer"))
            {
                if (ftmci == 0)
                {
                    codigo_LLVM += "\n@.fmt = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", align 1\n";
                    ftmci++;
                }

                codigo_LLVMmain += "\n\t%"+texto+"_load"+counteload+" = load i32, i32* %"+texto;
                codigo_LLVMmain += "\n\tcall i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.fmt, i32 0, i32 0), i32 %"+texto+"_load"+counteload+")";
            }


        }else if (ctx.writeId() instanceof pascalParser.ArrayWriteContext)
        {
            System.out.println("Es arreglo");
        }else
        {
            System.out.println("Es convinacion");
        }
        counteload++;
        return null;
    }

    @Override
    public Void visitRead_function(pascalParser.Read_functionContext ctx)
    {
        return null;
    }

    @Override
    public Void visitMain(pascalParser.MainContext ctx)
    {
        codigo_LLVM = "declare i32 @printf(i8*, ...)   ; Para imprimir texto\n" +
                        "declare i32 @scanf(i8*, ...)    ; Para leer texto\n";
        codigo_LLVMmain = "\n\ndefine i32 @main() {\n" +
                "entry: \n";
        codigo_LLVMfunciones = "";
        coddigoexpresion ="";
        counterexpre = 0;
        currentScope++;
        visitChildren(ctx);
        symbolTable.removeSymbolsInScope(currentScope);
        currentScope--;
        codigo_LLVMmain += "\n\tret i32 0\n}";
        return null;
    }

    public List<String> getErrors() {
        return errors;
    }
    public List<String> getErrorsSymbolTable() {
        return symbolTable.getErrors();
    }

    public String getLLVM()
    {
        String fin = codigo_LLVM += codigo_LLVMfunciones;
        fin += codigo_LLVMmain;
        return fin;
    }


    //Validaciones funciones




}
