package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProblemSpecification'", "'{'", "'WorldModel'", "':'", "'TasksModel'", "','", "'RobotsModel'", "'Mission'", "'}'", "'('", "'x'", "'y'", "'describes'", "')'", "'distance'", "'to'", "'is'", "'has'", "'success'", "'rate:'", "'%'", "'robots'", "'robot'", "'needed'", "'at'", "'location'", "'retries'", "'allowed'", "'subtasks'", "'['", "']'", "'constraint:'", "'ordered'", "'consecutive'", "'initial'", "'position'", "'velocity'", "'with'", "'capabilities'", "'-required'", "'time:'", "'objectives:'", "'constraints:'", "'parameters:'", "'numAllocation:'", "'population:'", "'evaluation:'", "'atomic'", "'task'", "'compound'", "'rate'", "'of'", "'greater'", "'than'", "'all'", "'work'", "'in'", "'mission'", "'allocate'", "'single'", "'tasks'", "'closest'", "'limit'", "'max'", "'number'", "'per'", "'-'", "'.'", "'E'", "'e'", "'minimiseIdle'", "'minimiseTravel'", "'maximiseSuccess'", "'lower'", "'end before'", "'start after'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ProblemSpecification";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProblemSpecification"
    // InternalMyDsl.g:65:1: entryRuleProblemSpecification returns [EObject current=null] : iv_ruleProblemSpecification= ruleProblemSpecification EOF ;
    public final EObject entryRuleProblemSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProblemSpecification = null;


        try {
            // InternalMyDsl.g:65:61: (iv_ruleProblemSpecification= ruleProblemSpecification EOF )
            // InternalMyDsl.g:66:2: iv_ruleProblemSpecification= ruleProblemSpecification EOF
            {
             newCompositeNode(grammarAccess.getProblemSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProblemSpecification=ruleProblemSpecification();

            state._fsp--;

             current =iv_ruleProblemSpecification; 
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
    // $ANTLR end "entryRuleProblemSpecification"


    // $ANTLR start "ruleProblemSpecification"
    // InternalMyDsl.g:72:1: ruleProblemSpecification returns [EObject current=null] : (otherlv_0= 'ProblemSpecification' otherlv_1= '{' otherlv_2= 'WorldModel' otherlv_3= ':' ( (lv_worldModel_4_0= ruleWorldModel ) ) ( (lv_worldModel_5_0= ruleWorldModel ) )* otherlv_6= 'TasksModel' otherlv_7= ':' ( (lv_tasksModel_8_0= ruleTasksModel ) ) (otherlv_9= ',' ( (lv_tasksModel_10_0= ruleTasksModel ) ) )* otherlv_11= 'RobotsModel' otherlv_12= ':' ( (lv_robotsModel_13_0= ruleRobot ) ) (otherlv_14= ',' ( (lv_robotsModel_15_0= ruleRobot ) ) )* otherlv_16= 'Mission' otherlv_17= ':' ( (lv_mission_18_0= ruleMission ) ) (otherlv_19= ',' ( (lv_mission_20_0= ruleMission ) ) )* otherlv_21= '}' ) ;
    public final EObject ruleProblemSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_worldModel_4_0 = null;

        EObject lv_worldModel_5_0 = null;

        EObject lv_tasksModel_8_0 = null;

        EObject lv_tasksModel_10_0 = null;

        EObject lv_robotsModel_13_0 = null;

        EObject lv_robotsModel_15_0 = null;

        EObject lv_mission_18_0 = null;

        EObject lv_mission_20_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'ProblemSpecification' otherlv_1= '{' otherlv_2= 'WorldModel' otherlv_3= ':' ( (lv_worldModel_4_0= ruleWorldModel ) ) ( (lv_worldModel_5_0= ruleWorldModel ) )* otherlv_6= 'TasksModel' otherlv_7= ':' ( (lv_tasksModel_8_0= ruleTasksModel ) ) (otherlv_9= ',' ( (lv_tasksModel_10_0= ruleTasksModel ) ) )* otherlv_11= 'RobotsModel' otherlv_12= ':' ( (lv_robotsModel_13_0= ruleRobot ) ) (otherlv_14= ',' ( (lv_robotsModel_15_0= ruleRobot ) ) )* otherlv_16= 'Mission' otherlv_17= ':' ( (lv_mission_18_0= ruleMission ) ) (otherlv_19= ',' ( (lv_mission_20_0= ruleMission ) ) )* otherlv_21= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'ProblemSpecification' otherlv_1= '{' otherlv_2= 'WorldModel' otherlv_3= ':' ( (lv_worldModel_4_0= ruleWorldModel ) ) ( (lv_worldModel_5_0= ruleWorldModel ) )* otherlv_6= 'TasksModel' otherlv_7= ':' ( (lv_tasksModel_8_0= ruleTasksModel ) ) (otherlv_9= ',' ( (lv_tasksModel_10_0= ruleTasksModel ) ) )* otherlv_11= 'RobotsModel' otherlv_12= ':' ( (lv_robotsModel_13_0= ruleRobot ) ) (otherlv_14= ',' ( (lv_robotsModel_15_0= ruleRobot ) ) )* otherlv_16= 'Mission' otherlv_17= ':' ( (lv_mission_18_0= ruleMission ) ) (otherlv_19= ',' ( (lv_mission_20_0= ruleMission ) ) )* otherlv_21= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'ProblemSpecification' otherlv_1= '{' otherlv_2= 'WorldModel' otherlv_3= ':' ( (lv_worldModel_4_0= ruleWorldModel ) ) ( (lv_worldModel_5_0= ruleWorldModel ) )* otherlv_6= 'TasksModel' otherlv_7= ':' ( (lv_tasksModel_8_0= ruleTasksModel ) ) (otherlv_9= ',' ( (lv_tasksModel_10_0= ruleTasksModel ) ) )* otherlv_11= 'RobotsModel' otherlv_12= ':' ( (lv_robotsModel_13_0= ruleRobot ) ) (otherlv_14= ',' ( (lv_robotsModel_15_0= ruleRobot ) ) )* otherlv_16= 'Mission' otherlv_17= ':' ( (lv_mission_18_0= ruleMission ) ) (otherlv_19= ',' ( (lv_mission_20_0= ruleMission ) ) )* otherlv_21= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'ProblemSpecification' otherlv_1= '{' otherlv_2= 'WorldModel' otherlv_3= ':' ( (lv_worldModel_4_0= ruleWorldModel ) ) ( (lv_worldModel_5_0= ruleWorldModel ) )* otherlv_6= 'TasksModel' otherlv_7= ':' ( (lv_tasksModel_8_0= ruleTasksModel ) ) (otherlv_9= ',' ( (lv_tasksModel_10_0= ruleTasksModel ) ) )* otherlv_11= 'RobotsModel' otherlv_12= ':' ( (lv_robotsModel_13_0= ruleRobot ) ) (otherlv_14= ',' ( (lv_robotsModel_15_0= ruleRobot ) ) )* otherlv_16= 'Mission' otherlv_17= ':' ( (lv_mission_18_0= ruleMission ) ) (otherlv_19= ',' ( (lv_mission_20_0= ruleMission ) ) )* otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProblemSpecificationAccess().getProblemSpecificationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getProblemSpecificationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getProblemSpecificationAccess().getWorldModelKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getProblemSpecificationAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:96:3: ( (lv_worldModel_4_0= ruleWorldModel ) )
            // InternalMyDsl.g:97:4: (lv_worldModel_4_0= ruleWorldModel )
            {
            // InternalMyDsl.g:97:4: (lv_worldModel_4_0= ruleWorldModel )
            // InternalMyDsl.g:98:5: lv_worldModel_4_0= ruleWorldModel
            {

            					newCompositeNode(grammarAccess.getProblemSpecificationAccess().getWorldModelWorldModelParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_worldModel_4_0=ruleWorldModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProblemSpecificationRule());
            					}
            					add(
            						current,
            						"worldModel",
            						lv_worldModel_4_0,
            						"org.xtext.example.mydsl.MyDsl.WorldModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:115:3: ( (lv_worldModel_5_0= ruleWorldModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:116:4: (lv_worldModel_5_0= ruleWorldModel )
            	    {
            	    // InternalMyDsl.g:116:4: (lv_worldModel_5_0= ruleWorldModel )
            	    // InternalMyDsl.g:117:5: lv_worldModel_5_0= ruleWorldModel
            	    {

            	    					newCompositeNode(grammarAccess.getProblemSpecificationAccess().getWorldModelWorldModelParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_worldModel_5_0=ruleWorldModel();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProblemSpecificationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"worldModel",
            	    						lv_worldModel_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.WorldModel");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getProblemSpecificationAccess().getTasksModelKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getProblemSpecificationAccess().getColonKeyword_7());
            		
            // InternalMyDsl.g:142:3: ( (lv_tasksModel_8_0= ruleTasksModel ) )
            // InternalMyDsl.g:143:4: (lv_tasksModel_8_0= ruleTasksModel )
            {
            // InternalMyDsl.g:143:4: (lv_tasksModel_8_0= ruleTasksModel )
            // InternalMyDsl.g:144:5: lv_tasksModel_8_0= ruleTasksModel
            {

            					newCompositeNode(grammarAccess.getProblemSpecificationAccess().getTasksModelTasksModelParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_tasksModel_8_0=ruleTasksModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProblemSpecificationRule());
            					}
            					add(
            						current,
            						"tasksModel",
            						lv_tasksModel_8_0,
            						"org.xtext.example.mydsl.MyDsl.TasksModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:161:3: (otherlv_9= ',' ( (lv_tasksModel_10_0= ruleTasksModel ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:162:4: otherlv_9= ',' ( (lv_tasksModel_10_0= ruleTasksModel ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_9, grammarAccess.getProblemSpecificationAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMyDsl.g:166:4: ( (lv_tasksModel_10_0= ruleTasksModel ) )
            	    // InternalMyDsl.g:167:5: (lv_tasksModel_10_0= ruleTasksModel )
            	    {
            	    // InternalMyDsl.g:167:5: (lv_tasksModel_10_0= ruleTasksModel )
            	    // InternalMyDsl.g:168:6: lv_tasksModel_10_0= ruleTasksModel
            	    {

            	    						newCompositeNode(grammarAccess.getProblemSpecificationAccess().getTasksModelTasksModelParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_tasksModel_10_0=ruleTasksModel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProblemSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasksModel",
            	    							lv_tasksModel_10_0,
            	    							"org.xtext.example.mydsl.MyDsl.TasksModel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_11=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getProblemSpecificationAccess().getRobotsModelKeyword_10());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_12, grammarAccess.getProblemSpecificationAccess().getColonKeyword_11());
            		
            // InternalMyDsl.g:194:3: ( (lv_robotsModel_13_0= ruleRobot ) )
            // InternalMyDsl.g:195:4: (lv_robotsModel_13_0= ruleRobot )
            {
            // InternalMyDsl.g:195:4: (lv_robotsModel_13_0= ruleRobot )
            // InternalMyDsl.g:196:5: lv_robotsModel_13_0= ruleRobot
            {

            					newCompositeNode(grammarAccess.getProblemSpecificationAccess().getRobotsModelRobotParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_10);
            lv_robotsModel_13_0=ruleRobot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProblemSpecificationRule());
            					}
            					add(
            						current,
            						"robotsModel",
            						lv_robotsModel_13_0,
            						"org.xtext.example.mydsl.MyDsl.Robot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:213:3: (otherlv_14= ',' ( (lv_robotsModel_15_0= ruleRobot ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:214:4: otherlv_14= ',' ( (lv_robotsModel_15_0= ruleRobot ) )
            	    {
            	    otherlv_14=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_14, grammarAccess.getProblemSpecificationAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:218:4: ( (lv_robotsModel_15_0= ruleRobot ) )
            	    // InternalMyDsl.g:219:5: (lv_robotsModel_15_0= ruleRobot )
            	    {
            	    // InternalMyDsl.g:219:5: (lv_robotsModel_15_0= ruleRobot )
            	    // InternalMyDsl.g:220:6: lv_robotsModel_15_0= ruleRobot
            	    {

            	    						newCompositeNode(grammarAccess.getProblemSpecificationAccess().getRobotsModelRobotParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_robotsModel_15_0=ruleRobot();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProblemSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"robotsModel",
            	    							lv_robotsModel_15_0,
            	    							"org.xtext.example.mydsl.MyDsl.Robot");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_16=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_16, grammarAccess.getProblemSpecificationAccess().getMissionKeyword_14());
            		
            otherlv_17=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getProblemSpecificationAccess().getColonKeyword_15());
            		
            // InternalMyDsl.g:246:3: ( (lv_mission_18_0= ruleMission ) )
            // InternalMyDsl.g:247:4: (lv_mission_18_0= ruleMission )
            {
            // InternalMyDsl.g:247:4: (lv_mission_18_0= ruleMission )
            // InternalMyDsl.g:248:5: lv_mission_18_0= ruleMission
            {

            					newCompositeNode(grammarAccess.getProblemSpecificationAccess().getMissionMissionParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_11);
            lv_mission_18_0=ruleMission();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProblemSpecificationRule());
            					}
            					add(
            						current,
            						"mission",
            						lv_mission_18_0,
            						"org.xtext.example.mydsl.MyDsl.Mission");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:265:3: (otherlv_19= ',' ( (lv_mission_20_0= ruleMission ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:266:4: otherlv_19= ',' ( (lv_mission_20_0= ruleMission ) )
            	    {
            	    otherlv_19=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_19, grammarAccess.getProblemSpecificationAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalMyDsl.g:270:4: ( (lv_mission_20_0= ruleMission ) )
            	    // InternalMyDsl.g:271:5: (lv_mission_20_0= ruleMission )
            	    {
            	    // InternalMyDsl.g:271:5: (lv_mission_20_0= ruleMission )
            	    // InternalMyDsl.g:272:6: lv_mission_20_0= ruleMission
            	    {

            	    						newCompositeNode(grammarAccess.getProblemSpecificationAccess().getMissionMissionParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_mission_20_0=ruleMission();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProblemSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"mission",
            	    							lv_mission_20_0,
            	    							"org.xtext.example.mydsl.MyDsl.Mission");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getProblemSpecificationAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleProblemSpecification"


    // $ANTLR start "entryRuleWorldModel"
    // InternalMyDsl.g:298:1: entryRuleWorldModel returns [EObject current=null] : iv_ruleWorldModel= ruleWorldModel EOF ;
    public final EObject entryRuleWorldModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorldModel = null;


        try {
            // InternalMyDsl.g:298:51: (iv_ruleWorldModel= ruleWorldModel EOF )
            // InternalMyDsl.g:299:2: iv_ruleWorldModel= ruleWorldModel EOF
            {
             newCompositeNode(grammarAccess.getWorldModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorldModel=ruleWorldModel();

            state._fsp--;

             current =iv_ruleWorldModel; 
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
    // $ANTLR end "entryRuleWorldModel"


    // $ANTLR start "ruleWorldModel"
    // InternalMyDsl.g:305:1: ruleWorldModel returns [EObject current=null] : (this_Location_0= ruleLocation | this_Paths_1= rulePaths ) ;
    public final EObject ruleWorldModel() throws RecognitionException {
        EObject current = null;

        EObject this_Location_0 = null;

        EObject this_Paths_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:311:2: ( (this_Location_0= ruleLocation | this_Paths_1= rulePaths ) )
            // InternalMyDsl.g:312:2: (this_Location_0= ruleLocation | this_Paths_1= rulePaths )
            {
            // InternalMyDsl.g:312:2: (this_Location_0= ruleLocation | this_Paths_1= rulePaths )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:313:3: this_Location_0= ruleLocation
                    {

                    			newCompositeNode(grammarAccess.getWorldModelAccess().getLocationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Location_0=ruleLocation();

                    state._fsp--;


                    			current = this_Location_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:322:3: this_Paths_1= rulePaths
                    {

                    			newCompositeNode(grammarAccess.getWorldModelAccess().getPathsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Paths_1=rulePaths();

                    state._fsp--;


                    			current = this_Paths_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleWorldModel"


    // $ANTLR start "entryRuleLocation"
    // InternalMyDsl.g:334:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalMyDsl.g:334:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalMyDsl.g:335:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalMyDsl.g:341:1: ruleLocation returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= ruleEDouble ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleEDouble ) ) (otherlv_7= ',' otherlv_8= 'describes' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ')' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_x_4_0 = null;

        AntlrDatatypeRuleToken lv_y_6_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:347:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= ruleEDouble ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleEDouble ) ) (otherlv_7= ',' otherlv_8= 'describes' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ')' ) )
            // InternalMyDsl.g:348:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= ruleEDouble ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleEDouble ) ) (otherlv_7= ',' otherlv_8= 'describes' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ')' )
            {
            // InternalMyDsl.g:348:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= ruleEDouble ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleEDouble ) ) (otherlv_7= ',' otherlv_8= 'describes' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ')' )
            // InternalMyDsl.g:349:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= '(' otherlv_3= 'x' ( (lv_x_4_0= ruleEDouble ) ) otherlv_5= 'y' ( (lv_y_6_0= ruleEDouble ) ) (otherlv_7= ',' otherlv_8= 'describes' ( (lv_description_9_0= ruleEString ) ) )? otherlv_10= ')'
            {
            // InternalMyDsl.g:349:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:350:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:350:4: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:351:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getLocationAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getXKeyword_3());
            		
            // InternalMyDsl.g:380:3: ( (lv_x_4_0= ruleEDouble ) )
            // InternalMyDsl.g:381:4: (lv_x_4_0= ruleEDouble )
            {
            // InternalMyDsl.g:381:4: (lv_x_4_0= ruleEDouble )
            // InternalMyDsl.g:382:5: lv_x_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getXEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_x_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getYKeyword_5());
            		
            // InternalMyDsl.g:403:3: ( (lv_y_6_0= ruleEDouble ) )
            // InternalMyDsl.g:404:4: (lv_y_6_0= ruleEDouble )
            {
            // InternalMyDsl.g:404:4: (lv_y_6_0= ruleEDouble )
            // InternalMyDsl.g:405:5: lv_y_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getYEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_y_6_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_6_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:422:3: (otherlv_7= ',' otherlv_8= 'describes' ( (lv_description_9_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:423:4: otherlv_7= ',' otherlv_8= 'describes' ( (lv_description_9_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getLocationAccess().getCommaKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,23,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getLocationAccess().getDescribesKeyword_7_1());
                    			
                    // InternalMyDsl.g:431:4: ( (lv_description_9_0= ruleEString ) )
                    // InternalMyDsl.g:432:5: (lv_description_9_0= ruleEString )
                    {
                    // InternalMyDsl.g:432:5: (lv_description_9_0= ruleEString )
                    // InternalMyDsl.g:433:6: lv_description_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getLocationAccess().getDescriptionEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_description_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocationRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLocationAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRulePaths"
    // InternalMyDsl.g:459:1: entryRulePaths returns [EObject current=null] : iv_rulePaths= rulePaths EOF ;
    public final EObject entryRulePaths() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaths = null;


        try {
            // InternalMyDsl.g:459:46: (iv_rulePaths= rulePaths EOF )
            // InternalMyDsl.g:460:2: iv_rulePaths= rulePaths EOF
            {
             newCompositeNode(grammarAccess.getPathsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaths=rulePaths();

            state._fsp--;

             current =iv_rulePaths; 
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
    // $ANTLR end "entryRulePaths"


    // $ANTLR start "rulePaths"
    // InternalMyDsl.g:466:1: rulePaths returns [EObject current=null] : (otherlv_0= 'distance' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'is' ( (lv_distance_5_0= ruleEDouble ) ) (otherlv_6= 'has' otherlv_7= 'success' otherlv_8= 'rate:' ( (lv_success_9_0= ruleEDouble ) ) otherlv_10= '%' )? ) ;
    public final EObject rulePaths() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_distance_5_0 = null;

        AntlrDatatypeRuleToken lv_success_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:472:2: ( (otherlv_0= 'distance' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'is' ( (lv_distance_5_0= ruleEDouble ) ) (otherlv_6= 'has' otherlv_7= 'success' otherlv_8= 'rate:' ( (lv_success_9_0= ruleEDouble ) ) otherlv_10= '%' )? ) )
            // InternalMyDsl.g:473:2: (otherlv_0= 'distance' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'is' ( (lv_distance_5_0= ruleEDouble ) ) (otherlv_6= 'has' otherlv_7= 'success' otherlv_8= 'rate:' ( (lv_success_9_0= ruleEDouble ) ) otherlv_10= '%' )? )
            {
            // InternalMyDsl.g:473:2: (otherlv_0= 'distance' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'is' ( (lv_distance_5_0= ruleEDouble ) ) (otherlv_6= 'has' otherlv_7= 'success' otherlv_8= 'rate:' ( (lv_success_9_0= ruleEDouble ) ) otherlv_10= '%' )? )
            // InternalMyDsl.g:474:3: otherlv_0= 'distance' ( ( ruleEString ) ) otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'is' ( (lv_distance_5_0= ruleEDouble ) ) (otherlv_6= 'has' otherlv_7= 'success' otherlv_8= 'rate:' ( (lv_success_9_0= ruleEDouble ) ) otherlv_10= '%' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPathsAccess().getDistanceKeyword_0());
            		
            // InternalMyDsl.g:478:3: ( ( ruleEString ) )
            // InternalMyDsl.g:479:4: ( ruleEString )
            {
            // InternalMyDsl.g:479:4: ( ruleEString )
            // InternalMyDsl.g:480:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPathsAccess().getLoc1LocationCrossReference_1_0());
            				
            pushFollow(FOLLOW_19);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPathsAccess().getToKeyword_2());
            		
            // InternalMyDsl.g:498:3: ( ( ruleEString ) )
            // InternalMyDsl.g:499:4: ( ruleEString )
            {
            // InternalMyDsl.g:499:4: ( ruleEString )
            // InternalMyDsl.g:500:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPathsRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPathsAccess().getLoc2LocationCrossReference_3_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getPathsAccess().getIsKeyword_4());
            		
            // InternalMyDsl.g:518:3: ( (lv_distance_5_0= ruleEDouble ) )
            // InternalMyDsl.g:519:4: (lv_distance_5_0= ruleEDouble )
            {
            // InternalMyDsl.g:519:4: (lv_distance_5_0= ruleEDouble )
            // InternalMyDsl.g:520:5: lv_distance_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPathsAccess().getDistanceEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_distance_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPathsRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_5_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:537:3: (otherlv_6= 'has' otherlv_7= 'success' otherlv_8= 'rate:' ( (lv_success_9_0= ruleEDouble ) ) otherlv_10= '%' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:538:4: otherlv_6= 'has' otherlv_7= 'success' otherlv_8= 'rate:' ( (lv_success_9_0= ruleEDouble ) ) otherlv_10= '%'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getPathsAccess().getHasKeyword_6_0());
                    			
                    otherlv_7=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getPathsAccess().getSuccessKeyword_6_1());
                    			
                    otherlv_8=(Token)match(input,30,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getPathsAccess().getRateKeyword_6_2());
                    			
                    // InternalMyDsl.g:550:4: ( (lv_success_9_0= ruleEDouble ) )
                    // InternalMyDsl.g:551:5: (lv_success_9_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:551:5: (lv_success_9_0= ruleEDouble )
                    // InternalMyDsl.g:552:6: lv_success_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getPathsAccess().getSuccessEDoubleParserRuleCall_6_3_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_success_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPathsRule());
                    						}
                    						set(
                    							current,
                    							"success",
                    							lv_success_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getPathsAccess().getPercentSignKeyword_6_4());
                    			

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
    // $ANTLR end "rulePaths"


    // $ANTLR start "entryRuleTasksModel"
    // InternalMyDsl.g:578:1: entryRuleTasksModel returns [EObject current=null] : iv_ruleTasksModel= ruleTasksModel EOF ;
    public final EObject entryRuleTasksModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTasksModel = null;


        try {
            // InternalMyDsl.g:578:51: (iv_ruleTasksModel= ruleTasksModel EOF )
            // InternalMyDsl.g:579:2: iv_ruleTasksModel= ruleTasksModel EOF
            {
             newCompositeNode(grammarAccess.getTasksModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTasksModel=ruleTasksModel();

            state._fsp--;

             current =iv_ruleTasksModel; 
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
    // $ANTLR end "entryRuleTasksModel"


    // $ANTLR start "ruleTasksModel"
    // InternalMyDsl.g:585:1: ruleTasksModel returns [EObject current=null] : (this_AtomicTask_0= ruleAtomicTask | this_CompoundTask_1= ruleCompoundTask ) ;
    public final EObject ruleTasksModel() throws RecognitionException {
        EObject current = null;

        EObject this_AtomicTask_0 = null;

        EObject this_CompoundTask_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:591:2: ( (this_AtomicTask_0= ruleAtomicTask | this_CompoundTask_1= ruleCompoundTask ) )
            // InternalMyDsl.g:592:2: (this_AtomicTask_0= ruleAtomicTask | this_CompoundTask_1= ruleCompoundTask )
            {
            // InternalMyDsl.g:592:2: (this_AtomicTask_0= ruleAtomicTask | this_CompoundTask_1= ruleCompoundTask )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==14) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==RULE_INT||LA8_3==77) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==39) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==14) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==RULE_INT||LA8_3==77) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==39) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:593:3: this_AtomicTask_0= ruleAtomicTask
                    {

                    			newCompositeNode(grammarAccess.getTasksModelAccess().getAtomicTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicTask_0=ruleAtomicTask();

                    state._fsp--;


                    			current = this_AtomicTask_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:602:3: this_CompoundTask_1= ruleCompoundTask
                    {

                    			newCompositeNode(grammarAccess.getTasksModelAccess().getCompoundTaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompoundTask_1=ruleCompoundTask();

                    state._fsp--;


                    			current = this_CompoundTask_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleTasksModel"


    // $ANTLR start "entryRuleAtomicTask"
    // InternalMyDsl.g:614:1: entryRuleAtomicTask returns [EObject current=null] : iv_ruleAtomicTask= ruleAtomicTask EOF ;
    public final EObject entryRuleAtomicTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicTask = null;


        try {
            // InternalMyDsl.g:614:51: (iv_ruleAtomicTask= ruleAtomicTask EOF )
            // InternalMyDsl.g:615:2: iv_ruleAtomicTask= ruleAtomicTask EOF
            {
             newCompositeNode(grammarAccess.getAtomicTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicTask=ruleAtomicTask();

            state._fsp--;

             current =iv_ruleAtomicTask; 
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
    // $ANTLR end "entryRuleAtomicTask"


    // $ANTLR start "ruleAtomicTask"
    // InternalMyDsl.g:621:1: ruleAtomicTask returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_robots_2_0= ruleEInt ) ) (otherlv_3= 'robots' | otherlv_4= 'robot' ) otherlv_5= 'needed' (otherlv_6= 'at' otherlv_7= 'location' ( ( ruleEString ) ) )? (otherlv_9= ',' ( (lv_retry_10_0= ruleEInt ) ) otherlv_11= 'retries' otherlv_12= 'allowed' )? ) ;
    public final EObject ruleAtomicTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_robots_2_0 = null;

        AntlrDatatypeRuleToken lv_retry_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:627:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_robots_2_0= ruleEInt ) ) (otherlv_3= 'robots' | otherlv_4= 'robot' ) otherlv_5= 'needed' (otherlv_6= 'at' otherlv_7= 'location' ( ( ruleEString ) ) )? (otherlv_9= ',' ( (lv_retry_10_0= ruleEInt ) ) otherlv_11= 'retries' otherlv_12= 'allowed' )? ) )
            // InternalMyDsl.g:628:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_robots_2_0= ruleEInt ) ) (otherlv_3= 'robots' | otherlv_4= 'robot' ) otherlv_5= 'needed' (otherlv_6= 'at' otherlv_7= 'location' ( ( ruleEString ) ) )? (otherlv_9= ',' ( (lv_retry_10_0= ruleEInt ) ) otherlv_11= 'retries' otherlv_12= 'allowed' )? )
            {
            // InternalMyDsl.g:628:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_robots_2_0= ruleEInt ) ) (otherlv_3= 'robots' | otherlv_4= 'robot' ) otherlv_5= 'needed' (otherlv_6= 'at' otherlv_7= 'location' ( ( ruleEString ) ) )? (otherlv_9= ',' ( (lv_retry_10_0= ruleEInt ) ) otherlv_11= 'retries' otherlv_12= 'allowed' )? )
            // InternalMyDsl.g:629:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_robots_2_0= ruleEInt ) ) (otherlv_3= 'robots' | otherlv_4= 'robot' ) otherlv_5= 'needed' (otherlv_6= 'at' otherlv_7= 'location' ( ( ruleEString ) ) )? (otherlv_9= ',' ( (lv_retry_10_0= ruleEInt ) ) otherlv_11= 'retries' otherlv_12= 'allowed' )?
            {
            // InternalMyDsl.g:629:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:630:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:630:4: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:631:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtomicTaskAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicTaskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicTaskAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:652:3: ( (lv_robots_2_0= ruleEInt ) )
            // InternalMyDsl.g:653:4: (lv_robots_2_0= ruleEInt )
            {
            // InternalMyDsl.g:653:4: (lv_robots_2_0= ruleEInt )
            // InternalMyDsl.g:654:5: lv_robots_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAtomicTaskAccess().getRobotsEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_robots_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicTaskRule());
            					}
            					set(
            						current,
            						"robots",
            						lv_robots_2_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:671:3: (otherlv_3= 'robots' | otherlv_4= 'robot' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:672:4: otherlv_3= 'robots'
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomicTaskAccess().getRobotsKeyword_3_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:677:4: otherlv_4= 'robot'
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomicTaskAccess().getRobotKeyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_5, grammarAccess.getAtomicTaskAccess().getNeededKeyword_4());
            		
            // InternalMyDsl.g:686:3: (otherlv_6= 'at' otherlv_7= 'location' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==35) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:687:4: otherlv_6= 'at' otherlv_7= 'location' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_29); 

                    				newLeafNode(otherlv_6, grammarAccess.getAtomicTaskAccess().getAtKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAtomicTaskAccess().getLocationKeyword_5_1());
                    			
                    // InternalMyDsl.g:695:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:696:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:696:5: ( ruleEString )
                    // InternalMyDsl.g:697:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicTaskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicTaskAccess().getLocLocationCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:712:3: (otherlv_9= ',' ( (lv_retry_10_0= ruleEInt ) ) otherlv_11= 'retries' otherlv_12= 'allowed' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_INT||LA11_1==77) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:713:4: otherlv_9= ',' ( (lv_retry_10_0= ruleEInt ) ) otherlv_11= 'retries' otherlv_12= 'allowed'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getAtomicTaskAccess().getCommaKeyword_6_0());
                    			
                    // InternalMyDsl.g:717:4: ( (lv_retry_10_0= ruleEInt ) )
                    // InternalMyDsl.g:718:5: (lv_retry_10_0= ruleEInt )
                    {
                    // InternalMyDsl.g:718:5: (lv_retry_10_0= ruleEInt )
                    // InternalMyDsl.g:719:6: lv_retry_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAtomicTaskAccess().getRetryEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_retry_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicTaskRule());
                    						}
                    						set(
                    							current,
                    							"retry",
                    							lv_retry_10_0,
                    							"org.xtext.example.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,37,FOLLOW_32); 

                    				newLeafNode(otherlv_11, grammarAccess.getAtomicTaskAccess().getRetriesKeyword_6_2());
                    			
                    otherlv_12=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getAtomicTaskAccess().getAllowedKeyword_6_3());
                    			

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
    // $ANTLR end "ruleAtomicTask"


    // $ANTLR start "entryRuleCompoundTask"
    // InternalMyDsl.g:749:1: entryRuleCompoundTask returns [EObject current=null] : iv_ruleCompoundTask= ruleCompoundTask EOF ;
    public final EObject entryRuleCompoundTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompoundTask = null;


        try {
            // InternalMyDsl.g:749:53: (iv_ruleCompoundTask= ruleCompoundTask EOF )
            // InternalMyDsl.g:750:2: iv_ruleCompoundTask= ruleCompoundTask EOF
            {
             newCompositeNode(grammarAccess.getCompoundTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompoundTask=ruleCompoundTask();

            state._fsp--;

             current =iv_ruleCompoundTask; 
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
    // $ANTLR end "entryRuleCompoundTask"


    // $ANTLR start "ruleCompoundTask"
    // InternalMyDsl.g:756:1: ruleCompoundTask returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'subtasks' otherlv_3= '[' ( ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ']' ( (otherlv_8= 'constraint:' ( (lv_ordered_9_0= 'ordered' ) ) ) | (otherlv_10= 'constraint:' ( (lv_consecutive_11_0= 'consecutive' ) ) ) )? ) ;
    public final EObject ruleCompoundTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_ordered_9_0=null;
        Token otherlv_10=null;
        Token lv_consecutive_11_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:762:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'subtasks' otherlv_3= '[' ( ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ']' ( (otherlv_8= 'constraint:' ( (lv_ordered_9_0= 'ordered' ) ) ) | (otherlv_10= 'constraint:' ( (lv_consecutive_11_0= 'consecutive' ) ) ) )? ) )
            // InternalMyDsl.g:763:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'subtasks' otherlv_3= '[' ( ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ']' ( (otherlv_8= 'constraint:' ( (lv_ordered_9_0= 'ordered' ) ) ) | (otherlv_10= 'constraint:' ( (lv_consecutive_11_0= 'consecutive' ) ) ) )? )
            {
            // InternalMyDsl.g:763:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'subtasks' otherlv_3= '[' ( ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ']' ( (otherlv_8= 'constraint:' ( (lv_ordered_9_0= 'ordered' ) ) ) | (otherlv_10= 'constraint:' ( (lv_consecutive_11_0= 'consecutive' ) ) ) )? )
            // InternalMyDsl.g:764:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'subtasks' otherlv_3= '[' ( ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )? otherlv_7= ']' ( (otherlv_8= 'constraint:' ( (lv_ordered_9_0= 'ordered' ) ) ) | (otherlv_10= 'constraint:' ( (lv_consecutive_11_0= 'consecutive' ) ) ) )?
            {
            // InternalMyDsl.g:764:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:765:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:765:4: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:766:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompoundTaskAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompoundTaskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getCompoundTaskAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getCompoundTaskAccess().getSubtasksKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getCompoundTaskAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalMyDsl.g:795:3: ( ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:796:4: ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )*
                    {
                    // InternalMyDsl.g:796:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:797:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:797:5: ( ruleEString )
                    // InternalMyDsl.g:798:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompoundTaskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompoundTaskAccess().getCanDoTaskTasksModelCrossReference_4_0_0());
                    					
                    pushFollow(FOLLOW_36);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:812:4: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:813:5: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getCompoundTaskAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalMyDsl.g:817:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:818:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:818:6: ( ruleEString )
                    	    // InternalMyDsl.g:819:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCompoundTaskRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCompoundTaskAccess().getCanDoTaskTasksModelCrossReference_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,41,FOLLOW_37); 

            			newLeafNode(otherlv_7, grammarAccess.getCompoundTaskAccess().getRightSquareBracketKeyword_5());
            		
            // InternalMyDsl.g:839:3: ( (otherlv_8= 'constraint:' ( (lv_ordered_9_0= 'ordered' ) ) ) | (otherlv_10= 'constraint:' ( (lv_consecutive_11_0= 'consecutive' ) ) ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==44) ) {
                    alt14=2;
                }
                else if ( (LA14_1==43) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:840:4: (otherlv_8= 'constraint:' ( (lv_ordered_9_0= 'ordered' ) ) )
                    {
                    // InternalMyDsl.g:840:4: (otherlv_8= 'constraint:' ( (lv_ordered_9_0= 'ordered' ) ) )
                    // InternalMyDsl.g:841:5: otherlv_8= 'constraint:' ( (lv_ordered_9_0= 'ordered' ) )
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_38); 

                    					newLeafNode(otherlv_8, grammarAccess.getCompoundTaskAccess().getConstraintKeyword_6_0_0());
                    				
                    // InternalMyDsl.g:845:5: ( (lv_ordered_9_0= 'ordered' ) )
                    // InternalMyDsl.g:846:6: (lv_ordered_9_0= 'ordered' )
                    {
                    // InternalMyDsl.g:846:6: (lv_ordered_9_0= 'ordered' )
                    // InternalMyDsl.g:847:7: lv_ordered_9_0= 'ordered'
                    {
                    lv_ordered_9_0=(Token)match(input,43,FOLLOW_2); 

                    							newLeafNode(lv_ordered_9_0, grammarAccess.getCompoundTaskAccess().getOrderedOrderedKeyword_6_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCompoundTaskRule());
                    							}
                    							setWithLastConsumed(current, "ordered", lv_ordered_9_0 != null, "ordered");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:861:4: (otherlv_10= 'constraint:' ( (lv_consecutive_11_0= 'consecutive' ) ) )
                    {
                    // InternalMyDsl.g:861:4: (otherlv_10= 'constraint:' ( (lv_consecutive_11_0= 'consecutive' ) ) )
                    // InternalMyDsl.g:862:5: otherlv_10= 'constraint:' ( (lv_consecutive_11_0= 'consecutive' ) )
                    {
                    otherlv_10=(Token)match(input,42,FOLLOW_39); 

                    					newLeafNode(otherlv_10, grammarAccess.getCompoundTaskAccess().getConstraintKeyword_6_1_0());
                    				
                    // InternalMyDsl.g:866:5: ( (lv_consecutive_11_0= 'consecutive' ) )
                    // InternalMyDsl.g:867:6: (lv_consecutive_11_0= 'consecutive' )
                    {
                    // InternalMyDsl.g:867:6: (lv_consecutive_11_0= 'consecutive' )
                    // InternalMyDsl.g:868:7: lv_consecutive_11_0= 'consecutive'
                    {
                    lv_consecutive_11_0=(Token)match(input,44,FOLLOW_2); 

                    							newLeafNode(lv_consecutive_11_0, grammarAccess.getCompoundTaskAccess().getConsecutiveConsecutiveKeyword_6_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCompoundTaskRule());
                    							}
                    							setWithLastConsumed(current, "consecutive", lv_consecutive_11_0 != null, "consecutive");
                    						

                    }


                    }


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
    // $ANTLR end "ruleCompoundTask"


    // $ANTLR start "entryRuleRobot"
    // InternalMyDsl.g:886:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalMyDsl.g:886:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalMyDsl.g:887:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
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
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyDsl.g:893:1: ruleRobot returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'at' otherlv_3= 'initial' otherlv_4= 'position' ( ( ruleEString ) ) otherlv_6= 'has' otherlv_7= 'velocity' ( (lv_velocity_8_0= ruleEDouble ) ) otherlv_9= 'with' otherlv_10= 'capabilities' otherlv_11= '(' ( (lv_capabilities_12_0= ruleCapability ) ) (otherlv_13= ',' ( (lv_capabilities_14_0= ruleCapability ) ) )* otherlv_15= ')' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_velocity_8_0 = null;

        EObject lv_capabilities_12_0 = null;

        EObject lv_capabilities_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:899:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'at' otherlv_3= 'initial' otherlv_4= 'position' ( ( ruleEString ) ) otherlv_6= 'has' otherlv_7= 'velocity' ( (lv_velocity_8_0= ruleEDouble ) ) otherlv_9= 'with' otherlv_10= 'capabilities' otherlv_11= '(' ( (lv_capabilities_12_0= ruleCapability ) ) (otherlv_13= ',' ( (lv_capabilities_14_0= ruleCapability ) ) )* otherlv_15= ')' ) )
            // InternalMyDsl.g:900:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'at' otherlv_3= 'initial' otherlv_4= 'position' ( ( ruleEString ) ) otherlv_6= 'has' otherlv_7= 'velocity' ( (lv_velocity_8_0= ruleEDouble ) ) otherlv_9= 'with' otherlv_10= 'capabilities' otherlv_11= '(' ( (lv_capabilities_12_0= ruleCapability ) ) (otherlv_13= ',' ( (lv_capabilities_14_0= ruleCapability ) ) )* otherlv_15= ')' )
            {
            // InternalMyDsl.g:900:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'at' otherlv_3= 'initial' otherlv_4= 'position' ( ( ruleEString ) ) otherlv_6= 'has' otherlv_7= 'velocity' ( (lv_velocity_8_0= ruleEDouble ) ) otherlv_9= 'with' otherlv_10= 'capabilities' otherlv_11= '(' ( (lv_capabilities_12_0= ruleCapability ) ) (otherlv_13= ',' ( (lv_capabilities_14_0= ruleCapability ) ) )* otherlv_15= ')' )
            // InternalMyDsl.g:901:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' otherlv_2= 'at' otherlv_3= 'initial' otherlv_4= 'position' ( ( ruleEString ) ) otherlv_6= 'has' otherlv_7= 'velocity' ( (lv_velocity_8_0= ruleEDouble ) ) otherlv_9= 'with' otherlv_10= 'capabilities' otherlv_11= '(' ( (lv_capabilities_12_0= ruleCapability ) ) (otherlv_13= ',' ( (lv_capabilities_14_0= ruleCapability ) ) )* otherlv_15= ')'
            {
            // InternalMyDsl.g:901:3: ( (lv_name_0_0= ruleEString ) )
            // InternalMyDsl.g:902:4: (lv_name_0_0= ruleEString )
            {
            // InternalMyDsl.g:902:4: (lv_name_0_0= ruleEString )
            // InternalMyDsl.g:903:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotAccess().getAtKeyword_2());
            		
            otherlv_3=(Token)match(input,45,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getInitialKeyword_3());
            		
            otherlv_4=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getPositionKeyword_4());
            		
            // InternalMyDsl.g:936:3: ( ( ruleEString ) )
            // InternalMyDsl.g:937:4: ( ruleEString )
            {
            // InternalMyDsl.g:937:4: ( ruleEString )
            // InternalMyDsl.g:938:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRobotAccess().getInitLocLocationCrossReference_5_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_44); 

            			newLeafNode(otherlv_6, grammarAccess.getRobotAccess().getHasKeyword_6());
            		
            otherlv_7=(Token)match(input,47,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getVelocityKeyword_7());
            		
            // InternalMyDsl.g:960:3: ( (lv_velocity_8_0= ruleEDouble ) )
            // InternalMyDsl.g:961:4: (lv_velocity_8_0= ruleEDouble )
            {
            // InternalMyDsl.g:961:4: (lv_velocity_8_0= ruleEDouble )
            // InternalMyDsl.g:962:5: lv_velocity_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getVelocityEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_45);
            lv_velocity_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"velocity",
            						lv_velocity_8_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,48,FOLLOW_46); 

            			newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getWithKeyword_9());
            		
            otherlv_10=(Token)match(input,49,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getRobotAccess().getCapabilitiesKeyword_10());
            		
            otherlv_11=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getRobotAccess().getLeftParenthesisKeyword_11());
            		
            // InternalMyDsl.g:991:3: ( (lv_capabilities_12_0= ruleCapability ) )
            // InternalMyDsl.g:992:4: (lv_capabilities_12_0= ruleCapability )
            {
            // InternalMyDsl.g:992:4: (lv_capabilities_12_0= ruleCapability )
            // InternalMyDsl.g:993:5: lv_capabilities_12_0= ruleCapability
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getCapabilitiesCapabilityParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_16);
            lv_capabilities_12_0=ruleCapability();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					add(
            						current,
            						"capabilities",
            						lv_capabilities_12_0,
            						"org.xtext.example.mydsl.MyDsl.Capability");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1010:3: (otherlv_13= ',' ( (lv_capabilities_14_0= ruleCapability ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1011:4: otherlv_13= ',' ( (lv_capabilities_14_0= ruleCapability ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_13, grammarAccess.getRobotAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:1015:4: ( (lv_capabilities_14_0= ruleCapability ) )
            	    // InternalMyDsl.g:1016:5: (lv_capabilities_14_0= ruleCapability )
            	    {
            	    // InternalMyDsl.g:1016:5: (lv_capabilities_14_0= ruleCapability )
            	    // InternalMyDsl.g:1017:6: lv_capabilities_14_0= ruleCapability
            	    {

            	    						newCompositeNode(grammarAccess.getRobotAccess().getCapabilitiesCapabilityParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_capabilities_14_0=ruleCapability();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotRule());
            	    						}
            	    						add(
            	    							current,
            	    							"capabilities",
            	    							lv_capabilities_14_0,
            	    							"org.xtext.example.mydsl.MyDsl.Capability");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_15=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRobotAccess().getRightParenthesisKeyword_14());
            		

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
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleCapability"
    // InternalMyDsl.g:1043:1: entryRuleCapability returns [EObject current=null] : iv_ruleCapability= ruleCapability EOF ;
    public final EObject entryRuleCapability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCapability = null;


        try {
            // InternalMyDsl.g:1043:51: (iv_ruleCapability= ruleCapability EOF )
            // InternalMyDsl.g:1044:2: iv_ruleCapability= ruleCapability EOF
            {
             newCompositeNode(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCapability=ruleCapability();

            state._fsp--;

             current =iv_ruleCapability; 
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
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // InternalMyDsl.g:1050:1: ruleCapability returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '-required' otherlv_2= 'time:' ( (lv_time_3_0= ruleEDouble ) ) otherlv_4= ',' otherlv_5= 'success' otherlv_6= 'rate:' ( (lv_success_7_0= ruleEDouble ) ) otherlv_8= '%' ) ;
    public final EObject ruleCapability() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_time_3_0 = null;

        AntlrDatatypeRuleToken lv_success_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1056:2: ( ( ( ( ruleEString ) ) otherlv_1= '-required' otherlv_2= 'time:' ( (lv_time_3_0= ruleEDouble ) ) otherlv_4= ',' otherlv_5= 'success' otherlv_6= 'rate:' ( (lv_success_7_0= ruleEDouble ) ) otherlv_8= '%' ) )
            // InternalMyDsl.g:1057:2: ( ( ( ruleEString ) ) otherlv_1= '-required' otherlv_2= 'time:' ( (lv_time_3_0= ruleEDouble ) ) otherlv_4= ',' otherlv_5= 'success' otherlv_6= 'rate:' ( (lv_success_7_0= ruleEDouble ) ) otherlv_8= '%' )
            {
            // InternalMyDsl.g:1057:2: ( ( ( ruleEString ) ) otherlv_1= '-required' otherlv_2= 'time:' ( (lv_time_3_0= ruleEDouble ) ) otherlv_4= ',' otherlv_5= 'success' otherlv_6= 'rate:' ( (lv_success_7_0= ruleEDouble ) ) otherlv_8= '%' )
            // InternalMyDsl.g:1058:3: ( ( ruleEString ) ) otherlv_1= '-required' otherlv_2= 'time:' ( (lv_time_3_0= ruleEDouble ) ) otherlv_4= ',' otherlv_5= 'success' otherlv_6= 'rate:' ( (lv_success_7_0= ruleEDouble ) ) otherlv_8= '%'
            {
            // InternalMyDsl.g:1058:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1059:4: ( ruleEString )
            {
            // InternalMyDsl.g:1059:4: ( ruleEString )
            // InternalMyDsl.g:1060:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCapabilityRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCapabilityAccess().getAtAtomicTaskCrossReference_0_0());
            				
            pushFollow(FOLLOW_47);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getCapabilityAccess().getRequiredKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCapabilityAccess().getTimeKeyword_2());
            		
            // InternalMyDsl.g:1082:3: ( (lv_time_3_0= ruleEDouble ) )
            // InternalMyDsl.g:1083:4: (lv_time_3_0= ruleEDouble )
            {
            // InternalMyDsl.g:1083:4: (lv_time_3_0= ruleEDouble )
            // InternalMyDsl.g:1084:5: lv_time_3_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getCapabilityAccess().getTimeEDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
            lv_time_3_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapabilityRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_3_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getCapabilityAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getCapabilityAccess().getSuccessKeyword_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getCapabilityAccess().getRateKeyword_6());
            		
            // InternalMyDsl.g:1113:3: ( (lv_success_7_0= ruleEDouble ) )
            // InternalMyDsl.g:1114:4: (lv_success_7_0= ruleEDouble )
            {
            // InternalMyDsl.g:1114:4: (lv_success_7_0= ruleEDouble )
            // InternalMyDsl.g:1115:5: lv_success_7_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getCapabilityAccess().getSuccessEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_24);
            lv_success_7_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCapabilityRule());
            					}
            					set(
            						current,
            						"success",
            						lv_success_7_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCapabilityAccess().getPercentSignKeyword_8());
            		

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
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleMission"
    // InternalMyDsl.g:1140:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalMyDsl.g:1140:48: (iv_ruleMission= ruleMission EOF )
            // InternalMyDsl.g:1141:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalMyDsl.g:1147:1: ruleMission returns [EObject current=null] : ( ( (lv_missionTask_0_0= ruleMissionTask ) ) (otherlv_1= ',' ( (lv_missionTask_2_0= ruleMissionTask ) ) )* otherlv_3= 'objectives:' ( (lv_obj_4_0= ruleObjective ) ) (otherlv_5= ',' ( (lv_obj_6_0= ruleObjective ) ) )* (otherlv_7= 'constraints:' ( (lv_constraints_8_0= ruleConstraints ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraints ) ) )* )? (otherlv_11= 'parameters:' (otherlv_12= 'time:' ( (lv_time_13_0= ruleEInt ) ) )? (otherlv_14= 'numAllocation:' ( (lv_numAlloc_15_0= ruleEInt ) ) )? (otherlv_16= 'population:' ( (lv_population_17_0= ruleEInt ) ) )? (otherlv_18= 'evaluation:' ( (lv_evaluations_19_0= ruleEInt ) ) )? )? ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_missionTask_0_0 = null;

        EObject lv_missionTask_2_0 = null;

        Enumerator lv_obj_4_0 = null;

        Enumerator lv_obj_6_0 = null;

        EObject lv_constraints_8_0 = null;

        EObject lv_constraints_10_0 = null;

        AntlrDatatypeRuleToken lv_time_13_0 = null;

        AntlrDatatypeRuleToken lv_numAlloc_15_0 = null;

        AntlrDatatypeRuleToken lv_population_17_0 = null;

        AntlrDatatypeRuleToken lv_evaluations_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1153:2: ( ( ( (lv_missionTask_0_0= ruleMissionTask ) ) (otherlv_1= ',' ( (lv_missionTask_2_0= ruleMissionTask ) ) )* otherlv_3= 'objectives:' ( (lv_obj_4_0= ruleObjective ) ) (otherlv_5= ',' ( (lv_obj_6_0= ruleObjective ) ) )* (otherlv_7= 'constraints:' ( (lv_constraints_8_0= ruleConstraints ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraints ) ) )* )? (otherlv_11= 'parameters:' (otherlv_12= 'time:' ( (lv_time_13_0= ruleEInt ) ) )? (otherlv_14= 'numAllocation:' ( (lv_numAlloc_15_0= ruleEInt ) ) )? (otherlv_16= 'population:' ( (lv_population_17_0= ruleEInt ) ) )? (otherlv_18= 'evaluation:' ( (lv_evaluations_19_0= ruleEInt ) ) )? )? ) )
            // InternalMyDsl.g:1154:2: ( ( (lv_missionTask_0_0= ruleMissionTask ) ) (otherlv_1= ',' ( (lv_missionTask_2_0= ruleMissionTask ) ) )* otherlv_3= 'objectives:' ( (lv_obj_4_0= ruleObjective ) ) (otherlv_5= ',' ( (lv_obj_6_0= ruleObjective ) ) )* (otherlv_7= 'constraints:' ( (lv_constraints_8_0= ruleConstraints ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraints ) ) )* )? (otherlv_11= 'parameters:' (otherlv_12= 'time:' ( (lv_time_13_0= ruleEInt ) ) )? (otherlv_14= 'numAllocation:' ( (lv_numAlloc_15_0= ruleEInt ) ) )? (otherlv_16= 'population:' ( (lv_population_17_0= ruleEInt ) ) )? (otherlv_18= 'evaluation:' ( (lv_evaluations_19_0= ruleEInt ) ) )? )? )
            {
            // InternalMyDsl.g:1154:2: ( ( (lv_missionTask_0_0= ruleMissionTask ) ) (otherlv_1= ',' ( (lv_missionTask_2_0= ruleMissionTask ) ) )* otherlv_3= 'objectives:' ( (lv_obj_4_0= ruleObjective ) ) (otherlv_5= ',' ( (lv_obj_6_0= ruleObjective ) ) )* (otherlv_7= 'constraints:' ( (lv_constraints_8_0= ruleConstraints ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraints ) ) )* )? (otherlv_11= 'parameters:' (otherlv_12= 'time:' ( (lv_time_13_0= ruleEInt ) ) )? (otherlv_14= 'numAllocation:' ( (lv_numAlloc_15_0= ruleEInt ) ) )? (otherlv_16= 'population:' ( (lv_population_17_0= ruleEInt ) ) )? (otherlv_18= 'evaluation:' ( (lv_evaluations_19_0= ruleEInt ) ) )? )? )
            // InternalMyDsl.g:1155:3: ( (lv_missionTask_0_0= ruleMissionTask ) ) (otherlv_1= ',' ( (lv_missionTask_2_0= ruleMissionTask ) ) )* otherlv_3= 'objectives:' ( (lv_obj_4_0= ruleObjective ) ) (otherlv_5= ',' ( (lv_obj_6_0= ruleObjective ) ) )* (otherlv_7= 'constraints:' ( (lv_constraints_8_0= ruleConstraints ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraints ) ) )* )? (otherlv_11= 'parameters:' (otherlv_12= 'time:' ( (lv_time_13_0= ruleEInt ) ) )? (otherlv_14= 'numAllocation:' ( (lv_numAlloc_15_0= ruleEInt ) ) )? (otherlv_16= 'population:' ( (lv_population_17_0= ruleEInt ) ) )? (otherlv_18= 'evaluation:' ( (lv_evaluations_19_0= ruleEInt ) ) )? )?
            {
            // InternalMyDsl.g:1155:3: ( (lv_missionTask_0_0= ruleMissionTask ) )
            // InternalMyDsl.g:1156:4: (lv_missionTask_0_0= ruleMissionTask )
            {
            // InternalMyDsl.g:1156:4: (lv_missionTask_0_0= ruleMissionTask )
            // InternalMyDsl.g:1157:5: lv_missionTask_0_0= ruleMissionTask
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getMissionTaskMissionTaskParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_50);
            lv_missionTask_0_0=ruleMissionTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"missionTask",
            						lv_missionTask_0_0,
            						"org.xtext.example.mydsl.MyDsl.MissionTask");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1174:3: (otherlv_1= ',' ( (lv_missionTask_2_0= ruleMissionTask ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1175:4: otherlv_1= ',' ( (lv_missionTask_2_0= ruleMissionTask ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:1179:4: ( (lv_missionTask_2_0= ruleMissionTask ) )
            	    // InternalMyDsl.g:1180:5: (lv_missionTask_2_0= ruleMissionTask )
            	    {
            	    // InternalMyDsl.g:1180:5: (lv_missionTask_2_0= ruleMissionTask )
            	    // InternalMyDsl.g:1181:6: lv_missionTask_2_0= ruleMissionTask
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getMissionTaskMissionTaskParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_50);
            	    lv_missionTask_2_0=ruleMissionTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"missionTask",
            	    							lv_missionTask_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.MissionTask");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_3=(Token)match(input,52,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getObjectivesKeyword_2());
            		
            // InternalMyDsl.g:1203:3: ( (lv_obj_4_0= ruleObjective ) )
            // InternalMyDsl.g:1204:4: (lv_obj_4_0= ruleObjective )
            {
            // InternalMyDsl.g:1204:4: (lv_obj_4_0= ruleObjective )
            // InternalMyDsl.g:1205:5: lv_obj_4_0= ruleObjective
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getObjObjectiveEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_52);
            lv_obj_4_0=ruleObjective();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"obj",
            						lv_obj_4_0,
            						"org.xtext.example.mydsl.MyDsl.Objective");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1222:3: (otherlv_5= ',' ( (lv_obj_6_0= ruleObjective ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    int LA17_2 = input.LA(2);

                    if ( ((LA17_2>=81 && LA17_2<=83)) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1223:4: otherlv_5= ',' ( (lv_obj_6_0= ruleObjective ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_51); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMissionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMyDsl.g:1227:4: ( (lv_obj_6_0= ruleObjective ) )
            	    // InternalMyDsl.g:1228:5: (lv_obj_6_0= ruleObjective )
            	    {
            	    // InternalMyDsl.g:1228:5: (lv_obj_6_0= ruleObjective )
            	    // InternalMyDsl.g:1229:6: lv_obj_6_0= ruleObjective
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getObjObjectiveEnumRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_obj_6_0=ruleObjective();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"obj",
            	    							lv_obj_6_0,
            	    							"org.xtext.example.mydsl.MyDsl.Objective");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalMyDsl.g:1247:3: (otherlv_7= 'constraints:' ( (lv_constraints_8_0= ruleConstraints ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraints ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==53) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1248:4: otherlv_7= 'constraints:' ( (lv_constraints_8_0= ruleConstraints ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraints ) ) )*
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_53); 

                    				newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getConstraintsKeyword_5_0());
                    			
                    // InternalMyDsl.g:1252:4: ( (lv_constraints_8_0= ruleConstraints ) )
                    // InternalMyDsl.g:1253:5: (lv_constraints_8_0= ruleConstraints )
                    {
                    // InternalMyDsl.g:1253:5: (lv_constraints_8_0= ruleConstraints )
                    // InternalMyDsl.g:1254:6: lv_constraints_8_0= ruleConstraints
                    {

                    						newCompositeNode(grammarAccess.getMissionAccess().getConstraintsConstraintsParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_constraints_8_0=ruleConstraints();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMissionRule());
                    						}
                    						add(
                    							current,
                    							"constraints",
                    							lv_constraints_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Constraints");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1271:4: (otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraints ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            int LA18_2 = input.LA(2);

                            if ( (LA18_2==EOF||LA18_2==16||LA18_2==19||LA18_2==33||LA18_2==54||LA18_2==58||(LA18_2>=60 && LA18_2<=61)||LA18_2==65||(LA18_2>=68 && LA18_2<=69)||LA18_2==73) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:1272:5: otherlv_9= ',' ( (lv_constraints_10_0= ruleConstraints ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_53); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalMyDsl.g:1276:5: ( (lv_constraints_10_0= ruleConstraints ) )
                    	    // InternalMyDsl.g:1277:6: (lv_constraints_10_0= ruleConstraints )
                    	    {
                    	    // InternalMyDsl.g:1277:6: (lv_constraints_10_0= ruleConstraints )
                    	    // InternalMyDsl.g:1278:7: lv_constraints_10_0= ruleConstraints
                    	    {

                    	    							newCompositeNode(grammarAccess.getMissionAccess().getConstraintsConstraintsParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_54);
                    	    lv_constraints_10_0=ruleConstraints();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"constraints",
                    	    								lv_constraints_10_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Constraints");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1297:3: (otherlv_11= 'parameters:' (otherlv_12= 'time:' ( (lv_time_13_0= ruleEInt ) ) )? (otherlv_14= 'numAllocation:' ( (lv_numAlloc_15_0= ruleEInt ) ) )? (otherlv_16= 'population:' ( (lv_population_17_0= ruleEInt ) ) )? (otherlv_18= 'evaluation:' ( (lv_evaluations_19_0= ruleEInt ) ) )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1298:4: otherlv_11= 'parameters:' (otherlv_12= 'time:' ( (lv_time_13_0= ruleEInt ) ) )? (otherlv_14= 'numAllocation:' ( (lv_numAlloc_15_0= ruleEInt ) ) )? (otherlv_16= 'population:' ( (lv_population_17_0= ruleEInt ) ) )? (otherlv_18= 'evaluation:' ( (lv_evaluations_19_0= ruleEInt ) ) )?
                    {
                    otherlv_11=(Token)match(input,54,FOLLOW_55); 

                    				newLeafNode(otherlv_11, grammarAccess.getMissionAccess().getParametersKeyword_6_0());
                    			
                    // InternalMyDsl.g:1302:4: (otherlv_12= 'time:' ( (lv_time_13_0= ruleEInt ) ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==51) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalMyDsl.g:1303:5: otherlv_12= 'time:' ( (lv_time_13_0= ruleEInt ) )
                            {
                            otherlv_12=(Token)match(input,51,FOLLOW_25); 

                            					newLeafNode(otherlv_12, grammarAccess.getMissionAccess().getTimeKeyword_6_1_0());
                            				
                            // InternalMyDsl.g:1307:5: ( (lv_time_13_0= ruleEInt ) )
                            // InternalMyDsl.g:1308:6: (lv_time_13_0= ruleEInt )
                            {
                            // InternalMyDsl.g:1308:6: (lv_time_13_0= ruleEInt )
                            // InternalMyDsl.g:1309:7: lv_time_13_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getTimeEIntParserRuleCall_6_1_1_0());
                            						
                            pushFollow(FOLLOW_56);
                            lv_time_13_0=ruleEInt();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMissionRule());
                            							}
                            							set(
                            								current,
                            								"time",
                            								lv_time_13_0,
                            								"org.xtext.example.mydsl.MyDsl.EInt");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:1327:4: (otherlv_14= 'numAllocation:' ( (lv_numAlloc_15_0= ruleEInt ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==55) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyDsl.g:1328:5: otherlv_14= 'numAllocation:' ( (lv_numAlloc_15_0= ruleEInt ) )
                            {
                            otherlv_14=(Token)match(input,55,FOLLOW_25); 

                            					newLeafNode(otherlv_14, grammarAccess.getMissionAccess().getNumAllocationKeyword_6_2_0());
                            				
                            // InternalMyDsl.g:1332:5: ( (lv_numAlloc_15_0= ruleEInt ) )
                            // InternalMyDsl.g:1333:6: (lv_numAlloc_15_0= ruleEInt )
                            {
                            // InternalMyDsl.g:1333:6: (lv_numAlloc_15_0= ruleEInt )
                            // InternalMyDsl.g:1334:7: lv_numAlloc_15_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getNumAllocEIntParserRuleCall_6_2_1_0());
                            						
                            pushFollow(FOLLOW_57);
                            lv_numAlloc_15_0=ruleEInt();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMissionRule());
                            							}
                            							set(
                            								current,
                            								"numAlloc",
                            								lv_numAlloc_15_0,
                            								"org.xtext.example.mydsl.MyDsl.EInt");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:1352:4: (otherlv_16= 'population:' ( (lv_population_17_0= ruleEInt ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==56) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalMyDsl.g:1353:5: otherlv_16= 'population:' ( (lv_population_17_0= ruleEInt ) )
                            {
                            otherlv_16=(Token)match(input,56,FOLLOW_25); 

                            					newLeafNode(otherlv_16, grammarAccess.getMissionAccess().getPopulationKeyword_6_3_0());
                            				
                            // InternalMyDsl.g:1357:5: ( (lv_population_17_0= ruleEInt ) )
                            // InternalMyDsl.g:1358:6: (lv_population_17_0= ruleEInt )
                            {
                            // InternalMyDsl.g:1358:6: (lv_population_17_0= ruleEInt )
                            // InternalMyDsl.g:1359:7: lv_population_17_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getPopulationEIntParserRuleCall_6_3_1_0());
                            						
                            pushFollow(FOLLOW_58);
                            lv_population_17_0=ruleEInt();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMissionRule());
                            							}
                            							set(
                            								current,
                            								"population",
                            								lv_population_17_0,
                            								"org.xtext.example.mydsl.MyDsl.EInt");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:1377:4: (otherlv_18= 'evaluation:' ( (lv_evaluations_19_0= ruleEInt ) ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==57) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalMyDsl.g:1378:5: otherlv_18= 'evaluation:' ( (lv_evaluations_19_0= ruleEInt ) )
                            {
                            otherlv_18=(Token)match(input,57,FOLLOW_25); 

                            					newLeafNode(otherlv_18, grammarAccess.getMissionAccess().getEvaluationKeyword_6_4_0());
                            				
                            // InternalMyDsl.g:1382:5: ( (lv_evaluations_19_0= ruleEInt ) )
                            // InternalMyDsl.g:1383:6: (lv_evaluations_19_0= ruleEInt )
                            {
                            // InternalMyDsl.g:1383:6: (lv_evaluations_19_0= ruleEInt )
                            // InternalMyDsl.g:1384:7: lv_evaluations_19_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getMissionAccess().getEvaluationsEIntParserRuleCall_6_4_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_evaluations_19_0=ruleEInt();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMissionRule());
                            							}
                            							set(
                            								current,
                            								"evaluations",
                            								lv_evaluations_19_0,
                            								"org.xtext.example.mydsl.MyDsl.EInt");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleMissionTask"
    // InternalMyDsl.g:1407:1: entryRuleMissionTask returns [EObject current=null] : iv_ruleMissionTask= ruleMissionTask EOF ;
    public final EObject entryRuleMissionTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionTask = null;


        try {
            // InternalMyDsl.g:1407:52: (iv_ruleMissionTask= ruleMissionTask EOF )
            // InternalMyDsl.g:1408:2: iv_ruleMissionTask= ruleMissionTask EOF
            {
             newCompositeNode(grammarAccess.getMissionTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionTask=ruleMissionTask();

            state._fsp--;

             current =iv_ruleMissionTask; 
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
    // $ANTLR end "entryRuleMissionTask"


    // $ANTLR start "ruleMissionTask"
    // InternalMyDsl.g:1414:1: ruleMissionTask returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= 'atomic' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'compound' otherlv_7= 'task' ( ( ruleEString ) ) ) ) (otherlv_9= 'at' otherlv_10= 'location' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleMissionTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1420:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= 'atomic' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'compound' otherlv_7= 'task' ( ( ruleEString ) ) ) ) (otherlv_9= 'at' otherlv_10= 'location' ( ( ruleEString ) ) )? ) )
            // InternalMyDsl.g:1421:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= 'atomic' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'compound' otherlv_7= 'task' ( ( ruleEString ) ) ) ) (otherlv_9= 'at' otherlv_10= 'location' ( ( ruleEString ) ) )? )
            {
            // InternalMyDsl.g:1421:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= 'atomic' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'compound' otherlv_7= 'task' ( ( ruleEString ) ) ) ) (otherlv_9= 'at' otherlv_10= 'location' ( ( ruleEString ) ) )? )
            // InternalMyDsl.g:1422:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (otherlv_3= 'atomic' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'compound' otherlv_7= 'task' ( ( ruleEString ) ) ) ) (otherlv_9= 'at' otherlv_10= 'location' ( ( ruleEString ) ) )?
            {
            // InternalMyDsl.g:1422:3: ()
            // InternalMyDsl.g:1423:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMissionTaskAccess().getMissionTaskAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1429:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1430:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1430:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1431:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMissionTaskAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionTaskRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionTaskAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:1452:3: ( (otherlv_3= 'atomic' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'compound' otherlv_7= 'task' ( ( ruleEString ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==58) ) {
                alt25=1;
            }
            else if ( (LA25_0==60) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1453:4: (otherlv_3= 'atomic' otherlv_4= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:1453:4: (otherlv_3= 'atomic' otherlv_4= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:1454:5: otherlv_3= 'atomic' otherlv_4= 'task' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_60); 

                    					newLeafNode(otherlv_3, grammarAccess.getMissionTaskAccess().getAtomicKeyword_3_0_0());
                    				
                    otherlv_4=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_4, grammarAccess.getMissionTaskAccess().getTaskKeyword_3_0_1());
                    				
                    // InternalMyDsl.g:1462:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:1463:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:1463:6: ( ruleEString )
                    // InternalMyDsl.g:1464:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMissionTaskRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getMissionTaskAccess().getAtAtomicTaskCrossReference_3_0_2_0());
                    						
                    pushFollow(FOLLOW_61);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1480:4: (otherlv_6= 'compound' otherlv_7= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:1480:4: (otherlv_6= 'compound' otherlv_7= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:1481:5: otherlv_6= 'compound' otherlv_7= 'task' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_60); 

                    					newLeafNode(otherlv_6, grammarAccess.getMissionTaskAccess().getCompoundKeyword_3_1_0());
                    				
                    otherlv_7=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_7, grammarAccess.getMissionTaskAccess().getTaskKeyword_3_1_1());
                    				
                    // InternalMyDsl.g:1489:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:1490:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:1490:6: ( ruleEString )
                    // InternalMyDsl.g:1491:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMissionTaskRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getMissionTaskAccess().getCtCompoundTaskCrossReference_3_1_2_0());
                    						
                    pushFollow(FOLLOW_61);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1507:3: (otherlv_9= 'at' otherlv_10= 'location' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1508:4: otherlv_9= 'at' otherlv_10= 'location' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_29); 

                    				newLeafNode(otherlv_9, grammarAccess.getMissionTaskAccess().getAtKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getMissionTaskAccess().getLocationKeyword_4_1());
                    			
                    // InternalMyDsl.g:1516:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1517:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1517:5: ( ruleEString )
                    // InternalMyDsl.g:1518:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMissionTaskRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getMissionTaskAccess().getLocLocationCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleMissionTask"


    // $ANTLR start "entryRuleConstraints"
    // InternalMyDsl.g:1537:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // InternalMyDsl.g:1537:52: (iv_ruleConstraints= ruleConstraints EOF )
            // InternalMyDsl.g:1538:2: iv_ruleConstraints= ruleConstraints EOF
            {
             newCompositeNode(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraints=ruleConstraints();

            state._fsp--;

             current =iv_ruleConstraints; 
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
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalMyDsl.g:1544:1: ruleConstraints returns [EObject current=null] : (this_RateSucc_0= ruleRateSucc | this_SpaceXYRobot_1= ruleSpaceXYRobot | this_TaskTime_2= ruleTaskTime | this_AllocateT_3= ruleAllocateT | this_Closest_4= ruleClosest | this_MaxTasks_5= ruleMaxTasks ) ;
    public final EObject ruleConstraints() throws RecognitionException {
        EObject current = null;

        EObject this_RateSucc_0 = null;

        EObject this_SpaceXYRobot_1 = null;

        EObject this_TaskTime_2 = null;

        EObject this_AllocateT_3 = null;

        EObject this_Closest_4 = null;

        EObject this_MaxTasks_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1550:2: ( (this_RateSucc_0= ruleRateSucc | this_SpaceXYRobot_1= ruleSpaceXYRobot | this_TaskTime_2= ruleTaskTime | this_AllocateT_3= ruleAllocateT | this_Closest_4= ruleClosest | this_MaxTasks_5= ruleMaxTasks ) )
            // InternalMyDsl.g:1551:2: (this_RateSucc_0= ruleRateSucc | this_SpaceXYRobot_1= ruleSpaceXYRobot | this_TaskTime_2= ruleTaskTime | this_AllocateT_3= ruleAllocateT | this_Closest_4= ruleClosest | this_MaxTasks_5= ruleMaxTasks )
            {
            // InternalMyDsl.g:1551:2: (this_RateSucc_0= ruleRateSucc | this_SpaceXYRobot_1= ruleSpaceXYRobot | this_TaskTime_2= ruleTaskTime | this_AllocateT_3= ruleAllocateT | this_Closest_4= ruleClosest | this_MaxTasks_5= ruleMaxTasks )
            int alt27=6;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1552:3: this_RateSucc_0= ruleRateSucc
                    {

                    			newCompositeNode(grammarAccess.getConstraintsAccess().getRateSuccParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RateSucc_0=ruleRateSucc();

                    state._fsp--;


                    			current = this_RateSucc_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1561:3: this_SpaceXYRobot_1= ruleSpaceXYRobot
                    {

                    			newCompositeNode(grammarAccess.getConstraintsAccess().getSpaceXYRobotParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpaceXYRobot_1=ruleSpaceXYRobot();

                    state._fsp--;


                    			current = this_SpaceXYRobot_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1570:3: this_TaskTime_2= ruleTaskTime
                    {

                    			newCompositeNode(grammarAccess.getConstraintsAccess().getTaskTimeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskTime_2=ruleTaskTime();

                    state._fsp--;


                    			current = this_TaskTime_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1579:3: this_AllocateT_3= ruleAllocateT
                    {

                    			newCompositeNode(grammarAccess.getConstraintsAccess().getAllocateTParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AllocateT_3=ruleAllocateT();

                    state._fsp--;


                    			current = this_AllocateT_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1588:3: this_Closest_4= ruleClosest
                    {

                    			newCompositeNode(grammarAccess.getConstraintsAccess().getClosestParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Closest_4=ruleClosest();

                    state._fsp--;


                    			current = this_Closest_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1597:3: this_MaxTasks_5= ruleMaxTasks
                    {

                    			newCompositeNode(grammarAccess.getConstraintsAccess().getMaxTasksParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MaxTasks_5=ruleMaxTasks();

                    state._fsp--;


                    			current = this_MaxTasks_5;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleRateSucc"
    // InternalMyDsl.g:1609:1: entryRuleRateSucc returns [EObject current=null] : iv_ruleRateSucc= ruleRateSucc EOF ;
    public final EObject entryRuleRateSucc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRateSucc = null;


        try {
            // InternalMyDsl.g:1609:49: (iv_ruleRateSucc= ruleRateSucc EOF )
            // InternalMyDsl.g:1610:2: iv_ruleRateSucc= ruleRateSucc EOF
            {
             newCompositeNode(grammarAccess.getRateSuccRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRateSucc=ruleRateSucc();

            state._fsp--;

             current =iv_ruleRateSucc; 
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
    // $ANTLR end "entryRuleRateSucc"


    // $ANTLR start "ruleRateSucc"
    // InternalMyDsl.g:1616:1: ruleRateSucc returns [EObject current=null] : ( () (otherlv_1= 'rate' otherlv_2= 'of' otherlv_3= 'success' otherlv_4= 'greater' otherlv_5= 'than' ( (lv_rateSucc_6_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleRateSucc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_rateSucc_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1622:2: ( ( () (otherlv_1= 'rate' otherlv_2= 'of' otherlv_3= 'success' otherlv_4= 'greater' otherlv_5= 'than' ( (lv_rateSucc_6_0= ruleEDouble ) ) )? ) )
            // InternalMyDsl.g:1623:2: ( () (otherlv_1= 'rate' otherlv_2= 'of' otherlv_3= 'success' otherlv_4= 'greater' otherlv_5= 'than' ( (lv_rateSucc_6_0= ruleEDouble ) ) )? )
            {
            // InternalMyDsl.g:1623:2: ( () (otherlv_1= 'rate' otherlv_2= 'of' otherlv_3= 'success' otherlv_4= 'greater' otherlv_5= 'than' ( (lv_rateSucc_6_0= ruleEDouble ) ) )? )
            // InternalMyDsl.g:1624:3: () (otherlv_1= 'rate' otherlv_2= 'of' otherlv_3= 'success' otherlv_4= 'greater' otherlv_5= 'than' ( (lv_rateSucc_6_0= ruleEDouble ) ) )?
            {
            // InternalMyDsl.g:1624:3: ()
            // InternalMyDsl.g:1625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRateSuccAccess().getRateSuccAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1631:3: (otherlv_1= 'rate' otherlv_2= 'of' otherlv_3= 'success' otherlv_4= 'greater' otherlv_5= 'than' ( (lv_rateSucc_6_0= ruleEDouble ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==61) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1632:4: otherlv_1= 'rate' otherlv_2= 'of' otherlv_3= 'success' otherlv_4= 'greater' otherlv_5= 'than' ( (lv_rateSucc_6_0= ruleEDouble ) )
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_62); 

                    				newLeafNode(otherlv_1, grammarAccess.getRateSuccAccess().getRateKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,62,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getRateSuccAccess().getOfKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,29,FOLLOW_63); 

                    				newLeafNode(otherlv_3, grammarAccess.getRateSuccAccess().getSuccessKeyword_1_2());
                    			
                    otherlv_4=(Token)match(input,63,FOLLOW_64); 

                    				newLeafNode(otherlv_4, grammarAccess.getRateSuccAccess().getGreaterKeyword_1_3());
                    			
                    otherlv_5=(Token)match(input,64,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getRateSuccAccess().getThanKeyword_1_4());
                    			
                    // InternalMyDsl.g:1652:4: ( (lv_rateSucc_6_0= ruleEDouble ) )
                    // InternalMyDsl.g:1653:5: (lv_rateSucc_6_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:1653:5: (lv_rateSucc_6_0= ruleEDouble )
                    // InternalMyDsl.g:1654:6: lv_rateSucc_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRateSuccAccess().getRateSuccEDoubleParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rateSucc_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRateSuccRule());
                    						}
                    						set(
                    							current,
                    							"rateSucc",
                    							lv_rateSucc_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleRateSucc"


    // $ANTLR start "entryRuleSpaceXYRobot"
    // InternalMyDsl.g:1676:1: entryRuleSpaceXYRobot returns [EObject current=null] : iv_ruleSpaceXYRobot= ruleSpaceXYRobot EOF ;
    public final EObject entryRuleSpaceXYRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpaceXYRobot = null;


        try {
            // InternalMyDsl.g:1676:53: (iv_ruleSpaceXYRobot= ruleSpaceXYRobot EOF )
            // InternalMyDsl.g:1677:2: iv_ruleSpaceXYRobot= ruleSpaceXYRobot EOF
            {
             newCompositeNode(grammarAccess.getSpaceXYRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpaceXYRobot=ruleSpaceXYRobot();

            state._fsp--;

             current =iv_ruleSpaceXYRobot; 
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
    // $ANTLR end "entryRuleSpaceXYRobot"


    // $ANTLR start "ruleSpaceXYRobot"
    // InternalMyDsl.g:1683:1: ruleSpaceXYRobot returns [EObject current=null] : ( ( (otherlv_0= 'robot' ( ( ruleEString ) ) ) | ( ( (lv_allrobots_2_0= 'all' ) ) otherlv_3= 'robots' ) ) otherlv_4= 'work' otherlv_5= 'in' ( (lv_coordinate_6_0= ruleXY ) ) ( (lv_lowerGreater_7_0= ruleLowerGreater ) ) otherlv_8= 'than' ( (lv_val_9_0= ruleEDouble ) ) ) ;
    public final EObject ruleSpaceXYRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_allrobots_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Enumerator lv_coordinate_6_0 = null;

        Enumerator lv_lowerGreater_7_0 = null;

        AntlrDatatypeRuleToken lv_val_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1689:2: ( ( ( (otherlv_0= 'robot' ( ( ruleEString ) ) ) | ( ( (lv_allrobots_2_0= 'all' ) ) otherlv_3= 'robots' ) ) otherlv_4= 'work' otherlv_5= 'in' ( (lv_coordinate_6_0= ruleXY ) ) ( (lv_lowerGreater_7_0= ruleLowerGreater ) ) otherlv_8= 'than' ( (lv_val_9_0= ruleEDouble ) ) ) )
            // InternalMyDsl.g:1690:2: ( ( (otherlv_0= 'robot' ( ( ruleEString ) ) ) | ( ( (lv_allrobots_2_0= 'all' ) ) otherlv_3= 'robots' ) ) otherlv_4= 'work' otherlv_5= 'in' ( (lv_coordinate_6_0= ruleXY ) ) ( (lv_lowerGreater_7_0= ruleLowerGreater ) ) otherlv_8= 'than' ( (lv_val_9_0= ruleEDouble ) ) )
            {
            // InternalMyDsl.g:1690:2: ( ( (otherlv_0= 'robot' ( ( ruleEString ) ) ) | ( ( (lv_allrobots_2_0= 'all' ) ) otherlv_3= 'robots' ) ) otherlv_4= 'work' otherlv_5= 'in' ( (lv_coordinate_6_0= ruleXY ) ) ( (lv_lowerGreater_7_0= ruleLowerGreater ) ) otherlv_8= 'than' ( (lv_val_9_0= ruleEDouble ) ) )
            // InternalMyDsl.g:1691:3: ( (otherlv_0= 'robot' ( ( ruleEString ) ) ) | ( ( (lv_allrobots_2_0= 'all' ) ) otherlv_3= 'robots' ) ) otherlv_4= 'work' otherlv_5= 'in' ( (lv_coordinate_6_0= ruleXY ) ) ( (lv_lowerGreater_7_0= ruleLowerGreater ) ) otherlv_8= 'than' ( (lv_val_9_0= ruleEDouble ) )
            {
            // InternalMyDsl.g:1691:3: ( (otherlv_0= 'robot' ( ( ruleEString ) ) ) | ( ( (lv_allrobots_2_0= 'all' ) ) otherlv_3= 'robots' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            else if ( (LA29_0==65) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1692:4: (otherlv_0= 'robot' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:1692:4: (otherlv_0= 'robot' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:1693:5: otherlv_0= 'robot' ( ( ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_8); 

                    					newLeafNode(otherlv_0, grammarAccess.getSpaceXYRobotAccess().getRobotKeyword_0_0_0());
                    				
                    // InternalMyDsl.g:1697:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:1698:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:1698:6: ( ruleEString )
                    // InternalMyDsl.g:1699:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSpaceXYRobotRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getSpaceXYRobotAccess().getRobotRobotCrossReference_0_0_1_0());
                    						
                    pushFollow(FOLLOW_65);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1715:4: ( ( (lv_allrobots_2_0= 'all' ) ) otherlv_3= 'robots' )
                    {
                    // InternalMyDsl.g:1715:4: ( ( (lv_allrobots_2_0= 'all' ) ) otherlv_3= 'robots' )
                    // InternalMyDsl.g:1716:5: ( (lv_allrobots_2_0= 'all' ) ) otherlv_3= 'robots'
                    {
                    // InternalMyDsl.g:1716:5: ( (lv_allrobots_2_0= 'all' ) )
                    // InternalMyDsl.g:1717:6: (lv_allrobots_2_0= 'all' )
                    {
                    // InternalMyDsl.g:1717:6: (lv_allrobots_2_0= 'all' )
                    // InternalMyDsl.g:1718:7: lv_allrobots_2_0= 'all'
                    {
                    lv_allrobots_2_0=(Token)match(input,65,FOLLOW_66); 

                    							newLeafNode(lv_allrobots_2_0, grammarAccess.getSpaceXYRobotAccess().getAllrobotsAllKeyword_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSpaceXYRobotRule());
                    							}
                    							setWithLastConsumed(current, "allrobots", lv_allrobots_2_0, "all");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_65); 

                    					newLeafNode(otherlv_3, grammarAccess.getSpaceXYRobotAccess().getRobotsKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,66,FOLLOW_67); 

            			newLeafNode(otherlv_4, grammarAccess.getSpaceXYRobotAccess().getWorkKeyword_1());
            		
            otherlv_5=(Token)match(input,67,FOLLOW_68); 

            			newLeafNode(otherlv_5, grammarAccess.getSpaceXYRobotAccess().getInKeyword_2());
            		
            // InternalMyDsl.g:1744:3: ( (lv_coordinate_6_0= ruleXY ) )
            // InternalMyDsl.g:1745:4: (lv_coordinate_6_0= ruleXY )
            {
            // InternalMyDsl.g:1745:4: (lv_coordinate_6_0= ruleXY )
            // InternalMyDsl.g:1746:5: lv_coordinate_6_0= ruleXY
            {

            					newCompositeNode(grammarAccess.getSpaceXYRobotAccess().getCoordinateXYEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_69);
            lv_coordinate_6_0=ruleXY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpaceXYRobotRule());
            					}
            					set(
            						current,
            						"coordinate",
            						lv_coordinate_6_0,
            						"org.xtext.example.mydsl.MyDsl.XY");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1763:3: ( (lv_lowerGreater_7_0= ruleLowerGreater ) )
            // InternalMyDsl.g:1764:4: (lv_lowerGreater_7_0= ruleLowerGreater )
            {
            // InternalMyDsl.g:1764:4: (lv_lowerGreater_7_0= ruleLowerGreater )
            // InternalMyDsl.g:1765:5: lv_lowerGreater_7_0= ruleLowerGreater
            {

            					newCompositeNode(grammarAccess.getSpaceXYRobotAccess().getLowerGreaterLowerGreaterEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_64);
            lv_lowerGreater_7_0=ruleLowerGreater();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpaceXYRobotRule());
            					}
            					set(
            						current,
            						"lowerGreater",
            						lv_lowerGreater_7_0,
            						"org.xtext.example.mydsl.MyDsl.LowerGreater");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,64,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getSpaceXYRobotAccess().getThanKeyword_5());
            		
            // InternalMyDsl.g:1786:3: ( (lv_val_9_0= ruleEDouble ) )
            // InternalMyDsl.g:1787:4: (lv_val_9_0= ruleEDouble )
            {
            // InternalMyDsl.g:1787:4: (lv_val_9_0= ruleEDouble )
            // InternalMyDsl.g:1788:5: lv_val_9_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getSpaceXYRobotAccess().getValEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_9_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpaceXYRobotRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_9_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleSpaceXYRobot"


    // $ANTLR start "entryRuleTaskTime"
    // InternalMyDsl.g:1809:1: entryRuleTaskTime returns [EObject current=null] : iv_ruleTaskTime= ruleTaskTime EOF ;
    public final EObject entryRuleTaskTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskTime = null;


        try {
            // InternalMyDsl.g:1809:49: (iv_ruleTaskTime= ruleTaskTime EOF )
            // InternalMyDsl.g:1810:2: iv_ruleTaskTime= ruleTaskTime EOF
            {
             newCompositeNode(grammarAccess.getTaskTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskTime=ruleTaskTime();

            state._fsp--;

             current =iv_ruleTaskTime; 
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
    // $ANTLR end "entryRuleTaskTime"


    // $ANTLR start "ruleTaskTime"
    // InternalMyDsl.g:1816:1: ruleTaskTime returns [EObject current=null] : ( ( (otherlv_0= 'atomic' otherlv_1= 'task' ( ( ruleEString ) ) ) | (otherlv_3= 'compound' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'mission' otherlv_7= 'task' ( ( ruleEString ) ) ) ) otherlv_9= 'has' otherlv_10= 'to' ( (lv_startEnd_11_0= ruleStartEnd ) ) otherlv_12= 'time:' ( (lv_time_13_0= ruleEDouble ) ) ) ;
    public final EObject ruleTaskTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_startEnd_11_0 = null;

        AntlrDatatypeRuleToken lv_time_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1822:2: ( ( ( (otherlv_0= 'atomic' otherlv_1= 'task' ( ( ruleEString ) ) ) | (otherlv_3= 'compound' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'mission' otherlv_7= 'task' ( ( ruleEString ) ) ) ) otherlv_9= 'has' otherlv_10= 'to' ( (lv_startEnd_11_0= ruleStartEnd ) ) otherlv_12= 'time:' ( (lv_time_13_0= ruleEDouble ) ) ) )
            // InternalMyDsl.g:1823:2: ( ( (otherlv_0= 'atomic' otherlv_1= 'task' ( ( ruleEString ) ) ) | (otherlv_3= 'compound' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'mission' otherlv_7= 'task' ( ( ruleEString ) ) ) ) otherlv_9= 'has' otherlv_10= 'to' ( (lv_startEnd_11_0= ruleStartEnd ) ) otherlv_12= 'time:' ( (lv_time_13_0= ruleEDouble ) ) )
            {
            // InternalMyDsl.g:1823:2: ( ( (otherlv_0= 'atomic' otherlv_1= 'task' ( ( ruleEString ) ) ) | (otherlv_3= 'compound' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'mission' otherlv_7= 'task' ( ( ruleEString ) ) ) ) otherlv_9= 'has' otherlv_10= 'to' ( (lv_startEnd_11_0= ruleStartEnd ) ) otherlv_12= 'time:' ( (lv_time_13_0= ruleEDouble ) ) )
            // InternalMyDsl.g:1824:3: ( (otherlv_0= 'atomic' otherlv_1= 'task' ( ( ruleEString ) ) ) | (otherlv_3= 'compound' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'mission' otherlv_7= 'task' ( ( ruleEString ) ) ) ) otherlv_9= 'has' otherlv_10= 'to' ( (lv_startEnd_11_0= ruleStartEnd ) ) otherlv_12= 'time:' ( (lv_time_13_0= ruleEDouble ) )
            {
            // InternalMyDsl.g:1824:3: ( (otherlv_0= 'atomic' otherlv_1= 'task' ( ( ruleEString ) ) ) | (otherlv_3= 'compound' otherlv_4= 'task' ( ( ruleEString ) ) ) | (otherlv_6= 'mission' otherlv_7= 'task' ( ( ruleEString ) ) ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt30=1;
                }
                break;
            case 60:
                {
                alt30=2;
                }
                break;
            case 68:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1825:4: (otherlv_0= 'atomic' otherlv_1= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:1825:4: (otherlv_0= 'atomic' otherlv_1= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:1826:5: otherlv_0= 'atomic' otherlv_1= 'task' ( ( ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,58,FOLLOW_60); 

                    					newLeafNode(otherlv_0, grammarAccess.getTaskTimeAccess().getAtomicKeyword_0_0_0());
                    				
                    otherlv_1=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_1, grammarAccess.getTaskTimeAccess().getTaskKeyword_0_0_1());
                    				
                    // InternalMyDsl.g:1834:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:1835:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:1835:6: ( ruleEString )
                    // InternalMyDsl.g:1836:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTaskTimeRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getTaskTimeAccess().getAtAtomicTaskCrossReference_0_0_2_0());
                    						
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1852:4: (otherlv_3= 'compound' otherlv_4= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:1852:4: (otherlv_3= 'compound' otherlv_4= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:1853:5: otherlv_3= 'compound' otherlv_4= 'task' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_60); 

                    					newLeafNode(otherlv_3, grammarAccess.getTaskTimeAccess().getCompoundKeyword_0_1_0());
                    				
                    otherlv_4=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_4, grammarAccess.getTaskTimeAccess().getTaskKeyword_0_1_1());
                    				
                    // InternalMyDsl.g:1861:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:1862:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:1862:6: ( ruleEString )
                    // InternalMyDsl.g:1863:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTaskTimeRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getTaskTimeAccess().getCtCompoundTaskCrossReference_0_1_2_0());
                    						
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1879:4: (otherlv_6= 'mission' otherlv_7= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:1879:4: (otherlv_6= 'mission' otherlv_7= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:1880:5: otherlv_6= 'mission' otherlv_7= 'task' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_60); 

                    					newLeafNode(otherlv_6, grammarAccess.getTaskTimeAccess().getMissionKeyword_0_2_0());
                    				
                    otherlv_7=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_7, grammarAccess.getTaskTimeAccess().getTaskKeyword_0_2_1());
                    				
                    // InternalMyDsl.g:1888:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:1889:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:1889:6: ( ruleEString )
                    // InternalMyDsl.g:1890:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTaskTimeRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getTaskTimeAccess().getMtMissionTaskCrossReference_0_2_2_0());
                    						
                    pushFollow(FOLLOW_43);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskTimeAccess().getHasKeyword_1());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_70); 

            			newLeafNode(otherlv_10, grammarAccess.getTaskTimeAccess().getToKeyword_2());
            		
            // InternalMyDsl.g:1914:3: ( (lv_startEnd_11_0= ruleStartEnd ) )
            // InternalMyDsl.g:1915:4: (lv_startEnd_11_0= ruleStartEnd )
            {
            // InternalMyDsl.g:1915:4: (lv_startEnd_11_0= ruleStartEnd )
            // InternalMyDsl.g:1916:5: lv_startEnd_11_0= ruleStartEnd
            {

            					newCompositeNode(grammarAccess.getTaskTimeAccess().getStartEndStartEndEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_48);
            lv_startEnd_11_0=ruleStartEnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskTimeRule());
            					}
            					set(
            						current,
            						"startEnd",
            						lv_startEnd_11_0,
            						"org.xtext.example.mydsl.MyDsl.StartEnd");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,51,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getTaskTimeAccess().getTimeKeyword_4());
            		
            // InternalMyDsl.g:1937:3: ( (lv_time_13_0= ruleEDouble ) )
            // InternalMyDsl.g:1938:4: (lv_time_13_0= ruleEDouble )
            {
            // InternalMyDsl.g:1938:4: (lv_time_13_0= ruleEDouble )
            // InternalMyDsl.g:1939:5: lv_time_13_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getTaskTimeAccess().getTimeEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_13_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskTimeRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_13_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleTaskTime"


    // $ANTLR start "entryRuleAllocateT"
    // InternalMyDsl.g:1960:1: entryRuleAllocateT returns [EObject current=null] : iv_ruleAllocateT= ruleAllocateT EOF ;
    public final EObject entryRuleAllocateT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAllocateT = null;


        try {
            // InternalMyDsl.g:1960:50: (iv_ruleAllocateT= ruleAllocateT EOF )
            // InternalMyDsl.g:1961:2: iv_ruleAllocateT= ruleAllocateT EOF
            {
             newCompositeNode(grammarAccess.getAllocateTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAllocateT=ruleAllocateT();

            state._fsp--;

             current =iv_ruleAllocateT; 
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
    // $ANTLR end "entryRuleAllocateT"


    // $ANTLR start "ruleAllocateT"
    // InternalMyDsl.g:1967:1: ruleAllocateT returns [EObject current=null] : (otherlv_0= 'allocate' ( (otherlv_1= 'atomic' otherlv_2= 'task' ( ( ruleEString ) ) ) | (otherlv_4= 'compound' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'mission' otherlv_8= 'task' ( ( ruleEString ) ) ) ) otherlv_10= 'to' ( (otherlv_11= 'robot' ( ( ruleEString ) ) ) | (otherlv_13= 'single' otherlv_14= 'robot' ) ) ) ;
    public final EObject ruleAllocateT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1973:2: ( (otherlv_0= 'allocate' ( (otherlv_1= 'atomic' otherlv_2= 'task' ( ( ruleEString ) ) ) | (otherlv_4= 'compound' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'mission' otherlv_8= 'task' ( ( ruleEString ) ) ) ) otherlv_10= 'to' ( (otherlv_11= 'robot' ( ( ruleEString ) ) ) | (otherlv_13= 'single' otherlv_14= 'robot' ) ) ) )
            // InternalMyDsl.g:1974:2: (otherlv_0= 'allocate' ( (otherlv_1= 'atomic' otherlv_2= 'task' ( ( ruleEString ) ) ) | (otherlv_4= 'compound' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'mission' otherlv_8= 'task' ( ( ruleEString ) ) ) ) otherlv_10= 'to' ( (otherlv_11= 'robot' ( ( ruleEString ) ) ) | (otherlv_13= 'single' otherlv_14= 'robot' ) ) )
            {
            // InternalMyDsl.g:1974:2: (otherlv_0= 'allocate' ( (otherlv_1= 'atomic' otherlv_2= 'task' ( ( ruleEString ) ) ) | (otherlv_4= 'compound' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'mission' otherlv_8= 'task' ( ( ruleEString ) ) ) ) otherlv_10= 'to' ( (otherlv_11= 'robot' ( ( ruleEString ) ) ) | (otherlv_13= 'single' otherlv_14= 'robot' ) ) )
            // InternalMyDsl.g:1975:3: otherlv_0= 'allocate' ( (otherlv_1= 'atomic' otherlv_2= 'task' ( ( ruleEString ) ) ) | (otherlv_4= 'compound' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'mission' otherlv_8= 'task' ( ( ruleEString ) ) ) ) otherlv_10= 'to' ( (otherlv_11= 'robot' ( ( ruleEString ) ) ) | (otherlv_13= 'single' otherlv_14= 'robot' ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_71); 

            			newLeafNode(otherlv_0, grammarAccess.getAllocateTAccess().getAllocateKeyword_0());
            		
            // InternalMyDsl.g:1979:3: ( (otherlv_1= 'atomic' otherlv_2= 'task' ( ( ruleEString ) ) ) | (otherlv_4= 'compound' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'mission' otherlv_8= 'task' ( ( ruleEString ) ) ) )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt31=1;
                }
                break;
            case 60:
                {
                alt31=2;
                }
                break;
            case 68:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1980:4: (otherlv_1= 'atomic' otherlv_2= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:1980:4: (otherlv_1= 'atomic' otherlv_2= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:1981:5: otherlv_1= 'atomic' otherlv_2= 'task' ( ( ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_60); 

                    					newLeafNode(otherlv_1, grammarAccess.getAllocateTAccess().getAtomicKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_2, grammarAccess.getAllocateTAccess().getTaskKeyword_1_0_1());
                    				
                    // InternalMyDsl.g:1989:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:1990:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:1990:6: ( ruleEString )
                    // InternalMyDsl.g:1991:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAllocateTRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAllocateTAccess().getAtAtomicTaskCrossReference_1_0_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2007:4: (otherlv_4= 'compound' otherlv_5= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:2007:4: (otherlv_4= 'compound' otherlv_5= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:2008:5: otherlv_4= 'compound' otherlv_5= 'task' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_60); 

                    					newLeafNode(otherlv_4, grammarAccess.getAllocateTAccess().getCompoundKeyword_1_1_0());
                    				
                    otherlv_5=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getAllocateTAccess().getTaskKeyword_1_1_1());
                    				
                    // InternalMyDsl.g:2016:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:2017:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:2017:6: ( ruleEString )
                    // InternalMyDsl.g:2018:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAllocateTRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAllocateTAccess().getCtCompoundTaskCrossReference_1_1_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2034:4: (otherlv_7= 'mission' otherlv_8= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:2034:4: (otherlv_7= 'mission' otherlv_8= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:2035:5: otherlv_7= 'mission' otherlv_8= 'task' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,68,FOLLOW_60); 

                    					newLeafNode(otherlv_7, grammarAccess.getAllocateTAccess().getMissionKeyword_1_2_0());
                    				
                    otherlv_8=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_8, grammarAccess.getAllocateTAccess().getTaskKeyword_1_2_1());
                    				
                    // InternalMyDsl.g:2043:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:2044:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:2044:6: ( ruleEString )
                    // InternalMyDsl.g:2045:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAllocateTRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAllocateTAccess().getMtMissionTaskCrossReference_1_2_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,26,FOLLOW_72); 

            			newLeafNode(otherlv_10, grammarAccess.getAllocateTAccess().getToKeyword_2());
            		
            // InternalMyDsl.g:2065:3: ( (otherlv_11= 'robot' ( ( ruleEString ) ) ) | (otherlv_13= 'single' otherlv_14= 'robot' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            else if ( (LA32_0==70) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2066:4: (otherlv_11= 'robot' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:2066:4: (otherlv_11= 'robot' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:2067:5: otherlv_11= 'robot' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_8); 

                    					newLeafNode(otherlv_11, grammarAccess.getAllocateTAccess().getRobotKeyword_3_0_0());
                    				
                    // InternalMyDsl.g:2071:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:2072:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:2072:6: ( ruleEString )
                    // InternalMyDsl.g:2073:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getAllocateTRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getAllocateTAccess().getRobotRobotCrossReference_3_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2089:4: (otherlv_13= 'single' otherlv_14= 'robot' )
                    {
                    // InternalMyDsl.g:2089:4: (otherlv_13= 'single' otherlv_14= 'robot' )
                    // InternalMyDsl.g:2090:5: otherlv_13= 'single' otherlv_14= 'robot'
                    {
                    otherlv_13=(Token)match(input,70,FOLLOW_73); 

                    					newLeafNode(otherlv_13, grammarAccess.getAllocateTAccess().getSingleKeyword_3_1_0());
                    				
                    otherlv_14=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(otherlv_14, grammarAccess.getAllocateTAccess().getRobotKeyword_3_1_1());
                    				

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
    // $ANTLR end "ruleAllocateT"


    // $ANTLR start "entryRuleClosest"
    // InternalMyDsl.g:2104:1: entryRuleClosest returns [EObject current=null] : iv_ruleClosest= ruleClosest EOF ;
    public final EObject entryRuleClosest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClosest = null;


        try {
            // InternalMyDsl.g:2104:48: (iv_ruleClosest= ruleClosest EOF )
            // InternalMyDsl.g:2105:2: iv_ruleClosest= ruleClosest EOF
            {
             newCompositeNode(grammarAccess.getClosestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClosest=ruleClosest();

            state._fsp--;

             current =iv_ruleClosest; 
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
    // $ANTLR end "entryRuleClosest"


    // $ANTLR start "ruleClosest"
    // InternalMyDsl.g:2111:1: ruleClosest returns [EObject current=null] : ( () otherlv_1= 'allocate' ( ( ( (lv_all_2_0= 'all' ) ) otherlv_3= 'tasks' ) | (otherlv_4= 'atomic' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'compound' otherlv_8= 'task' ( ( ruleEString ) ) ) | (otherlv_10= 'mission' otherlv_11= 'task' ( ( ruleEString ) ) ) ) otherlv_13= 'to' otherlv_14= 'closest' otherlv_15= 'robot' ) ;
    public final EObject ruleClosest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_all_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2117:2: ( ( () otherlv_1= 'allocate' ( ( ( (lv_all_2_0= 'all' ) ) otherlv_3= 'tasks' ) | (otherlv_4= 'atomic' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'compound' otherlv_8= 'task' ( ( ruleEString ) ) ) | (otherlv_10= 'mission' otherlv_11= 'task' ( ( ruleEString ) ) ) ) otherlv_13= 'to' otherlv_14= 'closest' otherlv_15= 'robot' ) )
            // InternalMyDsl.g:2118:2: ( () otherlv_1= 'allocate' ( ( ( (lv_all_2_0= 'all' ) ) otherlv_3= 'tasks' ) | (otherlv_4= 'atomic' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'compound' otherlv_8= 'task' ( ( ruleEString ) ) ) | (otherlv_10= 'mission' otherlv_11= 'task' ( ( ruleEString ) ) ) ) otherlv_13= 'to' otherlv_14= 'closest' otherlv_15= 'robot' )
            {
            // InternalMyDsl.g:2118:2: ( () otherlv_1= 'allocate' ( ( ( (lv_all_2_0= 'all' ) ) otherlv_3= 'tasks' ) | (otherlv_4= 'atomic' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'compound' otherlv_8= 'task' ( ( ruleEString ) ) ) | (otherlv_10= 'mission' otherlv_11= 'task' ( ( ruleEString ) ) ) ) otherlv_13= 'to' otherlv_14= 'closest' otherlv_15= 'robot' )
            // InternalMyDsl.g:2119:3: () otherlv_1= 'allocate' ( ( ( (lv_all_2_0= 'all' ) ) otherlv_3= 'tasks' ) | (otherlv_4= 'atomic' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'compound' otherlv_8= 'task' ( ( ruleEString ) ) ) | (otherlv_10= 'mission' otherlv_11= 'task' ( ( ruleEString ) ) ) ) otherlv_13= 'to' otherlv_14= 'closest' otherlv_15= 'robot'
            {
            // InternalMyDsl.g:2119:3: ()
            // InternalMyDsl.g:2120:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClosestAccess().getClosestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getClosestAccess().getAllocateKeyword_1());
            		
            // InternalMyDsl.g:2130:3: ( ( ( (lv_all_2_0= 'all' ) ) otherlv_3= 'tasks' ) | (otherlv_4= 'atomic' otherlv_5= 'task' ( ( ruleEString ) ) ) | (otherlv_7= 'compound' otherlv_8= 'task' ( ( ruleEString ) ) ) | (otherlv_10= 'mission' otherlv_11= 'task' ( ( ruleEString ) ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt33=1;
                }
                break;
            case 58:
                {
                alt33=2;
                }
                break;
            case 60:
                {
                alt33=3;
                }
                break;
            case 68:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2131:4: ( ( (lv_all_2_0= 'all' ) ) otherlv_3= 'tasks' )
                    {
                    // InternalMyDsl.g:2131:4: ( ( (lv_all_2_0= 'all' ) ) otherlv_3= 'tasks' )
                    // InternalMyDsl.g:2132:5: ( (lv_all_2_0= 'all' ) ) otherlv_3= 'tasks'
                    {
                    // InternalMyDsl.g:2132:5: ( (lv_all_2_0= 'all' ) )
                    // InternalMyDsl.g:2133:6: (lv_all_2_0= 'all' )
                    {
                    // InternalMyDsl.g:2133:6: (lv_all_2_0= 'all' )
                    // InternalMyDsl.g:2134:7: lv_all_2_0= 'all'
                    {
                    lv_all_2_0=(Token)match(input,65,FOLLOW_75); 

                    							newLeafNode(lv_all_2_0, grammarAccess.getClosestAccess().getAllAllKeyword_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClosestRule());
                    							}
                    							setWithLastConsumed(current, "all", lv_all_2_0, "all");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,71,FOLLOW_19); 

                    					newLeafNode(otherlv_3, grammarAccess.getClosestAccess().getTasksKeyword_2_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2152:4: (otherlv_4= 'atomic' otherlv_5= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:2152:4: (otherlv_4= 'atomic' otherlv_5= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:2153:5: otherlv_4= 'atomic' otherlv_5= 'task' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,58,FOLLOW_60); 

                    					newLeafNode(otherlv_4, grammarAccess.getClosestAccess().getAtomicKeyword_2_1_0());
                    				
                    otherlv_5=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_5, grammarAccess.getClosestAccess().getTaskKeyword_2_1_1());
                    				
                    // InternalMyDsl.g:2161:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:2162:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:2162:6: ( ruleEString )
                    // InternalMyDsl.g:2163:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClosestRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getClosestAccess().getAtAtomicTaskCrossReference_2_1_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2179:4: (otherlv_7= 'compound' otherlv_8= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:2179:4: (otherlv_7= 'compound' otherlv_8= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:2180:5: otherlv_7= 'compound' otherlv_8= 'task' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_60); 

                    					newLeafNode(otherlv_7, grammarAccess.getClosestAccess().getCompoundKeyword_2_2_0());
                    				
                    otherlv_8=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_8, grammarAccess.getClosestAccess().getTaskKeyword_2_2_1());
                    				
                    // InternalMyDsl.g:2188:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:2189:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:2189:6: ( ruleEString )
                    // InternalMyDsl.g:2190:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClosestRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getClosestAccess().getCtCompoundTaskCrossReference_2_2_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2206:4: (otherlv_10= 'mission' otherlv_11= 'task' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:2206:4: (otherlv_10= 'mission' otherlv_11= 'task' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:2207:5: otherlv_10= 'mission' otherlv_11= 'task' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,68,FOLLOW_60); 

                    					newLeafNode(otherlv_10, grammarAccess.getClosestAccess().getMissionKeyword_2_3_0());
                    				
                    otherlv_11=(Token)match(input,59,FOLLOW_8); 

                    					newLeafNode(otherlv_11, grammarAccess.getClosestAccess().getTaskKeyword_2_3_1());
                    				
                    // InternalMyDsl.g:2215:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:2216:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:2216:6: ( ruleEString )
                    // InternalMyDsl.g:2217:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getClosestRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getClosestAccess().getMtMissionTaskCrossReference_2_3_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,26,FOLLOW_76); 

            			newLeafNode(otherlv_13, grammarAccess.getClosestAccess().getToKeyword_3());
            		
            otherlv_14=(Token)match(input,72,FOLLOW_73); 

            			newLeafNode(otherlv_14, grammarAccess.getClosestAccess().getClosestKeyword_4());
            		
            otherlv_15=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getClosestAccess().getRobotKeyword_5());
            		

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
    // $ANTLR end "ruleClosest"


    // $ANTLR start "entryRuleMaxTasks"
    // InternalMyDsl.g:2249:1: entryRuleMaxTasks returns [EObject current=null] : iv_ruleMaxTasks= ruleMaxTasks EOF ;
    public final EObject entryRuleMaxTasks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxTasks = null;


        try {
            // InternalMyDsl.g:2249:49: (iv_ruleMaxTasks= ruleMaxTasks EOF )
            // InternalMyDsl.g:2250:2: iv_ruleMaxTasks= ruleMaxTasks EOF
            {
             newCompositeNode(grammarAccess.getMaxTasksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxTasks=ruleMaxTasks();

            state._fsp--;

             current =iv_ruleMaxTasks; 
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
    // $ANTLR end "entryRuleMaxTasks"


    // $ANTLR start "ruleMaxTasks"
    // InternalMyDsl.g:2256:1: ruleMaxTasks returns [EObject current=null] : (otherlv_0= 'limit' otherlv_1= 'max' otherlv_2= 'number' otherlv_3= 'of' otherlv_4= 'tasks' ( ( ( (lv_all_5_0= 'per' ) ) otherlv_6= 'robot' ) | (otherlv_7= 'in' otherlv_8= 'robot' ( ( ruleEString ) ) ) ) otherlv_10= 'to' ( (lv_num_11_0= ruleEInt ) ) ) ;
    public final EObject ruleMaxTasks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_all_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_num_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2262:2: ( (otherlv_0= 'limit' otherlv_1= 'max' otherlv_2= 'number' otherlv_3= 'of' otherlv_4= 'tasks' ( ( ( (lv_all_5_0= 'per' ) ) otherlv_6= 'robot' ) | (otherlv_7= 'in' otherlv_8= 'robot' ( ( ruleEString ) ) ) ) otherlv_10= 'to' ( (lv_num_11_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:2263:2: (otherlv_0= 'limit' otherlv_1= 'max' otherlv_2= 'number' otherlv_3= 'of' otherlv_4= 'tasks' ( ( ( (lv_all_5_0= 'per' ) ) otherlv_6= 'robot' ) | (otherlv_7= 'in' otherlv_8= 'robot' ( ( ruleEString ) ) ) ) otherlv_10= 'to' ( (lv_num_11_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:2263:2: (otherlv_0= 'limit' otherlv_1= 'max' otherlv_2= 'number' otherlv_3= 'of' otherlv_4= 'tasks' ( ( ( (lv_all_5_0= 'per' ) ) otherlv_6= 'robot' ) | (otherlv_7= 'in' otherlv_8= 'robot' ( ( ruleEString ) ) ) ) otherlv_10= 'to' ( (lv_num_11_0= ruleEInt ) ) )
            // InternalMyDsl.g:2264:3: otherlv_0= 'limit' otherlv_1= 'max' otherlv_2= 'number' otherlv_3= 'of' otherlv_4= 'tasks' ( ( ( (lv_all_5_0= 'per' ) ) otherlv_6= 'robot' ) | (otherlv_7= 'in' otherlv_8= 'robot' ( ( ruleEString ) ) ) ) otherlv_10= 'to' ( (lv_num_11_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,73,FOLLOW_77); 

            			newLeafNode(otherlv_0, grammarAccess.getMaxTasksAccess().getLimitKeyword_0());
            		
            otherlv_1=(Token)match(input,74,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getMaxTasksAccess().getMaxKeyword_1());
            		
            otherlv_2=(Token)match(input,75,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getMaxTasksAccess().getNumberKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getMaxTasksAccess().getOfKeyword_3());
            		
            otherlv_4=(Token)match(input,71,FOLLOW_79); 

            			newLeafNode(otherlv_4, grammarAccess.getMaxTasksAccess().getTasksKeyword_4());
            		
            // InternalMyDsl.g:2284:3: ( ( ( (lv_all_5_0= 'per' ) ) otherlv_6= 'robot' ) | (otherlv_7= 'in' otherlv_8= 'robot' ( ( ruleEString ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==76) ) {
                alt34=1;
            }
            else if ( (LA34_0==67) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:2285:4: ( ( (lv_all_5_0= 'per' ) ) otherlv_6= 'robot' )
                    {
                    // InternalMyDsl.g:2285:4: ( ( (lv_all_5_0= 'per' ) ) otherlv_6= 'robot' )
                    // InternalMyDsl.g:2286:5: ( (lv_all_5_0= 'per' ) ) otherlv_6= 'robot'
                    {
                    // InternalMyDsl.g:2286:5: ( (lv_all_5_0= 'per' ) )
                    // InternalMyDsl.g:2287:6: (lv_all_5_0= 'per' )
                    {
                    // InternalMyDsl.g:2287:6: (lv_all_5_0= 'per' )
                    // InternalMyDsl.g:2288:7: lv_all_5_0= 'per'
                    {
                    lv_all_5_0=(Token)match(input,76,FOLLOW_73); 

                    							newLeafNode(lv_all_5_0, grammarAccess.getMaxTasksAccess().getAllPerKeyword_5_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMaxTasksRule());
                    							}
                    							setWithLastConsumed(current, "all", lv_all_5_0, "per");
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_19); 

                    					newLeafNode(otherlv_6, grammarAccess.getMaxTasksAccess().getRobotKeyword_5_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2306:4: (otherlv_7= 'in' otherlv_8= 'robot' ( ( ruleEString ) ) )
                    {
                    // InternalMyDsl.g:2306:4: (otherlv_7= 'in' otherlv_8= 'robot' ( ( ruleEString ) ) )
                    // InternalMyDsl.g:2307:5: otherlv_7= 'in' otherlv_8= 'robot' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,67,FOLLOW_73); 

                    					newLeafNode(otherlv_7, grammarAccess.getMaxTasksAccess().getInKeyword_5_1_0());
                    				
                    otherlv_8=(Token)match(input,33,FOLLOW_8); 

                    					newLeafNode(otherlv_8, grammarAccess.getMaxTasksAccess().getRobotKeyword_5_1_1());
                    				
                    // InternalMyDsl.g:2315:5: ( ( ruleEString ) )
                    // InternalMyDsl.g:2316:6: ( ruleEString )
                    {
                    // InternalMyDsl.g:2316:6: ( ruleEString )
                    // InternalMyDsl.g:2317:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getMaxTasksRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getMaxTasksAccess().getRobotRobotCrossReference_5_1_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_10, grammarAccess.getMaxTasksAccess().getToKeyword_6());
            		
            // InternalMyDsl.g:2337:3: ( (lv_num_11_0= ruleEInt ) )
            // InternalMyDsl.g:2338:4: (lv_num_11_0= ruleEInt )
            {
            // InternalMyDsl.g:2338:4: (lv_num_11_0= ruleEInt )
            // InternalMyDsl.g:2339:5: lv_num_11_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMaxTasksAccess().getNumEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_num_11_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaxTasksRule());
            					}
            					set(
            						current,
            						"num",
            						lv_num_11_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleMaxTasks"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:2360:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:2360:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:2361:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:2367:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2373:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:2374:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:2374:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:2375:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:2375:3: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==77) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2376:4: kw= '-'
                    {
                    kw=(Token)match(input,77,FOLLOW_80); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:2393:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:2393:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:2394:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:2400:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2406:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:2407:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:2407:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2408:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2416:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:2427:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyDsl.g:2427:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyDsl.g:2428:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:2434:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2440:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:2441:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:2441:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:2442:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:2442:3: (kw= '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==77) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:2443:4: kw= '-'
                    {
                    kw=(Token)match(input,77,FOLLOW_81); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2449:3: (this_INT_1= RULE_INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2450:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_82); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,78,FOLLOW_80); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_83); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:2470:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=79 && LA41_0<=80)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:2471:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:2471:4: (kw= 'E' | kw= 'e' )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==79) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==80) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalMyDsl.g:2472:5: kw= 'E'
                            {
                            kw=(Token)match(input,79,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:2478:5: kw= 'e'
                            {
                            kw=(Token)match(input,80,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:2484:4: (kw= '-' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==77) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalMyDsl.g:2485:5: kw= '-'
                            {
                            kw=(Token)match(input,77,FOLLOW_80); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleObjective"
    // InternalMyDsl.g:2503:1: ruleObjective returns [Enumerator current=null] : ( (enumLiteral_0= 'minimiseIdle' ) | (enumLiteral_1= 'minimiseTravel' ) | (enumLiteral_2= 'maximiseSuccess' ) ) ;
    public final Enumerator ruleObjective() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2509:2: ( ( (enumLiteral_0= 'minimiseIdle' ) | (enumLiteral_1= 'minimiseTravel' ) | (enumLiteral_2= 'maximiseSuccess' ) ) )
            // InternalMyDsl.g:2510:2: ( (enumLiteral_0= 'minimiseIdle' ) | (enumLiteral_1= 'minimiseTravel' ) | (enumLiteral_2= 'maximiseSuccess' ) )
            {
            // InternalMyDsl.g:2510:2: ( (enumLiteral_0= 'minimiseIdle' ) | (enumLiteral_1= 'minimiseTravel' ) | (enumLiteral_2= 'maximiseSuccess' ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt42=1;
                }
                break;
            case 82:
                {
                alt42=2;
                }
                break;
            case 83:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:2511:3: (enumLiteral_0= 'minimiseIdle' )
                    {
                    // InternalMyDsl.g:2511:3: (enumLiteral_0= 'minimiseIdle' )
                    // InternalMyDsl.g:2512:4: enumLiteral_0= 'minimiseIdle'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getObjectiveAccess().getMinIdleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectiveAccess().getMinIdleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2519:3: (enumLiteral_1= 'minimiseTravel' )
                    {
                    // InternalMyDsl.g:2519:3: (enumLiteral_1= 'minimiseTravel' )
                    // InternalMyDsl.g:2520:4: enumLiteral_1= 'minimiseTravel'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getObjectiveAccess().getMinTravelEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getObjectiveAccess().getMinTravelEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2527:3: (enumLiteral_2= 'maximiseSuccess' )
                    {
                    // InternalMyDsl.g:2527:3: (enumLiteral_2= 'maximiseSuccess' )
                    // InternalMyDsl.g:2528:4: enumLiteral_2= 'maximiseSuccess'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getObjectiveAccess().getMaxSuccEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getObjectiveAccess().getMaxSuccEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleObjective"


    // $ANTLR start "ruleXY"
    // InternalMyDsl.g:2538:1: ruleXY returns [Enumerator current=null] : ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) ) ;
    public final Enumerator ruleXY() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2544:2: ( ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) ) )
            // InternalMyDsl.g:2545:2: ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) )
            {
            // InternalMyDsl.g:2545:2: ( (enumLiteral_0= 'x' ) | (enumLiteral_1= 'y' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==21) ) {
                alt43=1;
            }
            else if ( (LA43_0==22) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:2546:3: (enumLiteral_0= 'x' )
                    {
                    // InternalMyDsl.g:2546:3: (enumLiteral_0= 'x' )
                    // InternalMyDsl.g:2547:4: enumLiteral_0= 'x'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getXYAccess().getXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXYAccess().getXEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2554:3: (enumLiteral_1= 'y' )
                    {
                    // InternalMyDsl.g:2554:3: (enumLiteral_1= 'y' )
                    // InternalMyDsl.g:2555:4: enumLiteral_1= 'y'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getXYAccess().getYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXYAccess().getYEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleXY"


    // $ANTLR start "ruleLowerGreater"
    // InternalMyDsl.g:2565:1: ruleLowerGreater returns [Enumerator current=null] : ( (enumLiteral_0= 'lower' ) | (enumLiteral_1= 'greater' ) ) ;
    public final Enumerator ruleLowerGreater() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2571:2: ( ( (enumLiteral_0= 'lower' ) | (enumLiteral_1= 'greater' ) ) )
            // InternalMyDsl.g:2572:2: ( (enumLiteral_0= 'lower' ) | (enumLiteral_1= 'greater' ) )
            {
            // InternalMyDsl.g:2572:2: ( (enumLiteral_0= 'lower' ) | (enumLiteral_1= 'greater' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==84) ) {
                alt44=1;
            }
            else if ( (LA44_0==63) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2573:3: (enumLiteral_0= 'lower' )
                    {
                    // InternalMyDsl.g:2573:3: (enumLiteral_0= 'lower' )
                    // InternalMyDsl.g:2574:4: enumLiteral_0= 'lower'
                    {
                    enumLiteral_0=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getLowerGreaterAccess().getLowerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLowerGreaterAccess().getLowerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2581:3: (enumLiteral_1= 'greater' )
                    {
                    // InternalMyDsl.g:2581:3: (enumLiteral_1= 'greater' )
                    // InternalMyDsl.g:2582:4: enumLiteral_1= 'greater'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getLowerGreaterAccess().getGreaterEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLowerGreaterAccess().getGreaterEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleLowerGreater"


    // $ANTLR start "ruleStartEnd"
    // InternalMyDsl.g:2592:1: ruleStartEnd returns [Enumerator current=null] : ( (enumLiteral_0= 'end before' ) | (enumLiteral_1= 'start after' ) ) ;
    public final Enumerator ruleStartEnd() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2598:2: ( ( (enumLiteral_0= 'end before' ) | (enumLiteral_1= 'start after' ) ) )
            // InternalMyDsl.g:2599:2: ( (enumLiteral_0= 'end before' ) | (enumLiteral_1= 'start after' ) )
            {
            // InternalMyDsl.g:2599:2: ( (enumLiteral_0= 'end before' ) | (enumLiteral_1= 'start after' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==85) ) {
                alt45=1;
            }
            else if ( (LA45_0==86) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2600:3: (enumLiteral_0= 'end before' )
                    {
                    // InternalMyDsl.g:2600:3: (enumLiteral_0= 'end before' )
                    // InternalMyDsl.g:2601:4: enumLiteral_0= 'end before'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getStartEndAccess().getEndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStartEndAccess().getEndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2608:3: (enumLiteral_1= 'start after' )
                    {
                    // InternalMyDsl.g:2608:3: (enumLiteral_1= 'start after' )
                    // InternalMyDsl.g:2609:4: enumLiteral_1= 'start after'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getStartEndAccess().getStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStartEndAccess().getStartEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleStartEnd"

    // Delegated rules


    protected DFA27 dfa27 = new DFA27(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\1\24\uffff";
    static final String dfa_3s = "\1\20\3\uffff\1\72\2\uffff\3\73\3\5\6\32\1\41\1\uffff";
    static final String dfa_4s = "\1\111\3\uffff\1\104\2\uffff\3\73\3\6\6\32\1\110\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\5\15\uffff\1\4";
    static final String dfa_6s = "\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\1\1\15\uffff\1\2\24\uffff\1\1\3\uffff\1\3\1\uffff\1\3\1\1\3\uffff\1\2\2\uffff\1\3\1\4\3\uffff\1\5",
            "",
            "",
            "",
            "\1\7\1\uffff\1\10\4\uffff\1\6\2\uffff\1\11",
            "",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\24\44\uffff\1\24\1\uffff\1\6",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1551:2: (this_RateSucc_0= ruleRateSucc | this_SpaceXYRobot_1= ruleSpaceXYRobot | this_TaskTime_2= ruleTaskTime | this_AllocateT_3= ruleAllocateT | this_Closest_4= ruleClosest | this_MaxTasks_5= ruleMaxTasks )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002008060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000010L,0x0000000000006000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800010002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000060L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0060000000010002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x3400000200000000L,0x0000000000000232L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000010002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0388000000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1400000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x8000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x1400000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x1400000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001008L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000000018000L});

}