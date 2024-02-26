grammar pascal;
options { caseInsensitive = true;
language = Java;
   }

main:
PROGRAM ID SEMI_COLON
    (varBlock)?
    (functionBlock)?
    BEGIN
    (whileBlock|forBlock|repeatBlock|ifBlock|assign|fuctionUsage)*
    (ID|NUMBER|TEXT)*
    END DOT EOF
    ;

//DECLARATIONS GENERALS
//ASIGNACION
assign: (ID) ASSIGN (ID|NUMBER) SEMI_COLON ;


//declarations of variables
varBlock: VAR varDecl+ ;
varDecl: varID COLON typeDef SEMI_COLON;
varID:(ID) (COMA (ID))* ;
typeDef: typeName ;
typeName: INT_TYPE
       | CHAR_TYPE
       | BOOL_TYPE
       | STR_TYPE ;


//declaration of funtions
functionBlock: functionDecl+;
functionDecl: FUNCTION (ID) params COLON returnType
            (varBlock)?
            BEGIN
            (whileBlock|forBlock|repeatBlock|ifBlock|assign|fuctionUsage)*
            (ID|NUMBER|TEXT)*
            assign
            END SEMI_COLON;
params: PARENTHESIS_LEFT ((varParamBlock)?) PARENTHESIS_RIGHT;
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
fuctionUsage: ID PARENTHESIS_LEFT ((ID|NUMBER)(COMA (ID|NUMBER))*)* PARENTHESIS_RIGHT SEMI_COLON;

//declaration of cycles
//Cycle While
whileBlock: whileDecla+;
whileDecla: C_WHILE condition C_DO
            BEGIN
            (whileBlock|forBlock|repeatBlock|ifBlock|assign|fuctionUsage)*
            END SEMI_COLON;
condition: PARENTHESIS_LEFT ( (ID) BOOLEANE (ID|NUMBER)) PARENTHESIS_RIGHT;

//Cycle for
forBlock: forDecla+;
forDecla: C_FOR forcondition C_to (NUMBER|ID) C_DO
            BEGIN
            (forBlock)*
            END SEMI_COLON;
forcondition:( (ID|) ASSIGN (NUMBER) ) ;

//Cycle repeat
repeatBlock: repeatDecla+;
repeatDecla: C_REPEAT
            BEGIN
            (whileBlock|forBlock|repeatBlock|ifBlock|assign|fuctionUsage)*
            END
            repeatcondition;
repeatcondition: C_UNTIL ( (ID) BOOLEANE (ID)) SEMI_COLON ;

//Codition IF
ifBlock: ifDecla+;
ifDecla: C_IF ifcondition C_THEN
            BEGIN
            (whileBlock|forBlock|repeatBlock|ifBlock|assign|fuctionUsage)*
            END SEMI_COLON;
ifcondition:  ( (ID) BOOLEANE (ID|NUMBER)) ;


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
CONST_STRING: 'conststring';
ARRAY_OF: 'array of';

//tokens for operations
EQUAL: '=';

//asignation token
ASSIGN: ':=';

//tokens general
NUMBER:[0-9]+; //number
TEXT: '"' ( ~["\r\n] | '""' )* '"'; //string
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
PARENTHESIS_LEFT: '(';
PARENTHESIS_RIGHT: ')';


//Cicles tokens
C_WHILE: 'while';
C_DO: 'do';
C_to: 'to';
C_FOR: 'for';
C_REPEAT: 'repeat';
C_UNTIL: 'until';

//Condition tokens
C_IF: 'if';
C_THEN:'then';

ID:[a-z][a-z0-9]*([_][a-z0-9]+)*; //id identifier
WS:[ \t\n\r]+ -> skip;//skip whitespace
COMMENT: '{' .*? '}' -> skip; //comments

