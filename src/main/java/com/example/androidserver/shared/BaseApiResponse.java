package com.example.androidserver.shared;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Builder
public class BaseApiResponse {

    private boolean status;
    private String message;
    private Date date;
    private Object result;

}
