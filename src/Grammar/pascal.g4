grammar pascal;
options { caseInsensitive = true;
language = Java;
   }

main:
PROGRAM ID SEMI_COLON
    (varBlock)?
    BEGIN
    (ID|NUMBER|TEXT|LETTERS)*
    END
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

//token assignation
ASSIGN: ':=';
EQUAL: '=';
EQUALS: '==';

//tokens general
NUMBER:[0-9]+; //number
TEXT: '"' ( ~["\r\n] | '""' )* '"'; //string
COLON: ':'; //colon or double point
SEMI_COLON: ';'; //semicolon or point and coma
COMA: ','; //comma
VAR: 'var'; //var declaration
LETTERS: [A-Z]; //letters identifier

ID:[a-z][a-z0-9]*([_][a-z0-9]+)*; //id identifier
WS:[ \t\n\r]+ -> skip;//skip whitespace
COMMENT: '{' .*? '}' -> skip; //comments

