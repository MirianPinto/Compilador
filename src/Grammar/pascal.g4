grammar pascal;
options { caseInsensitive = true;
language = Java;
   }

main:
PROGRAM ID SEMI_COLON
    (varBlock)?
    BEGIN
    (ID|NUMBER|TEXT|LETTERS)*
    END DOT EOF
    ;

//declarations of variables
varBlock: VAR varDecl+ ;
varDecl: varID COLON typeDef SEMI_COLON;
varID:(ID|LETTERS) (COMA (ID|LETTERS))* ;
typeDef: typeName ;
typeName: INT_TYPE
       | CHAR_TYPE
       | BOOL_TYPE
       | STR_TYPE ;

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
LETTERS: [a-zA-Z];
DOBLEDOTS: '..';
QUATATION_MARK: '\'';
DOUBLE_QUOTATION_MARK:'"'; //double quotation mark
DOT: '.';
TRUE:'true';
FALSE:'false';

ID:[a-z][a-z0-9]*([_][a-z0-9]+)*; //id identifier
WS:[ \t\n\r]+ -> skip;//skip whitespace
COMMENT: '{' .*? '}' -> skip; //comments

