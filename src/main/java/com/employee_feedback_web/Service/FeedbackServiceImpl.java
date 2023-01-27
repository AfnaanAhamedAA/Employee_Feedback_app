package com.employee_feedback_web.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_feedback_web.Entities.FeedbackEntity;
import com.employee_feedback_web.Repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackRepository feedRepo;
	
	@Override
	public FeedbackEntity createFeedback(FeedbackEntity feed) {
		FeedbackEntity savedFeed = feedRepo.save(feed);
		return savedFeed;
	}
}
