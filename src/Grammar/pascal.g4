grammar pascal;
options { caseInsensitive = true;
language = Java;
   }

main:
PROGRAM ID SEMI_COLON
    (varBlock)?
    (constBlock)?
    (functionBlock)?
    BEGIN

    (TEXT|whileBlock|forBlock|repeatBlock|ifBlock|fuctionUsage|write_function|read_function|sentence)*


    END DOT EOF
    ;

//DECLARATIONS GENERALS
//ASIGNACION
//math expressions
sentence: assign | expression;
assign: (ID|array_call| arraybi_call) ASSIGN expression SEMI_COLON ;
expression: BRACKET_LEFT expression PLUS expression BRACKET_RIGHT
            | BRACKET_LEFT expression MULT expression BRACKET_RIGHT
            | BRACKET_LEFT expression DIV expression BRACKET_RIGHT
            | BRACKET_LEFT expression MINUS expression BRACKET_RIGHT
            | BRACKET_LEFT expression MOD expression BRACKET_RIGHT
            | NUMBER
            | ID
            | array_call
            | arraybi_call
            | expression PLUS expression
            | expression MULT expression
            | expression DIV expression
            | expression MINUS expression
            | expression MOD expression ;

//declarations of variables
varBlock: VAR varDecl+ ;
varDecl: varID COLON typeDef SEMI_COLON;
varID:(ID) (COMA (ID))* ;
typeDef: typeName ;
typeName: INT_TYPE
       | CHAR_TYPE
       | BOOL_TYPE
       | STR_TYPE
       | arrDecl;
arrDecl: arr1D | arr2D;
arr1D:ARRAY SQBRACKET_LEFT NUMBER DOBLEDOTS NUMBER SQBRACKET_RIGHT OF typearray;
arr2D:ARRAY SQBRACKET_LEFT NUMBER DOBLEDOTS NUMBER COMA NUMBER DOBLEDOTS NUMBER SQBRACKET_RIGHT OF typearray;
typearray:INT_TYPE
          | CHAR_TYPE
          | BOOL_TYPE
          | STR_TYPE;


//declariotions of constants
constBlock: CONST constDecl+;
constDecl: constCharDecl | constStrDecl;
constCharDecl: CONST_CHAR COLON ID EQUAL TEXT SEMI_COLON;
constStrDecl: CONST_STRING COLON ID EQUAL TEXT SEMI_COLON;

//declaration of funtions
functionBlock: functionDecl+;
functionDecl: FUNCTION (ID) params COLON returnType
            (varBlock)?
            BEGIN
            (whileBlock|forBlock|repeatBlock|ifBlock|assign|fuctionUsage|write_function|read_function)*
            (ID|NUMBER|TEXT)*
            assign
            END SEMI_COLON;
params: BRACKET_LEFT ((varParamBlock)?) BRACKET_RIGHT;
returnType: INT_TYPE | CHAR_TYPE | BOOL_TYPE | STR_TYPE;

//declaration of params for funtions
varParamBlock: VAR varParamDecl+ ;
varParamDecl: varParamID COLON typeParamDef;
varParamID:(ID) (COMA (ID))* ;
typeParamDef: typeParamName ;
typeParamName: INT_TYPE
       | CHAR_TYPE
       | BOOL_TYPE
       | STR_TYPE ;

//function usage declaration
fuctionUsage: ID BRACKET_LEFT ((ID|NUMBER)(COMA (ID|NUMBER))*)* BRACKET_RIGHT SEMI_COLON;

//declaration of cycles
//Cycle While
whileBlock: whileDecla+;
whileDecla: C_WHILE condition C_DO
            BEGIN
            (whileBlock|forBlock|repeatBlock|ifBlock|fuctionUsage|write_function|read_function|sentence)*
            END SEMI_COLON;
condition: BRACKET_LEFT ( (ID|sentence) BOOLEANE (ID|NUMBER|sentence)) BRACKET_RIGHT;

//Cycle for
forBlock: forDecla+;
forDecla: C_FOR forcondition C_to (NUMBER|ID) C_DO
            BEGIN
             (whileBlock|forBlock|repeatBlock|ifBlock|fuctionUsage|write_function|read_function|sentence)*
            END SEMI_COLON;
forcondition:( (ID) ASSIGN (NUMBER|ID) ) ;

//Cycle repeat
repeatBlock: repeatDecla+;
repeatDecla: C_REPEAT
            BEGIN
            (whileBlock|forBlock|repeatBlock|ifBlock|fuctionUsage|write_function|read_function|sentence)*
            END
            repeatcondition;
repeatcondition: C_UNTIL ( (ID) BOOLEANE (ID)) SEMI_COLON ;

//Codition IF
ifBlock: ifDecla+;
ifDecla: C_IF ifcondition C_THEN
            BEGIN
            (whileBlock|forBlock|repeatBlock|ifBlock|fuctionUsage|write_function|read_function|sentence)*
            END SEMI_COLON;
ifcondition:  ( (ID) BOOLEANE (ID|NUMBER|TEXT)) ;


array_call: ID SQBRACKET_LEFT (NUMBER|ID) SQBRACKET_RIGHT;
arraybi_call: ID SQBRACKET_LEFT (NUMBER|ID) SQBRACKET_RIGHT SQBRACKET_LEFT (NUMBER|ID) SQBRACKET_RIGHT;

read_function: READ BRACKET_LEFT readId BRACKET_RIGHT SEMI_COLON;
readId: ID#idRead
        |array_call#arrayRead
        |arraybi_call#arraybiRead;


write_function: WRITE BRACKET_LEFT writeId BRACKET_RIGHT SEMI_COLON;
writeId:ID#idWrite
        |TEXT COMA (ID|array_call|arraybi_call) #idWrite
        |array_call#arrayWrite
        |arraybi_call#arraybiWrite
        |TEXT #idText;

READ: 'read';
WRITE: 'write' | 'writeln';
BRACKET_LEFT: '(';
BRACKET_RIGHT: ')';
SQBRACKET_LEFT: '[';
SQBRACKET_RIGHT: ']';

//token main
PROGRAM: 'program';
BEGIN: 'begin';
END: 'end';

//types of variables tokens
INT_TYPE: 'integer';
STR_TYPE: 'string';
BOOL_TYPE: 'boolean';
CHAR_TYPE: 'char';
VAR: 'var';
ARRAY: 'array';
OF: 'of';
CONST: 'const';
CONST_CHAR: 'constchar';
CONST_STRING: 'conststr';
ARRAY_OF: 'array of';

//tokens for operations
EQUAL: '=';

//asignation token
ASSIGN: ':=';

//tokens general
NUMBER:[0-9]+; //number
TEXT: '\'' ( ~["\r\n] | '\'\'' )* '\''; //string
COLON: ':';
SEMI_COLON: ';';
COMA: ',';
DOBLEDOTS: '..';
QUATATION_MARK: '\'';
DOUBLE_QUOTATION_MARK:'"'; //double quotation mark
DOT: '.';
TRUE:'true';
FALSE:'false';

//boolean expression tokens
BOOLEANE:'>'|'<'|'<>'|'>='|'=='|'<='|'AND'|'OR'|'NOT';

//Funtions tokens
FUNCTION: 'function';



//Cicles tokens
C_WHILE: 'while';
C_DO: 'do';
C_to: 'to' | 'Downto';
C_FOR: 'for';
C_REPEAT: 'repeat';
C_UNTIL: 'until';

//Condition tokens
C_IF: 'if';
C_THEN:'then';

ID:[a-z][a-z0-9]*([_][a-z0-9]+)*  ; //ididentifier
WS:[ \t\n\r]+ -> skip;//skip whitespace
COMMENT: '{' .*? '}' -> skip; //comments

//math operatrors
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
