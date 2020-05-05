package com.star.sud.using.ComponentScanAnnotation.service;

import org.springframework.stereotype.Service;

import com.star.sud.using.annotation.bean.TechnologyDetails;

@Service
public class TechnologyServiceImpl implements ITechnologyService {

	@Override
	public TechnologyDetails getTechnologyDetails() {
		try {
			TechnologyDetails details = new TechnologyDetails();
			details.setTechId(1);
			details.setTechName("Java");
			details.setTechDescription("Welcome to Java Learniners!");
			return details;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
