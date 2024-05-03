/*
 * xtc - The eXTensible Compiler
 * Copyright (C) 2009-2012 New York University
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301,
 * USA.
 */
package superc.p4parser;

import superc.core.SemanticActions;
import superc.core.ForkMergeParser.Subparser;

/* from p4parser.prologue */


import xtc.Constants;
import xtc.Limits;

import superc.p4parser.P4Context.SymbolTable.STField;

import xtc.tree.Attribute;
import xtc.tree.GNode;
import xtc.tree.Location;
import xtc.tree.Node;
import xtc.tree.Visitor;

import xtc.util.Pair;

import superc.core.Syntax;
import superc.core.Syntax.Kind;
import superc.core.Syntax.LanguageTag;
import superc.core.Syntax.ConditionalTag;
import superc.core.Syntax.DirectiveTag;
import superc.core.Syntax.Layout;
import superc.core.Syntax.Language;
import superc.core.Syntax.Text;
import superc.core.Syntax.Directive;
import superc.core.Syntax.Conditional;
import superc.core.Syntax.Error;

import xtc.type.AliasT;
import xtc.type.ArrayT;
import xtc.type.BooleanT;
import xtc.type.C;
import xtc.type.CastReference;
import xtc.type.Constant;
import xtc.type.DynamicReference;
import xtc.type.EnumT;
import xtc.type.EnumeratorT;
import xtc.type.ErrorT;
import xtc.type.FieldReference;
import xtc.type.FunctionT;
import xtc.type.InternalT;
import xtc.type.LabelT;
import xtc.type.NullReference;
import xtc.type.NumberT;
import xtc.type.PointerT;
import xtc.type.Reference;
import xtc.type.StaticReference;
import xtc.type.StringReference;
import xtc.type.StructOrUnionT;
import xtc.type.StructT;
import xtc.type.Tagged;
import xtc.type.Type;
import xtc.type.Type.Tag;
import xtc.type.UnionT;
import xtc.type.VariableT;
import xtc.type.VoidT;

import xtc.util.SymbolTable;
import xtc.util.SymbolTable.Scope;
import xtc.util.SingletonIterator;
import xtc.util.Utilities;

import superc.core.PresenceConditionManager;
import superc.core.PresenceConditionManager.PresenceCondition;

import superc.core.Clauses;

import superc.core.ForkMergeParser;
import superc.core.ForkMergeParser.StackFrame;

import java.util.ArrayList;
import java.util.List;

import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;
import org.sat4j.tools.ModelIterator;



/**
 * This class is generated from grammar annotations and provides semantic
 * action support.
 */
public class P4Actions implements SemanticActions {

  /** The instance of this class */
  private static P4Actions ref;

  /** Get the instance of this class */
  public static P4Actions getInstance() {
    if (null == ref) {
      ref = new P4Actions();
    }
    return ref;
  }

  public Object action(int production, Subparser subparser, Object value) {
    switch (production) {
  case 3: /* program: input  */
            {}
    break;

  case 5: /* input: input declaration  */
                         {}
    break;

  case 6: /* input: input SEMICOLON  */
                               {}
    break;

  case 7: /* declaration: constantDeclaration  */
                              {}
    break;

  case 8: /* declaration: externDeclaration  */
                              {}
    break;

  case 9: /* declaration: actionDeclaration  */
                              {}
    break;

  case 10: /* declaration: parserDeclaration  */
                              {}
    break;

  case 11: /* declaration: typeDeclaration  */
                              {}
    break;

  case 12: /* declaration: controlDeclaration  */
                              {}
    break;

  case 13: /* declaration: instantiation  */
                              {}
    break;

  case 14: /* declaration: errorDeclaration  */
                              {}
    break;

  case 15: /* declaration: matchKindDeclaration  */
                              {}
    break;

  case 16: /* declaration: functionDeclaration  */
                              {}
    break;

  case 17: /* nonTypeName: IDENTIFIER  */
                {}
    break;

  case 18: /* nonTypeName: APPLY  */
                  {}
    break;

  case 19: /* nonTypeName: KEY  */
                  {}
    break;

  case 20: /* nonTypeName: ACTIONS  */
                  {}
    break;

  case 21: /* nonTypeName: STATE  */
                  {}
    break;

  case 22: /* nonTypeName: ENTRIES  */
                  {}
    break;

  case 23: /* nonTypeName: TYPE  */
                  {}
    break;

  case 24: /* name: nonTypeName  */
                {}
    break;

  case 25: /* name: TYPE_IDENTIFIER  */
                       {}
    break;

  case 26: /* nonTableKwName: IDENTIFIER  */
                     {}
    break;

  case 27: /* nonTableKwName: TYPE_IDENTIFIER  */
                       {}
    break;

  case 28: /* nonTableKwName: APPLY  */
                       {}
    break;

  case 29: /* nonTableKwName: STATE  */
                       {}
    break;

  case 30: /* nonTableKwName: TYPE  */
                       {}
    break;

  case 31: /* optCONST: %empty  */
                {}
    break;

  case 32: /* optCONST: CONST  */
                  {}
    break;

  case 33: /* optAnnotations: %empty  */
                  {}
    break;

  case 34: /* optAnnotations: annotations  */
                  {}
    break;

  case 35: /* annotations: annotation  */
                  {}
    break;

  case 36: /* annotations: annotations annotation  */
                             {}
    break;

  case 37: /* annotation: AT name  */
        {}
    break;

  case 38: /* annotation: AT name L_PAREN annotationBody R_PAREN  */
        {}
    break;

  case 39: /* annotation: AT name L_BRACKET expressionList R_BRACKET  */
        {}
    break;

  case 40: /* annotation: AT name L_BRACKET kvList R_BRACKET  */
        {}
    break;

  case 41: /* annotation: PRAGMA name annotationBody END_PRAGMA  */
        {}
    break;

  case 42: /* annotationBody: %empty  */
              {}
    break;

  case 43: /* annotationBody: annotationBody L_PAREN annotationBody R_PAREN  */
        {}
    break;

  case 44: /* annotationBody: annotationBody annotationToken  */
        {}
    break;

  case 45: /* annotationToken: UNEXPECTED_TOKEN  */
                       {}
    break;

  case 46: /* annotationToken: ABSTRACT  */
                       {}
    break;

  case 47: /* annotationToken: ACTION  */
                       {}
    break;

  case 48: /* annotationToken: ACTIONS  */
                       {}
    break;

  case 49: /* annotationToken: APPLY  */
                       {}
    break;

  case 50: /* annotationToken: BOOL  */
                       {}
    break;

  case 51: /* annotationToken: BIT  */
                       {}
    break;

  case 52: /* annotationToken: CONST  */
                       {}
    break;

  case 53: /* annotationToken: CONTROL  */
                       {}
    break;

  case 54: /* annotationToken: DEFAULT  */
                       {}
    break;

  case 55: /* annotationToken: ELSE  */
                       {}
    break;

  case 56: /* annotationToken: ENTRIES  */
                       {}
    break;

  case 57: /* annotationToken: ENUM  */
                       {}
    break;

  case 58: /* annotationToken: ERROR  */
                       {}
    break;

  case 59: /* annotationToken: EXIT  */
                       {}
    break;

  case 60: /* annotationToken: EXTERN  */
                       {}
    break;

  case 61: /* annotationToken: FALSE  */
                       {}
    break;

  case 62: /* annotationToken: HEADER  */
                       {}
    break;

  case 63: /* annotationToken: HEADER_UNION  */
                       {}
    break;

  case 64: /* annotationToken: IF  */
                       {}
    break;

  case 65: /* annotationToken: IN  */
                       {}
    break;

  case 66: /* annotationToken: INOUT  */
                       {}
    break;

  case 67: /* annotationToken: INT  */
                       {}
    break;

  case 68: /* annotationToken: KEY  */
                       {}
    break;

  case 69: /* annotationToken: MATCH_KIND  */
                       {}
    break;

  case 70: /* annotationToken: TYPE  */
                       {}
    break;

  case 71: /* annotationToken: OUT  */
                       {}
    break;

  case 72: /* annotationToken: PARSER  */
                       {}
    break;

  case 73: /* annotationToken: PACKAGE  */
                       {}
    break;

  case 74: /* annotationToken: PRAGMA  */
                       {}
    break;

  case 75: /* annotationToken: RETURN  */
                       {}
    break;

  case 76: /* annotationToken: SELECT  */
                       {}
    break;

  case 77: /* annotationToken: STATE  */
                       {}
    break;

  case 78: /* annotationToken: STRING  */
                       {}
    break;

  case 79: /* annotationToken: STRUCT  */
                       {}
    break;

  case 80: /* annotationToken: SWITCH  */
                       {}
    break;

  case 81: /* annotationToken: TABLE  */
                       {}
    break;

  case 82: /* annotationToken: THIS  */
                       {}
    break;

  case 83: /* annotationToken: TRANSITION  */
                       {}
    break;

  case 84: /* annotationToken: TRUE  */
                       {}
    break;

  case 85: /* annotationToken: TUPLE  */
                       {}
    break;

  case 86: /* annotationToken: TYPEDEF  */
                       {}
    break;

  case 87: /* annotationToken: VARBIT  */
                       {}
    break;

  case 88: /* annotationToken: VALUESET  */
                       {}
    break;

  case 89: /* annotationToken: VOID  */
                       {}
    break;

  case 90: /* annotationToken: DONTCARE  */
                            {}
    break;

  case 91: /* annotationToken: IDENTIFIER  */
                       {}
    break;

  case 92: /* annotationToken: TYPE_IDENTIFIER  */
                       {}
    break;

  case 93: /* annotationToken: STRING_LITERAL  */
                       {}
    break;

  case 94: /* annotationToken: INTEGER  */
                       {}
    break;

  case 95: /* annotationToken: L_ANGLE_ARGS  */
                       {}
    break;

  case 96: /* annotationToken: R_ANGLE_SHIFT  */
                       {}
    break;

  case 97: /* annotationToken: RANGE  */
                       {}
    break;

  case 98: /* annotationToken: MASK  */
                       {}
    break;

  case 99: /* annotationToken: AND  */
                       {}
    break;

  case 100: /* annotationToken: OR  */
                       {}
    break;

  case 101: /* annotationToken: EQ  */
                       {}
    break;

  case 102: /* annotationToken: NE  */
                       {}
    break;

  case 103: /* annotationToken: GE  */
                       {}
    break;

  case 104: /* annotationToken: LE  */
                       {}
    break;

  case 105: /* annotationToken: PP  */
                       {}
    break;

  case 106: /* annotationToken: PLUS  */
                       {}
    break;

  case 108: /* annotationToken: MINUS  */
                       {}
    break;

  case 109: /* annotationToken: MINUS_SAT  */
                       {}
    break;

  case 110: /* annotationToken: MUL  */
                       {}
    break;

  case 111: /* annotationToken: DIV  */
                       {}
    break;

  case 112: /* annotationToken: MOD  */
                       {}
    break;

  case 113: /* annotationToken: BIT_OR  */
                       {}
    break;

  case 114: /* annotationToken: BIT_AND  */
                       {}
    break;

  case 115: /* annotationToken: BIT_XOR  */
                       {}
    break;

  case 116: /* annotationToken: COMPLEMENT  */
                       {}
    break;

  case 117: /* annotationToken: L_BRACKET  */
                       {}
    break;

  case 118: /* annotationToken: R_BRACKET  */
                       {}
    break;

  case 119: /* annotationToken: L_BRACE  */
                       {}
    break;

  case 120: /* annotationToken: R_BRACE  */
                       {}
    break;

  case 121: /* annotationToken: L_ANGLE  */
                       {}
    break;

  case 122: /* annotationToken: R_ANGLE  */
                       {}
    break;

  case 123: /* annotationToken: NOT  */
                       {}
    break;

  case 124: /* annotationToken: COLON  */
                       {}
    break;

  case 125: /* annotationToken: QUESTION  */
                       {}
    break;

  case 126: /* annotationToken: DOT  */
                       {}
    break;

  case 127: /* annotationToken: ASSIGN  */
                       {}
    break;

  case 128: /* annotationToken: SEMICOLON  */
                       {}
    break;

  case 129: /* annotationToken: AT  */
                       {}
    break;

  case 130: /* annotationToken: COMMA  */
                       {}
    break;

  case 131: /* kvList: kvPair  */
                                      {}
    break;

  case 132: /* kvList: kvList COMMA kvPair  */
                                        {}
    break;

  case 133: /* kvPair: name ASSIGN expression  */
                                         {}
    break;

  case 134: /* parameterList: %empty  */
                                      {}
    break;

  case 135: /* parameterList: nonEmptyParameterList  */
                                      {}
    break;

  case 136: /* nonEmptyParameterList: parameter  */
                                          {}
    break;

  case 137: /* nonEmptyParameterList: nonEmptyParameterList COMMA parameter  */
                                            {}
    break;

  case 138: /* parameter: optAnnotations direction typeRef name  */
                                            {}
    break;

  case 139: /* parameter: optAnnotations direction typeRef name ASSIGN expression  */
                                                              {}
    break;

  case 140: /* direction: IN  */
                 {}
    break;

  case 141: /* direction: OUT  */
                   {}
    break;

  case 142: /* direction: INOUT  */
                   {}
    break;

  case 143: /* direction: %empty  */
                   {}
    break;

  case 144: /* $@1: %empty  */
                                  {}
    break;

  case 145: /* $@2: %empty  */
                        {}
    break;

  case 146: /* packageTypeDeclaration: optAnnotations PACKAGE name $@1 optTypeParameters $@2 L_PAREN parameterList R_PAREN  */
                                    {
        saveBaseType(subparser, getNodeAt(subparser, 8));
        bindIdent(subparser, getNodeAt(subparser, 8), getNodeAt(subparser, 7));
      }
    break;

  case 147: /* instantiation: annotations typeRef L_PAREN argumentList R_PAREN name SEMICOLON  */
                     {}
    break;

  case 148: /* instantiation: typeRef L_PAREN argumentList R_PAREN name SEMICOLON  */
                     {}
    break;

  case 149: /* instantiation: annotations typeRef L_PAREN argumentList R_PAREN name ASSIGN objInitializer SEMICOLON  */
                     {}
    break;

  case 150: /* instantiation: typeRef L_PAREN argumentList R_PAREN name ASSIGN objInitializer SEMICOLON  */
                     {}
    break;

  case 151: /* objInitializer: L_BRACE objDeclarations R_BRACE  */
                               {}
    break;

  case 152: /* objDeclarations: %empty  */
                                     {}
    break;

  case 153: /* objDeclarations: objDeclarations objDeclaration  */
                                     {}
    break;

  case 154: /* objDeclaration: functionDeclaration  */
                               {}
    break;

  case 155: /* objDeclaration: instantiation  */
                               {}
    break;

  case 156: /* optConstructorParameters: %empty  */
                           {}
    break;

  case 157: /* optConstructorParameters: L_PAREN parameterList R_PAREN  */
                                     {}
    break;

  case 158: /* dotPrefix: DOT  */
                             {}
    break;

  case 159: /* $@3: %empty  */
                                                   { EnterScope(subparser); }
    break;

  case 160: /* $@4: %empty  */
                                               { ExitScope(subparser); }
    break;

  case 161: /* parserDeclaration: parserTypeDeclaration optConstructorParameters $@3 L_BRACE parserLocalElements parserStates $@4 R_BRACE  */
                             {}
    break;

  case 162: /* parserLocalElements: %empty  */
                                           {}
    break;

  case 163: /* parserLocalElements: parserLocalElements parserLocalElement  */
                                             {}
    break;

  case 164: /* parserLocalElement: constantDeclaration  */
                                    {}
    break;

  case 165: /* parserLocalElement: instantiation  */
                                      {}
    break;

  case 166: /* parserLocalElement: variableDeclaration  */
                                      {}
    break;

  case 167: /* parserLocalElement: valueSetDeclaration  */
                                      {}
    break;

  case 168: /* $@5: %empty  */
                          {}
    break;

  case 169: /* $@6: %empty  */
                          {}
    break;

  case 170: /* parserTypeDeclaration: optAnnotations PARSER name $@5 optTypeParameters $@6 L_PAREN parameterList R_PAREN  */
                                      {
          saveBaseType(subparser, getNodeAt(subparser, 8));
          bindIdent(subparser, getNodeAt(subparser, 8), getNodeAt(subparser, 7));
        }
    break;

  case 171: /* parserStates: parserState  */
                                    {}
    break;

  case 172: /* parserStates: parserStates parserState  */
                                      {}
    break;

  case 173: /* $@7: %empty  */
                              {}
    break;

  case 174: /* parserState: optAnnotations STATE name $@7 L_BRACE parserStatements transitionStatement R_BRACE  */
                                      {}
    break;

  case 175: /* parserStatements: %empty  */
                                     {}
    break;

  case 176: /* parserStatements: parserStatements parserStatement  */
                                       {}
    break;

  case 177: /* parserStatement: assignmentOrMethodCallStatement  */
                                    {}
    break;

  case 178: /* parserStatement: directApplication  */
                                      {}
    break;

  case 179: /* parserStatement: emptyStatement  */
                                      {}
    break;

  case 180: /* parserStatement: variableDeclaration  */
                                      {}
    break;

  case 181: /* parserStatement: constantDeclaration  */
                                      {}
    break;

  case 182: /* parserStatement: parserBlockStatement  */
                                      {}
    break;

  case 183: /* parserStatement: conditionalStatement  */
                                      {}
    break;

  case 184: /* $@8: %empty  */
                           {}
    break;

  case 185: /* parserBlockStatement: optAnnotations L_BRACE $@8 parserStatements R_BRACE  */
                               {}
    break;

  case 186: /* transitionStatement: %empty  */
                                {}
    break;

  case 187: /* transitionStatement: TRANSITION stateExpression  */
                                  {}
    break;

  case 188: /* stateExpression: name SEMICOLON  */
                           {}
    break;

  case 189: /* stateExpression: selectExpression  */
                       {}
    break;

  case 190: /* selectExpression: SELECT L_PAREN expressionList R_PAREN L_BRACE selectCaseList R_BRACE  */
                              {}
    break;

  case 191: /* selectCaseList: %empty  */
                               {}
    break;

  case 192: /* selectCaseList: selectCaseList selectCase  */
                                 {}
    break;

  case 193: /* selectCase: keysetExpression COLON name SEMICOLON  */
      {}
    break;

  case 194: /* keysetExpression: tupleKeysetExpression  */
                              {}
    break;

  case 195: /* keysetExpression: simpleKeysetExpression  */
                                {}
    break;

  case 196: /* tupleKeysetExpression: L_PAREN simpleKeysetExpression COMMA simpleExpressionList R_PAREN  */
                                {}
    break;

  case 197: /* tupleKeysetExpression: L_PAREN reducedSimpleKeysetExpression R_PAREN  */
                                                    {}
    break;

  case 198: /* simpleExpressionList: simpleKeysetExpression  */
                           {}
    break;

  case 199: /* simpleExpressionList: simpleExpressionList COMMA simpleKeysetExpression  */
                                                        {}
    break;

  case 200: /* reducedSimpleKeysetExpression: expression MASK expression  */
                                 {}
    break;

  case 201: /* reducedSimpleKeysetExpression: expression RANGE expression  */
                                   {}
    break;

  case 202: /* reducedSimpleKeysetExpression: DEFAULT  */
                                  {}
    break;

  case 203: /* reducedSimpleKeysetExpression: DONTCARE  */
                                       {}
    break;

  case 204: /* simpleKeysetExpression: expression  */
                                {}
    break;

  case 205: /* simpleKeysetExpression: expression MASK expression  */
                                 {}
    break;

  case 206: /* simpleKeysetExpression: expression RANGE expression  */
                                   {}
    break;

  case 207: /* simpleKeysetExpression: DEFAULT  */
                                  {}
    break;

  case 208: /* simpleKeysetExpression: DONTCARE  */
                                       {}
    break;

  case 209: /* valueSetDeclaration: optAnnotations VALUESET l_angle baseType r_angle L_PAREN expression R_PAREN name SEMICOLON  */
        {}
    break;

  case 210: /* valueSetDeclaration: optAnnotations VALUESET l_angle tupleType r_angle L_PAREN expression R_PAREN name SEMICOLON  */
        {}
    break;

  case 211: /* valueSetDeclaration: optAnnotations VALUESET l_angle typeName r_angle L_PAREN expression R_PAREN name SEMICOLON  */
        {}
    break;

  case 212: /* controlDeclaration: controlTypeDeclaration optConstructorParameters L_BRACE controlLocalDeclarations APPLY controlBody R_BRACE  */
        {}
    break;

  case 213: /* $@9: %empty  */
                     {}
    break;

  case 214: /* $@10: %empty  */
                          {}
    break;

  case 215: /* controlTypeDeclaration: optAnnotations CONTROL name $@9 optTypeParameters $@10 L_PAREN parameterList R_PAREN  */
                                      {
          saveBaseType(subparser, getNodeAt(subparser, 8));
          bindIdent(subparser, getNodeAt(subparser, 8), getNodeAt(subparser, 7));
        }
    break;

  case 216: /* controlLocalDeclarations: %empty  */
           {}
    break;

  case 217: /* controlLocalDeclarations: controlLocalDeclarations controlLocalDeclaration  */
                                                       {}
    break;

  case 218: /* controlLocalDeclaration: constantDeclaration  */
                             {}
    break;

  case 219: /* controlLocalDeclaration: actionDeclaration  */
                               {}
    break;

  case 220: /* controlLocalDeclaration: tableDeclaration  */
                               {}
    break;

  case 221: /* controlLocalDeclaration: instantiation  */
                               {}
    break;

  case 222: /* controlLocalDeclaration: variableDeclaration  */
                               {}
    break;

  case 223: /* controlBody: blockStatement  */
                   {}
    break;

  case 224: /* $@11: %empty  */
                           {
            saveBaseType(subparser, getNodeAt(subparser, 2));
            bindIdent(subparser, getNodeAt(subparser, 2), getNodeAt(subparser, 1));
          }
    break;

  case 225: /* $@12: %empty  */
                          {}
    break;

  case 229: /* methodPrototypes: %empty  */
                                     {}
    break;

  case 230: /* methodPrototypes: methodPrototypes methodPrototype  */
                                       {}
    break;

  case 231: /* $@13: %empty  */
                               {}
    break;

  case 232: /* functionPrototype: typeOrVoid name optTypeParameters $@13 L_PAREN parameterList R_PAREN  */
                                      {}
    break;

  case 233: /* methodPrototype: optAnnotations functionPrototype SEMICOLON  */
                                               {}
    break;

  case 234: /* methodPrototype: optAnnotations ABSTRACT functionPrototype SEMICOLON  */
                                                          {}
    break;

  case 235: /* methodPrototype: optAnnotations TYPE_IDENTIFIER L_PAREN parameterList R_PAREN SEMICOLON  */
                                        {}
    break;

  case 236: /* typeRef: baseType  */
                                     {}
    break;

  case 237: /* typeRef: typeName  */
                                       {}
    break;

  case 238: /* typeRef: specializedType  */
                                       {}
    break;

  case 239: /* typeRef: headerStackType  */
                                       {}
    break;

  case 240: /* typeRef: tupleType  */
                                       {}
    break;

  case 241: /* namedType: typeName  */
                                     {}
    break;

  case 242: /* namedType: specializedType  */
                                       {}
    break;

  case 243: /* prefixedType: TYPE_IDENTIFIER  */
                                     {}
    break;

  case 244: /* prefixedType: dotPrefix TYPE_IDENTIFIER  */
                                       {}
    break;

  case 245: /* typeName: prefixedType  */
                                     {}
    break;

  case 246: /* tupleType: TUPLE l_angle typeArgumentList r_angle  */
                                              {}
    break;

  case 247: /* headerStackType: typeName L_BRACKET expression R_BRACKET  */
                                                    {}
    break;

  case 248: /* headerStackType: specializedType L_BRACKET expression R_BRACKET  */
                                                      {}
    break;

  case 249: /* specializedType: typeName l_angle typeArgumentList r_angle  */
                                              {}
    break;

  case 250: /* baseType: BOOL  */
           {}
    break;

  case 251: /* baseType: ERROR  */
             {}
    break;

  case 252: /* baseType: BIT  */
             {}
    break;

  case 253: /* baseType: STRING  */
             {}
    break;

  case 254: /* baseType: INT  */
             {}
    break;

  case 255: /* baseType: BIT l_angle INTEGER r_angle  */
      {}
    break;

  case 256: /* baseType: INT l_angle INTEGER r_angle  */
      {}
    break;

  case 257: /* baseType: VARBIT l_angle INTEGER r_angle  */
      {}
    break;

  case 258: /* baseType: BIT l_angle L_PAREN expression R_PAREN r_angle  */
      {}
    break;

  case 259: /* baseType: INT l_angle L_PAREN expression R_PAREN r_angle  */
      {}
    break;

  case 260: /* baseType: VARBIT l_angle L_PAREN expression R_PAREN r_angle  */
      {}
    break;

  case 261: /* typeOrVoid: typeRef  */
                {}
    break;

  case 262: /* typeOrVoid: VOID  */
                  {}
    break;

  case 263: /* typeOrVoid: IDENTIFIER  */
                  {}
    break;

  case 264: /* optTypeParameters: %empty  */
                              {}
    break;

  case 265: /* optTypeParameters: typeParameters  */
                                {}
    break;

  case 266: /* typeParameters: l_angle typeParameterList r_angle  */
                                      {}
    break;

  case 267: /* typeParameterList: name  */
         {
        //  ASK possible to get the production name? (typeParameterList)
        // // saveBaseType(subparser, getNodeAt(subparser, 12));
        // if(getNodeAt(subparser, 5).isToken()){
          bindIdent(subparser, null, getNodeAt(subparser, 1), true);
        // }
      }
    break;

  case 268: /* typeParameterList: typeParameterList COMMA name  */
                                   {
        bindIdent(subparser, null, getNodeAt(subparser, 1), true);
      }
    break;

  case 269: /* typeArg: typeRef  */
                                {}
    break;

  case 270: /* typeArg: nonTypeName  */
                                  {}
    break;

  case 271: /* typeArg: VOID  */
                                  {}
    break;

  case 272: /* typeArg: DONTCARE  */
                                       {}
    break;

  case 273: /* typeArgumentList: %empty  */
                                   {}
    break;

  case 274: /* typeArgumentList: typeArg  */
                                     {}
    break;

  case 275: /* typeArgumentList: typeArgumentList COMMA typeArg  */
                                       {}
    break;

  case 276: /* realTypeArg: typeRef  */
                                {}
    break;

  case 277: /* realTypeArg: VOID  */
                                  {}
    break;

  case 278: /* realTypeArg: DONTCARE  */
                                       {}
    break;

  case 279: /* realTypeArgumentList: realTypeArg  */
                                       {}
    break;

  case 280: /* realTypeArgumentList: realTypeArgumentList COMMA typeArg  */
                                           {}
    break;

  case 281: /* typeDeclaration: derivedTypeDeclaration  */
                               {}
    break;

  case 282: /* typeDeclaration: typedefDeclaration SEMICOLON  */
                                       {}
    break;

  case 283: /* typeDeclaration: parserTypeDeclaration SEMICOLON  */
                                       {}
    break;

  case 284: /* typeDeclaration: controlTypeDeclaration SEMICOLON  */
                                       {}
    break;

  case 285: /* typeDeclaration: packageTypeDeclaration SEMICOLON  */
                                       {}
    break;

  case 286: /* derivedTypeDeclaration: headerTypeDeclaration  */
                                     {}
    break;

  case 287: /* derivedTypeDeclaration: headerUnionDeclaration  */
                                       {}
    break;

  case 288: /* derivedTypeDeclaration: structTypeDeclaration  */
                                       {}
    break;

  case 289: /* derivedTypeDeclaration: enumDeclaration  */
                                       {}
    break;

  case 290: /* $@14: %empty  */
                               {}
    break;

  case 291: /* $@15: %empty  */
                                                    {}
    break;

  case 292: /* headerTypeDeclaration: optAnnotations HEADER name $@14 optTypeParameters $@15 L_BRACE structFieldList R_BRACE  */
      {
          saveBaseType(subparser, getNodeAt(subparser, 8));
          bindIdent(subparser, getNodeAt(subparser, 8), getNodeAt(subparser, 7));
      }
    break;

  case 293: /* structTypeDeclaration: optAnnotations STRUCT name optTypeParameters L_BRACE structFieldList R_BRACE  */
      {
          saveBaseType(subparser, getNodeAt(subparser, 6));
          bindIdent(subparser, getNodeAt(subparser, 6), getNodeAt(subparser, 5));
      }
    break;

  case 294: /* $@16: %empty  */
                                     {}
    break;

  case 295: /* $@17: %empty  */
                                                          {}
    break;

  case 296: /* headerUnionDeclaration: optAnnotations HEADER_UNION name $@16 optTypeParameters $@17 L_BRACE structFieldList R_BRACE  */
                                      {
        saveBaseType(subparser, getNodeAt(subparser, 8));
        bindIdent(subparser, getNodeAt(subparser, 8), getNodeAt(subparser, 7));
      }
    break;

  case 297: /* structFieldList: %empty  */
                                     {}
    break;

  case 298: /* structFieldList: structFieldList structField  */
                                       {}
    break;

  case 299: /* structField: optAnnotations typeRef name SEMICOLON  */
                                           {}
    break;

  case 300: /* $@18: %empty  */
                  {}
    break;

  case 301: /* enumDeclaration: optAnnotations ENUM name $@18 L_BRACE identifierList R_BRACE  */
                                       {
          saveBaseType(subparser, getNodeAt(subparser, 6));
          bindIdent(subparser, getNodeAt(subparser, 6), getNodeAt(subparser, 5));
        }
    break;

  case 302: /* $@19: %empty  */
                                       {}
    break;

  case 303: /* enumDeclaration: optAnnotations ENUM typeRef name $@19 L_BRACE specifiedIdentifierList R_BRACE  */
                                                      {
          saveBaseType(subparser, getNodeAt(subparser, 7));
          bindIdent(subparser, getNodeAt(subparser, 7), getNodeAt(subparser, 5));
        }
    break;

  case 304: /* specifiedIdentifierList: specifiedIdentifier  */
                            {}
    break;

  case 305: /* specifiedIdentifierList: specifiedIdentifierList COMMA specifiedIdentifier  */
                                                        {}
    break;

  case 306: /* specifiedIdentifier: name ASSIGN initializer  */
                               {}
    break;

  case 307: /* errorDeclaration: ERROR L_BRACE identifierList R_BRACE  */
        {}
    break;

  case 308: /* matchKindDeclaration: MATCH_KIND L_BRACE identifierList R_BRACE  */
        {}
    break;

  case 309: /* identifierList: name  */
                            {}
    break;

  case 310: /* identifierList: identifierList COMMA name  */
                                {}
    break;

  case 311: /* typedefDeclaration: optAnnotations TYPEDEF typeRef name  */
                                        {
          saveBaseType(subparser, getNodeAt(subparser, 3));
          bindIdent(subparser, getNodeAt(subparser, 3), getNodeAt(subparser, 1));
        }
    break;

  case 312: /* typedefDeclaration: optAnnotations TYPEDEF derivedTypeDeclaration name  */
                                                         {
          saveBaseType(subparser, getNodeAt(subparser, 3));
          bindIdent(subparser, getNodeAt(subparser, 3), getNodeAt(subparser, 1));
        }
    break;

  case 313: /* typedefDeclaration: optAnnotations TYPE typeRef name  */
                                       {
          saveBaseType(subparser, getNodeAt(subparser, 3));
          bindIdent(subparser, getNodeAt(subparser, 3), getNodeAt(subparser, 1));
        }
    break;

  case 314: /* typedefDeclaration: optAnnotations TYPE derivedTypeDeclaration name  */
                                                      {
          saveBaseType(subparser, getNodeAt(subparser, 3));
          bindIdent(subparser, getNodeAt(subparser, 3), getNodeAt(subparser, 1));
        }
    break;

  case 315: /* assignmentOrMethodCallStatement: lvalue L_PAREN argumentList R_PAREN SEMICOLON  */
        {}
    break;

  case 316: /* assignmentOrMethodCallStatement: lvalue l_angle typeArgumentList r_angle L_PAREN argumentList R_PAREN SEMICOLON  */
        {}
    break;

  case 317: /* assignmentOrMethodCallStatement: lvalue ASSIGN expression SEMICOLON  */
        {}
    break;

  case 318: /* emptyStatement: SEMICOLON  */
                   {}
    break;

  case 319: /* exitStatement: EXIT SEMICOLON  */
                   {}
    break;

  case 320: /* returnStatement: RETURN SEMICOLON  */
                                {}
    break;

  case 321: /* returnStatement: RETURN expression SEMICOLON  */
                                  {}
    break;

  case 322: /* conditionalStatement: IF L_PAREN expression R_PAREN statement  */
        {}
    break;

  case 323: /* conditionalStatement: IF L_PAREN expression R_PAREN statement ELSE statement  */
        {}
    break;

  case 324: /* directApplication: typeName DOT APPLY L_PAREN argumentList R_PAREN SEMICOLON  */
                                                              {}
    break;

  case 325: /* statement: assignmentOrMethodCallStatement  */
                                     {}
    break;

  case 326: /* statement: directApplication  */
                                       {}
    break;

  case 327: /* statement: conditionalStatement  */
                                       {}
    break;

  case 328: /* statement: emptyStatement  */
                                       {}
    break;

  case 329: /* statement: blockStatement  */
                                       {}
    break;

  case 330: /* statement: returnStatement  */
                                       {}
    break;

  case 331: /* statement: exitStatement  */
                                       {}
    break;

  case 332: /* statement: switchStatement  */
                                       {}
    break;

  case 333: /* $@20: %empty  */
                           {}
    break;

  case 334: /* blockStatement: optAnnotations L_BRACE $@20 statOrDeclList R_BRACE  */
                             {}
    break;

  case 335: /* statOrDeclList: %empty  */
                                          {}
    break;

  case 336: /* statOrDeclList: statOrDeclList statementOrDeclaration  */
                                            {}
    break;

  case 337: /* switchStatement: SWITCH L_PAREN expression R_PAREN L_BRACE switchCases R_BRACE  */
                                                                  {}
    break;

  case 338: /* switchCases: %empty  */
                             {}
    break;

  case 339: /* switchCases: switchCases switchCase  */
                               {}
    break;

  case 340: /* switchCase: switchLabel COLON blockStatement  */
                                     {}
    break;

  case 341: /* switchCase: switchLabel COLON  */
                                       {}
    break;

  case 342: /* switchLabel: DEFAULT  */
                             {}
    break;

  case 343: /* switchLabel: nonBraceExpression  */
                               {}
    break;

  case 344: /* statementOrDeclaration: variableDeclaration  */
                             {}
    break;

  case 345: /* statementOrDeclaration: constantDeclaration  */
                               {}
    break;

  case 346: /* statementOrDeclaration: statement  */
                               {}
    break;

  case 347: /* statementOrDeclaration: instantiation  */
                               {}
    break;

  case 348: /* tableDeclaration: optAnnotations TABLE name L_BRACE tablePropertyList R_BRACE  */
          {}
    break;

  case 349: /* tablePropertyList: tableProperty  */
                                       {}
    break;

  case 350: /* tablePropertyList: tablePropertyList tableProperty  */
                                         {}
    break;

  case 351: /* tableProperty: KEY ASSIGN L_BRACE keyElementList R_BRACE  */
        {}
    break;

  case 352: /* tableProperty: ACTIONS ASSIGN L_BRACE actionList R_BRACE  */
        {}
    break;

  case 353: /* tableProperty: optAnnotations optCONST ENTRIES ASSIGN L_BRACE entriesList R_BRACE  */
        {}
    break;

  case 354: /* tableProperty: optAnnotations optCONST nonTableKwName ASSIGN initializer SEMICOLON  */
        {}
    break;

  case 355: /* keyElementList: %empty  */
                                       {}
    break;

  case 356: /* keyElementList: keyElementList keyElement  */
                                         {}
    break;

  case 357: /* keyElement: expression COLON name optAnnotations SEMICOLON  */
                                         {}
    break;

  case 358: /* actionList: %empty  */
           {}
    break;

  case 359: /* actionList: actionList optAnnotations actionRef SEMICOLON  */
        {}
    break;

  case 360: /* actionRef: prefixedNonTypeName  */
        {}
    break;

  case 361: /* actionRef: prefixedNonTypeName L_PAREN argumentList R_PAREN  */
        {}
    break;

  case 362: /* entry: keysetExpression COLON actionRef optAnnotations SEMICOLON  */
        {}
    break;

  case 363: /* entriesList: entry  */
                                   {}
    break;

  case 364: /* entriesList: entriesList entry  */
                                     {}
    break;

  case 365: /* actionDeclaration: optAnnotations ACTION name L_PAREN parameterList R_PAREN blockStatement  */
                                                                            {
        saveBaseType(subparser, getNodeAt(subparser, 6));
        bindIdent(subparser, getNodeAt(subparser, 6), getNodeAt(subparser, 5));
      }
    break;

  case 366: /* variableDeclaration: annotations typeRef name optInitializer SEMICOLON  */
                                                      {
        saveBaseType(subparser, getNodeAt(subparser, 4));
        bindIdent(subparser, getNodeAt(subparser, 4), getNodeAt(subparser, 3));
      }
    break;

  case 367: /* variableDeclaration: typeRef name optInitializer SEMICOLON  */
                                            {
        saveBaseType(subparser, getNodeAt(subparser, 4));
        bindIdent(subparser, getNodeAt(subparser, 4), getNodeAt(subparser, 3));
      }
    break;

  case 368: /* constantDeclaration: optAnnotations CONST typeRef name ASSIGN initializer SEMICOLON  */
                                     {}
    break;

  case 369: /* optInitializer: %empty  */
                                     {}
    break;

  case 370: /* optInitializer: ASSIGN initializer  */
                                          {}
    break;

  case 371: /* initializer: expression  */
                                        {}
    break;

  case 372: /* functionDeclaration: functionPrototype blockStatement  */
                                       {}
    break;

  case 373: /* argumentList: %empty  */
                                       {}
    break;

  case 374: /* argumentList: nonEmptyArgList  */
                                         {}
    break;

  case 375: /* nonEmptyArgList: argument  */
                                       {}
    break;

  case 376: /* nonEmptyArgList: nonEmptyArgList COMMA argument  */
                                           {}
    break;

  case 377: /* argument: expression  */
                                       {}
    break;

  case 378: /* argument: name ASSIGN expression  */
                                            {}
    break;

  case 379: /* argument: DONTCARE  */
                                              {}
    break;

  case 380: /* expressionList: %empty  */
                                       {}
    break;

  case 381: /* expressionList: expression  */
                                         {}
    break;

  case 382: /* expressionList: expressionList COMMA expression  */
                                           {}
    break;

  case 383: /* prefixedNonTypeName: nonTypeName  */
                                       {}
    break;

  case 384: /* prefixedNonTypeName: dotPrefix nonTypeName  */
                                         {}
    break;

  case 385: /* $@21: %empty  */
        {}
    break;

  case 386: /* dot_name: DOT $@21 name  */
                {}
    break;

  case 387: /* lvalue: prefixedNonTypeName  */
                                       {}
    break;

  case 388: /* lvalue: THIS  */
                                         {}
    break;

  case 389: /* lvalue: lvalue dot_name  */
                                         {}
    break;

  case 390: /* lvalue: lvalue L_BRACKET expression R_BRACKET  */
                                                     {}
    break;

  case 391: /* lvalue: lvalue L_BRACKET expression COLON expression R_BRACKET  */
                                                             {}
    break;

  case 392: /* expression: INTEGER  */
                                       {}
    break;

  case 393: /* expression: STRING_LITERAL  */
                                         {}
    break;

  case 394: /* expression: TRUE  */
                                         {}
    break;

  case 395: /* expression: FALSE  */
                                         {}
    break;

  case 396: /* expression: THIS  */
                                         {}
    break;

  case 397: /* expression: nonTypeName  */
                                         {}
    break;

  case 398: /* expression: dotPrefix nonTypeName  */
                                         {}
    break;

  case 399: /* expression: expression L_BRACKET expression R_BRACKET  */
                                                     {}
    break;

  case 400: /* expression: expression L_BRACKET expression COLON expression R_BRACKET  */
                                                                 {}
    break;

  case 401: /* expression: L_BRACE expressionList R_BRACE  */
                                                 {}
    break;

  case 402: /* expression: L_BRACE kvList R_BRACE  */
                                                 {}
    break;

  case 403: /* expression: L_PAREN expression R_PAREN  */
                                                 {}
    break;

  case 404: /* expression: NOT expression  */
                                         {}
    break;

  case 405: /* expression: COMPLEMENT expression  */
                                                {}
    break;

  case 406: /* expression: MINUS expression  */
                                           {}
    break;

  case 407: /* expression: PLUS expression  */
                                          {}
    break;

  case 408: /* expression: typeName dot_name  */
        {}
    break;

  case 409: /* expression: ERROR DOT name  */
        {}
    break;

  case 410: /* expression: expression dot_name  */
                                         {}
    break;

  case 411: /* expression: expression MUL expression  */
                                         {}
    break;

  case 412: /* expression: expression DIV expression  */
                                         {}
    break;

  case 413: /* expression: expression MOD expression  */
                                         {}
    break;

  case 414: /* expression: expression PLUS expression  */
                                          {}
    break;

  case 415: /* expression: expression MINUS expression  */
                                           {}
    break;

  case 416: /* expression: expression PLUS_SAT expression  */
                                            {}
    break;

  case 417: /* expression: expression MINUS_SAT expression  */
                                             {}
    break;

  case 418: /* expression: expression SHL expression  */
                                        {}
    break;

  case 419: /* expression: expression R_ANGLE_SHIFT R_ANGLE expression  */
        {}
    break;

  case 420: /* expression: expression LE expression  */
                                       {}
    break;

  case 421: /* expression: expression GE expression  */
                                       {}
    break;

  case 422: /* expression: expression l_angle expression  */
                                         {}
    break;

  case 423: /* expression: expression R_ANGLE expression  */
                                             {}
    break;

  case 424: /* expression: expression NE expression  */
                                       {}
    break;

  case 425: /* expression: expression EQ expression  */
                                       {}
    break;

  case 426: /* expression: expression BIT_AND expression  */
                                             {}
    break;

  case 427: /* expression: expression BIT_XOR expression  */
                                             {}
    break;

  case 428: /* expression: expression BIT_OR expression  */
                                            {}
    break;

  case 429: /* expression: expression PP expression  */
                                       {}
    break;

  case 430: /* expression: expression AND expression  */
                                        {}
    break;

  case 431: /* expression: expression OR expression  */
                                       {}
    break;

  case 432: /* expression: expression QUESTION expression COLON expression  */
                                                      {}
    break;

  case 433: /* expression: expression l_angle realTypeArgumentList r_angle L_PAREN argumentList R_PAREN  */
        {}
    break;

  case 434: /* expression: expression L_PAREN argumentList R_PAREN  */
        {}
    break;

  case 435: /* expression: namedType L_PAREN argumentList R_PAREN  */
        {}
    break;

  case 436: /* expression: L_PAREN typeRef R_PAREN expression  */
                                                      {}
    break;

  case 437: /* nonBraceExpression: INTEGER  */
                                       {}
    break;

  case 438: /* nonBraceExpression: STRING_LITERAL  */
                                         {}
    break;

  case 439: /* nonBraceExpression: TRUE  */
                                         {}
    break;

  case 440: /* nonBraceExpression: FALSE  */
                                         {}
    break;

  case 441: /* nonBraceExpression: THIS  */
                                         {}
    break;

  case 442: /* nonBraceExpression: nonTypeName  */
                                         {}
    break;

  case 443: /* nonBraceExpression: dotPrefix nonTypeName  */
                                         {}
    break;

  case 444: /* nonBraceExpression: nonBraceExpression L_BRACKET expression R_BRACKET  */
                                                             {}
    break;

  case 445: /* nonBraceExpression: nonBraceExpression L_BRACKET expression COLON expression R_BRACKET  */
                                                                         {}
    break;

  case 446: /* nonBraceExpression: L_PAREN expression R_PAREN  */
                                                 {}
    break;

  case 447: /* nonBraceExpression: NOT expression  */
                                         {}
    break;

  case 448: /* nonBraceExpression: COMPLEMENT expression  */
                                                {}
    break;

  case 449: /* nonBraceExpression: MINUS expression  */
                                           {}
    break;

  case 450: /* nonBraceExpression: PLUS expression  */
                                          {}
    break;

  case 451: /* nonBraceExpression: typeName dot_name  */
        {}
    break;

  case 452: /* nonBraceExpression: ERROR DOT name  */
        {}
    break;

  case 453: /* nonBraceExpression: nonBraceExpression dot_name  */
                                                 {}
    break;

  case 454: /* nonBraceExpression: nonBraceExpression MUL expression  */
                                                 {}
    break;

  case 455: /* nonBraceExpression: nonBraceExpression DIV expression  */
                                                 {}
    break;

  case 456: /* nonBraceExpression: nonBraceExpression MOD expression  */
                                                 {}
    break;

  case 457: /* nonBraceExpression: nonBraceExpression PLUS expression  */
                                                  {}
    break;

  case 458: /* nonBraceExpression: nonBraceExpression MINUS expression  */
                                                   {}
    break;

  case 459: /* nonBraceExpression: nonBraceExpression PLUS_SAT expression  */
                                                    {}
    break;

  case 460: /* nonBraceExpression: nonBraceExpression MINUS_SAT expression  */
                                                     {}
    break;

  case 461: /* nonBraceExpression: nonBraceExpression SHL expression  */
                                                {}
    break;

  case 462: /* nonBraceExpression: nonBraceExpression R_ANGLE_SHIFT R_ANGLE expression  */
        {}
    break;

  case 463: /* nonBraceExpression: nonBraceExpression LE expression  */
                                               {}
    break;

  case 464: /* nonBraceExpression: nonBraceExpression GE expression  */
                                               {}
    break;

  case 465: /* nonBraceExpression: nonBraceExpression l_angle expression  */
                                         {}
    break;

  case 466: /* nonBraceExpression: nonBraceExpression R_ANGLE expression  */
                                                     {}
    break;

  case 467: /* nonBraceExpression: nonBraceExpression NE expression  */
                                               {}
    break;

  case 468: /* nonBraceExpression: nonBraceExpression EQ expression  */
                                               {}
    break;

  case 469: /* nonBraceExpression: nonBraceExpression BIT_AND expression  */
                                                     {}
    break;

  case 470: /* nonBraceExpression: nonBraceExpression BIT_XOR expression  */
                                                     {}
    break;

  case 471: /* nonBraceExpression: nonBraceExpression BIT_OR expression  */
                                                    {}
    break;

  case 472: /* nonBraceExpression: nonBraceExpression PP expression  */
                                               {}
    break;

  case 473: /* nonBraceExpression: nonBraceExpression AND expression  */
                                                {}
    break;

  case 474: /* nonBraceExpression: nonBraceExpression OR expression  */
                                               {}
    break;

  case 475: /* nonBraceExpression: nonBraceExpression QUESTION expression COLON expression  */
                                                              {}
    break;

  case 476: /* nonBraceExpression: nonBraceExpression l_angle realTypeArgumentList r_angle L_PAREN argumentList R_PAREN  */
        {}
    break;

  case 477: /* nonBraceExpression: nonBraceExpression L_PAREN argumentList R_PAREN  */
        {}
    break;

  case 478: /* nonBraceExpression: namedType L_PAREN argumentList R_PAREN  */
        {}
    break;

  case 479: /* nonBraceExpression: L_PAREN typeRef R_PAREN expression  */
                                                      {}
    break;


    }
  return value;
  }
  public void dispatch(int id, Subparser subparser) {
    // no action productions
  }
  /* from p4parser.epilogue */


/** True when statistics should be output. */
private boolean languageStatistics = false;

/** Turn on error reporting. */
private static boolean showErrors = false;

/** Turn on debugging messages. */
private static boolean debug = false;

/** Turn on checkers. */
private static boolean enableCheckers = false;

/** Turn on checkers. */
private static List<String> extraConstraints = null;

/** Turn on function analysis. */
private static boolean enableFunctionAnalysis = false;

/** A symbol table for analysis. */
private P4Context.SymbolTable functionTable;

/** Turn on kconfig feature model clauses. */
private boolean hasClauses = false;

/** The clauses for the kconfig feature model. */
private Clauses featureClauses = null;

/** The kconfig feature model solver. */
private ISolver featureSolver;

/** The assumptions of the feature model, i.e., non-arch config vars. */
private VecInt modelAssumptions;

/**
 * Turn language statistics collection on.  Default is off.
 *
 * @param b True is on.
 */
public void collectStatistics(boolean b) {
  languageStatistics = b;
}

/**
 * Show errors.
 *
 * @param b True is on.
 */
public void showErrors(boolean b) {
  showErrors = b;
}

/**
 * Show debugging messages.
 *
 * @param b True is on.
 */
public void debug(boolean b) {
  debug = b;
}

/**
 * Enable checkers.
 *
 * @param b Enable checkers if true.
 */
public void enableCheckers(boolean b) {
  this.enableCheckers(b, null);
}

/**
 * Enable checkers.
 *
 * @param b Enable checkers if true.
 * @param extraConstraints Extra constraints to SAT solver.
 */
public void enableCheckers(boolean b, List<String> extraConstraints) {
  this.enableCheckers = b;
  if (null == extraConstraints) {
    // avoid having to check for null
    extraConstraints = new ArrayList<String>();
  }
  this.extraConstraints = extraConstraints;
}

/**
 * Enable function analysis.
 */
public void enableFunctionAnalysis() {
  this.enableFunctionAnalysis = true;
  this.functionTable = new P4Context.SymbolTable();
}

/**
 * Add kconfig feature model clauses.
 *
 * @param clauses The clauses.
 */
public void addClauses(Clauses clauses, int[] assumptions) {
  if (null != assumptions) {
    this.modelAssumptions = new VecInt(assumptions);
  } else {
    this.modelAssumptions = new VecInt(new int[0]);
  }

  if (null != clauses) {
    this.hasClauses = true;
    this.featureClauses = clauses;
    this.featureSolver = SolverFactory.newDefault();
    this.featureSolver.newVar(clauses.getNumVars());
    this.featureSolver.setExpectedNumberOfClauses(clauses.size());

    try {
      for (List<Integer> clause : clauses) {
        int[] cint = new int[clause.size()];
        int i = 0;
        for (Integer val : clause) {
          cint[i++] = val;
        }
        this.featureSolver.addClause(new VecInt(cint));
      }
    } catch (ContradictionException e) {
      e.printStackTrace();
      System.exit(1);
    }
  } else {
    this.hasClauses = false;
    this.featureClauses = null;
  }
}

/**
 * Get the checker symbol table.
 *
 * @return The checker symbol table.
 */
public P4Context.SymbolTable getFunctionTable() {
  return this.functionTable;
}

/**
 * A helper function to get the value of a node on the stack, which
 * corresponds to the value of the component of a production.  Unlike
 * bison, this is numbered by the stack, i.e., the closest component
 * to the action has the lowest number, starting with 1.
 *
 * @param subparser The reference to the subparser.
 * @param number The component number, where 1 is the component to the
 * left of the action, and increasing in number while going towards
 * the beginning of the production.
 * @return The node value of the component.
 */
private static Node getNodeAt(Subparser subparser, int component) {
  return (Node) (subparser.stack.get(component).value);
}

private static String getStringAt(Subparser subparser, int component) {
  return ((Syntax) getNodeAt(subparser, component)).toLanguage().getTokenText();
}

/**
 * A helper function to set the type property of the given node.  The
 * given value will be first cast to a Node.
 *
 * @param value A node object.
 * @param type The type to set.
 */
private static void setType(Object value, Type type) {
  ((Node) value).setProperty(Constants.TYPE, type);
}

private static void error(String msg) {
  if (showErrors) {
    System.err.println("error: " + msg);
  }
  /* System.exit(1); */
}

// ---------- Parsing-only context

/**
 * Compute and store the base type indicated by the specifications
 * property of the given node.
 */
public void saveBaseType(Subparser subparser, Node typespec) {
  if (typespec.getProperty(SPECS) == null) {
    if (showErrors) {
      System.err.println("error: no specs available");
    }
    return;
  }
  ((P4Context) subparser.scope).lastSeenType =
    ((Specifiers) typespec.getProperty(SPECS)).getType();
}

/**
 * Return the last seen type.
 */
public Type lastSeenType(Subparser subparser) {
  return ((P4Context) subparser.scope).lastSeenType;
}

private static class Binding {
  public Language ident;
  public Type type;

  public Binding(Language ident, Type type) {
    this.ident = ident;
    this.type = type;
  }
}

private boolean findToken(Object n, P4Tag tag) {
  if (n instanceof Language && ((Language) n).tag() == tag) {
    return true;
  } else if (n instanceof Syntax) {
    return ((Syntax) n).getTokenText().equals(tag.getText());
  } else if (n instanceof Node) {
    boolean b = false;
    for (Object o : ((Node) n)) {
      b |= findToken(o, tag);
      if (b) return true;
    }
    return false;
  } else if (n instanceof PresenceCondition) {
    // ignore
    return false;
  } else {
    System.err.println(n.getClass().getSimpleName());
    return false;
  }
}

public void bindFunDef(Subparser subparser, Node typespec, Node declarator) {
  if (getident(declarator).equals("ERR_PTR")) {
    System.err.println(typespec);
    System.err.println(declarator);
  }

  bindIdent(subparser, typespec, declarator, STField.GLOBAL_FUNDEF);
}

public void bindIdent(Subparser subparser, Node typespec, Node declarator) {
   bindIdent(subparser, typespec, declarator, null, false);
}


/** Another overloaded function for bindIdent to explicity specify it's a TYPDEF value
 * 
 * Cases like typeParameterList don't have a unique preceding value to identify
 * the value as a typedef value. So can use this overloaded function to explicity
 * specify that the value is a typedef.
 */
public void bindIdent(Subparser subparser, Node typespec, Node declarator, boolean typeVar) {
   bindIdent(subparser, typespec, declarator, null, typeVar);
}

/** Overloaded function with original parameters
 *
 * Original bindIdent (from cparser.y) function is modified with a new parameter,
 * this functions overloads the modified function to behave like how it is in cparser
 */
public void bindIdent(Subparser subparser, Node typespec, Node declarator, STField alsoSet) {
  bindIdent(subparser, typespec, declarator, alsoSet, false);
}

/** typespec might be null for declarations and definitions without a
 * type spec; alsoSet is used to set another symbol table bit and
 * might be null.
 */
public void bindIdent(Subparser subparser, Node typespec, Node declarator, STField alsoSet, boolean typeVar) {
  StackFrame stack = subparser.stack;
  PresenceConditionManager.PresenceCondition presenceCondition = subparser.getPresenceCondition();
  P4Context scope = (P4Context) subparser.scope;

  // TODO need to hoist conditionals from typespec and declarator
  // around entire declaration by combining with each other

  // TODO causing an infinite loop on 3.12 init/main.c
  /* if (typespec.getProperty(SPECS) == null) { */
  /*   System.err.println("error: no specs available"); */
  /* } else { */
  /*   Type baseType = ((Specifiers) typespec.getProperty(SPECS)).getType(); */
  /*   Binding binding = grokdeclarator(declarator, baseType); */
  /*   Type type = binding.type; */
  /*   Language ident = binding.ident; */

  /*   System.err.println(ident + " = " + type); */
  /* } */

  // TODO replace old-style typedef checking by using specs above
  Language ident = getident(declarator);


  // Check whether the declaration is a typedef.  This assumes that
  // the typedef keyword is the first token of the declaration.
  boolean typedef = false;

  if (null != typespec) {
    Object a = typespec;
    while (true) {
      if ( ! (a instanceof Syntax)) {
        Node n = (Node) a;
        if (n.hasName(ForkMergeParser.CHOICE_NODE_NAME)) {
          // When it's a conditional node, the first child is a
          // presence condition, the second is the first AST child.
          a = n.get(1);
        } else {
          a = n.get(0);
        }
      } else if (a instanceof Pair) {
        a = ((Pair) a).head();
      } else {
        break;
      }
    }
    Language t = (Language) a;
    if (P4Tag.TYPEDEF == t.tag() || P4Tag.STRUCT == t.tag() || P4Tag.CONTROL == t.tag() || 
        P4Tag.PACKAGE == t.tag() || P4Tag.EXTERN == t.tag() || P4Tag.HEADER == t.tag() ||
        P4Tag.ENUM == t.tag() || P4Tag.PARSER == t.tag() || P4Tag.HEADER_UNION == t.tag() ||
        P4Tag.TYPE == t.tag()) {
      // Bind a typedef name.
      typedef = true;

      if (languageStatistics) {
        if (typedef) {
          Location location = subparser.lookahead.token.syntax.getLocation();
          System.err.println(String.format("typedef %s %s", ident, location));
        }
      }
    } else {
      // Binding a variable name.
      typedef = false;
    }
  }

  if (showErrors) {
    System.err.println("bind: " + ident.getTokenText() + " " + typedef);
  }
  if (debug) {
    System.err.println("def: " + ident.getTokenText() + " " + alsoSet);
  }
  // System.err.println("Setting variable: " + ident.getTokenText() + " to type: " + ((typedef || typeVar) ? "TYPDEF" : "IDENT"));
  STField field = (typedef || typeVar) ? STField.TYPEDEF : STField.IDENT;
  scope.getSymbolTable().setbool(ident.getTokenText(), field, true, presenceCondition);
  if (null != alsoSet) {
    scope.getSymbolTable().setbool(ident.getTokenText(), alsoSet, true, presenceCondition);
  }
  /* if (typedef) { */
  /*   scope.getSymbolTable().setbool(ident.getTokenText(), STField.TYPEDEF, true, presenceCondition); */
  /* } else { */
  /*   scope.getSymbolTable().setbool(ident.getTokenText(), STField.IDENT, true, presenceCondition); */
  /* } */
  /* scope.bind(ident.getTokenText(), typedef, presenceCondition); */
}

private static Binding grokdeclarator(Node declarator, Type type) {
  Language ident = null;
  
  while (null != declarator) {
    if (declarator.getName().equals("SimpleDeclarator")) {
      ident = ((Syntax) declarator.get(0)).toLanguage();
      declarator = null;
      
    } else if (declarator.getName().equals("ParenIdentifierDeclarator")) {
      Node parenIdentDecl = null;

      switch (declarator.size()) {
      case 3:
      parenIdentDecl = (Node) declarator.get(1);
        break;
      default:
      error("unexpected grammar structure for " + declarator.getName());
        break;
      }
      declarator = parenIdentDecl;
      
    } else if (declarator.getName().equals("UnaryIdentifierDeclarator")) {
      Node typeQual;
      Node identDecl;
      switch (declarator.size()) {
      case 2:
      typeQual = null;
        identDecl = (Node) declarator.get(1);
        break;
      case 3:
      typeQual = (Node) declarator.get(1);
        identDecl = (Node) declarator.get(2);
        break;
      default:
      typeQual = null;
        identDecl = null;
        error("unexpected grammar structure for " + declarator.getName());
        break;
      }
      
      if (null != typeQual) {
        Specifiers specs = (Specifiers) typeQual.getProperty(SPECS);
        type = specs.annotateBase(new PointerT(type).annotate());
      } else {
        type = new PointerT(type);
      }

      declarator = identDecl;
      
    } else if (declarator.getName().equals("ArrayDeclarator")) {
      Node parenIdentDecl = (Node) declarator.get(0);
      Node arrayAbsDecl = (Node) declarator.get(1);

      type = grokabsdeclarator(arrayAbsDecl, type);
      declarator = parenIdentDecl;
      
    } else if (declarator.getName().equals("PostfixIdentifierDeclarator")) {
      Node unaryIdentDecl = (Node) declarator.get(0);
      Node postfixAbsDecl = (Node) declarator.get(1);

      type = grokabsdeclarator(postfixAbsDecl, type);
      declarator = unaryIdentDecl;

    } else if (declarator.getName().equals("FunctionDeclarator")) {
      Node parenIdentDecl = (Node) declarator.get(0);
      Node postfixFuncDecl = (Node) declarator.get(1);

      type = grokabsdeclarator(postfixFuncDecl, type);
      declarator = parenIdentDecl;

    } else {
      if (debug) {
        System.err.println("TODO support declarator " + declarator.getName());
      }
      declarator = null;
    }
  }

  return new Binding(ident, type);
}

private static Type grokabsdeclarator(Node absdeclarator, Type type) {
  if (absdeclarator.getName().equals("ArrayAbstractDeclarator")) {
    while (null != absdeclarator) {
      Node arraySize = null;
      switch (absdeclarator.size()) {
      case 0:
      arraySize = null;
        absdeclarator = null;
        break;
      case 1:
      arraySize = (Node) absdeclarator.get(0);
        absdeclarator = null;
        break;
      case 2:
      arraySize = (Node) absdeclarator.get(1);
        absdeclarator = (Node) absdeclarator.get(0);
        break;
      default:
      error("unexpected grammar structure for " + absdeclarator.getName());
      }
      type = new ArrayT(type);
    }
      
  } else if (absdeclarator.getName().equals("PostfixingFunctionDeclarator")) {
    Node parms = null;
    switch (absdeclarator.size()) {
    case 1:
    parms = (Node) absdeclarator.get(0);
      break;
    default:
    error("unexpected grammar structure for " + absdeclarator.getName());
      break;
    }

    FunctionT function = getParameterTypes(parms);

    function.setResult(type);
    type = function;

  } else {
    if (debug) {
      System.err.println("TODO support absdeclarator " + absdeclarator.getName());
    }
  }
  
  return type;
}

private static FunctionT getParameterTypes(Node parms) {
  // TODO flesh this out and do type checking
  boolean varArgs = false;
  ArrayList<Type> types = new ArrayList<Type>();

  if (parms != null && parms.size() > 0) {
    parms = (Node) parms.get(0);
    /* System.err.println(parms); */
    switch (parms.size()) {
    case 2:
    varArgs = true;
      // fall through
    case 1:
    parms = (Node) parms.get(0);
      break;
    default:
    error("unexpected grammar structure for " + parms.getName());
      break;
    }
    // parms is now a list node containing ParameterDeclaration elements
    if (parms.getName().equals("ParameterList")) {
      for (Object o : parms) {
        GNode n = (GNode) o;
        if (n.getName().equals("Conditional")) {
          boolean isCond = true;
          for (Object o_parm : n) {
            if (isCond) {
              // TODO get presence condition
            } else {
              GNode parm = (GNode) o_parm;
              Node typespec = (Node) parm.get(0);
              // TODO remove once specs are done
              if (typespec.getProperty(SPECS) == null) continue;
              Type baseType = ((Specifiers) typespec.getProperty(SPECS)).getType();
              if (parm.size() > 1) {
                Node declarator = (Node) parm.get(1);
                if (parm.getName().equals("ParameterIdentifierDeclaration")) {
                  Binding binding = grokdeclarator(declarator, baseType);
                  Language ident = binding.ident;
                  Type type = binding.type;
                  String name = binding.ident.getTokenText();
                  types.add(VariableT.newParam(type, name));

                } else if (parm.getName().equals("ParameterAbstractDeclaration")) {
                  Type type = grokabsdeclarator(declarator, baseType);
                  types.add(type);
                } else {
                  if (showErrors) {
                    System.err.println("unsupported parameter declaration " + parm.getName());
                  }
                }
              } else {
                types.add(baseType);
              }
            }
            isCond = isCond ? false : true;
          }
        } else {
          if (showErrors) {
            System.err.println("parameter is no conditional");
          }
        }
      }
    } else {
      if (showErrors) {
        System.err.println("unexpected parameter list node");
      }
    }
  }

  FunctionT function = new FunctionT(null, types, varArgs);
  function.addAttribute(Constants.ATT_STYLE_NEW);
  return function;
}

public void BindVar(Subparser subparser) {
  StackFrame stack = subparser.stack;
  PresenceConditionManager.PresenceCondition presenceCondition = subparser.getPresenceCondition();
  P4Context scope = (P4Context) subparser.scope;

  // Get the identifier in the declarator.
  Object b = stack.get(1).value;
  Language<?> ident = getident(b);

  // Bind variable name.
  scope.getSymbolTable().setbool(ident.getTokenText(), STField.IDENT, true, presenceCondition);
  /* scope.bind(ident.getTokenText(), false, presenceCondition); */
}

public void BindEnum(Subparser subparser) {
  StackFrame stack  = subparser.stack;
  PresenceConditionManager.PresenceCondition presenceCondition = subparser.getPresenceCondition();
  P4Context scope = (P4Context) subparser.scope;

  // Get the identifier in the declarator.  The identifier must
  // occur after an IdentifierOrTypedefName token.
  Object b = stack.get(1).value;
  String ident = getident(b).getTokenText();

  // Bind variable name.
  scope.getSymbolTable().setbool(ident, STField.IDENT, true, presenceCondition);
  /* scope.bind(ident, false, presenceCondition); */
}

public void useIdent(Subparser subparser, Node ident) {
  P4Context scope = (P4Context) subparser.scope;
  String name = ident.getTokenText();

  if (debug) {
    System.err.println("use: " + name);
  }
  if (enableCheckers) {
    PresenceCondition identPresenceCond = scope.symbolPresenceCond(name, STField.IDENT);
    if (null != identPresenceCond && ! identPresenceCond.isFalse()) {
      PresenceCondition not = identPresenceCond.not();
      PresenceCondition andnot = subparser.getPresenceCondition().and(not);
      /* not.delRef(); */
      if (! andnot.isFalse()) {
        boolean satWithKconfig = true;
        boolean contradiction = false;
        int[] model = null;
        // check andnot against kconfig feature model
        if (this.hasClauses) {
          // use double negation to get andnot in cnf form
          PresenceCondition notandnot = andnot.not();
          /* System.err.println(notandnot); */
          List allsat = (List) notandnot.getBDD().allsat();
          ArrayList<ArrayList<Integer>> bugClauses =
            new ArrayList<ArrayList<Integer>>();
      
          for (Object o : allsat) {        
            byte[] sat = (byte[]) o;
            ArrayList<Integer> clause = new ArrayList<Integer>();
            for (int i = 0; i < sat.length; i++) {
              // convert to solver's varnum
              // look up i in variable manager
              // if varname exists in clauses, then add to clause
              int sign = 1;
              
              switch (sat[i]) {
              case 1:
              // negate again
                sign = -1;
              case 0:
              String varname = notandnot.presenceConditionManager().getVariableManager().getName(i);
                if (varname.startsWith("(defined ")) {
                  varname = varname.substring(9, varname.length() - 1);
                  /* System.err.println(varname); */
                  if (this.featureClauses.getVarmap().containsKey(varname)) {
                    int var = this.featureClauses.getVarmap().get(varname);
                    var = sign * var;
                    clause.add(var);
                  }
                }
                break;
              }
            }
            if (clause.size() > 0) {
              /* System.err.println(clause); */
              bugClauses.add(clause);
            }
          }

          // add extra constraints
          for (String extraConstraint : extraConstraints) {
            this.featureClauses.addClauses(extraConstraint);
          }
          // remove them to avoid adding them again the next check
          extraConstraints.clear();

          try {
            ISolver featureSolver = SolverFactory.newDefault();
            featureSolver.newVar(this.featureClauses.getNumVars());
            /* featureSolver.setExpectedNumberOfClauses(this.featureClauses.size() + bugClauses.size()); */

            for (List<Integer> clause : this.featureClauses) {
              int[] cint = new int[clause.size()];
              int i = 0;
              for (Integer val : clause) {
                cint[i++] = val;
              }
              featureSolver.addClause(new VecInt(cint));
            }

            for (List<Integer> clause : bugClauses) {
              int[] cint = new int[clause.size()];
              int i = 0;
              for (Integer val : clause) {
                cint[i++] = val;
              }
              IConstr curConstr =
                featureSolver.addClause(new VecInt(cint));
            }

            ISolver bugSolver = SolverFactory.newDefault();
            bugSolver.newVar(this.featureClauses.getNumVars());
            bugSolver.setExpectedNumberOfClauses(bugClauses.size());

            for (List<Integer> clause : bugClauses) {
              int[] cint = new int[clause.size()];
              int i = 0;
              for (Integer val : clause) {
                cint[i++] = val;
              }
              IConstr curConstr =
                bugSolver.addClause(new VecInt(cint));
            }

            IProblem simpleProblem = new ModelIterator(bugSolver);
            boolean satWithoutKconfig = simpleProblem.isSatisfiable();
            
            /* IProblem problem = featureSolver; */
            IProblem problem = new ModelIterator(featureSolver);
            if (problem.isSatisfiable(modelAssumptions)) {
              satWithKconfig = true;
              if (debug) {
                System.err.println("computing model");
              }
              model = problem.model();
            } else {
              satWithKconfig = false;
              if (satWithoutKconfig) {
                System.err.print("invalid config invalidated by kconfig ");
              } else {
                System.err.print("invalid config invalidated by bug clauses alone ");
              }
              System.err.println(name + " at " + ident.getLocation());
            }
          } catch (ContradictionException e) {
            contradiction = true;
          } catch (TimeoutException e) {
            e.printStackTrace();
            /* System.exit(1); */
          }
          notandnot.delRef();
        }
        if (contradiction) {
          System.err.print("invalid config invalidated by contradiction " + name + " at " + ident.getLocation());
        } else if (satWithKconfig) {
          /* PresenceCondition sat = andnot.satOne(); */
          if (null != scope.symbolPresenceCond(name, STField.GLOBAL_FUNDEF) || null != scope.symbolPresenceCond(name, STField.STATIC_FUNDEF)) {
            System.err.println("found for function def");
          }
          System.err.println("found invalid configuration on "
                             + name + " at " + ident.getLocation());
          /* System.err.println("config " + andnot); */
          /* System.err.println("identPresenceCond: " + identPresenceCond); */
          /* /\* System.err.println("undefined under " + not); *\/ */
          /* /\* System.err.println("used under      " + subparser.getPresenceCondition()); *\/ */
          /* if (this.showExample) { */
          if (true) {
            if (null != model) {
              System.err.print("model: ");
              String delim = "[";
              for (int i = 0; i < model.length; i++) {
                if (model[i] > 0) {
                  System.err.print(delim + featureClauses.getVarName(model[i]));
                  delim = ",";
                }
              }
              System.err.println("]");
            }
          }
          /* sat.delRef(); */
        }
      } else {
        if (debug) {
          System.err.println("valid function call " + name + " at " + ident.getLocation());
          /* System.err.println("not: " + not); */
          /* System.err.println("subparser.getPresenceCondition() " + subparser.getPresenceCondition()); */
        }
      }
      not.delRef();
      andnot.delRef();

      /* PresenceCondition and = subparser.getPresenceCondition().and(identPresenceCond); */
      /* if (and.isFalse()) { */
      /*   System.err.println("found infeasible configuration on " + name + " at " + ident.getLocation() + " defined in " + identPresenceCond); */
      /* } */
      /* and.delRef(); */

      // update configurations the identifier is used in
      scope.getSymbolTable().setbool(name, STField.USED, true, subparser.getPresenceCondition());
    } else {
      if (debug) {
        System.err.println("not an identifier in any config " + name + " at " + ident.getLocation());
      }
    }
  }
}

public void callFunction(Subparser subparser, Node fun, Node parms) {
  if (fun.getName().equals("PrimaryIdentifier") && enableFunctionAnalysis) {
    /* P4Context scope = (P4Context) subparser.scope; */
    /* String name = ((Language<?>) fun.get(0)).getTokenText(); */
    /* scope.getSymbolTable().setbool(name, STField.FUNCALL, true, subparser.getPresenceCondition()); */
    String name = ((Language<?>) fun.get(0)).getTokenText();
    functionTable.setbool(name, STField.FUNCALL, true, subparser.getPresenceCondition());
    return;
  }

  // TODO do later
  if (true) {
    return;
  }
  
  String name = ((Syntax) fun.get(0)).getTokenText();
  P4Context scope = (P4Context) subparser.scope;

  if (debug) {
    System.err.println("function call: " + name);
  }
  if (enableCheckers) {
    PresenceCondition funPresenceCond = scope.symbolPresenceCond(name, STField.GLOBAL_FUNDEF).or(scope.symbolPresenceCond(name, STField.STATIC_FUNDEF));
    if (null != funPresenceCond && ! funPresenceCond.isFalse()) {
      PresenceCondition not = funPresenceCond.not();
      PresenceCondition andnot = subparser.getPresenceCondition().and(not);
      not.delRef();
      if (! andnot.isFalse()) {
        /* PresenceCondition sat = andnot.satOne(); */
        /* System.err.println("found invalid configuration on function call " + name + " at " + fun.getLocation() + " config " + sat);        sat.delRef(); */
      }
      andnot.delRef();

      PresenceCondition and = subparser.getPresenceCondition().and(funPresenceCond);
      if (and.isFalse()) {
        System.err.println("found infeasible configuration on function call " + name + " at " + fun.getLocation() + " defined in " + funPresenceCond);
      }
      and.delRef();

      // update configurations the function is used in
      scope.getSymbolTable().setbool(name, STField.USED, true, subparser.getPresenceCondition());
    } else {
      if (debug) {
        System.err.println("checker error: " + name + " not a function in any configuration");
      }
    }
    funPresenceCond.delRef();
  }
}

public void EnterScope(Subparser subparser) {
  PresenceConditionManager.PresenceCondition presenceCondition = subparser.getPresenceCondition();

  subparser.scope = ((P4Context) subparser.scope).enterScope(presenceCondition);
}

public void ExitScope(Subparser subparser) {
  PresenceConditionManager.PresenceCondition presenceCondition = subparser.getPresenceCondition();

  subparser.scope = ((P4Context) subparser.scope).exitScope(presenceCondition);
}

public void ExitReentrantScope(Subparser subparser) {
  PresenceConditionManager.PresenceCondition presenceCondition = subparser.getPresenceCondition();

  subparser.scope
    = ((P4Context) subparser.scope).exitReentrantScope(presenceCondition);
}

public void ReenterScope(Subparser subparser) {
  PresenceConditionManager.PresenceCondition presenceCondition = subparser.getPresenceCondition();

  subparser.scope
    = ((P4Context) subparser.scope).reenterScope(presenceCondition);
}

public void KillReentrantScope(Subparser subparser) {
  PresenceConditionManager.PresenceCondition presenceCondition = subparser.getPresenceCondition();

  subparser.scope
    = ((P4Context) subparser.scope).killReentrantScope(presenceCondition);
}

/**
 * Find the identifier or typedef name in a declarator.  Assume
 * the first identifier in the subtree is the var or typedef name.
 *
 * @param o The semantic value.
 * @return The first identifier in the subtree or null if there is
 * none.
 */
private static Language getident(Object o) {
  if (o instanceof Language) {
    Language token = ((Language) o);

    if (P4Tag.IDENTIFIER == token.tag() || P4Tag.TYPE_IDENTIFIER == token.tag()) {
      return token;

    } else {
      return null;
    }

  } else if (o instanceof Pair) {
    Pair<?> b = (Pair<?>) o;

    while (b != Pair.empty()) {
      Object child = b.head();

      if (null != child) {
        Language ident = getident(child);

        if (null != ident) {
          return ident;
        }
      }

      b = b.tail();
    }

    return null;
  } else if (o instanceof PresenceConditionManager.PresenceCondition) {
    return null;
  } else if (o instanceof Error) {
    return null;
  } else {
    Node b = (Node) o;

    for (int i = 0; i < b.size(); i++) {
      Object child = b.get(i);

      if (null != child) {
        Language ident = getident(child);

        if (null != ident) {
          return ident;
        }
      }
    }

    return null;
  }
}

// ---------- Specifiers

private static String SPECS = "superc.p4parser.Specifiers";

private static class Specifiers {
  /** Presence condition. */
  public PresenceCondition pc;

  /** True if there is a type error. */
  public boolean error;

  /** The type-error message. */
  public String error_message;

  /** The flag for whether a tag reference is a declaration. */
  public boolean refIsDecl;

  /** The type, if any. */
  public Type type;

  /** The storage class attribute, if any. */
  public Attribute storage;

  /** The thread-local attribute, if any. */
  public Attribute threadlocal;

  /** The inline attribute, if any. */
  public Attribute function;

  /** Any other attributes. */
  public List<Attribute> attributes;

  // The internal state for tracking type specifiers.
  public boolean seenSigned;
  public boolean seenUnsigned;
  public boolean seenBool;
  public boolean seenChar;
  public boolean seenShort;
  public boolean seenInt;
  public int     longCount;
  public boolean seenFloat;
  public boolean seenDouble;
  public boolean seenComplex;

  public Specifiers() {
  }

  /* public Specifiers(PresenceCondition pc) { */
  /*   this.pc = pc.addRef(); */
  /* } */

  public Specifiers(PresenceCondition pc, Specifiers s) {
    /* this(pc); */
    this.error = s.error;
    this.error_message = s.error_message;
    this.refIsDecl = s.refIsDecl;
    this.type = s.type;
    this.storage = s.storage;
    this.threadlocal = s.threadlocal;
    this.function = s.function;
    this.attributes = s.attributes;
    this.seenSigned = s.seenSigned;
    this.seenUnsigned = s.seenUnsigned;
    this.seenBool = s.seenBool;
    this.seenChar = s.seenChar;
    this.seenShort = s.seenShort;
    this.seenInt = s.seenInt;
    this.longCount = s.longCount;
    this.seenFloat = s.seenFloat;
    this.seenDouble = s.seenDouble;
    this.seenComplex = s.seenComplex;
  }

  /**
   * Add given specs to this set of specs.  Adds in-place and returns
   * this updated specs object.
   **/
  public Specifiers addSpecs(Specifiers other) {
    if (other.error) {
      this.setError(other.error_message);
      return this;
    }

    if (null != other.type) {
      if (null != this.type) {
        /* System.err.println("1"); */
        this.multipleTypes();
      } else {
        this.type = other.type;
      }
    }

    if (other.seenChar) {
      if (this.hasType()) {
        /* System.err.println("2"); */
        this.multipleTypes();
      } else {
        this.seenChar = true;
      }
    }

    if (other.seenShort) {
      if (this.seenBool || this.seenChar || this.seenShort || (0 < this.longCount) ||
          this.seenFloat || this.seenDouble || this.seenComplex ||
          (null != this.type)) {
        /* System.err.println("3"); */
        this.multipleTypes();
      } else {
        this.seenShort = true;
      }
    }

    if (other.seenInt) {
      if (this.seenBool || this.seenChar || this.seenInt ||
          this.seenFloat || this.seenDouble || this.seenComplex ||
          (null != this.type)) {
        /* System.err.println("4"); */
        this.multipleTypes();
      } else {
        this.seenInt = true;
      }
    }

    for (int i = 0; i < other.longCount; i++) {
      if (this.seenBool || this.seenChar || this.seenShort || (1 < this.longCount) ||
          this.seenFloat ||
          ((this.seenDouble || this.seenComplex) &&
           (0 < this.longCount)) ||
          (null != this.type)) {
        /* System.err.println("5"); */
        this.multipleTypes();
      } else {
        this.longCount++;
      }
    }

    if (other.seenFloat) {
      if (this.seenBool || this.seenChar || this.seenShort || this.seenInt || (0 < this.longCount) ||
          this.seenDouble ||
          (null != this.type)) {
        /* System.err.println("6"); */
        this.multipleTypes();
      } else {
        this.seenFloat = true;
      }
    }

    if (other.seenDouble) {
      if (this.seenBool || this.seenChar || this.seenShort || this.seenInt || (1 < this.longCount) ||
          this.seenFloat ||
          (null != this.type)) {
        /* System.err.println("7"); */
        this.multipleTypes();
      } else {
        this.seenDouble = true;
      }
    }

    if (other.seenSigned) {
      if (this.seenUnsigned) {
        this.seenSigned = true;
        this.setError("both 'signed' and 'unsigned' in declaration specifiers");
      } else if (this.seenSigned) {
        this.setError("duplicate 'signed'");
      } else {
        this.seenSigned = true;
      }
    }

    if (other.seenUnsigned) {
      if (this.seenSigned) {
        this.seenUnsigned = true;
        this.setError("both 'signed' and 'unsigned' in declaration specifiers");
      } else if (this.seenUnsigned) {
        this.setError("duplicate 'unsigned'");
      } else {
        this.seenUnsigned = true;
      }
    }

    if (other.seenBool) {
      if (this.hasType()) {
        /* System.err.println("8"); */
        this.multipleTypes();
      } else {
        this.seenBool = true;
      }
    }

    if (null != other.storage) {
      if (null == this.storage) {
        this.storage = other.storage;
      } else if (this.storage.equals(other.storage)) {
        this.setError("duplicate storage class");
      } else {
        this.setError("multiple storage classes in declaration specifiers");
      }
    }

    return this;
  }

  /**
   * Annotate the specified base type.  This method annotates the
   * specified type with all attributes besides the storage class,
   * thread-local specifier, and function specifier attributes.
   *
   * @param base The base type.
   * @return The annnotated base type.
   */
  public Type annotateBase(Type base) {
    return (null != attributes)? base.attribute(attributes) : base;
  }

  /**
   * Get the resulting type.
   */
  public Type getType() {
    Type type;
    if (seenBool) {
      type = BooleanT.TYPE;
    } else if (seenChar) {
      if (seenUnsigned) {
        type = NumberT.U_CHAR;
      } else if (seenSigned) {
        type = NumberT.S_CHAR;
      } else {
        type = NumberT.CHAR;
      }
    } else if (seenShort) {
      if (seenUnsigned) {
        type = NumberT.U_SHORT;
      } else {
        type = NumberT.SHORT;
      }
    } else if (seenFloat) {
      if (seenComplex) {
        type = NumberT.FLOAT_COMPLEX;
      } else {
        type = NumberT.FLOAT;
      }
    } else if (seenDouble) {
      if (0 < longCount) {
        if (seenComplex) {
          type = NumberT.LONG_DOUBLE_COMPLEX;
        } else {
          type = NumberT.LONG_DOUBLE;
        }
      } else {
        if (seenComplex) {
          type = NumberT.DOUBLE_COMPLEX;
        } else {
          type = NumberT.DOUBLE;
        }
      }
    } else if (1 == longCount) {
      if (seenUnsigned) {
        type = NumberT.U_LONG;
      } else {
        type = NumberT.LONG;
      }
    } else if (1 < longCount) {
      if (seenUnsigned) {
        type = NumberT.U_LONG_LONG;
      } else {
        type = NumberT.LONG_LONG;
      }
    } else if (seenUnsigned) {
      type = NumberT.U_INT;
    } else if (seenSigned) {
      type = NumberT.S_INT;
    } else if (seenInt) {
      type = NumberT.INT;
    } else {
      type = C.IMPLICIT;
    }

    // Annotate the type.
    if ((! type.hasError()) && (null != attributes)) {
      type = type.annotate().attribute(attributes);
    }

    return type;
  }

  /** Test for previous type. */
  protected boolean hasType() {
    return
      (seenBool || seenChar || seenShort || seenInt || (0 < longCount) ||
       seenFloat || seenDouble || seenComplex ||
       (null != type));
  }

  /** Report error indicating multiple types. */
  protected void multipleTypes() {
    this.setError("multiple data types in declaration specifiers");
  }

  /** Add the specified attribute. */
  protected void add(Attribute att) {
    if (null == attributes) {
      attributes = new ArrayList<Attribute>();
      attributes.add(att);
    } else if (! attributes.contains(att)) {
      attributes.add(att);
    }
  }

  public void setError(String msg) {
    this.error = true;
    this.error_message = msg;
    type = ErrorT.TYPE;
    if (showErrors) {  // showErrors is true
      System.err.println("error in specifiers: " + msg);
    }
  }

  // Get specs.  Gets list of specifiers, checking for type errors.
  // Also need to hoist conditionals around complete type
  // specifiers.  Is it possible to make a hoisting tree-walker?
  // Walk tree, when encountering conditional, fork the spec state
  // and walk both.  No need for merge, since there are two
  // different declarations.
}

/**
 * A helper function to get the specifiers of the value of a component
 * node from the stack.
 *
 * @param subparser The reference to the subparser.
 * @param number The component number.
 * @return The specifiers for the component.
 */
private static Specifiers getSpecsAt(Subparser subparser, int component) {
  Node n = getNodeAt(subparser, component);

  if (n.hasProperty(SPECS)) {
    return (Specifiers) n.getProperty(SPECS);
  } else {
    Specifiers specs = new Specifiers();

    n.setProperty(SPECS, specs);
    return specs;
  }
}

private static void updateSpecs(Subparser subparser,
                                Specifiers new_specs,
                                Object value) {
  updateSpecs(subparser, null, new_specs, value);
}

private static void updateSpecs(Subparser subparser,
                                Specifiers specs,
                                Specifiers new_specs,
                                Object value) {
  if (null == specs) {
    specs = new_specs;
  } else {
    specs = specs.addSpecs(new_specs);
  }

  ((P4Context) subparser.scope).lastSeenType = specs.getType();
  ((Node) value).setProperty(SPECS, specs);
}

private static Specifiers makeUnionSpec(Subparser subparser,
                                        Node tagNode,
                                        Node membersNode,
                                        Node attrsNode) {
  Specifiers specs = new Specifiers();

  return specs;
}

private static Specifiers makeStructSpec(Subparser subparser,
                                         Node tagNode,
                                         Node membersNode,
                                         Node attrsNode) {
  String tag;
  String name;
  if (null == tagNode) {
    // TODO struct tag creation
    /* tag = table.freshName("tag"); */
    tag = "tag(untagged)";
    name = tag;
  } else {
    // TODO check for conditional here
    /* tag = ((Syntax) tagNode.get(0)).toLanguage().getTokenText(); */
    /* name = SymbolTable.toTagName(tag); */
  }

  // TODO remove this once above code is complete
  tag = "tag(untagged)";
  name = tag;

  Type type;

  // TODO struct tag is defined
  /* if (table.current().isDefinedLocally(name)) { */
  /*   final Type t = (Type)table.current().lookupLocally(name); */

  /*   if (! t.isStruct()) { */
  /*     runtime.error("'" + tag + "' defined as wrong kind of tag", n); */
  /*     reportPreviousTag(t); */
  /*     type = ErrorT.TYPE; */
  /*     return; */

  /*   } else if (null != t.toTagged().getMembers()) { */
  /*     runtime.error("redefinition of 'struct " + tag + "'", n); */
  /*     reportPreviousTag(t); */
  /*     type = ErrorT.TYPE; */
  /*     return; */

  /*   } else if (t.hasAttribute(Constants.ATT_DEFINED)) { */
  /*     runtime.error("nested redefinition of 'struct " + tag + "'", n); */
  /*     type = ErrorT.TYPE; */
  /*     return; */

  /*   } else { */
  /*     type = t; */
  /*   } */
  /* } else { */
    // TODO checkNotParameter
    /* checkNotParameter(n, "struct"); */
 
    // Declare the struct so that members can reference it.
    type = new StructT(tag);
    /* table.current().define(name, type); */
  /* } */

  // TODO location
  /* // Update the location. */
  /* type.setLocation(n); */

  // TODO struct attributes
  /* // Update the GCC attributes. */
  /* for (Attribute a : toAttributeList(n.getGeneric(0))) { */
  /*   type.addAttribute(a); */
  /* } */
  /* for (Attribute a : toAttributeList(n.getGeneric(3))) { */
  /*   type.addAttribute(a); */
  /* } */

  // Process the members and update the struct declaration.  Use
  // defined attribute to protect against nested redefinition.
  type.addAttribute(Constants.ATT_DEFINED);
  // TODO struct members
  /* List<VariableT> members = processMembers(n.getGeneric(2), true); */
  List<VariableT> members = null;
  type.toStruct().setMembers(members);
  type.removeAttribute(Constants.ATT_DEFINED);

  Specifiers specs = new Specifiers();
  specs.type = type;

  return specs;
}

/**
 * Check that the tag declaration is not located within a
 * parameter list.  If the declaration is located within a
 * parameter list, this method prints the appropriate warning.
 *
 * @param node The node.
 * @param kind The kind of tag.
 */
private void checkNotParameter(Node node, String kind) {
  // TODO checkNotParameter implementation
  /* if (TMP_SCOPE.equals(table.current().getName())) { */
  /*   final String tag = node.getString(1); */
  /*   final String msg; */
  /*   if (null == tag) { */
  /*     msg = "anonymous " + kind + " declared inside parameter list"; */
  /*   } else { */
  /*     msg = "'" + kind + " " + tag + "' declared inside parameter list"; */
  /*   } */

  /*   runtime.warning(msg, node); */
  /* } */
}

// ---------- Declarators

/* private static String DECL = "superc.p4parser.Declarator"; */

/* private static String NAME = "superc.p4parser.Name"; */

/* private static void setDecl(Object n, Type type) { */
/*   ((Node) n).setProperty(DECL, type); */
/* } */

/* private static Type getDecl(Object n) { */
/*   return ((Type) ((Node) n).getProperty(DECL)); */
/* } */

/* private static void setName(Object n, String name) { */
/*   ((Node) n).setProperty(NAME, name); */
/* } */

/* private static String getName(Object n) { */
/*   return ((String) ((Node) n).getProperty(NAME)); */
/* } */

/* private static void setDecl(Object n, Type type, String name) { */
/*   setDecl(n, type); */
/*   setName(n, name); */
/* } */

/* private static void copyDecl(Subparser subparser, Object value, int from) { */
/*   setDecl(value, (Type) (getNodeAt(subparser, from).getProperty(DECL))); */
/* } */

/* private static void copyName(Subparser subparser, Object value, int from) { */
/*   setName(value, (String) (getNodeAt(subparser, from).getProperty(NAME))); */
/* } */

/* private static void copyDeclName(Subparser subparser, Object value, int from){ */
/*   copyDecl(subparser, value, from); */
/*   copyName(subparser, value, from); */
/* } */
}
