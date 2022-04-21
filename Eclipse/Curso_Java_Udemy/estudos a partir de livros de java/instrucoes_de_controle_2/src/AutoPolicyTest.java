package src;

import model.entities.AutoPolicy;

public class AutoPolicyTest {

	public static void main(String[] args) {
		
		AutoPolicy p1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
		AutoPolicy p2 = new AutoPolicy(22222222, "Ford Fusion", "ME");
	
		policyInNoFaultStage(p1);
		policyInNoFaultStage(p2);
	}

	public static void policyInNoFaultStage(AutoPolicy policy) {
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
		policy.getAccountNumber(), policy.getMakeAndModel(),
		policy.getState(),
		(policy.isNoFaultState() ? "is": "is not"));
		
	}

}
