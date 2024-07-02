package CreditCard;



import org.apache.commons.lang3.StringUtils;

import com.jayway.jsonpath.JsonPath;

import spark.Spark;

public class CreditCardMocking {
    public static void main(String[] args) {
		Spark.port(8889);
		Spark.post("/credit-card", (req,res)->{
			String response="";
			String card=JsonPath.read(req.body().toString(), "$.creditcard");
			//if(card.equals("1234567891234")) {
			if(StringUtils.equalsAny(card, "1234567891234","123456787654","9876543219876")) {
				response="{\"status\":\"Payment success\"}";
				res.status(200);
			}else {
				response="{\"status\":\"Payment success\"}";
				res.status(404);
			}
			res.type("application/json");
			return response; 
		});
		
		System.out.println("============== Running....... ====================");
		
	}
}


