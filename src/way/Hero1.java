package way;

public class Hero1 {
	      
	    String name; //����
	      
	    float hp; //Ѫ��
	      
	    float armor; //����
	      
	    int moveSpeed; //�ƶ��ٶ�
	      
	    //�вεĹ��췽��
	    //Ĭ�ϵ��޲εĹ��췽����ʧЧ��
	    public Hero1(String heroname){ 
	        name = heroname;
	    }
	      
	    public static void main(String[] args) {
	        Hero1 garen =  new Hero1("����"); 
	          
	        Hero1 teemo =  new Hero1("��Ī"); //�޲εĹ��췽����ľ���ˡ�
	    }  
	      
	
}
