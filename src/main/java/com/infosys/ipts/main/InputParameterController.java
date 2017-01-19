package com.infosys.ipts.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.ipts.entity.InputParameters;
import com.infosys.ipts.service.impl.InputParameterServiceImpl;

@RestController
public class InputParameterController {

	// @Autowired
	// private InputParameterServiceImpl inputParameterServiceImpl;
	//
	// @RequestMapping(value = "add", method = RequestMethod.POST)
	// public ResponseEntity<Map<String, Integer>>
	// addInputParameter(@RequestBody InputParameters inputParameters) {
	// Map<String, Integer> valueToSend = new HashMap<>();
	// valueToSend.put("paramId",
	// inputParameterServiceImpl.add(inputParameters));
	// return ResponseEntity.ok(valueToSend);
	// }

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> addInputParameter() {
		return ResponseEntity.ok("Its working");
	}

}
