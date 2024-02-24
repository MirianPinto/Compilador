grammar pascal;
options { caseInsensitive = true;
language = Java;
   }

main:
PROGRAM ID SEMI_COLON
    (varBlock)?
    BEGIN
    (ID|NUMBER|TEXT|write_function| read_function)*
    END DOT EOF
    ;

//declarations of variables
varBlock: VAR varDecl+ ;
varDecl: varID COLON typeDef SEMI_COLON;
varID:(ID) (COMA (ID))* ;
typeDef: typeName ;
typeName: INT_TYPE
       | CHAR_TYPE
       | BOOL_TYPE
       | STR_TYPE ;


read_function: READ BRACKET_LEFT readId BRACKET_RIGHT SEMI_COLON;
readId: ID#idRead;


write_function: WRITE BRACKET_LEFT writeId BRACKET_RIGHT SEMI_COLON;
writeId:ID#idWrite
        |TEXT COMA ID #idWrite;

READ: 'read';
WRITE: 'write';
BRACKET_LEFT: '(';
BRACKET_RIGHT: ')';

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
EQUALS: '==';

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

ID:[a-z][a-z0-9]*([_][a-z0-9]+)*; //id identifier
WS:[ \t\n\r]+ -> skip;//skip whitespace
COMMENT: '{' .*? '}' -> skip; //comments

