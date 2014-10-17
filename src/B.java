
public class B {
	
	public static void main(String args[]){
		String nmsId="/eth=P3223";
		System.out.println(nmsId.substring(nmsId.indexOf("/eth=P")+"/eth=P".length()));
	}
	
}
