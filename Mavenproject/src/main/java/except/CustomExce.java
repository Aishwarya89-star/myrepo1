package except;

public class CustomExce {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
int a=9;
		
		if(a>=18) {
			
			System.out.println("eligible for voyiong");

	}else {
		
	}throw new VotingException("Exception handled");
	}

}
