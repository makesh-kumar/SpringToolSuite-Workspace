package com.example.demo;

import com.uber.cadence.workflow.WorkflowMethod;

public interface Helloworkflow 
{
		@WorkflowMethod(executionStartToCloseTimeoutSeconds = 300)
		String getGreetings(String name);
}
