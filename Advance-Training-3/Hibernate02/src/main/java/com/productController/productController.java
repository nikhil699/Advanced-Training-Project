package com.productController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class productController 
{

@Autowired
private  ProductServices studeDetails;
@GetMapping("/home")
public String home()
{
	return "This is a Home Page";
}

@GetMapping("/ProDetails")
public List<stuDetails> getDetails()
{
	return this.ProdDetails.StuDetails();
}

@GetMapping("/ProDetails/{stuId}")
public stuDetails getDetail(@PathVariable int stuId)
{
	return this.studeDetails.StuDetail(stuId);
}


@PostMapping("/stuDetails")
public stuDetails addNewStu(@RequestBody stuDetails stuData )
{
	return this.studeDetails.addNewStu(stuData);
}


@PutMapping("/stuDetails")
public stuDetails updateStuDetail(@RequestBody stuDetails stuUpdate)
{
	return this.studeDetails.updateStuDetail(stuUpdate);
}

}
