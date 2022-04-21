package org.cusey.john.controllers;

import java.io.IOException;

import org.slf4j.*;
import org.cusey.john.components.Json;
import org.cusey.john.dto.BackErrors;
import org.cusey.john.dto.CustomerRequest;
import org.cusey.john.dto.Header;
import org.cusey.john.dto.Purchase;
import org.cusey.john.dto.StoreResponse;
import org.cusey.john.dto.Transaction;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

@RestController
@RequestMapping("/cornell")
public class CornellController {
	
	
	private static final Logger log = LoggerFactory.getLogger(CornellController.class);
 
	
	@Autowired
	private Header header;
	
	@Autowired
	private CustomerRequest request;
	
	@Autowired
	private StoreResponse response;
	
	
	//http://localhost:8083/cornell/api/dean
	@GetMapping("/api/dean")
	public String collegeInfo() {
		
		return "Tom Jones";
	}
	
	
	//http://localhost:8083/cornell/api/student/search
	@RequestMapping(method = RequestMethod.POST, path = "/api/student/search", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StoreResponse> fsigHandle(
    		@RequestBody CustomerRequest request,
    		@RequestHeader(name = "TOKEN", required = false, defaultValue = "9") final String token,
    		@RequestHeader(name = "TOKEN_IP", required = false, defaultValue = "9") final String tokenIP,
    		@RequestHeader(name = "PROJECT_ID", required = false, defaultValue = "9") final int projectId,
    		@RequestHeader(name = "COLLEGE_ID", required = false, defaultValue = "9") final int collegeId,
    		@RequestHeader(name = "DATA", required = false, defaultValue = "9") final String data,
    		@RequestHeader(name = "TOKEN_AUTH_CODE", required = false, defaultValue = "9") final String tokenAuthCode
    		
    ){
		
		

		this.request = request;
		header.setAll(token, tokenIP, collegeId, projectId, data, tokenAuthCode);
		
		log.info(request.toString());
		log.info(header.toString());
		
		
		log.info("data: "+ data );
		
		try {
			response = Json.jsonTOObject(header.getData() +".json", StoreResponse.class  );
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Transaction stage = response.getStage();
		for(BackErrors element:  stage.getBack()) {
			System.out.println(element.toString());
		}
		
		System.out.println(stage.toString());
		
		for(Purchase element:  response.getProduct()) {
			System.out.println(element.toString());
		}
		
		
		return ResponseEntity.ok(response);
	}


}
