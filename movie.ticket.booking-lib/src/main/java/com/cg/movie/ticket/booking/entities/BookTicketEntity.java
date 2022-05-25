package com.cg.movie.ticket.booking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BookingTicket")
public class BookTicketEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int bookingid;

@Column(name="noofticketsbooked",length=25)
private int noofticketsbooked;

@OneToOne
@JoinColumn(name = "userid")
private UserEntity userid;

@OneToOne
@JoinColumn(name = "showid")
private ShowInformationEntity showid;

public ShowInformationEntity getShowid() {
	return showid;
}
public void setShowid(ShowInformationEntity showid) {
	this.showid = showid;
}
public int getBookingid() {
	return bookingid;
}
public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}
public int getNoofticketsbooked() {
	return noofticketsbooked;
}
public void setNoofticketsbooked(int noofticketsbooked) {
	this.noofticketsbooked = noofticketsbooked;
}
public UserEntity getUserid() {
	return userid;
}
public void setUserid(UserEntity userid) {
	this.userid = userid;
}

}
