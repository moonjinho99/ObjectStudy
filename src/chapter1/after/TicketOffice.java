package chapter1.after;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//매표소
public class TicketOffice {
	
	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();
	
//	public TicketOffice(Long amount, Ticket ...tickets)
//	{
//		this.amount = amount;
//		this.tickets.addAll(Arrays.asList(tickets));
//	}
	
	public void sellTicketTo(Audience audience)
	{
		plusAmount(audience.buy(getTicket()));
	}

	//내부에서만 사용하도록 캡슐화
	private Ticket getTicket()
	{
		return tickets.remove(0);
	}
	
//	public void minusAmount(Long amount)
//	{
//		this.amount -= amount;
//	}
	
	private void plusAmount(Long amount)
	{
		this.amount += amount;
	}
}
