package chapter1.after;


//가방
public class Bag {
	
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;
	
	//초대장이 없는 사람
//	public Bag(long amount) {
//		this(null,amount);
//	}
	
	//초대장이 있는 사람
//	public Bag(Invitation invitation, long amount) {
//		this.invitation = invitation;
//		this.amount = amount;
//	}
	
	//1.Bag을 자율적인 존재로 변경
	public Long hold(Ticket ticket)
	{
		if(hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			setTicket(ticket);
			minusAmount(amount);
			return ticket.getFee();
		}
	}
	
	
	//내부에서만 사용하도록 캡슐화
	private boolean hasInvitation()
	{
		return invitation != null;
	}
	
//	private boolean hasTicket() {
//		return ticket != null;
//	}

	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	private void minusAmount(Long amount) {
		this.amount -= amount;
	}
	
//	private void plusAmount(Long amount) {
//		this.amount += amount;
//	}
	
}
