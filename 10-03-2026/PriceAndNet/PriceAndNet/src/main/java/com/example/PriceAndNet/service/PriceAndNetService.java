package com.example.PriceAndNet.service;

import org.springframework.stereotype.Service;

import com.example.PriceAndNet.dto.request.PriceAndNetRequest;
import com.example.PriceAndNet.dto.response.PriceAndNetResponse;

@Service
public class PriceAndNetService {
    public PriceAndNetResponse calculateCustomersResponse(PriceAndNetRequest req) {
        int total = 0;
        total = req.getProduct1() + req.getProduct2() + req.getProduct3() + req.getProduct4() + req.getProduct5()
                + req.getProduct6() + req.getProduct7() + req.getProduct8() + req.getProduct9() + req.getProduct10();
        double gst = 18, PriceAndNet;
        double store = (gst / 100) * total;
        PriceAndNet = total + store;

        return new PriceAndNetResponse(req.getCustomerName(), req.getId(), total, gst, store, PriceAndNet);
    }
}
