
public class User {
	private String name;
	
	public String getNome() {
		return name;
	}

	public void setNome(String userName) {
		this.name = userName;
	}
	
	public String generateApproval(int userScore) {
		if(userScore >= 60) {
			return "APROVADO!!!!!";
		}
		return"REPROVADO....";
		
	}
}