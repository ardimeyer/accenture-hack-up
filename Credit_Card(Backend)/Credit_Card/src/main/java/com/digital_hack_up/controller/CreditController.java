package com.digital_hack_up.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.digital_hack_up.bean.CreDitCardIndexBean;
import com.digital_hack_up.bean.CreditCard;
import com.digital_hack_up.dto.CreditCardDTO;
import com.digital_hack_up.service.CreditService;
import com.digital_hack_up.utils.CsvUtils;
import com.digital_hack_up.utils.CustomErrorType;
import com.digital_hack_up.utils.CustomSucessType;

@RestController
//@RequestMapping("/")
public class CreditController {
	 public static final Logger logger = LoggerFactory.getLogger(CreditController.class);
	
	@Autowired
	CreditService service;
	
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public @ResponseBody String getValue() {
		return "Welcome To Spring Boot";
	}
	
	@PostMapping(value="/upload_csv" ,consumes="multipart/form-data")
	public ResponseEntity<?> uploadFileInCSV(@RequestParam("file") MultipartFile file) {
		 try {
			 List<CreditCard> al=CsvUtils.readVal(CreditCard.class, file.getInputStream());
			service.saveAll(al);
		} catch (IOException e) {
			//e.printStackTrace();
			logger.error(" File has a some problem {} .", e.getMessage());
			return new ResponseEntity<CustomErrorType>(new CustomErrorType("File has a some problem" +  e.getMessage() 
                    + ""), HttpStatus.NOT_IMPLEMENTED);
		}
		 return new ResponseEntity<CustomSucessType>(new CustomSucessType("Secussful Upload"),HttpStatus.OK);
	}
	
	@GetMapping(value="/get-user-info/{id}" )
	public ResponseEntity<?> getUserInfo(@PathVariable("id") String id){
		CreditCard user = service.findById(Integer.parseInt(id));
        if (user == null) {
            logger.error("User with id {} not found.", id);
            return new ResponseEntity<CustomErrorType>(new CustomErrorType("User with id " + id 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<CreditCard>(user, HttpStatus.OK);
	}
	
	@GetMapping(value="/getAllUser")
	public ResponseEntity<List<CreditCard>> getAllUserData(){
		List<CreditCard> user = service.getAllUserData();
        return new ResponseEntity<List<CreditCard>>(user, HttpStatus.OK);
	}
	
	@GetMapping(value="/indexDataInElastic")
	public ResponseEntity<?> indexerData(){
		return new ResponseEntity<CustomSucessType>(new CustomSucessType(service.indexerData()), HttpStatus.OK);
	}
	
	@GetMapping(value="/getAllDataFromElastic")
	public ResponseEntity<Iterable<CreDitCardIndexBean>> getAllDataFromElastic(){
		return new ResponseEntity<Iterable<CreDitCardIndexBean>>(service.getAllDataFromElastic(), HttpStatus.OK);
	}
	
	@GetMapping(value="/searchNameAndId/{text}" )
	public ResponseEntity<?> getInElastic(@PathVariable("text") String param){
		List<CreDitCardIndexBean> user = service.getInElastic(param);
        if (user == null) {
            logger.error("User with id {} not found.", param);
            return new ResponseEntity<CustomErrorType>(new CustomErrorType("User with id " + param 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<CreDitCardIndexBean>>(user, HttpStatus.OK);
	}
	
	
	@GetMapping(value="/getDataEducationVsLimitBal")
	public ResponseEntity<List<CreditCardDTO>> getDataEducationVsLimitBal(){
		return new ResponseEntity<List<CreditCardDTO>>(service.getDataEducationVsLimitBal(), HttpStatus.OK);
	}
	
}
