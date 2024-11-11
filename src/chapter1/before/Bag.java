package chapter1.before;


//가방
public class Bag {
	
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;
	
	//초대장이 없는 사람
	public Bag(long amount) {
		this(null,amount);
	}
	
	//초대장이 있는 사람
	public Bag(Invitation invitation, long amount) {
		this.invitation = invitation;
		this.amount = amount;
	}
	
	public boolean hasInvitation()
	{
		return invitation != null;
	}
	
	public boolean hasTicket() {
		return ticket != null;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public void minusAmount(Long amount) {
		this.amount -= amount;
	}
	
	public void plusAmount(Long amount) {
		this.amount += amount;
	}
	
}
