//THIS IS CLIENT BASED APPLICATION 
package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;

@Component
@Profile("htc")
public class HtcNotificationServiceImpl implements INotificationService {

	@Override
	public void notificate() {
		System.out.println("THIS IS HTC PROFILE");
	}

}
