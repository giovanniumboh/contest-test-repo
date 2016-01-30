package com.giovanni.contest_test;

//import org.kie.api.KieServices;
//import org.kie.api.runtime.KieContainer;
//import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

//	public static final void main(String[] args) {
//		try {
//			// load up the knowledge base
//			KieServices ks = KieServices.Factory.get();
//			KieContainer kContainer = ks.getKieClasspathContainer();
//			KieSession kSession = kContainer.newKieSession("ksession-rules");
//
//			Agent agent = new Agent();
//			agent.setAgentCode("AG01");
//			agent.setAgentName("Giovanni");
//			kSession.insert(agent);
//
//			Contest contest1 = new Contest();
//			contest1.setContestCode("C0001");
//			contest1.setContestName("Contest Silver");
//			contest1.setNeedMonitor(false);
//			kSession.insert(contest1);
//
//			Contest contest2 = new Contest();
//			contest2.setContestCode("C0002");
//			contest2.setContestName("Contest Gold");
//			contest2.setNeedMonitor(false);
//			kSession.insert(contest2);
//
//			Contest contest3 = new Contest();
//			contest3.setContestCode("C0003");
//			contest3.setContestName("Contest Platinum");
//			contest3.setNeedMonitor(true);
//			kSession.insert(contest3);
//
//			Policy policy1 = new Policy();
//			policy1.setAgentCode("AG01");
//			policy1.setPolicyNo("PLC01");
//			policy1.setPolicyType("Silver");
//			kSession.insert(policy1);
//
//			Policy policy2 = new Policy();
//			policy2.setAgentCode("AG01");
//			policy2.setPolicyNo("PLC02");
//			policy2.setPolicyType("Gold");
//			kSession.insert(policy2);
//
//			Policy policy3 = new Policy();
//			policy3.setAgentCode("AG01");
//			policy3.setPolicyNo("PLC03");
//			policy3.setPolicyType("Platinum");
//			kSession.insert(policy3);
//			
//			kSession.fireAllRules();
//		} catch (Throwable t) {
//			t.printStackTrace();
//		}
//	}
}
