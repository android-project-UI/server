package com.example.androidserver.shared;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class BaseApiResponse {

    private boolean status;
    private String message;
    private Date date;
    private Object result;

}
