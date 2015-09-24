package com.majesco.camel.service;

import com.majesco.schemas.sample.Address;
import com.majesco.schemas.sample.UserDetails;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

/**
 * Created by biplab661592 on 9/23/2015.
 */

@Component("userService")
public class UserService {

    /**
     * Suppose to get user details
     * @param exchange
     * @return
     */
    public UserDetails getUserDetail(Exchange exchange) {
        UserDetails userDetails = new UserDetails();
        buildUserDetails(userDetails);
        return userDetails;
    }

    /**
     * Save user Details
     *
     * @param userDetails
     * @return
     */
    public UserDetails saveUserDetails(@Body UserDetails userDetails) {
        userDetails.setUserName("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        return userDetails;
    }

    private void buildUserDetails(final UserDetails userDetails) {
        Address address = new Address();
        address.setAddressLine("Address Line");
        address.setCity("Mumbai");
        address.setCountry("India");
        address.setState("Maharastra");
        address.setZip("47001");

        userDetails.setAddress(address);
        userDetails.setDob("16-09-1990");
        userDetails.setEmail("biplab.nayak@majesco.com");
        userDetails.setFirstName("Biplab");
        userDetails.setLastName("Nayak");
        userDetails.setGender("Male");
        userDetails.setSalutation("Mr");
        userDetails.setUserName("Biplab661592");
    }
}
