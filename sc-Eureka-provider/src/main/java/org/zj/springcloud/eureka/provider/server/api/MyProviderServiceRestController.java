package org.zj.springcloud.eureka.provider.server.api;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.zj.commons.bean.PersonBean;

@RestController
public class MyProviderServiceRestController {

	@RequestMapping(value="/api/person/{personid}",
					method=RequestMethod.GET,
					produces= MediaType.APPLICATION_JSON_UTF8_VALUE
			)
	public PersonBean findPerson(@PathVariable("personid") Long personid,HttpServletRequest request) {
		
		PersonBean pb = new PersonBean(personid, "张剑", new Date());
		pb.setUsername(request.getRequestURL().toString());
		return pb;
		
	}
	
}
