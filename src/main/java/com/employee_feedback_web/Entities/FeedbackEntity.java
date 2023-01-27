package com.employee_feedback_web.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="feedback")
public class FeedbackEntity {
	 @jakarta.persistence.Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long Id;

	    @Column(name="name",nullable = false)
	    private String name;
	    @Column(name="emp_id",nullable = false)
	    private int emp_id;
	    @Column(name="current_role",nullable = false)
	    private int current_role;
	    @Column(name="recomendation",nullable = false)
	    private int recomendation;
	    @Column(name="balance_life",nullable = false)
	    private int balance_life;
	    @Column(name="growth",nullable = false)
	    private int growth;
	    @Column(name="about",nullable = false)
	    private String about;
	    @Column(name="improve_happiness",nullable = false)
	    private String improve_happiness;
		public long getId() {
			return Id;
		}
		public void setId(long id) {
			Id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}
		public int getCurrent_role() {
			return current_role;
		}
		public void setCurrent_role(int current_role) {
			this.current_role = current_role;
		}
		public int getRecomendation() {
			return recomendation;
		}
		public void setRecomendation(int recomendation) {
			this.recomendation = recomendation;
		}
		public int getBalance_life() {
			return balance_life;
		}
		public void setBalance_life(int balance_life) {
			this.balance_life = balance_life;
		}
		public int getGrowth() {
			return growth;
		}
		public void setGrowth(int growth) {
			this.growth = growth;
		}
		public String getAbout() {
			return about;
		}
		public void setAbout(String about) {
			this.about = about;
		}
		public String getImprove_happiness() {
			return improve_happiness;
		}
		public void setImprove_happiness(String improve_happiness) {
			this.improve_happiness = improve_happiness;
		}
	    
}
