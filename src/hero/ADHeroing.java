package hero;

public class ADHeroing extends Hero {

		public void attacking() {
			System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
		}

		// 可变数量的参数
		public void attacking(Hero... heros) {
			for (int i = 0; i < heros.length; i++) {
				System.out.println(name + " 攻击了 " + heros[i].name);

			}
		}

		public static void main(String[] args) {
			ADHeroing ch = new ADHeroing();
			ch.name = "赏金猎人";

			Hero l1 = new Hero();
			l1.name = "盖伦";
			Hero l2 = new Hero();
			l2.name = "提莫";

			ch.attacking(l1);
			ch.attacking(l1, l2);

		}

	

}
