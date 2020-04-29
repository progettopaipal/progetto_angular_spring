package com.piero.webapp2;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ProvaController {
	@Autowired

	private UtenteRepository userRepository;
	@RequestMapping(value = "/",method=RequestMethod.GET)
	  public String get_home(){
	    return "index";
	  }
	@RequestMapping(value = "/primo",method=RequestMethod.GET)
	  public String get_primo(){
	    return "index";
	  }
	@RequestMapping(value = "/secondo",method=RequestMethod.GET)
	  public String get_secondo(){
	    return "index";
	  }
	@RequestMapping(value = "/terzo",method=RequestMethod.GET)
	  public String get_terzo(){
	    return "index";
	  }
	@PostMapping(path="/add") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (@RequestParam String email,@RequestParam String nome,
	      @RequestParam String cognome,@RequestParam String data,@RequestParam String cellulare,@RequestParam String password) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request
		int cel = (int) Long.parseLong(cellulare);
	    Utente n = new Utente();
	    n.setNome(nome);
	    n.setCognome(cognome);
	    n.setEmail(email);
	    n.setData(data);
	    n.setCellulare(cel);
	    n.setPassword(password);
	    userRepository.save(n);
	    String a = "<script type = 'text/javascript'>"+
	    "location.href = 'terzo';"+
	    "</script>";
	    return a;
	  }

	  @GetMapping(path="/all")
	  public @ResponseBody Iterable<Utente> getAllUsers() {
	    // This returns a JSON or XML with the users
	    return userRepository.findAll();
	  }
	

}
