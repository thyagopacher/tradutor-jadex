package a1;

import jadex.bdiv3.annotation.Body;
import jadex.bdiv3.annotation.Plan;
import jadex.bdiv3.annotation.Plans;
import jadex.bdiv3.features.IBDIAgentFeature;
import jadex.micro.annotation.Agent;
import jadex.micro.annotation.AgentBody;
import jadex.micro.annotation.AgentFeature;
import jadex.micro.annotation.Description;

@Plans(@Plan(body=@Body(TranslationPlan.class)))
@Agent
@Description("The translation agent A1. <br> Empty agent that can be loaded and started.")
public class TranslationBDI
{
	
	@AgentFeature 
	protected IBDIAgentFeature bdiFeature;
	
	@AgentBody
	public void body()
	{
	  bdiFeature.adoptPlan(new TranslationPlan());
	}	
}