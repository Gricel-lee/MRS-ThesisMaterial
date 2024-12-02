package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'robots'", "'robot'", "'E'", "'e'", "'minimiseIdle'", "'minimiseTravel'", "'maximiseSuccess'", "'x'", "'y'", "'lower'", "'greater'", "'end before'", "'start after'", "'ProblemSpecification'", "'{'", "'WorldModel'", "':'", "'TasksModel'", "'RobotsModel'", "'Mission'", "'}'", "','", "'('", "')'", "'describes'", "'distance'", "'to'", "'is'", "'has'", "'success'", "'rate:'", "'%'", "'needed'", "'at'", "'location'", "'retries'", "'allowed'", "'subtasks'", "'['", "']'", "'constraint:'", "'initial'", "'position'", "'velocity'", "'with'", "'capabilities'", "'-required'", "'time:'", "'objectives:'", "'constraints:'", "'parameters:'", "'numAllocation:'", "'population:'", "'evaluation:'", "'atomic'", "'task'", "'compound'", "'rate'", "'of'", "'than'", "'work'", "'in'", "'mission'", "'allocate'", "'single'", "'closest'", "'tasks'", "'limit'", "'max'", "'number'", "'-'", "'.'", "'ordered'", "'consecutive'", "'all'", "'per'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProblemSpecification"
    // InternalMyDsl.g:53:1: entryRuleProblemSpecification : ruleProblemSpecification EOF ;
    public final void entryRuleProblemSpecification() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProblemSpecification EOF )
            // InternalMyDsl.g:55:1: ruleProblemSpecification EOF
            {
             before(grammarAccess.getProblemSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleProblemSpecification();

            state._fsp--;

             after(grammarAccess.getProblemSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProblemSpecification"


    // $ANTLR start "ruleProblemSpecification"
    // InternalMyDsl.g:62:1: ruleProblemSpecification : ( ( rule__ProblemSpecification__Group__0 ) ) ;
    public final void ruleProblemSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__ProblemSpecification__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__ProblemSpecification__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__ProblemSpecification__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__ProblemSpecification__Group__0 )
            {
             before(grammarAccess.getProblemSpecificationAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__ProblemSpecification__Group__0 )
            // InternalMyDsl.g:69:4: rule__ProblemSpecification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProblemSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProblemSpecification"


    // $ANTLR start "entryRuleWorldModel"
    // InternalMyDsl.g:78:1: entryRuleWorldModel : ruleWorldModel EOF ;
    public final void entryRuleWorldModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleWorldModel EOF )
            // InternalMyDsl.g:80:1: ruleWorldModel EOF
            {
             before(grammarAccess.getWorldModelRule()); 
            pushFollow(FOLLOW_1);
            ruleWorldModel();

            state._fsp--;

             after(grammarAccess.getWorldModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWorldModel"


    // $ANTLR start "ruleWorldModel"
    // InternalMyDsl.g:87:1: ruleWorldModel : ( ( rule__WorldModel__Alternatives ) ) ;
    public final void ruleWorldModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__WorldModel__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__WorldModel__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__WorldModel__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__WorldModel__Alternatives )
            {
             before(grammarAccess.getWorldModelAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__WorldModel__Alternatives )
            // InternalMyDsl.g:94:4: rule__WorldModel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WorldModel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorldModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWorldModel"


    // $ANTLR start "entryRuleLocation"
    // InternalMyDsl.g:103:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleLocation EOF )
            // InternalMyDsl.g:105:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalMyDsl.g:112:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Location__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Location__Group__0 )
            // InternalMyDsl.g:119:4: rule__Location__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRulePaths"
    // InternalMyDsl.g:128:1: entryRulePaths : rulePaths EOF ;
    public final void entryRulePaths() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( rulePaths EOF )
            // InternalMyDsl.g:130:1: rulePaths EOF
            {
             before(grammarAccess.getPathsRule()); 
            pushFollow(FOLLOW_1);
            rulePaths();

            state._fsp--;

             after(grammarAccess.getPathsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaths"


    // $ANTLR start "rulePaths"
    // InternalMyDsl.g:137:1: rulePaths : ( ( rule__Paths__Group__0 ) ) ;
    public final void rulePaths() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Paths__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Paths__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Paths__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Paths__Group__0 )
            {
             before(grammarAccess.getPathsAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Paths__Group__0 )
            // InternalMyDsl.g:144:4: rule__Paths__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Paths__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaths"


    // $ANTLR start "entryRuleTasksModel"
    // InternalMyDsl.g:153:1: entryRuleTasksModel : ruleTasksModel EOF ;
    public final void entryRuleTasksModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTasksModel EOF )
            // InternalMyDsl.g:155:1: ruleTasksModel EOF
            {
             before(grammarAccess.getTasksModelRule()); 
            pushFollow(FOLLOW_1);
            ruleTasksModel();

            state._fsp--;

             after(grammarAccess.getTasksModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTasksModel"


    // $ANTLR start "ruleTasksModel"
    // InternalMyDsl.g:162:1: ruleTasksModel : ( ( rule__TasksModel__Alternatives ) ) ;
    public final void ruleTasksModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__TasksModel__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__TasksModel__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__TasksModel__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__TasksModel__Alternatives )
            {
             before(grammarAccess.getTasksModelAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__TasksModel__Alternatives )
            // InternalMyDsl.g:169:4: rule__TasksModel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TasksModel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTasksModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTasksModel"


    // $ANTLR start "entryRuleAtomicTask"
    // InternalMyDsl.g:178:1: entryRuleAtomicTask : ruleAtomicTask EOF ;
    public final void entryRuleAtomicTask() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAtomicTask EOF )
            // InternalMyDsl.g:180:1: ruleAtomicTask EOF
            {
             before(grammarAccess.getAtomicTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicTask();

            state._fsp--;

             after(grammarAccess.getAtomicTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicTask"


    // $ANTLR start "ruleAtomicTask"
    // InternalMyDsl.g:187:1: ruleAtomicTask : ( ( rule__AtomicTask__Group__0 ) ) ;
    public final void ruleAtomicTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AtomicTask__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AtomicTask__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AtomicTask__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AtomicTask__Group__0 )
            {
             before(grammarAccess.getAtomicTaskAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AtomicTask__Group__0 )
            // InternalMyDsl.g:194:4: rule__AtomicTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicTask"


    // $ANTLR start "entryRuleCompoundTask"
    // InternalMyDsl.g:203:1: entryRuleCompoundTask : ruleCompoundTask EOF ;
    public final void entryRuleCompoundTask() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleCompoundTask EOF )
            // InternalMyDsl.g:205:1: ruleCompoundTask EOF
            {
             before(grammarAccess.getCompoundTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleCompoundTask();

            state._fsp--;

             after(grammarAccess.getCompoundTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompoundTask"


    // $ANTLR start "ruleCompoundTask"
    // InternalMyDsl.g:212:1: ruleCompoundTask : ( ( rule__CompoundTask__Group__0 ) ) ;
    public final void ruleCompoundTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__CompoundTask__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__CompoundTask__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__CompoundTask__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__CompoundTask__Group__0 )
            {
             before(grammarAccess.getCompoundTaskAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__CompoundTask__Group__0 )
            // InternalMyDsl.g:219:4: rule__CompoundTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompoundTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompoundTask"


    // $ANTLR start "entryRuleRobot"
    // InternalMyDsl.g:228:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRobot EOF )
            // InternalMyDsl.g:230:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyDsl.g:237:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Robot__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Robot__Group__0 )
            // InternalMyDsl.g:244:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleCapability"
    // InternalMyDsl.g:253:1: entryRuleCapability : ruleCapability EOF ;
    public final void entryRuleCapability() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleCapability EOF )
            // InternalMyDsl.g:255:1: ruleCapability EOF
            {
             before(grammarAccess.getCapabilityRule()); 
            pushFollow(FOLLOW_1);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getCapabilityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCapability"


    // $ANTLR start "ruleCapability"
    // InternalMyDsl.g:262:1: ruleCapability : ( ( rule__Capability__Group__0 ) ) ;
    public final void ruleCapability() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Capability__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Capability__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Capability__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Capability__Group__0 )
            {
             before(grammarAccess.getCapabilityAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Capability__Group__0 )
            // InternalMyDsl.g:269:4: rule__Capability__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCapability"


    // $ANTLR start "entryRuleMission"
    // InternalMyDsl.g:278:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleMission EOF )
            // InternalMyDsl.g:280:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalMyDsl.g:287:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Mission__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Mission__Group__0 )
            // InternalMyDsl.g:294:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleMissionTask"
    // InternalMyDsl.g:303:1: entryRuleMissionTask : ruleMissionTask EOF ;
    public final void entryRuleMissionTask() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMissionTask EOF )
            // InternalMyDsl.g:305:1: ruleMissionTask EOF
            {
             before(grammarAccess.getMissionTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleMissionTask();

            state._fsp--;

             after(grammarAccess.getMissionTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMissionTask"


    // $ANTLR start "ruleMissionTask"
    // InternalMyDsl.g:312:1: ruleMissionTask : ( ( rule__MissionTask__Group__0 ) ) ;
    public final void ruleMissionTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__MissionTask__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__MissionTask__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__MissionTask__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__MissionTask__Group__0 )
            {
             before(grammarAccess.getMissionTaskAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__MissionTask__Group__0 )
            // InternalMyDsl.g:319:4: rule__MissionTask__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MissionTask__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMissionTask"


    // $ANTLR start "entryRuleConstraints"
    // InternalMyDsl.g:328:1: entryRuleConstraints : ruleConstraints EOF ;
    public final void entryRuleConstraints() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleConstraints EOF )
            // InternalMyDsl.g:330:1: ruleConstraints EOF
            {
             before(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getConstraintsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalMyDsl.g:337:1: ruleConstraints : ( ( rule__Constraints__Alternatives ) ) ;
    public final void ruleConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Constraints__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Constraints__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Constraints__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__Constraints__Alternatives )
            {
             before(grammarAccess.getConstraintsAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__Constraints__Alternatives )
            // InternalMyDsl.g:344:4: rule__Constraints__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleRateSucc"
    // InternalMyDsl.g:353:1: entryRuleRateSucc : ruleRateSucc EOF ;
    public final void entryRuleRateSucc() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleRateSucc EOF )
            // InternalMyDsl.g:355:1: ruleRateSucc EOF
            {
             before(grammarAccess.getRateSuccRule()); 
            pushFollow(FOLLOW_1);
            ruleRateSucc();

            state._fsp--;

             after(grammarAccess.getRateSuccRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRateSucc"


    // $ANTLR start "ruleRateSucc"
    // InternalMyDsl.g:362:1: ruleRateSucc : ( ( rule__RateSucc__Group__0 ) ) ;
    public final void ruleRateSucc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__RateSucc__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__RateSucc__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__RateSucc__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__RateSucc__Group__0 )
            {
             before(grammarAccess.getRateSuccAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__RateSucc__Group__0 )
            // InternalMyDsl.g:369:4: rule__RateSucc__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RateSucc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRateSuccAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRateSucc"


    // $ANTLR start "entryRuleSpaceXYRobot"
    // InternalMyDsl.g:378:1: entryRuleSpaceXYRobot : ruleSpaceXYRobot EOF ;
    public final void entryRuleSpaceXYRobot() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleSpaceXYRobot EOF )
            // InternalMyDsl.g:380:1: ruleSpaceXYRobot EOF
            {
             before(grammarAccess.getSpaceXYRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleSpaceXYRobot();

            state._fsp--;

             after(grammarAccess.getSpaceXYRobotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpaceXYRobot"


    // $ANTLR start "ruleSpaceXYRobot"
    // InternalMyDsl.g:387:1: ruleSpaceXYRobot : ( ( rule__SpaceXYRobot__Group__0 ) ) ;
    public final void ruleSpaceXYRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__SpaceXYRobot__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__SpaceXYRobot__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__SpaceXYRobot__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__SpaceXYRobot__Group__0 )
            {
             before(grammarAccess.getSpaceXYRobotAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__SpaceXYRobot__Group__0 )
            // InternalMyDsl.g:394:4: rule__SpaceXYRobot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpaceXYRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpaceXYRobot"


    // $ANTLR start "entryRuleTaskTime"
    // InternalMyDsl.g:403:1: entryRuleTaskTime : ruleTaskTime EOF ;
    public final void entryRuleTaskTime() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleTaskTime EOF )
            // InternalMyDsl.g:405:1: ruleTaskTime EOF
            {
             before(grammarAccess.getTaskTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskTime();

            state._fsp--;

             after(grammarAccess.getTaskTimeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskTime"


    // $ANTLR start "ruleTaskTime"
    // InternalMyDsl.g:412:1: ruleTaskTime : ( ( rule__TaskTime__Group__0 ) ) ;
    public final void ruleTaskTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__TaskTime__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__TaskTime__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__TaskTime__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__TaskTime__Group__0 )
            {
             before(grammarAccess.getTaskTimeAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__TaskTime__Group__0 )
            // InternalMyDsl.g:419:4: rule__TaskTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskTime"


    // $ANTLR start "entryRuleAllocateT"
    // InternalMyDsl.g:428:1: entryRuleAllocateT : ruleAllocateT EOF ;
    public final void entryRuleAllocateT() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleAllocateT EOF )
            // InternalMyDsl.g:430:1: ruleAllocateT EOF
            {
             before(grammarAccess.getAllocateTRule()); 
            pushFollow(FOLLOW_1);
            ruleAllocateT();

            state._fsp--;

             after(grammarAccess.getAllocateTRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAllocateT"


    // $ANTLR start "ruleAllocateT"
    // InternalMyDsl.g:437:1: ruleAllocateT : ( ( rule__AllocateT__Group__0 ) ) ;
    public final void ruleAllocateT() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__AllocateT__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__AllocateT__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__AllocateT__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__AllocateT__Group__0 )
            {
             before(grammarAccess.getAllocateTAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__AllocateT__Group__0 )
            // InternalMyDsl.g:444:4: rule__AllocateT__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllocateTAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllocateT"


    // $ANTLR start "entryRuleClosest"
    // InternalMyDsl.g:453:1: entryRuleClosest : ruleClosest EOF ;
    public final void entryRuleClosest() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleClosest EOF )
            // InternalMyDsl.g:455:1: ruleClosest EOF
            {
             before(grammarAccess.getClosestRule()); 
            pushFollow(FOLLOW_1);
            ruleClosest();

            state._fsp--;

             after(grammarAccess.getClosestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClosest"


    // $ANTLR start "ruleClosest"
    // InternalMyDsl.g:462:1: ruleClosest : ( ( rule__Closest__Group__0 ) ) ;
    public final void ruleClosest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Closest__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Closest__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Closest__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Closest__Group__0 )
            {
             before(grammarAccess.getClosestAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Closest__Group__0 )
            // InternalMyDsl.g:469:4: rule__Closest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Closest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClosestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClosest"


    // $ANTLR start "entryRuleMaxTasks"
    // InternalMyDsl.g:478:1: entryRuleMaxTasks : ruleMaxTasks EOF ;
    public final void entryRuleMaxTasks() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleMaxTasks EOF )
            // InternalMyDsl.g:480:1: ruleMaxTasks EOF
            {
             before(grammarAccess.getMaxTasksRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxTasks();

            state._fsp--;

             after(grammarAccess.getMaxTasksRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaxTasks"


    // $ANTLR start "ruleMaxTasks"
    // InternalMyDsl.g:487:1: ruleMaxTasks : ( ( rule__MaxTasks__Group__0 ) ) ;
    public final void ruleMaxTasks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__MaxTasks__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__MaxTasks__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__MaxTasks__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__MaxTasks__Group__0 )
            {
             before(grammarAccess.getMaxTasksAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__MaxTasks__Group__0 )
            // InternalMyDsl.g:494:4: rule__MaxTasks__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxTasksAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxTasks"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:503:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleEInt EOF )
            // InternalMyDsl.g:505:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:512:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:519:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:528:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleEString EOF )
            // InternalMyDsl.g:530:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:537:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:543:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:544:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:544:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:553:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleEDouble EOF )
            // InternalMyDsl.g:555:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:562:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__EDouble__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__EDouble__Group__0 )
            // InternalMyDsl.g:569:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "ruleObjective"
    // InternalMyDsl.g:578:1: ruleObjective : ( ( rule__Objective__Alternatives ) ) ;
    public final void ruleObjective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:582:1: ( ( ( rule__Objective__Alternatives ) ) )
            // InternalMyDsl.g:583:2: ( ( rule__Objective__Alternatives ) )
            {
            // InternalMyDsl.g:583:2: ( ( rule__Objective__Alternatives ) )
            // InternalMyDsl.g:584:3: ( rule__Objective__Alternatives )
            {
             before(grammarAccess.getObjectiveAccess().getAlternatives()); 
            // InternalMyDsl.g:585:3: ( rule__Objective__Alternatives )
            // InternalMyDsl.g:585:4: rule__Objective__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Objective__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjective"


    // $ANTLR start "ruleXY"
    // InternalMyDsl.g:594:1: ruleXY : ( ( rule__XY__Alternatives ) ) ;
    public final void ruleXY() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( ( ( rule__XY__Alternatives ) ) )
            // InternalMyDsl.g:599:2: ( ( rule__XY__Alternatives ) )
            {
            // InternalMyDsl.g:599:2: ( ( rule__XY__Alternatives ) )
            // InternalMyDsl.g:600:3: ( rule__XY__Alternatives )
            {
             before(grammarAccess.getXYAccess().getAlternatives()); 
            // InternalMyDsl.g:601:3: ( rule__XY__Alternatives )
            // InternalMyDsl.g:601:4: rule__XY__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XY__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXYAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXY"


    // $ANTLR start "ruleLowerGreater"
    // InternalMyDsl.g:610:1: ruleLowerGreater : ( ( rule__LowerGreater__Alternatives ) ) ;
    public final void ruleLowerGreater() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( ( ( rule__LowerGreater__Alternatives ) ) )
            // InternalMyDsl.g:615:2: ( ( rule__LowerGreater__Alternatives ) )
            {
            // InternalMyDsl.g:615:2: ( ( rule__LowerGreater__Alternatives ) )
            // InternalMyDsl.g:616:3: ( rule__LowerGreater__Alternatives )
            {
             before(grammarAccess.getLowerGreaterAccess().getAlternatives()); 
            // InternalMyDsl.g:617:3: ( rule__LowerGreater__Alternatives )
            // InternalMyDsl.g:617:4: rule__LowerGreater__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LowerGreater__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLowerGreaterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLowerGreater"


    // $ANTLR start "ruleStartEnd"
    // InternalMyDsl.g:626:1: ruleStartEnd : ( ( rule__StartEnd__Alternatives ) ) ;
    public final void ruleStartEnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( ( ( rule__StartEnd__Alternatives ) ) )
            // InternalMyDsl.g:631:2: ( ( rule__StartEnd__Alternatives ) )
            {
            // InternalMyDsl.g:631:2: ( ( rule__StartEnd__Alternatives ) )
            // InternalMyDsl.g:632:3: ( rule__StartEnd__Alternatives )
            {
             before(grammarAccess.getStartEndAccess().getAlternatives()); 
            // InternalMyDsl.g:633:3: ( rule__StartEnd__Alternatives )
            // InternalMyDsl.g:633:4: rule__StartEnd__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StartEnd__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStartEndAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartEnd"


    // $ANTLR start "rule__WorldModel__Alternatives"
    // InternalMyDsl.g:641:1: rule__WorldModel__Alternatives : ( ( ruleLocation ) | ( rulePaths ) );
    public final void rule__WorldModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:645:1: ( ( ruleLocation ) | ( rulePaths ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                alt1=1;
            }
            else if ( (LA1_0==36) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:646:2: ( ruleLocation )
                    {
                    // InternalMyDsl.g:646:2: ( ruleLocation )
                    // InternalMyDsl.g:647:3: ruleLocation
                    {
                     before(grammarAccess.getWorldModelAccess().getLocationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLocation();

                    state._fsp--;

                     after(grammarAccess.getWorldModelAccess().getLocationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:652:2: ( rulePaths )
                    {
                    // InternalMyDsl.g:652:2: ( rulePaths )
                    // InternalMyDsl.g:653:3: rulePaths
                    {
                     before(grammarAccess.getWorldModelAccess().getPathsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePaths();

                    state._fsp--;

                     after(grammarAccess.getWorldModelAccess().getPathsParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WorldModel__Alternatives"


    // $ANTLR start "rule__TasksModel__Alternatives"
    // InternalMyDsl.g:662:1: rule__TasksModel__Alternatives : ( ( ruleAtomicTask ) | ( ruleCompoundTask ) );
    public final void rule__TasksModel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( ( ruleAtomicTask ) | ( ruleCompoundTask ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==27) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==48) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==RULE_INT||LA2_3==81) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==27) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==48) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==RULE_INT||LA2_3==81) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:667:2: ( ruleAtomicTask )
                    {
                    // InternalMyDsl.g:667:2: ( ruleAtomicTask )
                    // InternalMyDsl.g:668:3: ruleAtomicTask
                    {
                     before(grammarAccess.getTasksModelAccess().getAtomicTaskParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomicTask();

                    state._fsp--;

                     after(grammarAccess.getTasksModelAccess().getAtomicTaskParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:673:2: ( ruleCompoundTask )
                    {
                    // InternalMyDsl.g:673:2: ( ruleCompoundTask )
                    // InternalMyDsl.g:674:3: ruleCompoundTask
                    {
                     before(grammarAccess.getTasksModelAccess().getCompoundTaskParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompoundTask();

                    state._fsp--;

                     after(grammarAccess.getTasksModelAccess().getCompoundTaskParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TasksModel__Alternatives"


    // $ANTLR start "rule__AtomicTask__Alternatives_3"
    // InternalMyDsl.g:683:1: rule__AtomicTask__Alternatives_3 : ( ( 'robots' ) | ( 'robot' ) );
    public final void rule__AtomicTask__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( ( 'robots' ) | ( 'robot' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:688:2: ( 'robots' )
                    {
                    // InternalMyDsl.g:688:2: ( 'robots' )
                    // InternalMyDsl.g:689:3: 'robots'
                    {
                     before(grammarAccess.getAtomicTaskAccess().getRobotsKeyword_3_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAtomicTaskAccess().getRobotsKeyword_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:694:2: ( 'robot' )
                    {
                    // InternalMyDsl.g:694:2: ( 'robot' )
                    // InternalMyDsl.g:695:3: 'robot'
                    {
                     before(grammarAccess.getAtomicTaskAccess().getRobotKeyword_3_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAtomicTaskAccess().getRobotKeyword_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Alternatives_3"


    // $ANTLR start "rule__CompoundTask__Alternatives_6"
    // InternalMyDsl.g:704:1: rule__CompoundTask__Alternatives_6 : ( ( ( rule__CompoundTask__Group_6_0__0 ) ) | ( ( rule__CompoundTask__Group_6_1__0 ) ) );
    public final void rule__CompoundTask__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:708:1: ( ( ( rule__CompoundTask__Group_6_0__0 ) ) | ( ( rule__CompoundTask__Group_6_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==51) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==84) ) {
                    alt4=2;
                }
                else if ( (LA4_1==83) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:709:2: ( ( rule__CompoundTask__Group_6_0__0 ) )
                    {
                    // InternalMyDsl.g:709:2: ( ( rule__CompoundTask__Group_6_0__0 ) )
                    // InternalMyDsl.g:710:3: ( rule__CompoundTask__Group_6_0__0 )
                    {
                     before(grammarAccess.getCompoundTaskAccess().getGroup_6_0()); 
                    // InternalMyDsl.g:711:3: ( rule__CompoundTask__Group_6_0__0 )
                    // InternalMyDsl.g:711:4: rule__CompoundTask__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompoundTask__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompoundTaskAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:715:2: ( ( rule__CompoundTask__Group_6_1__0 ) )
                    {
                    // InternalMyDsl.g:715:2: ( ( rule__CompoundTask__Group_6_1__0 ) )
                    // InternalMyDsl.g:716:3: ( rule__CompoundTask__Group_6_1__0 )
                    {
                     before(grammarAccess.getCompoundTaskAccess().getGroup_6_1()); 
                    // InternalMyDsl.g:717:3: ( rule__CompoundTask__Group_6_1__0 )
                    // InternalMyDsl.g:717:4: rule__CompoundTask__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompoundTask__Group_6_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompoundTaskAccess().getGroup_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Alternatives_6"


    // $ANTLR start "rule__MissionTask__Alternatives_3"
    // InternalMyDsl.g:725:1: rule__MissionTask__Alternatives_3 : ( ( ( rule__MissionTask__Group_3_0__0 ) ) | ( ( rule__MissionTask__Group_3_1__0 ) ) );
    public final void rule__MissionTask__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:729:1: ( ( ( rule__MissionTask__Group_3_0__0 ) ) | ( ( rule__MissionTask__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==65) ) {
                alt5=1;
            }
            else if ( (LA5_0==67) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:730:2: ( ( rule__MissionTask__Group_3_0__0 ) )
                    {
                    // InternalMyDsl.g:730:2: ( ( rule__MissionTask__Group_3_0__0 ) )
                    // InternalMyDsl.g:731:3: ( rule__MissionTask__Group_3_0__0 )
                    {
                     before(grammarAccess.getMissionTaskAccess().getGroup_3_0()); 
                    // InternalMyDsl.g:732:3: ( rule__MissionTask__Group_3_0__0 )
                    // InternalMyDsl.g:732:4: rule__MissionTask__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MissionTask__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMissionTaskAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:736:2: ( ( rule__MissionTask__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:736:2: ( ( rule__MissionTask__Group_3_1__0 ) )
                    // InternalMyDsl.g:737:3: ( rule__MissionTask__Group_3_1__0 )
                    {
                     before(grammarAccess.getMissionTaskAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:738:3: ( rule__MissionTask__Group_3_1__0 )
                    // InternalMyDsl.g:738:4: rule__MissionTask__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MissionTask__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMissionTaskAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Alternatives_3"


    // $ANTLR start "rule__Constraints__Alternatives"
    // InternalMyDsl.g:746:1: rule__Constraints__Alternatives : ( ( ruleRateSucc ) | ( ruleSpaceXYRobot ) | ( ruleTaskTime ) | ( ruleAllocateT ) | ( ruleClosest ) | ( ruleMaxTasks ) );
    public final void rule__Constraints__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( ruleRateSucc ) | ( ruleSpaceXYRobot ) | ( ruleTaskTime ) | ( ruleAllocateT ) | ( ruleClosest ) | ( ruleMaxTasks ) )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:751:2: ( ruleRateSucc )
                    {
                    // InternalMyDsl.g:751:2: ( ruleRateSucc )
                    // InternalMyDsl.g:752:3: ruleRateSucc
                    {
                     before(grammarAccess.getConstraintsAccess().getRateSuccParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRateSucc();

                    state._fsp--;

                     after(grammarAccess.getConstraintsAccess().getRateSuccParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:757:2: ( ruleSpaceXYRobot )
                    {
                    // InternalMyDsl.g:757:2: ( ruleSpaceXYRobot )
                    // InternalMyDsl.g:758:3: ruleSpaceXYRobot
                    {
                     before(grammarAccess.getConstraintsAccess().getSpaceXYRobotParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSpaceXYRobot();

                    state._fsp--;

                     after(grammarAccess.getConstraintsAccess().getSpaceXYRobotParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:763:2: ( ruleTaskTime )
                    {
                    // InternalMyDsl.g:763:2: ( ruleTaskTime )
                    // InternalMyDsl.g:764:3: ruleTaskTime
                    {
                     before(grammarAccess.getConstraintsAccess().getTaskTimeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTaskTime();

                    state._fsp--;

                     after(grammarAccess.getConstraintsAccess().getTaskTimeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:769:2: ( ruleAllocateT )
                    {
                    // InternalMyDsl.g:769:2: ( ruleAllocateT )
                    // InternalMyDsl.g:770:3: ruleAllocateT
                    {
                     before(grammarAccess.getConstraintsAccess().getAllocateTParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAllocateT();

                    state._fsp--;

                     after(grammarAccess.getConstraintsAccess().getAllocateTParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:775:2: ( ruleClosest )
                    {
                    // InternalMyDsl.g:775:2: ( ruleClosest )
                    // InternalMyDsl.g:776:3: ruleClosest
                    {
                     before(grammarAccess.getConstraintsAccess().getClosestParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleClosest();

                    state._fsp--;

                     after(grammarAccess.getConstraintsAccess().getClosestParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:781:2: ( ruleMaxTasks )
                    {
                    // InternalMyDsl.g:781:2: ( ruleMaxTasks )
                    // InternalMyDsl.g:782:3: ruleMaxTasks
                    {
                     before(grammarAccess.getConstraintsAccess().getMaxTasksParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleMaxTasks();

                    state._fsp--;

                     after(grammarAccess.getConstraintsAccess().getMaxTasksParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraints__Alternatives"


    // $ANTLR start "rule__SpaceXYRobot__Alternatives_0"
    // InternalMyDsl.g:791:1: rule__SpaceXYRobot__Alternatives_0 : ( ( ( rule__SpaceXYRobot__Group_0_0__0 ) ) | ( ( rule__SpaceXYRobot__Group_0_1__0 ) ) );
    public final void rule__SpaceXYRobot__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( ( ( rule__SpaceXYRobot__Group_0_0__0 ) ) | ( ( rule__SpaceXYRobot__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==85) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:796:2: ( ( rule__SpaceXYRobot__Group_0_0__0 ) )
                    {
                    // InternalMyDsl.g:796:2: ( ( rule__SpaceXYRobot__Group_0_0__0 ) )
                    // InternalMyDsl.g:797:3: ( rule__SpaceXYRobot__Group_0_0__0 )
                    {
                     before(grammarAccess.getSpaceXYRobotAccess().getGroup_0_0()); 
                    // InternalMyDsl.g:798:3: ( rule__SpaceXYRobot__Group_0_0__0 )
                    // InternalMyDsl.g:798:4: rule__SpaceXYRobot__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpaceXYRobot__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpaceXYRobotAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:802:2: ( ( rule__SpaceXYRobot__Group_0_1__0 ) )
                    {
                    // InternalMyDsl.g:802:2: ( ( rule__SpaceXYRobot__Group_0_1__0 ) )
                    // InternalMyDsl.g:803:3: ( rule__SpaceXYRobot__Group_0_1__0 )
                    {
                     before(grammarAccess.getSpaceXYRobotAccess().getGroup_0_1()); 
                    // InternalMyDsl.g:804:3: ( rule__SpaceXYRobot__Group_0_1__0 )
                    // InternalMyDsl.g:804:4: rule__SpaceXYRobot__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpaceXYRobot__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpaceXYRobotAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Alternatives_0"


    // $ANTLR start "rule__TaskTime__Alternatives_0"
    // InternalMyDsl.g:812:1: rule__TaskTime__Alternatives_0 : ( ( ( rule__TaskTime__Group_0_0__0 ) ) | ( ( rule__TaskTime__Group_0_1__0 ) ) | ( ( rule__TaskTime__Group_0_2__0 ) ) );
    public final void rule__TaskTime__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:1: ( ( ( rule__TaskTime__Group_0_0__0 ) ) | ( ( rule__TaskTime__Group_0_1__0 ) ) | ( ( rule__TaskTime__Group_0_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt8=1;
                }
                break;
            case 67:
                {
                alt8=2;
                }
                break;
            case 73:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:817:2: ( ( rule__TaskTime__Group_0_0__0 ) )
                    {
                    // InternalMyDsl.g:817:2: ( ( rule__TaskTime__Group_0_0__0 ) )
                    // InternalMyDsl.g:818:3: ( rule__TaskTime__Group_0_0__0 )
                    {
                     before(grammarAccess.getTaskTimeAccess().getGroup_0_0()); 
                    // InternalMyDsl.g:819:3: ( rule__TaskTime__Group_0_0__0 )
                    // InternalMyDsl.g:819:4: rule__TaskTime__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskTime__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskTimeAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:823:2: ( ( rule__TaskTime__Group_0_1__0 ) )
                    {
                    // InternalMyDsl.g:823:2: ( ( rule__TaskTime__Group_0_1__0 ) )
                    // InternalMyDsl.g:824:3: ( rule__TaskTime__Group_0_1__0 )
                    {
                     before(grammarAccess.getTaskTimeAccess().getGroup_0_1()); 
                    // InternalMyDsl.g:825:3: ( rule__TaskTime__Group_0_1__0 )
                    // InternalMyDsl.g:825:4: rule__TaskTime__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskTime__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskTimeAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:829:2: ( ( rule__TaskTime__Group_0_2__0 ) )
                    {
                    // InternalMyDsl.g:829:2: ( ( rule__TaskTime__Group_0_2__0 ) )
                    // InternalMyDsl.g:830:3: ( rule__TaskTime__Group_0_2__0 )
                    {
                     before(grammarAccess.getTaskTimeAccess().getGroup_0_2()); 
                    // InternalMyDsl.g:831:3: ( rule__TaskTime__Group_0_2__0 )
                    // InternalMyDsl.g:831:4: rule__TaskTime__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskTime__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTaskTimeAccess().getGroup_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Alternatives_0"


    // $ANTLR start "rule__AllocateT__Alternatives_1"
    // InternalMyDsl.g:839:1: rule__AllocateT__Alternatives_1 : ( ( ( rule__AllocateT__Group_1_0__0 ) ) | ( ( rule__AllocateT__Group_1_1__0 ) ) | ( ( rule__AllocateT__Group_1_2__0 ) ) );
    public final void rule__AllocateT__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:843:1: ( ( ( rule__AllocateT__Group_1_0__0 ) ) | ( ( rule__AllocateT__Group_1_1__0 ) ) | ( ( rule__AllocateT__Group_1_2__0 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt9=1;
                }
                break;
            case 67:
                {
                alt9=2;
                }
                break;
            case 73:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:844:2: ( ( rule__AllocateT__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:844:2: ( ( rule__AllocateT__Group_1_0__0 ) )
                    // InternalMyDsl.g:845:3: ( rule__AllocateT__Group_1_0__0 )
                    {
                     before(grammarAccess.getAllocateTAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:846:3: ( rule__AllocateT__Group_1_0__0 )
                    // InternalMyDsl.g:846:4: rule__AllocateT__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllocateT__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAllocateTAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:850:2: ( ( rule__AllocateT__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:850:2: ( ( rule__AllocateT__Group_1_1__0 ) )
                    // InternalMyDsl.g:851:3: ( rule__AllocateT__Group_1_1__0 )
                    {
                     before(grammarAccess.getAllocateTAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:852:3: ( rule__AllocateT__Group_1_1__0 )
                    // InternalMyDsl.g:852:4: rule__AllocateT__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllocateT__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAllocateTAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:856:2: ( ( rule__AllocateT__Group_1_2__0 ) )
                    {
                    // InternalMyDsl.g:856:2: ( ( rule__AllocateT__Group_1_2__0 ) )
                    // InternalMyDsl.g:857:3: ( rule__AllocateT__Group_1_2__0 )
                    {
                     before(grammarAccess.getAllocateTAccess().getGroup_1_2()); 
                    // InternalMyDsl.g:858:3: ( rule__AllocateT__Group_1_2__0 )
                    // InternalMyDsl.g:858:4: rule__AllocateT__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllocateT__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAllocateTAccess().getGroup_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Alternatives_1"


    // $ANTLR start "rule__AllocateT__Alternatives_3"
    // InternalMyDsl.g:866:1: rule__AllocateT__Alternatives_3 : ( ( ( rule__AllocateT__Group_3_0__0 ) ) | ( ( rule__AllocateT__Group_3_1__0 ) ) );
    public final void rule__AllocateT__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:870:1: ( ( ( rule__AllocateT__Group_3_0__0 ) ) | ( ( rule__AllocateT__Group_3_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            else if ( (LA10_0==75) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:871:2: ( ( rule__AllocateT__Group_3_0__0 ) )
                    {
                    // InternalMyDsl.g:871:2: ( ( rule__AllocateT__Group_3_0__0 ) )
                    // InternalMyDsl.g:872:3: ( rule__AllocateT__Group_3_0__0 )
                    {
                     before(grammarAccess.getAllocateTAccess().getGroup_3_0()); 
                    // InternalMyDsl.g:873:3: ( rule__AllocateT__Group_3_0__0 )
                    // InternalMyDsl.g:873:4: rule__AllocateT__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllocateT__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAllocateTAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:877:2: ( ( rule__AllocateT__Group_3_1__0 ) )
                    {
                    // InternalMyDsl.g:877:2: ( ( rule__AllocateT__Group_3_1__0 ) )
                    // InternalMyDsl.g:878:3: ( rule__AllocateT__Group_3_1__0 )
                    {
                     before(grammarAccess.getAllocateTAccess().getGroup_3_1()); 
                    // InternalMyDsl.g:879:3: ( rule__AllocateT__Group_3_1__0 )
                    // InternalMyDsl.g:879:4: rule__AllocateT__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AllocateT__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAllocateTAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Alternatives_3"


    // $ANTLR start "rule__Closest__Alternatives_2"
    // InternalMyDsl.g:887:1: rule__Closest__Alternatives_2 : ( ( ( rule__Closest__Group_2_0__0 ) ) | ( ( rule__Closest__Group_2_1__0 ) ) | ( ( rule__Closest__Group_2_2__0 ) ) | ( ( rule__Closest__Group_2_3__0 ) ) );
    public final void rule__Closest__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:1: ( ( ( rule__Closest__Group_2_0__0 ) ) | ( ( rule__Closest__Group_2_1__0 ) ) | ( ( rule__Closest__Group_2_2__0 ) ) | ( ( rule__Closest__Group_2_3__0 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt11=1;
                }
                break;
            case 65:
                {
                alt11=2;
                }
                break;
            case 67:
                {
                alt11=3;
                }
                break;
            case 73:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:892:2: ( ( rule__Closest__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:892:2: ( ( rule__Closest__Group_2_0__0 ) )
                    // InternalMyDsl.g:893:3: ( rule__Closest__Group_2_0__0 )
                    {
                     before(grammarAccess.getClosestAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:894:3: ( rule__Closest__Group_2_0__0 )
                    // InternalMyDsl.g:894:4: rule__Closest__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Closest__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClosestAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:898:2: ( ( rule__Closest__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:898:2: ( ( rule__Closest__Group_2_1__0 ) )
                    // InternalMyDsl.g:899:3: ( rule__Closest__Group_2_1__0 )
                    {
                     before(grammarAccess.getClosestAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:900:3: ( rule__Closest__Group_2_1__0 )
                    // InternalMyDsl.g:900:4: rule__Closest__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Closest__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClosestAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:904:2: ( ( rule__Closest__Group_2_2__0 ) )
                    {
                    // InternalMyDsl.g:904:2: ( ( rule__Closest__Group_2_2__0 ) )
                    // InternalMyDsl.g:905:3: ( rule__Closest__Group_2_2__0 )
                    {
                     before(grammarAccess.getClosestAccess().getGroup_2_2()); 
                    // InternalMyDsl.g:906:3: ( rule__Closest__Group_2_2__0 )
                    // InternalMyDsl.g:906:4: rule__Closest__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Closest__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClosestAccess().getGroup_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:910:2: ( ( rule__Closest__Group_2_3__0 ) )
                    {
                    // InternalMyDsl.g:910:2: ( ( rule__Closest__Group_2_3__0 ) )
                    // InternalMyDsl.g:911:3: ( rule__Closest__Group_2_3__0 )
                    {
                     before(grammarAccess.getClosestAccess().getGroup_2_3()); 
                    // InternalMyDsl.g:912:3: ( rule__Closest__Group_2_3__0 )
                    // InternalMyDsl.g:912:4: rule__Closest__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Closest__Group_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClosestAccess().getGroup_2_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Alternatives_2"


    // $ANTLR start "rule__MaxTasks__Alternatives_5"
    // InternalMyDsl.g:920:1: rule__MaxTasks__Alternatives_5 : ( ( ( rule__MaxTasks__Group_5_0__0 ) ) | ( ( rule__MaxTasks__Group_5_1__0 ) ) );
    public final void rule__MaxTasks__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:924:1: ( ( ( rule__MaxTasks__Group_5_0__0 ) ) | ( ( rule__MaxTasks__Group_5_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==86) ) {
                alt12=1;
            }
            else if ( (LA12_0==72) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:925:2: ( ( rule__MaxTasks__Group_5_0__0 ) )
                    {
                    // InternalMyDsl.g:925:2: ( ( rule__MaxTasks__Group_5_0__0 ) )
                    // InternalMyDsl.g:926:3: ( rule__MaxTasks__Group_5_0__0 )
                    {
                     before(grammarAccess.getMaxTasksAccess().getGroup_5_0()); 
                    // InternalMyDsl.g:927:3: ( rule__MaxTasks__Group_5_0__0 )
                    // InternalMyDsl.g:927:4: rule__MaxTasks__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxTasks__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMaxTasksAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:931:2: ( ( rule__MaxTasks__Group_5_1__0 ) )
                    {
                    // InternalMyDsl.g:931:2: ( ( rule__MaxTasks__Group_5_1__0 ) )
                    // InternalMyDsl.g:932:3: ( rule__MaxTasks__Group_5_1__0 )
                    {
                     before(grammarAccess.getMaxTasksAccess().getGroup_5_1()); 
                    // InternalMyDsl.g:933:3: ( rule__MaxTasks__Group_5_1__0 )
                    // InternalMyDsl.g:933:4: rule__MaxTasks__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxTasks__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMaxTasksAccess().getGroup_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Alternatives_5"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:941:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:945:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:946:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:946:2: ( RULE_STRING )
                    // InternalMyDsl.g:947:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:952:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:952:2: ( RULE_ID )
                    // InternalMyDsl.g:953:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalMyDsl.g:962:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:1: ( ( 'E' ) | ( 'e' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:967:2: ( 'E' )
                    {
                    // InternalMyDsl.g:967:2: ( 'E' )
                    // InternalMyDsl.g:968:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:973:2: ( 'e' )
                    {
                    // InternalMyDsl.g:973:2: ( 'e' )
                    // InternalMyDsl.g:974:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Objective__Alternatives"
    // InternalMyDsl.g:983:1: rule__Objective__Alternatives : ( ( ( 'minimiseIdle' ) ) | ( ( 'minimiseTravel' ) ) | ( ( 'maximiseSuccess' ) ) );
    public final void rule__Objective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( ( ( 'minimiseIdle' ) ) | ( ( 'minimiseTravel' ) ) | ( ( 'maximiseSuccess' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt15=1;
                }
                break;
            case 16:
                {
                alt15=2;
                }
                break;
            case 17:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:988:2: ( ( 'minimiseIdle' ) )
                    {
                    // InternalMyDsl.g:988:2: ( ( 'minimiseIdle' ) )
                    // InternalMyDsl.g:989:3: ( 'minimiseIdle' )
                    {
                     before(grammarAccess.getObjectiveAccess().getMinIdleEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:990:3: ( 'minimiseIdle' )
                    // InternalMyDsl.g:990:4: 'minimiseIdle'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getObjectiveAccess().getMinIdleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:994:2: ( ( 'minimiseTravel' ) )
                    {
                    // InternalMyDsl.g:994:2: ( ( 'minimiseTravel' ) )
                    // InternalMyDsl.g:995:3: ( 'minimiseTravel' )
                    {
                     before(grammarAccess.getObjectiveAccess().getMinTravelEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:996:3: ( 'minimiseTravel' )
                    // InternalMyDsl.g:996:4: 'minimiseTravel'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getObjectiveAccess().getMinTravelEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1000:2: ( ( 'maximiseSuccess' ) )
                    {
                    // InternalMyDsl.g:1000:2: ( ( 'maximiseSuccess' ) )
                    // InternalMyDsl.g:1001:3: ( 'maximiseSuccess' )
                    {
                     before(grammarAccess.getObjectiveAccess().getMaxSuccEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1002:3: ( 'maximiseSuccess' )
                    // InternalMyDsl.g:1002:4: 'maximiseSuccess'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getObjectiveAccess().getMaxSuccEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objective__Alternatives"


    // $ANTLR start "rule__XY__Alternatives"
    // InternalMyDsl.g:1010:1: rule__XY__Alternatives : ( ( ( 'x' ) ) | ( ( 'y' ) ) );
    public final void rule__XY__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( ( ( 'x' ) ) | ( ( 'y' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            else if ( (LA16_0==19) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1015:2: ( ( 'x' ) )
                    {
                    // InternalMyDsl.g:1015:2: ( ( 'x' ) )
                    // InternalMyDsl.g:1016:3: ( 'x' )
                    {
                     before(grammarAccess.getXYAccess().getXEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1017:3: ( 'x' )
                    // InternalMyDsl.g:1017:4: 'x'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getXYAccess().getXEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1021:2: ( ( 'y' ) )
                    {
                    // InternalMyDsl.g:1021:2: ( ( 'y' ) )
                    // InternalMyDsl.g:1022:3: ( 'y' )
                    {
                     before(grammarAccess.getXYAccess().getYEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1023:3: ( 'y' )
                    // InternalMyDsl.g:1023:4: 'y'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getXYAccess().getYEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XY__Alternatives"


    // $ANTLR start "rule__LowerGreater__Alternatives"
    // InternalMyDsl.g:1031:1: rule__LowerGreater__Alternatives : ( ( ( 'lower' ) ) | ( ( 'greater' ) ) );
    public final void rule__LowerGreater__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( ( ( 'lower' ) ) | ( ( 'greater' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            else if ( (LA17_0==21) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1036:2: ( ( 'lower' ) )
                    {
                    // InternalMyDsl.g:1036:2: ( ( 'lower' ) )
                    // InternalMyDsl.g:1037:3: ( 'lower' )
                    {
                     before(grammarAccess.getLowerGreaterAccess().getLowerEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1038:3: ( 'lower' )
                    // InternalMyDsl.g:1038:4: 'lower'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowerGreaterAccess().getLowerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1042:2: ( ( 'greater' ) )
                    {
                    // InternalMyDsl.g:1042:2: ( ( 'greater' ) )
                    // InternalMyDsl.g:1043:3: ( 'greater' )
                    {
                     before(grammarAccess.getLowerGreaterAccess().getGreaterEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1044:3: ( 'greater' )
                    // InternalMyDsl.g:1044:4: 'greater'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getLowerGreaterAccess().getGreaterEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerGreater__Alternatives"


    // $ANTLR start "rule__StartEnd__Alternatives"
    // InternalMyDsl.g:1052:1: rule__StartEnd__Alternatives : ( ( ( 'end before' ) ) | ( ( 'start after' ) ) );
    public final void rule__StartEnd__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1056:1: ( ( ( 'end before' ) ) | ( ( 'start after' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            else if ( (LA18_0==23) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1057:2: ( ( 'end before' ) )
                    {
                    // InternalMyDsl.g:1057:2: ( ( 'end before' ) )
                    // InternalMyDsl.g:1058:3: ( 'end before' )
                    {
                     before(grammarAccess.getStartEndAccess().getEndEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1059:3: ( 'end before' )
                    // InternalMyDsl.g:1059:4: 'end before'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getStartEndAccess().getEndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1063:2: ( ( 'start after' ) )
                    {
                    // InternalMyDsl.g:1063:2: ( ( 'start after' ) )
                    // InternalMyDsl.g:1064:3: ( 'start after' )
                    {
                     before(grammarAccess.getStartEndAccess().getStartEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1065:3: ( 'start after' )
                    // InternalMyDsl.g:1065:4: 'start after'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getStartEndAccess().getStartEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartEnd__Alternatives"


    // $ANTLR start "rule__ProblemSpecification__Group__0"
    // InternalMyDsl.g:1073:1: rule__ProblemSpecification__Group__0 : rule__ProblemSpecification__Group__0__Impl rule__ProblemSpecification__Group__1 ;
    public final void rule__ProblemSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1077:1: ( rule__ProblemSpecification__Group__0__Impl rule__ProblemSpecification__Group__1 )
            // InternalMyDsl.g:1078:2: rule__ProblemSpecification__Group__0__Impl rule__ProblemSpecification__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ProblemSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__0"


    // $ANTLR start "rule__ProblemSpecification__Group__0__Impl"
    // InternalMyDsl.g:1085:1: rule__ProblemSpecification__Group__0__Impl : ( 'ProblemSpecification' ) ;
    public final void rule__ProblemSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( ( 'ProblemSpecification' ) )
            // InternalMyDsl.g:1090:1: ( 'ProblemSpecification' )
            {
            // InternalMyDsl.g:1090:1: ( 'ProblemSpecification' )
            // InternalMyDsl.g:1091:2: 'ProblemSpecification'
            {
             before(grammarAccess.getProblemSpecificationAccess().getProblemSpecificationKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getProblemSpecificationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__0__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__1"
    // InternalMyDsl.g:1100:1: rule__ProblemSpecification__Group__1 : rule__ProblemSpecification__Group__1__Impl rule__ProblemSpecification__Group__2 ;
    public final void rule__ProblemSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( rule__ProblemSpecification__Group__1__Impl rule__ProblemSpecification__Group__2 )
            // InternalMyDsl.g:1105:2: rule__ProblemSpecification__Group__1__Impl rule__ProblemSpecification__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ProblemSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__1"


    // $ANTLR start "rule__ProblemSpecification__Group__1__Impl"
    // InternalMyDsl.g:1112:1: rule__ProblemSpecification__Group__1__Impl : ( '{' ) ;
    public final void rule__ProblemSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1116:1: ( ( '{' ) )
            // InternalMyDsl.g:1117:1: ( '{' )
            {
            // InternalMyDsl.g:1117:1: ( '{' )
            // InternalMyDsl.g:1118:2: '{'
            {
             before(grammarAccess.getProblemSpecificationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__1__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__2"
    // InternalMyDsl.g:1127:1: rule__ProblemSpecification__Group__2 : rule__ProblemSpecification__Group__2__Impl rule__ProblemSpecification__Group__3 ;
    public final void rule__ProblemSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( rule__ProblemSpecification__Group__2__Impl rule__ProblemSpecification__Group__3 )
            // InternalMyDsl.g:1132:2: rule__ProblemSpecification__Group__2__Impl rule__ProblemSpecification__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ProblemSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__2"


    // $ANTLR start "rule__ProblemSpecification__Group__2__Impl"
    // InternalMyDsl.g:1139:1: rule__ProblemSpecification__Group__2__Impl : ( 'WorldModel' ) ;
    public final void rule__ProblemSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1143:1: ( ( 'WorldModel' ) )
            // InternalMyDsl.g:1144:1: ( 'WorldModel' )
            {
            // InternalMyDsl.g:1144:1: ( 'WorldModel' )
            // InternalMyDsl.g:1145:2: 'WorldModel'
            {
             before(grammarAccess.getProblemSpecificationAccess().getWorldModelKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getWorldModelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__2__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__3"
    // InternalMyDsl.g:1154:1: rule__ProblemSpecification__Group__3 : rule__ProblemSpecification__Group__3__Impl rule__ProblemSpecification__Group__4 ;
    public final void rule__ProblemSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1158:1: ( rule__ProblemSpecification__Group__3__Impl rule__ProblemSpecification__Group__4 )
            // InternalMyDsl.g:1159:2: rule__ProblemSpecification__Group__3__Impl rule__ProblemSpecification__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ProblemSpecification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__3"


    // $ANTLR start "rule__ProblemSpecification__Group__3__Impl"
    // InternalMyDsl.g:1166:1: rule__ProblemSpecification__Group__3__Impl : ( ':' ) ;
    public final void rule__ProblemSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( ( ':' ) )
            // InternalMyDsl.g:1171:1: ( ':' )
            {
            // InternalMyDsl.g:1171:1: ( ':' )
            // InternalMyDsl.g:1172:2: ':'
            {
             before(grammarAccess.getProblemSpecificationAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__3__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__4"
    // InternalMyDsl.g:1181:1: rule__ProblemSpecification__Group__4 : rule__ProblemSpecification__Group__4__Impl rule__ProblemSpecification__Group__5 ;
    public final void rule__ProblemSpecification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1185:1: ( rule__ProblemSpecification__Group__4__Impl rule__ProblemSpecification__Group__5 )
            // InternalMyDsl.g:1186:2: rule__ProblemSpecification__Group__4__Impl rule__ProblemSpecification__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ProblemSpecification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__4"


    // $ANTLR start "rule__ProblemSpecification__Group__4__Impl"
    // InternalMyDsl.g:1193:1: rule__ProblemSpecification__Group__4__Impl : ( ( rule__ProblemSpecification__WorldModelAssignment_4 ) ) ;
    public final void rule__ProblemSpecification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1197:1: ( ( ( rule__ProblemSpecification__WorldModelAssignment_4 ) ) )
            // InternalMyDsl.g:1198:1: ( ( rule__ProblemSpecification__WorldModelAssignment_4 ) )
            {
            // InternalMyDsl.g:1198:1: ( ( rule__ProblemSpecification__WorldModelAssignment_4 ) )
            // InternalMyDsl.g:1199:2: ( rule__ProblemSpecification__WorldModelAssignment_4 )
            {
             before(grammarAccess.getProblemSpecificationAccess().getWorldModelAssignment_4()); 
            // InternalMyDsl.g:1200:2: ( rule__ProblemSpecification__WorldModelAssignment_4 )
            // InternalMyDsl.g:1200:3: rule__ProblemSpecification__WorldModelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__WorldModelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getProblemSpecificationAccess().getWorldModelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__4__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__5"
    // InternalMyDsl.g:1208:1: rule__ProblemSpecification__Group__5 : rule__ProblemSpecification__Group__5__Impl rule__ProblemSpecification__Group__6 ;
    public final void rule__ProblemSpecification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1212:1: ( rule__ProblemSpecification__Group__5__Impl rule__ProblemSpecification__Group__6 )
            // InternalMyDsl.g:1213:2: rule__ProblemSpecification__Group__5__Impl rule__ProblemSpecification__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__ProblemSpecification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__5"


    // $ANTLR start "rule__ProblemSpecification__Group__5__Impl"
    // InternalMyDsl.g:1220:1: rule__ProblemSpecification__Group__5__Impl : ( ( rule__ProblemSpecification__WorldModelAssignment_5 )* ) ;
    public final void rule__ProblemSpecification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( ( ( rule__ProblemSpecification__WorldModelAssignment_5 )* ) )
            // InternalMyDsl.g:1225:1: ( ( rule__ProblemSpecification__WorldModelAssignment_5 )* )
            {
            // InternalMyDsl.g:1225:1: ( ( rule__ProblemSpecification__WorldModelAssignment_5 )* )
            // InternalMyDsl.g:1226:2: ( rule__ProblemSpecification__WorldModelAssignment_5 )*
            {
             before(grammarAccess.getProblemSpecificationAccess().getWorldModelAssignment_5()); 
            // InternalMyDsl.g:1227:2: ( rule__ProblemSpecification__WorldModelAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)||LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1227:3: rule__ProblemSpecification__WorldModelAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ProblemSpecification__WorldModelAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getProblemSpecificationAccess().getWorldModelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__5__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__6"
    // InternalMyDsl.g:1235:1: rule__ProblemSpecification__Group__6 : rule__ProblemSpecification__Group__6__Impl rule__ProblemSpecification__Group__7 ;
    public final void rule__ProblemSpecification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1239:1: ( rule__ProblemSpecification__Group__6__Impl rule__ProblemSpecification__Group__7 )
            // InternalMyDsl.g:1240:2: rule__ProblemSpecification__Group__6__Impl rule__ProblemSpecification__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__ProblemSpecification__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__6"


    // $ANTLR start "rule__ProblemSpecification__Group__6__Impl"
    // InternalMyDsl.g:1247:1: rule__ProblemSpecification__Group__6__Impl : ( 'TasksModel' ) ;
    public final void rule__ProblemSpecification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( ( 'TasksModel' ) )
            // InternalMyDsl.g:1252:1: ( 'TasksModel' )
            {
            // InternalMyDsl.g:1252:1: ( 'TasksModel' )
            // InternalMyDsl.g:1253:2: 'TasksModel'
            {
             before(grammarAccess.getProblemSpecificationAccess().getTasksModelKeyword_6()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getTasksModelKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__6__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__7"
    // InternalMyDsl.g:1262:1: rule__ProblemSpecification__Group__7 : rule__ProblemSpecification__Group__7__Impl rule__ProblemSpecification__Group__8 ;
    public final void rule__ProblemSpecification__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1266:1: ( rule__ProblemSpecification__Group__7__Impl rule__ProblemSpecification__Group__8 )
            // InternalMyDsl.g:1267:2: rule__ProblemSpecification__Group__7__Impl rule__ProblemSpecification__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__ProblemSpecification__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__7"


    // $ANTLR start "rule__ProblemSpecification__Group__7__Impl"
    // InternalMyDsl.g:1274:1: rule__ProblemSpecification__Group__7__Impl : ( ':' ) ;
    public final void rule__ProblemSpecification__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1278:1: ( ( ':' ) )
            // InternalMyDsl.g:1279:1: ( ':' )
            {
            // InternalMyDsl.g:1279:1: ( ':' )
            // InternalMyDsl.g:1280:2: ':'
            {
             before(grammarAccess.getProblemSpecificationAccess().getColonKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__7__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__8"
    // InternalMyDsl.g:1289:1: rule__ProblemSpecification__Group__8 : rule__ProblemSpecification__Group__8__Impl rule__ProblemSpecification__Group__9 ;
    public final void rule__ProblemSpecification__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1293:1: ( rule__ProblemSpecification__Group__8__Impl rule__ProblemSpecification__Group__9 )
            // InternalMyDsl.g:1294:2: rule__ProblemSpecification__Group__8__Impl rule__ProblemSpecification__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__ProblemSpecification__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__8"


    // $ANTLR start "rule__ProblemSpecification__Group__8__Impl"
    // InternalMyDsl.g:1301:1: rule__ProblemSpecification__Group__8__Impl : ( ( rule__ProblemSpecification__TasksModelAssignment_8 ) ) ;
    public final void rule__ProblemSpecification__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1305:1: ( ( ( rule__ProblemSpecification__TasksModelAssignment_8 ) ) )
            // InternalMyDsl.g:1306:1: ( ( rule__ProblemSpecification__TasksModelAssignment_8 ) )
            {
            // InternalMyDsl.g:1306:1: ( ( rule__ProblemSpecification__TasksModelAssignment_8 ) )
            // InternalMyDsl.g:1307:2: ( rule__ProblemSpecification__TasksModelAssignment_8 )
            {
             before(grammarAccess.getProblemSpecificationAccess().getTasksModelAssignment_8()); 
            // InternalMyDsl.g:1308:2: ( rule__ProblemSpecification__TasksModelAssignment_8 )
            // InternalMyDsl.g:1308:3: rule__ProblemSpecification__TasksModelAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__TasksModelAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getProblemSpecificationAccess().getTasksModelAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__8__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__9"
    // InternalMyDsl.g:1316:1: rule__ProblemSpecification__Group__9 : rule__ProblemSpecification__Group__9__Impl rule__ProblemSpecification__Group__10 ;
    public final void rule__ProblemSpecification__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1320:1: ( rule__ProblemSpecification__Group__9__Impl rule__ProblemSpecification__Group__10 )
            // InternalMyDsl.g:1321:2: rule__ProblemSpecification__Group__9__Impl rule__ProblemSpecification__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__ProblemSpecification__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__9"


    // $ANTLR start "rule__ProblemSpecification__Group__9__Impl"
    // InternalMyDsl.g:1328:1: rule__ProblemSpecification__Group__9__Impl : ( ( rule__ProblemSpecification__Group_9__0 )* ) ;
    public final void rule__ProblemSpecification__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( ( ( rule__ProblemSpecification__Group_9__0 )* ) )
            // InternalMyDsl.g:1333:1: ( ( rule__ProblemSpecification__Group_9__0 )* )
            {
            // InternalMyDsl.g:1333:1: ( ( rule__ProblemSpecification__Group_9__0 )* )
            // InternalMyDsl.g:1334:2: ( rule__ProblemSpecification__Group_9__0 )*
            {
             before(grammarAccess.getProblemSpecificationAccess().getGroup_9()); 
            // InternalMyDsl.g:1335:2: ( rule__ProblemSpecification__Group_9__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1335:3: rule__ProblemSpecification__Group_9__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ProblemSpecification__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getProblemSpecificationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__9__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__10"
    // InternalMyDsl.g:1343:1: rule__ProblemSpecification__Group__10 : rule__ProblemSpecification__Group__10__Impl rule__ProblemSpecification__Group__11 ;
    public final void rule__ProblemSpecification__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1347:1: ( rule__ProblemSpecification__Group__10__Impl rule__ProblemSpecification__Group__11 )
            // InternalMyDsl.g:1348:2: rule__ProblemSpecification__Group__10__Impl rule__ProblemSpecification__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__ProblemSpecification__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__10"


    // $ANTLR start "rule__ProblemSpecification__Group__10__Impl"
    // InternalMyDsl.g:1355:1: rule__ProblemSpecification__Group__10__Impl : ( 'RobotsModel' ) ;
    public final void rule__ProblemSpecification__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1359:1: ( ( 'RobotsModel' ) )
            // InternalMyDsl.g:1360:1: ( 'RobotsModel' )
            {
            // InternalMyDsl.g:1360:1: ( 'RobotsModel' )
            // InternalMyDsl.g:1361:2: 'RobotsModel'
            {
             before(grammarAccess.getProblemSpecificationAccess().getRobotsModelKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getRobotsModelKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__10__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__11"
    // InternalMyDsl.g:1370:1: rule__ProblemSpecification__Group__11 : rule__ProblemSpecification__Group__11__Impl rule__ProblemSpecification__Group__12 ;
    public final void rule__ProblemSpecification__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1374:1: ( rule__ProblemSpecification__Group__11__Impl rule__ProblemSpecification__Group__12 )
            // InternalMyDsl.g:1375:2: rule__ProblemSpecification__Group__11__Impl rule__ProblemSpecification__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__ProblemSpecification__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__11"


    // $ANTLR start "rule__ProblemSpecification__Group__11__Impl"
    // InternalMyDsl.g:1382:1: rule__ProblemSpecification__Group__11__Impl : ( ':' ) ;
    public final void rule__ProblemSpecification__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1386:1: ( ( ':' ) )
            // InternalMyDsl.g:1387:1: ( ':' )
            {
            // InternalMyDsl.g:1387:1: ( ':' )
            // InternalMyDsl.g:1388:2: ':'
            {
             before(grammarAccess.getProblemSpecificationAccess().getColonKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__11__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__12"
    // InternalMyDsl.g:1397:1: rule__ProblemSpecification__Group__12 : rule__ProblemSpecification__Group__12__Impl rule__ProblemSpecification__Group__13 ;
    public final void rule__ProblemSpecification__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1401:1: ( rule__ProblemSpecification__Group__12__Impl rule__ProblemSpecification__Group__13 )
            // InternalMyDsl.g:1402:2: rule__ProblemSpecification__Group__12__Impl rule__ProblemSpecification__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__ProblemSpecification__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__12"


    // $ANTLR start "rule__ProblemSpecification__Group__12__Impl"
    // InternalMyDsl.g:1409:1: rule__ProblemSpecification__Group__12__Impl : ( ( rule__ProblemSpecification__RobotsModelAssignment_12 ) ) ;
    public final void rule__ProblemSpecification__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( ( ( rule__ProblemSpecification__RobotsModelAssignment_12 ) ) )
            // InternalMyDsl.g:1414:1: ( ( rule__ProblemSpecification__RobotsModelAssignment_12 ) )
            {
            // InternalMyDsl.g:1414:1: ( ( rule__ProblemSpecification__RobotsModelAssignment_12 ) )
            // InternalMyDsl.g:1415:2: ( rule__ProblemSpecification__RobotsModelAssignment_12 )
            {
             before(grammarAccess.getProblemSpecificationAccess().getRobotsModelAssignment_12()); 
            // InternalMyDsl.g:1416:2: ( rule__ProblemSpecification__RobotsModelAssignment_12 )
            // InternalMyDsl.g:1416:3: rule__ProblemSpecification__RobotsModelAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__RobotsModelAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getProblemSpecificationAccess().getRobotsModelAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__12__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__13"
    // InternalMyDsl.g:1424:1: rule__ProblemSpecification__Group__13 : rule__ProblemSpecification__Group__13__Impl rule__ProblemSpecification__Group__14 ;
    public final void rule__ProblemSpecification__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1428:1: ( rule__ProblemSpecification__Group__13__Impl rule__ProblemSpecification__Group__14 )
            // InternalMyDsl.g:1429:2: rule__ProblemSpecification__Group__13__Impl rule__ProblemSpecification__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__ProblemSpecification__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__13"


    // $ANTLR start "rule__ProblemSpecification__Group__13__Impl"
    // InternalMyDsl.g:1436:1: rule__ProblemSpecification__Group__13__Impl : ( ( rule__ProblemSpecification__Group_13__0 )* ) ;
    public final void rule__ProblemSpecification__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1440:1: ( ( ( rule__ProblemSpecification__Group_13__0 )* ) )
            // InternalMyDsl.g:1441:1: ( ( rule__ProblemSpecification__Group_13__0 )* )
            {
            // InternalMyDsl.g:1441:1: ( ( rule__ProblemSpecification__Group_13__0 )* )
            // InternalMyDsl.g:1442:2: ( rule__ProblemSpecification__Group_13__0 )*
            {
             before(grammarAccess.getProblemSpecificationAccess().getGroup_13()); 
            // InternalMyDsl.g:1443:2: ( rule__ProblemSpecification__Group_13__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==32) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1443:3: rule__ProblemSpecification__Group_13__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ProblemSpecification__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getProblemSpecificationAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__13__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__14"
    // InternalMyDsl.g:1451:1: rule__ProblemSpecification__Group__14 : rule__ProblemSpecification__Group__14__Impl rule__ProblemSpecification__Group__15 ;
    public final void rule__ProblemSpecification__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1455:1: ( rule__ProblemSpecification__Group__14__Impl rule__ProblemSpecification__Group__15 )
            // InternalMyDsl.g:1456:2: rule__ProblemSpecification__Group__14__Impl rule__ProblemSpecification__Group__15
            {
            pushFollow(FOLLOW_5);
            rule__ProblemSpecification__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__14"


    // $ANTLR start "rule__ProblemSpecification__Group__14__Impl"
    // InternalMyDsl.g:1463:1: rule__ProblemSpecification__Group__14__Impl : ( 'Mission' ) ;
    public final void rule__ProblemSpecification__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1467:1: ( ( 'Mission' ) )
            // InternalMyDsl.g:1468:1: ( 'Mission' )
            {
            // InternalMyDsl.g:1468:1: ( 'Mission' )
            // InternalMyDsl.g:1469:2: 'Mission'
            {
             before(grammarAccess.getProblemSpecificationAccess().getMissionKeyword_14()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getMissionKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__14__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__15"
    // InternalMyDsl.g:1478:1: rule__ProblemSpecification__Group__15 : rule__ProblemSpecification__Group__15__Impl rule__ProblemSpecification__Group__16 ;
    public final void rule__ProblemSpecification__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1482:1: ( rule__ProblemSpecification__Group__15__Impl rule__ProblemSpecification__Group__16 )
            // InternalMyDsl.g:1483:2: rule__ProblemSpecification__Group__15__Impl rule__ProblemSpecification__Group__16
            {
            pushFollow(FOLLOW_9);
            rule__ProblemSpecification__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__15"


    // $ANTLR start "rule__ProblemSpecification__Group__15__Impl"
    // InternalMyDsl.g:1490:1: rule__ProblemSpecification__Group__15__Impl : ( ':' ) ;
    public final void rule__ProblemSpecification__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( ( ':' ) )
            // InternalMyDsl.g:1495:1: ( ':' )
            {
            // InternalMyDsl.g:1495:1: ( ':' )
            // InternalMyDsl.g:1496:2: ':'
            {
             before(grammarAccess.getProblemSpecificationAccess().getColonKeyword_15()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getColonKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__15__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__16"
    // InternalMyDsl.g:1505:1: rule__ProblemSpecification__Group__16 : rule__ProblemSpecification__Group__16__Impl rule__ProblemSpecification__Group__17 ;
    public final void rule__ProblemSpecification__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1509:1: ( rule__ProblemSpecification__Group__16__Impl rule__ProblemSpecification__Group__17 )
            // InternalMyDsl.g:1510:2: rule__ProblemSpecification__Group__16__Impl rule__ProblemSpecification__Group__17
            {
            pushFollow(FOLLOW_13);
            rule__ProblemSpecification__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__16"


    // $ANTLR start "rule__ProblemSpecification__Group__16__Impl"
    // InternalMyDsl.g:1517:1: rule__ProblemSpecification__Group__16__Impl : ( ( rule__ProblemSpecification__MissionAssignment_16 ) ) ;
    public final void rule__ProblemSpecification__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1521:1: ( ( ( rule__ProblemSpecification__MissionAssignment_16 ) ) )
            // InternalMyDsl.g:1522:1: ( ( rule__ProblemSpecification__MissionAssignment_16 ) )
            {
            // InternalMyDsl.g:1522:1: ( ( rule__ProblemSpecification__MissionAssignment_16 ) )
            // InternalMyDsl.g:1523:2: ( rule__ProblemSpecification__MissionAssignment_16 )
            {
             before(grammarAccess.getProblemSpecificationAccess().getMissionAssignment_16()); 
            // InternalMyDsl.g:1524:2: ( rule__ProblemSpecification__MissionAssignment_16 )
            // InternalMyDsl.g:1524:3: rule__ProblemSpecification__MissionAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__MissionAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getProblemSpecificationAccess().getMissionAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__16__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__17"
    // InternalMyDsl.g:1532:1: rule__ProblemSpecification__Group__17 : rule__ProblemSpecification__Group__17__Impl rule__ProblemSpecification__Group__18 ;
    public final void rule__ProblemSpecification__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1536:1: ( rule__ProblemSpecification__Group__17__Impl rule__ProblemSpecification__Group__18 )
            // InternalMyDsl.g:1537:2: rule__ProblemSpecification__Group__17__Impl rule__ProblemSpecification__Group__18
            {
            pushFollow(FOLLOW_13);
            rule__ProblemSpecification__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__17"


    // $ANTLR start "rule__ProblemSpecification__Group__17__Impl"
    // InternalMyDsl.g:1544:1: rule__ProblemSpecification__Group__17__Impl : ( ( rule__ProblemSpecification__Group_17__0 )* ) ;
    public final void rule__ProblemSpecification__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1548:1: ( ( ( rule__ProblemSpecification__Group_17__0 )* ) )
            // InternalMyDsl.g:1549:1: ( ( rule__ProblemSpecification__Group_17__0 )* )
            {
            // InternalMyDsl.g:1549:1: ( ( rule__ProblemSpecification__Group_17__0 )* )
            // InternalMyDsl.g:1550:2: ( rule__ProblemSpecification__Group_17__0 )*
            {
             before(grammarAccess.getProblemSpecificationAccess().getGroup_17()); 
            // InternalMyDsl.g:1551:2: ( rule__ProblemSpecification__Group_17__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1551:3: rule__ProblemSpecification__Group_17__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ProblemSpecification__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getProblemSpecificationAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__17__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group__18"
    // InternalMyDsl.g:1559:1: rule__ProblemSpecification__Group__18 : rule__ProblemSpecification__Group__18__Impl ;
    public final void rule__ProblemSpecification__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1563:1: ( rule__ProblemSpecification__Group__18__Impl )
            // InternalMyDsl.g:1564:2: rule__ProblemSpecification__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__18"


    // $ANTLR start "rule__ProblemSpecification__Group__18__Impl"
    // InternalMyDsl.g:1570:1: rule__ProblemSpecification__Group__18__Impl : ( '}' ) ;
    public final void rule__ProblemSpecification__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( ( '}' ) )
            // InternalMyDsl.g:1575:1: ( '}' )
            {
            // InternalMyDsl.g:1575:1: ( '}' )
            // InternalMyDsl.g:1576:2: '}'
            {
             before(grammarAccess.getProblemSpecificationAccess().getRightCurlyBracketKeyword_18()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group__18__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group_9__0"
    // InternalMyDsl.g:1586:1: rule__ProblemSpecification__Group_9__0 : rule__ProblemSpecification__Group_9__0__Impl rule__ProblemSpecification__Group_9__1 ;
    public final void rule__ProblemSpecification__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1590:1: ( rule__ProblemSpecification__Group_9__0__Impl rule__ProblemSpecification__Group_9__1 )
            // InternalMyDsl.g:1591:2: rule__ProblemSpecification__Group_9__0__Impl rule__ProblemSpecification__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__ProblemSpecification__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_9__0"


    // $ANTLR start "rule__ProblemSpecification__Group_9__0__Impl"
    // InternalMyDsl.g:1598:1: rule__ProblemSpecification__Group_9__0__Impl : ( ',' ) ;
    public final void rule__ProblemSpecification__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1602:1: ( ( ',' ) )
            // InternalMyDsl.g:1603:1: ( ',' )
            {
            // InternalMyDsl.g:1603:1: ( ',' )
            // InternalMyDsl.g:1604:2: ','
            {
             before(grammarAccess.getProblemSpecificationAccess().getCommaKeyword_9_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_9__0__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group_9__1"
    // InternalMyDsl.g:1613:1: rule__ProblemSpecification__Group_9__1 : rule__ProblemSpecification__Group_9__1__Impl ;
    public final void rule__ProblemSpecification__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1617:1: ( rule__ProblemSpecification__Group_9__1__Impl )
            // InternalMyDsl.g:1618:2: rule__ProblemSpecification__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_9__1"


    // $ANTLR start "rule__ProblemSpecification__Group_9__1__Impl"
    // InternalMyDsl.g:1624:1: rule__ProblemSpecification__Group_9__1__Impl : ( ( rule__ProblemSpecification__TasksModelAssignment_9_1 ) ) ;
    public final void rule__ProblemSpecification__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( ( ( rule__ProblemSpecification__TasksModelAssignment_9_1 ) ) )
            // InternalMyDsl.g:1629:1: ( ( rule__ProblemSpecification__TasksModelAssignment_9_1 ) )
            {
            // InternalMyDsl.g:1629:1: ( ( rule__ProblemSpecification__TasksModelAssignment_9_1 ) )
            // InternalMyDsl.g:1630:2: ( rule__ProblemSpecification__TasksModelAssignment_9_1 )
            {
             before(grammarAccess.getProblemSpecificationAccess().getTasksModelAssignment_9_1()); 
            // InternalMyDsl.g:1631:2: ( rule__ProblemSpecification__TasksModelAssignment_9_1 )
            // InternalMyDsl.g:1631:3: rule__ProblemSpecification__TasksModelAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__TasksModelAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemSpecificationAccess().getTasksModelAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_9__1__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group_13__0"
    // InternalMyDsl.g:1640:1: rule__ProblemSpecification__Group_13__0 : rule__ProblemSpecification__Group_13__0__Impl rule__ProblemSpecification__Group_13__1 ;
    public final void rule__ProblemSpecification__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1644:1: ( rule__ProblemSpecification__Group_13__0__Impl rule__ProblemSpecification__Group_13__1 )
            // InternalMyDsl.g:1645:2: rule__ProblemSpecification__Group_13__0__Impl rule__ProblemSpecification__Group_13__1
            {
            pushFollow(FOLLOW_9);
            rule__ProblemSpecification__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_13__0"


    // $ANTLR start "rule__ProblemSpecification__Group_13__0__Impl"
    // InternalMyDsl.g:1652:1: rule__ProblemSpecification__Group_13__0__Impl : ( ',' ) ;
    public final void rule__ProblemSpecification__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( ( ',' ) )
            // InternalMyDsl.g:1657:1: ( ',' )
            {
            // InternalMyDsl.g:1657:1: ( ',' )
            // InternalMyDsl.g:1658:2: ','
            {
             before(grammarAccess.getProblemSpecificationAccess().getCommaKeyword_13_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_13__0__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group_13__1"
    // InternalMyDsl.g:1667:1: rule__ProblemSpecification__Group_13__1 : rule__ProblemSpecification__Group_13__1__Impl ;
    public final void rule__ProblemSpecification__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1671:1: ( rule__ProblemSpecification__Group_13__1__Impl )
            // InternalMyDsl.g:1672:2: rule__ProblemSpecification__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_13__1"


    // $ANTLR start "rule__ProblemSpecification__Group_13__1__Impl"
    // InternalMyDsl.g:1678:1: rule__ProblemSpecification__Group_13__1__Impl : ( ( rule__ProblemSpecification__RobotsModelAssignment_13_1 ) ) ;
    public final void rule__ProblemSpecification__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( ( ( rule__ProblemSpecification__RobotsModelAssignment_13_1 ) ) )
            // InternalMyDsl.g:1683:1: ( ( rule__ProblemSpecification__RobotsModelAssignment_13_1 ) )
            {
            // InternalMyDsl.g:1683:1: ( ( rule__ProblemSpecification__RobotsModelAssignment_13_1 ) )
            // InternalMyDsl.g:1684:2: ( rule__ProblemSpecification__RobotsModelAssignment_13_1 )
            {
             before(grammarAccess.getProblemSpecificationAccess().getRobotsModelAssignment_13_1()); 
            // InternalMyDsl.g:1685:2: ( rule__ProblemSpecification__RobotsModelAssignment_13_1 )
            // InternalMyDsl.g:1685:3: rule__ProblemSpecification__RobotsModelAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__RobotsModelAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemSpecificationAccess().getRobotsModelAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_13__1__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group_17__0"
    // InternalMyDsl.g:1694:1: rule__ProblemSpecification__Group_17__0 : rule__ProblemSpecification__Group_17__0__Impl rule__ProblemSpecification__Group_17__1 ;
    public final void rule__ProblemSpecification__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1698:1: ( rule__ProblemSpecification__Group_17__0__Impl rule__ProblemSpecification__Group_17__1 )
            // InternalMyDsl.g:1699:2: rule__ProblemSpecification__Group_17__0__Impl rule__ProblemSpecification__Group_17__1
            {
            pushFollow(FOLLOW_9);
            rule__ProblemSpecification__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_17__0"


    // $ANTLR start "rule__ProblemSpecification__Group_17__0__Impl"
    // InternalMyDsl.g:1706:1: rule__ProblemSpecification__Group_17__0__Impl : ( ',' ) ;
    public final void rule__ProblemSpecification__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1710:1: ( ( ',' ) )
            // InternalMyDsl.g:1711:1: ( ',' )
            {
            // InternalMyDsl.g:1711:1: ( ',' )
            // InternalMyDsl.g:1712:2: ','
            {
             before(grammarAccess.getProblemSpecificationAccess().getCommaKeyword_17_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProblemSpecificationAccess().getCommaKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_17__0__Impl"


    // $ANTLR start "rule__ProblemSpecification__Group_17__1"
    // InternalMyDsl.g:1721:1: rule__ProblemSpecification__Group_17__1 : rule__ProblemSpecification__Group_17__1__Impl ;
    public final void rule__ProblemSpecification__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1725:1: ( rule__ProblemSpecification__Group_17__1__Impl )
            // InternalMyDsl.g:1726:2: rule__ProblemSpecification__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__Group_17__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_17__1"


    // $ANTLR start "rule__ProblemSpecification__Group_17__1__Impl"
    // InternalMyDsl.g:1732:1: rule__ProblemSpecification__Group_17__1__Impl : ( ( rule__ProblemSpecification__MissionAssignment_17_1 ) ) ;
    public final void rule__ProblemSpecification__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( ( ( rule__ProblemSpecification__MissionAssignment_17_1 ) ) )
            // InternalMyDsl.g:1737:1: ( ( rule__ProblemSpecification__MissionAssignment_17_1 ) )
            {
            // InternalMyDsl.g:1737:1: ( ( rule__ProblemSpecification__MissionAssignment_17_1 ) )
            // InternalMyDsl.g:1738:2: ( rule__ProblemSpecification__MissionAssignment_17_1 )
            {
             before(grammarAccess.getProblemSpecificationAccess().getMissionAssignment_17_1()); 
            // InternalMyDsl.g:1739:2: ( rule__ProblemSpecification__MissionAssignment_17_1 )
            // InternalMyDsl.g:1739:3: rule__ProblemSpecification__MissionAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__ProblemSpecification__MissionAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getProblemSpecificationAccess().getMissionAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__Group_17__1__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // InternalMyDsl.g:1748:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1752:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalMyDsl.g:1753:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // InternalMyDsl.g:1760:1: rule__Location__Group__0__Impl : ( ( rule__Location__NameAssignment_0 ) ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1764:1: ( ( ( rule__Location__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1765:1: ( ( rule__Location__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1765:1: ( ( rule__Location__NameAssignment_0 ) )
            // InternalMyDsl.g:1766:2: ( rule__Location__NameAssignment_0 )
            {
             before(grammarAccess.getLocationAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1767:2: ( rule__Location__NameAssignment_0 )
            // InternalMyDsl.g:1767:3: rule__Location__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Location__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // InternalMyDsl.g:1775:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1779:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalMyDsl.g:1780:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // InternalMyDsl.g:1787:1: rule__Location__Group__1__Impl : ( ':' ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1791:1: ( ( ':' ) )
            // InternalMyDsl.g:1792:1: ( ':' )
            {
            // InternalMyDsl.g:1792:1: ( ':' )
            // InternalMyDsl.g:1793:2: ':'
            {
             before(grammarAccess.getLocationAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // InternalMyDsl.g:1802:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1806:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // InternalMyDsl.g:1807:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Location__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // InternalMyDsl.g:1814:1: rule__Location__Group__2__Impl : ( '(' ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( ( '(' ) )
            // InternalMyDsl.g:1819:1: ( '(' )
            {
            // InternalMyDsl.g:1819:1: ( '(' )
            // InternalMyDsl.g:1820:2: '('
            {
             before(grammarAccess.getLocationAccess().getLeftParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__3"
    // InternalMyDsl.g:1829:1: rule__Location__Group__3 : rule__Location__Group__3__Impl rule__Location__Group__4 ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1833:1: ( rule__Location__Group__3__Impl rule__Location__Group__4 )
            // InternalMyDsl.g:1834:2: rule__Location__Group__3__Impl rule__Location__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Location__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3"


    // $ANTLR start "rule__Location__Group__3__Impl"
    // InternalMyDsl.g:1841:1: rule__Location__Group__3__Impl : ( 'x' ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1845:1: ( ( 'x' ) )
            // InternalMyDsl.g:1846:1: ( 'x' )
            {
            // InternalMyDsl.g:1846:1: ( 'x' )
            // InternalMyDsl.g:1847:2: 'x'
            {
             before(grammarAccess.getLocationAccess().getXKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getXKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3__Impl"


    // $ANTLR start "rule__Location__Group__4"
    // InternalMyDsl.g:1856:1: rule__Location__Group__4 : rule__Location__Group__4__Impl rule__Location__Group__5 ;
    public final void rule__Location__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1860:1: ( rule__Location__Group__4__Impl rule__Location__Group__5 )
            // InternalMyDsl.g:1861:2: rule__Location__Group__4__Impl rule__Location__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Location__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4"


    // $ANTLR start "rule__Location__Group__4__Impl"
    // InternalMyDsl.g:1868:1: rule__Location__Group__4__Impl : ( ( rule__Location__XAssignment_4 ) ) ;
    public final void rule__Location__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1872:1: ( ( ( rule__Location__XAssignment_4 ) ) )
            // InternalMyDsl.g:1873:1: ( ( rule__Location__XAssignment_4 ) )
            {
            // InternalMyDsl.g:1873:1: ( ( rule__Location__XAssignment_4 ) )
            // InternalMyDsl.g:1874:2: ( rule__Location__XAssignment_4 )
            {
             before(grammarAccess.getLocationAccess().getXAssignment_4()); 
            // InternalMyDsl.g:1875:2: ( rule__Location__XAssignment_4 )
            // InternalMyDsl.g:1875:3: rule__Location__XAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Location__XAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getXAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4__Impl"


    // $ANTLR start "rule__Location__Group__5"
    // InternalMyDsl.g:1883:1: rule__Location__Group__5 : rule__Location__Group__5__Impl rule__Location__Group__6 ;
    public final void rule__Location__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1887:1: ( rule__Location__Group__5__Impl rule__Location__Group__6 )
            // InternalMyDsl.g:1888:2: rule__Location__Group__5__Impl rule__Location__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Location__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__5"


    // $ANTLR start "rule__Location__Group__5__Impl"
    // InternalMyDsl.g:1895:1: rule__Location__Group__5__Impl : ( 'y' ) ;
    public final void rule__Location__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( ( 'y' ) )
            // InternalMyDsl.g:1900:1: ( 'y' )
            {
            // InternalMyDsl.g:1900:1: ( 'y' )
            // InternalMyDsl.g:1901:2: 'y'
            {
             before(grammarAccess.getLocationAccess().getYKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getYKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__5__Impl"


    // $ANTLR start "rule__Location__Group__6"
    // InternalMyDsl.g:1910:1: rule__Location__Group__6 : rule__Location__Group__6__Impl rule__Location__Group__7 ;
    public final void rule__Location__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1914:1: ( rule__Location__Group__6__Impl rule__Location__Group__7 )
            // InternalMyDsl.g:1915:2: rule__Location__Group__6__Impl rule__Location__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Location__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__6"


    // $ANTLR start "rule__Location__Group__6__Impl"
    // InternalMyDsl.g:1922:1: rule__Location__Group__6__Impl : ( ( rule__Location__YAssignment_6 ) ) ;
    public final void rule__Location__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1926:1: ( ( ( rule__Location__YAssignment_6 ) ) )
            // InternalMyDsl.g:1927:1: ( ( rule__Location__YAssignment_6 ) )
            {
            // InternalMyDsl.g:1927:1: ( ( rule__Location__YAssignment_6 ) )
            // InternalMyDsl.g:1928:2: ( rule__Location__YAssignment_6 )
            {
             before(grammarAccess.getLocationAccess().getYAssignment_6()); 
            // InternalMyDsl.g:1929:2: ( rule__Location__YAssignment_6 )
            // InternalMyDsl.g:1929:3: rule__Location__YAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Location__YAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getYAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__6__Impl"


    // $ANTLR start "rule__Location__Group__7"
    // InternalMyDsl.g:1937:1: rule__Location__Group__7 : rule__Location__Group__7__Impl rule__Location__Group__8 ;
    public final void rule__Location__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1941:1: ( rule__Location__Group__7__Impl rule__Location__Group__8 )
            // InternalMyDsl.g:1942:2: rule__Location__Group__7__Impl rule__Location__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Location__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__7"


    // $ANTLR start "rule__Location__Group__7__Impl"
    // InternalMyDsl.g:1949:1: rule__Location__Group__7__Impl : ( ( rule__Location__Group_7__0 )? ) ;
    public final void rule__Location__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1953:1: ( ( ( rule__Location__Group_7__0 )? ) )
            // InternalMyDsl.g:1954:1: ( ( rule__Location__Group_7__0 )? )
            {
            // InternalMyDsl.g:1954:1: ( ( rule__Location__Group_7__0 )? )
            // InternalMyDsl.g:1955:2: ( rule__Location__Group_7__0 )?
            {
             before(grammarAccess.getLocationAccess().getGroup_7()); 
            // InternalMyDsl.g:1956:2: ( rule__Location__Group_7__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1956:3: rule__Location__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Location__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__7__Impl"


    // $ANTLR start "rule__Location__Group__8"
    // InternalMyDsl.g:1964:1: rule__Location__Group__8 : rule__Location__Group__8__Impl ;
    public final void rule__Location__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1968:1: ( rule__Location__Group__8__Impl )
            // InternalMyDsl.g:1969:2: rule__Location__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__8"


    // $ANTLR start "rule__Location__Group__8__Impl"
    // InternalMyDsl.g:1975:1: rule__Location__Group__8__Impl : ( ')' ) ;
    public final void rule__Location__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1979:1: ( ( ')' ) )
            // InternalMyDsl.g:1980:1: ( ')' )
            {
            // InternalMyDsl.g:1980:1: ( ')' )
            // InternalMyDsl.g:1981:2: ')'
            {
             before(grammarAccess.getLocationAccess().getRightParenthesisKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__8__Impl"


    // $ANTLR start "rule__Location__Group_7__0"
    // InternalMyDsl.g:1991:1: rule__Location__Group_7__0 : rule__Location__Group_7__0__Impl rule__Location__Group_7__1 ;
    public final void rule__Location__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1995:1: ( rule__Location__Group_7__0__Impl rule__Location__Group_7__1 )
            // InternalMyDsl.g:1996:2: rule__Location__Group_7__0__Impl rule__Location__Group_7__1
            {
            pushFollow(FOLLOW_19);
            rule__Location__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_7__0"


    // $ANTLR start "rule__Location__Group_7__0__Impl"
    // InternalMyDsl.g:2003:1: rule__Location__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Location__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2007:1: ( ( ',' ) )
            // InternalMyDsl.g:2008:1: ( ',' )
            {
            // InternalMyDsl.g:2008:1: ( ',' )
            // InternalMyDsl.g:2009:2: ','
            {
             before(grammarAccess.getLocationAccess().getCommaKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_7__0__Impl"


    // $ANTLR start "rule__Location__Group_7__1"
    // InternalMyDsl.g:2018:1: rule__Location__Group_7__1 : rule__Location__Group_7__1__Impl rule__Location__Group_7__2 ;
    public final void rule__Location__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2022:1: ( rule__Location__Group_7__1__Impl rule__Location__Group_7__2 )
            // InternalMyDsl.g:2023:2: rule__Location__Group_7__1__Impl rule__Location__Group_7__2
            {
            pushFollow(FOLLOW_9);
            rule__Location__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_7__1"


    // $ANTLR start "rule__Location__Group_7__1__Impl"
    // InternalMyDsl.g:2030:1: rule__Location__Group_7__1__Impl : ( 'describes' ) ;
    public final void rule__Location__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2034:1: ( ( 'describes' ) )
            // InternalMyDsl.g:2035:1: ( 'describes' )
            {
            // InternalMyDsl.g:2035:1: ( 'describes' )
            // InternalMyDsl.g:2036:2: 'describes'
            {
             before(grammarAccess.getLocationAccess().getDescribesKeyword_7_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getDescribesKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_7__1__Impl"


    // $ANTLR start "rule__Location__Group_7__2"
    // InternalMyDsl.g:2045:1: rule__Location__Group_7__2 : rule__Location__Group_7__2__Impl ;
    public final void rule__Location__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2049:1: ( rule__Location__Group_7__2__Impl )
            // InternalMyDsl.g:2050:2: rule__Location__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_7__2"


    // $ANTLR start "rule__Location__Group_7__2__Impl"
    // InternalMyDsl.g:2056:1: rule__Location__Group_7__2__Impl : ( ( rule__Location__DescriptionAssignment_7_2 ) ) ;
    public final void rule__Location__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2060:1: ( ( ( rule__Location__DescriptionAssignment_7_2 ) ) )
            // InternalMyDsl.g:2061:1: ( ( rule__Location__DescriptionAssignment_7_2 ) )
            {
            // InternalMyDsl.g:2061:1: ( ( rule__Location__DescriptionAssignment_7_2 ) )
            // InternalMyDsl.g:2062:2: ( rule__Location__DescriptionAssignment_7_2 )
            {
             before(grammarAccess.getLocationAccess().getDescriptionAssignment_7_2()); 
            // InternalMyDsl.g:2063:2: ( rule__Location__DescriptionAssignment_7_2 )
            // InternalMyDsl.g:2063:3: rule__Location__DescriptionAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Location__DescriptionAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getDescriptionAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group_7__2__Impl"


    // $ANTLR start "rule__Paths__Group__0"
    // InternalMyDsl.g:2072:1: rule__Paths__Group__0 : rule__Paths__Group__0__Impl rule__Paths__Group__1 ;
    public final void rule__Paths__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2076:1: ( rule__Paths__Group__0__Impl rule__Paths__Group__1 )
            // InternalMyDsl.g:2077:2: rule__Paths__Group__0__Impl rule__Paths__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Paths__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paths__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__0"


    // $ANTLR start "rule__Paths__Group__0__Impl"
    // InternalMyDsl.g:2084:1: rule__Paths__Group__0__Impl : ( 'distance' ) ;
    public final void rule__Paths__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2088:1: ( ( 'distance' ) )
            // InternalMyDsl.g:2089:1: ( 'distance' )
            {
            // InternalMyDsl.g:2089:1: ( 'distance' )
            // InternalMyDsl.g:2090:2: 'distance'
            {
             before(grammarAccess.getPathsAccess().getDistanceKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPathsAccess().getDistanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__0__Impl"


    // $ANTLR start "rule__Paths__Group__1"
    // InternalMyDsl.g:2099:1: rule__Paths__Group__1 : rule__Paths__Group__1__Impl rule__Paths__Group__2 ;
    public final void rule__Paths__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2103:1: ( rule__Paths__Group__1__Impl rule__Paths__Group__2 )
            // InternalMyDsl.g:2104:2: rule__Paths__Group__1__Impl rule__Paths__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Paths__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paths__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__1"


    // $ANTLR start "rule__Paths__Group__1__Impl"
    // InternalMyDsl.g:2111:1: rule__Paths__Group__1__Impl : ( ( rule__Paths__Loc1Assignment_1 ) ) ;
    public final void rule__Paths__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2115:1: ( ( ( rule__Paths__Loc1Assignment_1 ) ) )
            // InternalMyDsl.g:2116:1: ( ( rule__Paths__Loc1Assignment_1 ) )
            {
            // InternalMyDsl.g:2116:1: ( ( rule__Paths__Loc1Assignment_1 ) )
            // InternalMyDsl.g:2117:2: ( rule__Paths__Loc1Assignment_1 )
            {
             before(grammarAccess.getPathsAccess().getLoc1Assignment_1()); 
            // InternalMyDsl.g:2118:2: ( rule__Paths__Loc1Assignment_1 )
            // InternalMyDsl.g:2118:3: rule__Paths__Loc1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Paths__Loc1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathsAccess().getLoc1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__1__Impl"


    // $ANTLR start "rule__Paths__Group__2"
    // InternalMyDsl.g:2126:1: rule__Paths__Group__2 : rule__Paths__Group__2__Impl rule__Paths__Group__3 ;
    public final void rule__Paths__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2130:1: ( rule__Paths__Group__2__Impl rule__Paths__Group__3 )
            // InternalMyDsl.g:2131:2: rule__Paths__Group__2__Impl rule__Paths__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Paths__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paths__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__2"


    // $ANTLR start "rule__Paths__Group__2__Impl"
    // InternalMyDsl.g:2138:1: rule__Paths__Group__2__Impl : ( 'to' ) ;
    public final void rule__Paths__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( ( 'to' ) )
            // InternalMyDsl.g:2143:1: ( 'to' )
            {
            // InternalMyDsl.g:2143:1: ( 'to' )
            // InternalMyDsl.g:2144:2: 'to'
            {
             before(grammarAccess.getPathsAccess().getToKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPathsAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__2__Impl"


    // $ANTLR start "rule__Paths__Group__3"
    // InternalMyDsl.g:2153:1: rule__Paths__Group__3 : rule__Paths__Group__3__Impl rule__Paths__Group__4 ;
    public final void rule__Paths__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2157:1: ( rule__Paths__Group__3__Impl rule__Paths__Group__4 )
            // InternalMyDsl.g:2158:2: rule__Paths__Group__3__Impl rule__Paths__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Paths__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paths__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__3"


    // $ANTLR start "rule__Paths__Group__3__Impl"
    // InternalMyDsl.g:2165:1: rule__Paths__Group__3__Impl : ( ( rule__Paths__Loc2Assignment_3 ) ) ;
    public final void rule__Paths__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2169:1: ( ( ( rule__Paths__Loc2Assignment_3 ) ) )
            // InternalMyDsl.g:2170:1: ( ( rule__Paths__Loc2Assignment_3 ) )
            {
            // InternalMyDsl.g:2170:1: ( ( rule__Paths__Loc2Assignment_3 ) )
            // InternalMyDsl.g:2171:2: ( rule__Paths__Loc2Assignment_3 )
            {
             before(grammarAccess.getPathsAccess().getLoc2Assignment_3()); 
            // InternalMyDsl.g:2172:2: ( rule__Paths__Loc2Assignment_3 )
            // InternalMyDsl.g:2172:3: rule__Paths__Loc2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Paths__Loc2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPathsAccess().getLoc2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__3__Impl"


    // $ANTLR start "rule__Paths__Group__4"
    // InternalMyDsl.g:2180:1: rule__Paths__Group__4 : rule__Paths__Group__4__Impl rule__Paths__Group__5 ;
    public final void rule__Paths__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2184:1: ( rule__Paths__Group__4__Impl rule__Paths__Group__5 )
            // InternalMyDsl.g:2185:2: rule__Paths__Group__4__Impl rule__Paths__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Paths__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paths__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__4"


    // $ANTLR start "rule__Paths__Group__4__Impl"
    // InternalMyDsl.g:2192:1: rule__Paths__Group__4__Impl : ( 'is' ) ;
    public final void rule__Paths__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2196:1: ( ( 'is' ) )
            // InternalMyDsl.g:2197:1: ( 'is' )
            {
            // InternalMyDsl.g:2197:1: ( 'is' )
            // InternalMyDsl.g:2198:2: 'is'
            {
             before(grammarAccess.getPathsAccess().getIsKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPathsAccess().getIsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__4__Impl"


    // $ANTLR start "rule__Paths__Group__5"
    // InternalMyDsl.g:2207:1: rule__Paths__Group__5 : rule__Paths__Group__5__Impl rule__Paths__Group__6 ;
    public final void rule__Paths__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2211:1: ( rule__Paths__Group__5__Impl rule__Paths__Group__6 )
            // InternalMyDsl.g:2212:2: rule__Paths__Group__5__Impl rule__Paths__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Paths__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paths__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__5"


    // $ANTLR start "rule__Paths__Group__5__Impl"
    // InternalMyDsl.g:2219:1: rule__Paths__Group__5__Impl : ( ( rule__Paths__DistanceAssignment_5 ) ) ;
    public final void rule__Paths__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( ( ( rule__Paths__DistanceAssignment_5 ) ) )
            // InternalMyDsl.g:2224:1: ( ( rule__Paths__DistanceAssignment_5 ) )
            {
            // InternalMyDsl.g:2224:1: ( ( rule__Paths__DistanceAssignment_5 ) )
            // InternalMyDsl.g:2225:2: ( rule__Paths__DistanceAssignment_5 )
            {
             before(grammarAccess.getPathsAccess().getDistanceAssignment_5()); 
            // InternalMyDsl.g:2226:2: ( rule__Paths__DistanceAssignment_5 )
            // InternalMyDsl.g:2226:3: rule__Paths__DistanceAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Paths__DistanceAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPathsAccess().getDistanceAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__5__Impl"


    // $ANTLR start "rule__Paths__Group__6"
    // InternalMyDsl.g:2234:1: rule__Paths__Group__6 : rule__Paths__Group__6__Impl ;
    public final void rule__Paths__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2238:1: ( rule__Paths__Group__6__Impl )
            // InternalMyDsl.g:2239:2: rule__Paths__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paths__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__6"


    // $ANTLR start "rule__Paths__Group__6__Impl"
    // InternalMyDsl.g:2245:1: rule__Paths__Group__6__Impl : ( ( rule__Paths__Group_6__0 )? ) ;
    public final void rule__Paths__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2249:1: ( ( ( rule__Paths__Group_6__0 )? ) )
            // InternalMyDsl.g:2250:1: ( ( rule__Paths__Group_6__0 )? )
            {
            // InternalMyDsl.g:2250:1: ( ( rule__Paths__Group_6__0 )? )
            // InternalMyDsl.g:2251:2: ( rule__Paths__Group_6__0 )?
            {
             before(grammarAccess.getPathsAccess().getGroup_6()); 
            // InternalMyDsl.g:2252:2: ( rule__Paths__Group_6__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2252:3: rule__Paths__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Paths__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathsAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group__6__Impl"


    // $ANTLR start "rule__Paths__Group_6__0"
    // InternalMyDsl.g:2261:1: rule__Paths__Group_6__0 : rule__Paths__Group_6__0__Impl rule__Paths__Group_6__1 ;
    public final void rule__Paths__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2265:1: ( rule__Paths__Group_6__0__Impl rule__Paths__Group_6__1 )
            // InternalMyDsl.g:2266:2: rule__Paths__Group_6__0__Impl rule__Paths__Group_6__1
            {
            pushFollow(FOLLOW_23);
            rule__Paths__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paths__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group_6__0"


    // $ANTLR start "rule__Paths__Group_6__0__Impl"
    // InternalMyDsl.g:2273:1: rule__Paths__Group_6__0__Impl : ( 'has' ) ;
    public final void rule__Paths__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2277:1: ( ( 'has' ) )
            // InternalMyDsl.g:2278:1: ( 'has' )
            {
            // InternalMyDsl.g:2278:1: ( 'has' )
            // InternalMyDsl.g:2279:2: 'has'
            {
             before(grammarAccess.getPathsAccess().getHasKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPathsAccess().getHasKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group_6__0__Impl"


    // $ANTLR start "rule__Paths__Group_6__1"
    // InternalMyDsl.g:2288:1: rule__Paths__Group_6__1 : rule__Paths__Group_6__1__Impl rule__Paths__Group_6__2 ;
    public final void rule__Paths__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2292:1: ( rule__Paths__Group_6__1__Impl rule__Paths__Group_6__2 )
            // InternalMyDsl.g:2293:2: rule__Paths__Group_6__1__Impl rule__Paths__Group_6__2
            {
            pushFollow(FOLLOW_24);
            rule__Paths__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paths__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group_6__1"


    // $ANTLR start "rule__Paths__Group_6__1__Impl"
    // InternalMyDsl.g:2300:1: rule__Paths__Group_6__1__Impl : ( 'success' ) ;
    public final void rule__Paths__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2304:1: ( ( 'success' ) )
            // InternalMyDsl.g:2305:1: ( 'success' )
            {
            // InternalMyDsl.g:2305:1: ( 'success' )
            // InternalMyDsl.g:2306:2: 'success'
            {
             before(grammarAccess.getPathsAccess().getSuccessKeyword_6_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPathsAccess().getSuccessKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group_6__1__Impl"


    // $ANTLR start "rule__Paths__Group_6__2"
    // InternalMyDsl.g:2315:1: rule__Paths__Group_6__2 : rule__Paths__Group_6__2__Impl rule__Paths__Group_6__3 ;
    public final void rule__Paths__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2319:1: ( rule__Paths__Group_6__2__Impl rule__Paths__Group_6__3 )
            // InternalMyDsl.g:2320:2: rule__Paths__Group_6__2__Impl rule__Paths__Group_6__3
            {
            pushFollow(FOLLOW_16);
            rule__Paths__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paths__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group_6__2"


    // $ANTLR start "rule__Paths__Group_6__2__Impl"
    // InternalMyDsl.g:2327:1: rule__Paths__Group_6__2__Impl : ( 'rate:' ) ;
    public final void rule__Paths__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2331:1: ( ( 'rate:' ) )
            // InternalMyDsl.g:2332:1: ( 'rate:' )
            {
            // InternalMyDsl.g:2332:1: ( 'rate:' )
            // InternalMyDsl.g:2333:2: 'rate:'
            {
             before(grammarAccess.getPathsAccess().getRateKeyword_6_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPathsAccess().getRateKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group_6__2__Impl"


    // $ANTLR start "rule__Paths__Group_6__3"
    // InternalMyDsl.g:2342:1: rule__Paths__Group_6__3 : rule__Paths__Group_6__3__Impl rule__Paths__Group_6__4 ;
    public final void rule__Paths__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2346:1: ( rule__Paths__Group_6__3__Impl rule__Paths__Group_6__4 )
            // InternalMyDsl.g:2347:2: rule__Paths__Group_6__3__Impl rule__Paths__Group_6__4
            {
            pushFollow(FOLLOW_25);
            rule__Paths__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Paths__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group_6__3"


    // $ANTLR start "rule__Paths__Group_6__3__Impl"
    // InternalMyDsl.g:2354:1: rule__Paths__Group_6__3__Impl : ( ( rule__Paths__SuccessAssignment_6_3 ) ) ;
    public final void rule__Paths__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2358:1: ( ( ( rule__Paths__SuccessAssignment_6_3 ) ) )
            // InternalMyDsl.g:2359:1: ( ( rule__Paths__SuccessAssignment_6_3 ) )
            {
            // InternalMyDsl.g:2359:1: ( ( rule__Paths__SuccessAssignment_6_3 ) )
            // InternalMyDsl.g:2360:2: ( rule__Paths__SuccessAssignment_6_3 )
            {
             before(grammarAccess.getPathsAccess().getSuccessAssignment_6_3()); 
            // InternalMyDsl.g:2361:2: ( rule__Paths__SuccessAssignment_6_3 )
            // InternalMyDsl.g:2361:3: rule__Paths__SuccessAssignment_6_3
            {
            pushFollow(FOLLOW_2);
            rule__Paths__SuccessAssignment_6_3();

            state._fsp--;


            }

             after(grammarAccess.getPathsAccess().getSuccessAssignment_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group_6__3__Impl"


    // $ANTLR start "rule__Paths__Group_6__4"
    // InternalMyDsl.g:2369:1: rule__Paths__Group_6__4 : rule__Paths__Group_6__4__Impl ;
    public final void rule__Paths__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2373:1: ( rule__Paths__Group_6__4__Impl )
            // InternalMyDsl.g:2374:2: rule__Paths__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Paths__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group_6__4"


    // $ANTLR start "rule__Paths__Group_6__4__Impl"
    // InternalMyDsl.g:2380:1: rule__Paths__Group_6__4__Impl : ( '%' ) ;
    public final void rule__Paths__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2384:1: ( ( '%' ) )
            // InternalMyDsl.g:2385:1: ( '%' )
            {
            // InternalMyDsl.g:2385:1: ( '%' )
            // InternalMyDsl.g:2386:2: '%'
            {
             before(grammarAccess.getPathsAccess().getPercentSignKeyword_6_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPathsAccess().getPercentSignKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Group_6__4__Impl"


    // $ANTLR start "rule__AtomicTask__Group__0"
    // InternalMyDsl.g:2396:1: rule__AtomicTask__Group__0 : rule__AtomicTask__Group__0__Impl rule__AtomicTask__Group__1 ;
    public final void rule__AtomicTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2400:1: ( rule__AtomicTask__Group__0__Impl rule__AtomicTask__Group__1 )
            // InternalMyDsl.g:2401:2: rule__AtomicTask__Group__0__Impl rule__AtomicTask__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AtomicTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__0"


    // $ANTLR start "rule__AtomicTask__Group__0__Impl"
    // InternalMyDsl.g:2408:1: rule__AtomicTask__Group__0__Impl : ( ( rule__AtomicTask__NameAssignment_0 ) ) ;
    public final void rule__AtomicTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2412:1: ( ( ( rule__AtomicTask__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2413:1: ( ( rule__AtomicTask__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2413:1: ( ( rule__AtomicTask__NameAssignment_0 ) )
            // InternalMyDsl.g:2414:2: ( rule__AtomicTask__NameAssignment_0 )
            {
             before(grammarAccess.getAtomicTaskAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2415:2: ( rule__AtomicTask__NameAssignment_0 )
            // InternalMyDsl.g:2415:3: rule__AtomicTask__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtomicTask__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicTaskAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__0__Impl"


    // $ANTLR start "rule__AtomicTask__Group__1"
    // InternalMyDsl.g:2423:1: rule__AtomicTask__Group__1 : rule__AtomicTask__Group__1__Impl rule__AtomicTask__Group__2 ;
    public final void rule__AtomicTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2427:1: ( rule__AtomicTask__Group__1__Impl rule__AtomicTask__Group__2 )
            // InternalMyDsl.g:2428:2: rule__AtomicTask__Group__1__Impl rule__AtomicTask__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AtomicTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__1"


    // $ANTLR start "rule__AtomicTask__Group__1__Impl"
    // InternalMyDsl.g:2435:1: rule__AtomicTask__Group__1__Impl : ( ':' ) ;
    public final void rule__AtomicTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2439:1: ( ( ':' ) )
            // InternalMyDsl.g:2440:1: ( ':' )
            {
            // InternalMyDsl.g:2440:1: ( ':' )
            // InternalMyDsl.g:2441:2: ':'
            {
             before(grammarAccess.getAtomicTaskAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAtomicTaskAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__1__Impl"


    // $ANTLR start "rule__AtomicTask__Group__2"
    // InternalMyDsl.g:2450:1: rule__AtomicTask__Group__2 : rule__AtomicTask__Group__2__Impl rule__AtomicTask__Group__3 ;
    public final void rule__AtomicTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2454:1: ( rule__AtomicTask__Group__2__Impl rule__AtomicTask__Group__3 )
            // InternalMyDsl.g:2455:2: rule__AtomicTask__Group__2__Impl rule__AtomicTask__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__AtomicTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__2"


    // $ANTLR start "rule__AtomicTask__Group__2__Impl"
    // InternalMyDsl.g:2462:1: rule__AtomicTask__Group__2__Impl : ( ( rule__AtomicTask__RobotsAssignment_2 ) ) ;
    public final void rule__AtomicTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2466:1: ( ( ( rule__AtomicTask__RobotsAssignment_2 ) ) )
            // InternalMyDsl.g:2467:1: ( ( rule__AtomicTask__RobotsAssignment_2 ) )
            {
            // InternalMyDsl.g:2467:1: ( ( rule__AtomicTask__RobotsAssignment_2 ) )
            // InternalMyDsl.g:2468:2: ( rule__AtomicTask__RobotsAssignment_2 )
            {
             before(grammarAccess.getAtomicTaskAccess().getRobotsAssignment_2()); 
            // InternalMyDsl.g:2469:2: ( rule__AtomicTask__RobotsAssignment_2 )
            // InternalMyDsl.g:2469:3: rule__AtomicTask__RobotsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicTask__RobotsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicTaskAccess().getRobotsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__2__Impl"


    // $ANTLR start "rule__AtomicTask__Group__3"
    // InternalMyDsl.g:2477:1: rule__AtomicTask__Group__3 : rule__AtomicTask__Group__3__Impl rule__AtomicTask__Group__4 ;
    public final void rule__AtomicTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2481:1: ( rule__AtomicTask__Group__3__Impl rule__AtomicTask__Group__4 )
            // InternalMyDsl.g:2482:2: rule__AtomicTask__Group__3__Impl rule__AtomicTask__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__AtomicTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__3"


    // $ANTLR start "rule__AtomicTask__Group__3__Impl"
    // InternalMyDsl.g:2489:1: rule__AtomicTask__Group__3__Impl : ( ( rule__AtomicTask__Alternatives_3 ) ) ;
    public final void rule__AtomicTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2493:1: ( ( ( rule__AtomicTask__Alternatives_3 ) ) )
            // InternalMyDsl.g:2494:1: ( ( rule__AtomicTask__Alternatives_3 ) )
            {
            // InternalMyDsl.g:2494:1: ( ( rule__AtomicTask__Alternatives_3 ) )
            // InternalMyDsl.g:2495:2: ( rule__AtomicTask__Alternatives_3 )
            {
             before(grammarAccess.getAtomicTaskAccess().getAlternatives_3()); 
            // InternalMyDsl.g:2496:2: ( rule__AtomicTask__Alternatives_3 )
            // InternalMyDsl.g:2496:3: rule__AtomicTask__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__AtomicTask__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getAtomicTaskAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__3__Impl"


    // $ANTLR start "rule__AtomicTask__Group__4"
    // InternalMyDsl.g:2504:1: rule__AtomicTask__Group__4 : rule__AtomicTask__Group__4__Impl rule__AtomicTask__Group__5 ;
    public final void rule__AtomicTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2508:1: ( rule__AtomicTask__Group__4__Impl rule__AtomicTask__Group__5 )
            // InternalMyDsl.g:2509:2: rule__AtomicTask__Group__4__Impl rule__AtomicTask__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__AtomicTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__4"


    // $ANTLR start "rule__AtomicTask__Group__4__Impl"
    // InternalMyDsl.g:2516:1: rule__AtomicTask__Group__4__Impl : ( 'needed' ) ;
    public final void rule__AtomicTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2520:1: ( ( 'needed' ) )
            // InternalMyDsl.g:2521:1: ( 'needed' )
            {
            // InternalMyDsl.g:2521:1: ( 'needed' )
            // InternalMyDsl.g:2522:2: 'needed'
            {
             before(grammarAccess.getAtomicTaskAccess().getNeededKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAtomicTaskAccess().getNeededKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__4__Impl"


    // $ANTLR start "rule__AtomicTask__Group__5"
    // InternalMyDsl.g:2531:1: rule__AtomicTask__Group__5 : rule__AtomicTask__Group__5__Impl rule__AtomicTask__Group__6 ;
    public final void rule__AtomicTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2535:1: ( rule__AtomicTask__Group__5__Impl rule__AtomicTask__Group__6 )
            // InternalMyDsl.g:2536:2: rule__AtomicTask__Group__5__Impl rule__AtomicTask__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__AtomicTask__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__5"


    // $ANTLR start "rule__AtomicTask__Group__5__Impl"
    // InternalMyDsl.g:2543:1: rule__AtomicTask__Group__5__Impl : ( ( rule__AtomicTask__Group_5__0 )? ) ;
    public final void rule__AtomicTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2547:1: ( ( ( rule__AtomicTask__Group_5__0 )? ) )
            // InternalMyDsl.g:2548:1: ( ( rule__AtomicTask__Group_5__0 )? )
            {
            // InternalMyDsl.g:2548:1: ( ( rule__AtomicTask__Group_5__0 )? )
            // InternalMyDsl.g:2549:2: ( rule__AtomicTask__Group_5__0 )?
            {
             before(grammarAccess.getAtomicTaskAccess().getGroup_5()); 
            // InternalMyDsl.g:2550:2: ( rule__AtomicTask__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2550:3: rule__AtomicTask__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicTask__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicTaskAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__5__Impl"


    // $ANTLR start "rule__AtomicTask__Group__6"
    // InternalMyDsl.g:2558:1: rule__AtomicTask__Group__6 : rule__AtomicTask__Group__6__Impl ;
    public final void rule__AtomicTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2562:1: ( rule__AtomicTask__Group__6__Impl )
            // InternalMyDsl.g:2563:2: rule__AtomicTask__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__6"


    // $ANTLR start "rule__AtomicTask__Group__6__Impl"
    // InternalMyDsl.g:2569:1: rule__AtomicTask__Group__6__Impl : ( ( rule__AtomicTask__Group_6__0 )? ) ;
    public final void rule__AtomicTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2573:1: ( ( ( rule__AtomicTask__Group_6__0 )? ) )
            // InternalMyDsl.g:2574:1: ( ( rule__AtomicTask__Group_6__0 )? )
            {
            // InternalMyDsl.g:2574:1: ( ( rule__AtomicTask__Group_6__0 )? )
            // InternalMyDsl.g:2575:2: ( rule__AtomicTask__Group_6__0 )?
            {
             before(grammarAccess.getAtomicTaskAccess().getGroup_6()); 
            // InternalMyDsl.g:2576:2: ( rule__AtomicTask__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_INT||LA26_1==81) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2576:3: rule__AtomicTask__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicTask__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomicTaskAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group__6__Impl"


    // $ANTLR start "rule__AtomicTask__Group_5__0"
    // InternalMyDsl.g:2585:1: rule__AtomicTask__Group_5__0 : rule__AtomicTask__Group_5__0__Impl rule__AtomicTask__Group_5__1 ;
    public final void rule__AtomicTask__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2589:1: ( rule__AtomicTask__Group_5__0__Impl rule__AtomicTask__Group_5__1 )
            // InternalMyDsl.g:2590:2: rule__AtomicTask__Group_5__0__Impl rule__AtomicTask__Group_5__1
            {
            pushFollow(FOLLOW_30);
            rule__AtomicTask__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_5__0"


    // $ANTLR start "rule__AtomicTask__Group_5__0__Impl"
    // InternalMyDsl.g:2597:1: rule__AtomicTask__Group_5__0__Impl : ( 'at' ) ;
    public final void rule__AtomicTask__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2601:1: ( ( 'at' ) )
            // InternalMyDsl.g:2602:1: ( 'at' )
            {
            // InternalMyDsl.g:2602:1: ( 'at' )
            // InternalMyDsl.g:2603:2: 'at'
            {
             before(grammarAccess.getAtomicTaskAccess().getAtKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAtomicTaskAccess().getAtKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_5__0__Impl"


    // $ANTLR start "rule__AtomicTask__Group_5__1"
    // InternalMyDsl.g:2612:1: rule__AtomicTask__Group_5__1 : rule__AtomicTask__Group_5__1__Impl rule__AtomicTask__Group_5__2 ;
    public final void rule__AtomicTask__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2616:1: ( rule__AtomicTask__Group_5__1__Impl rule__AtomicTask__Group_5__2 )
            // InternalMyDsl.g:2617:2: rule__AtomicTask__Group_5__1__Impl rule__AtomicTask__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__AtomicTask__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_5__1"


    // $ANTLR start "rule__AtomicTask__Group_5__1__Impl"
    // InternalMyDsl.g:2624:1: rule__AtomicTask__Group_5__1__Impl : ( 'location' ) ;
    public final void rule__AtomicTask__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2628:1: ( ( 'location' ) )
            // InternalMyDsl.g:2629:1: ( 'location' )
            {
            // InternalMyDsl.g:2629:1: ( 'location' )
            // InternalMyDsl.g:2630:2: 'location'
            {
             before(grammarAccess.getAtomicTaskAccess().getLocationKeyword_5_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAtomicTaskAccess().getLocationKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_5__1__Impl"


    // $ANTLR start "rule__AtomicTask__Group_5__2"
    // InternalMyDsl.g:2639:1: rule__AtomicTask__Group_5__2 : rule__AtomicTask__Group_5__2__Impl ;
    public final void rule__AtomicTask__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2643:1: ( rule__AtomicTask__Group_5__2__Impl )
            // InternalMyDsl.g:2644:2: rule__AtomicTask__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_5__2"


    // $ANTLR start "rule__AtomicTask__Group_5__2__Impl"
    // InternalMyDsl.g:2650:1: rule__AtomicTask__Group_5__2__Impl : ( ( rule__AtomicTask__LocAssignment_5_2 ) ) ;
    public final void rule__AtomicTask__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2654:1: ( ( ( rule__AtomicTask__LocAssignment_5_2 ) ) )
            // InternalMyDsl.g:2655:1: ( ( rule__AtomicTask__LocAssignment_5_2 ) )
            {
            // InternalMyDsl.g:2655:1: ( ( rule__AtomicTask__LocAssignment_5_2 ) )
            // InternalMyDsl.g:2656:2: ( rule__AtomicTask__LocAssignment_5_2 )
            {
             before(grammarAccess.getAtomicTaskAccess().getLocAssignment_5_2()); 
            // InternalMyDsl.g:2657:2: ( rule__AtomicTask__LocAssignment_5_2 )
            // InternalMyDsl.g:2657:3: rule__AtomicTask__LocAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomicTask__LocAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomicTaskAccess().getLocAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_5__2__Impl"


    // $ANTLR start "rule__AtomicTask__Group_6__0"
    // InternalMyDsl.g:2666:1: rule__AtomicTask__Group_6__0 : rule__AtomicTask__Group_6__0__Impl rule__AtomicTask__Group_6__1 ;
    public final void rule__AtomicTask__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2670:1: ( rule__AtomicTask__Group_6__0__Impl rule__AtomicTask__Group_6__1 )
            // InternalMyDsl.g:2671:2: rule__AtomicTask__Group_6__0__Impl rule__AtomicTask__Group_6__1
            {
            pushFollow(FOLLOW_26);
            rule__AtomicTask__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_6__0"


    // $ANTLR start "rule__AtomicTask__Group_6__0__Impl"
    // InternalMyDsl.g:2678:1: rule__AtomicTask__Group_6__0__Impl : ( ',' ) ;
    public final void rule__AtomicTask__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2682:1: ( ( ',' ) )
            // InternalMyDsl.g:2683:1: ( ',' )
            {
            // InternalMyDsl.g:2683:1: ( ',' )
            // InternalMyDsl.g:2684:2: ','
            {
             before(grammarAccess.getAtomicTaskAccess().getCommaKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAtomicTaskAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_6__0__Impl"


    // $ANTLR start "rule__AtomicTask__Group_6__1"
    // InternalMyDsl.g:2693:1: rule__AtomicTask__Group_6__1 : rule__AtomicTask__Group_6__1__Impl rule__AtomicTask__Group_6__2 ;
    public final void rule__AtomicTask__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2697:1: ( rule__AtomicTask__Group_6__1__Impl rule__AtomicTask__Group_6__2 )
            // InternalMyDsl.g:2698:2: rule__AtomicTask__Group_6__1__Impl rule__AtomicTask__Group_6__2
            {
            pushFollow(FOLLOW_31);
            rule__AtomicTask__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_6__1"


    // $ANTLR start "rule__AtomicTask__Group_6__1__Impl"
    // InternalMyDsl.g:2705:1: rule__AtomicTask__Group_6__1__Impl : ( ( rule__AtomicTask__RetryAssignment_6_1 ) ) ;
    public final void rule__AtomicTask__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2709:1: ( ( ( rule__AtomicTask__RetryAssignment_6_1 ) ) )
            // InternalMyDsl.g:2710:1: ( ( rule__AtomicTask__RetryAssignment_6_1 ) )
            {
            // InternalMyDsl.g:2710:1: ( ( rule__AtomicTask__RetryAssignment_6_1 ) )
            // InternalMyDsl.g:2711:2: ( rule__AtomicTask__RetryAssignment_6_1 )
            {
             before(grammarAccess.getAtomicTaskAccess().getRetryAssignment_6_1()); 
            // InternalMyDsl.g:2712:2: ( rule__AtomicTask__RetryAssignment_6_1 )
            // InternalMyDsl.g:2712:3: rule__AtomicTask__RetryAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicTask__RetryAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicTaskAccess().getRetryAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_6__1__Impl"


    // $ANTLR start "rule__AtomicTask__Group_6__2"
    // InternalMyDsl.g:2720:1: rule__AtomicTask__Group_6__2 : rule__AtomicTask__Group_6__2__Impl rule__AtomicTask__Group_6__3 ;
    public final void rule__AtomicTask__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2724:1: ( rule__AtomicTask__Group_6__2__Impl rule__AtomicTask__Group_6__3 )
            // InternalMyDsl.g:2725:2: rule__AtomicTask__Group_6__2__Impl rule__AtomicTask__Group_6__3
            {
            pushFollow(FOLLOW_32);
            rule__AtomicTask__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_6__2"


    // $ANTLR start "rule__AtomicTask__Group_6__2__Impl"
    // InternalMyDsl.g:2732:1: rule__AtomicTask__Group_6__2__Impl : ( 'retries' ) ;
    public final void rule__AtomicTask__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2736:1: ( ( 'retries' ) )
            // InternalMyDsl.g:2737:1: ( 'retries' )
            {
            // InternalMyDsl.g:2737:1: ( 'retries' )
            // InternalMyDsl.g:2738:2: 'retries'
            {
             before(grammarAccess.getAtomicTaskAccess().getRetriesKeyword_6_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAtomicTaskAccess().getRetriesKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_6__2__Impl"


    // $ANTLR start "rule__AtomicTask__Group_6__3"
    // InternalMyDsl.g:2747:1: rule__AtomicTask__Group_6__3 : rule__AtomicTask__Group_6__3__Impl ;
    public final void rule__AtomicTask__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2751:1: ( rule__AtomicTask__Group_6__3__Impl )
            // InternalMyDsl.g:2752:2: rule__AtomicTask__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicTask__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_6__3"


    // $ANTLR start "rule__AtomicTask__Group_6__3__Impl"
    // InternalMyDsl.g:2758:1: rule__AtomicTask__Group_6__3__Impl : ( 'allowed' ) ;
    public final void rule__AtomicTask__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2762:1: ( ( 'allowed' ) )
            // InternalMyDsl.g:2763:1: ( 'allowed' )
            {
            // InternalMyDsl.g:2763:1: ( 'allowed' )
            // InternalMyDsl.g:2764:2: 'allowed'
            {
             before(grammarAccess.getAtomicTaskAccess().getAllowedKeyword_6_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAtomicTaskAccess().getAllowedKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__Group_6__3__Impl"


    // $ANTLR start "rule__CompoundTask__Group__0"
    // InternalMyDsl.g:2774:1: rule__CompoundTask__Group__0 : rule__CompoundTask__Group__0__Impl rule__CompoundTask__Group__1 ;
    public final void rule__CompoundTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2778:1: ( rule__CompoundTask__Group__0__Impl rule__CompoundTask__Group__1 )
            // InternalMyDsl.g:2779:2: rule__CompoundTask__Group__0__Impl rule__CompoundTask__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CompoundTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__0"


    // $ANTLR start "rule__CompoundTask__Group__0__Impl"
    // InternalMyDsl.g:2786:1: rule__CompoundTask__Group__0__Impl : ( ( rule__CompoundTask__NameAssignment_0 ) ) ;
    public final void rule__CompoundTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2790:1: ( ( ( rule__CompoundTask__NameAssignment_0 ) ) )
            // InternalMyDsl.g:2791:1: ( ( rule__CompoundTask__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:2791:1: ( ( rule__CompoundTask__NameAssignment_0 ) )
            // InternalMyDsl.g:2792:2: ( rule__CompoundTask__NameAssignment_0 )
            {
             before(grammarAccess.getCompoundTaskAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:2793:2: ( rule__CompoundTask__NameAssignment_0 )
            // InternalMyDsl.g:2793:3: rule__CompoundTask__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompoundTaskAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__0__Impl"


    // $ANTLR start "rule__CompoundTask__Group__1"
    // InternalMyDsl.g:2801:1: rule__CompoundTask__Group__1 : rule__CompoundTask__Group__1__Impl rule__CompoundTask__Group__2 ;
    public final void rule__CompoundTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2805:1: ( rule__CompoundTask__Group__1__Impl rule__CompoundTask__Group__2 )
            // InternalMyDsl.g:2806:2: rule__CompoundTask__Group__1__Impl rule__CompoundTask__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__CompoundTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__1"


    // $ANTLR start "rule__CompoundTask__Group__1__Impl"
    // InternalMyDsl.g:2813:1: rule__CompoundTask__Group__1__Impl : ( ':' ) ;
    public final void rule__CompoundTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2817:1: ( ( ':' ) )
            // InternalMyDsl.g:2818:1: ( ':' )
            {
            // InternalMyDsl.g:2818:1: ( ':' )
            // InternalMyDsl.g:2819:2: ':'
            {
             before(grammarAccess.getCompoundTaskAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompoundTaskAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__1__Impl"


    // $ANTLR start "rule__CompoundTask__Group__2"
    // InternalMyDsl.g:2828:1: rule__CompoundTask__Group__2 : rule__CompoundTask__Group__2__Impl rule__CompoundTask__Group__3 ;
    public final void rule__CompoundTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2832:1: ( rule__CompoundTask__Group__2__Impl rule__CompoundTask__Group__3 )
            // InternalMyDsl.g:2833:2: rule__CompoundTask__Group__2__Impl rule__CompoundTask__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__CompoundTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__2"


    // $ANTLR start "rule__CompoundTask__Group__2__Impl"
    // InternalMyDsl.g:2840:1: rule__CompoundTask__Group__2__Impl : ( 'subtasks' ) ;
    public final void rule__CompoundTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2844:1: ( ( 'subtasks' ) )
            // InternalMyDsl.g:2845:1: ( 'subtasks' )
            {
            // InternalMyDsl.g:2845:1: ( 'subtasks' )
            // InternalMyDsl.g:2846:2: 'subtasks'
            {
             before(grammarAccess.getCompoundTaskAccess().getSubtasksKeyword_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCompoundTaskAccess().getSubtasksKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__2__Impl"


    // $ANTLR start "rule__CompoundTask__Group__3"
    // InternalMyDsl.g:2855:1: rule__CompoundTask__Group__3 : rule__CompoundTask__Group__3__Impl rule__CompoundTask__Group__4 ;
    public final void rule__CompoundTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2859:1: ( rule__CompoundTask__Group__3__Impl rule__CompoundTask__Group__4 )
            // InternalMyDsl.g:2860:2: rule__CompoundTask__Group__3__Impl rule__CompoundTask__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__CompoundTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__3"


    // $ANTLR start "rule__CompoundTask__Group__3__Impl"
    // InternalMyDsl.g:2867:1: rule__CompoundTask__Group__3__Impl : ( '[' ) ;
    public final void rule__CompoundTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2871:1: ( ( '[' ) )
            // InternalMyDsl.g:2872:1: ( '[' )
            {
            // InternalMyDsl.g:2872:1: ( '[' )
            // InternalMyDsl.g:2873:2: '['
            {
             before(grammarAccess.getCompoundTaskAccess().getLeftSquareBracketKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCompoundTaskAccess().getLeftSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__3__Impl"


    // $ANTLR start "rule__CompoundTask__Group__4"
    // InternalMyDsl.g:2882:1: rule__CompoundTask__Group__4 : rule__CompoundTask__Group__4__Impl rule__CompoundTask__Group__5 ;
    public final void rule__CompoundTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2886:1: ( rule__CompoundTask__Group__4__Impl rule__CompoundTask__Group__5 )
            // InternalMyDsl.g:2887:2: rule__CompoundTask__Group__4__Impl rule__CompoundTask__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__CompoundTask__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__4"


    // $ANTLR start "rule__CompoundTask__Group__4__Impl"
    // InternalMyDsl.g:2894:1: rule__CompoundTask__Group__4__Impl : ( ( rule__CompoundTask__Group_4__0 )? ) ;
    public final void rule__CompoundTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2898:1: ( ( ( rule__CompoundTask__Group_4__0 )? ) )
            // InternalMyDsl.g:2899:1: ( ( rule__CompoundTask__Group_4__0 )? )
            {
            // InternalMyDsl.g:2899:1: ( ( rule__CompoundTask__Group_4__0 )? )
            // InternalMyDsl.g:2900:2: ( rule__CompoundTask__Group_4__0 )?
            {
             before(grammarAccess.getCompoundTaskAccess().getGroup_4()); 
            // InternalMyDsl.g:2901:2: ( rule__CompoundTask__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:2901:3: rule__CompoundTask__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompoundTask__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundTaskAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__4__Impl"


    // $ANTLR start "rule__CompoundTask__Group__5"
    // InternalMyDsl.g:2909:1: rule__CompoundTask__Group__5 : rule__CompoundTask__Group__5__Impl rule__CompoundTask__Group__6 ;
    public final void rule__CompoundTask__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2913:1: ( rule__CompoundTask__Group__5__Impl rule__CompoundTask__Group__6 )
            // InternalMyDsl.g:2914:2: rule__CompoundTask__Group__5__Impl rule__CompoundTask__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__CompoundTask__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__5"


    // $ANTLR start "rule__CompoundTask__Group__5__Impl"
    // InternalMyDsl.g:2921:1: rule__CompoundTask__Group__5__Impl : ( ']' ) ;
    public final void rule__CompoundTask__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2925:1: ( ( ']' ) )
            // InternalMyDsl.g:2926:1: ( ']' )
            {
            // InternalMyDsl.g:2926:1: ( ']' )
            // InternalMyDsl.g:2927:2: ']'
            {
             before(grammarAccess.getCompoundTaskAccess().getRightSquareBracketKeyword_5()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCompoundTaskAccess().getRightSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__5__Impl"


    // $ANTLR start "rule__CompoundTask__Group__6"
    // InternalMyDsl.g:2936:1: rule__CompoundTask__Group__6 : rule__CompoundTask__Group__6__Impl ;
    public final void rule__CompoundTask__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2940:1: ( rule__CompoundTask__Group__6__Impl )
            // InternalMyDsl.g:2941:2: rule__CompoundTask__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__6"


    // $ANTLR start "rule__CompoundTask__Group__6__Impl"
    // InternalMyDsl.g:2947:1: rule__CompoundTask__Group__6__Impl : ( ( rule__CompoundTask__Alternatives_6 )? ) ;
    public final void rule__CompoundTask__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2951:1: ( ( ( rule__CompoundTask__Alternatives_6 )? ) )
            // InternalMyDsl.g:2952:1: ( ( rule__CompoundTask__Alternatives_6 )? )
            {
            // InternalMyDsl.g:2952:1: ( ( rule__CompoundTask__Alternatives_6 )? )
            // InternalMyDsl.g:2953:2: ( rule__CompoundTask__Alternatives_6 )?
            {
             before(grammarAccess.getCompoundTaskAccess().getAlternatives_6()); 
            // InternalMyDsl.g:2954:2: ( rule__CompoundTask__Alternatives_6 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:2954:3: rule__CompoundTask__Alternatives_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompoundTask__Alternatives_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompoundTaskAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group__6__Impl"


    // $ANTLR start "rule__CompoundTask__Group_4__0"
    // InternalMyDsl.g:2963:1: rule__CompoundTask__Group_4__0 : rule__CompoundTask__Group_4__0__Impl rule__CompoundTask__Group_4__1 ;
    public final void rule__CompoundTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2967:1: ( rule__CompoundTask__Group_4__0__Impl rule__CompoundTask__Group_4__1 )
            // InternalMyDsl.g:2968:2: rule__CompoundTask__Group_4__0__Impl rule__CompoundTask__Group_4__1
            {
            pushFollow(FOLLOW_37);
            rule__CompoundTask__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_4__0"


    // $ANTLR start "rule__CompoundTask__Group_4__0__Impl"
    // InternalMyDsl.g:2975:1: rule__CompoundTask__Group_4__0__Impl : ( ( rule__CompoundTask__CanDoTaskAssignment_4_0 ) ) ;
    public final void rule__CompoundTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2979:1: ( ( ( rule__CompoundTask__CanDoTaskAssignment_4_0 ) ) )
            // InternalMyDsl.g:2980:1: ( ( rule__CompoundTask__CanDoTaskAssignment_4_0 ) )
            {
            // InternalMyDsl.g:2980:1: ( ( rule__CompoundTask__CanDoTaskAssignment_4_0 ) )
            // InternalMyDsl.g:2981:2: ( rule__CompoundTask__CanDoTaskAssignment_4_0 )
            {
             before(grammarAccess.getCompoundTaskAccess().getCanDoTaskAssignment_4_0()); 
            // InternalMyDsl.g:2982:2: ( rule__CompoundTask__CanDoTaskAssignment_4_0 )
            // InternalMyDsl.g:2982:3: rule__CompoundTask__CanDoTaskAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__CanDoTaskAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getCompoundTaskAccess().getCanDoTaskAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_4__0__Impl"


    // $ANTLR start "rule__CompoundTask__Group_4__1"
    // InternalMyDsl.g:2990:1: rule__CompoundTask__Group_4__1 : rule__CompoundTask__Group_4__1__Impl ;
    public final void rule__CompoundTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2994:1: ( rule__CompoundTask__Group_4__1__Impl )
            // InternalMyDsl.g:2995:2: rule__CompoundTask__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_4__1"


    // $ANTLR start "rule__CompoundTask__Group_4__1__Impl"
    // InternalMyDsl.g:3001:1: rule__CompoundTask__Group_4__1__Impl : ( ( rule__CompoundTask__Group_4_1__0 )* ) ;
    public final void rule__CompoundTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3005:1: ( ( ( rule__CompoundTask__Group_4_1__0 )* ) )
            // InternalMyDsl.g:3006:1: ( ( rule__CompoundTask__Group_4_1__0 )* )
            {
            // InternalMyDsl.g:3006:1: ( ( rule__CompoundTask__Group_4_1__0 )* )
            // InternalMyDsl.g:3007:2: ( rule__CompoundTask__Group_4_1__0 )*
            {
             before(grammarAccess.getCompoundTaskAccess().getGroup_4_1()); 
            // InternalMyDsl.g:3008:2: ( rule__CompoundTask__Group_4_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==32) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:3008:3: rule__CompoundTask__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CompoundTask__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getCompoundTaskAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_4__1__Impl"


    // $ANTLR start "rule__CompoundTask__Group_4_1__0"
    // InternalMyDsl.g:3017:1: rule__CompoundTask__Group_4_1__0 : rule__CompoundTask__Group_4_1__0__Impl rule__CompoundTask__Group_4_1__1 ;
    public final void rule__CompoundTask__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3021:1: ( rule__CompoundTask__Group_4_1__0__Impl rule__CompoundTask__Group_4_1__1 )
            // InternalMyDsl.g:3022:2: rule__CompoundTask__Group_4_1__0__Impl rule__CompoundTask__Group_4_1__1
            {
            pushFollow(FOLLOW_9);
            rule__CompoundTask__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_4_1__0"


    // $ANTLR start "rule__CompoundTask__Group_4_1__0__Impl"
    // InternalMyDsl.g:3029:1: rule__CompoundTask__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__CompoundTask__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3033:1: ( ( ',' ) )
            // InternalMyDsl.g:3034:1: ( ',' )
            {
            // InternalMyDsl.g:3034:1: ( ',' )
            // InternalMyDsl.g:3035:2: ','
            {
             before(grammarAccess.getCompoundTaskAccess().getCommaKeyword_4_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompoundTaskAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_4_1__0__Impl"


    // $ANTLR start "rule__CompoundTask__Group_4_1__1"
    // InternalMyDsl.g:3044:1: rule__CompoundTask__Group_4_1__1 : rule__CompoundTask__Group_4_1__1__Impl ;
    public final void rule__CompoundTask__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3048:1: ( rule__CompoundTask__Group_4_1__1__Impl )
            // InternalMyDsl.g:3049:2: rule__CompoundTask__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_4_1__1"


    // $ANTLR start "rule__CompoundTask__Group_4_1__1__Impl"
    // InternalMyDsl.g:3055:1: rule__CompoundTask__Group_4_1__1__Impl : ( ( rule__CompoundTask__CanDoTaskAssignment_4_1_1 ) ) ;
    public final void rule__CompoundTask__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3059:1: ( ( ( rule__CompoundTask__CanDoTaskAssignment_4_1_1 ) ) )
            // InternalMyDsl.g:3060:1: ( ( rule__CompoundTask__CanDoTaskAssignment_4_1_1 ) )
            {
            // InternalMyDsl.g:3060:1: ( ( rule__CompoundTask__CanDoTaskAssignment_4_1_1 ) )
            // InternalMyDsl.g:3061:2: ( rule__CompoundTask__CanDoTaskAssignment_4_1_1 )
            {
             before(grammarAccess.getCompoundTaskAccess().getCanDoTaskAssignment_4_1_1()); 
            // InternalMyDsl.g:3062:2: ( rule__CompoundTask__CanDoTaskAssignment_4_1_1 )
            // InternalMyDsl.g:3062:3: rule__CompoundTask__CanDoTaskAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__CanDoTaskAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompoundTaskAccess().getCanDoTaskAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_4_1__1__Impl"


    // $ANTLR start "rule__CompoundTask__Group_6_0__0"
    // InternalMyDsl.g:3071:1: rule__CompoundTask__Group_6_0__0 : rule__CompoundTask__Group_6_0__0__Impl rule__CompoundTask__Group_6_0__1 ;
    public final void rule__CompoundTask__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3075:1: ( rule__CompoundTask__Group_6_0__0__Impl rule__CompoundTask__Group_6_0__1 )
            // InternalMyDsl.g:3076:2: rule__CompoundTask__Group_6_0__0__Impl rule__CompoundTask__Group_6_0__1
            {
            pushFollow(FOLLOW_38);
            rule__CompoundTask__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_6_0__0"


    // $ANTLR start "rule__CompoundTask__Group_6_0__0__Impl"
    // InternalMyDsl.g:3083:1: rule__CompoundTask__Group_6_0__0__Impl : ( 'constraint:' ) ;
    public final void rule__CompoundTask__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3087:1: ( ( 'constraint:' ) )
            // InternalMyDsl.g:3088:1: ( 'constraint:' )
            {
            // InternalMyDsl.g:3088:1: ( 'constraint:' )
            // InternalMyDsl.g:3089:2: 'constraint:'
            {
             before(grammarAccess.getCompoundTaskAccess().getConstraintKeyword_6_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCompoundTaskAccess().getConstraintKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_6_0__0__Impl"


    // $ANTLR start "rule__CompoundTask__Group_6_0__1"
    // InternalMyDsl.g:3098:1: rule__CompoundTask__Group_6_0__1 : rule__CompoundTask__Group_6_0__1__Impl ;
    public final void rule__CompoundTask__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3102:1: ( rule__CompoundTask__Group_6_0__1__Impl )
            // InternalMyDsl.g:3103:2: rule__CompoundTask__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_6_0__1"


    // $ANTLR start "rule__CompoundTask__Group_6_0__1__Impl"
    // InternalMyDsl.g:3109:1: rule__CompoundTask__Group_6_0__1__Impl : ( ( rule__CompoundTask__OrderedAssignment_6_0_1 ) ) ;
    public final void rule__CompoundTask__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3113:1: ( ( ( rule__CompoundTask__OrderedAssignment_6_0_1 ) ) )
            // InternalMyDsl.g:3114:1: ( ( rule__CompoundTask__OrderedAssignment_6_0_1 ) )
            {
            // InternalMyDsl.g:3114:1: ( ( rule__CompoundTask__OrderedAssignment_6_0_1 ) )
            // InternalMyDsl.g:3115:2: ( rule__CompoundTask__OrderedAssignment_6_0_1 )
            {
             before(grammarAccess.getCompoundTaskAccess().getOrderedAssignment_6_0_1()); 
            // InternalMyDsl.g:3116:2: ( rule__CompoundTask__OrderedAssignment_6_0_1 )
            // InternalMyDsl.g:3116:3: rule__CompoundTask__OrderedAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__OrderedAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompoundTaskAccess().getOrderedAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_6_0__1__Impl"


    // $ANTLR start "rule__CompoundTask__Group_6_1__0"
    // InternalMyDsl.g:3125:1: rule__CompoundTask__Group_6_1__0 : rule__CompoundTask__Group_6_1__0__Impl rule__CompoundTask__Group_6_1__1 ;
    public final void rule__CompoundTask__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3129:1: ( rule__CompoundTask__Group_6_1__0__Impl rule__CompoundTask__Group_6_1__1 )
            // InternalMyDsl.g:3130:2: rule__CompoundTask__Group_6_1__0__Impl rule__CompoundTask__Group_6_1__1
            {
            pushFollow(FOLLOW_39);
            rule__CompoundTask__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_6_1__0"


    // $ANTLR start "rule__CompoundTask__Group_6_1__0__Impl"
    // InternalMyDsl.g:3137:1: rule__CompoundTask__Group_6_1__0__Impl : ( 'constraint:' ) ;
    public final void rule__CompoundTask__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3141:1: ( ( 'constraint:' ) )
            // InternalMyDsl.g:3142:1: ( 'constraint:' )
            {
            // InternalMyDsl.g:3142:1: ( 'constraint:' )
            // InternalMyDsl.g:3143:2: 'constraint:'
            {
             before(grammarAccess.getCompoundTaskAccess().getConstraintKeyword_6_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getCompoundTaskAccess().getConstraintKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_6_1__0__Impl"


    // $ANTLR start "rule__CompoundTask__Group_6_1__1"
    // InternalMyDsl.g:3152:1: rule__CompoundTask__Group_6_1__1 : rule__CompoundTask__Group_6_1__1__Impl ;
    public final void rule__CompoundTask__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3156:1: ( rule__CompoundTask__Group_6_1__1__Impl )
            // InternalMyDsl.g:3157:2: rule__CompoundTask__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_6_1__1"


    // $ANTLR start "rule__CompoundTask__Group_6_1__1__Impl"
    // InternalMyDsl.g:3163:1: rule__CompoundTask__Group_6_1__1__Impl : ( ( rule__CompoundTask__ConsecutiveAssignment_6_1_1 ) ) ;
    public final void rule__CompoundTask__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3167:1: ( ( ( rule__CompoundTask__ConsecutiveAssignment_6_1_1 ) ) )
            // InternalMyDsl.g:3168:1: ( ( rule__CompoundTask__ConsecutiveAssignment_6_1_1 ) )
            {
            // InternalMyDsl.g:3168:1: ( ( rule__CompoundTask__ConsecutiveAssignment_6_1_1 ) )
            // InternalMyDsl.g:3169:2: ( rule__CompoundTask__ConsecutiveAssignment_6_1_1 )
            {
             before(grammarAccess.getCompoundTaskAccess().getConsecutiveAssignment_6_1_1()); 
            // InternalMyDsl.g:3170:2: ( rule__CompoundTask__ConsecutiveAssignment_6_1_1 )
            // InternalMyDsl.g:3170:3: rule__CompoundTask__ConsecutiveAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompoundTask__ConsecutiveAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompoundTaskAccess().getConsecutiveAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__Group_6_1__1__Impl"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalMyDsl.g:3179:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3183:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:3184:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalMyDsl.g:3191:1: rule__Robot__Group__0__Impl : ( ( rule__Robot__NameAssignment_0 ) ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3195:1: ( ( ( rule__Robot__NameAssignment_0 ) ) )
            // InternalMyDsl.g:3196:1: ( ( rule__Robot__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:3196:1: ( ( rule__Robot__NameAssignment_0 ) )
            // InternalMyDsl.g:3197:2: ( rule__Robot__NameAssignment_0 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:3198:2: ( rule__Robot__NameAssignment_0 )
            // InternalMyDsl.g:3198:3: rule__Robot__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalMyDsl.g:3206:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3210:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:3211:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalMyDsl.g:3218:1: rule__Robot__Group__1__Impl : ( ':' ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3222:1: ( ( ':' ) )
            // InternalMyDsl.g:3223:1: ( ':' )
            {
            // InternalMyDsl.g:3223:1: ( ':' )
            // InternalMyDsl.g:3224:2: ':'
            {
             before(grammarAccess.getRobotAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalMyDsl.g:3233:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3237:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalMyDsl.g:3238:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_41);
            rule__Robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalMyDsl.g:3245:1: rule__Robot__Group__2__Impl : ( 'at' ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3249:1: ( ( 'at' ) )
            // InternalMyDsl.g:3250:1: ( 'at' )
            {
            // InternalMyDsl.g:3250:1: ( 'at' )
            // InternalMyDsl.g:3251:2: 'at'
            {
             before(grammarAccess.getRobotAccess().getAtKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getAtKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__3"
    // InternalMyDsl.g:3260:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3264:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalMyDsl.g:3265:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__Robot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3"


    // $ANTLR start "rule__Robot__Group__3__Impl"
    // InternalMyDsl.g:3272:1: rule__Robot__Group__3__Impl : ( 'initial' ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3276:1: ( ( 'initial' ) )
            // InternalMyDsl.g:3277:1: ( 'initial' )
            {
            // InternalMyDsl.g:3277:1: ( 'initial' )
            // InternalMyDsl.g:3278:2: 'initial'
            {
             before(grammarAccess.getRobotAccess().getInitialKeyword_3()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getInitialKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3__Impl"


    // $ANTLR start "rule__Robot__Group__4"
    // InternalMyDsl.g:3287:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3291:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalMyDsl.g:3292:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Robot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4"


    // $ANTLR start "rule__Robot__Group__4__Impl"
    // InternalMyDsl.g:3299:1: rule__Robot__Group__4__Impl : ( 'position' ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3303:1: ( ( 'position' ) )
            // InternalMyDsl.g:3304:1: ( 'position' )
            {
            // InternalMyDsl.g:3304:1: ( 'position' )
            // InternalMyDsl.g:3305:2: 'position'
            {
             before(grammarAccess.getRobotAccess().getPositionKeyword_4()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getPositionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4__Impl"


    // $ANTLR start "rule__Robot__Group__5"
    // InternalMyDsl.g:3314:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl rule__Robot__Group__6 ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3318:1: ( rule__Robot__Group__5__Impl rule__Robot__Group__6 )
            // InternalMyDsl.g:3319:2: rule__Robot__Group__5__Impl rule__Robot__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Robot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__5"


    // $ANTLR start "rule__Robot__Group__5__Impl"
    // InternalMyDsl.g:3326:1: rule__Robot__Group__5__Impl : ( ( rule__Robot__InitLocAssignment_5 ) ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3330:1: ( ( ( rule__Robot__InitLocAssignment_5 ) ) )
            // InternalMyDsl.g:3331:1: ( ( rule__Robot__InitLocAssignment_5 ) )
            {
            // InternalMyDsl.g:3331:1: ( ( rule__Robot__InitLocAssignment_5 ) )
            // InternalMyDsl.g:3332:2: ( rule__Robot__InitLocAssignment_5 )
            {
             before(grammarAccess.getRobotAccess().getInitLocAssignment_5()); 
            // InternalMyDsl.g:3333:2: ( rule__Robot__InitLocAssignment_5 )
            // InternalMyDsl.g:3333:3: rule__Robot__InitLocAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Robot__InitLocAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getInitLocAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__5__Impl"


    // $ANTLR start "rule__Robot__Group__6"
    // InternalMyDsl.g:3341:1: rule__Robot__Group__6 : rule__Robot__Group__6__Impl rule__Robot__Group__7 ;
    public final void rule__Robot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3345:1: ( rule__Robot__Group__6__Impl rule__Robot__Group__7 )
            // InternalMyDsl.g:3346:2: rule__Robot__Group__6__Impl rule__Robot__Group__7
            {
            pushFollow(FOLLOW_43);
            rule__Robot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__6"


    // $ANTLR start "rule__Robot__Group__6__Impl"
    // InternalMyDsl.g:3353:1: rule__Robot__Group__6__Impl : ( 'has' ) ;
    public final void rule__Robot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3357:1: ( ( 'has' ) )
            // InternalMyDsl.g:3358:1: ( 'has' )
            {
            // InternalMyDsl.g:3358:1: ( 'has' )
            // InternalMyDsl.g:3359:2: 'has'
            {
             before(grammarAccess.getRobotAccess().getHasKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getHasKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__6__Impl"


    // $ANTLR start "rule__Robot__Group__7"
    // InternalMyDsl.g:3368:1: rule__Robot__Group__7 : rule__Robot__Group__7__Impl rule__Robot__Group__8 ;
    public final void rule__Robot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3372:1: ( rule__Robot__Group__7__Impl rule__Robot__Group__8 )
            // InternalMyDsl.g:3373:2: rule__Robot__Group__7__Impl rule__Robot__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Robot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__7"


    // $ANTLR start "rule__Robot__Group__7__Impl"
    // InternalMyDsl.g:3380:1: rule__Robot__Group__7__Impl : ( 'velocity' ) ;
    public final void rule__Robot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3384:1: ( ( 'velocity' ) )
            // InternalMyDsl.g:3385:1: ( 'velocity' )
            {
            // InternalMyDsl.g:3385:1: ( 'velocity' )
            // InternalMyDsl.g:3386:2: 'velocity'
            {
             before(grammarAccess.getRobotAccess().getVelocityKeyword_7()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getVelocityKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__7__Impl"


    // $ANTLR start "rule__Robot__Group__8"
    // InternalMyDsl.g:3395:1: rule__Robot__Group__8 : rule__Robot__Group__8__Impl rule__Robot__Group__9 ;
    public final void rule__Robot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3399:1: ( rule__Robot__Group__8__Impl rule__Robot__Group__9 )
            // InternalMyDsl.g:3400:2: rule__Robot__Group__8__Impl rule__Robot__Group__9
            {
            pushFollow(FOLLOW_44);
            rule__Robot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__8"


    // $ANTLR start "rule__Robot__Group__8__Impl"
    // InternalMyDsl.g:3407:1: rule__Robot__Group__8__Impl : ( ( rule__Robot__VelocityAssignment_8 ) ) ;
    public final void rule__Robot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3411:1: ( ( ( rule__Robot__VelocityAssignment_8 ) ) )
            // InternalMyDsl.g:3412:1: ( ( rule__Robot__VelocityAssignment_8 ) )
            {
            // InternalMyDsl.g:3412:1: ( ( rule__Robot__VelocityAssignment_8 ) )
            // InternalMyDsl.g:3413:2: ( rule__Robot__VelocityAssignment_8 )
            {
             before(grammarAccess.getRobotAccess().getVelocityAssignment_8()); 
            // InternalMyDsl.g:3414:2: ( rule__Robot__VelocityAssignment_8 )
            // InternalMyDsl.g:3414:3: rule__Robot__VelocityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Robot__VelocityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getVelocityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__8__Impl"


    // $ANTLR start "rule__Robot__Group__9"
    // InternalMyDsl.g:3422:1: rule__Robot__Group__9 : rule__Robot__Group__9__Impl rule__Robot__Group__10 ;
    public final void rule__Robot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3426:1: ( rule__Robot__Group__9__Impl rule__Robot__Group__10 )
            // InternalMyDsl.g:3427:2: rule__Robot__Group__9__Impl rule__Robot__Group__10
            {
            pushFollow(FOLLOW_45);
            rule__Robot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__9"


    // $ANTLR start "rule__Robot__Group__9__Impl"
    // InternalMyDsl.g:3434:1: rule__Robot__Group__9__Impl : ( 'with' ) ;
    public final void rule__Robot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3438:1: ( ( 'with' ) )
            // InternalMyDsl.g:3439:1: ( 'with' )
            {
            // InternalMyDsl.g:3439:1: ( 'with' )
            // InternalMyDsl.g:3440:2: 'with'
            {
             before(grammarAccess.getRobotAccess().getWithKeyword_9()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getWithKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__9__Impl"


    // $ANTLR start "rule__Robot__Group__10"
    // InternalMyDsl.g:3449:1: rule__Robot__Group__10 : rule__Robot__Group__10__Impl rule__Robot__Group__11 ;
    public final void rule__Robot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3453:1: ( rule__Robot__Group__10__Impl rule__Robot__Group__11 )
            // InternalMyDsl.g:3454:2: rule__Robot__Group__10__Impl rule__Robot__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Robot__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__10"


    // $ANTLR start "rule__Robot__Group__10__Impl"
    // InternalMyDsl.g:3461:1: rule__Robot__Group__10__Impl : ( 'capabilities' ) ;
    public final void rule__Robot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3465:1: ( ( 'capabilities' ) )
            // InternalMyDsl.g:3466:1: ( 'capabilities' )
            {
            // InternalMyDsl.g:3466:1: ( 'capabilities' )
            // InternalMyDsl.g:3467:2: 'capabilities'
            {
             before(grammarAccess.getRobotAccess().getCapabilitiesKeyword_10()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCapabilitiesKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__10__Impl"


    // $ANTLR start "rule__Robot__Group__11"
    // InternalMyDsl.g:3476:1: rule__Robot__Group__11 : rule__Robot__Group__11__Impl rule__Robot__Group__12 ;
    public final void rule__Robot__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3480:1: ( rule__Robot__Group__11__Impl rule__Robot__Group__12 )
            // InternalMyDsl.g:3481:2: rule__Robot__Group__11__Impl rule__Robot__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Robot__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__11"


    // $ANTLR start "rule__Robot__Group__11__Impl"
    // InternalMyDsl.g:3488:1: rule__Robot__Group__11__Impl : ( '(' ) ;
    public final void rule__Robot__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3492:1: ( ( '(' ) )
            // InternalMyDsl.g:3493:1: ( '(' )
            {
            // InternalMyDsl.g:3493:1: ( '(' )
            // InternalMyDsl.g:3494:2: '('
            {
             before(grammarAccess.getRobotAccess().getLeftParenthesisKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getLeftParenthesisKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__11__Impl"


    // $ANTLR start "rule__Robot__Group__12"
    // InternalMyDsl.g:3503:1: rule__Robot__Group__12 : rule__Robot__Group__12__Impl rule__Robot__Group__13 ;
    public final void rule__Robot__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3507:1: ( rule__Robot__Group__12__Impl rule__Robot__Group__13 )
            // InternalMyDsl.g:3508:2: rule__Robot__Group__12__Impl rule__Robot__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__Robot__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__12"


    // $ANTLR start "rule__Robot__Group__12__Impl"
    // InternalMyDsl.g:3515:1: rule__Robot__Group__12__Impl : ( ( rule__Robot__CapabilitiesAssignment_12 ) ) ;
    public final void rule__Robot__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3519:1: ( ( ( rule__Robot__CapabilitiesAssignment_12 ) ) )
            // InternalMyDsl.g:3520:1: ( ( rule__Robot__CapabilitiesAssignment_12 ) )
            {
            // InternalMyDsl.g:3520:1: ( ( rule__Robot__CapabilitiesAssignment_12 ) )
            // InternalMyDsl.g:3521:2: ( rule__Robot__CapabilitiesAssignment_12 )
            {
             before(grammarAccess.getRobotAccess().getCapabilitiesAssignment_12()); 
            // InternalMyDsl.g:3522:2: ( rule__Robot__CapabilitiesAssignment_12 )
            // InternalMyDsl.g:3522:3: rule__Robot__CapabilitiesAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Robot__CapabilitiesAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getCapabilitiesAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__12__Impl"


    // $ANTLR start "rule__Robot__Group__13"
    // InternalMyDsl.g:3530:1: rule__Robot__Group__13 : rule__Robot__Group__13__Impl rule__Robot__Group__14 ;
    public final void rule__Robot__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3534:1: ( rule__Robot__Group__13__Impl rule__Robot__Group__14 )
            // InternalMyDsl.g:3535:2: rule__Robot__Group__13__Impl rule__Robot__Group__14
            {
            pushFollow(FOLLOW_18);
            rule__Robot__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__13"


    // $ANTLR start "rule__Robot__Group__13__Impl"
    // InternalMyDsl.g:3542:1: rule__Robot__Group__13__Impl : ( ( rule__Robot__Group_13__0 )* ) ;
    public final void rule__Robot__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3546:1: ( ( ( rule__Robot__Group_13__0 )* ) )
            // InternalMyDsl.g:3547:1: ( ( rule__Robot__Group_13__0 )* )
            {
            // InternalMyDsl.g:3547:1: ( ( rule__Robot__Group_13__0 )* )
            // InternalMyDsl.g:3548:2: ( rule__Robot__Group_13__0 )*
            {
             before(grammarAccess.getRobotAccess().getGroup_13()); 
            // InternalMyDsl.g:3549:2: ( rule__Robot__Group_13__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:3549:3: rule__Robot__Group_13__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Robot__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__13__Impl"


    // $ANTLR start "rule__Robot__Group__14"
    // InternalMyDsl.g:3557:1: rule__Robot__Group__14 : rule__Robot__Group__14__Impl ;
    public final void rule__Robot__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3561:1: ( rule__Robot__Group__14__Impl )
            // InternalMyDsl.g:3562:2: rule__Robot__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__14"


    // $ANTLR start "rule__Robot__Group__14__Impl"
    // InternalMyDsl.g:3568:1: rule__Robot__Group__14__Impl : ( ')' ) ;
    public final void rule__Robot__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3572:1: ( ( ')' ) )
            // InternalMyDsl.g:3573:1: ( ')' )
            {
            // InternalMyDsl.g:3573:1: ( ')' )
            // InternalMyDsl.g:3574:2: ')'
            {
             before(grammarAccess.getRobotAccess().getRightParenthesisKeyword_14()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRightParenthesisKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__14__Impl"


    // $ANTLR start "rule__Robot__Group_13__0"
    // InternalMyDsl.g:3584:1: rule__Robot__Group_13__0 : rule__Robot__Group_13__0__Impl rule__Robot__Group_13__1 ;
    public final void rule__Robot__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3588:1: ( rule__Robot__Group_13__0__Impl rule__Robot__Group_13__1 )
            // InternalMyDsl.g:3589:2: rule__Robot__Group_13__0__Impl rule__Robot__Group_13__1
            {
            pushFollow(FOLLOW_9);
            rule__Robot__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_13__0"


    // $ANTLR start "rule__Robot__Group_13__0__Impl"
    // InternalMyDsl.g:3596:1: rule__Robot__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Robot__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3600:1: ( ( ',' ) )
            // InternalMyDsl.g:3601:1: ( ',' )
            {
            // InternalMyDsl.g:3601:1: ( ',' )
            // InternalMyDsl.g:3602:2: ','
            {
             before(grammarAccess.getRobotAccess().getCommaKeyword_13_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_13__0__Impl"


    // $ANTLR start "rule__Robot__Group_13__1"
    // InternalMyDsl.g:3611:1: rule__Robot__Group_13__1 : rule__Robot__Group_13__1__Impl ;
    public final void rule__Robot__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3615:1: ( rule__Robot__Group_13__1__Impl )
            // InternalMyDsl.g:3616:2: rule__Robot__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_13__1"


    // $ANTLR start "rule__Robot__Group_13__1__Impl"
    // InternalMyDsl.g:3622:1: rule__Robot__Group_13__1__Impl : ( ( rule__Robot__CapabilitiesAssignment_13_1 ) ) ;
    public final void rule__Robot__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3626:1: ( ( ( rule__Robot__CapabilitiesAssignment_13_1 ) ) )
            // InternalMyDsl.g:3627:1: ( ( rule__Robot__CapabilitiesAssignment_13_1 ) )
            {
            // InternalMyDsl.g:3627:1: ( ( rule__Robot__CapabilitiesAssignment_13_1 ) )
            // InternalMyDsl.g:3628:2: ( rule__Robot__CapabilitiesAssignment_13_1 )
            {
             before(grammarAccess.getRobotAccess().getCapabilitiesAssignment_13_1()); 
            // InternalMyDsl.g:3629:2: ( rule__Robot__CapabilitiesAssignment_13_1 )
            // InternalMyDsl.g:3629:3: rule__Robot__CapabilitiesAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__CapabilitiesAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getCapabilitiesAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_13__1__Impl"


    // $ANTLR start "rule__Capability__Group__0"
    // InternalMyDsl.g:3638:1: rule__Capability__Group__0 : rule__Capability__Group__0__Impl rule__Capability__Group__1 ;
    public final void rule__Capability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3642:1: ( rule__Capability__Group__0__Impl rule__Capability__Group__1 )
            // InternalMyDsl.g:3643:2: rule__Capability__Group__0__Impl rule__Capability__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__Capability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__0"


    // $ANTLR start "rule__Capability__Group__0__Impl"
    // InternalMyDsl.g:3650:1: rule__Capability__Group__0__Impl : ( ( rule__Capability__AtAssignment_0 ) ) ;
    public final void rule__Capability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3654:1: ( ( ( rule__Capability__AtAssignment_0 ) ) )
            // InternalMyDsl.g:3655:1: ( ( rule__Capability__AtAssignment_0 ) )
            {
            // InternalMyDsl.g:3655:1: ( ( rule__Capability__AtAssignment_0 ) )
            // InternalMyDsl.g:3656:2: ( rule__Capability__AtAssignment_0 )
            {
             before(grammarAccess.getCapabilityAccess().getAtAssignment_0()); 
            // InternalMyDsl.g:3657:2: ( rule__Capability__AtAssignment_0 )
            // InternalMyDsl.g:3657:3: rule__Capability__AtAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Capability__AtAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getAtAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__0__Impl"


    // $ANTLR start "rule__Capability__Group__1"
    // InternalMyDsl.g:3665:1: rule__Capability__Group__1 : rule__Capability__Group__1__Impl rule__Capability__Group__2 ;
    public final void rule__Capability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3669:1: ( rule__Capability__Group__1__Impl rule__Capability__Group__2 )
            // InternalMyDsl.g:3670:2: rule__Capability__Group__1__Impl rule__Capability__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__Capability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__1"


    // $ANTLR start "rule__Capability__Group__1__Impl"
    // InternalMyDsl.g:3677:1: rule__Capability__Group__1__Impl : ( '-required' ) ;
    public final void rule__Capability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3681:1: ( ( '-required' ) )
            // InternalMyDsl.g:3682:1: ( '-required' )
            {
            // InternalMyDsl.g:3682:1: ( '-required' )
            // InternalMyDsl.g:3683:2: '-required'
            {
             before(grammarAccess.getCapabilityAccess().getRequiredKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getRequiredKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__1__Impl"


    // $ANTLR start "rule__Capability__Group__2"
    // InternalMyDsl.g:3692:1: rule__Capability__Group__2 : rule__Capability__Group__2__Impl rule__Capability__Group__3 ;
    public final void rule__Capability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3696:1: ( rule__Capability__Group__2__Impl rule__Capability__Group__3 )
            // InternalMyDsl.g:3697:2: rule__Capability__Group__2__Impl rule__Capability__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Capability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__2"


    // $ANTLR start "rule__Capability__Group__2__Impl"
    // InternalMyDsl.g:3704:1: rule__Capability__Group__2__Impl : ( 'time:' ) ;
    public final void rule__Capability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3708:1: ( ( 'time:' ) )
            // InternalMyDsl.g:3709:1: ( 'time:' )
            {
            // InternalMyDsl.g:3709:1: ( 'time:' )
            // InternalMyDsl.g:3710:2: 'time:'
            {
             before(grammarAccess.getCapabilityAccess().getTimeKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getTimeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__2__Impl"


    // $ANTLR start "rule__Capability__Group__3"
    // InternalMyDsl.g:3719:1: rule__Capability__Group__3 : rule__Capability__Group__3__Impl rule__Capability__Group__4 ;
    public final void rule__Capability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3723:1: ( rule__Capability__Group__3__Impl rule__Capability__Group__4 )
            // InternalMyDsl.g:3724:2: rule__Capability__Group__3__Impl rule__Capability__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Capability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__3"


    // $ANTLR start "rule__Capability__Group__3__Impl"
    // InternalMyDsl.g:3731:1: rule__Capability__Group__3__Impl : ( ( rule__Capability__TimeAssignment_3 ) ) ;
    public final void rule__Capability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3735:1: ( ( ( rule__Capability__TimeAssignment_3 ) ) )
            // InternalMyDsl.g:3736:1: ( ( rule__Capability__TimeAssignment_3 ) )
            {
            // InternalMyDsl.g:3736:1: ( ( rule__Capability__TimeAssignment_3 ) )
            // InternalMyDsl.g:3737:2: ( rule__Capability__TimeAssignment_3 )
            {
             before(grammarAccess.getCapabilityAccess().getTimeAssignment_3()); 
            // InternalMyDsl.g:3738:2: ( rule__Capability__TimeAssignment_3 )
            // InternalMyDsl.g:3738:3: rule__Capability__TimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Capability__TimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getTimeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__3__Impl"


    // $ANTLR start "rule__Capability__Group__4"
    // InternalMyDsl.g:3746:1: rule__Capability__Group__4 : rule__Capability__Group__4__Impl rule__Capability__Group__5 ;
    public final void rule__Capability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3750:1: ( rule__Capability__Group__4__Impl rule__Capability__Group__5 )
            // InternalMyDsl.g:3751:2: rule__Capability__Group__4__Impl rule__Capability__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Capability__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__4"


    // $ANTLR start "rule__Capability__Group__4__Impl"
    // InternalMyDsl.g:3758:1: rule__Capability__Group__4__Impl : ( ',' ) ;
    public final void rule__Capability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3762:1: ( ( ',' ) )
            // InternalMyDsl.g:3763:1: ( ',' )
            {
            // InternalMyDsl.g:3763:1: ( ',' )
            // InternalMyDsl.g:3764:2: ','
            {
             before(grammarAccess.getCapabilityAccess().getCommaKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__4__Impl"


    // $ANTLR start "rule__Capability__Group__5"
    // InternalMyDsl.g:3773:1: rule__Capability__Group__5 : rule__Capability__Group__5__Impl rule__Capability__Group__6 ;
    public final void rule__Capability__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3777:1: ( rule__Capability__Group__5__Impl rule__Capability__Group__6 )
            // InternalMyDsl.g:3778:2: rule__Capability__Group__5__Impl rule__Capability__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Capability__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__5"


    // $ANTLR start "rule__Capability__Group__5__Impl"
    // InternalMyDsl.g:3785:1: rule__Capability__Group__5__Impl : ( 'success' ) ;
    public final void rule__Capability__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3789:1: ( ( 'success' ) )
            // InternalMyDsl.g:3790:1: ( 'success' )
            {
            // InternalMyDsl.g:3790:1: ( 'success' )
            // InternalMyDsl.g:3791:2: 'success'
            {
             before(grammarAccess.getCapabilityAccess().getSuccessKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getSuccessKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__5__Impl"


    // $ANTLR start "rule__Capability__Group__6"
    // InternalMyDsl.g:3800:1: rule__Capability__Group__6 : rule__Capability__Group__6__Impl rule__Capability__Group__7 ;
    public final void rule__Capability__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3804:1: ( rule__Capability__Group__6__Impl rule__Capability__Group__7 )
            // InternalMyDsl.g:3805:2: rule__Capability__Group__6__Impl rule__Capability__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Capability__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__6"


    // $ANTLR start "rule__Capability__Group__6__Impl"
    // InternalMyDsl.g:3812:1: rule__Capability__Group__6__Impl : ( 'rate:' ) ;
    public final void rule__Capability__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3816:1: ( ( 'rate:' ) )
            // InternalMyDsl.g:3817:1: ( 'rate:' )
            {
            // InternalMyDsl.g:3817:1: ( 'rate:' )
            // InternalMyDsl.g:3818:2: 'rate:'
            {
             before(grammarAccess.getCapabilityAccess().getRateKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getRateKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__6__Impl"


    // $ANTLR start "rule__Capability__Group__7"
    // InternalMyDsl.g:3827:1: rule__Capability__Group__7 : rule__Capability__Group__7__Impl rule__Capability__Group__8 ;
    public final void rule__Capability__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3831:1: ( rule__Capability__Group__7__Impl rule__Capability__Group__8 )
            // InternalMyDsl.g:3832:2: rule__Capability__Group__7__Impl rule__Capability__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Capability__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Capability__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__7"


    // $ANTLR start "rule__Capability__Group__7__Impl"
    // InternalMyDsl.g:3839:1: rule__Capability__Group__7__Impl : ( ( rule__Capability__SuccessAssignment_7 ) ) ;
    public final void rule__Capability__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3843:1: ( ( ( rule__Capability__SuccessAssignment_7 ) ) )
            // InternalMyDsl.g:3844:1: ( ( rule__Capability__SuccessAssignment_7 ) )
            {
            // InternalMyDsl.g:3844:1: ( ( rule__Capability__SuccessAssignment_7 ) )
            // InternalMyDsl.g:3845:2: ( rule__Capability__SuccessAssignment_7 )
            {
             before(grammarAccess.getCapabilityAccess().getSuccessAssignment_7()); 
            // InternalMyDsl.g:3846:2: ( rule__Capability__SuccessAssignment_7 )
            // InternalMyDsl.g:3846:3: rule__Capability__SuccessAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Capability__SuccessAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCapabilityAccess().getSuccessAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__7__Impl"


    // $ANTLR start "rule__Capability__Group__8"
    // InternalMyDsl.g:3854:1: rule__Capability__Group__8 : rule__Capability__Group__8__Impl ;
    public final void rule__Capability__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3858:1: ( rule__Capability__Group__8__Impl )
            // InternalMyDsl.g:3859:2: rule__Capability__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Capability__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__8"


    // $ANTLR start "rule__Capability__Group__8__Impl"
    // InternalMyDsl.g:3865:1: rule__Capability__Group__8__Impl : ( '%' ) ;
    public final void rule__Capability__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3869:1: ( ( '%' ) )
            // InternalMyDsl.g:3870:1: ( '%' )
            {
            // InternalMyDsl.g:3870:1: ( '%' )
            // InternalMyDsl.g:3871:2: '%'
            {
             before(grammarAccess.getCapabilityAccess().getPercentSignKeyword_8()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCapabilityAccess().getPercentSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__Group__8__Impl"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalMyDsl.g:3881:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3885:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalMyDsl.g:3886:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalMyDsl.g:3893:1: rule__Mission__Group__0__Impl : ( ( rule__Mission__MissionTaskAssignment_0 ) ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3897:1: ( ( ( rule__Mission__MissionTaskAssignment_0 ) ) )
            // InternalMyDsl.g:3898:1: ( ( rule__Mission__MissionTaskAssignment_0 ) )
            {
            // InternalMyDsl.g:3898:1: ( ( rule__Mission__MissionTaskAssignment_0 ) )
            // InternalMyDsl.g:3899:2: ( rule__Mission__MissionTaskAssignment_0 )
            {
             before(grammarAccess.getMissionAccess().getMissionTaskAssignment_0()); 
            // InternalMyDsl.g:3900:2: ( rule__Mission__MissionTaskAssignment_0 )
            // InternalMyDsl.g:3900:3: rule__Mission__MissionTaskAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__MissionTaskAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getMissionTaskAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalMyDsl.g:3908:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3912:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalMyDsl.g:3913:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__Mission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalMyDsl.g:3920:1: rule__Mission__Group__1__Impl : ( ( rule__Mission__Group_1__0 )* ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3924:1: ( ( ( rule__Mission__Group_1__0 )* ) )
            // InternalMyDsl.g:3925:1: ( ( rule__Mission__Group_1__0 )* )
            {
            // InternalMyDsl.g:3925:1: ( ( rule__Mission__Group_1__0 )* )
            // InternalMyDsl.g:3926:2: ( rule__Mission__Group_1__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_1()); 
            // InternalMyDsl.g:3927:2: ( rule__Mission__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==32) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:3927:3: rule__Mission__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Mission__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__2"
    // InternalMyDsl.g:3935:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3939:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalMyDsl.g:3940:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_49);
            rule__Mission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2"


    // $ANTLR start "rule__Mission__Group__2__Impl"
    // InternalMyDsl.g:3947:1: rule__Mission__Group__2__Impl : ( 'objectives:' ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3951:1: ( ( 'objectives:' ) )
            // InternalMyDsl.g:3952:1: ( 'objectives:' )
            {
            // InternalMyDsl.g:3952:1: ( 'objectives:' )
            // InternalMyDsl.g:3953:2: 'objectives:'
            {
             before(grammarAccess.getMissionAccess().getObjectivesKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getObjectivesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2__Impl"


    // $ANTLR start "rule__Mission__Group__3"
    // InternalMyDsl.g:3962:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3966:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalMyDsl.g:3967:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__Mission__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3"


    // $ANTLR start "rule__Mission__Group__3__Impl"
    // InternalMyDsl.g:3974:1: rule__Mission__Group__3__Impl : ( ( rule__Mission__ObjAssignment_3 ) ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3978:1: ( ( ( rule__Mission__ObjAssignment_3 ) ) )
            // InternalMyDsl.g:3979:1: ( ( rule__Mission__ObjAssignment_3 ) )
            {
            // InternalMyDsl.g:3979:1: ( ( rule__Mission__ObjAssignment_3 ) )
            // InternalMyDsl.g:3980:2: ( rule__Mission__ObjAssignment_3 )
            {
             before(grammarAccess.getMissionAccess().getObjAssignment_3()); 
            // InternalMyDsl.g:3981:2: ( rule__Mission__ObjAssignment_3 )
            // InternalMyDsl.g:3981:3: rule__Mission__ObjAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ObjAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getObjAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3__Impl"


    // $ANTLR start "rule__Mission__Group__4"
    // InternalMyDsl.g:3989:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3993:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalMyDsl.g:3994:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__Mission__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4"


    // $ANTLR start "rule__Mission__Group__4__Impl"
    // InternalMyDsl.g:4001:1: rule__Mission__Group__4__Impl : ( ( rule__Mission__Group_4__0 )* ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4005:1: ( ( ( rule__Mission__Group_4__0 )* ) )
            // InternalMyDsl.g:4006:1: ( ( rule__Mission__Group_4__0 )* )
            {
            // InternalMyDsl.g:4006:1: ( ( rule__Mission__Group_4__0 )* )
            // InternalMyDsl.g:4007:2: ( rule__Mission__Group_4__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_4()); 
            // InternalMyDsl.g:4008:2: ( rule__Mission__Group_4__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32) ) {
                    int LA32_2 = input.LA(2);

                    if ( ((LA32_2>=15 && LA32_2<=17)) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:4008:3: rule__Mission__Group_4__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Mission__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4__Impl"


    // $ANTLR start "rule__Mission__Group__5"
    // InternalMyDsl.g:4016:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4020:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalMyDsl.g:4021:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
            {
            pushFollow(FOLLOW_50);
            rule__Mission__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5"


    // $ANTLR start "rule__Mission__Group__5__Impl"
    // InternalMyDsl.g:4028:1: rule__Mission__Group__5__Impl : ( ( rule__Mission__Group_5__0 )? ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4032:1: ( ( ( rule__Mission__Group_5__0 )? ) )
            // InternalMyDsl.g:4033:1: ( ( rule__Mission__Group_5__0 )? )
            {
            // InternalMyDsl.g:4033:1: ( ( rule__Mission__Group_5__0 )? )
            // InternalMyDsl.g:4034:2: ( rule__Mission__Group_5__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_5()); 
            // InternalMyDsl.g:4035:2: ( rule__Mission__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==60) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:4035:3: rule__Mission__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5__Impl"


    // $ANTLR start "rule__Mission__Group__6"
    // InternalMyDsl.g:4043:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4047:1: ( rule__Mission__Group__6__Impl )
            // InternalMyDsl.g:4048:2: rule__Mission__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__6"


    // $ANTLR start "rule__Mission__Group__6__Impl"
    // InternalMyDsl.g:4054:1: rule__Mission__Group__6__Impl : ( ( rule__Mission__Group_6__0 )? ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4058:1: ( ( ( rule__Mission__Group_6__0 )? ) )
            // InternalMyDsl.g:4059:1: ( ( rule__Mission__Group_6__0 )? )
            {
            // InternalMyDsl.g:4059:1: ( ( rule__Mission__Group_6__0 )? )
            // InternalMyDsl.g:4060:2: ( rule__Mission__Group_6__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_6()); 
            // InternalMyDsl.g:4061:2: ( rule__Mission__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==61) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:4061:3: rule__Mission__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__6__Impl"


    // $ANTLR start "rule__Mission__Group_1__0"
    // InternalMyDsl.g:4070:1: rule__Mission__Group_1__0 : rule__Mission__Group_1__0__Impl rule__Mission__Group_1__1 ;
    public final void rule__Mission__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4074:1: ( rule__Mission__Group_1__0__Impl rule__Mission__Group_1__1 )
            // InternalMyDsl.g:4075:2: rule__Mission__Group_1__0__Impl rule__Mission__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Mission__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_1__0"


    // $ANTLR start "rule__Mission__Group_1__0__Impl"
    // InternalMyDsl.g:4082:1: rule__Mission__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4086:1: ( ( ',' ) )
            // InternalMyDsl.g:4087:1: ( ',' )
            {
            // InternalMyDsl.g:4087:1: ( ',' )
            // InternalMyDsl.g:4088:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_1__0__Impl"


    // $ANTLR start "rule__Mission__Group_1__1"
    // InternalMyDsl.g:4097:1: rule__Mission__Group_1__1 : rule__Mission__Group_1__1__Impl ;
    public final void rule__Mission__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4101:1: ( rule__Mission__Group_1__1__Impl )
            // InternalMyDsl.g:4102:2: rule__Mission__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_1__1"


    // $ANTLR start "rule__Mission__Group_1__1__Impl"
    // InternalMyDsl.g:4108:1: rule__Mission__Group_1__1__Impl : ( ( rule__Mission__MissionTaskAssignment_1_1 ) ) ;
    public final void rule__Mission__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4112:1: ( ( ( rule__Mission__MissionTaskAssignment_1_1 ) ) )
            // InternalMyDsl.g:4113:1: ( ( rule__Mission__MissionTaskAssignment_1_1 ) )
            {
            // InternalMyDsl.g:4113:1: ( ( rule__Mission__MissionTaskAssignment_1_1 ) )
            // InternalMyDsl.g:4114:2: ( rule__Mission__MissionTaskAssignment_1_1 )
            {
             before(grammarAccess.getMissionAccess().getMissionTaskAssignment_1_1()); 
            // InternalMyDsl.g:4115:2: ( rule__Mission__MissionTaskAssignment_1_1 )
            // InternalMyDsl.g:4115:3: rule__Mission__MissionTaskAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__MissionTaskAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getMissionTaskAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_1__1__Impl"


    // $ANTLR start "rule__Mission__Group_4__0"
    // InternalMyDsl.g:4124:1: rule__Mission__Group_4__0 : rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 ;
    public final void rule__Mission__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4128:1: ( rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1 )
            // InternalMyDsl.g:4129:2: rule__Mission__Group_4__0__Impl rule__Mission__Group_4__1
            {
            pushFollow(FOLLOW_49);
            rule__Mission__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_4__0"


    // $ANTLR start "rule__Mission__Group_4__0__Impl"
    // InternalMyDsl.g:4136:1: rule__Mission__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4140:1: ( ( ',' ) )
            // InternalMyDsl.g:4141:1: ( ',' )
            {
            // InternalMyDsl.g:4141:1: ( ',' )
            // InternalMyDsl.g:4142:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_4__0__Impl"


    // $ANTLR start "rule__Mission__Group_4__1"
    // InternalMyDsl.g:4151:1: rule__Mission__Group_4__1 : rule__Mission__Group_4__1__Impl ;
    public final void rule__Mission__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4155:1: ( rule__Mission__Group_4__1__Impl )
            // InternalMyDsl.g:4156:2: rule__Mission__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_4__1"


    // $ANTLR start "rule__Mission__Group_4__1__Impl"
    // InternalMyDsl.g:4162:1: rule__Mission__Group_4__1__Impl : ( ( rule__Mission__ObjAssignment_4_1 ) ) ;
    public final void rule__Mission__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4166:1: ( ( ( rule__Mission__ObjAssignment_4_1 ) ) )
            // InternalMyDsl.g:4167:1: ( ( rule__Mission__ObjAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4167:1: ( ( rule__Mission__ObjAssignment_4_1 ) )
            // InternalMyDsl.g:4168:2: ( rule__Mission__ObjAssignment_4_1 )
            {
             before(grammarAccess.getMissionAccess().getObjAssignment_4_1()); 
            // InternalMyDsl.g:4169:2: ( rule__Mission__ObjAssignment_4_1 )
            // InternalMyDsl.g:4169:3: rule__Mission__ObjAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ObjAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getObjAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_4__1__Impl"


    // $ANTLR start "rule__Mission__Group_5__0"
    // InternalMyDsl.g:4178:1: rule__Mission__Group_5__0 : rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 ;
    public final void rule__Mission__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4182:1: ( rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1 )
            // InternalMyDsl.g:4183:2: rule__Mission__Group_5__0__Impl rule__Mission__Group_5__1
            {
            pushFollow(FOLLOW_51);
            rule__Mission__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_5__0"


    // $ANTLR start "rule__Mission__Group_5__0__Impl"
    // InternalMyDsl.g:4190:1: rule__Mission__Group_5__0__Impl : ( 'constraints:' ) ;
    public final void rule__Mission__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4194:1: ( ( 'constraints:' ) )
            // InternalMyDsl.g:4195:1: ( 'constraints:' )
            {
            // InternalMyDsl.g:4195:1: ( 'constraints:' )
            // InternalMyDsl.g:4196:2: 'constraints:'
            {
             before(grammarAccess.getMissionAccess().getConstraintsKeyword_5_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getConstraintsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_5__0__Impl"


    // $ANTLR start "rule__Mission__Group_5__1"
    // InternalMyDsl.g:4205:1: rule__Mission__Group_5__1 : rule__Mission__Group_5__1__Impl rule__Mission__Group_5__2 ;
    public final void rule__Mission__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4209:1: ( rule__Mission__Group_5__1__Impl rule__Mission__Group_5__2 )
            // InternalMyDsl.g:4210:2: rule__Mission__Group_5__1__Impl rule__Mission__Group_5__2
            {
            pushFollow(FOLLOW_37);
            rule__Mission__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_5__1"


    // $ANTLR start "rule__Mission__Group_5__1__Impl"
    // InternalMyDsl.g:4217:1: rule__Mission__Group_5__1__Impl : ( ( rule__Mission__ConstraintsAssignment_5_1 ) ) ;
    public final void rule__Mission__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4221:1: ( ( ( rule__Mission__ConstraintsAssignment_5_1 ) ) )
            // InternalMyDsl.g:4222:1: ( ( rule__Mission__ConstraintsAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4222:1: ( ( rule__Mission__ConstraintsAssignment_5_1 ) )
            // InternalMyDsl.g:4223:2: ( rule__Mission__ConstraintsAssignment_5_1 )
            {
             before(grammarAccess.getMissionAccess().getConstraintsAssignment_5_1()); 
            // InternalMyDsl.g:4224:2: ( rule__Mission__ConstraintsAssignment_5_1 )
            // InternalMyDsl.g:4224:3: rule__Mission__ConstraintsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ConstraintsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getConstraintsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_5__1__Impl"


    // $ANTLR start "rule__Mission__Group_5__2"
    // InternalMyDsl.g:4232:1: rule__Mission__Group_5__2 : rule__Mission__Group_5__2__Impl ;
    public final void rule__Mission__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4236:1: ( rule__Mission__Group_5__2__Impl )
            // InternalMyDsl.g:4237:2: rule__Mission__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_5__2"


    // $ANTLR start "rule__Mission__Group_5__2__Impl"
    // InternalMyDsl.g:4243:1: rule__Mission__Group_5__2__Impl : ( ( rule__Mission__Group_5_2__0 )* ) ;
    public final void rule__Mission__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4247:1: ( ( ( rule__Mission__Group_5_2__0 )* ) )
            // InternalMyDsl.g:4248:1: ( ( rule__Mission__Group_5_2__0 )* )
            {
            // InternalMyDsl.g:4248:1: ( ( rule__Mission__Group_5_2__0 )* )
            // InternalMyDsl.g:4249:2: ( rule__Mission__Group_5_2__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_5_2()); 
            // InternalMyDsl.g:4250:2: ( rule__Mission__Group_5_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==32) ) {
                    int LA35_2 = input.LA(2);

                    if ( (LA35_2==EOF||LA35_2==12||(LA35_2>=31 && LA35_2<=32)||LA35_2==61||LA35_2==65||(LA35_2>=67 && LA35_2<=68)||(LA35_2>=73 && LA35_2<=74)||LA35_2==78||LA35_2==85) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalMyDsl.g:4250:3: rule__Mission__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Mission__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_5__2__Impl"


    // $ANTLR start "rule__Mission__Group_5_2__0"
    // InternalMyDsl.g:4259:1: rule__Mission__Group_5_2__0 : rule__Mission__Group_5_2__0__Impl rule__Mission__Group_5_2__1 ;
    public final void rule__Mission__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4263:1: ( rule__Mission__Group_5_2__0__Impl rule__Mission__Group_5_2__1 )
            // InternalMyDsl.g:4264:2: rule__Mission__Group_5_2__0__Impl rule__Mission__Group_5_2__1
            {
            pushFollow(FOLLOW_51);
            rule__Mission__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_5_2__0"


    // $ANTLR start "rule__Mission__Group_5_2__0__Impl"
    // InternalMyDsl.g:4271:1: rule__Mission__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4275:1: ( ( ',' ) )
            // InternalMyDsl.g:4276:1: ( ',' )
            {
            // InternalMyDsl.g:4276:1: ( ',' )
            // InternalMyDsl.g:4277:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_5_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_5_2__0__Impl"


    // $ANTLR start "rule__Mission__Group_5_2__1"
    // InternalMyDsl.g:4286:1: rule__Mission__Group_5_2__1 : rule__Mission__Group_5_2__1__Impl ;
    public final void rule__Mission__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4290:1: ( rule__Mission__Group_5_2__1__Impl )
            // InternalMyDsl.g:4291:2: rule__Mission__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_5_2__1"


    // $ANTLR start "rule__Mission__Group_5_2__1__Impl"
    // InternalMyDsl.g:4297:1: rule__Mission__Group_5_2__1__Impl : ( ( rule__Mission__ConstraintsAssignment_5_2_1 ) ) ;
    public final void rule__Mission__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4301:1: ( ( ( rule__Mission__ConstraintsAssignment_5_2_1 ) ) )
            // InternalMyDsl.g:4302:1: ( ( rule__Mission__ConstraintsAssignment_5_2_1 ) )
            {
            // InternalMyDsl.g:4302:1: ( ( rule__Mission__ConstraintsAssignment_5_2_1 ) )
            // InternalMyDsl.g:4303:2: ( rule__Mission__ConstraintsAssignment_5_2_1 )
            {
             before(grammarAccess.getMissionAccess().getConstraintsAssignment_5_2_1()); 
            // InternalMyDsl.g:4304:2: ( rule__Mission__ConstraintsAssignment_5_2_1 )
            // InternalMyDsl.g:4304:3: rule__Mission__ConstraintsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__ConstraintsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getConstraintsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_5_2__1__Impl"


    // $ANTLR start "rule__Mission__Group_6__0"
    // InternalMyDsl.g:4313:1: rule__Mission__Group_6__0 : rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 ;
    public final void rule__Mission__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4317:1: ( rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1 )
            // InternalMyDsl.g:4318:2: rule__Mission__Group_6__0__Impl rule__Mission__Group_6__1
            {
            pushFollow(FOLLOW_52);
            rule__Mission__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__0"


    // $ANTLR start "rule__Mission__Group_6__0__Impl"
    // InternalMyDsl.g:4325:1: rule__Mission__Group_6__0__Impl : ( 'parameters:' ) ;
    public final void rule__Mission__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4329:1: ( ( 'parameters:' ) )
            // InternalMyDsl.g:4330:1: ( 'parameters:' )
            {
            // InternalMyDsl.g:4330:1: ( 'parameters:' )
            // InternalMyDsl.g:4331:2: 'parameters:'
            {
             before(grammarAccess.getMissionAccess().getParametersKeyword_6_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getParametersKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__0__Impl"


    // $ANTLR start "rule__Mission__Group_6__1"
    // InternalMyDsl.g:4340:1: rule__Mission__Group_6__1 : rule__Mission__Group_6__1__Impl rule__Mission__Group_6__2 ;
    public final void rule__Mission__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4344:1: ( rule__Mission__Group_6__1__Impl rule__Mission__Group_6__2 )
            // InternalMyDsl.g:4345:2: rule__Mission__Group_6__1__Impl rule__Mission__Group_6__2
            {
            pushFollow(FOLLOW_52);
            rule__Mission__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__1"


    // $ANTLR start "rule__Mission__Group_6__1__Impl"
    // InternalMyDsl.g:4352:1: rule__Mission__Group_6__1__Impl : ( ( rule__Mission__Group_6_1__0 )? ) ;
    public final void rule__Mission__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4356:1: ( ( ( rule__Mission__Group_6_1__0 )? ) )
            // InternalMyDsl.g:4357:1: ( ( rule__Mission__Group_6_1__0 )? )
            {
            // InternalMyDsl.g:4357:1: ( ( rule__Mission__Group_6_1__0 )? )
            // InternalMyDsl.g:4358:2: ( rule__Mission__Group_6_1__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_6_1()); 
            // InternalMyDsl.g:4359:2: ( rule__Mission__Group_6_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:4359:3: rule__Mission__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_6_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__1__Impl"


    // $ANTLR start "rule__Mission__Group_6__2"
    // InternalMyDsl.g:4367:1: rule__Mission__Group_6__2 : rule__Mission__Group_6__2__Impl rule__Mission__Group_6__3 ;
    public final void rule__Mission__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4371:1: ( rule__Mission__Group_6__2__Impl rule__Mission__Group_6__3 )
            // InternalMyDsl.g:4372:2: rule__Mission__Group_6__2__Impl rule__Mission__Group_6__3
            {
            pushFollow(FOLLOW_52);
            rule__Mission__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__2"


    // $ANTLR start "rule__Mission__Group_6__2__Impl"
    // InternalMyDsl.g:4379:1: rule__Mission__Group_6__2__Impl : ( ( rule__Mission__Group_6_2__0 )? ) ;
    public final void rule__Mission__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4383:1: ( ( ( rule__Mission__Group_6_2__0 )? ) )
            // InternalMyDsl.g:4384:1: ( ( rule__Mission__Group_6_2__0 )? )
            {
            // InternalMyDsl.g:4384:1: ( ( rule__Mission__Group_6_2__0 )? )
            // InternalMyDsl.g:4385:2: ( rule__Mission__Group_6_2__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_6_2()); 
            // InternalMyDsl.g:4386:2: ( rule__Mission__Group_6_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==62) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:4386:3: rule__Mission__Group_6_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_6_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__2__Impl"


    // $ANTLR start "rule__Mission__Group_6__3"
    // InternalMyDsl.g:4394:1: rule__Mission__Group_6__3 : rule__Mission__Group_6__3__Impl rule__Mission__Group_6__4 ;
    public final void rule__Mission__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4398:1: ( rule__Mission__Group_6__3__Impl rule__Mission__Group_6__4 )
            // InternalMyDsl.g:4399:2: rule__Mission__Group_6__3__Impl rule__Mission__Group_6__4
            {
            pushFollow(FOLLOW_52);
            rule__Mission__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__3"


    // $ANTLR start "rule__Mission__Group_6__3__Impl"
    // InternalMyDsl.g:4406:1: rule__Mission__Group_6__3__Impl : ( ( rule__Mission__Group_6_3__0 )? ) ;
    public final void rule__Mission__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4410:1: ( ( ( rule__Mission__Group_6_3__0 )? ) )
            // InternalMyDsl.g:4411:1: ( ( rule__Mission__Group_6_3__0 )? )
            {
            // InternalMyDsl.g:4411:1: ( ( rule__Mission__Group_6_3__0 )? )
            // InternalMyDsl.g:4412:2: ( rule__Mission__Group_6_3__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_6_3()); 
            // InternalMyDsl.g:4413:2: ( rule__Mission__Group_6_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==63) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:4413:3: rule__Mission__Group_6_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_6_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__3__Impl"


    // $ANTLR start "rule__Mission__Group_6__4"
    // InternalMyDsl.g:4421:1: rule__Mission__Group_6__4 : rule__Mission__Group_6__4__Impl ;
    public final void rule__Mission__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4425:1: ( rule__Mission__Group_6__4__Impl )
            // InternalMyDsl.g:4426:2: rule__Mission__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__4"


    // $ANTLR start "rule__Mission__Group_6__4__Impl"
    // InternalMyDsl.g:4432:1: rule__Mission__Group_6__4__Impl : ( ( rule__Mission__Group_6_4__0 )? ) ;
    public final void rule__Mission__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4436:1: ( ( ( rule__Mission__Group_6_4__0 )? ) )
            // InternalMyDsl.g:4437:1: ( ( rule__Mission__Group_6_4__0 )? )
            {
            // InternalMyDsl.g:4437:1: ( ( rule__Mission__Group_6_4__0 )? )
            // InternalMyDsl.g:4438:2: ( rule__Mission__Group_6_4__0 )?
            {
             before(grammarAccess.getMissionAccess().getGroup_6_4()); 
            // InternalMyDsl.g:4439:2: ( rule__Mission__Group_6_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==64) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:4439:3: rule__Mission__Group_6_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__Group_6_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getGroup_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6__4__Impl"


    // $ANTLR start "rule__Mission__Group_6_1__0"
    // InternalMyDsl.g:4448:1: rule__Mission__Group_6_1__0 : rule__Mission__Group_6_1__0__Impl rule__Mission__Group_6_1__1 ;
    public final void rule__Mission__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4452:1: ( rule__Mission__Group_6_1__0__Impl rule__Mission__Group_6_1__1 )
            // InternalMyDsl.g:4453:2: rule__Mission__Group_6_1__0__Impl rule__Mission__Group_6_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Mission__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_1__0"


    // $ANTLR start "rule__Mission__Group_6_1__0__Impl"
    // InternalMyDsl.g:4460:1: rule__Mission__Group_6_1__0__Impl : ( 'time:' ) ;
    public final void rule__Mission__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4464:1: ( ( 'time:' ) )
            // InternalMyDsl.g:4465:1: ( 'time:' )
            {
            // InternalMyDsl.g:4465:1: ( 'time:' )
            // InternalMyDsl.g:4466:2: 'time:'
            {
             before(grammarAccess.getMissionAccess().getTimeKeyword_6_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getTimeKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_1__0__Impl"


    // $ANTLR start "rule__Mission__Group_6_1__1"
    // InternalMyDsl.g:4475:1: rule__Mission__Group_6_1__1 : rule__Mission__Group_6_1__1__Impl ;
    public final void rule__Mission__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4479:1: ( rule__Mission__Group_6_1__1__Impl )
            // InternalMyDsl.g:4480:2: rule__Mission__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_1__1"


    // $ANTLR start "rule__Mission__Group_6_1__1__Impl"
    // InternalMyDsl.g:4486:1: rule__Mission__Group_6_1__1__Impl : ( ( rule__Mission__TimeAssignment_6_1_1 ) ) ;
    public final void rule__Mission__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4490:1: ( ( ( rule__Mission__TimeAssignment_6_1_1 ) ) )
            // InternalMyDsl.g:4491:1: ( ( rule__Mission__TimeAssignment_6_1_1 ) )
            {
            // InternalMyDsl.g:4491:1: ( ( rule__Mission__TimeAssignment_6_1_1 ) )
            // InternalMyDsl.g:4492:2: ( rule__Mission__TimeAssignment_6_1_1 )
            {
             before(grammarAccess.getMissionAccess().getTimeAssignment_6_1_1()); 
            // InternalMyDsl.g:4493:2: ( rule__Mission__TimeAssignment_6_1_1 )
            // InternalMyDsl.g:4493:3: rule__Mission__TimeAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__TimeAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTimeAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_1__1__Impl"


    // $ANTLR start "rule__Mission__Group_6_2__0"
    // InternalMyDsl.g:4502:1: rule__Mission__Group_6_2__0 : rule__Mission__Group_6_2__0__Impl rule__Mission__Group_6_2__1 ;
    public final void rule__Mission__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4506:1: ( rule__Mission__Group_6_2__0__Impl rule__Mission__Group_6_2__1 )
            // InternalMyDsl.g:4507:2: rule__Mission__Group_6_2__0__Impl rule__Mission__Group_6_2__1
            {
            pushFollow(FOLLOW_26);
            rule__Mission__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_2__0"


    // $ANTLR start "rule__Mission__Group_6_2__0__Impl"
    // InternalMyDsl.g:4514:1: rule__Mission__Group_6_2__0__Impl : ( 'numAllocation:' ) ;
    public final void rule__Mission__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4518:1: ( ( 'numAllocation:' ) )
            // InternalMyDsl.g:4519:1: ( 'numAllocation:' )
            {
            // InternalMyDsl.g:4519:1: ( 'numAllocation:' )
            // InternalMyDsl.g:4520:2: 'numAllocation:'
            {
             before(grammarAccess.getMissionAccess().getNumAllocationKeyword_6_2_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getNumAllocationKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_2__0__Impl"


    // $ANTLR start "rule__Mission__Group_6_2__1"
    // InternalMyDsl.g:4529:1: rule__Mission__Group_6_2__1 : rule__Mission__Group_6_2__1__Impl ;
    public final void rule__Mission__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4533:1: ( rule__Mission__Group_6_2__1__Impl )
            // InternalMyDsl.g:4534:2: rule__Mission__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_2__1"


    // $ANTLR start "rule__Mission__Group_6_2__1__Impl"
    // InternalMyDsl.g:4540:1: rule__Mission__Group_6_2__1__Impl : ( ( rule__Mission__NumAllocAssignment_6_2_1 ) ) ;
    public final void rule__Mission__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4544:1: ( ( ( rule__Mission__NumAllocAssignment_6_2_1 ) ) )
            // InternalMyDsl.g:4545:1: ( ( rule__Mission__NumAllocAssignment_6_2_1 ) )
            {
            // InternalMyDsl.g:4545:1: ( ( rule__Mission__NumAllocAssignment_6_2_1 ) )
            // InternalMyDsl.g:4546:2: ( rule__Mission__NumAllocAssignment_6_2_1 )
            {
             before(grammarAccess.getMissionAccess().getNumAllocAssignment_6_2_1()); 
            // InternalMyDsl.g:4547:2: ( rule__Mission__NumAllocAssignment_6_2_1 )
            // InternalMyDsl.g:4547:3: rule__Mission__NumAllocAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__NumAllocAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getNumAllocAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_2__1__Impl"


    // $ANTLR start "rule__Mission__Group_6_3__0"
    // InternalMyDsl.g:4556:1: rule__Mission__Group_6_3__0 : rule__Mission__Group_6_3__0__Impl rule__Mission__Group_6_3__1 ;
    public final void rule__Mission__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4560:1: ( rule__Mission__Group_6_3__0__Impl rule__Mission__Group_6_3__1 )
            // InternalMyDsl.g:4561:2: rule__Mission__Group_6_3__0__Impl rule__Mission__Group_6_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Mission__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_3__0"


    // $ANTLR start "rule__Mission__Group_6_3__0__Impl"
    // InternalMyDsl.g:4568:1: rule__Mission__Group_6_3__0__Impl : ( 'population:' ) ;
    public final void rule__Mission__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4572:1: ( ( 'population:' ) )
            // InternalMyDsl.g:4573:1: ( 'population:' )
            {
            // InternalMyDsl.g:4573:1: ( 'population:' )
            // InternalMyDsl.g:4574:2: 'population:'
            {
             before(grammarAccess.getMissionAccess().getPopulationKeyword_6_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getPopulationKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_3__0__Impl"


    // $ANTLR start "rule__Mission__Group_6_3__1"
    // InternalMyDsl.g:4583:1: rule__Mission__Group_6_3__1 : rule__Mission__Group_6_3__1__Impl ;
    public final void rule__Mission__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4587:1: ( rule__Mission__Group_6_3__1__Impl )
            // InternalMyDsl.g:4588:2: rule__Mission__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_3__1"


    // $ANTLR start "rule__Mission__Group_6_3__1__Impl"
    // InternalMyDsl.g:4594:1: rule__Mission__Group_6_3__1__Impl : ( ( rule__Mission__PopulationAssignment_6_3_1 ) ) ;
    public final void rule__Mission__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4598:1: ( ( ( rule__Mission__PopulationAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:4599:1: ( ( rule__Mission__PopulationAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:4599:1: ( ( rule__Mission__PopulationAssignment_6_3_1 ) )
            // InternalMyDsl.g:4600:2: ( rule__Mission__PopulationAssignment_6_3_1 )
            {
             before(grammarAccess.getMissionAccess().getPopulationAssignment_6_3_1()); 
            // InternalMyDsl.g:4601:2: ( rule__Mission__PopulationAssignment_6_3_1 )
            // InternalMyDsl.g:4601:3: rule__Mission__PopulationAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__PopulationAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getPopulationAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_3__1__Impl"


    // $ANTLR start "rule__Mission__Group_6_4__0"
    // InternalMyDsl.g:4610:1: rule__Mission__Group_6_4__0 : rule__Mission__Group_6_4__0__Impl rule__Mission__Group_6_4__1 ;
    public final void rule__Mission__Group_6_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4614:1: ( rule__Mission__Group_6_4__0__Impl rule__Mission__Group_6_4__1 )
            // InternalMyDsl.g:4615:2: rule__Mission__Group_6_4__0__Impl rule__Mission__Group_6_4__1
            {
            pushFollow(FOLLOW_26);
            rule__Mission__Group_6_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_6_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_4__0"


    // $ANTLR start "rule__Mission__Group_6_4__0__Impl"
    // InternalMyDsl.g:4622:1: rule__Mission__Group_6_4__0__Impl : ( 'evaluation:' ) ;
    public final void rule__Mission__Group_6_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4626:1: ( ( 'evaluation:' ) )
            // InternalMyDsl.g:4627:1: ( 'evaluation:' )
            {
            // InternalMyDsl.g:4627:1: ( 'evaluation:' )
            // InternalMyDsl.g:4628:2: 'evaluation:'
            {
             before(grammarAccess.getMissionAccess().getEvaluationKeyword_6_4_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getEvaluationKeyword_6_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_4__0__Impl"


    // $ANTLR start "rule__Mission__Group_6_4__1"
    // InternalMyDsl.g:4637:1: rule__Mission__Group_6_4__1 : rule__Mission__Group_6_4__1__Impl ;
    public final void rule__Mission__Group_6_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4641:1: ( rule__Mission__Group_6_4__1__Impl )
            // InternalMyDsl.g:4642:2: rule__Mission__Group_6_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_6_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_4__1"


    // $ANTLR start "rule__Mission__Group_6_4__1__Impl"
    // InternalMyDsl.g:4648:1: rule__Mission__Group_6_4__1__Impl : ( ( rule__Mission__EvaluationsAssignment_6_4_1 ) ) ;
    public final void rule__Mission__Group_6_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4652:1: ( ( ( rule__Mission__EvaluationsAssignment_6_4_1 ) ) )
            // InternalMyDsl.g:4653:1: ( ( rule__Mission__EvaluationsAssignment_6_4_1 ) )
            {
            // InternalMyDsl.g:4653:1: ( ( rule__Mission__EvaluationsAssignment_6_4_1 ) )
            // InternalMyDsl.g:4654:2: ( rule__Mission__EvaluationsAssignment_6_4_1 )
            {
             before(grammarAccess.getMissionAccess().getEvaluationsAssignment_6_4_1()); 
            // InternalMyDsl.g:4655:2: ( rule__Mission__EvaluationsAssignment_6_4_1 )
            // InternalMyDsl.g:4655:3: rule__Mission__EvaluationsAssignment_6_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__EvaluationsAssignment_6_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getEvaluationsAssignment_6_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_6_4__1__Impl"


    // $ANTLR start "rule__MissionTask__Group__0"
    // InternalMyDsl.g:4664:1: rule__MissionTask__Group__0 : rule__MissionTask__Group__0__Impl rule__MissionTask__Group__1 ;
    public final void rule__MissionTask__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4668:1: ( rule__MissionTask__Group__0__Impl rule__MissionTask__Group__1 )
            // InternalMyDsl.g:4669:2: rule__MissionTask__Group__0__Impl rule__MissionTask__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MissionTask__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionTask__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group__0"


    // $ANTLR start "rule__MissionTask__Group__0__Impl"
    // InternalMyDsl.g:4676:1: rule__MissionTask__Group__0__Impl : ( () ) ;
    public final void rule__MissionTask__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4680:1: ( ( () ) )
            // InternalMyDsl.g:4681:1: ( () )
            {
            // InternalMyDsl.g:4681:1: ( () )
            // InternalMyDsl.g:4682:2: ()
            {
             before(grammarAccess.getMissionTaskAccess().getMissionTaskAction_0()); 
            // InternalMyDsl.g:4683:2: ()
            // InternalMyDsl.g:4683:3: 
            {
            }

             after(grammarAccess.getMissionTaskAccess().getMissionTaskAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group__0__Impl"


    // $ANTLR start "rule__MissionTask__Group__1"
    // InternalMyDsl.g:4691:1: rule__MissionTask__Group__1 : rule__MissionTask__Group__1__Impl rule__MissionTask__Group__2 ;
    public final void rule__MissionTask__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4695:1: ( rule__MissionTask__Group__1__Impl rule__MissionTask__Group__2 )
            // InternalMyDsl.g:4696:2: rule__MissionTask__Group__1__Impl rule__MissionTask__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MissionTask__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionTask__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group__1"


    // $ANTLR start "rule__MissionTask__Group__1__Impl"
    // InternalMyDsl.g:4703:1: rule__MissionTask__Group__1__Impl : ( ( rule__MissionTask__NameAssignment_1 ) ) ;
    public final void rule__MissionTask__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4707:1: ( ( ( rule__MissionTask__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4708:1: ( ( rule__MissionTask__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4708:1: ( ( rule__MissionTask__NameAssignment_1 ) )
            // InternalMyDsl.g:4709:2: ( rule__MissionTask__NameAssignment_1 )
            {
             before(grammarAccess.getMissionTaskAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4710:2: ( rule__MissionTask__NameAssignment_1 )
            // InternalMyDsl.g:4710:3: rule__MissionTask__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MissionTask__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group__1__Impl"


    // $ANTLR start "rule__MissionTask__Group__2"
    // InternalMyDsl.g:4718:1: rule__MissionTask__Group__2 : rule__MissionTask__Group__2__Impl rule__MissionTask__Group__3 ;
    public final void rule__MissionTask__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4722:1: ( rule__MissionTask__Group__2__Impl rule__MissionTask__Group__3 )
            // InternalMyDsl.g:4723:2: rule__MissionTask__Group__2__Impl rule__MissionTask__Group__3
            {
            pushFollow(FOLLOW_53);
            rule__MissionTask__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionTask__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group__2"


    // $ANTLR start "rule__MissionTask__Group__2__Impl"
    // InternalMyDsl.g:4730:1: rule__MissionTask__Group__2__Impl : ( ':' ) ;
    public final void rule__MissionTask__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4734:1: ( ( ':' ) )
            // InternalMyDsl.g:4735:1: ( ':' )
            {
            // InternalMyDsl.g:4735:1: ( ':' )
            // InternalMyDsl.g:4736:2: ':'
            {
             before(grammarAccess.getMissionTaskAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMissionTaskAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group__2__Impl"


    // $ANTLR start "rule__MissionTask__Group__3"
    // InternalMyDsl.g:4745:1: rule__MissionTask__Group__3 : rule__MissionTask__Group__3__Impl rule__MissionTask__Group__4 ;
    public final void rule__MissionTask__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4749:1: ( rule__MissionTask__Group__3__Impl rule__MissionTask__Group__4 )
            // InternalMyDsl.g:4750:2: rule__MissionTask__Group__3__Impl rule__MissionTask__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__MissionTask__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionTask__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group__3"


    // $ANTLR start "rule__MissionTask__Group__3__Impl"
    // InternalMyDsl.g:4757:1: rule__MissionTask__Group__3__Impl : ( ( rule__MissionTask__Alternatives_3 ) ) ;
    public final void rule__MissionTask__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4761:1: ( ( ( rule__MissionTask__Alternatives_3 ) ) )
            // InternalMyDsl.g:4762:1: ( ( rule__MissionTask__Alternatives_3 ) )
            {
            // InternalMyDsl.g:4762:1: ( ( rule__MissionTask__Alternatives_3 ) )
            // InternalMyDsl.g:4763:2: ( rule__MissionTask__Alternatives_3 )
            {
             before(grammarAccess.getMissionTaskAccess().getAlternatives_3()); 
            // InternalMyDsl.g:4764:2: ( rule__MissionTask__Alternatives_3 )
            // InternalMyDsl.g:4764:3: rule__MissionTask__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__MissionTask__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getMissionTaskAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group__3__Impl"


    // $ANTLR start "rule__MissionTask__Group__4"
    // InternalMyDsl.g:4772:1: rule__MissionTask__Group__4 : rule__MissionTask__Group__4__Impl ;
    public final void rule__MissionTask__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4776:1: ( rule__MissionTask__Group__4__Impl )
            // InternalMyDsl.g:4777:2: rule__MissionTask__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MissionTask__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group__4"


    // $ANTLR start "rule__MissionTask__Group__4__Impl"
    // InternalMyDsl.g:4783:1: rule__MissionTask__Group__4__Impl : ( ( rule__MissionTask__Group_4__0 )? ) ;
    public final void rule__MissionTask__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4787:1: ( ( ( rule__MissionTask__Group_4__0 )? ) )
            // InternalMyDsl.g:4788:1: ( ( rule__MissionTask__Group_4__0 )? )
            {
            // InternalMyDsl.g:4788:1: ( ( rule__MissionTask__Group_4__0 )? )
            // InternalMyDsl.g:4789:2: ( rule__MissionTask__Group_4__0 )?
            {
             before(grammarAccess.getMissionTaskAccess().getGroup_4()); 
            // InternalMyDsl.g:4790:2: ( rule__MissionTask__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:4790:3: rule__MissionTask__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MissionTask__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionTaskAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group__4__Impl"


    // $ANTLR start "rule__MissionTask__Group_3_0__0"
    // InternalMyDsl.g:4799:1: rule__MissionTask__Group_3_0__0 : rule__MissionTask__Group_3_0__0__Impl rule__MissionTask__Group_3_0__1 ;
    public final void rule__MissionTask__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4803:1: ( rule__MissionTask__Group_3_0__0__Impl rule__MissionTask__Group_3_0__1 )
            // InternalMyDsl.g:4804:2: rule__MissionTask__Group_3_0__0__Impl rule__MissionTask__Group_3_0__1
            {
            pushFollow(FOLLOW_54);
            rule__MissionTask__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionTask__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_0__0"


    // $ANTLR start "rule__MissionTask__Group_3_0__0__Impl"
    // InternalMyDsl.g:4811:1: rule__MissionTask__Group_3_0__0__Impl : ( 'atomic' ) ;
    public final void rule__MissionTask__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4815:1: ( ( 'atomic' ) )
            // InternalMyDsl.g:4816:1: ( 'atomic' )
            {
            // InternalMyDsl.g:4816:1: ( 'atomic' )
            // InternalMyDsl.g:4817:2: 'atomic'
            {
             before(grammarAccess.getMissionTaskAccess().getAtomicKeyword_3_0_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getMissionTaskAccess().getAtomicKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_0__0__Impl"


    // $ANTLR start "rule__MissionTask__Group_3_0__1"
    // InternalMyDsl.g:4826:1: rule__MissionTask__Group_3_0__1 : rule__MissionTask__Group_3_0__1__Impl rule__MissionTask__Group_3_0__2 ;
    public final void rule__MissionTask__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4830:1: ( rule__MissionTask__Group_3_0__1__Impl rule__MissionTask__Group_3_0__2 )
            // InternalMyDsl.g:4831:2: rule__MissionTask__Group_3_0__1__Impl rule__MissionTask__Group_3_0__2
            {
            pushFollow(FOLLOW_9);
            rule__MissionTask__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionTask__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_0__1"


    // $ANTLR start "rule__MissionTask__Group_3_0__1__Impl"
    // InternalMyDsl.g:4838:1: rule__MissionTask__Group_3_0__1__Impl : ( 'task' ) ;
    public final void rule__MissionTask__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4842:1: ( ( 'task' ) )
            // InternalMyDsl.g:4843:1: ( 'task' )
            {
            // InternalMyDsl.g:4843:1: ( 'task' )
            // InternalMyDsl.g:4844:2: 'task'
            {
             before(grammarAccess.getMissionTaskAccess().getTaskKeyword_3_0_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getMissionTaskAccess().getTaskKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_0__1__Impl"


    // $ANTLR start "rule__MissionTask__Group_3_0__2"
    // InternalMyDsl.g:4853:1: rule__MissionTask__Group_3_0__2 : rule__MissionTask__Group_3_0__2__Impl ;
    public final void rule__MissionTask__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4857:1: ( rule__MissionTask__Group_3_0__2__Impl )
            // InternalMyDsl.g:4858:2: rule__MissionTask__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MissionTask__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_0__2"


    // $ANTLR start "rule__MissionTask__Group_3_0__2__Impl"
    // InternalMyDsl.g:4864:1: rule__MissionTask__Group_3_0__2__Impl : ( ( rule__MissionTask__AtAssignment_3_0_2 ) ) ;
    public final void rule__MissionTask__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4868:1: ( ( ( rule__MissionTask__AtAssignment_3_0_2 ) ) )
            // InternalMyDsl.g:4869:1: ( ( rule__MissionTask__AtAssignment_3_0_2 ) )
            {
            // InternalMyDsl.g:4869:1: ( ( rule__MissionTask__AtAssignment_3_0_2 ) )
            // InternalMyDsl.g:4870:2: ( rule__MissionTask__AtAssignment_3_0_2 )
            {
             before(grammarAccess.getMissionTaskAccess().getAtAssignment_3_0_2()); 
            // InternalMyDsl.g:4871:2: ( rule__MissionTask__AtAssignment_3_0_2 )
            // InternalMyDsl.g:4871:3: rule__MissionTask__AtAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MissionTask__AtAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionTaskAccess().getAtAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_0__2__Impl"


    // $ANTLR start "rule__MissionTask__Group_3_1__0"
    // InternalMyDsl.g:4880:1: rule__MissionTask__Group_3_1__0 : rule__MissionTask__Group_3_1__0__Impl rule__MissionTask__Group_3_1__1 ;
    public final void rule__MissionTask__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4884:1: ( rule__MissionTask__Group_3_1__0__Impl rule__MissionTask__Group_3_1__1 )
            // InternalMyDsl.g:4885:2: rule__MissionTask__Group_3_1__0__Impl rule__MissionTask__Group_3_1__1
            {
            pushFollow(FOLLOW_54);
            rule__MissionTask__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionTask__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_1__0"


    // $ANTLR start "rule__MissionTask__Group_3_1__0__Impl"
    // InternalMyDsl.g:4892:1: rule__MissionTask__Group_3_1__0__Impl : ( 'compound' ) ;
    public final void rule__MissionTask__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4896:1: ( ( 'compound' ) )
            // InternalMyDsl.g:4897:1: ( 'compound' )
            {
            // InternalMyDsl.g:4897:1: ( 'compound' )
            // InternalMyDsl.g:4898:2: 'compound'
            {
             before(grammarAccess.getMissionTaskAccess().getCompoundKeyword_3_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMissionTaskAccess().getCompoundKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_1__0__Impl"


    // $ANTLR start "rule__MissionTask__Group_3_1__1"
    // InternalMyDsl.g:4907:1: rule__MissionTask__Group_3_1__1 : rule__MissionTask__Group_3_1__1__Impl rule__MissionTask__Group_3_1__2 ;
    public final void rule__MissionTask__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4911:1: ( rule__MissionTask__Group_3_1__1__Impl rule__MissionTask__Group_3_1__2 )
            // InternalMyDsl.g:4912:2: rule__MissionTask__Group_3_1__1__Impl rule__MissionTask__Group_3_1__2
            {
            pushFollow(FOLLOW_9);
            rule__MissionTask__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionTask__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_1__1"


    // $ANTLR start "rule__MissionTask__Group_3_1__1__Impl"
    // InternalMyDsl.g:4919:1: rule__MissionTask__Group_3_1__1__Impl : ( 'task' ) ;
    public final void rule__MissionTask__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4923:1: ( ( 'task' ) )
            // InternalMyDsl.g:4924:1: ( 'task' )
            {
            // InternalMyDsl.g:4924:1: ( 'task' )
            // InternalMyDsl.g:4925:2: 'task'
            {
             before(grammarAccess.getMissionTaskAccess().getTaskKeyword_3_1_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getMissionTaskAccess().getTaskKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_1__1__Impl"


    // $ANTLR start "rule__MissionTask__Group_3_1__2"
    // InternalMyDsl.g:4934:1: rule__MissionTask__Group_3_1__2 : rule__MissionTask__Group_3_1__2__Impl ;
    public final void rule__MissionTask__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4938:1: ( rule__MissionTask__Group_3_1__2__Impl )
            // InternalMyDsl.g:4939:2: rule__MissionTask__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MissionTask__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_1__2"


    // $ANTLR start "rule__MissionTask__Group_3_1__2__Impl"
    // InternalMyDsl.g:4945:1: rule__MissionTask__Group_3_1__2__Impl : ( ( rule__MissionTask__CtAssignment_3_1_2 ) ) ;
    public final void rule__MissionTask__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4949:1: ( ( ( rule__MissionTask__CtAssignment_3_1_2 ) ) )
            // InternalMyDsl.g:4950:1: ( ( rule__MissionTask__CtAssignment_3_1_2 ) )
            {
            // InternalMyDsl.g:4950:1: ( ( rule__MissionTask__CtAssignment_3_1_2 ) )
            // InternalMyDsl.g:4951:2: ( rule__MissionTask__CtAssignment_3_1_2 )
            {
             before(grammarAccess.getMissionTaskAccess().getCtAssignment_3_1_2()); 
            // InternalMyDsl.g:4952:2: ( rule__MissionTask__CtAssignment_3_1_2 )
            // InternalMyDsl.g:4952:3: rule__MissionTask__CtAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MissionTask__CtAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionTaskAccess().getCtAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_3_1__2__Impl"


    // $ANTLR start "rule__MissionTask__Group_4__0"
    // InternalMyDsl.g:4961:1: rule__MissionTask__Group_4__0 : rule__MissionTask__Group_4__0__Impl rule__MissionTask__Group_4__1 ;
    public final void rule__MissionTask__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4965:1: ( rule__MissionTask__Group_4__0__Impl rule__MissionTask__Group_4__1 )
            // InternalMyDsl.g:4966:2: rule__MissionTask__Group_4__0__Impl rule__MissionTask__Group_4__1
            {
            pushFollow(FOLLOW_30);
            rule__MissionTask__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionTask__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_4__0"


    // $ANTLR start "rule__MissionTask__Group_4__0__Impl"
    // InternalMyDsl.g:4973:1: rule__MissionTask__Group_4__0__Impl : ( 'at' ) ;
    public final void rule__MissionTask__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4977:1: ( ( 'at' ) )
            // InternalMyDsl.g:4978:1: ( 'at' )
            {
            // InternalMyDsl.g:4978:1: ( 'at' )
            // InternalMyDsl.g:4979:2: 'at'
            {
             before(grammarAccess.getMissionTaskAccess().getAtKeyword_4_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMissionTaskAccess().getAtKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_4__0__Impl"


    // $ANTLR start "rule__MissionTask__Group_4__1"
    // InternalMyDsl.g:4988:1: rule__MissionTask__Group_4__1 : rule__MissionTask__Group_4__1__Impl rule__MissionTask__Group_4__2 ;
    public final void rule__MissionTask__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4992:1: ( rule__MissionTask__Group_4__1__Impl rule__MissionTask__Group_4__2 )
            // InternalMyDsl.g:4993:2: rule__MissionTask__Group_4__1__Impl rule__MissionTask__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__MissionTask__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MissionTask__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_4__1"


    // $ANTLR start "rule__MissionTask__Group_4__1__Impl"
    // InternalMyDsl.g:5000:1: rule__MissionTask__Group_4__1__Impl : ( 'location' ) ;
    public final void rule__MissionTask__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5004:1: ( ( 'location' ) )
            // InternalMyDsl.g:5005:1: ( 'location' )
            {
            // InternalMyDsl.g:5005:1: ( 'location' )
            // InternalMyDsl.g:5006:2: 'location'
            {
             before(grammarAccess.getMissionTaskAccess().getLocationKeyword_4_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMissionTaskAccess().getLocationKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_4__1__Impl"


    // $ANTLR start "rule__MissionTask__Group_4__2"
    // InternalMyDsl.g:5015:1: rule__MissionTask__Group_4__2 : rule__MissionTask__Group_4__2__Impl ;
    public final void rule__MissionTask__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5019:1: ( rule__MissionTask__Group_4__2__Impl )
            // InternalMyDsl.g:5020:2: rule__MissionTask__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MissionTask__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_4__2"


    // $ANTLR start "rule__MissionTask__Group_4__2__Impl"
    // InternalMyDsl.g:5026:1: rule__MissionTask__Group_4__2__Impl : ( ( rule__MissionTask__LocAssignment_4_2 ) ) ;
    public final void rule__MissionTask__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5030:1: ( ( ( rule__MissionTask__LocAssignment_4_2 ) ) )
            // InternalMyDsl.g:5031:1: ( ( rule__MissionTask__LocAssignment_4_2 ) )
            {
            // InternalMyDsl.g:5031:1: ( ( rule__MissionTask__LocAssignment_4_2 ) )
            // InternalMyDsl.g:5032:2: ( rule__MissionTask__LocAssignment_4_2 )
            {
             before(grammarAccess.getMissionTaskAccess().getLocAssignment_4_2()); 
            // InternalMyDsl.g:5033:2: ( rule__MissionTask__LocAssignment_4_2 )
            // InternalMyDsl.g:5033:3: rule__MissionTask__LocAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__MissionTask__LocAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionTaskAccess().getLocAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__Group_4__2__Impl"


    // $ANTLR start "rule__RateSucc__Group__0"
    // InternalMyDsl.g:5042:1: rule__RateSucc__Group__0 : rule__RateSucc__Group__0__Impl rule__RateSucc__Group__1 ;
    public final void rule__RateSucc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5046:1: ( rule__RateSucc__Group__0__Impl rule__RateSucc__Group__1 )
            // InternalMyDsl.g:5047:2: rule__RateSucc__Group__0__Impl rule__RateSucc__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__RateSucc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RateSucc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group__0"


    // $ANTLR start "rule__RateSucc__Group__0__Impl"
    // InternalMyDsl.g:5054:1: rule__RateSucc__Group__0__Impl : ( () ) ;
    public final void rule__RateSucc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5058:1: ( ( () ) )
            // InternalMyDsl.g:5059:1: ( () )
            {
            // InternalMyDsl.g:5059:1: ( () )
            // InternalMyDsl.g:5060:2: ()
            {
             before(grammarAccess.getRateSuccAccess().getRateSuccAction_0()); 
            // InternalMyDsl.g:5061:2: ()
            // InternalMyDsl.g:5061:3: 
            {
            }

             after(grammarAccess.getRateSuccAccess().getRateSuccAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group__0__Impl"


    // $ANTLR start "rule__RateSucc__Group__1"
    // InternalMyDsl.g:5069:1: rule__RateSucc__Group__1 : rule__RateSucc__Group__1__Impl ;
    public final void rule__RateSucc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5073:1: ( rule__RateSucc__Group__1__Impl )
            // InternalMyDsl.g:5074:2: rule__RateSucc__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RateSucc__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group__1"


    // $ANTLR start "rule__RateSucc__Group__1__Impl"
    // InternalMyDsl.g:5080:1: rule__RateSucc__Group__1__Impl : ( ( rule__RateSucc__Group_1__0 )? ) ;
    public final void rule__RateSucc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5084:1: ( ( ( rule__RateSucc__Group_1__0 )? ) )
            // InternalMyDsl.g:5085:1: ( ( rule__RateSucc__Group_1__0 )? )
            {
            // InternalMyDsl.g:5085:1: ( ( rule__RateSucc__Group_1__0 )? )
            // InternalMyDsl.g:5086:2: ( rule__RateSucc__Group_1__0 )?
            {
             before(grammarAccess.getRateSuccAccess().getGroup_1()); 
            // InternalMyDsl.g:5087:2: ( rule__RateSucc__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==68) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:5087:3: rule__RateSucc__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RateSucc__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRateSuccAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group__1__Impl"


    // $ANTLR start "rule__RateSucc__Group_1__0"
    // InternalMyDsl.g:5096:1: rule__RateSucc__Group_1__0 : rule__RateSucc__Group_1__0__Impl rule__RateSucc__Group_1__1 ;
    public final void rule__RateSucc__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5100:1: ( rule__RateSucc__Group_1__0__Impl rule__RateSucc__Group_1__1 )
            // InternalMyDsl.g:5101:2: rule__RateSucc__Group_1__0__Impl rule__RateSucc__Group_1__1
            {
            pushFollow(FOLLOW_56);
            rule__RateSucc__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RateSucc__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__0"


    // $ANTLR start "rule__RateSucc__Group_1__0__Impl"
    // InternalMyDsl.g:5108:1: rule__RateSucc__Group_1__0__Impl : ( 'rate' ) ;
    public final void rule__RateSucc__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5112:1: ( ( 'rate' ) )
            // InternalMyDsl.g:5113:1: ( 'rate' )
            {
            // InternalMyDsl.g:5113:1: ( 'rate' )
            // InternalMyDsl.g:5114:2: 'rate'
            {
             before(grammarAccess.getRateSuccAccess().getRateKeyword_1_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getRateSuccAccess().getRateKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__0__Impl"


    // $ANTLR start "rule__RateSucc__Group_1__1"
    // InternalMyDsl.g:5123:1: rule__RateSucc__Group_1__1 : rule__RateSucc__Group_1__1__Impl rule__RateSucc__Group_1__2 ;
    public final void rule__RateSucc__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5127:1: ( rule__RateSucc__Group_1__1__Impl rule__RateSucc__Group_1__2 )
            // InternalMyDsl.g:5128:2: rule__RateSucc__Group_1__1__Impl rule__RateSucc__Group_1__2
            {
            pushFollow(FOLLOW_23);
            rule__RateSucc__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RateSucc__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__1"


    // $ANTLR start "rule__RateSucc__Group_1__1__Impl"
    // InternalMyDsl.g:5135:1: rule__RateSucc__Group_1__1__Impl : ( 'of' ) ;
    public final void rule__RateSucc__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5139:1: ( ( 'of' ) )
            // InternalMyDsl.g:5140:1: ( 'of' )
            {
            // InternalMyDsl.g:5140:1: ( 'of' )
            // InternalMyDsl.g:5141:2: 'of'
            {
             before(grammarAccess.getRateSuccAccess().getOfKeyword_1_1()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getRateSuccAccess().getOfKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__1__Impl"


    // $ANTLR start "rule__RateSucc__Group_1__2"
    // InternalMyDsl.g:5150:1: rule__RateSucc__Group_1__2 : rule__RateSucc__Group_1__2__Impl rule__RateSucc__Group_1__3 ;
    public final void rule__RateSucc__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5154:1: ( rule__RateSucc__Group_1__2__Impl rule__RateSucc__Group_1__3 )
            // InternalMyDsl.g:5155:2: rule__RateSucc__Group_1__2__Impl rule__RateSucc__Group_1__3
            {
            pushFollow(FOLLOW_57);
            rule__RateSucc__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RateSucc__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__2"


    // $ANTLR start "rule__RateSucc__Group_1__2__Impl"
    // InternalMyDsl.g:5162:1: rule__RateSucc__Group_1__2__Impl : ( 'success' ) ;
    public final void rule__RateSucc__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5166:1: ( ( 'success' ) )
            // InternalMyDsl.g:5167:1: ( 'success' )
            {
            // InternalMyDsl.g:5167:1: ( 'success' )
            // InternalMyDsl.g:5168:2: 'success'
            {
             before(grammarAccess.getRateSuccAccess().getSuccessKeyword_1_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRateSuccAccess().getSuccessKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__2__Impl"


    // $ANTLR start "rule__RateSucc__Group_1__3"
    // InternalMyDsl.g:5177:1: rule__RateSucc__Group_1__3 : rule__RateSucc__Group_1__3__Impl rule__RateSucc__Group_1__4 ;
    public final void rule__RateSucc__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5181:1: ( rule__RateSucc__Group_1__3__Impl rule__RateSucc__Group_1__4 )
            // InternalMyDsl.g:5182:2: rule__RateSucc__Group_1__3__Impl rule__RateSucc__Group_1__4
            {
            pushFollow(FOLLOW_58);
            rule__RateSucc__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RateSucc__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__3"


    // $ANTLR start "rule__RateSucc__Group_1__3__Impl"
    // InternalMyDsl.g:5189:1: rule__RateSucc__Group_1__3__Impl : ( 'greater' ) ;
    public final void rule__RateSucc__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5193:1: ( ( 'greater' ) )
            // InternalMyDsl.g:5194:1: ( 'greater' )
            {
            // InternalMyDsl.g:5194:1: ( 'greater' )
            // InternalMyDsl.g:5195:2: 'greater'
            {
             before(grammarAccess.getRateSuccAccess().getGreaterKeyword_1_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRateSuccAccess().getGreaterKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__3__Impl"


    // $ANTLR start "rule__RateSucc__Group_1__4"
    // InternalMyDsl.g:5204:1: rule__RateSucc__Group_1__4 : rule__RateSucc__Group_1__4__Impl rule__RateSucc__Group_1__5 ;
    public final void rule__RateSucc__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5208:1: ( rule__RateSucc__Group_1__4__Impl rule__RateSucc__Group_1__5 )
            // InternalMyDsl.g:5209:2: rule__RateSucc__Group_1__4__Impl rule__RateSucc__Group_1__5
            {
            pushFollow(FOLLOW_16);
            rule__RateSucc__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RateSucc__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__4"


    // $ANTLR start "rule__RateSucc__Group_1__4__Impl"
    // InternalMyDsl.g:5216:1: rule__RateSucc__Group_1__4__Impl : ( 'than' ) ;
    public final void rule__RateSucc__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5220:1: ( ( 'than' ) )
            // InternalMyDsl.g:5221:1: ( 'than' )
            {
            // InternalMyDsl.g:5221:1: ( 'than' )
            // InternalMyDsl.g:5222:2: 'than'
            {
             before(grammarAccess.getRateSuccAccess().getThanKeyword_1_4()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getRateSuccAccess().getThanKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__4__Impl"


    // $ANTLR start "rule__RateSucc__Group_1__5"
    // InternalMyDsl.g:5231:1: rule__RateSucc__Group_1__5 : rule__RateSucc__Group_1__5__Impl ;
    public final void rule__RateSucc__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5235:1: ( rule__RateSucc__Group_1__5__Impl )
            // InternalMyDsl.g:5236:2: rule__RateSucc__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RateSucc__Group_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__5"


    // $ANTLR start "rule__RateSucc__Group_1__5__Impl"
    // InternalMyDsl.g:5242:1: rule__RateSucc__Group_1__5__Impl : ( ( rule__RateSucc__RateSuccAssignment_1_5 ) ) ;
    public final void rule__RateSucc__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5246:1: ( ( ( rule__RateSucc__RateSuccAssignment_1_5 ) ) )
            // InternalMyDsl.g:5247:1: ( ( rule__RateSucc__RateSuccAssignment_1_5 ) )
            {
            // InternalMyDsl.g:5247:1: ( ( rule__RateSucc__RateSuccAssignment_1_5 ) )
            // InternalMyDsl.g:5248:2: ( rule__RateSucc__RateSuccAssignment_1_5 )
            {
             before(grammarAccess.getRateSuccAccess().getRateSuccAssignment_1_5()); 
            // InternalMyDsl.g:5249:2: ( rule__RateSucc__RateSuccAssignment_1_5 )
            // InternalMyDsl.g:5249:3: rule__RateSucc__RateSuccAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__RateSucc__RateSuccAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getRateSuccAccess().getRateSuccAssignment_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__Group_1__5__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group__0"
    // InternalMyDsl.g:5258:1: rule__SpaceXYRobot__Group__0 : rule__SpaceXYRobot__Group__0__Impl rule__SpaceXYRobot__Group__1 ;
    public final void rule__SpaceXYRobot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5262:1: ( rule__SpaceXYRobot__Group__0__Impl rule__SpaceXYRobot__Group__1 )
            // InternalMyDsl.g:5263:2: rule__SpaceXYRobot__Group__0__Impl rule__SpaceXYRobot__Group__1
            {
            pushFollow(FOLLOW_59);
            rule__SpaceXYRobot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__0"


    // $ANTLR start "rule__SpaceXYRobot__Group__0__Impl"
    // InternalMyDsl.g:5270:1: rule__SpaceXYRobot__Group__0__Impl : ( ( rule__SpaceXYRobot__Alternatives_0 ) ) ;
    public final void rule__SpaceXYRobot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5274:1: ( ( ( rule__SpaceXYRobot__Alternatives_0 ) ) )
            // InternalMyDsl.g:5275:1: ( ( rule__SpaceXYRobot__Alternatives_0 ) )
            {
            // InternalMyDsl.g:5275:1: ( ( rule__SpaceXYRobot__Alternatives_0 ) )
            // InternalMyDsl.g:5276:2: ( rule__SpaceXYRobot__Alternatives_0 )
            {
             before(grammarAccess.getSpaceXYRobotAccess().getAlternatives_0()); 
            // InternalMyDsl.g:5277:2: ( rule__SpaceXYRobot__Alternatives_0 )
            // InternalMyDsl.g:5277:3: rule__SpaceXYRobot__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSpaceXYRobotAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__0__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group__1"
    // InternalMyDsl.g:5285:1: rule__SpaceXYRobot__Group__1 : rule__SpaceXYRobot__Group__1__Impl rule__SpaceXYRobot__Group__2 ;
    public final void rule__SpaceXYRobot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5289:1: ( rule__SpaceXYRobot__Group__1__Impl rule__SpaceXYRobot__Group__2 )
            // InternalMyDsl.g:5290:2: rule__SpaceXYRobot__Group__1__Impl rule__SpaceXYRobot__Group__2
            {
            pushFollow(FOLLOW_60);
            rule__SpaceXYRobot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__1"


    // $ANTLR start "rule__SpaceXYRobot__Group__1__Impl"
    // InternalMyDsl.g:5297:1: rule__SpaceXYRobot__Group__1__Impl : ( 'work' ) ;
    public final void rule__SpaceXYRobot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5301:1: ( ( 'work' ) )
            // InternalMyDsl.g:5302:1: ( 'work' )
            {
            // InternalMyDsl.g:5302:1: ( 'work' )
            // InternalMyDsl.g:5303:2: 'work'
            {
             before(grammarAccess.getSpaceXYRobotAccess().getWorkKeyword_1()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getSpaceXYRobotAccess().getWorkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__1__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group__2"
    // InternalMyDsl.g:5312:1: rule__SpaceXYRobot__Group__2 : rule__SpaceXYRobot__Group__2__Impl rule__SpaceXYRobot__Group__3 ;
    public final void rule__SpaceXYRobot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5316:1: ( rule__SpaceXYRobot__Group__2__Impl rule__SpaceXYRobot__Group__3 )
            // InternalMyDsl.g:5317:2: rule__SpaceXYRobot__Group__2__Impl rule__SpaceXYRobot__Group__3
            {
            pushFollow(FOLLOW_61);
            rule__SpaceXYRobot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__2"


    // $ANTLR start "rule__SpaceXYRobot__Group__2__Impl"
    // InternalMyDsl.g:5324:1: rule__SpaceXYRobot__Group__2__Impl : ( 'in' ) ;
    public final void rule__SpaceXYRobot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5328:1: ( ( 'in' ) )
            // InternalMyDsl.g:5329:1: ( 'in' )
            {
            // InternalMyDsl.g:5329:1: ( 'in' )
            // InternalMyDsl.g:5330:2: 'in'
            {
             before(grammarAccess.getSpaceXYRobotAccess().getInKeyword_2()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getSpaceXYRobotAccess().getInKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__2__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group__3"
    // InternalMyDsl.g:5339:1: rule__SpaceXYRobot__Group__3 : rule__SpaceXYRobot__Group__3__Impl rule__SpaceXYRobot__Group__4 ;
    public final void rule__SpaceXYRobot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5343:1: ( rule__SpaceXYRobot__Group__3__Impl rule__SpaceXYRobot__Group__4 )
            // InternalMyDsl.g:5344:2: rule__SpaceXYRobot__Group__3__Impl rule__SpaceXYRobot__Group__4
            {
            pushFollow(FOLLOW_62);
            rule__SpaceXYRobot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__3"


    // $ANTLR start "rule__SpaceXYRobot__Group__3__Impl"
    // InternalMyDsl.g:5351:1: rule__SpaceXYRobot__Group__3__Impl : ( ( rule__SpaceXYRobot__CoordinateAssignment_3 ) ) ;
    public final void rule__SpaceXYRobot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5355:1: ( ( ( rule__SpaceXYRobot__CoordinateAssignment_3 ) ) )
            // InternalMyDsl.g:5356:1: ( ( rule__SpaceXYRobot__CoordinateAssignment_3 ) )
            {
            // InternalMyDsl.g:5356:1: ( ( rule__SpaceXYRobot__CoordinateAssignment_3 ) )
            // InternalMyDsl.g:5357:2: ( rule__SpaceXYRobot__CoordinateAssignment_3 )
            {
             before(grammarAccess.getSpaceXYRobotAccess().getCoordinateAssignment_3()); 
            // InternalMyDsl.g:5358:2: ( rule__SpaceXYRobot__CoordinateAssignment_3 )
            // InternalMyDsl.g:5358:3: rule__SpaceXYRobot__CoordinateAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__CoordinateAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSpaceXYRobotAccess().getCoordinateAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__3__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group__4"
    // InternalMyDsl.g:5366:1: rule__SpaceXYRobot__Group__4 : rule__SpaceXYRobot__Group__4__Impl rule__SpaceXYRobot__Group__5 ;
    public final void rule__SpaceXYRobot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5370:1: ( rule__SpaceXYRobot__Group__4__Impl rule__SpaceXYRobot__Group__5 )
            // InternalMyDsl.g:5371:2: rule__SpaceXYRobot__Group__4__Impl rule__SpaceXYRobot__Group__5
            {
            pushFollow(FOLLOW_58);
            rule__SpaceXYRobot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__4"


    // $ANTLR start "rule__SpaceXYRobot__Group__4__Impl"
    // InternalMyDsl.g:5378:1: rule__SpaceXYRobot__Group__4__Impl : ( ( rule__SpaceXYRobot__LowerGreaterAssignment_4 ) ) ;
    public final void rule__SpaceXYRobot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5382:1: ( ( ( rule__SpaceXYRobot__LowerGreaterAssignment_4 ) ) )
            // InternalMyDsl.g:5383:1: ( ( rule__SpaceXYRobot__LowerGreaterAssignment_4 ) )
            {
            // InternalMyDsl.g:5383:1: ( ( rule__SpaceXYRobot__LowerGreaterAssignment_4 ) )
            // InternalMyDsl.g:5384:2: ( rule__SpaceXYRobot__LowerGreaterAssignment_4 )
            {
             before(grammarAccess.getSpaceXYRobotAccess().getLowerGreaterAssignment_4()); 
            // InternalMyDsl.g:5385:2: ( rule__SpaceXYRobot__LowerGreaterAssignment_4 )
            // InternalMyDsl.g:5385:3: rule__SpaceXYRobot__LowerGreaterAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__LowerGreaterAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpaceXYRobotAccess().getLowerGreaterAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__4__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group__5"
    // InternalMyDsl.g:5393:1: rule__SpaceXYRobot__Group__5 : rule__SpaceXYRobot__Group__5__Impl rule__SpaceXYRobot__Group__6 ;
    public final void rule__SpaceXYRobot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5397:1: ( rule__SpaceXYRobot__Group__5__Impl rule__SpaceXYRobot__Group__6 )
            // InternalMyDsl.g:5398:2: rule__SpaceXYRobot__Group__5__Impl rule__SpaceXYRobot__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__SpaceXYRobot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__5"


    // $ANTLR start "rule__SpaceXYRobot__Group__5__Impl"
    // InternalMyDsl.g:5405:1: rule__SpaceXYRobot__Group__5__Impl : ( 'than' ) ;
    public final void rule__SpaceXYRobot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5409:1: ( ( 'than' ) )
            // InternalMyDsl.g:5410:1: ( 'than' )
            {
            // InternalMyDsl.g:5410:1: ( 'than' )
            // InternalMyDsl.g:5411:2: 'than'
            {
             before(grammarAccess.getSpaceXYRobotAccess().getThanKeyword_5()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getSpaceXYRobotAccess().getThanKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__5__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group__6"
    // InternalMyDsl.g:5420:1: rule__SpaceXYRobot__Group__6 : rule__SpaceXYRobot__Group__6__Impl ;
    public final void rule__SpaceXYRobot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5424:1: ( rule__SpaceXYRobot__Group__6__Impl )
            // InternalMyDsl.g:5425:2: rule__SpaceXYRobot__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__6"


    // $ANTLR start "rule__SpaceXYRobot__Group__6__Impl"
    // InternalMyDsl.g:5431:1: rule__SpaceXYRobot__Group__6__Impl : ( ( rule__SpaceXYRobot__ValAssignment_6 ) ) ;
    public final void rule__SpaceXYRobot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5435:1: ( ( ( rule__SpaceXYRobot__ValAssignment_6 ) ) )
            // InternalMyDsl.g:5436:1: ( ( rule__SpaceXYRobot__ValAssignment_6 ) )
            {
            // InternalMyDsl.g:5436:1: ( ( rule__SpaceXYRobot__ValAssignment_6 ) )
            // InternalMyDsl.g:5437:2: ( rule__SpaceXYRobot__ValAssignment_6 )
            {
             before(grammarAccess.getSpaceXYRobotAccess().getValAssignment_6()); 
            // InternalMyDsl.g:5438:2: ( rule__SpaceXYRobot__ValAssignment_6 )
            // InternalMyDsl.g:5438:3: rule__SpaceXYRobot__ValAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__ValAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSpaceXYRobotAccess().getValAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group__6__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group_0_0__0"
    // InternalMyDsl.g:5447:1: rule__SpaceXYRobot__Group_0_0__0 : rule__SpaceXYRobot__Group_0_0__0__Impl rule__SpaceXYRobot__Group_0_0__1 ;
    public final void rule__SpaceXYRobot__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5451:1: ( rule__SpaceXYRobot__Group_0_0__0__Impl rule__SpaceXYRobot__Group_0_0__1 )
            // InternalMyDsl.g:5452:2: rule__SpaceXYRobot__Group_0_0__0__Impl rule__SpaceXYRobot__Group_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__SpaceXYRobot__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group_0_0__0"


    // $ANTLR start "rule__SpaceXYRobot__Group_0_0__0__Impl"
    // InternalMyDsl.g:5459:1: rule__SpaceXYRobot__Group_0_0__0__Impl : ( 'robot' ) ;
    public final void rule__SpaceXYRobot__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5463:1: ( ( 'robot' ) )
            // InternalMyDsl.g:5464:1: ( 'robot' )
            {
            // InternalMyDsl.g:5464:1: ( 'robot' )
            // InternalMyDsl.g:5465:2: 'robot'
            {
             before(grammarAccess.getSpaceXYRobotAccess().getRobotKeyword_0_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSpaceXYRobotAccess().getRobotKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group_0_0__0__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group_0_0__1"
    // InternalMyDsl.g:5474:1: rule__SpaceXYRobot__Group_0_0__1 : rule__SpaceXYRobot__Group_0_0__1__Impl ;
    public final void rule__SpaceXYRobot__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5478:1: ( rule__SpaceXYRobot__Group_0_0__1__Impl )
            // InternalMyDsl.g:5479:2: rule__SpaceXYRobot__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group_0_0__1"


    // $ANTLR start "rule__SpaceXYRobot__Group_0_0__1__Impl"
    // InternalMyDsl.g:5485:1: rule__SpaceXYRobot__Group_0_0__1__Impl : ( ( rule__SpaceXYRobot__RobotAssignment_0_0_1 ) ) ;
    public final void rule__SpaceXYRobot__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5489:1: ( ( ( rule__SpaceXYRobot__RobotAssignment_0_0_1 ) ) )
            // InternalMyDsl.g:5490:1: ( ( rule__SpaceXYRobot__RobotAssignment_0_0_1 ) )
            {
            // InternalMyDsl.g:5490:1: ( ( rule__SpaceXYRobot__RobotAssignment_0_0_1 ) )
            // InternalMyDsl.g:5491:2: ( rule__SpaceXYRobot__RobotAssignment_0_0_1 )
            {
             before(grammarAccess.getSpaceXYRobotAccess().getRobotAssignment_0_0_1()); 
            // InternalMyDsl.g:5492:2: ( rule__SpaceXYRobot__RobotAssignment_0_0_1 )
            // InternalMyDsl.g:5492:3: rule__SpaceXYRobot__RobotAssignment_0_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__RobotAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSpaceXYRobotAccess().getRobotAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group_0_0__1__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group_0_1__0"
    // InternalMyDsl.g:5501:1: rule__SpaceXYRobot__Group_0_1__0 : rule__SpaceXYRobot__Group_0_1__0__Impl rule__SpaceXYRobot__Group_0_1__1 ;
    public final void rule__SpaceXYRobot__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5505:1: ( rule__SpaceXYRobot__Group_0_1__0__Impl rule__SpaceXYRobot__Group_0_1__1 )
            // InternalMyDsl.g:5506:2: rule__SpaceXYRobot__Group_0_1__0__Impl rule__SpaceXYRobot__Group_0_1__1
            {
            pushFollow(FOLLOW_63);
            rule__SpaceXYRobot__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group_0_1__0"


    // $ANTLR start "rule__SpaceXYRobot__Group_0_1__0__Impl"
    // InternalMyDsl.g:5513:1: rule__SpaceXYRobot__Group_0_1__0__Impl : ( ( rule__SpaceXYRobot__AllrobotsAssignment_0_1_0 ) ) ;
    public final void rule__SpaceXYRobot__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5517:1: ( ( ( rule__SpaceXYRobot__AllrobotsAssignment_0_1_0 ) ) )
            // InternalMyDsl.g:5518:1: ( ( rule__SpaceXYRobot__AllrobotsAssignment_0_1_0 ) )
            {
            // InternalMyDsl.g:5518:1: ( ( rule__SpaceXYRobot__AllrobotsAssignment_0_1_0 ) )
            // InternalMyDsl.g:5519:2: ( rule__SpaceXYRobot__AllrobotsAssignment_0_1_0 )
            {
             before(grammarAccess.getSpaceXYRobotAccess().getAllrobotsAssignment_0_1_0()); 
            // InternalMyDsl.g:5520:2: ( rule__SpaceXYRobot__AllrobotsAssignment_0_1_0 )
            // InternalMyDsl.g:5520:3: rule__SpaceXYRobot__AllrobotsAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__AllrobotsAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSpaceXYRobotAccess().getAllrobotsAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group_0_1__0__Impl"


    // $ANTLR start "rule__SpaceXYRobot__Group_0_1__1"
    // InternalMyDsl.g:5528:1: rule__SpaceXYRobot__Group_0_1__1 : rule__SpaceXYRobot__Group_0_1__1__Impl ;
    public final void rule__SpaceXYRobot__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5532:1: ( rule__SpaceXYRobot__Group_0_1__1__Impl )
            // InternalMyDsl.g:5533:2: rule__SpaceXYRobot__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpaceXYRobot__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group_0_1__1"


    // $ANTLR start "rule__SpaceXYRobot__Group_0_1__1__Impl"
    // InternalMyDsl.g:5539:1: rule__SpaceXYRobot__Group_0_1__1__Impl : ( 'robots' ) ;
    public final void rule__SpaceXYRobot__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5543:1: ( ( 'robots' ) )
            // InternalMyDsl.g:5544:1: ( 'robots' )
            {
            // InternalMyDsl.g:5544:1: ( 'robots' )
            // InternalMyDsl.g:5545:2: 'robots'
            {
             before(grammarAccess.getSpaceXYRobotAccess().getRobotsKeyword_0_1_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSpaceXYRobotAccess().getRobotsKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__Group_0_1__1__Impl"


    // $ANTLR start "rule__TaskTime__Group__0"
    // InternalMyDsl.g:5555:1: rule__TaskTime__Group__0 : rule__TaskTime__Group__0__Impl rule__TaskTime__Group__1 ;
    public final void rule__TaskTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5559:1: ( rule__TaskTime__Group__0__Impl rule__TaskTime__Group__1 )
            // InternalMyDsl.g:5560:2: rule__TaskTime__Group__0__Impl rule__TaskTime__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TaskTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__0"


    // $ANTLR start "rule__TaskTime__Group__0__Impl"
    // InternalMyDsl.g:5567:1: rule__TaskTime__Group__0__Impl : ( ( rule__TaskTime__Alternatives_0 ) ) ;
    public final void rule__TaskTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5571:1: ( ( ( rule__TaskTime__Alternatives_0 ) ) )
            // InternalMyDsl.g:5572:1: ( ( rule__TaskTime__Alternatives_0 ) )
            {
            // InternalMyDsl.g:5572:1: ( ( rule__TaskTime__Alternatives_0 ) )
            // InternalMyDsl.g:5573:2: ( rule__TaskTime__Alternatives_0 )
            {
             before(grammarAccess.getTaskTimeAccess().getAlternatives_0()); 
            // InternalMyDsl.g:5574:2: ( rule__TaskTime__Alternatives_0 )
            // InternalMyDsl.g:5574:3: rule__TaskTime__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskTimeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__0__Impl"


    // $ANTLR start "rule__TaskTime__Group__1"
    // InternalMyDsl.g:5582:1: rule__TaskTime__Group__1 : rule__TaskTime__Group__1__Impl rule__TaskTime__Group__2 ;
    public final void rule__TaskTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5586:1: ( rule__TaskTime__Group__1__Impl rule__TaskTime__Group__2 )
            // InternalMyDsl.g:5587:2: rule__TaskTime__Group__1__Impl rule__TaskTime__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__TaskTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__1"


    // $ANTLR start "rule__TaskTime__Group__1__Impl"
    // InternalMyDsl.g:5594:1: rule__TaskTime__Group__1__Impl : ( 'has' ) ;
    public final void rule__TaskTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5598:1: ( ( 'has' ) )
            // InternalMyDsl.g:5599:1: ( 'has' )
            {
            // InternalMyDsl.g:5599:1: ( 'has' )
            // InternalMyDsl.g:5600:2: 'has'
            {
             before(grammarAccess.getTaskTimeAccess().getHasKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTaskTimeAccess().getHasKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__1__Impl"


    // $ANTLR start "rule__TaskTime__Group__2"
    // InternalMyDsl.g:5609:1: rule__TaskTime__Group__2 : rule__TaskTime__Group__2__Impl rule__TaskTime__Group__3 ;
    public final void rule__TaskTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5613:1: ( rule__TaskTime__Group__2__Impl rule__TaskTime__Group__3 )
            // InternalMyDsl.g:5614:2: rule__TaskTime__Group__2__Impl rule__TaskTime__Group__3
            {
            pushFollow(FOLLOW_64);
            rule__TaskTime__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__2"


    // $ANTLR start "rule__TaskTime__Group__2__Impl"
    // InternalMyDsl.g:5621:1: rule__TaskTime__Group__2__Impl : ( 'to' ) ;
    public final void rule__TaskTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5625:1: ( ( 'to' ) )
            // InternalMyDsl.g:5626:1: ( 'to' )
            {
            // InternalMyDsl.g:5626:1: ( 'to' )
            // InternalMyDsl.g:5627:2: 'to'
            {
             before(grammarAccess.getTaskTimeAccess().getToKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTaskTimeAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__2__Impl"


    // $ANTLR start "rule__TaskTime__Group__3"
    // InternalMyDsl.g:5636:1: rule__TaskTime__Group__3 : rule__TaskTime__Group__3__Impl rule__TaskTime__Group__4 ;
    public final void rule__TaskTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5640:1: ( rule__TaskTime__Group__3__Impl rule__TaskTime__Group__4 )
            // InternalMyDsl.g:5641:2: rule__TaskTime__Group__3__Impl rule__TaskTime__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__TaskTime__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__3"


    // $ANTLR start "rule__TaskTime__Group__3__Impl"
    // InternalMyDsl.g:5648:1: rule__TaskTime__Group__3__Impl : ( ( rule__TaskTime__StartEndAssignment_3 ) ) ;
    public final void rule__TaskTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5652:1: ( ( ( rule__TaskTime__StartEndAssignment_3 ) ) )
            // InternalMyDsl.g:5653:1: ( ( rule__TaskTime__StartEndAssignment_3 ) )
            {
            // InternalMyDsl.g:5653:1: ( ( rule__TaskTime__StartEndAssignment_3 ) )
            // InternalMyDsl.g:5654:2: ( rule__TaskTime__StartEndAssignment_3 )
            {
             before(grammarAccess.getTaskTimeAccess().getStartEndAssignment_3()); 
            // InternalMyDsl.g:5655:2: ( rule__TaskTime__StartEndAssignment_3 )
            // InternalMyDsl.g:5655:3: rule__TaskTime__StartEndAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__StartEndAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskTimeAccess().getStartEndAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__3__Impl"


    // $ANTLR start "rule__TaskTime__Group__4"
    // InternalMyDsl.g:5663:1: rule__TaskTime__Group__4 : rule__TaskTime__Group__4__Impl rule__TaskTime__Group__5 ;
    public final void rule__TaskTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5667:1: ( rule__TaskTime__Group__4__Impl rule__TaskTime__Group__5 )
            // InternalMyDsl.g:5668:2: rule__TaskTime__Group__4__Impl rule__TaskTime__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__TaskTime__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__4"


    // $ANTLR start "rule__TaskTime__Group__4__Impl"
    // InternalMyDsl.g:5675:1: rule__TaskTime__Group__4__Impl : ( 'time:' ) ;
    public final void rule__TaskTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5679:1: ( ( 'time:' ) )
            // InternalMyDsl.g:5680:1: ( 'time:' )
            {
            // InternalMyDsl.g:5680:1: ( 'time:' )
            // InternalMyDsl.g:5681:2: 'time:'
            {
             before(grammarAccess.getTaskTimeAccess().getTimeKeyword_4()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getTaskTimeAccess().getTimeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__4__Impl"


    // $ANTLR start "rule__TaskTime__Group__5"
    // InternalMyDsl.g:5690:1: rule__TaskTime__Group__5 : rule__TaskTime__Group__5__Impl ;
    public final void rule__TaskTime__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5694:1: ( rule__TaskTime__Group__5__Impl )
            // InternalMyDsl.g:5695:2: rule__TaskTime__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__5"


    // $ANTLR start "rule__TaskTime__Group__5__Impl"
    // InternalMyDsl.g:5701:1: rule__TaskTime__Group__5__Impl : ( ( rule__TaskTime__TimeAssignment_5 ) ) ;
    public final void rule__TaskTime__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5705:1: ( ( ( rule__TaskTime__TimeAssignment_5 ) ) )
            // InternalMyDsl.g:5706:1: ( ( rule__TaskTime__TimeAssignment_5 ) )
            {
            // InternalMyDsl.g:5706:1: ( ( rule__TaskTime__TimeAssignment_5 ) )
            // InternalMyDsl.g:5707:2: ( rule__TaskTime__TimeAssignment_5 )
            {
             before(grammarAccess.getTaskTimeAccess().getTimeAssignment_5()); 
            // InternalMyDsl.g:5708:2: ( rule__TaskTime__TimeAssignment_5 )
            // InternalMyDsl.g:5708:3: rule__TaskTime__TimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__TimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTaskTimeAccess().getTimeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group__5__Impl"


    // $ANTLR start "rule__TaskTime__Group_0_0__0"
    // InternalMyDsl.g:5717:1: rule__TaskTime__Group_0_0__0 : rule__TaskTime__Group_0_0__0__Impl rule__TaskTime__Group_0_0__1 ;
    public final void rule__TaskTime__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5721:1: ( rule__TaskTime__Group_0_0__0__Impl rule__TaskTime__Group_0_0__1 )
            // InternalMyDsl.g:5722:2: rule__TaskTime__Group_0_0__0__Impl rule__TaskTime__Group_0_0__1
            {
            pushFollow(FOLLOW_54);
            rule__TaskTime__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_0__0"


    // $ANTLR start "rule__TaskTime__Group_0_0__0__Impl"
    // InternalMyDsl.g:5729:1: rule__TaskTime__Group_0_0__0__Impl : ( 'atomic' ) ;
    public final void rule__TaskTime__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5733:1: ( ( 'atomic' ) )
            // InternalMyDsl.g:5734:1: ( 'atomic' )
            {
            // InternalMyDsl.g:5734:1: ( 'atomic' )
            // InternalMyDsl.g:5735:2: 'atomic'
            {
             before(grammarAccess.getTaskTimeAccess().getAtomicKeyword_0_0_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getTaskTimeAccess().getAtomicKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_0__0__Impl"


    // $ANTLR start "rule__TaskTime__Group_0_0__1"
    // InternalMyDsl.g:5744:1: rule__TaskTime__Group_0_0__1 : rule__TaskTime__Group_0_0__1__Impl rule__TaskTime__Group_0_0__2 ;
    public final void rule__TaskTime__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5748:1: ( rule__TaskTime__Group_0_0__1__Impl rule__TaskTime__Group_0_0__2 )
            // InternalMyDsl.g:5749:2: rule__TaskTime__Group_0_0__1__Impl rule__TaskTime__Group_0_0__2
            {
            pushFollow(FOLLOW_9);
            rule__TaskTime__Group_0_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group_0_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_0__1"


    // $ANTLR start "rule__TaskTime__Group_0_0__1__Impl"
    // InternalMyDsl.g:5756:1: rule__TaskTime__Group_0_0__1__Impl : ( 'task' ) ;
    public final void rule__TaskTime__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5760:1: ( ( 'task' ) )
            // InternalMyDsl.g:5761:1: ( 'task' )
            {
            // InternalMyDsl.g:5761:1: ( 'task' )
            // InternalMyDsl.g:5762:2: 'task'
            {
             before(grammarAccess.getTaskTimeAccess().getTaskKeyword_0_0_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getTaskTimeAccess().getTaskKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_0__1__Impl"


    // $ANTLR start "rule__TaskTime__Group_0_0__2"
    // InternalMyDsl.g:5771:1: rule__TaskTime__Group_0_0__2 : rule__TaskTime__Group_0_0__2__Impl ;
    public final void rule__TaskTime__Group_0_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5775:1: ( rule__TaskTime__Group_0_0__2__Impl )
            // InternalMyDsl.g:5776:2: rule__TaskTime__Group_0_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__Group_0_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_0__2"


    // $ANTLR start "rule__TaskTime__Group_0_0__2__Impl"
    // InternalMyDsl.g:5782:1: rule__TaskTime__Group_0_0__2__Impl : ( ( rule__TaskTime__AtAssignment_0_0_2 ) ) ;
    public final void rule__TaskTime__Group_0_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5786:1: ( ( ( rule__TaskTime__AtAssignment_0_0_2 ) ) )
            // InternalMyDsl.g:5787:1: ( ( rule__TaskTime__AtAssignment_0_0_2 ) )
            {
            // InternalMyDsl.g:5787:1: ( ( rule__TaskTime__AtAssignment_0_0_2 ) )
            // InternalMyDsl.g:5788:2: ( rule__TaskTime__AtAssignment_0_0_2 )
            {
             before(grammarAccess.getTaskTimeAccess().getAtAssignment_0_0_2()); 
            // InternalMyDsl.g:5789:2: ( rule__TaskTime__AtAssignment_0_0_2 )
            // InternalMyDsl.g:5789:3: rule__TaskTime__AtAssignment_0_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__AtAssignment_0_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskTimeAccess().getAtAssignment_0_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_0__2__Impl"


    // $ANTLR start "rule__TaskTime__Group_0_1__0"
    // InternalMyDsl.g:5798:1: rule__TaskTime__Group_0_1__0 : rule__TaskTime__Group_0_1__0__Impl rule__TaskTime__Group_0_1__1 ;
    public final void rule__TaskTime__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5802:1: ( rule__TaskTime__Group_0_1__0__Impl rule__TaskTime__Group_0_1__1 )
            // InternalMyDsl.g:5803:2: rule__TaskTime__Group_0_1__0__Impl rule__TaskTime__Group_0_1__1
            {
            pushFollow(FOLLOW_54);
            rule__TaskTime__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_1__0"


    // $ANTLR start "rule__TaskTime__Group_0_1__0__Impl"
    // InternalMyDsl.g:5810:1: rule__TaskTime__Group_0_1__0__Impl : ( 'compound' ) ;
    public final void rule__TaskTime__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5814:1: ( ( 'compound' ) )
            // InternalMyDsl.g:5815:1: ( 'compound' )
            {
            // InternalMyDsl.g:5815:1: ( 'compound' )
            // InternalMyDsl.g:5816:2: 'compound'
            {
             before(grammarAccess.getTaskTimeAccess().getCompoundKeyword_0_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getTaskTimeAccess().getCompoundKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_1__0__Impl"


    // $ANTLR start "rule__TaskTime__Group_0_1__1"
    // InternalMyDsl.g:5825:1: rule__TaskTime__Group_0_1__1 : rule__TaskTime__Group_0_1__1__Impl rule__TaskTime__Group_0_1__2 ;
    public final void rule__TaskTime__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5829:1: ( rule__TaskTime__Group_0_1__1__Impl rule__TaskTime__Group_0_1__2 )
            // InternalMyDsl.g:5830:2: rule__TaskTime__Group_0_1__1__Impl rule__TaskTime__Group_0_1__2
            {
            pushFollow(FOLLOW_9);
            rule__TaskTime__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_1__1"


    // $ANTLR start "rule__TaskTime__Group_0_1__1__Impl"
    // InternalMyDsl.g:5837:1: rule__TaskTime__Group_0_1__1__Impl : ( 'task' ) ;
    public final void rule__TaskTime__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5841:1: ( ( 'task' ) )
            // InternalMyDsl.g:5842:1: ( 'task' )
            {
            // InternalMyDsl.g:5842:1: ( 'task' )
            // InternalMyDsl.g:5843:2: 'task'
            {
             before(grammarAccess.getTaskTimeAccess().getTaskKeyword_0_1_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getTaskTimeAccess().getTaskKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_1__1__Impl"


    // $ANTLR start "rule__TaskTime__Group_0_1__2"
    // InternalMyDsl.g:5852:1: rule__TaskTime__Group_0_1__2 : rule__TaskTime__Group_0_1__2__Impl ;
    public final void rule__TaskTime__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5856:1: ( rule__TaskTime__Group_0_1__2__Impl )
            // InternalMyDsl.g:5857:2: rule__TaskTime__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__Group_0_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_1__2"


    // $ANTLR start "rule__TaskTime__Group_0_1__2__Impl"
    // InternalMyDsl.g:5863:1: rule__TaskTime__Group_0_1__2__Impl : ( ( rule__TaskTime__CtAssignment_0_1_2 ) ) ;
    public final void rule__TaskTime__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5867:1: ( ( ( rule__TaskTime__CtAssignment_0_1_2 ) ) )
            // InternalMyDsl.g:5868:1: ( ( rule__TaskTime__CtAssignment_0_1_2 ) )
            {
            // InternalMyDsl.g:5868:1: ( ( rule__TaskTime__CtAssignment_0_1_2 ) )
            // InternalMyDsl.g:5869:2: ( rule__TaskTime__CtAssignment_0_1_2 )
            {
             before(grammarAccess.getTaskTimeAccess().getCtAssignment_0_1_2()); 
            // InternalMyDsl.g:5870:2: ( rule__TaskTime__CtAssignment_0_1_2 )
            // InternalMyDsl.g:5870:3: rule__TaskTime__CtAssignment_0_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__CtAssignment_0_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskTimeAccess().getCtAssignment_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_1__2__Impl"


    // $ANTLR start "rule__TaskTime__Group_0_2__0"
    // InternalMyDsl.g:5879:1: rule__TaskTime__Group_0_2__0 : rule__TaskTime__Group_0_2__0__Impl rule__TaskTime__Group_0_2__1 ;
    public final void rule__TaskTime__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5883:1: ( rule__TaskTime__Group_0_2__0__Impl rule__TaskTime__Group_0_2__1 )
            // InternalMyDsl.g:5884:2: rule__TaskTime__Group_0_2__0__Impl rule__TaskTime__Group_0_2__1
            {
            pushFollow(FOLLOW_54);
            rule__TaskTime__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_2__0"


    // $ANTLR start "rule__TaskTime__Group_0_2__0__Impl"
    // InternalMyDsl.g:5891:1: rule__TaskTime__Group_0_2__0__Impl : ( 'mission' ) ;
    public final void rule__TaskTime__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5895:1: ( ( 'mission' ) )
            // InternalMyDsl.g:5896:1: ( 'mission' )
            {
            // InternalMyDsl.g:5896:1: ( 'mission' )
            // InternalMyDsl.g:5897:2: 'mission'
            {
             before(grammarAccess.getTaskTimeAccess().getMissionKeyword_0_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getTaskTimeAccess().getMissionKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_2__0__Impl"


    // $ANTLR start "rule__TaskTime__Group_0_2__1"
    // InternalMyDsl.g:5906:1: rule__TaskTime__Group_0_2__1 : rule__TaskTime__Group_0_2__1__Impl rule__TaskTime__Group_0_2__2 ;
    public final void rule__TaskTime__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5910:1: ( rule__TaskTime__Group_0_2__1__Impl rule__TaskTime__Group_0_2__2 )
            // InternalMyDsl.g:5911:2: rule__TaskTime__Group_0_2__1__Impl rule__TaskTime__Group_0_2__2
            {
            pushFollow(FOLLOW_9);
            rule__TaskTime__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskTime__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_2__1"


    // $ANTLR start "rule__TaskTime__Group_0_2__1__Impl"
    // InternalMyDsl.g:5918:1: rule__TaskTime__Group_0_2__1__Impl : ( 'task' ) ;
    public final void rule__TaskTime__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5922:1: ( ( 'task' ) )
            // InternalMyDsl.g:5923:1: ( 'task' )
            {
            // InternalMyDsl.g:5923:1: ( 'task' )
            // InternalMyDsl.g:5924:2: 'task'
            {
             before(grammarAccess.getTaskTimeAccess().getTaskKeyword_0_2_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getTaskTimeAccess().getTaskKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_2__1__Impl"


    // $ANTLR start "rule__TaskTime__Group_0_2__2"
    // InternalMyDsl.g:5933:1: rule__TaskTime__Group_0_2__2 : rule__TaskTime__Group_0_2__2__Impl ;
    public final void rule__TaskTime__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5937:1: ( rule__TaskTime__Group_0_2__2__Impl )
            // InternalMyDsl.g:5938:2: rule__TaskTime__Group_0_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__Group_0_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_2__2"


    // $ANTLR start "rule__TaskTime__Group_0_2__2__Impl"
    // InternalMyDsl.g:5944:1: rule__TaskTime__Group_0_2__2__Impl : ( ( rule__TaskTime__MtAssignment_0_2_2 ) ) ;
    public final void rule__TaskTime__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5948:1: ( ( ( rule__TaskTime__MtAssignment_0_2_2 ) ) )
            // InternalMyDsl.g:5949:1: ( ( rule__TaskTime__MtAssignment_0_2_2 ) )
            {
            // InternalMyDsl.g:5949:1: ( ( rule__TaskTime__MtAssignment_0_2_2 ) )
            // InternalMyDsl.g:5950:2: ( rule__TaskTime__MtAssignment_0_2_2 )
            {
             before(grammarAccess.getTaskTimeAccess().getMtAssignment_0_2_2()); 
            // InternalMyDsl.g:5951:2: ( rule__TaskTime__MtAssignment_0_2_2 )
            // InternalMyDsl.g:5951:3: rule__TaskTime__MtAssignment_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__TaskTime__MtAssignment_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskTimeAccess().getMtAssignment_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__Group_0_2__2__Impl"


    // $ANTLR start "rule__AllocateT__Group__0"
    // InternalMyDsl.g:5960:1: rule__AllocateT__Group__0 : rule__AllocateT__Group__0__Impl rule__AllocateT__Group__1 ;
    public final void rule__AllocateT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5964:1: ( rule__AllocateT__Group__0__Impl rule__AllocateT__Group__1 )
            // InternalMyDsl.g:5965:2: rule__AllocateT__Group__0__Impl rule__AllocateT__Group__1
            {
            pushFollow(FOLLOW_65);
            rule__AllocateT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group__0"


    // $ANTLR start "rule__AllocateT__Group__0__Impl"
    // InternalMyDsl.g:5972:1: rule__AllocateT__Group__0__Impl : ( 'allocate' ) ;
    public final void rule__AllocateT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5976:1: ( ( 'allocate' ) )
            // InternalMyDsl.g:5977:1: ( 'allocate' )
            {
            // InternalMyDsl.g:5977:1: ( 'allocate' )
            // InternalMyDsl.g:5978:2: 'allocate'
            {
             before(grammarAccess.getAllocateTAccess().getAllocateKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getAllocateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group__0__Impl"


    // $ANTLR start "rule__AllocateT__Group__1"
    // InternalMyDsl.g:5987:1: rule__AllocateT__Group__1 : rule__AllocateT__Group__1__Impl rule__AllocateT__Group__2 ;
    public final void rule__AllocateT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5991:1: ( rule__AllocateT__Group__1__Impl rule__AllocateT__Group__2 )
            // InternalMyDsl.g:5992:2: rule__AllocateT__Group__1__Impl rule__AllocateT__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__AllocateT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group__1"


    // $ANTLR start "rule__AllocateT__Group__1__Impl"
    // InternalMyDsl.g:5999:1: rule__AllocateT__Group__1__Impl : ( ( rule__AllocateT__Alternatives_1 ) ) ;
    public final void rule__AllocateT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6003:1: ( ( ( rule__AllocateT__Alternatives_1 ) ) )
            // InternalMyDsl.g:6004:1: ( ( rule__AllocateT__Alternatives_1 ) )
            {
            // InternalMyDsl.g:6004:1: ( ( rule__AllocateT__Alternatives_1 ) )
            // InternalMyDsl.g:6005:2: ( rule__AllocateT__Alternatives_1 )
            {
             before(grammarAccess.getAllocateTAccess().getAlternatives_1()); 
            // InternalMyDsl.g:6006:2: ( rule__AllocateT__Alternatives_1 )
            // InternalMyDsl.g:6006:3: rule__AllocateT__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAllocateTAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group__1__Impl"


    // $ANTLR start "rule__AllocateT__Group__2"
    // InternalMyDsl.g:6014:1: rule__AllocateT__Group__2 : rule__AllocateT__Group__2__Impl rule__AllocateT__Group__3 ;
    public final void rule__AllocateT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6018:1: ( rule__AllocateT__Group__2__Impl rule__AllocateT__Group__3 )
            // InternalMyDsl.g:6019:2: rule__AllocateT__Group__2__Impl rule__AllocateT__Group__3
            {
            pushFollow(FOLLOW_66);
            rule__AllocateT__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group__2"


    // $ANTLR start "rule__AllocateT__Group__2__Impl"
    // InternalMyDsl.g:6026:1: rule__AllocateT__Group__2__Impl : ( 'to' ) ;
    public final void rule__AllocateT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6030:1: ( ( 'to' ) )
            // InternalMyDsl.g:6031:1: ( 'to' )
            {
            // InternalMyDsl.g:6031:1: ( 'to' )
            // InternalMyDsl.g:6032:2: 'to'
            {
             before(grammarAccess.getAllocateTAccess().getToKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group__2__Impl"


    // $ANTLR start "rule__AllocateT__Group__3"
    // InternalMyDsl.g:6041:1: rule__AllocateT__Group__3 : rule__AllocateT__Group__3__Impl ;
    public final void rule__AllocateT__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6045:1: ( rule__AllocateT__Group__3__Impl )
            // InternalMyDsl.g:6046:2: rule__AllocateT__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group__3"


    // $ANTLR start "rule__AllocateT__Group__3__Impl"
    // InternalMyDsl.g:6052:1: rule__AllocateT__Group__3__Impl : ( ( rule__AllocateT__Alternatives_3 ) ) ;
    public final void rule__AllocateT__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6056:1: ( ( ( rule__AllocateT__Alternatives_3 ) ) )
            // InternalMyDsl.g:6057:1: ( ( rule__AllocateT__Alternatives_3 ) )
            {
            // InternalMyDsl.g:6057:1: ( ( rule__AllocateT__Alternatives_3 ) )
            // InternalMyDsl.g:6058:2: ( rule__AllocateT__Alternatives_3 )
            {
             before(grammarAccess.getAllocateTAccess().getAlternatives_3()); 
            // InternalMyDsl.g:6059:2: ( rule__AllocateT__Alternatives_3 )
            // InternalMyDsl.g:6059:3: rule__AllocateT__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getAllocateTAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group__3__Impl"


    // $ANTLR start "rule__AllocateT__Group_1_0__0"
    // InternalMyDsl.g:6068:1: rule__AllocateT__Group_1_0__0 : rule__AllocateT__Group_1_0__0__Impl rule__AllocateT__Group_1_0__1 ;
    public final void rule__AllocateT__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6072:1: ( rule__AllocateT__Group_1_0__0__Impl rule__AllocateT__Group_1_0__1 )
            // InternalMyDsl.g:6073:2: rule__AllocateT__Group_1_0__0__Impl rule__AllocateT__Group_1_0__1
            {
            pushFollow(FOLLOW_54);
            rule__AllocateT__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_0__0"


    // $ANTLR start "rule__AllocateT__Group_1_0__0__Impl"
    // InternalMyDsl.g:6080:1: rule__AllocateT__Group_1_0__0__Impl : ( 'atomic' ) ;
    public final void rule__AllocateT__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6084:1: ( ( 'atomic' ) )
            // InternalMyDsl.g:6085:1: ( 'atomic' )
            {
            // InternalMyDsl.g:6085:1: ( 'atomic' )
            // InternalMyDsl.g:6086:2: 'atomic'
            {
             before(grammarAccess.getAllocateTAccess().getAtomicKeyword_1_0_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getAtomicKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_0__0__Impl"


    // $ANTLR start "rule__AllocateT__Group_1_0__1"
    // InternalMyDsl.g:6095:1: rule__AllocateT__Group_1_0__1 : rule__AllocateT__Group_1_0__1__Impl rule__AllocateT__Group_1_0__2 ;
    public final void rule__AllocateT__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6099:1: ( rule__AllocateT__Group_1_0__1__Impl rule__AllocateT__Group_1_0__2 )
            // InternalMyDsl.g:6100:2: rule__AllocateT__Group_1_0__1__Impl rule__AllocateT__Group_1_0__2
            {
            pushFollow(FOLLOW_9);
            rule__AllocateT__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_0__1"


    // $ANTLR start "rule__AllocateT__Group_1_0__1__Impl"
    // InternalMyDsl.g:6107:1: rule__AllocateT__Group_1_0__1__Impl : ( 'task' ) ;
    public final void rule__AllocateT__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6111:1: ( ( 'task' ) )
            // InternalMyDsl.g:6112:1: ( 'task' )
            {
            // InternalMyDsl.g:6112:1: ( 'task' )
            // InternalMyDsl.g:6113:2: 'task'
            {
             before(grammarAccess.getAllocateTAccess().getTaskKeyword_1_0_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getTaskKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_0__1__Impl"


    // $ANTLR start "rule__AllocateT__Group_1_0__2"
    // InternalMyDsl.g:6122:1: rule__AllocateT__Group_1_0__2 : rule__AllocateT__Group_1_0__2__Impl ;
    public final void rule__AllocateT__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6126:1: ( rule__AllocateT__Group_1_0__2__Impl )
            // InternalMyDsl.g:6127:2: rule__AllocateT__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_0__2"


    // $ANTLR start "rule__AllocateT__Group_1_0__2__Impl"
    // InternalMyDsl.g:6133:1: rule__AllocateT__Group_1_0__2__Impl : ( ( rule__AllocateT__AtAssignment_1_0_2 ) ) ;
    public final void rule__AllocateT__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6137:1: ( ( ( rule__AllocateT__AtAssignment_1_0_2 ) ) )
            // InternalMyDsl.g:6138:1: ( ( rule__AllocateT__AtAssignment_1_0_2 ) )
            {
            // InternalMyDsl.g:6138:1: ( ( rule__AllocateT__AtAssignment_1_0_2 ) )
            // InternalMyDsl.g:6139:2: ( rule__AllocateT__AtAssignment_1_0_2 )
            {
             before(grammarAccess.getAllocateTAccess().getAtAssignment_1_0_2()); 
            // InternalMyDsl.g:6140:2: ( rule__AllocateT__AtAssignment_1_0_2 )
            // InternalMyDsl.g:6140:3: rule__AllocateT__AtAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__AtAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAllocateTAccess().getAtAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_0__2__Impl"


    // $ANTLR start "rule__AllocateT__Group_1_1__0"
    // InternalMyDsl.g:6149:1: rule__AllocateT__Group_1_1__0 : rule__AllocateT__Group_1_1__0__Impl rule__AllocateT__Group_1_1__1 ;
    public final void rule__AllocateT__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6153:1: ( rule__AllocateT__Group_1_1__0__Impl rule__AllocateT__Group_1_1__1 )
            // InternalMyDsl.g:6154:2: rule__AllocateT__Group_1_1__0__Impl rule__AllocateT__Group_1_1__1
            {
            pushFollow(FOLLOW_54);
            rule__AllocateT__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_1__0"


    // $ANTLR start "rule__AllocateT__Group_1_1__0__Impl"
    // InternalMyDsl.g:6161:1: rule__AllocateT__Group_1_1__0__Impl : ( 'compound' ) ;
    public final void rule__AllocateT__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6165:1: ( ( 'compound' ) )
            // InternalMyDsl.g:6166:1: ( 'compound' )
            {
            // InternalMyDsl.g:6166:1: ( 'compound' )
            // InternalMyDsl.g:6167:2: 'compound'
            {
             before(grammarAccess.getAllocateTAccess().getCompoundKeyword_1_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getCompoundKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_1__0__Impl"


    // $ANTLR start "rule__AllocateT__Group_1_1__1"
    // InternalMyDsl.g:6176:1: rule__AllocateT__Group_1_1__1 : rule__AllocateT__Group_1_1__1__Impl rule__AllocateT__Group_1_1__2 ;
    public final void rule__AllocateT__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6180:1: ( rule__AllocateT__Group_1_1__1__Impl rule__AllocateT__Group_1_1__2 )
            // InternalMyDsl.g:6181:2: rule__AllocateT__Group_1_1__1__Impl rule__AllocateT__Group_1_1__2
            {
            pushFollow(FOLLOW_9);
            rule__AllocateT__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_1__1"


    // $ANTLR start "rule__AllocateT__Group_1_1__1__Impl"
    // InternalMyDsl.g:6188:1: rule__AllocateT__Group_1_1__1__Impl : ( 'task' ) ;
    public final void rule__AllocateT__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6192:1: ( ( 'task' ) )
            // InternalMyDsl.g:6193:1: ( 'task' )
            {
            // InternalMyDsl.g:6193:1: ( 'task' )
            // InternalMyDsl.g:6194:2: 'task'
            {
             before(grammarAccess.getAllocateTAccess().getTaskKeyword_1_1_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getTaskKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_1__1__Impl"


    // $ANTLR start "rule__AllocateT__Group_1_1__2"
    // InternalMyDsl.g:6203:1: rule__AllocateT__Group_1_1__2 : rule__AllocateT__Group_1_1__2__Impl ;
    public final void rule__AllocateT__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6207:1: ( rule__AllocateT__Group_1_1__2__Impl )
            // InternalMyDsl.g:6208:2: rule__AllocateT__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_1__2"


    // $ANTLR start "rule__AllocateT__Group_1_1__2__Impl"
    // InternalMyDsl.g:6214:1: rule__AllocateT__Group_1_1__2__Impl : ( ( rule__AllocateT__CtAssignment_1_1_2 ) ) ;
    public final void rule__AllocateT__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6218:1: ( ( ( rule__AllocateT__CtAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:6219:1: ( ( rule__AllocateT__CtAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:6219:1: ( ( rule__AllocateT__CtAssignment_1_1_2 ) )
            // InternalMyDsl.g:6220:2: ( rule__AllocateT__CtAssignment_1_1_2 )
            {
             before(grammarAccess.getAllocateTAccess().getCtAssignment_1_1_2()); 
            // InternalMyDsl.g:6221:2: ( rule__AllocateT__CtAssignment_1_1_2 )
            // InternalMyDsl.g:6221:3: rule__AllocateT__CtAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__CtAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAllocateTAccess().getCtAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_1__2__Impl"


    // $ANTLR start "rule__AllocateT__Group_1_2__0"
    // InternalMyDsl.g:6230:1: rule__AllocateT__Group_1_2__0 : rule__AllocateT__Group_1_2__0__Impl rule__AllocateT__Group_1_2__1 ;
    public final void rule__AllocateT__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6234:1: ( rule__AllocateT__Group_1_2__0__Impl rule__AllocateT__Group_1_2__1 )
            // InternalMyDsl.g:6235:2: rule__AllocateT__Group_1_2__0__Impl rule__AllocateT__Group_1_2__1
            {
            pushFollow(FOLLOW_54);
            rule__AllocateT__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_2__0"


    // $ANTLR start "rule__AllocateT__Group_1_2__0__Impl"
    // InternalMyDsl.g:6242:1: rule__AllocateT__Group_1_2__0__Impl : ( 'mission' ) ;
    public final void rule__AllocateT__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6246:1: ( ( 'mission' ) )
            // InternalMyDsl.g:6247:1: ( 'mission' )
            {
            // InternalMyDsl.g:6247:1: ( 'mission' )
            // InternalMyDsl.g:6248:2: 'mission'
            {
             before(grammarAccess.getAllocateTAccess().getMissionKeyword_1_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getMissionKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_2__0__Impl"


    // $ANTLR start "rule__AllocateT__Group_1_2__1"
    // InternalMyDsl.g:6257:1: rule__AllocateT__Group_1_2__1 : rule__AllocateT__Group_1_2__1__Impl rule__AllocateT__Group_1_2__2 ;
    public final void rule__AllocateT__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6261:1: ( rule__AllocateT__Group_1_2__1__Impl rule__AllocateT__Group_1_2__2 )
            // InternalMyDsl.g:6262:2: rule__AllocateT__Group_1_2__1__Impl rule__AllocateT__Group_1_2__2
            {
            pushFollow(FOLLOW_9);
            rule__AllocateT__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_2__1"


    // $ANTLR start "rule__AllocateT__Group_1_2__1__Impl"
    // InternalMyDsl.g:6269:1: rule__AllocateT__Group_1_2__1__Impl : ( 'task' ) ;
    public final void rule__AllocateT__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6273:1: ( ( 'task' ) )
            // InternalMyDsl.g:6274:1: ( 'task' )
            {
            // InternalMyDsl.g:6274:1: ( 'task' )
            // InternalMyDsl.g:6275:2: 'task'
            {
             before(grammarAccess.getAllocateTAccess().getTaskKeyword_1_2_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getTaskKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_2__1__Impl"


    // $ANTLR start "rule__AllocateT__Group_1_2__2"
    // InternalMyDsl.g:6284:1: rule__AllocateT__Group_1_2__2 : rule__AllocateT__Group_1_2__2__Impl ;
    public final void rule__AllocateT__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6288:1: ( rule__AllocateT__Group_1_2__2__Impl )
            // InternalMyDsl.g:6289:2: rule__AllocateT__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_1_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_2__2"


    // $ANTLR start "rule__AllocateT__Group_1_2__2__Impl"
    // InternalMyDsl.g:6295:1: rule__AllocateT__Group_1_2__2__Impl : ( ( rule__AllocateT__MtAssignment_1_2_2 ) ) ;
    public final void rule__AllocateT__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6299:1: ( ( ( rule__AllocateT__MtAssignment_1_2_2 ) ) )
            // InternalMyDsl.g:6300:1: ( ( rule__AllocateT__MtAssignment_1_2_2 ) )
            {
            // InternalMyDsl.g:6300:1: ( ( rule__AllocateT__MtAssignment_1_2_2 ) )
            // InternalMyDsl.g:6301:2: ( rule__AllocateT__MtAssignment_1_2_2 )
            {
             before(grammarAccess.getAllocateTAccess().getMtAssignment_1_2_2()); 
            // InternalMyDsl.g:6302:2: ( rule__AllocateT__MtAssignment_1_2_2 )
            // InternalMyDsl.g:6302:3: rule__AllocateT__MtAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__MtAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getAllocateTAccess().getMtAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_1_2__2__Impl"


    // $ANTLR start "rule__AllocateT__Group_3_0__0"
    // InternalMyDsl.g:6311:1: rule__AllocateT__Group_3_0__0 : rule__AllocateT__Group_3_0__0__Impl rule__AllocateT__Group_3_0__1 ;
    public final void rule__AllocateT__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6315:1: ( rule__AllocateT__Group_3_0__0__Impl rule__AllocateT__Group_3_0__1 )
            // InternalMyDsl.g:6316:2: rule__AllocateT__Group_3_0__0__Impl rule__AllocateT__Group_3_0__1
            {
            pushFollow(FOLLOW_9);
            rule__AllocateT__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_3_0__0"


    // $ANTLR start "rule__AllocateT__Group_3_0__0__Impl"
    // InternalMyDsl.g:6323:1: rule__AllocateT__Group_3_0__0__Impl : ( 'robot' ) ;
    public final void rule__AllocateT__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6327:1: ( ( 'robot' ) )
            // InternalMyDsl.g:6328:1: ( 'robot' )
            {
            // InternalMyDsl.g:6328:1: ( 'robot' )
            // InternalMyDsl.g:6329:2: 'robot'
            {
             before(grammarAccess.getAllocateTAccess().getRobotKeyword_3_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getRobotKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_3_0__0__Impl"


    // $ANTLR start "rule__AllocateT__Group_3_0__1"
    // InternalMyDsl.g:6338:1: rule__AllocateT__Group_3_0__1 : rule__AllocateT__Group_3_0__1__Impl ;
    public final void rule__AllocateT__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6342:1: ( rule__AllocateT__Group_3_0__1__Impl )
            // InternalMyDsl.g:6343:2: rule__AllocateT__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_3_0__1"


    // $ANTLR start "rule__AllocateT__Group_3_0__1__Impl"
    // InternalMyDsl.g:6349:1: rule__AllocateT__Group_3_0__1__Impl : ( ( rule__AllocateT__RobotAssignment_3_0_1 ) ) ;
    public final void rule__AllocateT__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6353:1: ( ( ( rule__AllocateT__RobotAssignment_3_0_1 ) ) )
            // InternalMyDsl.g:6354:1: ( ( rule__AllocateT__RobotAssignment_3_0_1 ) )
            {
            // InternalMyDsl.g:6354:1: ( ( rule__AllocateT__RobotAssignment_3_0_1 ) )
            // InternalMyDsl.g:6355:2: ( rule__AllocateT__RobotAssignment_3_0_1 )
            {
             before(grammarAccess.getAllocateTAccess().getRobotAssignment_3_0_1()); 
            // InternalMyDsl.g:6356:2: ( rule__AllocateT__RobotAssignment_3_0_1 )
            // InternalMyDsl.g:6356:3: rule__AllocateT__RobotAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__RobotAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAllocateTAccess().getRobotAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_3_0__1__Impl"


    // $ANTLR start "rule__AllocateT__Group_3_1__0"
    // InternalMyDsl.g:6365:1: rule__AllocateT__Group_3_1__0 : rule__AllocateT__Group_3_1__0__Impl rule__AllocateT__Group_3_1__1 ;
    public final void rule__AllocateT__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6369:1: ( rule__AllocateT__Group_3_1__0__Impl rule__AllocateT__Group_3_1__1 )
            // InternalMyDsl.g:6370:2: rule__AllocateT__Group_3_1__0__Impl rule__AllocateT__Group_3_1__1
            {
            pushFollow(FOLLOW_67);
            rule__AllocateT__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_3_1__0"


    // $ANTLR start "rule__AllocateT__Group_3_1__0__Impl"
    // InternalMyDsl.g:6377:1: rule__AllocateT__Group_3_1__0__Impl : ( 'single' ) ;
    public final void rule__AllocateT__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6381:1: ( ( 'single' ) )
            // InternalMyDsl.g:6382:1: ( 'single' )
            {
            // InternalMyDsl.g:6382:1: ( 'single' )
            // InternalMyDsl.g:6383:2: 'single'
            {
             before(grammarAccess.getAllocateTAccess().getSingleKeyword_3_1_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getSingleKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_3_1__0__Impl"


    // $ANTLR start "rule__AllocateT__Group_3_1__1"
    // InternalMyDsl.g:6392:1: rule__AllocateT__Group_3_1__1 : rule__AllocateT__Group_3_1__1__Impl ;
    public final void rule__AllocateT__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6396:1: ( rule__AllocateT__Group_3_1__1__Impl )
            // InternalMyDsl.g:6397:2: rule__AllocateT__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllocateT__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_3_1__1"


    // $ANTLR start "rule__AllocateT__Group_3_1__1__Impl"
    // InternalMyDsl.g:6403:1: rule__AllocateT__Group_3_1__1__Impl : ( 'robot' ) ;
    public final void rule__AllocateT__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6407:1: ( ( 'robot' ) )
            // InternalMyDsl.g:6408:1: ( 'robot' )
            {
            // InternalMyDsl.g:6408:1: ( 'robot' )
            // InternalMyDsl.g:6409:2: 'robot'
            {
             before(grammarAccess.getAllocateTAccess().getRobotKeyword_3_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAllocateTAccess().getRobotKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__Group_3_1__1__Impl"


    // $ANTLR start "rule__Closest__Group__0"
    // InternalMyDsl.g:6419:1: rule__Closest__Group__0 : rule__Closest__Group__0__Impl rule__Closest__Group__1 ;
    public final void rule__Closest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6423:1: ( rule__Closest__Group__0__Impl rule__Closest__Group__1 )
            // InternalMyDsl.g:6424:2: rule__Closest__Group__0__Impl rule__Closest__Group__1
            {
            pushFollow(FOLLOW_68);
            rule__Closest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__0"


    // $ANTLR start "rule__Closest__Group__0__Impl"
    // InternalMyDsl.g:6431:1: rule__Closest__Group__0__Impl : ( () ) ;
    public final void rule__Closest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6435:1: ( ( () ) )
            // InternalMyDsl.g:6436:1: ( () )
            {
            // InternalMyDsl.g:6436:1: ( () )
            // InternalMyDsl.g:6437:2: ()
            {
             before(grammarAccess.getClosestAccess().getClosestAction_0()); 
            // InternalMyDsl.g:6438:2: ()
            // InternalMyDsl.g:6438:3: 
            {
            }

             after(grammarAccess.getClosestAccess().getClosestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__0__Impl"


    // $ANTLR start "rule__Closest__Group__1"
    // InternalMyDsl.g:6446:1: rule__Closest__Group__1 : rule__Closest__Group__1__Impl rule__Closest__Group__2 ;
    public final void rule__Closest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6450:1: ( rule__Closest__Group__1__Impl rule__Closest__Group__2 )
            // InternalMyDsl.g:6451:2: rule__Closest__Group__1__Impl rule__Closest__Group__2
            {
            pushFollow(FOLLOW_69);
            rule__Closest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__1"


    // $ANTLR start "rule__Closest__Group__1__Impl"
    // InternalMyDsl.g:6458:1: rule__Closest__Group__1__Impl : ( 'allocate' ) ;
    public final void rule__Closest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6462:1: ( ( 'allocate' ) )
            // InternalMyDsl.g:6463:1: ( 'allocate' )
            {
            // InternalMyDsl.g:6463:1: ( 'allocate' )
            // InternalMyDsl.g:6464:2: 'allocate'
            {
             before(grammarAccess.getClosestAccess().getAllocateKeyword_1()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getAllocateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__1__Impl"


    // $ANTLR start "rule__Closest__Group__2"
    // InternalMyDsl.g:6473:1: rule__Closest__Group__2 : rule__Closest__Group__2__Impl rule__Closest__Group__3 ;
    public final void rule__Closest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6477:1: ( rule__Closest__Group__2__Impl rule__Closest__Group__3 )
            // InternalMyDsl.g:6478:2: rule__Closest__Group__2__Impl rule__Closest__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Closest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__2"


    // $ANTLR start "rule__Closest__Group__2__Impl"
    // InternalMyDsl.g:6485:1: rule__Closest__Group__2__Impl : ( ( rule__Closest__Alternatives_2 ) ) ;
    public final void rule__Closest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6489:1: ( ( ( rule__Closest__Alternatives_2 ) ) )
            // InternalMyDsl.g:6490:1: ( ( rule__Closest__Alternatives_2 ) )
            {
            // InternalMyDsl.g:6490:1: ( ( rule__Closest__Alternatives_2 ) )
            // InternalMyDsl.g:6491:2: ( rule__Closest__Alternatives_2 )
            {
             before(grammarAccess.getClosestAccess().getAlternatives_2()); 
            // InternalMyDsl.g:6492:2: ( rule__Closest__Alternatives_2 )
            // InternalMyDsl.g:6492:3: rule__Closest__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Closest__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getClosestAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__2__Impl"


    // $ANTLR start "rule__Closest__Group__3"
    // InternalMyDsl.g:6500:1: rule__Closest__Group__3 : rule__Closest__Group__3__Impl rule__Closest__Group__4 ;
    public final void rule__Closest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6504:1: ( rule__Closest__Group__3__Impl rule__Closest__Group__4 )
            // InternalMyDsl.g:6505:2: rule__Closest__Group__3__Impl rule__Closest__Group__4
            {
            pushFollow(FOLLOW_70);
            rule__Closest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__3"


    // $ANTLR start "rule__Closest__Group__3__Impl"
    // InternalMyDsl.g:6512:1: rule__Closest__Group__3__Impl : ( 'to' ) ;
    public final void rule__Closest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6516:1: ( ( 'to' ) )
            // InternalMyDsl.g:6517:1: ( 'to' )
            {
            // InternalMyDsl.g:6517:1: ( 'to' )
            // InternalMyDsl.g:6518:2: 'to'
            {
             before(grammarAccess.getClosestAccess().getToKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__3__Impl"


    // $ANTLR start "rule__Closest__Group__4"
    // InternalMyDsl.g:6527:1: rule__Closest__Group__4 : rule__Closest__Group__4__Impl rule__Closest__Group__5 ;
    public final void rule__Closest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6531:1: ( rule__Closest__Group__4__Impl rule__Closest__Group__5 )
            // InternalMyDsl.g:6532:2: rule__Closest__Group__4__Impl rule__Closest__Group__5
            {
            pushFollow(FOLLOW_67);
            rule__Closest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__4"


    // $ANTLR start "rule__Closest__Group__4__Impl"
    // InternalMyDsl.g:6539:1: rule__Closest__Group__4__Impl : ( 'closest' ) ;
    public final void rule__Closest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6543:1: ( ( 'closest' ) )
            // InternalMyDsl.g:6544:1: ( 'closest' )
            {
            // InternalMyDsl.g:6544:1: ( 'closest' )
            // InternalMyDsl.g:6545:2: 'closest'
            {
             before(grammarAccess.getClosestAccess().getClosestKeyword_4()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getClosestKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__4__Impl"


    // $ANTLR start "rule__Closest__Group__5"
    // InternalMyDsl.g:6554:1: rule__Closest__Group__5 : rule__Closest__Group__5__Impl ;
    public final void rule__Closest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6558:1: ( rule__Closest__Group__5__Impl )
            // InternalMyDsl.g:6559:2: rule__Closest__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Closest__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__5"


    // $ANTLR start "rule__Closest__Group__5__Impl"
    // InternalMyDsl.g:6565:1: rule__Closest__Group__5__Impl : ( 'robot' ) ;
    public final void rule__Closest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6569:1: ( ( 'robot' ) )
            // InternalMyDsl.g:6570:1: ( 'robot' )
            {
            // InternalMyDsl.g:6570:1: ( 'robot' )
            // InternalMyDsl.g:6571:2: 'robot'
            {
             before(grammarAccess.getClosestAccess().getRobotKeyword_5()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getRobotKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group__5__Impl"


    // $ANTLR start "rule__Closest__Group_2_0__0"
    // InternalMyDsl.g:6581:1: rule__Closest__Group_2_0__0 : rule__Closest__Group_2_0__0__Impl rule__Closest__Group_2_0__1 ;
    public final void rule__Closest__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6585:1: ( rule__Closest__Group_2_0__0__Impl rule__Closest__Group_2_0__1 )
            // InternalMyDsl.g:6586:2: rule__Closest__Group_2_0__0__Impl rule__Closest__Group_2_0__1
            {
            pushFollow(FOLLOW_71);
            rule__Closest__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_0__0"


    // $ANTLR start "rule__Closest__Group_2_0__0__Impl"
    // InternalMyDsl.g:6593:1: rule__Closest__Group_2_0__0__Impl : ( ( rule__Closest__AllAssignment_2_0_0 ) ) ;
    public final void rule__Closest__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6597:1: ( ( ( rule__Closest__AllAssignment_2_0_0 ) ) )
            // InternalMyDsl.g:6598:1: ( ( rule__Closest__AllAssignment_2_0_0 ) )
            {
            // InternalMyDsl.g:6598:1: ( ( rule__Closest__AllAssignment_2_0_0 ) )
            // InternalMyDsl.g:6599:2: ( rule__Closest__AllAssignment_2_0_0 )
            {
             before(grammarAccess.getClosestAccess().getAllAssignment_2_0_0()); 
            // InternalMyDsl.g:6600:2: ( rule__Closest__AllAssignment_2_0_0 )
            // InternalMyDsl.g:6600:3: rule__Closest__AllAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Closest__AllAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getClosestAccess().getAllAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_0__0__Impl"


    // $ANTLR start "rule__Closest__Group_2_0__1"
    // InternalMyDsl.g:6608:1: rule__Closest__Group_2_0__1 : rule__Closest__Group_2_0__1__Impl ;
    public final void rule__Closest__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6612:1: ( rule__Closest__Group_2_0__1__Impl )
            // InternalMyDsl.g:6613:2: rule__Closest__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_0__1"


    // $ANTLR start "rule__Closest__Group_2_0__1__Impl"
    // InternalMyDsl.g:6619:1: rule__Closest__Group_2_0__1__Impl : ( 'tasks' ) ;
    public final void rule__Closest__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6623:1: ( ( 'tasks' ) )
            // InternalMyDsl.g:6624:1: ( 'tasks' )
            {
            // InternalMyDsl.g:6624:1: ( 'tasks' )
            // InternalMyDsl.g:6625:2: 'tasks'
            {
             before(grammarAccess.getClosestAccess().getTasksKeyword_2_0_1()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getTasksKeyword_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_0__1__Impl"


    // $ANTLR start "rule__Closest__Group_2_1__0"
    // InternalMyDsl.g:6635:1: rule__Closest__Group_2_1__0 : rule__Closest__Group_2_1__0__Impl rule__Closest__Group_2_1__1 ;
    public final void rule__Closest__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6639:1: ( rule__Closest__Group_2_1__0__Impl rule__Closest__Group_2_1__1 )
            // InternalMyDsl.g:6640:2: rule__Closest__Group_2_1__0__Impl rule__Closest__Group_2_1__1
            {
            pushFollow(FOLLOW_54);
            rule__Closest__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_1__0"


    // $ANTLR start "rule__Closest__Group_2_1__0__Impl"
    // InternalMyDsl.g:6647:1: rule__Closest__Group_2_1__0__Impl : ( 'atomic' ) ;
    public final void rule__Closest__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6651:1: ( ( 'atomic' ) )
            // InternalMyDsl.g:6652:1: ( 'atomic' )
            {
            // InternalMyDsl.g:6652:1: ( 'atomic' )
            // InternalMyDsl.g:6653:2: 'atomic'
            {
             before(grammarAccess.getClosestAccess().getAtomicKeyword_2_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getAtomicKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_1__0__Impl"


    // $ANTLR start "rule__Closest__Group_2_1__1"
    // InternalMyDsl.g:6662:1: rule__Closest__Group_2_1__1 : rule__Closest__Group_2_1__1__Impl rule__Closest__Group_2_1__2 ;
    public final void rule__Closest__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6666:1: ( rule__Closest__Group_2_1__1__Impl rule__Closest__Group_2_1__2 )
            // InternalMyDsl.g:6667:2: rule__Closest__Group_2_1__1__Impl rule__Closest__Group_2_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Closest__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_1__1"


    // $ANTLR start "rule__Closest__Group_2_1__1__Impl"
    // InternalMyDsl.g:6674:1: rule__Closest__Group_2_1__1__Impl : ( 'task' ) ;
    public final void rule__Closest__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6678:1: ( ( 'task' ) )
            // InternalMyDsl.g:6679:1: ( 'task' )
            {
            // InternalMyDsl.g:6679:1: ( 'task' )
            // InternalMyDsl.g:6680:2: 'task'
            {
             before(grammarAccess.getClosestAccess().getTaskKeyword_2_1_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getTaskKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_1__1__Impl"


    // $ANTLR start "rule__Closest__Group_2_1__2"
    // InternalMyDsl.g:6689:1: rule__Closest__Group_2_1__2 : rule__Closest__Group_2_1__2__Impl ;
    public final void rule__Closest__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6693:1: ( rule__Closest__Group_2_1__2__Impl )
            // InternalMyDsl.g:6694:2: rule__Closest__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_1__2"


    // $ANTLR start "rule__Closest__Group_2_1__2__Impl"
    // InternalMyDsl.g:6700:1: rule__Closest__Group_2_1__2__Impl : ( ( rule__Closest__AtAssignment_2_1_2 ) ) ;
    public final void rule__Closest__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6704:1: ( ( ( rule__Closest__AtAssignment_2_1_2 ) ) )
            // InternalMyDsl.g:6705:1: ( ( rule__Closest__AtAssignment_2_1_2 ) )
            {
            // InternalMyDsl.g:6705:1: ( ( rule__Closest__AtAssignment_2_1_2 ) )
            // InternalMyDsl.g:6706:2: ( rule__Closest__AtAssignment_2_1_2 )
            {
             before(grammarAccess.getClosestAccess().getAtAssignment_2_1_2()); 
            // InternalMyDsl.g:6707:2: ( rule__Closest__AtAssignment_2_1_2 )
            // InternalMyDsl.g:6707:3: rule__Closest__AtAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Closest__AtAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getClosestAccess().getAtAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_1__2__Impl"


    // $ANTLR start "rule__Closest__Group_2_2__0"
    // InternalMyDsl.g:6716:1: rule__Closest__Group_2_2__0 : rule__Closest__Group_2_2__0__Impl rule__Closest__Group_2_2__1 ;
    public final void rule__Closest__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6720:1: ( rule__Closest__Group_2_2__0__Impl rule__Closest__Group_2_2__1 )
            // InternalMyDsl.g:6721:2: rule__Closest__Group_2_2__0__Impl rule__Closest__Group_2_2__1
            {
            pushFollow(FOLLOW_54);
            rule__Closest__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_2__0"


    // $ANTLR start "rule__Closest__Group_2_2__0__Impl"
    // InternalMyDsl.g:6728:1: rule__Closest__Group_2_2__0__Impl : ( 'compound' ) ;
    public final void rule__Closest__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6732:1: ( ( 'compound' ) )
            // InternalMyDsl.g:6733:1: ( 'compound' )
            {
            // InternalMyDsl.g:6733:1: ( 'compound' )
            // InternalMyDsl.g:6734:2: 'compound'
            {
             before(grammarAccess.getClosestAccess().getCompoundKeyword_2_2_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getCompoundKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_2__0__Impl"


    // $ANTLR start "rule__Closest__Group_2_2__1"
    // InternalMyDsl.g:6743:1: rule__Closest__Group_2_2__1 : rule__Closest__Group_2_2__1__Impl rule__Closest__Group_2_2__2 ;
    public final void rule__Closest__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6747:1: ( rule__Closest__Group_2_2__1__Impl rule__Closest__Group_2_2__2 )
            // InternalMyDsl.g:6748:2: rule__Closest__Group_2_2__1__Impl rule__Closest__Group_2_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Closest__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_2__1"


    // $ANTLR start "rule__Closest__Group_2_2__1__Impl"
    // InternalMyDsl.g:6755:1: rule__Closest__Group_2_2__1__Impl : ( 'task' ) ;
    public final void rule__Closest__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6759:1: ( ( 'task' ) )
            // InternalMyDsl.g:6760:1: ( 'task' )
            {
            // InternalMyDsl.g:6760:1: ( 'task' )
            // InternalMyDsl.g:6761:2: 'task'
            {
             before(grammarAccess.getClosestAccess().getTaskKeyword_2_2_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getTaskKeyword_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_2__1__Impl"


    // $ANTLR start "rule__Closest__Group_2_2__2"
    // InternalMyDsl.g:6770:1: rule__Closest__Group_2_2__2 : rule__Closest__Group_2_2__2__Impl ;
    public final void rule__Closest__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6774:1: ( rule__Closest__Group_2_2__2__Impl )
            // InternalMyDsl.g:6775:2: rule__Closest__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_2__2"


    // $ANTLR start "rule__Closest__Group_2_2__2__Impl"
    // InternalMyDsl.g:6781:1: rule__Closest__Group_2_2__2__Impl : ( ( rule__Closest__CtAssignment_2_2_2 ) ) ;
    public final void rule__Closest__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6785:1: ( ( ( rule__Closest__CtAssignment_2_2_2 ) ) )
            // InternalMyDsl.g:6786:1: ( ( rule__Closest__CtAssignment_2_2_2 ) )
            {
            // InternalMyDsl.g:6786:1: ( ( rule__Closest__CtAssignment_2_2_2 ) )
            // InternalMyDsl.g:6787:2: ( rule__Closest__CtAssignment_2_2_2 )
            {
             before(grammarAccess.getClosestAccess().getCtAssignment_2_2_2()); 
            // InternalMyDsl.g:6788:2: ( rule__Closest__CtAssignment_2_2_2 )
            // InternalMyDsl.g:6788:3: rule__Closest__CtAssignment_2_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Closest__CtAssignment_2_2_2();

            state._fsp--;


            }

             after(grammarAccess.getClosestAccess().getCtAssignment_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_2__2__Impl"


    // $ANTLR start "rule__Closest__Group_2_3__0"
    // InternalMyDsl.g:6797:1: rule__Closest__Group_2_3__0 : rule__Closest__Group_2_3__0__Impl rule__Closest__Group_2_3__1 ;
    public final void rule__Closest__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6801:1: ( rule__Closest__Group_2_3__0__Impl rule__Closest__Group_2_3__1 )
            // InternalMyDsl.g:6802:2: rule__Closest__Group_2_3__0__Impl rule__Closest__Group_2_3__1
            {
            pushFollow(FOLLOW_54);
            rule__Closest__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_3__0"


    // $ANTLR start "rule__Closest__Group_2_3__0__Impl"
    // InternalMyDsl.g:6809:1: rule__Closest__Group_2_3__0__Impl : ( 'mission' ) ;
    public final void rule__Closest__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6813:1: ( ( 'mission' ) )
            // InternalMyDsl.g:6814:1: ( 'mission' )
            {
            // InternalMyDsl.g:6814:1: ( 'mission' )
            // InternalMyDsl.g:6815:2: 'mission'
            {
             before(grammarAccess.getClosestAccess().getMissionKeyword_2_3_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getMissionKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_3__0__Impl"


    // $ANTLR start "rule__Closest__Group_2_3__1"
    // InternalMyDsl.g:6824:1: rule__Closest__Group_2_3__1 : rule__Closest__Group_2_3__1__Impl rule__Closest__Group_2_3__2 ;
    public final void rule__Closest__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6828:1: ( rule__Closest__Group_2_3__1__Impl rule__Closest__Group_2_3__2 )
            // InternalMyDsl.g:6829:2: rule__Closest__Group_2_3__1__Impl rule__Closest__Group_2_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Closest__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_3__1"


    // $ANTLR start "rule__Closest__Group_2_3__1__Impl"
    // InternalMyDsl.g:6836:1: rule__Closest__Group_2_3__1__Impl : ( 'task' ) ;
    public final void rule__Closest__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6840:1: ( ( 'task' ) )
            // InternalMyDsl.g:6841:1: ( 'task' )
            {
            // InternalMyDsl.g:6841:1: ( 'task' )
            // InternalMyDsl.g:6842:2: 'task'
            {
             before(grammarAccess.getClosestAccess().getTaskKeyword_2_3_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getTaskKeyword_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_3__1__Impl"


    // $ANTLR start "rule__Closest__Group_2_3__2"
    // InternalMyDsl.g:6851:1: rule__Closest__Group_2_3__2 : rule__Closest__Group_2_3__2__Impl ;
    public final void rule__Closest__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6855:1: ( rule__Closest__Group_2_3__2__Impl )
            // InternalMyDsl.g:6856:2: rule__Closest__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Closest__Group_2_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_3__2"


    // $ANTLR start "rule__Closest__Group_2_3__2__Impl"
    // InternalMyDsl.g:6862:1: rule__Closest__Group_2_3__2__Impl : ( ( rule__Closest__MtAssignment_2_3_2 ) ) ;
    public final void rule__Closest__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6866:1: ( ( ( rule__Closest__MtAssignment_2_3_2 ) ) )
            // InternalMyDsl.g:6867:1: ( ( rule__Closest__MtAssignment_2_3_2 ) )
            {
            // InternalMyDsl.g:6867:1: ( ( rule__Closest__MtAssignment_2_3_2 ) )
            // InternalMyDsl.g:6868:2: ( rule__Closest__MtAssignment_2_3_2 )
            {
             before(grammarAccess.getClosestAccess().getMtAssignment_2_3_2()); 
            // InternalMyDsl.g:6869:2: ( rule__Closest__MtAssignment_2_3_2 )
            // InternalMyDsl.g:6869:3: rule__Closest__MtAssignment_2_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Closest__MtAssignment_2_3_2();

            state._fsp--;


            }

             after(grammarAccess.getClosestAccess().getMtAssignment_2_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__Group_2_3__2__Impl"


    // $ANTLR start "rule__MaxTasks__Group__0"
    // InternalMyDsl.g:6878:1: rule__MaxTasks__Group__0 : rule__MaxTasks__Group__0__Impl rule__MaxTasks__Group__1 ;
    public final void rule__MaxTasks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6882:1: ( rule__MaxTasks__Group__0__Impl rule__MaxTasks__Group__1 )
            // InternalMyDsl.g:6883:2: rule__MaxTasks__Group__0__Impl rule__MaxTasks__Group__1
            {
            pushFollow(FOLLOW_72);
            rule__MaxTasks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__0"


    // $ANTLR start "rule__MaxTasks__Group__0__Impl"
    // InternalMyDsl.g:6890:1: rule__MaxTasks__Group__0__Impl : ( 'limit' ) ;
    public final void rule__MaxTasks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6894:1: ( ( 'limit' ) )
            // InternalMyDsl.g:6895:1: ( 'limit' )
            {
            // InternalMyDsl.g:6895:1: ( 'limit' )
            // InternalMyDsl.g:6896:2: 'limit'
            {
             before(grammarAccess.getMaxTasksAccess().getLimitKeyword_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getMaxTasksAccess().getLimitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__0__Impl"


    // $ANTLR start "rule__MaxTasks__Group__1"
    // InternalMyDsl.g:6905:1: rule__MaxTasks__Group__1 : rule__MaxTasks__Group__1__Impl rule__MaxTasks__Group__2 ;
    public final void rule__MaxTasks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6909:1: ( rule__MaxTasks__Group__1__Impl rule__MaxTasks__Group__2 )
            // InternalMyDsl.g:6910:2: rule__MaxTasks__Group__1__Impl rule__MaxTasks__Group__2
            {
            pushFollow(FOLLOW_73);
            rule__MaxTasks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__1"


    // $ANTLR start "rule__MaxTasks__Group__1__Impl"
    // InternalMyDsl.g:6917:1: rule__MaxTasks__Group__1__Impl : ( 'max' ) ;
    public final void rule__MaxTasks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6921:1: ( ( 'max' ) )
            // InternalMyDsl.g:6922:1: ( 'max' )
            {
            // InternalMyDsl.g:6922:1: ( 'max' )
            // InternalMyDsl.g:6923:2: 'max'
            {
             before(grammarAccess.getMaxTasksAccess().getMaxKeyword_1()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getMaxTasksAccess().getMaxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__1__Impl"


    // $ANTLR start "rule__MaxTasks__Group__2"
    // InternalMyDsl.g:6932:1: rule__MaxTasks__Group__2 : rule__MaxTasks__Group__2__Impl rule__MaxTasks__Group__3 ;
    public final void rule__MaxTasks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6936:1: ( rule__MaxTasks__Group__2__Impl rule__MaxTasks__Group__3 )
            // InternalMyDsl.g:6937:2: rule__MaxTasks__Group__2__Impl rule__MaxTasks__Group__3
            {
            pushFollow(FOLLOW_56);
            rule__MaxTasks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__2"


    // $ANTLR start "rule__MaxTasks__Group__2__Impl"
    // InternalMyDsl.g:6944:1: rule__MaxTasks__Group__2__Impl : ( 'number' ) ;
    public final void rule__MaxTasks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6948:1: ( ( 'number' ) )
            // InternalMyDsl.g:6949:1: ( 'number' )
            {
            // InternalMyDsl.g:6949:1: ( 'number' )
            // InternalMyDsl.g:6950:2: 'number'
            {
             before(grammarAccess.getMaxTasksAccess().getNumberKeyword_2()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getMaxTasksAccess().getNumberKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__2__Impl"


    // $ANTLR start "rule__MaxTasks__Group__3"
    // InternalMyDsl.g:6959:1: rule__MaxTasks__Group__3 : rule__MaxTasks__Group__3__Impl rule__MaxTasks__Group__4 ;
    public final void rule__MaxTasks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6963:1: ( rule__MaxTasks__Group__3__Impl rule__MaxTasks__Group__4 )
            // InternalMyDsl.g:6964:2: rule__MaxTasks__Group__3__Impl rule__MaxTasks__Group__4
            {
            pushFollow(FOLLOW_71);
            rule__MaxTasks__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__3"


    // $ANTLR start "rule__MaxTasks__Group__3__Impl"
    // InternalMyDsl.g:6971:1: rule__MaxTasks__Group__3__Impl : ( 'of' ) ;
    public final void rule__MaxTasks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6975:1: ( ( 'of' ) )
            // InternalMyDsl.g:6976:1: ( 'of' )
            {
            // InternalMyDsl.g:6976:1: ( 'of' )
            // InternalMyDsl.g:6977:2: 'of'
            {
             before(grammarAccess.getMaxTasksAccess().getOfKeyword_3()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getMaxTasksAccess().getOfKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__3__Impl"


    // $ANTLR start "rule__MaxTasks__Group__4"
    // InternalMyDsl.g:6986:1: rule__MaxTasks__Group__4 : rule__MaxTasks__Group__4__Impl rule__MaxTasks__Group__5 ;
    public final void rule__MaxTasks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6990:1: ( rule__MaxTasks__Group__4__Impl rule__MaxTasks__Group__5 )
            // InternalMyDsl.g:6991:2: rule__MaxTasks__Group__4__Impl rule__MaxTasks__Group__5
            {
            pushFollow(FOLLOW_74);
            rule__MaxTasks__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__4"


    // $ANTLR start "rule__MaxTasks__Group__4__Impl"
    // InternalMyDsl.g:6998:1: rule__MaxTasks__Group__4__Impl : ( 'tasks' ) ;
    public final void rule__MaxTasks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7002:1: ( ( 'tasks' ) )
            // InternalMyDsl.g:7003:1: ( 'tasks' )
            {
            // InternalMyDsl.g:7003:1: ( 'tasks' )
            // InternalMyDsl.g:7004:2: 'tasks'
            {
             before(grammarAccess.getMaxTasksAccess().getTasksKeyword_4()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getMaxTasksAccess().getTasksKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__4__Impl"


    // $ANTLR start "rule__MaxTasks__Group__5"
    // InternalMyDsl.g:7013:1: rule__MaxTasks__Group__5 : rule__MaxTasks__Group__5__Impl rule__MaxTasks__Group__6 ;
    public final void rule__MaxTasks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7017:1: ( rule__MaxTasks__Group__5__Impl rule__MaxTasks__Group__6 )
            // InternalMyDsl.g:7018:2: rule__MaxTasks__Group__5__Impl rule__MaxTasks__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__MaxTasks__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__5"


    // $ANTLR start "rule__MaxTasks__Group__5__Impl"
    // InternalMyDsl.g:7025:1: rule__MaxTasks__Group__5__Impl : ( ( rule__MaxTasks__Alternatives_5 ) ) ;
    public final void rule__MaxTasks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7029:1: ( ( ( rule__MaxTasks__Alternatives_5 ) ) )
            // InternalMyDsl.g:7030:1: ( ( rule__MaxTasks__Alternatives_5 ) )
            {
            // InternalMyDsl.g:7030:1: ( ( rule__MaxTasks__Alternatives_5 ) )
            // InternalMyDsl.g:7031:2: ( rule__MaxTasks__Alternatives_5 )
            {
             before(grammarAccess.getMaxTasksAccess().getAlternatives_5()); 
            // InternalMyDsl.g:7032:2: ( rule__MaxTasks__Alternatives_5 )
            // InternalMyDsl.g:7032:3: rule__MaxTasks__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__MaxTasks__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getMaxTasksAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__5__Impl"


    // $ANTLR start "rule__MaxTasks__Group__6"
    // InternalMyDsl.g:7040:1: rule__MaxTasks__Group__6 : rule__MaxTasks__Group__6__Impl rule__MaxTasks__Group__7 ;
    public final void rule__MaxTasks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7044:1: ( rule__MaxTasks__Group__6__Impl rule__MaxTasks__Group__7 )
            // InternalMyDsl.g:7045:2: rule__MaxTasks__Group__6__Impl rule__MaxTasks__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__MaxTasks__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__6"


    // $ANTLR start "rule__MaxTasks__Group__6__Impl"
    // InternalMyDsl.g:7052:1: rule__MaxTasks__Group__6__Impl : ( 'to' ) ;
    public final void rule__MaxTasks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7056:1: ( ( 'to' ) )
            // InternalMyDsl.g:7057:1: ( 'to' )
            {
            // InternalMyDsl.g:7057:1: ( 'to' )
            // InternalMyDsl.g:7058:2: 'to'
            {
             before(grammarAccess.getMaxTasksAccess().getToKeyword_6()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMaxTasksAccess().getToKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__6__Impl"


    // $ANTLR start "rule__MaxTasks__Group__7"
    // InternalMyDsl.g:7067:1: rule__MaxTasks__Group__7 : rule__MaxTasks__Group__7__Impl ;
    public final void rule__MaxTasks__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7071:1: ( rule__MaxTasks__Group__7__Impl )
            // InternalMyDsl.g:7072:2: rule__MaxTasks__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__7"


    // $ANTLR start "rule__MaxTasks__Group__7__Impl"
    // InternalMyDsl.g:7078:1: rule__MaxTasks__Group__7__Impl : ( ( rule__MaxTasks__NumAssignment_7 ) ) ;
    public final void rule__MaxTasks__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7082:1: ( ( ( rule__MaxTasks__NumAssignment_7 ) ) )
            // InternalMyDsl.g:7083:1: ( ( rule__MaxTasks__NumAssignment_7 ) )
            {
            // InternalMyDsl.g:7083:1: ( ( rule__MaxTasks__NumAssignment_7 ) )
            // InternalMyDsl.g:7084:2: ( rule__MaxTasks__NumAssignment_7 )
            {
             before(grammarAccess.getMaxTasksAccess().getNumAssignment_7()); 
            // InternalMyDsl.g:7085:2: ( rule__MaxTasks__NumAssignment_7 )
            // InternalMyDsl.g:7085:3: rule__MaxTasks__NumAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MaxTasks__NumAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMaxTasksAccess().getNumAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group__7__Impl"


    // $ANTLR start "rule__MaxTasks__Group_5_0__0"
    // InternalMyDsl.g:7094:1: rule__MaxTasks__Group_5_0__0 : rule__MaxTasks__Group_5_0__0__Impl rule__MaxTasks__Group_5_0__1 ;
    public final void rule__MaxTasks__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7098:1: ( rule__MaxTasks__Group_5_0__0__Impl rule__MaxTasks__Group_5_0__1 )
            // InternalMyDsl.g:7099:2: rule__MaxTasks__Group_5_0__0__Impl rule__MaxTasks__Group_5_0__1
            {
            pushFollow(FOLLOW_67);
            rule__MaxTasks__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group_5_0__0"


    // $ANTLR start "rule__MaxTasks__Group_5_0__0__Impl"
    // InternalMyDsl.g:7106:1: rule__MaxTasks__Group_5_0__0__Impl : ( ( rule__MaxTasks__AllAssignment_5_0_0 ) ) ;
    public final void rule__MaxTasks__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7110:1: ( ( ( rule__MaxTasks__AllAssignment_5_0_0 ) ) )
            // InternalMyDsl.g:7111:1: ( ( rule__MaxTasks__AllAssignment_5_0_0 ) )
            {
            // InternalMyDsl.g:7111:1: ( ( rule__MaxTasks__AllAssignment_5_0_0 ) )
            // InternalMyDsl.g:7112:2: ( rule__MaxTasks__AllAssignment_5_0_0 )
            {
             before(grammarAccess.getMaxTasksAccess().getAllAssignment_5_0_0()); 
            // InternalMyDsl.g:7113:2: ( rule__MaxTasks__AllAssignment_5_0_0 )
            // InternalMyDsl.g:7113:3: rule__MaxTasks__AllAssignment_5_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MaxTasks__AllAssignment_5_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMaxTasksAccess().getAllAssignment_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group_5_0__0__Impl"


    // $ANTLR start "rule__MaxTasks__Group_5_0__1"
    // InternalMyDsl.g:7121:1: rule__MaxTasks__Group_5_0__1 : rule__MaxTasks__Group_5_0__1__Impl ;
    public final void rule__MaxTasks__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7125:1: ( rule__MaxTasks__Group_5_0__1__Impl )
            // InternalMyDsl.g:7126:2: rule__MaxTasks__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group_5_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group_5_0__1"


    // $ANTLR start "rule__MaxTasks__Group_5_0__1__Impl"
    // InternalMyDsl.g:7132:1: rule__MaxTasks__Group_5_0__1__Impl : ( 'robot' ) ;
    public final void rule__MaxTasks__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7136:1: ( ( 'robot' ) )
            // InternalMyDsl.g:7137:1: ( 'robot' )
            {
            // InternalMyDsl.g:7137:1: ( 'robot' )
            // InternalMyDsl.g:7138:2: 'robot'
            {
             before(grammarAccess.getMaxTasksAccess().getRobotKeyword_5_0_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMaxTasksAccess().getRobotKeyword_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group_5_0__1__Impl"


    // $ANTLR start "rule__MaxTasks__Group_5_1__0"
    // InternalMyDsl.g:7148:1: rule__MaxTasks__Group_5_1__0 : rule__MaxTasks__Group_5_1__0__Impl rule__MaxTasks__Group_5_1__1 ;
    public final void rule__MaxTasks__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7152:1: ( rule__MaxTasks__Group_5_1__0__Impl rule__MaxTasks__Group_5_1__1 )
            // InternalMyDsl.g:7153:2: rule__MaxTasks__Group_5_1__0__Impl rule__MaxTasks__Group_5_1__1
            {
            pushFollow(FOLLOW_67);
            rule__MaxTasks__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group_5_1__0"


    // $ANTLR start "rule__MaxTasks__Group_5_1__0__Impl"
    // InternalMyDsl.g:7160:1: rule__MaxTasks__Group_5_1__0__Impl : ( 'in' ) ;
    public final void rule__MaxTasks__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7164:1: ( ( 'in' ) )
            // InternalMyDsl.g:7165:1: ( 'in' )
            {
            // InternalMyDsl.g:7165:1: ( 'in' )
            // InternalMyDsl.g:7166:2: 'in'
            {
             before(grammarAccess.getMaxTasksAccess().getInKeyword_5_1_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getMaxTasksAccess().getInKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group_5_1__0__Impl"


    // $ANTLR start "rule__MaxTasks__Group_5_1__1"
    // InternalMyDsl.g:7175:1: rule__MaxTasks__Group_5_1__1 : rule__MaxTasks__Group_5_1__1__Impl rule__MaxTasks__Group_5_1__2 ;
    public final void rule__MaxTasks__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7179:1: ( rule__MaxTasks__Group_5_1__1__Impl rule__MaxTasks__Group_5_1__2 )
            // InternalMyDsl.g:7180:2: rule__MaxTasks__Group_5_1__1__Impl rule__MaxTasks__Group_5_1__2
            {
            pushFollow(FOLLOW_9);
            rule__MaxTasks__Group_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group_5_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group_5_1__1"


    // $ANTLR start "rule__MaxTasks__Group_5_1__1__Impl"
    // InternalMyDsl.g:7187:1: rule__MaxTasks__Group_5_1__1__Impl : ( 'robot' ) ;
    public final void rule__MaxTasks__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7191:1: ( ( 'robot' ) )
            // InternalMyDsl.g:7192:1: ( 'robot' )
            {
            // InternalMyDsl.g:7192:1: ( 'robot' )
            // InternalMyDsl.g:7193:2: 'robot'
            {
             before(grammarAccess.getMaxTasksAccess().getRobotKeyword_5_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMaxTasksAccess().getRobotKeyword_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group_5_1__1__Impl"


    // $ANTLR start "rule__MaxTasks__Group_5_1__2"
    // InternalMyDsl.g:7202:1: rule__MaxTasks__Group_5_1__2 : rule__MaxTasks__Group_5_1__2__Impl ;
    public final void rule__MaxTasks__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7206:1: ( rule__MaxTasks__Group_5_1__2__Impl )
            // InternalMyDsl.g:7207:2: rule__MaxTasks__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxTasks__Group_5_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group_5_1__2"


    // $ANTLR start "rule__MaxTasks__Group_5_1__2__Impl"
    // InternalMyDsl.g:7213:1: rule__MaxTasks__Group_5_1__2__Impl : ( ( rule__MaxTasks__RobotAssignment_5_1_2 ) ) ;
    public final void rule__MaxTasks__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7217:1: ( ( ( rule__MaxTasks__RobotAssignment_5_1_2 ) ) )
            // InternalMyDsl.g:7218:1: ( ( rule__MaxTasks__RobotAssignment_5_1_2 ) )
            {
            // InternalMyDsl.g:7218:1: ( ( rule__MaxTasks__RobotAssignment_5_1_2 ) )
            // InternalMyDsl.g:7219:2: ( rule__MaxTasks__RobotAssignment_5_1_2 )
            {
             before(grammarAccess.getMaxTasksAccess().getRobotAssignment_5_1_2()); 
            // InternalMyDsl.g:7220:2: ( rule__MaxTasks__RobotAssignment_5_1_2 )
            // InternalMyDsl.g:7220:3: rule__MaxTasks__RobotAssignment_5_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MaxTasks__RobotAssignment_5_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMaxTasksAccess().getRobotAssignment_5_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__Group_5_1__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:7229:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7233:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:7234:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:7241:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7245:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:7246:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:7246:1: ( ( '-' )? )
            // InternalMyDsl.g:7247:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:7248:2: ( '-' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==81) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:7248:3: '-'
                    {
                    match(input,81,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:7256:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7260:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:7261:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:7267:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7271:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:7272:1: ( RULE_INT )
            {
            // InternalMyDsl.g:7272:1: ( RULE_INT )
            // InternalMyDsl.g:7273:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalMyDsl.g:7283:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7287:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalMyDsl.g:7288:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalMyDsl.g:7295:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7299:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:7300:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:7300:1: ( ( '-' )? )
            // InternalMyDsl.g:7301:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:7302:2: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==81) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:7302:3: '-'
                    {
                    match(input,81,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalMyDsl.g:7310:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7314:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalMyDsl.g:7315:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalMyDsl.g:7322:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7326:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:7327:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:7327:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:7328:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:7329:2: ( RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:7329:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalMyDsl.g:7337:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7341:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalMyDsl.g:7342:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_75);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalMyDsl.g:7349:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7353:1: ( ( '.' ) )
            // InternalMyDsl.g:7354:1: ( '.' )
            {
            // InternalMyDsl.g:7354:1: ( '.' )
            // InternalMyDsl.g:7355:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalMyDsl.g:7364:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7368:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalMyDsl.g:7369:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_76);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalMyDsl.g:7376:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7380:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:7381:1: ( RULE_INT )
            {
            // InternalMyDsl.g:7381:1: ( RULE_INT )
            // InternalMyDsl.g:7382:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalMyDsl.g:7391:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7395:1: ( rule__EDouble__Group__4__Impl )
            // InternalMyDsl.g:7396:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalMyDsl.g:7402:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7406:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalMyDsl.g:7407:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalMyDsl.g:7407:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalMyDsl.g:7408:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalMyDsl.g:7409:2: ( rule__EDouble__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=13 && LA45_0<=14)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:7409:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalMyDsl.g:7418:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7422:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalMyDsl.g:7423:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalMyDsl.g:7430:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7434:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:7435:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:7435:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalMyDsl.g:7436:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:7437:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalMyDsl.g:7437:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalMyDsl.g:7445:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7449:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalMyDsl.g:7450:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalMyDsl.g:7457:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7461:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:7462:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:7462:1: ( ( '-' )? )
            // InternalMyDsl.g:7463:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:7464:2: ( '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==81) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:7464:3: '-'
                    {
                    match(input,81,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalMyDsl.g:7472:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7476:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalMyDsl.g:7477:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalMyDsl.g:7483:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7487:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:7488:1: ( RULE_INT )
            {
            // InternalMyDsl.g:7488:1: ( RULE_INT )
            // InternalMyDsl.g:7489:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__ProblemSpecification__WorldModelAssignment_4"
    // InternalMyDsl.g:7499:1: rule__ProblemSpecification__WorldModelAssignment_4 : ( ruleWorldModel ) ;
    public final void rule__ProblemSpecification__WorldModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7503:1: ( ( ruleWorldModel ) )
            // InternalMyDsl.g:7504:2: ( ruleWorldModel )
            {
            // InternalMyDsl.g:7504:2: ( ruleWorldModel )
            // InternalMyDsl.g:7505:3: ruleWorldModel
            {
             before(grammarAccess.getProblemSpecificationAccess().getWorldModelWorldModelParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWorldModel();

            state._fsp--;

             after(grammarAccess.getProblemSpecificationAccess().getWorldModelWorldModelParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__WorldModelAssignment_4"


    // $ANTLR start "rule__ProblemSpecification__WorldModelAssignment_5"
    // InternalMyDsl.g:7514:1: rule__ProblemSpecification__WorldModelAssignment_5 : ( ruleWorldModel ) ;
    public final void rule__ProblemSpecification__WorldModelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7518:1: ( ( ruleWorldModel ) )
            // InternalMyDsl.g:7519:2: ( ruleWorldModel )
            {
            // InternalMyDsl.g:7519:2: ( ruleWorldModel )
            // InternalMyDsl.g:7520:3: ruleWorldModel
            {
             before(grammarAccess.getProblemSpecificationAccess().getWorldModelWorldModelParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleWorldModel();

            state._fsp--;

             after(grammarAccess.getProblemSpecificationAccess().getWorldModelWorldModelParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__WorldModelAssignment_5"


    // $ANTLR start "rule__ProblemSpecification__TasksModelAssignment_8"
    // InternalMyDsl.g:7529:1: rule__ProblemSpecification__TasksModelAssignment_8 : ( ruleTasksModel ) ;
    public final void rule__ProblemSpecification__TasksModelAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7533:1: ( ( ruleTasksModel ) )
            // InternalMyDsl.g:7534:2: ( ruleTasksModel )
            {
            // InternalMyDsl.g:7534:2: ( ruleTasksModel )
            // InternalMyDsl.g:7535:3: ruleTasksModel
            {
             before(grammarAccess.getProblemSpecificationAccess().getTasksModelTasksModelParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTasksModel();

            state._fsp--;

             after(grammarAccess.getProblemSpecificationAccess().getTasksModelTasksModelParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__TasksModelAssignment_8"


    // $ANTLR start "rule__ProblemSpecification__TasksModelAssignment_9_1"
    // InternalMyDsl.g:7544:1: rule__ProblemSpecification__TasksModelAssignment_9_1 : ( ruleTasksModel ) ;
    public final void rule__ProblemSpecification__TasksModelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7548:1: ( ( ruleTasksModel ) )
            // InternalMyDsl.g:7549:2: ( ruleTasksModel )
            {
            // InternalMyDsl.g:7549:2: ( ruleTasksModel )
            // InternalMyDsl.g:7550:3: ruleTasksModel
            {
             before(grammarAccess.getProblemSpecificationAccess().getTasksModelTasksModelParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTasksModel();

            state._fsp--;

             after(grammarAccess.getProblemSpecificationAccess().getTasksModelTasksModelParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__TasksModelAssignment_9_1"


    // $ANTLR start "rule__ProblemSpecification__RobotsModelAssignment_12"
    // InternalMyDsl.g:7559:1: rule__ProblemSpecification__RobotsModelAssignment_12 : ( ruleRobot ) ;
    public final void rule__ProblemSpecification__RobotsModelAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7563:1: ( ( ruleRobot ) )
            // InternalMyDsl.g:7564:2: ( ruleRobot )
            {
            // InternalMyDsl.g:7564:2: ( ruleRobot )
            // InternalMyDsl.g:7565:3: ruleRobot
            {
             before(grammarAccess.getProblemSpecificationAccess().getRobotsModelRobotParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getProblemSpecificationAccess().getRobotsModelRobotParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__RobotsModelAssignment_12"


    // $ANTLR start "rule__ProblemSpecification__RobotsModelAssignment_13_1"
    // InternalMyDsl.g:7574:1: rule__ProblemSpecification__RobotsModelAssignment_13_1 : ( ruleRobot ) ;
    public final void rule__ProblemSpecification__RobotsModelAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7578:1: ( ( ruleRobot ) )
            // InternalMyDsl.g:7579:2: ( ruleRobot )
            {
            // InternalMyDsl.g:7579:2: ( ruleRobot )
            // InternalMyDsl.g:7580:3: ruleRobot
            {
             before(grammarAccess.getProblemSpecificationAccess().getRobotsModelRobotParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getProblemSpecificationAccess().getRobotsModelRobotParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__RobotsModelAssignment_13_1"


    // $ANTLR start "rule__ProblemSpecification__MissionAssignment_16"
    // InternalMyDsl.g:7589:1: rule__ProblemSpecification__MissionAssignment_16 : ( ruleMission ) ;
    public final void rule__ProblemSpecification__MissionAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7593:1: ( ( ruleMission ) )
            // InternalMyDsl.g:7594:2: ( ruleMission )
            {
            // InternalMyDsl.g:7594:2: ( ruleMission )
            // InternalMyDsl.g:7595:3: ruleMission
            {
             before(grammarAccess.getProblemSpecificationAccess().getMissionMissionParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getProblemSpecificationAccess().getMissionMissionParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__MissionAssignment_16"


    // $ANTLR start "rule__ProblemSpecification__MissionAssignment_17_1"
    // InternalMyDsl.g:7604:1: rule__ProblemSpecification__MissionAssignment_17_1 : ( ruleMission ) ;
    public final void rule__ProblemSpecification__MissionAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7608:1: ( ( ruleMission ) )
            // InternalMyDsl.g:7609:2: ( ruleMission )
            {
            // InternalMyDsl.g:7609:2: ( ruleMission )
            // InternalMyDsl.g:7610:3: ruleMission
            {
             before(grammarAccess.getProblemSpecificationAccess().getMissionMissionParserRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getProblemSpecificationAccess().getMissionMissionParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProblemSpecification__MissionAssignment_17_1"


    // $ANTLR start "rule__Location__NameAssignment_0"
    // InternalMyDsl.g:7619:1: rule__Location__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Location__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7623:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7624:2: ( ruleEString )
            {
            // InternalMyDsl.g:7624:2: ( ruleEString )
            // InternalMyDsl.g:7625:3: ruleEString
            {
             before(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__NameAssignment_0"


    // $ANTLR start "rule__Location__XAssignment_4"
    // InternalMyDsl.g:7634:1: rule__Location__XAssignment_4 : ( ruleEDouble ) ;
    public final void rule__Location__XAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7638:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:7639:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:7639:2: ( ruleEDouble )
            // InternalMyDsl.g:7640:3: ruleEDouble
            {
             before(grammarAccess.getLocationAccess().getXEDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getXEDoubleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__XAssignment_4"


    // $ANTLR start "rule__Location__YAssignment_6"
    // InternalMyDsl.g:7649:1: rule__Location__YAssignment_6 : ( ruleEDouble ) ;
    public final void rule__Location__YAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7653:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:7654:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:7654:2: ( ruleEDouble )
            // InternalMyDsl.g:7655:3: ruleEDouble
            {
             before(grammarAccess.getLocationAccess().getYEDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getYEDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__YAssignment_6"


    // $ANTLR start "rule__Location__DescriptionAssignment_7_2"
    // InternalMyDsl.g:7664:1: rule__Location__DescriptionAssignment_7_2 : ( ruleEString ) ;
    public final void rule__Location__DescriptionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7668:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7669:2: ( ruleEString )
            {
            // InternalMyDsl.g:7669:2: ( ruleEString )
            // InternalMyDsl.g:7670:3: ruleEString
            {
             before(grammarAccess.getLocationAccess().getDescriptionEStringParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getDescriptionEStringParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__DescriptionAssignment_7_2"


    // $ANTLR start "rule__Paths__Loc1Assignment_1"
    // InternalMyDsl.g:7679:1: rule__Paths__Loc1Assignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Paths__Loc1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7683:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7684:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7684:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7685:3: ( ruleEString )
            {
             before(grammarAccess.getPathsAccess().getLoc1LocationCrossReference_1_0()); 
            // InternalMyDsl.g:7686:3: ( ruleEString )
            // InternalMyDsl.g:7687:4: ruleEString
            {
             before(grammarAccess.getPathsAccess().getLoc1LocationEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPathsAccess().getLoc1LocationEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPathsAccess().getLoc1LocationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Loc1Assignment_1"


    // $ANTLR start "rule__Paths__Loc2Assignment_3"
    // InternalMyDsl.g:7698:1: rule__Paths__Loc2Assignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Paths__Loc2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7702:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7703:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7703:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7704:3: ( ruleEString )
            {
             before(grammarAccess.getPathsAccess().getLoc2LocationCrossReference_3_0()); 
            // InternalMyDsl.g:7705:3: ( ruleEString )
            // InternalMyDsl.g:7706:4: ruleEString
            {
             before(grammarAccess.getPathsAccess().getLoc2LocationEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPathsAccess().getLoc2LocationEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPathsAccess().getLoc2LocationCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__Loc2Assignment_3"


    // $ANTLR start "rule__Paths__DistanceAssignment_5"
    // InternalMyDsl.g:7717:1: rule__Paths__DistanceAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Paths__DistanceAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7721:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:7722:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:7722:2: ( ruleEDouble )
            // InternalMyDsl.g:7723:3: ruleEDouble
            {
             before(grammarAccess.getPathsAccess().getDistanceEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPathsAccess().getDistanceEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__DistanceAssignment_5"


    // $ANTLR start "rule__Paths__SuccessAssignment_6_3"
    // InternalMyDsl.g:7732:1: rule__Paths__SuccessAssignment_6_3 : ( ruleEDouble ) ;
    public final void rule__Paths__SuccessAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7736:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:7737:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:7737:2: ( ruleEDouble )
            // InternalMyDsl.g:7738:3: ruleEDouble
            {
             before(grammarAccess.getPathsAccess().getSuccessEDoubleParserRuleCall_6_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPathsAccess().getSuccessEDoubleParserRuleCall_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Paths__SuccessAssignment_6_3"


    // $ANTLR start "rule__AtomicTask__NameAssignment_0"
    // InternalMyDsl.g:7747:1: rule__AtomicTask__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__AtomicTask__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7751:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7752:2: ( ruleEString )
            {
            // InternalMyDsl.g:7752:2: ( ruleEString )
            // InternalMyDsl.g:7753:3: ruleEString
            {
             before(grammarAccess.getAtomicTaskAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicTaskAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__NameAssignment_0"


    // $ANTLR start "rule__AtomicTask__RobotsAssignment_2"
    // InternalMyDsl.g:7762:1: rule__AtomicTask__RobotsAssignment_2 : ( ruleEInt ) ;
    public final void rule__AtomicTask__RobotsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7766:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:7767:2: ( ruleEInt )
            {
            // InternalMyDsl.g:7767:2: ( ruleEInt )
            // InternalMyDsl.g:7768:3: ruleEInt
            {
             before(grammarAccess.getAtomicTaskAccess().getRobotsEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAtomicTaskAccess().getRobotsEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__RobotsAssignment_2"


    // $ANTLR start "rule__AtomicTask__LocAssignment_5_2"
    // InternalMyDsl.g:7777:1: rule__AtomicTask__LocAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__AtomicTask__LocAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7781:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7782:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7782:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7783:3: ( ruleEString )
            {
             before(grammarAccess.getAtomicTaskAccess().getLocLocationCrossReference_5_2_0()); 
            // InternalMyDsl.g:7784:3: ( ruleEString )
            // InternalMyDsl.g:7785:4: ruleEString
            {
             before(grammarAccess.getAtomicTaskAccess().getLocLocationEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAtomicTaskAccess().getLocLocationEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getAtomicTaskAccess().getLocLocationCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__LocAssignment_5_2"


    // $ANTLR start "rule__AtomicTask__RetryAssignment_6_1"
    // InternalMyDsl.g:7796:1: rule__AtomicTask__RetryAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__AtomicTask__RetryAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7800:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:7801:2: ( ruleEInt )
            {
            // InternalMyDsl.g:7801:2: ( ruleEInt )
            // InternalMyDsl.g:7802:3: ruleEInt
            {
             before(grammarAccess.getAtomicTaskAccess().getRetryEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAtomicTaskAccess().getRetryEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicTask__RetryAssignment_6_1"


    // $ANTLR start "rule__CompoundTask__NameAssignment_0"
    // InternalMyDsl.g:7811:1: rule__CompoundTask__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__CompoundTask__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7815:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7816:2: ( ruleEString )
            {
            // InternalMyDsl.g:7816:2: ( ruleEString )
            // InternalMyDsl.g:7817:3: ruleEString
            {
             before(grammarAccess.getCompoundTaskAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompoundTaskAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__NameAssignment_0"


    // $ANTLR start "rule__CompoundTask__CanDoTaskAssignment_4_0"
    // InternalMyDsl.g:7826:1: rule__CompoundTask__CanDoTaskAssignment_4_0 : ( ( ruleEString ) ) ;
    public final void rule__CompoundTask__CanDoTaskAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7830:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7831:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7831:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7832:3: ( ruleEString )
            {
             before(grammarAccess.getCompoundTaskAccess().getCanDoTaskTasksModelCrossReference_4_0_0()); 
            // InternalMyDsl.g:7833:3: ( ruleEString )
            // InternalMyDsl.g:7834:4: ruleEString
            {
             before(grammarAccess.getCompoundTaskAccess().getCanDoTaskTasksModelEStringParserRuleCall_4_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompoundTaskAccess().getCanDoTaskTasksModelEStringParserRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getCompoundTaskAccess().getCanDoTaskTasksModelCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__CanDoTaskAssignment_4_0"


    // $ANTLR start "rule__CompoundTask__CanDoTaskAssignment_4_1_1"
    // InternalMyDsl.g:7845:1: rule__CompoundTask__CanDoTaskAssignment_4_1_1 : ( ( ruleEString ) ) ;
    public final void rule__CompoundTask__CanDoTaskAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7849:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7850:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7850:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7851:3: ( ruleEString )
            {
             before(grammarAccess.getCompoundTaskAccess().getCanDoTaskTasksModelCrossReference_4_1_1_0()); 
            // InternalMyDsl.g:7852:3: ( ruleEString )
            // InternalMyDsl.g:7853:4: ruleEString
            {
             before(grammarAccess.getCompoundTaskAccess().getCanDoTaskTasksModelEStringParserRuleCall_4_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompoundTaskAccess().getCanDoTaskTasksModelEStringParserRuleCall_4_1_1_0_1()); 

            }

             after(grammarAccess.getCompoundTaskAccess().getCanDoTaskTasksModelCrossReference_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__CanDoTaskAssignment_4_1_1"


    // $ANTLR start "rule__CompoundTask__OrderedAssignment_6_0_1"
    // InternalMyDsl.g:7864:1: rule__CompoundTask__OrderedAssignment_6_0_1 : ( ( 'ordered' ) ) ;
    public final void rule__CompoundTask__OrderedAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7868:1: ( ( ( 'ordered' ) ) )
            // InternalMyDsl.g:7869:2: ( ( 'ordered' ) )
            {
            // InternalMyDsl.g:7869:2: ( ( 'ordered' ) )
            // InternalMyDsl.g:7870:3: ( 'ordered' )
            {
             before(grammarAccess.getCompoundTaskAccess().getOrderedOrderedKeyword_6_0_1_0()); 
            // InternalMyDsl.g:7871:3: ( 'ordered' )
            // InternalMyDsl.g:7872:4: 'ordered'
            {
             before(grammarAccess.getCompoundTaskAccess().getOrderedOrderedKeyword_6_0_1_0()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getCompoundTaskAccess().getOrderedOrderedKeyword_6_0_1_0()); 

            }

             after(grammarAccess.getCompoundTaskAccess().getOrderedOrderedKeyword_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__OrderedAssignment_6_0_1"


    // $ANTLR start "rule__CompoundTask__ConsecutiveAssignment_6_1_1"
    // InternalMyDsl.g:7883:1: rule__CompoundTask__ConsecutiveAssignment_6_1_1 : ( ( 'consecutive' ) ) ;
    public final void rule__CompoundTask__ConsecutiveAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7887:1: ( ( ( 'consecutive' ) ) )
            // InternalMyDsl.g:7888:2: ( ( 'consecutive' ) )
            {
            // InternalMyDsl.g:7888:2: ( ( 'consecutive' ) )
            // InternalMyDsl.g:7889:3: ( 'consecutive' )
            {
             before(grammarAccess.getCompoundTaskAccess().getConsecutiveConsecutiveKeyword_6_1_1_0()); 
            // InternalMyDsl.g:7890:3: ( 'consecutive' )
            // InternalMyDsl.g:7891:4: 'consecutive'
            {
             before(grammarAccess.getCompoundTaskAccess().getConsecutiveConsecutiveKeyword_6_1_1_0()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getCompoundTaskAccess().getConsecutiveConsecutiveKeyword_6_1_1_0()); 

            }

             after(grammarAccess.getCompoundTaskAccess().getConsecutiveConsecutiveKeyword_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompoundTask__ConsecutiveAssignment_6_1_1"


    // $ANTLR start "rule__Robot__NameAssignment_0"
    // InternalMyDsl.g:7902:1: rule__Robot__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Robot__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7906:1: ( ( ruleEString ) )
            // InternalMyDsl.g:7907:2: ( ruleEString )
            {
            // InternalMyDsl.g:7907:2: ( ruleEString )
            // InternalMyDsl.g:7908:3: ruleEString
            {
             before(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_0"


    // $ANTLR start "rule__Robot__InitLocAssignment_5"
    // InternalMyDsl.g:7917:1: rule__Robot__InitLocAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Robot__InitLocAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7921:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7922:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7922:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7923:3: ( ruleEString )
            {
             before(grammarAccess.getRobotAccess().getInitLocLocationCrossReference_5_0()); 
            // InternalMyDsl.g:7924:3: ( ruleEString )
            // InternalMyDsl.g:7925:4: ruleEString
            {
             before(grammarAccess.getRobotAccess().getInitLocLocationEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getInitLocLocationEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRobotAccess().getInitLocLocationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__InitLocAssignment_5"


    // $ANTLR start "rule__Robot__VelocityAssignment_8"
    // InternalMyDsl.g:7936:1: rule__Robot__VelocityAssignment_8 : ( ruleEDouble ) ;
    public final void rule__Robot__VelocityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7940:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:7941:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:7941:2: ( ruleEDouble )
            // InternalMyDsl.g:7942:3: ruleEDouble
            {
             before(grammarAccess.getRobotAccess().getVelocityEDoubleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getVelocityEDoubleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__VelocityAssignment_8"


    // $ANTLR start "rule__Robot__CapabilitiesAssignment_12"
    // InternalMyDsl.g:7951:1: rule__Robot__CapabilitiesAssignment_12 : ( ruleCapability ) ;
    public final void rule__Robot__CapabilitiesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7955:1: ( ( ruleCapability ) )
            // InternalMyDsl.g:7956:2: ( ruleCapability )
            {
            // InternalMyDsl.g:7956:2: ( ruleCapability )
            // InternalMyDsl.g:7957:3: ruleCapability
            {
             before(grammarAccess.getRobotAccess().getCapabilitiesCapabilityParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getCapabilitiesCapabilityParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__CapabilitiesAssignment_12"


    // $ANTLR start "rule__Robot__CapabilitiesAssignment_13_1"
    // InternalMyDsl.g:7966:1: rule__Robot__CapabilitiesAssignment_13_1 : ( ruleCapability ) ;
    public final void rule__Robot__CapabilitiesAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7970:1: ( ( ruleCapability ) )
            // InternalMyDsl.g:7971:2: ( ruleCapability )
            {
            // InternalMyDsl.g:7971:2: ( ruleCapability )
            // InternalMyDsl.g:7972:3: ruleCapability
            {
             before(grammarAccess.getRobotAccess().getCapabilitiesCapabilityParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCapability();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getCapabilitiesCapabilityParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__CapabilitiesAssignment_13_1"


    // $ANTLR start "rule__Capability__AtAssignment_0"
    // InternalMyDsl.g:7981:1: rule__Capability__AtAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Capability__AtAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:7985:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:7986:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:7986:2: ( ( ruleEString ) )
            // InternalMyDsl.g:7987:3: ( ruleEString )
            {
             before(grammarAccess.getCapabilityAccess().getAtAtomicTaskCrossReference_0_0()); 
            // InternalMyDsl.g:7988:3: ( ruleEString )
            // InternalMyDsl.g:7989:4: ruleEString
            {
             before(grammarAccess.getCapabilityAccess().getAtAtomicTaskEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCapabilityAccess().getAtAtomicTaskEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCapabilityAccess().getAtAtomicTaskCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__AtAssignment_0"


    // $ANTLR start "rule__Capability__TimeAssignment_3"
    // InternalMyDsl.g:8000:1: rule__Capability__TimeAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Capability__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8004:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:8005:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:8005:2: ( ruleEDouble )
            // InternalMyDsl.g:8006:3: ruleEDouble
            {
             before(grammarAccess.getCapabilityAccess().getTimeEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCapabilityAccess().getTimeEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__TimeAssignment_3"


    // $ANTLR start "rule__Capability__SuccessAssignment_7"
    // InternalMyDsl.g:8015:1: rule__Capability__SuccessAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Capability__SuccessAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8019:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:8020:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:8020:2: ( ruleEDouble )
            // InternalMyDsl.g:8021:3: ruleEDouble
            {
             before(grammarAccess.getCapabilityAccess().getSuccessEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCapabilityAccess().getSuccessEDoubleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Capability__SuccessAssignment_7"


    // $ANTLR start "rule__Mission__MissionTaskAssignment_0"
    // InternalMyDsl.g:8030:1: rule__Mission__MissionTaskAssignment_0 : ( ruleMissionTask ) ;
    public final void rule__Mission__MissionTaskAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8034:1: ( ( ruleMissionTask ) )
            // InternalMyDsl.g:8035:2: ( ruleMissionTask )
            {
            // InternalMyDsl.g:8035:2: ( ruleMissionTask )
            // InternalMyDsl.g:8036:3: ruleMissionTask
            {
             before(grammarAccess.getMissionAccess().getMissionTaskMissionTaskParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMissionTask();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getMissionTaskMissionTaskParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__MissionTaskAssignment_0"


    // $ANTLR start "rule__Mission__MissionTaskAssignment_1_1"
    // InternalMyDsl.g:8045:1: rule__Mission__MissionTaskAssignment_1_1 : ( ruleMissionTask ) ;
    public final void rule__Mission__MissionTaskAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8049:1: ( ( ruleMissionTask ) )
            // InternalMyDsl.g:8050:2: ( ruleMissionTask )
            {
            // InternalMyDsl.g:8050:2: ( ruleMissionTask )
            // InternalMyDsl.g:8051:3: ruleMissionTask
            {
             before(grammarAccess.getMissionAccess().getMissionTaskMissionTaskParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMissionTask();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getMissionTaskMissionTaskParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__MissionTaskAssignment_1_1"


    // $ANTLR start "rule__Mission__ObjAssignment_3"
    // InternalMyDsl.g:8060:1: rule__Mission__ObjAssignment_3 : ( ruleObjective ) ;
    public final void rule__Mission__ObjAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8064:1: ( ( ruleObjective ) )
            // InternalMyDsl.g:8065:2: ( ruleObjective )
            {
            // InternalMyDsl.g:8065:2: ( ruleObjective )
            // InternalMyDsl.g:8066:3: ruleObjective
            {
             before(grammarAccess.getMissionAccess().getObjObjectiveEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleObjective();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getObjObjectiveEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ObjAssignment_3"


    // $ANTLR start "rule__Mission__ObjAssignment_4_1"
    // InternalMyDsl.g:8075:1: rule__Mission__ObjAssignment_4_1 : ( ruleObjective ) ;
    public final void rule__Mission__ObjAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8079:1: ( ( ruleObjective ) )
            // InternalMyDsl.g:8080:2: ( ruleObjective )
            {
            // InternalMyDsl.g:8080:2: ( ruleObjective )
            // InternalMyDsl.g:8081:3: ruleObjective
            {
             before(grammarAccess.getMissionAccess().getObjObjectiveEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjective();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getObjObjectiveEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ObjAssignment_4_1"


    // $ANTLR start "rule__Mission__ConstraintsAssignment_5_1"
    // InternalMyDsl.g:8090:1: rule__Mission__ConstraintsAssignment_5_1 : ( ruleConstraints ) ;
    public final void rule__Mission__ConstraintsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8094:1: ( ( ruleConstraints ) )
            // InternalMyDsl.g:8095:2: ( ruleConstraints )
            {
            // InternalMyDsl.g:8095:2: ( ruleConstraints )
            // InternalMyDsl.g:8096:3: ruleConstraints
            {
             before(grammarAccess.getMissionAccess().getConstraintsConstraintsParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getConstraintsConstraintsParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ConstraintsAssignment_5_1"


    // $ANTLR start "rule__Mission__ConstraintsAssignment_5_2_1"
    // InternalMyDsl.g:8105:1: rule__Mission__ConstraintsAssignment_5_2_1 : ( ruleConstraints ) ;
    public final void rule__Mission__ConstraintsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8109:1: ( ( ruleConstraints ) )
            // InternalMyDsl.g:8110:2: ( ruleConstraints )
            {
            // InternalMyDsl.g:8110:2: ( ruleConstraints )
            // InternalMyDsl.g:8111:3: ruleConstraints
            {
             before(grammarAccess.getMissionAccess().getConstraintsConstraintsParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getConstraintsConstraintsParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__ConstraintsAssignment_5_2_1"


    // $ANTLR start "rule__Mission__TimeAssignment_6_1_1"
    // InternalMyDsl.g:8120:1: rule__Mission__TimeAssignment_6_1_1 : ( ruleEInt ) ;
    public final void rule__Mission__TimeAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8124:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8125:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8125:2: ( ruleEInt )
            // InternalMyDsl.g:8126:3: ruleEInt
            {
             before(grammarAccess.getMissionAccess().getTimeEIntParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getTimeEIntParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__TimeAssignment_6_1_1"


    // $ANTLR start "rule__Mission__NumAllocAssignment_6_2_1"
    // InternalMyDsl.g:8135:1: rule__Mission__NumAllocAssignment_6_2_1 : ( ruleEInt ) ;
    public final void rule__Mission__NumAllocAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8139:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8140:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8140:2: ( ruleEInt )
            // InternalMyDsl.g:8141:3: ruleEInt
            {
             before(grammarAccess.getMissionAccess().getNumAllocEIntParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getNumAllocEIntParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__NumAllocAssignment_6_2_1"


    // $ANTLR start "rule__Mission__PopulationAssignment_6_3_1"
    // InternalMyDsl.g:8150:1: rule__Mission__PopulationAssignment_6_3_1 : ( ruleEInt ) ;
    public final void rule__Mission__PopulationAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8154:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8155:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8155:2: ( ruleEInt )
            // InternalMyDsl.g:8156:3: ruleEInt
            {
             before(grammarAccess.getMissionAccess().getPopulationEIntParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getPopulationEIntParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__PopulationAssignment_6_3_1"


    // $ANTLR start "rule__Mission__EvaluationsAssignment_6_4_1"
    // InternalMyDsl.g:8165:1: rule__Mission__EvaluationsAssignment_6_4_1 : ( ruleEInt ) ;
    public final void rule__Mission__EvaluationsAssignment_6_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8169:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8170:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8170:2: ( ruleEInt )
            // InternalMyDsl.g:8171:3: ruleEInt
            {
             before(grammarAccess.getMissionAccess().getEvaluationsEIntParserRuleCall_6_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getEvaluationsEIntParserRuleCall_6_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__EvaluationsAssignment_6_4_1"


    // $ANTLR start "rule__MissionTask__NameAssignment_1"
    // InternalMyDsl.g:8180:1: rule__MissionTask__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__MissionTask__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8184:1: ( ( ruleEString ) )
            // InternalMyDsl.g:8185:2: ( ruleEString )
            {
            // InternalMyDsl.g:8185:2: ( ruleEString )
            // InternalMyDsl.g:8186:3: ruleEString
            {
             before(grammarAccess.getMissionTaskAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMissionTaskAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__NameAssignment_1"


    // $ANTLR start "rule__MissionTask__AtAssignment_3_0_2"
    // InternalMyDsl.g:8195:1: rule__MissionTask__AtAssignment_3_0_2 : ( ( ruleEString ) ) ;
    public final void rule__MissionTask__AtAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8199:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8200:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8200:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8201:3: ( ruleEString )
            {
             before(grammarAccess.getMissionTaskAccess().getAtAtomicTaskCrossReference_3_0_2_0()); 
            // InternalMyDsl.g:8202:3: ( ruleEString )
            // InternalMyDsl.g:8203:4: ruleEString
            {
             before(grammarAccess.getMissionTaskAccess().getAtAtomicTaskEStringParserRuleCall_3_0_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMissionTaskAccess().getAtAtomicTaskEStringParserRuleCall_3_0_2_0_1()); 

            }

             after(grammarAccess.getMissionTaskAccess().getAtAtomicTaskCrossReference_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__AtAssignment_3_0_2"


    // $ANTLR start "rule__MissionTask__CtAssignment_3_1_2"
    // InternalMyDsl.g:8214:1: rule__MissionTask__CtAssignment_3_1_2 : ( ( ruleEString ) ) ;
    public final void rule__MissionTask__CtAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8218:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8219:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8219:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8220:3: ( ruleEString )
            {
             before(grammarAccess.getMissionTaskAccess().getCtCompoundTaskCrossReference_3_1_2_0()); 
            // InternalMyDsl.g:8221:3: ( ruleEString )
            // InternalMyDsl.g:8222:4: ruleEString
            {
             before(grammarAccess.getMissionTaskAccess().getCtCompoundTaskEStringParserRuleCall_3_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMissionTaskAccess().getCtCompoundTaskEStringParserRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getMissionTaskAccess().getCtCompoundTaskCrossReference_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__CtAssignment_3_1_2"


    // $ANTLR start "rule__MissionTask__LocAssignment_4_2"
    // InternalMyDsl.g:8233:1: rule__MissionTask__LocAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__MissionTask__LocAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8237:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8238:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8238:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8239:3: ( ruleEString )
            {
             before(grammarAccess.getMissionTaskAccess().getLocLocationCrossReference_4_2_0()); 
            // InternalMyDsl.g:8240:3: ( ruleEString )
            // InternalMyDsl.g:8241:4: ruleEString
            {
             before(grammarAccess.getMissionTaskAccess().getLocLocationEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMissionTaskAccess().getLocLocationEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getMissionTaskAccess().getLocLocationCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MissionTask__LocAssignment_4_2"


    // $ANTLR start "rule__RateSucc__RateSuccAssignment_1_5"
    // InternalMyDsl.g:8252:1: rule__RateSucc__RateSuccAssignment_1_5 : ( ruleEDouble ) ;
    public final void rule__RateSucc__RateSuccAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8256:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:8257:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:8257:2: ( ruleEDouble )
            // InternalMyDsl.g:8258:3: ruleEDouble
            {
             before(grammarAccess.getRateSuccAccess().getRateSuccEDoubleParserRuleCall_1_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRateSuccAccess().getRateSuccEDoubleParserRuleCall_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RateSucc__RateSuccAssignment_1_5"


    // $ANTLR start "rule__SpaceXYRobot__RobotAssignment_0_0_1"
    // InternalMyDsl.g:8267:1: rule__SpaceXYRobot__RobotAssignment_0_0_1 : ( ( ruleEString ) ) ;
    public final void rule__SpaceXYRobot__RobotAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8271:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8272:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8272:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8273:3: ( ruleEString )
            {
             before(grammarAccess.getSpaceXYRobotAccess().getRobotRobotCrossReference_0_0_1_0()); 
            // InternalMyDsl.g:8274:3: ( ruleEString )
            // InternalMyDsl.g:8275:4: ruleEString
            {
             before(grammarAccess.getSpaceXYRobotAccess().getRobotRobotEStringParserRuleCall_0_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpaceXYRobotAccess().getRobotRobotEStringParserRuleCall_0_0_1_0_1()); 

            }

             after(grammarAccess.getSpaceXYRobotAccess().getRobotRobotCrossReference_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__RobotAssignment_0_0_1"


    // $ANTLR start "rule__SpaceXYRobot__AllrobotsAssignment_0_1_0"
    // InternalMyDsl.g:8286:1: rule__SpaceXYRobot__AllrobotsAssignment_0_1_0 : ( ( 'all' ) ) ;
    public final void rule__SpaceXYRobot__AllrobotsAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8290:1: ( ( ( 'all' ) ) )
            // InternalMyDsl.g:8291:2: ( ( 'all' ) )
            {
            // InternalMyDsl.g:8291:2: ( ( 'all' ) )
            // InternalMyDsl.g:8292:3: ( 'all' )
            {
             before(grammarAccess.getSpaceXYRobotAccess().getAllrobotsAllKeyword_0_1_0_0()); 
            // InternalMyDsl.g:8293:3: ( 'all' )
            // InternalMyDsl.g:8294:4: 'all'
            {
             before(grammarAccess.getSpaceXYRobotAccess().getAllrobotsAllKeyword_0_1_0_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getSpaceXYRobotAccess().getAllrobotsAllKeyword_0_1_0_0()); 

            }

             after(grammarAccess.getSpaceXYRobotAccess().getAllrobotsAllKeyword_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__AllrobotsAssignment_0_1_0"


    // $ANTLR start "rule__SpaceXYRobot__CoordinateAssignment_3"
    // InternalMyDsl.g:8305:1: rule__SpaceXYRobot__CoordinateAssignment_3 : ( ruleXY ) ;
    public final void rule__SpaceXYRobot__CoordinateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8309:1: ( ( ruleXY ) )
            // InternalMyDsl.g:8310:2: ( ruleXY )
            {
            // InternalMyDsl.g:8310:2: ( ruleXY )
            // InternalMyDsl.g:8311:3: ruleXY
            {
             before(grammarAccess.getSpaceXYRobotAccess().getCoordinateXYEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXY();

            state._fsp--;

             after(grammarAccess.getSpaceXYRobotAccess().getCoordinateXYEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__CoordinateAssignment_3"


    // $ANTLR start "rule__SpaceXYRobot__LowerGreaterAssignment_4"
    // InternalMyDsl.g:8320:1: rule__SpaceXYRobot__LowerGreaterAssignment_4 : ( ruleLowerGreater ) ;
    public final void rule__SpaceXYRobot__LowerGreaterAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8324:1: ( ( ruleLowerGreater ) )
            // InternalMyDsl.g:8325:2: ( ruleLowerGreater )
            {
            // InternalMyDsl.g:8325:2: ( ruleLowerGreater )
            // InternalMyDsl.g:8326:3: ruleLowerGreater
            {
             before(grammarAccess.getSpaceXYRobotAccess().getLowerGreaterLowerGreaterEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLowerGreater();

            state._fsp--;

             after(grammarAccess.getSpaceXYRobotAccess().getLowerGreaterLowerGreaterEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__LowerGreaterAssignment_4"


    // $ANTLR start "rule__SpaceXYRobot__ValAssignment_6"
    // InternalMyDsl.g:8335:1: rule__SpaceXYRobot__ValAssignment_6 : ( ruleEDouble ) ;
    public final void rule__SpaceXYRobot__ValAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8339:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:8340:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:8340:2: ( ruleEDouble )
            // InternalMyDsl.g:8341:3: ruleEDouble
            {
             before(grammarAccess.getSpaceXYRobotAccess().getValEDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSpaceXYRobotAccess().getValEDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpaceXYRobot__ValAssignment_6"


    // $ANTLR start "rule__TaskTime__AtAssignment_0_0_2"
    // InternalMyDsl.g:8350:1: rule__TaskTime__AtAssignment_0_0_2 : ( ( ruleEString ) ) ;
    public final void rule__TaskTime__AtAssignment_0_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8354:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8355:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8355:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8356:3: ( ruleEString )
            {
             before(grammarAccess.getTaskTimeAccess().getAtAtomicTaskCrossReference_0_0_2_0()); 
            // InternalMyDsl.g:8357:3: ( ruleEString )
            // InternalMyDsl.g:8358:4: ruleEString
            {
             before(grammarAccess.getTaskTimeAccess().getAtAtomicTaskEStringParserRuleCall_0_0_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskTimeAccess().getAtAtomicTaskEStringParserRuleCall_0_0_2_0_1()); 

            }

             after(grammarAccess.getTaskTimeAccess().getAtAtomicTaskCrossReference_0_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__AtAssignment_0_0_2"


    // $ANTLR start "rule__TaskTime__CtAssignment_0_1_2"
    // InternalMyDsl.g:8369:1: rule__TaskTime__CtAssignment_0_1_2 : ( ( ruleEString ) ) ;
    public final void rule__TaskTime__CtAssignment_0_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8373:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8374:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8374:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8375:3: ( ruleEString )
            {
             before(grammarAccess.getTaskTimeAccess().getCtCompoundTaskCrossReference_0_1_2_0()); 
            // InternalMyDsl.g:8376:3: ( ruleEString )
            // InternalMyDsl.g:8377:4: ruleEString
            {
             before(grammarAccess.getTaskTimeAccess().getCtCompoundTaskEStringParserRuleCall_0_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskTimeAccess().getCtCompoundTaskEStringParserRuleCall_0_1_2_0_1()); 

            }

             after(grammarAccess.getTaskTimeAccess().getCtCompoundTaskCrossReference_0_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__CtAssignment_0_1_2"


    // $ANTLR start "rule__TaskTime__MtAssignment_0_2_2"
    // InternalMyDsl.g:8388:1: rule__TaskTime__MtAssignment_0_2_2 : ( ( ruleEString ) ) ;
    public final void rule__TaskTime__MtAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8392:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8393:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8393:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8394:3: ( ruleEString )
            {
             before(grammarAccess.getTaskTimeAccess().getMtMissionTaskCrossReference_0_2_2_0()); 
            // InternalMyDsl.g:8395:3: ( ruleEString )
            // InternalMyDsl.g:8396:4: ruleEString
            {
             before(grammarAccess.getTaskTimeAccess().getMtMissionTaskEStringParserRuleCall_0_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskTimeAccess().getMtMissionTaskEStringParserRuleCall_0_2_2_0_1()); 

            }

             after(grammarAccess.getTaskTimeAccess().getMtMissionTaskCrossReference_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__MtAssignment_0_2_2"


    // $ANTLR start "rule__TaskTime__StartEndAssignment_3"
    // InternalMyDsl.g:8407:1: rule__TaskTime__StartEndAssignment_3 : ( ruleStartEnd ) ;
    public final void rule__TaskTime__StartEndAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8411:1: ( ( ruleStartEnd ) )
            // InternalMyDsl.g:8412:2: ( ruleStartEnd )
            {
            // InternalMyDsl.g:8412:2: ( ruleStartEnd )
            // InternalMyDsl.g:8413:3: ruleStartEnd
            {
             before(grammarAccess.getTaskTimeAccess().getStartEndStartEndEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStartEnd();

            state._fsp--;

             after(grammarAccess.getTaskTimeAccess().getStartEndStartEndEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__StartEndAssignment_3"


    // $ANTLR start "rule__TaskTime__TimeAssignment_5"
    // InternalMyDsl.g:8422:1: rule__TaskTime__TimeAssignment_5 : ( ruleEDouble ) ;
    public final void rule__TaskTime__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8426:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:8427:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:8427:2: ( ruleEDouble )
            // InternalMyDsl.g:8428:3: ruleEDouble
            {
             before(grammarAccess.getTaskTimeAccess().getTimeEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTaskTimeAccess().getTimeEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskTime__TimeAssignment_5"


    // $ANTLR start "rule__AllocateT__AtAssignment_1_0_2"
    // InternalMyDsl.g:8437:1: rule__AllocateT__AtAssignment_1_0_2 : ( ( ruleEString ) ) ;
    public final void rule__AllocateT__AtAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8441:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8442:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8442:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8443:3: ( ruleEString )
            {
             before(grammarAccess.getAllocateTAccess().getAtAtomicTaskCrossReference_1_0_2_0()); 
            // InternalMyDsl.g:8444:3: ( ruleEString )
            // InternalMyDsl.g:8445:4: ruleEString
            {
             before(grammarAccess.getAllocateTAccess().getAtAtomicTaskEStringParserRuleCall_1_0_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocateTAccess().getAtAtomicTaskEStringParserRuleCall_1_0_2_0_1()); 

            }

             after(grammarAccess.getAllocateTAccess().getAtAtomicTaskCrossReference_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__AtAssignment_1_0_2"


    // $ANTLR start "rule__AllocateT__CtAssignment_1_1_2"
    // InternalMyDsl.g:8456:1: rule__AllocateT__CtAssignment_1_1_2 : ( ( ruleEString ) ) ;
    public final void rule__AllocateT__CtAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8460:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8461:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8461:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8462:3: ( ruleEString )
            {
             before(grammarAccess.getAllocateTAccess().getCtCompoundTaskCrossReference_1_1_2_0()); 
            // InternalMyDsl.g:8463:3: ( ruleEString )
            // InternalMyDsl.g:8464:4: ruleEString
            {
             before(grammarAccess.getAllocateTAccess().getCtCompoundTaskEStringParserRuleCall_1_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocateTAccess().getCtCompoundTaskEStringParserRuleCall_1_1_2_0_1()); 

            }

             after(grammarAccess.getAllocateTAccess().getCtCompoundTaskCrossReference_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__CtAssignment_1_1_2"


    // $ANTLR start "rule__AllocateT__MtAssignment_1_2_2"
    // InternalMyDsl.g:8475:1: rule__AllocateT__MtAssignment_1_2_2 : ( ( ruleEString ) ) ;
    public final void rule__AllocateT__MtAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8479:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8480:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8480:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8481:3: ( ruleEString )
            {
             before(grammarAccess.getAllocateTAccess().getMtMissionTaskCrossReference_1_2_2_0()); 
            // InternalMyDsl.g:8482:3: ( ruleEString )
            // InternalMyDsl.g:8483:4: ruleEString
            {
             before(grammarAccess.getAllocateTAccess().getMtMissionTaskEStringParserRuleCall_1_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocateTAccess().getMtMissionTaskEStringParserRuleCall_1_2_2_0_1()); 

            }

             after(grammarAccess.getAllocateTAccess().getMtMissionTaskCrossReference_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__MtAssignment_1_2_2"


    // $ANTLR start "rule__AllocateT__RobotAssignment_3_0_1"
    // InternalMyDsl.g:8494:1: rule__AllocateT__RobotAssignment_3_0_1 : ( ( ruleEString ) ) ;
    public final void rule__AllocateT__RobotAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8498:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8499:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8499:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8500:3: ( ruleEString )
            {
             before(grammarAccess.getAllocateTAccess().getRobotRobotCrossReference_3_0_1_0()); 
            // InternalMyDsl.g:8501:3: ( ruleEString )
            // InternalMyDsl.g:8502:4: ruleEString
            {
             before(grammarAccess.getAllocateTAccess().getRobotRobotEStringParserRuleCall_3_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAllocateTAccess().getRobotRobotEStringParserRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getAllocateTAccess().getRobotRobotCrossReference_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllocateT__RobotAssignment_3_0_1"


    // $ANTLR start "rule__Closest__AllAssignment_2_0_0"
    // InternalMyDsl.g:8513:1: rule__Closest__AllAssignment_2_0_0 : ( ( 'all' ) ) ;
    public final void rule__Closest__AllAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8517:1: ( ( ( 'all' ) ) )
            // InternalMyDsl.g:8518:2: ( ( 'all' ) )
            {
            // InternalMyDsl.g:8518:2: ( ( 'all' ) )
            // InternalMyDsl.g:8519:3: ( 'all' )
            {
             before(grammarAccess.getClosestAccess().getAllAllKeyword_2_0_0_0()); 
            // InternalMyDsl.g:8520:3: ( 'all' )
            // InternalMyDsl.g:8521:4: 'all'
            {
             before(grammarAccess.getClosestAccess().getAllAllKeyword_2_0_0_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getClosestAccess().getAllAllKeyword_2_0_0_0()); 

            }

             after(grammarAccess.getClosestAccess().getAllAllKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__AllAssignment_2_0_0"


    // $ANTLR start "rule__Closest__AtAssignment_2_1_2"
    // InternalMyDsl.g:8532:1: rule__Closest__AtAssignment_2_1_2 : ( ( ruleEString ) ) ;
    public final void rule__Closest__AtAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8536:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8537:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8537:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8538:3: ( ruleEString )
            {
             before(grammarAccess.getClosestAccess().getAtAtomicTaskCrossReference_2_1_2_0()); 
            // InternalMyDsl.g:8539:3: ( ruleEString )
            // InternalMyDsl.g:8540:4: ruleEString
            {
             before(grammarAccess.getClosestAccess().getAtAtomicTaskEStringParserRuleCall_2_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClosestAccess().getAtAtomicTaskEStringParserRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getClosestAccess().getAtAtomicTaskCrossReference_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__AtAssignment_2_1_2"


    // $ANTLR start "rule__Closest__CtAssignment_2_2_2"
    // InternalMyDsl.g:8551:1: rule__Closest__CtAssignment_2_2_2 : ( ( ruleEString ) ) ;
    public final void rule__Closest__CtAssignment_2_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8555:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8556:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8556:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8557:3: ( ruleEString )
            {
             before(grammarAccess.getClosestAccess().getCtCompoundTaskCrossReference_2_2_2_0()); 
            // InternalMyDsl.g:8558:3: ( ruleEString )
            // InternalMyDsl.g:8559:4: ruleEString
            {
             before(grammarAccess.getClosestAccess().getCtCompoundTaskEStringParserRuleCall_2_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClosestAccess().getCtCompoundTaskEStringParserRuleCall_2_2_2_0_1()); 

            }

             after(grammarAccess.getClosestAccess().getCtCompoundTaskCrossReference_2_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__CtAssignment_2_2_2"


    // $ANTLR start "rule__Closest__MtAssignment_2_3_2"
    // InternalMyDsl.g:8570:1: rule__Closest__MtAssignment_2_3_2 : ( ( ruleEString ) ) ;
    public final void rule__Closest__MtAssignment_2_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8574:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8575:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8575:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8576:3: ( ruleEString )
            {
             before(grammarAccess.getClosestAccess().getMtMissionTaskCrossReference_2_3_2_0()); 
            // InternalMyDsl.g:8577:3: ( ruleEString )
            // InternalMyDsl.g:8578:4: ruleEString
            {
             before(grammarAccess.getClosestAccess().getMtMissionTaskEStringParserRuleCall_2_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClosestAccess().getMtMissionTaskEStringParserRuleCall_2_3_2_0_1()); 

            }

             after(grammarAccess.getClosestAccess().getMtMissionTaskCrossReference_2_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closest__MtAssignment_2_3_2"


    // $ANTLR start "rule__MaxTasks__AllAssignment_5_0_0"
    // InternalMyDsl.g:8589:1: rule__MaxTasks__AllAssignment_5_0_0 : ( ( 'per' ) ) ;
    public final void rule__MaxTasks__AllAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8593:1: ( ( ( 'per' ) ) )
            // InternalMyDsl.g:8594:2: ( ( 'per' ) )
            {
            // InternalMyDsl.g:8594:2: ( ( 'per' ) )
            // InternalMyDsl.g:8595:3: ( 'per' )
            {
             before(grammarAccess.getMaxTasksAccess().getAllPerKeyword_5_0_0_0()); 
            // InternalMyDsl.g:8596:3: ( 'per' )
            // InternalMyDsl.g:8597:4: 'per'
            {
             before(grammarAccess.getMaxTasksAccess().getAllPerKeyword_5_0_0_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getMaxTasksAccess().getAllPerKeyword_5_0_0_0()); 

            }

             after(grammarAccess.getMaxTasksAccess().getAllPerKeyword_5_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__AllAssignment_5_0_0"


    // $ANTLR start "rule__MaxTasks__RobotAssignment_5_1_2"
    // InternalMyDsl.g:8608:1: rule__MaxTasks__RobotAssignment_5_1_2 : ( ( ruleEString ) ) ;
    public final void rule__MaxTasks__RobotAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8612:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:8613:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:8613:2: ( ( ruleEString ) )
            // InternalMyDsl.g:8614:3: ( ruleEString )
            {
             before(grammarAccess.getMaxTasksAccess().getRobotRobotCrossReference_5_1_2_0()); 
            // InternalMyDsl.g:8615:3: ( ruleEString )
            // InternalMyDsl.g:8616:4: ruleEString
            {
             before(grammarAccess.getMaxTasksAccess().getRobotRobotEStringParserRuleCall_5_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMaxTasksAccess().getRobotRobotEStringParserRuleCall_5_1_2_0_1()); 

            }

             after(grammarAccess.getMaxTasksAccess().getRobotRobotCrossReference_5_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__RobotAssignment_5_1_2"


    // $ANTLR start "rule__MaxTasks__NumAssignment_7"
    // InternalMyDsl.g:8627:1: rule__MaxTasks__NumAssignment_7 : ( ruleEInt ) ;
    public final void rule__MaxTasks__NumAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:8631:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:8632:2: ( ruleEInt )
            {
            // InternalMyDsl.g:8632:2: ( ruleEInt )
            // InternalMyDsl.g:8633:3: ruleEInt
            {
             before(grammarAccess.getMaxTasksAccess().getNumEIntParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMaxTasksAccess().getNumEIntParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxTasks__NumAssignment_7"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\1\24\uffff";
    static final String dfa_3s = "\1\14\3\uffff\1\101\1\uffff\3\102\1\uffff\3\4\6\45\1\14\1\uffff";
    static final String dfa_4s = "\1\125\3\uffff\1\125\1\uffff\3\102\1\uffff\3\5\6\45\1\114\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\3\uffff\1\5\12\uffff\1\4";
    static final String dfa_6s = "\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\22\uffff\2\1\34\uffff\1\1\3\uffff\1\3\1\uffff\1\3\1\1\4\uffff\1\3\1\4\3\uffff\1\5\6\uffff\1\2",
            "",
            "",
            "",
            "\1\6\1\uffff\1\7\5\uffff\1\10\13\uffff\1\11",
            "",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\15\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\24\76\uffff\1\24\1\11",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "746:1: rule__Constraints__Alternatives : ( ( ruleRateSucc ) | ( ruleSpaceXYRobot ) | ( ruleTaskTime ) | ( ruleAllocateT ) | ( ruleClosest ) | ( ruleMaxTasks ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001010000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000032L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L,0x0000000000060000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L,0x0000000000020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000000030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000100000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x3000000100000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000001000L,0x000000000020461AL});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xC400000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000AL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x000000000000020AL});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000800L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x000000000020020AL});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400100L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000006000L});

}