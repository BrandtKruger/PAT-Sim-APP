package com.kruger.pat.Controllers;

import com.google.gson.Gson;
import com.kruger.pat.commands.TableListCommand;
import com.kruger.pat.models.LoginResponse;
import com.kruger.pat.models.PaymentRequest;
import com.kruger.pat.services.TableListService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@Controller
public class PayAtTableController {

    TableListService tableLists;

    public PayAtTableController(TableListService tableLists) {
        this.tableLists= tableLists;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String gaapLogin(HttpServletResponse response){

        System.out.println("LOGIN REQUEST RECEIVED");
        response.setStatus(200);
        response.setContentType("OK");

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setLoginResponseToken("TEST");
        loginResponse.setLoginResponse(true);
        loginResponse.setLoginResponseReason("LOGIN");

        final String jsonRequest = new Gson().toJson(loginResponse);
        return jsonRequest;
    }

    @RequestMapping(value = "/V1/payment", method = RequestMethod.POST, consumes = APPLICATION_JSON_VALUE)
    @ResponseBody
    public String payment(HttpEntity<String> httpEntity, HttpServletResponse response, HttpServletRequest request) throws IOException {
        String json = httpEntity.getBody();
        PaymentRequest paymentRequest = new Gson().fromJson(json, PaymentRequest.class);

        System.out.println(paymentRequest.toString());
        response.setStatus(200);
        return "true";
    }

    public void PaymentController() {
    }

    @RequestMapping(value= "/V1/tables/list", method = RequestMethod.GET)
    @ResponseBody
    public String getTableList(@RequestParam("staffcode") final String staffcode, HttpServletResponse response){

        System.out.println("getTableList Received, will now respond");
        response.setStatus(200);
        Set<TableListCommand> tableList =  tableLists.getTableList(Integer.valueOf(staffcode));

        final String jsonRequest = new Gson().toJson(tableList);
        return jsonRequest;

    }

}
