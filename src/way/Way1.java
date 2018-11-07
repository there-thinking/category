package way;

public class Way1 {	     
	    String name; //姓名
	     
	    float hp; //血量
	     
	    float armor; //护甲
	     
	    int moveSpeed; //移动速度
	     
	    //这个无参的构造方法，如果不写，
	    //就会默认提供一个无参的构造方法
	    //  public Hero(){ 
	    //     
	    //  }
	 
	    public static void main(String[] args) {
	        Way1 galun =  new Way1();
	        galun.name = "盖伦";
	        galun.hp = 616.28f;
	        galun.armor = 27.536f;
	        galun.moveSpeed = 350;
	         
	        Way1 timo =  new Way1();
	        timo.name = "提莫";
	        timo.hp = 383f;
	        timo.armor = 14f;
	        timo.moveSpeed = 330;
	    }  
	     
	
}
