package Q19_operations_master;

import Q19_operations_bonus.Bonus;
import Q19_operations_salary.Salary;

public class Main {
	public static double finalSal(Salary salary, Bonus bonus) {
		return salary.calSal(0) + bonus.calBonus(0);
	}

	public static void main(String[] args) {
		System.out.println(finalSal(new Salary() {
			@Override
			public double calSal(double amt) {
				return 1000;
			}
		}, new Bonus() {
			@Override
			public double calBonus(double bonus) {
				return 200;
			}
		}));
	}
}
