package hero;

public class ADHeroing extends Hero {

		public void attacking() {
			System.out.println(name + " ������һ�ι��� �����ǲ�ȷ������˭��");
		}

		// �ɱ������Ĳ���
		public void attacking(Hero... heros) {
			for (int i = 0; i < heros.length; i++) {
				System.out.println(name + " ������ " + heros[i].name);

			}
		}

		public static void main(String[] args) {
			ADHeroing ch = new ADHeroing();
			ch.name = "�ͽ�����";

			Hero l1 = new Hero();
			l1.name = "����";
			Hero l2 = new Hero();
			l2.name = "��Ī";

			ch.attacking(l1);
			ch.attacking(l1, l2);

		}

	

}
