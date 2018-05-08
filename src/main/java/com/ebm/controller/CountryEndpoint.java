package com.ebm.controller;


import com.ebm.model.pacsreport.Request;
import com.ebm.model.pacsreport.Response;
import com.ebm.model.request.GetCountryRequest;
import com.ebm.model.request.GetCountryResponse;
import com.ebm.service.CountryRepository;
import com.ebm.service.schedule.ScheduleService;
import com.ebm.service.uniris.UniRisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * Created by gonglu on 2018/5/2.
 */
@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://www.ebm.com/webservice";
    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private UniRisService uniRisService;

    @Autowired
    private ScheduleService scheduleService;




    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "response")
    @ResponsePayload
    public Response getResponse(@RequestPayload Request request) {
        Response response = uniRisService.getResponse(request);
        return response;
    }

}
