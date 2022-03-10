package com.render4me.customer;

public record CustomerRegistrationRequest(String firstName,
                                          String lastName,
                                          String email) {
}
