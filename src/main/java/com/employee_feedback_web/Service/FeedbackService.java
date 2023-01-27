package com.employee_feedback_web.Service;

import org.springframework.stereotype.Service;

import com.employee_feedback_web.Entities.FeedbackEntity;

@Service
public interface FeedbackService {

  public FeedbackEntity createFeedback(FeedbackEntity feed);
}
