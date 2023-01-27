package com.employee_feedback_web.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee_feedback_web.Entities.FeedbackEntity;
import com.employee_feedback_web.Service.FeedbackService;

@Controller
public class FeedbackController {

	@Autowired
	private FeedbackService feedService;
	
	@RequestMapping("/Feedback")
	public String feedback() {
		return "feedback";
	}
	
	@PostMapping("/create")
	public String createFeed(@ModelAttribute FeedbackEntity feed,Model model) {
		feedService.createFeedback(feed);
		int current_role = feed.getCurrent_role();
		int recomendation = feed.getRecomendation();
		int balance_life = feed.getBalance_life();
		int growth = feed.getGrowth();
		int status;
		int finalstatus;
		status =current_role+recomendation+balance_life+growth/40;
			if(status<20) {
				model.addAttribute("msg1", "Employee is unhappy");
		}else if(status<40) {
			model.addAttribute("msg2", "Employee is neutral,he is neither happy nor unhappy");
		}else if(status>50) {
			model.addAttribute("msg3", "Employee is Happy");
		}
		return "saved";
	}
	
	
	
}
