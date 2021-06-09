package project2;

public class University  {
 
	private int rankingNum;
	private int cost;
	private String name;
	private String country;
	private String description;
	
	public University(){
		
	}
    public University(int rankinNum, int cost, String name,String country, String description){
      	this.setRankingNum(rankingNum);
		this.setCost(cost);
		this.setName(name);
		this.setCountry(country);
		this.setDescription(description);
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getRankingNum() {
		return rankingNum;
	}
	public void setRankingNum(int rankingNum) {
		this.rankingNum = rankingNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

