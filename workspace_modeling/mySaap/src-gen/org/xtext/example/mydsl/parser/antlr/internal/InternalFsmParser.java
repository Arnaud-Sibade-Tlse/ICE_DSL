package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.FsmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFsmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'}'", "'State'", "'default'", "'Transition'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalFsmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFsmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFsmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFsm.g"; }



     	private FsmGrammarAccess grammarAccess;

        public InternalFsmParser(TokenStream input, FsmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected FsmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalFsm.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalFsm.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalFsm.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalFsm.g:71:1: ruleStateMachine returns [EObject current=null] : ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_state_4_0= ruleState ) ) | ( (lv_transition_5_0= ruleTransition ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_transition_5_0 = null;



        	enterRule();

        try {
            // InternalFsm.g:77:2: ( ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_state_4_0= ruleState ) ) | ( (lv_transition_5_0= ruleTransition ) ) )* otherlv_6= '}' ) )
            // InternalFsm.g:78:2: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_state_4_0= ruleState ) ) | ( (lv_transition_5_0= ruleTransition ) ) )* otherlv_6= '}' )
            {
            // InternalFsm.g:78:2: ( () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_state_4_0= ruleState ) ) | ( (lv_transition_5_0= ruleTransition ) ) )* otherlv_6= '}' )
            // InternalFsm.g:79:3: () otherlv_1= 'StateMachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_state_4_0= ruleState ) ) | ( (lv_transition_5_0= ruleTransition ) ) )* otherlv_6= '}'
            {
            // InternalFsm.g:79:3: ()
            // InternalFsm.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateMachineAccess().getStateMachineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getStateMachineKeyword_1());
            		
            // InternalFsm.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFsm.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalFsm.g:91:4: (lv_name_2_0= ruleEString )
            // InternalFsm.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Fsm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFsm.g:113:3: ( ( (lv_state_4_0= ruleState ) ) | ( (lv_transition_5_0= ruleTransition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }
                else if ( (LA1_0==16) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFsm.g:114:4: ( (lv_state_4_0= ruleState ) )
            	    {
            	    // InternalFsm.g:114:4: ( (lv_state_4_0= ruleState ) )
            	    // InternalFsm.g:115:5: (lv_state_4_0= ruleState )
            	    {
            	    // InternalFsm.g:115:5: (lv_state_4_0= ruleState )
            	    // InternalFsm.g:116:6: lv_state_4_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getStateMachineAccess().getStateStateParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_state_4_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"state",
            	    							lv_state_4_0,
            	    							"org.xtext.example.mydsl.Fsm.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalFsm.g:134:4: ( (lv_transition_5_0= ruleTransition ) )
            	    {
            	    // InternalFsm.g:134:4: ( (lv_transition_5_0= ruleTransition ) )
            	    // InternalFsm.g:135:5: (lv_transition_5_0= ruleTransition )
            	    {
            	    // InternalFsm.g:135:5: (lv_transition_5_0= ruleTransition )
            	    // InternalFsm.g:136:6: lv_transition_5_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionTransitionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_transition_5_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transition",
            	    							lv_transition_5_0,
            	    							"org.xtext.example.mydsl.Fsm.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalFsm.g:162:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalFsm.g:162:46: (iv_ruleState= ruleState EOF )
            // InternalFsm.g:163:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalFsm.g:169:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ( (lv_default_3_0= 'default' ) )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_default_3_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFsm.g:175:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ( (lv_default_3_0= 'default' ) )? ) )
            // InternalFsm.g:176:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ( (lv_default_3_0= 'default' ) )? )
            {
            // InternalFsm.g:176:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ( (lv_default_3_0= 'default' ) )? )
            // InternalFsm.g:177:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ( (lv_default_3_0= 'default' ) )?
            {
            // InternalFsm.g:177:3: ()
            // InternalFsm.g:178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalFsm.g:188:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFsm.g:189:4: (lv_name_2_0= ruleEString )
            {
            // InternalFsm.g:189:4: (lv_name_2_0= ruleEString )
            // InternalFsm.g:190:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Fsm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFsm.g:207:3: ( (lv_default_3_0= 'default' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalFsm.g:208:4: (lv_default_3_0= 'default' )
                    {
                    // InternalFsm.g:208:4: (lv_default_3_0= 'default' )
                    // InternalFsm.g:209:5: lv_default_3_0= 'default'
                    {
                    lv_default_3_0=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_default_3_0, grammarAccess.getStateAccess().getDefaultDefaultKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "default", true, "default");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalFsm.g:225:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalFsm.g:225:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalFsm.g:226:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalFsm.g:232:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) otherlv_5= '.' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalFsm.g:238:2: ( ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) otherlv_5= '.' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalFsm.g:239:2: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) otherlv_5= '.' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalFsm.g:239:2: ( () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) otherlv_5= '.' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalFsm.g:240:3: () otherlv_1= 'Transition' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( ruleEString ) ) otherlv_5= '.' ( ( ruleEString ) ) otherlv_7= '}'
            {
            // InternalFsm.g:240:3: ()
            // InternalFsm.g:241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalFsm.g:251:3: ( (lv_name_2_0= ruleEString ) )
            // InternalFsm.g:252:4: (lv_name_2_0= ruleEString )
            {
            // InternalFsm.g:252:4: (lv_name_2_0= ruleEString )
            // InternalFsm.g:253:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.Fsm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalFsm.g:274:3: ( ( ruleEString ) )
            // InternalFsm.g:275:4: ( ruleEString )
            {
            // InternalFsm.g:275:4: ( ruleEString )
            // InternalFsm.g:276:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getFromStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getFullStopKeyword_5());
            		
            // InternalFsm.g:294:3: ( ( ruleEString ) )
            // InternalFsm.g:295:4: ( ruleEString )
            {
            // InternalFsm.g:295:4: ( ruleEString )
            // InternalFsm.g:296:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getToStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // InternalFsm.g:318:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFsm.g:318:47: (iv_ruleEString= ruleEString EOF )
            // InternalFsm.g:319:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFsm.g:325:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFsm.g:331:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFsm.g:332:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFsm.g:332:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFsm.g:333:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFsm.g:341:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});

}