package com.freight.request_body;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Optional;

import static java.util.Optional.ofNullable;

/**
 * Created by toshikijahja on 3/26/19.
 */
@ApiModel
public class AuthenticationRequestBody implements Serializable {

    @ApiModelProperty(value = "User's email to be used for signing in")
    @JsonProperty
    private String email;

    @ApiModelProperty(value = "User's phone number to be used for signing in")
    @JsonProperty
    private Integer phone;

    @ApiModelProperty(value = "User's password")
    private String password;

    public Optional<String> getEmailOptional() {
        return ofNullable(this.email);
    }

    public Optional<Integer> getPhoneOptional() {
        return ofNullable(this.phone);
    }

    public String getPassword() {
        return this.password;
    }
}
